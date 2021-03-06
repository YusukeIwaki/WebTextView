package com.android.webview.chromium;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewProvider;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Map;

/**
 */
class WebTextViewProvider implements WebViewProvider {
    private final WebView.PrivateAccess webViewPrivateAccess;

    public WebTextViewProvider(WebView.PrivateAccess webViewPrivateAccess) {
        this.webViewPrivateAccess = webViewPrivateAccess;
    }

    @Override
    public void init(Map<String, Object> javaScriptInterfaces, boolean privateBrowsing) {

    }

    @Override
    public void setHorizontalScrollbarOverlay(boolean overlay) {

    }

    @Override
    public void setVerticalScrollbarOverlay(boolean overlay) {

    }

    @Override
    public boolean overlayHorizontalScrollbar() {
        return false;
    }

    @Override
    public boolean overlayVerticalScrollbar() {
        return false;
    }

    @Override
    public int getVisibleTitleHeight() {
        return 0;
    }

    @Override
    public SslCertificate getCertificate() {
        return null;
    }

    @Override
    public void setCertificate(SslCertificate certificate) {

    }

    @Override
    public void savePassword(String host, String username, String password) {

    }

    @Override
    public void setHttpAuthUsernamePassword(String host, String realm, String username, String password) {

    }

    @Override
    public String[] getHttpAuthUsernamePassword(String host, String realm) {
        return new String[0];
    }

    @Override
    public void destroy() {

    }

    @Override
    public void setNetworkAvailable(boolean networkUp) {

    }

    @Override
    public WebBackForwardList saveState(Bundle outState) {
        return null;
    }

    @Override
    public boolean savePicture(Bundle b, File dest) {
        return false;
    }

    @Override
    public boolean restorePicture(Bundle b, File src) {
        return false;
    }

    @Override
    public WebBackForwardList restoreState(Bundle inState) {
        return null;
    }

    @Override
    public void loadUrl(String url, Map<String, String> additionalHttpHeaders) {

    }

    @Override
    public void loadUrl(String url) {

    }

    @Override
    public void postUrl(String url, byte[] postData) {

    }

    @Override
    public void loadData(String data, String mimeType, String encoding) {

    }

    @Override
    public void loadDataWithBaseURL(String baseUrl, String data, String mimeType, String encoding, String historyUrl) {

    }

    @Override
    public void evaluateJavaScript(String script, ValueCallback<String> resultCallback) {

    }

    @Override
    public void saveWebArchive(String filename) {

    }

    @Override
    public void saveWebArchive(String basename, boolean autoname, ValueCallback<String> callback) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void reload() {

    }

    @Override
    public boolean canGoBack() {
        return false;
    }

    @Override
    public void goBack() {

    }

    @Override
    public boolean canGoForward() {
        return false;
    }

    @Override
    public void goForward() {

    }

    @Override
    public boolean canGoBackOrForward(int steps) {
        return false;
    }

    @Override
    public void goBackOrForward(int steps) {

    }

    @Override
    public boolean isPrivateBrowsingEnabled() {
        return false;
    }

    @Override
    public boolean pageUp(boolean top) {
        return false;
    }

    @Override
    public boolean pageDown(boolean bottom) {
        return false;
    }

    @Override
    public void insertVisualStateCallback(long requestId, WebView.VisualStateCallback callback) {

    }

    @Override
    public void clearView() {

    }

    @Override
    public Picture capturePicture() {
        return null;
    }

    @Override
    public PrintDocumentAdapter createPrintDocumentAdapter(String documentName) {
        return null;
    }

    @Override
    public float getScale() {
        return 0;
    }

    @Override
    public void setInitialScale(int scaleInPercent) {

    }

    @Override
    public void invokeZoomPicker() {

    }

    @Override
    public WebView.HitTestResult getHitTestResult() {
        return null;
    }

    @Override
    public void requestFocusNodeHref(Message hrefMsg) {

    }

    @Override
    public void requestImageRef(Message msg) {

    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public String getOriginalUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public Bitmap getFavicon() {
        return null;
    }

    @Override
    public String getTouchIconUrl() {
        return null;
    }

    @Override
    public int getProgress() {
        return 0;
    }

    @Override
    public int getContentHeight() {
        return 0;
    }

    @Override
    public int getContentWidth() {
        return 0;
    }

    @Override
    public void pauseTimers() {

    }

    @Override
    public void resumeTimers() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public boolean isPaused() {
        return false;
    }

    @Override
    public void freeMemory() {

    }

    @Override
    public void clearCache(boolean includeDiskFiles) {

    }

    @Override
    public void clearFormData() {

    }

    @Override
    public void clearHistory() {

    }

    @Override
    public void clearSslPreferences() {

    }

    @Override
    public WebBackForwardList copyBackForwardList() {
        return null;
    }

    @Override
    public void setFindListener(WebView.FindListener listener) {

    }

    @Override
    public void findNext(boolean forward) {

    }

    @Override
    public int findAll(String find) {
        return 0;
    }

    @Override
    public void findAllAsync(String find) {

    }

    @Override
    public boolean showFindDialog(String text, boolean showIme) {
        return false;
    }

    @Override
    public void clearMatches() {

    }

    @Override
    public void documentHasImages(Message response) {

    }

    @Override
    public void setWebViewClient(WebViewClient client) {

    }

    @Override
    public void setDownloadListener(DownloadListener listener) {

    }

    @Override
    public void setWebChromeClient(WebChromeClient client) {

    }

    @Override
    public void setPictureListener(WebView.PictureListener listener) {

    }

    @Override
    public void addJavascriptInterface(Object obj, String interfaceName) {

    }

    @Override
    public void removeJavascriptInterface(String interfaceName) {

    }

    @Override
    public WebMessagePort[] createWebMessageChannel() {
        return new WebMessagePort[0];
    }

    @Override
    public void postMessageToMainFrame(WebMessage message, Uri targetOrigin) {

    }

    @Override
    public WebSettings getSettings() {
        return new WebTextViewSettings();
    }

    @Override
    public void setMapTrackballToArrowKeys(boolean setMap) {

    }

    @Override
    public void flingScroll(int vx, int vy) {

    }

    @Override
    public View getZoomControls() {
        return null;
    }

    @Override
    public boolean canZoomIn() {
        return false;
    }

    @Override
    public boolean canZoomOut() {
        return false;
    }

    @Override
    public boolean zoomBy(float zoomFactor) {
        return false;
    }

    @Override
    public boolean zoomIn() {
        return false;
    }

    @Override
    public boolean zoomOut() {
        return false;
    }

    @Override
    public void dumpViewHierarchyWithProperties(BufferedWriter out, int level) {

    }

    @Override
    public View findHierarchyView(String className, int hashCode) {
        return null;
    }

    @Override
    public ViewDelegate getViewDelegate() {
        return new WebTextViewDelegate(webViewPrivateAccess);
    }

    @Override
    public ScrollDelegate getScrollDelegate() {
        return new WebTextViewScrollDelegate();
    }

    @Override
    public void notifyFindDialogDismissed() {

    }
}
