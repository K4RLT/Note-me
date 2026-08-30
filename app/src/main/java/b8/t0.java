package b8;
import b8.t0;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f2745a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, b8.t0] */
    static {
        Object obj = new Object();
        f2745a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.CloudUniverseApi.DraftArgs", obj, 9);
        r0Var.k("p_title", false);
        r0Var.k("p_kind", false);
        r0Var.k("p_unlock", false);
        r0Var.k("p_price_coins", false);
        r0Var.k("p_price_tier", false);
        r0Var.k("p_page_count", false);
        r0Var.k("p_cover_argb", false);
        r0Var.k("p_spine_argb", false);
        r0Var.k("p_spine_enabled", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        v0 v0Var = (v0) obj;
        v0Var.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        a10.v(dVar, 0, v0Var.f2854a);
        a10.v(dVar, 1, v0Var.f2855b);
        a10.v(dVar, 2, v0Var.f2856c);
        a10.m(3, v0Var.f2857d, dVar);
        a10.q(dVar, 4, eg.b1.f16494a, v0Var.e);
        a10.m(5, v0Var.f2858f, dVar);
        a10.m(6, v0Var.f2859g, dVar);
        a10.m(7, v0Var.f2860h, dVar);
        a10.c(dVar, 8, v0Var.i);
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z3 = false;
        boolean z9 = true;
        while (z9) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z9 = false;
                    break;
                case 0:
                    str = k3.B(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = k3.B(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = k3.B(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    i10 = k3.m(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) k3.w(dVar, 4, eg.b1.f16494a, str4);
                    i |= 16;
                    break;
                case 5:
                    i11 = k3.m(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i12 = k3.m(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    i13 = k3.m(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    z3 = k3.c(dVar, 8);
                    i |= 256;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new v0(i, str, str2, str3, i10, str4, i11, i12, i13, z3);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        ag.a a10 = va.r.a(b1Var);
        eg.e0 e0Var = eg.e0.f16506a;
        return new ag.a[]{b1Var, b1Var, b1Var, e0Var, a10, e0Var, e0Var, e0Var, eg.f.f16510a};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}