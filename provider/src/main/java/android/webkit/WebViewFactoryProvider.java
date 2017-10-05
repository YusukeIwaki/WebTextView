package android.webkit;

/**
 */
public interface WebViewFactoryProvider {
    WebViewProvider createWebView(WebView webView, WebView.PrivateAccess privateAccess);
}
