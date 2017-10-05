#include <jni.h>

JNIEXPORT jstring JNICALL
Java_io_github_yusukeiwaki_webtextview_provider_WebTextViewProvider_nativeGetHello(JNIEnv *env, jclass type) {
    return (*env)->NewStringUTF(env, "Hello");
}