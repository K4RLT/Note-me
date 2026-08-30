package l7;

import eg.e0;
import eg.r0;
import eg.x;
import eg.y;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final o f20000a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, l7.o] */
    static {
        Object obj = new Object();
        f20000a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.payload.StrokePayload", obj, 3);
        r0Var.k("pts", false);
        r0Var.k("color", false);
        r0Var.k("width", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        q qVar = (q) obj;
        qVar.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        a10.r(dVar, 0, (ag.a) q.f20001d[0].getValue(), qVar.f20002a);
        a10.m(1, qVar.f20003b, dVar);
        a10.i(dVar, 2, qVar.f20004c);
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = q.f20001d;
        List list = null;
        float f10 = 0.0f;
        boolean z3 = true;
        int i = 0;
        int i10 = 0;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 != 1) {
                        if (t3 == 2) {
                            f10 = k3.d(dVar, 2);
                            i |= 4;
                        } else {
                            throw new ag.e(t3);
                        }
                    } else {
                        i10 = k3.m(dVar, 1);
                        i |= 2;
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
        return new q(i, list, i10, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        return new ag.a[]{q.f20001d[0].getValue(), e0.f16506a, x.f16594a};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}