package com.google.android.gms.internal.ads;
import j1.e;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7272a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f7273b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7274c;

    /* renamed from: f, reason: collision with root package name */
    public long f7276f;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7279j;

    /* renamed from: d, reason: collision with root package name */
    public int f7275d = 0;
    public long e = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public float f7277g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public s6 f7278h = s6.f10534z;

    public j1(Context context, y0 y0Var) {
        this.f7272a = y0Var;
        this.f7273b = new o1(context);
    }

    public final void a(int i) {
        if (i != 0) {
            if (i != 1) {
                this.f7275d = Math.min(this.f7275d, 2);
            } else {
                this.f7275d = 0;
            }
        } else {
            this.f7275d = 1;
        }
        this.f7273b.a();
    }

    public final void b() {
        l1 l1Var;
        this.f7274c = true;
        this.f7278h.getClass();
        this.f7276f = bq0.u(SystemClock.elapsedRealtime());
        o1 o1Var = this.f7273b;
        o1Var.f8909c = true;
        o1Var.a();
        DisplayManager displayManager = (DisplayManager) o1Var.f8907a.getSystemService("display");
        l1 l1Var2 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                if (Build.VERSION.SDK_INT >= 33) {
                    l1Var = new n1(choreographer, displayManager);
                } else {
                    l1Var = new l1(choreographer, displayManager);
                }
                l1Var2 = l1Var;
            } catch (RuntimeException e) {
                x21.K("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }
        o1Var.f8908b = l1Var2;
        if (l1Var2 != null) {
            l1Var2.a();
        }
        o1Var.b(false);
    }

    public final void c(Surface surface) {
        boolean z3;
        if (surface != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.i = z3;
        this.f7279j = false;
        o1 o1Var = this.f7273b;
        if (o1Var.f8910d != surface) {
            o1Var.c();
            o1Var.f8910d = surface;
            o1Var.b(true);
        }
        this.f7275d = Math.min(this.f7275d, 1);
    }

    public final boolean d(boolean z3) {
        if (z3) {
            if (this.f7275d != 3) {
                if (this.f7279j && !this.i) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(long r27, long r29, long r31, long r33, boolean r35, boolean r36, long r37, long r39, com.google.android.gms.internal.ads.i1 r41) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.j1.e(long, long, long, long, boolean, boolean, long, long, com.google.android.gms.internal.ads.i1):int");
    }

    public final void f(float f10) {
        boolean z3;
        if (f10 > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        if (f10 == this.f7277g) {
            return;
        }
        this.f7277g = f10;
        o1 o1Var = this.f7273b;
        o1Var.f8912g = f10;
        o1Var.b(false);
    }
}
