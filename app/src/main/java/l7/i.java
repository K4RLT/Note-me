package l7;

import eg.b1;
import eg.r0;
import eg.y;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final i f19988a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, l7.i, java.lang.Object] */
    static {
        Object obj = new Object();
        f19988a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.payload.PaperPayload", obj, 2);
        r0Var.k("left", false);
        r0Var.k("right", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        k kVar = (k) obj;
        kVar.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        a10.v(dVar, 0, kVar.f19989a);
        a10.v(dVar, 1, kVar.f19990b);
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
        return new k(str, i, str2);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        return new ag.a[]{b1Var, b1Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}