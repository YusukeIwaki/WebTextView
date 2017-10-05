package com.android.webview.chromium;

import android.webkit.WebView;
import android.webkit.WebViewDelegate;
import android.webkit.WebViewFactoryProvider;
import android.webkit.WebViewProvider;

public class WebViewChromiumFactoryProvider implements WebViewFactoryProvider {
    public WebViewChromiumFactoryProvider(WebViewDelegate webViewDelegate) {

    }

    @Override
    public WebViewProvider createWebView(WebView webView, WebView.PrivateAccess privateAccess) {
        return new WebViewProvider() {
        };
    }
}
