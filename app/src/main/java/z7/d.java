package z7;
import c.d;
import c.k;
import c.m;
import p.v0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import b8.f1;
import b8.w8;
import b8.y8;
import b8.z4;
import java.util.LinkedHashMap;
import m2.f0;
import p.b0;
import p.p0;
import p.q0;
import p.r0;
import p.t1;
import p.v1;
import q.k1;
import r0.a1;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import u7.o4;
import w7.r5;
import wa.z5;
import ya.h9;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final z0.c f31947a = new z0.c(-78861500, new r5(20), false);

    /* renamed from: b, reason: collision with root package name */
    public static final z0.c f31948b = new z0.c(-237258574, new r5(21), false);

    /* renamed from: c, reason: collision with root package name */
    public static final z0.c f31949c = new z0.c(-818619027, new r5(22), false);

    /* renamed from: d, reason: collision with root package name */
    public static final z0.c f31950d = new z0.c(-2024518007, new r5(23), false);
    public static final z0.c e = new z0.c(-646705249, new r5(24), false);

    /* renamed from: f, reason: collision with root package name */
    public static final z0.c f31951f = new z0.c(-538108118, new f1(5), false);

    /* renamed from: g, reason: collision with root package name */
    public static final z0.c f31952g = new z0.c(1531638280, new r5(25), false);

    public static final void a(int i, r0.m mVar) {
        boolean z3;
        q1 t3;
        r5 r5Var;
        r rVar = (r) mVar;
        rVar.c0(-1574788334);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            t3 = rVar.t();
            if (t3 != null) {
                r5Var = new r5(i, 26);
            } else {
                return;
            }
        } else {
            rVar.U();
            t3 = rVar.t();
            if (t3 != null) {
                r5Var = new r5(i, 27);
            } else {
                return;
            }
        }
        t3.f24332d = r5Var;
    }

    public static final void b(String str, String str2, boolean z3, df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        df.a aVar2;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(-989898242);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i15 & 1, z9)) {
            p0 d2 = androidx.compose.animation.c.d(q.e.s(300, 0, null, 6), 2);
            k1 s10 = q.e.s(300, 0, null, 6);
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = new f0(13);
                rVar.k0(O);
            }
            p0 a10 = d2.a(new p0(new v1((r0) null, new t1(new h1.c(3, (df.l) O), s10), (b0) null, (v0) null, (LinkedHashMap) null, 61)));
            q0 e8 = androidx.compose.animation.c.e(q.e.s(300, 0, null, 6), 2);
            k1 s11 = q.e.s(300, 0, null, 6);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new f0(13);
                rVar.k0(O2);
            }
            aVar2 = aVar;
            h9.c(z3, null, a10, e8.a(new q0(new v1((r0) null, new t1(new h1.c(5, (df.l) O2), s11), (b0) null, (v0) null, (LinkedHashMap) null, 61))), null, z0.h.d(512018470, new r7.j(6, aVar2, str, str2), rVar), rVar, ((i15 >> 6) & 14) | 200064, 18);
        } else {
            aVar2 = aVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new w8(str, str2, z3, aVar2, i, 1);
        }
    }

    public static final void c(boolean z3, f fVar, String str, df.l lVar, df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        df.a aVar2;
        fVar.getClass();
        str.getClass();
        lVar.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(-250715702);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar.d(fVar.ordinal())) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.f(str)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar.h(lVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        boolean z10 = true;
        if ((i17 & 9363) != 9362) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i17 & 1, z9)) {
            Object O = rVar.O();
            te.c cVar = null;
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = y.B(null);
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            Boolean valueOf = Boolean.valueOf(z3);
            int i18 = i17 & 14;
            if (i18 != 4) {
                z10 = false;
            }
            Object O2 = rVar.O();
            if (z10 || O2 == v0Var) {
                O2 = new i(z3, a1Var, cVar, 1);
                rVar.k0(O2);
            }
            y.f((df.p) O2, valueOf, rVar);
            Object O3 = rVar.O();
            if (O3 == v0Var) {
                aVar2 = aVar;
                O3 = new o4(aVar2, a1Var, 15);
                rVar.k0(O3);
            } else {
                aVar2 = aVar;
            }
            z5.a(z3, (df.a) O3, rVar, i18, 0);
            p0 d2 = androidx.compose.animation.c.d(q.e.s(300, 0, null, 6), 2);
            k1 s10 = q.e.s(300, 0, null, 6);
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = new f0(13);
                rVar.k0(O4);
            }
            p0 a10 = d2.a(androidx.compose.animation.k((df.l) O4, s10));
            q0 e8 = androidx.compose.animation.c.e(q.e.s(300, 0, null, 6), 2);
            k1 s11 = q.e.s(300, 0, null, 6);
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = new f0(13);
                rVar.k0(O5);
            }
            h9.c(z3, null, a10, e8.a(androidx.compose.animation.m((df.l) O5, s11)), null, z0.h.d(-1831489374, new y8(aVar2, a1Var, fVar, str, lVar, 2), rVar), rVar, i18 | 200064, 18);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new z4(z3, fVar, str, lVar, aVar, i);
        }
    }

    public static boolean d(Context context) {
        ActivityManager activityManager;
        int i;
        context.getClass();
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = 0;
        }
        if (i > 256) {
            f e8 = e(context);
            e8.getClass();
            if (e8 == f.AUTO) {
                e8 = f(context);
            }
            if (e8 != f.BATTERY) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static f e(Context context) {
        Object kVar;
        context.getClass();
        Object obj = null;
        String string = context.getSharedPreferences("scraply_settings", 0).getString("graphics_quality", null);
        if (string != null) {
            try {
                kVar = f.valueOf(string);
            } catch (Throwable th) {
                kVar = new pe.k(th);
            }
            if (!(kVar instanceof pe.k)) {
                obj = kVar;
            }
            f fVar = (f) obj;
            if (fVar != null) {
                return fVar;
            }
        }
        return f.AUTO;
    }

    public static f f(Context context) {
        ActivityManager activityManager;
        int i;
        f fVar;
        f fVar2;
        context.getClass();
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null) {
            return f.BALANCED;
        }
        if (activityManager.isLowRamDevice()) {
            return f.BATTERY;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            i = Build.VERSION.MEDIA_PERFORMANCE_CLASS;
        } else {
            i = 0;
        }
        if (i >= 33) {
            fVar = f.QUALITY;
        } else if (i >= 31) {
            fVar = f.BALANCED;
        } else {
            fVar = f.BATTERY;
        }
        activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
        double d2 = r2.totalMem / 1.073741824E9d;
        if (d2 < 5.0d) {
            fVar2 = f.BATTERY;
        } else if (d2 < 7.0d) {
            fVar2 = f.BALANCED;
        } else {
            fVar2 = f.QUALITY;
        }
        fVar.getClass();
        fVar2.getClass();
        if (fVar.compareTo(fVar2) < 0) {
            fVar = fVar2;
        }
        if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            f fVar3 = f.BALANCED;
            if (fVar.compareTo(fVar3) < 0) {
                return fVar3;
            }
        }
        return fVar;
    }

    public static n g(Context context, f fVar) {
        context.getClass();
        fVar.getClass();
        if (fVar == f.AUTO) {
            fVar = f(context);
        }
        fVar.getClass();
        int i = g.f31954a[fVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new n(1024, true, 0.85f, 4, 224);
                        }
                        l4.a.o();
                        return null;
                    }
                    return new n(4096, true, 1.0f, 8, 128);
                }
                return new n(1024, true, 1.0f, 4, 224);
            }
            return new n(1024, true, 0.85f, 4, 224);
        }
        return new n(512, false, 0.6f, 4, 224);
    }
}
