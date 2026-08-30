package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class tc0 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] A = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: u, reason: collision with root package name */
    public final Handler f11318u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f11319v = new int[1];

    /* renamed from: w, reason: collision with root package name */
    public EGLDisplay f11320w;

    /* renamed from: x, reason: collision with root package name */
    public EGLContext f11321x;

    /* renamed from: y, reason: collision with root package name */
    public EGLSurface f11322y;

    /* renamed from: z, reason: collision with root package name */
    public SurfaceTexture f11323z;

    public tc0(Handler handler) {
        this.f11318u = handler;
    }

    public final void a(int i) {
        boolean z3;
        boolean z9;
        int[] iArr;
        boolean z10;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        boolean z11;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        ct.z("eglGetDisplay failed", z3);
        int[] iArr3 = new int[2];
        ct.z("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1));
        this.f11320w = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr4 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, A, 0, eGLConfigArr, 0, 1, iArr4, 0);
        if (eglChooseConfig && iArr4[0] > 0 && eGLConfigArr[0] != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
        String str = bq0.f4860a;
        ct.z(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z9);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLDisplay eGLDisplay = this.f11320w;
        if (i == 0) {
            iArr = new int[]{12440, 2, 12344};
        } else {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ct.z("eglCreateContext failed", z10);
        this.f11321x = eglCreateContext;
        EGLDisplay eGLDisplay2 = this.f11320w;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
            if (eglCreatePbufferSurface != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ct.z("eglCreatePbufferSurface failed", z11);
        }
        ct.z("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f11322y = eglCreatePbufferSurface;
        int[] iArr5 = this.f11319v;
        GLES20.glGenTextures(1, iArr5, 0);
        StringBuilder sb2 = new StringBuilder();
        ed1.u(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z12) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int length = objArr2.length;
            int i11 = i10 + 1;
            int d2 = y41.d(length, i11);
            if (d2 > length) {
                objArr2 = Arrays.copyOf(objArr2, d2);
            }
            objArr2[i10] = valueOf;
            i10 = i11;
            z12 = true;
        }
        if (!z12) {
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
            this.f11323z = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new dd0(sb2.toString(), d51.w(objArr2, i10));
    }

    public final void b() {
        this.f11318u.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f11323z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f11319v, 0);
            }
            EGLDisplay eGLDisplay = this.f11320w;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f11320w;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f11322y;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f11320w, this.f11322y);
            }
            EGLContext eGLContext = this.f11321x;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f11320w, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f11320w;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f11320w);
            }
            this.f11320w = null;
            this.f11321x = null;
            this.f11322y = null;
            this.f11323z = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f11320w;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f11320w;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f11322y;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f11320w, this.f11322y);
            }
            EGLContext eGLContext2 = this.f11321x;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f11320w, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f11320w;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f11320w);
            }
            this.f11320w = null;
            this.f11321x = null;
            this.f11322y = null;
            this.f11323z = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f11318u.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f11323z;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
