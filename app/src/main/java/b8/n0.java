package b8;
import b8.n0;
import l.a;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f2433a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, b8.n0, java.lang.Object] */
    static {
        Object obj = new Object();
        f2433a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.Certificates.Store", obj, 2);
        r0Var.k("pending", true);
        r0Var.k("issued", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        p0 p0Var = (p0) obj;
        p0Var.getClass();
        Map map = p0Var.f2507b;
        List list = p0Var.f2506a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        pe.g[] gVarArr = p0.f2505c;
        if (a10.x(dVar) || !kotlin.jvm.internal.a(list, qe.s.f24023u)) {
            a10.r(dVar, 0, (ag.a) gVarArr[0].getValue(), list);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(map, qe.t.f24024u)) {
            a10.r(dVar, 1, (ag.a) gVarArr[1].getValue(), map);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = p0.f2505c;
        List list = null;
        boolean z3 = true;
        int i = 0;
        Map map = null;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 == 1) {
                        map = (Map) k3.s(dVar, 1, (ag.a) gVarArr[1].getValue(), map);
                        i |= 2;
                    } else {
                        throw new ag.e(t3);
                    }
                } else {
                    list = (List) k3.s(dVar, 0, (ag.a) gVarArr[0].getValue(), list);
                    i |= 1;
                }
            } else {
                z3 = false;
            }
        }
        k3.f(dVar);
        return new p0(i, list, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        pe.g[] gVarArr = p0.f2505c;
        return new ag.a[]{gVarArr[0].getValue(), gVarArr[1].getValue()};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}