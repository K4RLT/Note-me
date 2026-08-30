package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class a1 extends Surface {

    /* renamed from: x, reason: collision with root package name */
    public static int f4306x;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f4307y;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f4308u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f4309v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4310w;

    public /* synthetic */ a1(z0 z0Var, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.f4309v = z0Var;
        this.f4308u = z3;
    }

    public static synchronized boolean a(Context context) {
        int i;
        int i10;
        synchronized (a1.class) {
            if (!f4307y) {
                try {
                } catch (dd0 e) {
                    x21.N("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e.getMessage())));
                }
                if (ct.j(context)) {
                    if (ct.D("EGL_KHR_surfaceless_context")) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    f4306x = i;
                    f4307y = true;
                }
                i = 0;
                f4306x = i;
                f4307y = true;
            }
            i10 = f4306x;
        }
        if (i10 == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        z0 z0Var = this.f4309v;
        synchronized (z0Var) {
            try {
                if (!this.f4310w) {
                    Handler handler = z0Var.f13020v;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.f4310w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
