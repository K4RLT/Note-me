package b8;
import b8.a6;
import l.a;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class a6 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final a6 f1838a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.a6, eg.y, java.lang.Object] */
    static {
        Object obj = new Object();
        f1838a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.UniverseAccount.ProfileRow", obj, 2);
        r0Var.k(FacebookMediationAdapter.KEY_ID, true);
        r0Var.k("handle", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        c6 c6Var = (c6) obj;
        c6Var.getClass();
        String str = c6Var.f1921b;
        String str2 = c6Var.f1920a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str2, "")) {
            a10.v(dVar, 0, str2);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str, "")) {
            a10.v(dVar, 1, str);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        String str = null;
        boolean z3 = true;
        int i = 0;
        String str2 = null;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 == 1) {
                        str2 = k3.B(dVar, 1);
                        i |= 2;
                    } else {
                        throw new ag.e(t3);
                    }
                } else {
                    str = k3.B(dVar, 0);
                    i |= 1;
                }
            } else {
                z3 = false;
            }
        }
        k3.f(dVar);
        return new c6(str, i, str2);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        return new ag.a[]{b1Var, b1Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}