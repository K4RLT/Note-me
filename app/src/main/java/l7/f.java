package l7;
import r.a;

import eg.b1;
import eg.e0;
import eg.r0;
import eg.y;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final f f19983a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [l7.f, eg.y, java.lang.Object] */
    static {
        Object obj = new Object();
        f19983a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.payload.InkMetaPayload", obj, 4);
        r0Var.k("visible", true);
        r0Var.k("locked", true);
        r0Var.k("name", true);
        r0Var.k("slot", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        h hVar = (h) obj;
        hVar.getClass();
        int i = hVar.f19987d;
        String str = hVar.f19986c;
        boolean z3 = hVar.f19985b;
        boolean z9 = hVar.f19984a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !z9) {
            a10.c(dVar, 0, z9);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 1, z3);
        }
        if (a10.x(dVar) || str != null) {
            a10.q(dVar, 2, b1.f16494a, str);
        }
        if (a10.x(dVar) || i != 0) {
            a10.m(3, i, dVar);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        int i10 = 0;
        boolean z3 = false;
        boolean z9 = false;
        String str = null;
        boolean z10 = true;
        while (z10) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 != 1) {
                        if (t3 != 2) {
                            if (t3 == 3) {
                                i10 = k3.m(dVar, 3);
                                i |= 8;
                            } else {
                                throw new ag.e(t3);
                            }
                        } else {
                            str = (String) k3.w(dVar, 2, b1.f16494a, str);
                            i |= 4;
                        }
                    } else {
                        z9 = k3.c(dVar, 1);
                        i |= 2;
                    }
                } else {
                    z3 = k3.c(dVar, 0);
                    i |= 1;
                }
            } else {
                z10 = false;
            }
        }
        k3.f(dVar);
        return new h(i, i10, str, z3, z9);
    }

    @Override // eg.y
    public final ag.a[] c() {
        ag.a a10 = va.a(b1.f16494a);
        eg.f fVar = eg.f.f16510a;
        return new ag.a[]{fVar, fVar, a10, e0.f16506a};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}