package h7;

import eg.r0;
import eg.y;
import gg.t;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final d f17881a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, h7.d, java.lang.Object] */
    static {
        Object obj = new Object();
        f17881a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.export.ScrapDataDump", obj, 2);
        r0Var.k("notebook", false);
        r0Var.k("elements", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(t tVar, Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        cg.d dVar = descriptor;
        t a10 = tVar.a(dVar);
        pe.g[] gVarArr = f.f17882c;
        a10.r(dVar, 0, k7.d.f19604a, fVar.f17883a);
        a10.r(dVar, 1, (ag.a) gVarArr[1].getValue(), fVar.f17884b);
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = f.f17882c;
        k7.f fVar = null;
        boolean z3 = true;
        int i = 0;
        List list = null;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 == 1) {
                        list = (List) k3.s(dVar, 1, (ag.a) gVarArr[1].getValue(), list);
                        i |= 2;
                    } else {
                        throw new ag.e(t3);
                    }
                } else {
                    fVar = (k7.f) k3.s(dVar, 0, k7.d.f19604a, fVar);
                    i |= 1;
                }
            } else {
                z3 = false;
            }
        }
        k3.f(dVar);
        return new f(i, fVar, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        return new ag.a[]{k7.d.f19604a, f.f17882c[1].getValue()};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}