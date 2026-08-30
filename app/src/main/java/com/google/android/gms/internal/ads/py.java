package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class py extends Thread implements SurfaceTexture.OnFrameAvailableListener {
    public static final float[] V = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public final float[] A;
    public final float[] B;
    public float C;
    public float D;
    public float E;
    public int F;
    public int G;
    public SurfaceTexture H;
    public SurfaceTexture I;
    public int J;
    public int K;
    public int L;
    public final FloatBuffer M;
    public final CountDownLatch N;
    public final Object O;
    public EGL10 P;
    public EGLDisplay Q;
    public EGLContext R;
    public EGLSurface S;
    public volatile boolean T;
    public volatile boolean U;

    /* renamed from: u, reason: collision with root package name */
    public final oy f9657u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f9658v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f9659w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f9660x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f9661y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f9662z;

    public py(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.M = asFloatBuffer;
        asFloatBuffer.put(V).position(0);
        this.f9658v = new float[9];
        this.f9659w = new float[9];
        this.f9660x = new float[9];
        this.f9661y = new float[9];
        this.f9662z = new float[9];
        this.A = new float[9];
        this.B = new float[9];
        this.C = Float.NaN;
        oy oyVar = new oy(context);
        this.f9657u = oyVar;
        oyVar.f9269h = this;
        this.N = new CountDownLatch(1);
        this.O = new Object();
    }

    public static final void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb2 = new StringBuilder(str.length() + 10 + String.valueOf(glGetError).length());
            sb2.append(str);
            sb2.append(": glError ");
            sb2.append(glGetError);
            Log.e("SphericalVideoRenderer", sb2.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        float f35 = f18 * f33;
        fArr[7] = f35 + (f31 * fArr3[4]) + (f28 * f34);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    public static final void g(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f10;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    public static final void h(float[] fArr, float f10) {
        double d2 = f10;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        e("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 26);
                sb2.append("Could not compile shader ");
                sb2.append(i);
                sb2.append(":");
                Log.e("SphericalVideoRenderer", sb2.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a(int i, int i10) {
        Object obj = this.O;
        synchronized (obj) {
            this.G = i;
            this.F = i10;
            this.T = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.O;
        synchronized (obj) {
            this.U = true;
            this.I = null;
            obj.notifyAll();
        }
    }

    public final void c(float f10, float f11) {
        int i = this.G;
        int i10 = this.F;
        if (i <= i10) {
            i = i10;
        }
        float f12 = i;
        this.D -= (f10 * 1.7453293f) / f12;
        float f13 = this.E - ((f11 * 1.7453293f) / f12);
        this.E = f13;
        if (f13 < -1.5707964f) {
            this.E = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.E = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.S;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.P.eglMakeCurrent(this.Q, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.P.eglDestroySurface(this.Q, this.S);
            this.S = null;
        }
        EGLContext eGLContext = this.R;
        if (eGLContext != null) {
            this.P.eglDestroyContext(this.Q, eGLContext);
            this.R = null;
        }
        EGLDisplay eGLDisplay = this.Q;
        if (eGLDisplay != null) {
            this.P.eglTerminate(eGLDisplay);
            this.Q = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.L++;
        Object obj = this.O;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a6  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.py.run():void");
    }
}
