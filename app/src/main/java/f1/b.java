package f1;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Shader;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;
import c2.x;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ Shader.TileMode b() {
        return Shader.TileMode.DECAL;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget f(x xVar, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(xVar, rect, point, scrollCaptureCallback);
    }

    public static /* synthetic */ ViewTranslationRequest.Builder k(AutofillId autofillId, long j10) {
        return new ViewTranslationRequest.Builder(autofillId, j10);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse m(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView n(View view) {
        return (SplashScreenView) view;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void w(Window window, int i) {
        window.setBackgroundBlurRadius(i);
    }

    public static /* bridge */ /* synthetic */ boolean y(View view) {
        return view instanceof SplashScreenView;
    }
}
