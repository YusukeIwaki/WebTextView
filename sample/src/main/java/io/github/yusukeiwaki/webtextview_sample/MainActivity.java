package io.github.yusukeiwaki.webtextview_sample;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.yusukeiwaki.webtextview.provider.WebTextViewProvider;

public class MainActivity extends Activity {

    static {
        System.loadLibrary("webtextview");
    }

    @BindView(R.id.editor_url)
    EditText editorUrl;

    @BindView(R.id.webview)
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        try {
            readWebViewProviders();
        } catch (Exception e) {
            Log.e("hoge", e.getMessage(), e);
        }

        setupUrlEditor();

        setupWebView();
    }

    private void readWebViewProviders() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        //android.webkit.IWebViewUpdateService.Stub.asInterface(android.os.ServiceManager.getService("webviewupdate")).getValidWebViewPackages;
        Class cServiceManager = Class.forName("android.os.ServiceManager");
        Method getService = cServiceManager.getDeclaredMethod("getService", String.class);
        Object serviceManager = getService.invoke(null, "webviewupdate");

        Class cIWebViewUpdateService = Class.forName("android.webkit.IWebViewUpdateService");
        Class cIWebViewUpdateServiceStub = cIWebViewUpdateService.getDeclaredClasses()[0];
        Method stubAsInterface = cIWebViewUpdateServiceStub.getMethod("asInterface", IBinder.class);
        Object webViewUpdateService = stubAsInterface.invoke(null, serviceManager);

        Method getValidWebViewPackages = cIWebViewUpdateService.getDeclaredMethod("getValidWebViewPackages");
        Object providers = getValidWebViewPackages.invoke(webViewUpdateService);

        Class cWebViewProviderInfo = Class.forName("android.webkit.WebViewProviderInfo");
        Field packageName = cWebViewProviderInfo.getDeclaredField("packageName");
        Field signatures = cWebViewProviderInfo.getDeclaredField("signatures");

        int len = Array.getLength(providers);
        for (int i=0; i<len; i++) {
            Object provider = Array.get(providers, i);
            log("provider = " + packageName.get(provider));

            Object sigs = signatures.get(provider);
            int len2 = Array.getLength(sigs);
            for (int j=0; j<len2; j++) {
                log(" signature = " + Array.get(sigs, j));
            }
        }
        log(WebTextViewProvider.nativeGetHello());
    }

    private void log(String log) {
        Log.d("hoge", log);
    }

    private void setupUrlEditor() {
        editorUrl.setImeOptions(EditorInfo.IME_ACTION_GO);
        editorUrl.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    webView.loadUrl(v.getText().toString());
                    return true;
                }
                return false;
            }
        });
    }

    private final WebViewClient webViewClient = new WebViewClient() {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            editorUrl.setText(url);
        }
    };

    private void setupWebView() {
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(webViewClient);
    }
}