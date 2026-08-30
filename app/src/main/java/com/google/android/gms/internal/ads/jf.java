package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class jf implements lf {
    public static jf L;
    public final Executor A;
    public final hh B;
    public final s6 C;
    public final kg E;
    public final d2 F;
    public final g9 G;
    public volatile boolean J;
    public volatile boolean K;

    /* renamed from: u, reason: collision with root package name */
    public final Context f7427u;

    /* renamed from: v, reason: collision with root package name */
    public final tw f7428v;

    /* renamed from: w, reason: collision with root package name */
    public final xv0 f7429w;

    /* renamed from: x, reason: collision with root package name */
    public final bw0 f7430x;

    /* renamed from: y, reason: collision with root package name */
    public final ag f7431y;

    /* renamed from: z, reason: collision with root package name */
    public final cv0 f7432z;
    public volatile long H = 0;
    public final Object I = new Object();
    public final CountDownLatch D = new CountDownLatch(1);

    public jf(Context context, cv0 cv0Var, tw twVar, xv0 xv0Var, bw0 bw0Var, ag agVar, Executor executor, bv0 bv0Var, hh hhVar, kg kgVar, d2 d2Var, g9 g9Var) {
        this.K = false;
        this.f7427u = context;
        this.f7432z = cv0Var;
        this.f7428v = twVar;
        this.f7429w = xv0Var;
        this.f7430x = bw0Var;
        this.f7431y = agVar;
        this.A = executor;
        this.B = hhVar;
        this.E = kgVar;
        this.F = d2Var;
        this.G = g9Var;
        this.K = false;
        this.C = new s6(this, bv0Var);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.hv0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, com.google.android.gms.internal.ads.bv0] */
    public static synchronized jf m(Context context, ExecutorService executorService, ev0 ev0Var, boolean z3) {
        jf jfVar;
        synchronized (jf.class) {
            try {
                if (L == null) {
                    cv0 a10 = cv0.a(context, executorService, z3);
                    tf c10 = tf.c(context);
                    kg a11 = kg.a(context, executorService);
                    d2 d2Var = new d2();
                    g9 g9Var = new g9();
                    tw twVar = new tw(context, executorService, a10, (hv0) new Object());
                    ib.o c11 = wa.h8.c(new bo0(3, twVar), executorService);
                    c11.e(executorService, new zq0(3, twVar));
                    twVar.f11473y = c11;
                    yf yfVar = new yf(context);
                    ag agVar = new ag(ev0Var, twVar, new ig(context, yfVar), yfVar, c10, a11, d2Var, g9Var);
                    hh q10 = an1.q(context, a10);
                    Object obj = new Object();
                    jf jfVar2 = new jf(context, a10, new tw(context, q10), new xv0(context, q10, new tf(7, a10), ((Boolean) g9.r.e.f17698c.a(sl.h3)).booleanValue()), new bw0(context, agVar, a10, obj, false), agVar, executorService, obj, q10, a11, d2Var, g9Var);
                    L = jfVar2;
                    jfVar2.j();
                    L.k();
                }
                jfVar = L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jfVar;
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void a(int i, int i10, int i11) {
        DisplayMetrics displayMetrics;
        if (((Boolean) g9.r.e.f17698c.a(sl.f10973ud)).booleanValue() && (displayMetrics = this.f7427u.getResources().getDisplayMetrics()) != null) {
            float f10 = i;
            float f11 = displayMetrics.density;
            float f12 = i10;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            b(obtain);
            obtain.recycle();
            float f13 = displayMetrics.density;
            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            b(obtain2);
            obtain2.recycle();
            float f14 = displayMetrics.density;
            MotionEvent obtain3 = MotionEvent.obtain(0L, i11, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            b(obtain3);
            obtain3.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void b(MotionEvent motionEvent) {
        xv0 b10 = this.f7430x.b();
        if (b10 != null) {
            try {
                b10.g(motionEvent);
            } catch (aw0 e) {
                this.f7432z.c(e.f4619u, -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String c(Context context, String str, View view, Activity activity) {
        kg kgVar = this.E;
        if (kgVar.f7736d) {
            kgVar.f7734b = System.currentTimeMillis();
        }
        d2 d2Var = this.F;
        d2Var.f5256h = d2Var.f5255g;
        d2Var.f5255g = SystemClock.uptimeMillis();
        k();
        xv0 b10 = this.f7430x.b();
        if (b10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String f10 = b10.f(context, str, view, activity);
            this.f7432z.e(5000, System.currentTimeMillis() - currentTimeMillis, null, f10, null);
            return f10;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String d(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void e(StackTraceElement[] stackTraceElementArr) {
        this.G.f6330a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String f(Context context) {
        kg kgVar = this.E;
        if (kgVar.f7736d) {
            kgVar.f7734b = System.currentTimeMillis();
        }
        d2 d2Var = this.F;
        d2Var.f5251b = d2Var.f5250a;
        d2Var.f5250a = SystemClock.uptimeMillis();
        k();
        xv0 b10 = this.f7430x.b();
        if (b10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String b11 = b10.b(context);
            this.f7432z.e(5001, System.currentTimeMillis() - currentTimeMillis, null, b11, null);
            return b11;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final void g(View view) {
        this.f7431y.f4487c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String h(Context context, String str, View view) {
        return c(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.lf
    public final String i(Context context, View view, Activity activity) {
        kg kgVar = this.E;
        if (kgVar.f7736d) {
            kgVar.f7734b = System.currentTimeMillis();
        }
        this.F.b(context, view);
        k();
        xv0 b10 = this.f7430x.b();
        if (b10 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String d2 = b10.d(context, view, activity);
            this.f7432z.e(5002, System.currentTimeMillis() - currentTimeMillis, null, d2, null);
            return d2;
        }
        return "";
    }

    public final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        uv0 n10 = n();
        if (n10 != null) {
            if (this.f7430x.a(n10)) {
                this.K = true;
                this.D.countDown();
                return;
            }
            return;
        }
        this.f7432z.b(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    public final void k() {
        uv0 uv0Var;
        if (!this.J) {
            synchronized (this.I) {
                try {
                    if (!this.J) {
                        if ((System.currentTimeMillis() / 1000) - this.H < 3600) {
                            return;
                        }
                        bw0 bw0Var = this.f7430x;
                        synchronized (bw0Var.f4895g) {
                            try {
                                xv0 xv0Var = bw0Var.f4894f;
                                if (xv0Var != null) {
                                    uv0Var = (uv0) xv0Var.f12635w;
                                } else {
                                    uv0Var = null;
                                }
                            } finally {
                            }
                        }
                        if ((uv0Var == null || uv0Var.f11729a.B() - (System.currentTimeMillis() / 1000) < 3600) && an1.m(this.B)) {
                            this.A.execute(new f(4, this));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        String str;
        String str2;
        int length;
        boolean f10;
        long currentTimeMillis = System.currentTimeMillis();
        uv0 n10 = n();
        if (n10 != null) {
            str = n10.f11729a.z();
            str2 = n10.f11729a.A();
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.f7427u;
                hh hhVar = this.B;
                cv0 cv0Var = this.f7432z;
                wv0 d2 = ed1.d(context, hhVar, str, str2, cv0Var);
                byte[] bArr = d2.f12338v;
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        mm1 z3 = om1.z(bArr, 0, length);
                        wm1 wm1Var = wm1.f12302a;
                        int i = em1.f5727a;
                        ih C = ih.C(z3, wm1.f12303b);
                        if (!C.z().z().isEmpty()) {
                            if (!C.z().A().isEmpty()) {
                                if (C.B().a().length != 0) {
                                    uv0 n11 = n();
                                    if (n11 != null) {
                                        mh mhVar = n11.f11729a;
                                        if (mhVar != null) {
                                            if (C.z().z().equals(mhVar.z())) {
                                                if (!C.z().A().equals(mhVar.A())) {
                                                }
                                            }
                                        }
                                    }
                                    s6 s6Var = this.C;
                                    int i10 = d2.f12339w;
                                    if (((Boolean) g9.r.e.f17698c.a(sl.f10725f3)).booleanValue()) {
                                        if (i10 == 3) {
                                            f10 = this.f7429w.e(C);
                                        } else {
                                            if (i10 == 4) {
                                                f10 = this.f7429w.c(C, s6Var);
                                            }
                                            this.f7432z.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                        }
                                    } else {
                                        f10 = this.f7428v.f(C, s6Var);
                                    }
                                    if (f10) {
                                        uv0 n12 = n();
                                        if (n12 != null) {
                                            if (this.f7430x.a(n12)) {
                                                this.K = true;
                                            }
                                            this.H = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.f7432z.b(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.f7432z.b(5010, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.f7432z.b(2030, System.currentTimeMillis() - currentTimeMillis);
                    }
                } else {
                    cv0Var.b(5009, System.currentTimeMillis() - currentTimeMillis);
                }
            } catch (Throwable th) {
                this.D.countDown();
                throw th;
            }
        } catch (pn1 e) {
            this.f7432z.c(4002, System.currentTimeMillis() - currentTimeMillis, e);
        }
        this.D.countDown();
    }

    public final uv0 n() {
        if (an1.m(this.B)) {
            if (((Boolean) g9.r.e.f17698c.a(sl.f10725f3)).booleanValue()) {
                xv0 xv0Var = this.f7429w;
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (xv0.f12632z) {
                    try {
                        mh q10 = xv0Var.q(1);
                        if (q10 == null) {
                            xv0Var.o(4022, currentTimeMillis);
                            return null;
                        }
                        File h3 = xv0Var.h(q10.z());
                        File file = new File(h3, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(h3, "pcam");
                        }
                        File file2 = new File(h3, "pcbc");
                        File file3 = new File(h3, "pcopt");
                        xv0Var.o(5016, currentTimeMillis);
                        return new uv0(q10, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            tw twVar = this.f7428v;
            mh m4 = twVar.m(1);
            if (m4 != null) {
                String z3 = m4.z();
                File c10 = ct.c(z3, "pcam.jar", twVar.o());
                if (!c10.exists()) {
                    c10 = ct.c(z3, "pcam", twVar.o());
                }
                return new uv0(m4, c10, ct.c(z3, "pcbc", twVar.o()), ct.c(z3, "pcopt", twVar.o()));
            }
        }
        return null;
    }
}
