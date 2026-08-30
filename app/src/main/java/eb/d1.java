package eb;
import b.a;
import c1.a;
import d1.g;
import q.x;
import r0.i0;
import r0.u;
import r0.y;
import r0.z0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.z3;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class d1 implements l1 {

    /* renamed from: c0, reason: collision with root package name */
    public static volatile d1 f16099c0;
    public final e A;
    public final q0 B;
    public final k0 C;
    public final y0 D;
    public final v2 E;
    public final l3 F;
    public final h0 G;
    public final la.a H;
    public final l2 I;
    public final t1 J;
    public final q K;
    public final i2 L;
    public final String M;
    public f0 N;
    public n2 O;
    public n P;
    public g0 Q;
    public Boolean S;
    public long T;
    public volatile Boolean U;
    public final Boolean V;
    public final Boolean W;
    public volatile boolean X;
    public int Y;
    public int Z;

    /* renamed from: b0, reason: collision with root package name */
    public final long f16101b0;

    /* renamed from: u, reason: collision with root package name */
    public final Context f16102u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16103v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16104w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16105x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16106y;

    /* renamed from: z, reason: collision with root package name */
    public final de.b f16107z;
    public boolean R = false;

    /* renamed from: a0, reason: collision with root package name */
    public final AtomicInteger f16100a0 = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r3v7, types: [eb.e, a] */
    /* JADX WARN: Type inference failed for: r4v8, types: [yb.d, java.lang.Object, com.google.android.gms.internal.measurement.o5] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eb.i2, eb.k1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [yb.f, java.lang.Object] */
    public d1(r1 r1Var) {
        long currentTimeMillis;
        yb.e eVar;
        Context context;
        Bundle bundle;
        boolean z3 = false;
        Context context2 = r1Var.f16345a;
        de.b bVar = new de.b(14);
        this.f16107z = bVar;
        q1.f16330k = bVar;
        this.f16102u = context2;
        this.f16103v = r1Var.f16346b;
        this.f16104w = r1Var.f16347c;
        this.f16105x = r1Var.f16348d;
        this.f16106y = r1Var.f16351h;
        this.U = r1Var.e;
        this.M = r1Var.f16352j;
        this.X = true;
        com.google.android.gms.internal.measurement.a1 a1Var = r1Var.f16350g;
        if (a1Var != null && (bundle = a1Var.A) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.V = (Boolean) obj;
            }
            Object obj2 = a1Var.A.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.W = (Boolean) obj2;
            }
        }
        if (k4.f13798h == null && context2 != null) {
            Object obj3 = k4.f13797g;
            synchronized (obj3) {
                try {
                    if (k4.f13798h == null) {
                        synchronized (obj3) {
                            z3 z3Var = k4.f13798h;
                            Context applicationContext = context2.getApplicationContext();
                            applicationContext = applicationContext == null ? context2 : applicationContext;
                            if (z3Var != null) {
                                if (z3Var.f13991a != applicationContext) {
                                }
                            }
                            if (z3Var != null) {
                                b4.c();
                                l4.a();
                                synchronized (e4.class) {
                                    try {
                                        e4 e4Var = e4.f13726x;
                                        if (e4Var != null && (context = (Context) e4Var.f13728v) != null && ((f4) e4Var.f13729w) != null) {
                                            context.getContentResolver().unregisterContentObserver((f4) e4.f13726x.f13729w);
                                        }
                                        e4.f13726x = null;
                                    } finally {
                                    }
                                }
                            }
                            Object obj4 = new Object();
                            obj4.f13873u = applicationContext;
                            if (obj4 instanceof Serializable) {
                                eVar = new yb.e(obj4);
                            } else {
                                Object obj5 = new Object();
                                obj5.f31635u = obj4;
                                eVar = obj5;
                            }
                            k4.f13798h = new z3(applicationContext, eVar);
                            k4.i.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.H = la.a.f20062a;
        Long l10 = r1Var.i;
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.f16101b0 = currentTimeMillis;
        a aVar = new a(this);
        aVar.f16114y = new ed.e(14);
        this.A = aVar;
        q0 q0Var = new q0(this);
        q0Var.w();
        this.B = q0Var;
        k0 k0Var = new k0(this);
        k0Var.w();
        this.C = k0Var;
        l3 l3Var = new l3(this);
        l3Var.w();
        this.F = l3Var;
        this.G = new h0(new t0(this, 1));
        this.K = new q(this);
        l2 l2Var = new l2(this);
        l2Var.z();
        this.I = l2Var;
        t1 t1Var = new t1(this);
        t1Var.z();
        this.J = t1Var;
        v2 v2Var = new v2(this);
        v2Var.z();
        this.E = v2Var;
        k1 k1Var = new k1(this);
        k1Var.w();
        this.L = k1Var;
        y0 y0Var = new y0(this);
        y0Var.w();
        this.D = y0Var;
        com.google.android.gms.internal.measurement.a1 a1Var2 = r1Var.f16350g;
        if (a1Var2 != null && a1Var2.f13624v != 0) {
            z3 = true;
        }
        if (context2.getApplicationContext() instanceof Application) {
            c(t1Var);
            d1 d1Var = (d1) t1Var.f3443v;
            if (d1Var.f16102u.getApplicationContext() instanceof Application) {
                Application application = (Application) d1Var.f16102u.getApplicationContext();
                if (t1Var.f16374x == null) {
                    t1Var.f16374x = new h2(t1Var);
                }
                if (!z3) {
                    application.unregisterActivityLifecycleCallbacks(t1Var.f16374x);
                    application.registerActivityLifecycleCallbacks(t1Var.f16374x);
                    t1Var.f().I.g("Registered activity lifecycle callback");
                }
            }
        } else {
            d(k0Var);
            k0Var.D.g("Application context is not an Application");
        }
        y0Var.D(new ou1(9, this, r1Var, false));
    }

    public static d1 a(Context context, com.google.android.gms.internal.measurement.a1 a1Var, Long l10) {
        Bundle bundle;
        if (a1Var != null && (a1Var.f13627y == null || a1Var.f13628z == null)) {
            a1Var = new com.google.android.gms.internal.measurement.a1(a1Var.f13623u, a1Var.f13624v, a1Var.f13625w, a1Var.f13626x, null, null, a1Var.A, null);
        }
        fa.y.h(context);
        fa.y.h(context.getApplicationContext());
        if (f16099c0 == null) {
            synchronized (d1.class) {
                try {
                    if (f16099c0 == null) {
                        f16099c0 = new d1(new r1(context, a1Var, l10));
                    }
                } finally {
                }
            }
        } else if (a1Var != null && (bundle = a1Var.A) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            fa.y.h(f16099c0);
            f16099c0.U = Boolean.valueOf(a1Var.A.getBoolean("dataCollectionDefaultEnabled"));
        }
        fa.y.h(f16099c0);
        return f16099c0;
    }

    public static void b(a aVar) {
        if (aVar != null) {
            return;
        }
        x.o("Component not created");
    }

    public static void c(z zVar) {
        if (zVar != null) {
            if (zVar.f16467w) {
                return;
            }
            x.o("Component not initialized: ".concat(String.valueOf(zVar.getClass())));
            return;
        }
        x.o("Component not created");
    }

    public static void d(k1 k1Var) {
        if (k1Var != null) {
            if (k1Var.f16205w) {
                return;
            }
            x.o("Component not initialized: ".concat(String.valueOf(k1Var.getClass())));
            return;
        }
        x.o("Component not created");
    }

    public final boolean e() {
        if (i() == 0) {
            return true;
        }
        return false;
    }

    @Override // eb.l1
    public final k0 f() {
        k0 k0Var = this.C;
        d(k0Var);
        return k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.T) > 1000) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r6 = this;
            boolean r0 = r6.R
            if (r0 == 0) goto Lb4
            eb.y0 r0 = r6.D
            d(r0)
            u()
            java.lang.Boolean r0 = r6.S
            la.a r1 = r6.H
            if (r0 == 0) goto L34
            long r2 = r6.T
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.T
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.T = r0
            eb.l3 r0 = r6.F
            b(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = z0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = z0(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f16102u
            c4.n r4 = na.a(r1)
            boolean r4 = r4.d()
            if (r4 != 0) goto L74
            eb.e r4 = r6.A
            boolean r4 = r4.J()
            if (r4 != 0) goto L74
            boolean r4 = eb.l3.d0(r1)
            if (r4 == 0) goto L76
            boolean r1 = eb.l3.p0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.S = r4
            if (r1 == 0) goto Lad
            eb.g0 r1 = r6.m()
            java.lang.String r1 = r1.C()
            eb.g0 r4 = r6.m()
            r4.y()
            java.lang.String r4 = r4.H
            boolean r0 = i0(r1, r4)
            if (r0 != 0) goto La7
            eb.g0 r0 = r6.m()
            y()
            java.lang.String r0 = r0.H
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.S = r0
        Lad:
            java.lang.Boolean r0 = r6.S
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.String r0 = "AppMeasurement is not initialized"
            x.o(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.g():boolean");
    }

    @Override // eb.l1
    public final y0 h() {
        y0 y0Var = this.D;
        d(y0Var);
        return y0Var;
    }

    public final int i() {
        Boolean bool;
        y0 y0Var = this.D;
        d(y0Var);
        y0Var.u();
        Boolean D = this.A.D("firebase_analytics_collection_deactivated");
        if (D != null && D.booleanValue()) {
            return 1;
        }
        Boolean bool2 = this.W;
        if (bool2 != null && bool2.booleanValue()) {
            return 2;
        }
        y0 y0Var2 = this.D;
        d(y0Var2);
        y0Var2.u();
        if (!this.X) {
            return 8;
        }
        q0 q0Var = this.B;
        b(q0Var);
        q0Var.u();
        if (q0Var.D().contains("measurement_enabled")) {
            bool = Boolean.valueOf(q0Var.D().getBoolean("measurement_enabled", true));
        } else {
            bool = null;
        }
        if (bool != null) {
            if (!bool.booleanValue()) {
                return 3;
            }
            return 0;
        }
        Boolean D2 = this.A.D("firebase_analytics_collection_enabled");
        if (D2 != null) {
            if (!D2.booleanValue()) {
                return 4;
            }
            return 0;
        }
        Boolean bool3 = this.V;
        if (bool3 != null) {
            if (!bool3.booleanValue()) {
                return 5;
            }
            return 0;
        }
        if (this.U != null && !this.U.booleanValue()) {
            return 7;
        }
        return 0;
    }

    public final q j() {
        q qVar = this.K;
        if (qVar != null) {
            return qVar;
        }
        x.o("Component not created");
        return null;
    }

    @Override // eb.l1
    public final de.b k() {
        return this.f16107z;
    }

    public final n l() {
        d(this.P);
        return this.P;
    }

    public final g0 m() {
        c(this.Q);
        return this.Q;
    }

    public final f0 n() {
        c(this.N);
        return this.N;
    }

    public final h0 o() {
        return this.G;
    }

    public final n2 p() {
        c(this.O);
        return this.O;
    }

    public final void q() {
        b(this.F);
    }

    @Override // eb.l1
    public final Context zza() {
        return this.f16102u;
    }

    @Override // eb.l1
    public final la.a zzb() {
        return this.H;
    }
}