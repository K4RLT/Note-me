package b8;
import b8.h3;
import l.a;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class h3 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final h3 f2152a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, b8.h3] */
    static {
        Object obj = new Object();
        f2152a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.LocalCatalog", obj, 1);
        r0Var.k("listings", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        j3 j3Var = (j3) obj;
        j3Var.getClass();
        List list = j3Var.f2246a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        pe.g[] gVarArr = j3.f2245b;
        if (a10.x(dVar) || !kotlin.jvm.internal.a(list, qe.s.f24023u)) {
            a10.r(dVar, 0, (ag.a) gVarArr[0].getValue(), list);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = j3.f2245b;
        List list = null;
        boolean z3 = true;
        int i = 0;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 == 0) {
                    list = (List) k3.s(dVar, 0, (ag.a) gVarArr[0].getValue(), list);
                    i = 1;
                } else {
                    throw new ag.e(t3);
                }
            } else {
                z3 = false;
            }
        }
        k3.f(dVar);
        return new j3(i, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        return new ag.a[]{j3.f2245b[0].getValue()};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}