package b8;
import b8.b3;
import l.a;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final b3 f1874a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, b8.b3, java.lang.Object] */
    static {
        Object obj = new Object();
        f1874a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.HouseNotebooks.Row", obj, 5);
        r0Var.k(FacebookMediationAdapter.KEY_ID, true);
        r0Var.k("price_tier", true);
        r0Var.k("min_app_version", true);
        r0Var.k("published", true);
        r0Var.k("sort_order", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        d3 d3Var = (d3) obj;
        d3Var.getClass();
        int i = d3Var.e;
        boolean z3 = d3Var.f1971d;
        int i10 = d3Var.f1970c;
        String str = d3Var.f1969b;
        String str2 = d3Var.f1968a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str2, "")) {
            a10.v(dVar, 0, str2);
        }
        if (a10.x(dVar) || str != null) {
            a10.q(dVar, 1, eg.b1.f16494a, str);
        }
        if (a10.x(dVar) || i10 != 1) {
            a10.m(2, i10, dVar);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 3, z3);
        }
        if (a10.x(dVar) || i != 0) {
            a10.m(4, i, dVar);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        boolean z9 = true;
        while (z9) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 != 1) {
                        if (t3 != 2) {
                            if (t3 != 3) {
                                if (t3 == 4) {
                                    i11 = k3.m(dVar, 4);
                                    i |= 16;
                                } else {
                                    throw new ag.e(t3);
                                }
                            } else {
                                z3 = k3.c(dVar, 3);
                                i |= 8;
                            }
                        } else {
                            i10 = k3.m(dVar, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = (String) k3.w(dVar, 1, eg.b1.f16494a, str2);
                        i |= 2;
                    }
                } else {
                    str = k3.B(dVar, 0);
                    i |= 1;
                }
            } else {
                z9 = false;
            }
        }
        k3.f(dVar);
        return new d3(i, i10, i11, str, str2, z3);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        ag.a a10 = va.r.a(b1Var);
        eg.e0 e0Var = eg.e0.f16506a;
        return new ag.a[]{b1Var, a10, e0Var, eg.f.f16510a, e0Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}