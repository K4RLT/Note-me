package b8;
import a6.f;
import b5.a;
import b8.j6;
import b8.k6;
import b8.l6;
import b8.m6;
import b8.n6;
import b8.o6;
import b8.p6;
import e0.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.wd0;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public static final p6 f2523a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final yf.c f2524b = yf.a();

    /* renamed from: c, reason: collision with root package name */
    public static final fg.s f2525c = wa.a(new n1(29));

    /* renamed from: d, reason: collision with root package name */
    public static final sf.n0 f2526d;
    public static final sf.a0 e;

    /* renamed from: f, reason: collision with root package name */
    public static Context f2527f;

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.p6, java.lang.Object] */
    static {
        sf.n0 b10 = sf.b(Boolean.FALSE);
        f2526d = b10;
        e = new sf.a0(b10);
    }

    public static final void b(String str) {
        Object kVar;
        Object obj = null;
        Serializable i = c8.a.i("GET", wd0.n(c8.a.c(), "/", mf.f.K("rest/v1/profiles?select=id,handle&id=eq.".concat(i()), '/')), null, str);
        if (i instanceof pe.k) {
            i = null;
        }
        String str2 = (String) i;
        if (str2 != null) {
            try {
                fg.s sVar = f2525c;
                sVar.getClass();
                kVar = (c6) qe.l.x((List) sVar.a(new eg.c(c6.Companion.serializer()), str2));
            } catch (Throwable th) {
                kVar = new pe.k(th);
            }
            if (!(kVar instanceof pe.k)) {
                obj = kVar;
            }
            c6 c6Var = (c6) obj;
            if (c6Var != null) {
                d().edit().putString("handle", c6Var.f1921b).apply();
            }
        }
    }

    public static final void c(f6 f6Var) {
        String str;
        SharedPreferences.Editor putLong = d().edit().putString("access_token", f6Var.f2080a).putString("refresh_token", f6Var.f2081b).putLong("expires_at", (f6Var.f2082c * 1000) + System.currentTimeMillis());
        i6 i6Var = f6Var.f2083d;
        if (i6Var != null && (str = i6Var.f2210a) != null) {
            if (mf.f.u(str)) {
                str = null;
            }
            if (str != null) {
                putLong.putString("user_id", str);
            }
        }
        putLong.apply();
        Boolean bool = Boolean.TRUE;
        sf.n0 n0Var = f2526d;
        n0Var.getClass();
        n0Var.k(null, bool);
    }

    public static SharedPreferences d() {
        Context context = f2527f;
        if (context != null) {
            return context.getSharedPreferences("scraply_universe_auth", 0);
        }
        kotlin.jvm.internal.l.h("appContext");
        throw null;
    }

    public static Object h(ve.c cVar) {
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new a(2, null), cVar);
    }

    public static String i() {
        String string = d().getString("user_id", "");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ve.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof j6
            if (r0 == 0) goto L13
            r0 = r7
            j6 r0 = (j6) r0
            int r1 = r0.f2259w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2259w = r1
            goto L18
        L13:
            j6 r0 = new j6
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f2257u
            int r1 = r0.f2259w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            pe.a.e(r7)
            goto L45
        L26:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r7)
            return r2
        L2c:
            pe.a.e(r7)
            wf.e r7 = pf.l0.f22767a
            wf.d r7 = wf.d.f29913w
            k6 r1 = new k6
            r4 = 2
            r5 = 0
            r1.<init>(r4, r2, r5)
            r0.f2259w = r3
            java.lang.Object r7 = pf.b0.J(r7, r1, r0)
            ue.a r0 = ue.a.f27192u
            if (r7 != r0) goto L45
            return r0
        L45:
            pe.l r7 = (pe.l) r7
            java.lang.Object r7 = r7.f22696u
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a(ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, ve.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l6
            if (r0 == 0) goto L13
            r0 = r7
            l6 r0 = (l6) r0
            int r1 = r0.f2370w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2370w = r1
            goto L18
        L13:
            l6 r0 = new l6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f2368u
            int r1 = r0.f2370w
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            pe.a.e(r7)
            goto L44
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r6)
            return r2
        L2c:
            pe.a.e(r7)
            wf.e r7 = pf.l0.f22767a
            wf.d r7 = wf.d.f29913w
            f r1 = new f
            r4 = 6
            r1.<init>(r6, r2, r4)
            r0.f2370w = r3
            java.lang.Object r7 = pf.b0.J(r7, r1, r0)
            ue.a r6 = ue.a.f27192u
            if (r7 != r6) goto L44
            return r6
        L44:
            pe.l r7 = (pe.l) r7
            java.lang.Object r6 = r7.f22696u
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.p6.e(java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r6, java.lang.String r7, ve.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof m6
            if (r0 == 0) goto L13
            r0 = r8
            m6 r0 = (m6) r0
            int r1 = r0.f2421w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2421w = r1
            goto L18
        L13:
            m6 r0 = new m6
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f2419u
            int r1 = r0.f2421w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            pe.a.e(r8)
            goto L44
        L26:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r6)
            return r3
        L2c:
            pe.a.e(r8)
            wf.e r8 = pf.l0.f22767a
            wf.d r8 = wf.d.f29913w
            n6 r1 = new n6
            r4 = 0
            r1.<init>(r6, r7, r3, r4)
            r0.f2421w = r2
            java.lang.Object r8 = pf.b0.J(r8, r1, r0)
            ue.a r6 = ue.a.f27192u
            if (r8 != r6) goto L44
            return r6
        L44:
            pe.l r8 = (pe.l) r8
            java.lang.Object r6 = r8.f22696u
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.p6.f(java.lang.String, java.lang.String, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, java.lang.String r6, ve.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o6
            if (r0 == 0) goto L13
            r0 = r7
            o6 r0 = (o6) r0
            int r1 = r0.f2484w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2484w = r1
            goto L18
        L13:
            o6 r0 = new o6
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f2482u
            int r1 = r0.f2484w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            pe.a.e(r7)
            goto L43
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r5)
            return r3
        L2c:
            pe.a.e(r7)
            wf.e r7 = pf.l0.f22767a
            wf.d r7 = wf.d.f29913w
            n6 r1 = new n6
            r1.<init>(r5, r6, r3, r2)
            r0.f2484w = r2
            java.lang.Object r7 = pf.b0.J(r7, r1, r0)
            ue.a r5 = ue.a.f27192u
            if (r7 != r5) goto L43
            return r5
        L43:
            pe.l r7 = (pe.l) r7
            java.lang.Object r5 = r7.f22696u
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.p6.g(java.lang.String, java.lang.String, ve.c):java.lang.Object");
    }
}
