package e7;
import c.b;
import c.c;
import c.i;
import l.a;
import q.x;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.wd0;
import pe.z;
import pf.b0;
import pf.l0;
import pf.t1;
import ya.lc;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f15976b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f15977c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile fw f15978d;
    public static volatile Context e;

    /* renamed from: g, reason: collision with root package name */
    public static final uf.c f15980g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile long f15981h;
    public static volatile boolean i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile long f15982j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile int f15983k;

    /* renamed from: l, reason: collision with root package name */
    public static final c2.m f15984l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile long f15985m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile int f15986n;

    /* renamed from: o, reason: collision with root package name */
    public static volatile String f15987o;

    /* renamed from: p, reason: collision with root package name */
    public static final c2.m f15988p;

    /* renamed from: a, reason: collision with root package name */
    public static final o f15975a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Handler f15979f = new Handler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e7.o] */
    static {
        wf.e eVar = l0.f22767a;
        qf.d dVar = uf.n.f27235a.f24037z;
        t1 d2 = b0.d();
        dVar.getClass();
        f15980g = b0.b(lc.c(dVar, d2));
        f15984l = new c2.m(2);
        f15986n = -1;
        f15987o = "unknown";
        f15988p = new c2.m(3);
    }

    public static boolean b() {
        return !((Boolean) r7.b.f24612b.f25140u.getValue()).booleanValue();
    }

    public static boolean c() {
        if (f15978d != null && SystemClock.elapsedRealtime() - f15981h < 3000000) {
            return true;
        }
        return false;
    }

    public static void d(Context context) {
        context.getClass();
        e = context.getApplicationContext();
        if (b() && f15976b) {
            if (f15978d != null && !c()) {
                Log.d("AdsManager", "rewarded caducado: se descarta y se pide otro");
                f15978d = null;
            }
            if (f15978d == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!f15977c || elapsedRealtime - f15982j >= 60000) {
                    final boolean z3 = true;
                    f15977c = true;
                    f15982j = elapsedRealtime;
                    Handler handler = f15979f;
                    handler.removeCallbacks(f15984l);
                    if (f15983k != 0) {
                        z3 = false;
                    }
                    final Context applicationContext = context.getApplicationContext();
                    handler.post(new Runnable() { // from class: e7.f
                        /* JADX WARN: Type inference failed for: r0v2, types: [m9.b, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (z3) {
                                f7.i("ad_requested", null);
                            }
                            fw.a(applicationContext, "ca-app-pub-4629456747116653/4064816163", new z8.g(new c1.a(6)), new Object());
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    public static void e(Activity activity, String str, df.l lVar) {
        fw fwVar;
        Object kVar;
        activity.getClass();
        if (c()) {
            fwVar = f15978d;
        } else {
            fwVar = null;
        }
        if (b() && fwVar != null) {
            f15978d = null;
            f15987o = str;
            Object obj = new Object();
            Object obj2 = new Object();
            Object obj3 = new Object();
            Object obj4 = new Object();
            i iVar = new i((kotlin.jvm.internal.u) obj4, (kotlin.jvm.internal.u) obj3, activity, (kotlin.jvm.internal.u) obj, (kotlin.jvm.internal.u) obj2, str, lVar);
            f15979f.postDelayed(iVar, 12000L);
            fwVar.f6191c.f7892u = new m(obj4, obj2, iVar, str, obj, obj3, activity, lVar);
            try {
                fwVar.b(activity, new b1.h(5, obj));
                kVar = z.f22715a;
            } catch (Throwable th) {
                kVar = new pe.k(th);
            }
            Throwable a10 = pe.a(kVar);
            if (a10 != null) {
                f15979f.removeCallbacks(iVar);
                wd0.o("show() lanzo: ", a10.getMessage(), "AdsManager");
                f(obj3, activity, obj, obj2, str, lVar);
                return;
            }
            return;
        }
        f15978d = null;
        d(activity);
        f7.b(str, "not_ready");
        lVar.invoke(j.UNAVAILABLE);
    }

    public static final void f(kotlin.jvm.internal.u uVar, Activity activity, kotlin.jvm.internal.u uVar2, kotlin.jvm.internal.u uVar3, String str, df.l lVar) {
        j jVar;
        if (uVar.f19783u) {
            return;
        }
        uVar.f19783u = true;
        d(activity);
        if (uVar2.f19783u) {
            jVar = j.EARNED;
        } else if (uVar3.f19783u) {
            jVar = j.DISMISSED_EARLY;
        } else {
            jVar = j.UNAVAILABLE;
        }
        if (jVar == j.UNAVAILABLE) {
            f7.b(str, "show_failed");
        }
        lVar.invoke(jVar);
    }

    public static void g(Activity activity, String str, df.l lVar) {
        activity.getClass();
        f7.i("ad_gate_hit", f7.c(new pe.j("surface", str)));
        if (!b()) {
            lVar.invoke(Boolean.FALSE);
        } else if (c()) {
            e(activity, str, new b1.o(3, lVar));
        } else {
            b0.x(f15980g, null, new n(activity, str, lVar, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r9, long r10, ve.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof e7.k
            if (r0 == 0) goto L13
            r0 = r12
            e7.k r0 = (e7.k) r0
            int r1 = r0.f15962z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15962z = r1
            goto L18
        L13:
            e7.k r0 = new e7.k
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f15960x
            ue.a r1 = ue.a.f27192u
            int r2 = r0.f15962z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            long r9 = r0.f15959w
            long r4 = r0.f15958v
            long r6 = r0.f15957u
            pe.a.e(r12)
            r11 = r6
            goto L5c
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r9)
            r9 = 0
            return r9
        L35:
            pe.a.e(r12)
            boolean r12 = b()
            if (r12 != 0) goto L41
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L41:
            boolean r12 = c()
            if (r12 == 0) goto L4a
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L4a:
            boolean r12 = e7.o.f15976b
            if (r12 != 0) goto L51
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L51:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r4 + r10
            d(r9)
            r11 = r10
            r9 = r6
        L5c:
            long r6 = android.os.SystemClock.elapsedRealtime()
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 >= 0) goto La5
            boolean r2 = c()
            if (r2 == 0) goto L6d
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L6d:
            boolean r2 = e7.o.f15977c
            if (r2 != 0) goto L94
            long r6 = e7.o.f15985m
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 < 0) goto L94
            int r9 = e7.o.f15986n
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "espera cortada: el SDK contestó sin anuncio (código "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = ")"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "AdsManager"
            android.util.Log.d(r10, r9)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L94:
            r0.f15957u = r11
            r0.f15958v = r4
            r0.f15959w = r9
            r0.f15962z = r3
            r6 = 120(0x78, double:5.93E-322)
            java.lang.Object r2 = pf.b0.j(r6, r0)
            if (r2 != r1) goto L5c
            return r1
        La5:
            boolean r9 = c()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.a(android.content.Context, long, ve.c):java.lang.Object");
    }
}