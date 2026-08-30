package b8;
import b8.g6;
import l.a;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class g6 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final g6 f2126a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, b8.g6, java.lang.Object] */
    static {
        Object obj = new Object();
        f2126a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.UniverseAccount.UserBit", obj, 1);
        r0Var.k(FacebookMediationAdapter.KEY_ID, true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        i6 i6Var = (i6) obj;
        i6Var.getClass();
        String str = i6Var.f2210a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str, "")) {
            a10.v(dVar, 0, str);
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
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 == 0) {
                    str = k3.B(dVar, 0);
                    i = 1;
                } else {
                    throw new ag.e(t3);
                }
            } else {
                z3 = false;
            }
        }
        k3.f(dVar);
        return new i6(i, str);
    }

    @Override // eg.y
    public final ag.a[] c() {
        return new ag.a[]{eg.b1.f16494a};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}