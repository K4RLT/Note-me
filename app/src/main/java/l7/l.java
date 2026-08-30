package l7;
import r.a;

import eg.b1;
import eg.e0;
import eg.r0;
import eg.x;
import eg.y;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final l f19991a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, l7.l, java.lang.Object] */
    static {
        Object obj = new Object();
        f19991a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.payload.ShapePayload", obj, 10);
        r0Var.k("shape", false);
        r0Var.k("fillArgb", true);
        r0Var.k("strokeArgb", true);
        r0Var.k("strokeWidth", true);
        r0Var.k("cornerRadius", true);
        r0Var.k("wFrac", true);
        r0Var.k("hFrac", true);
        r0Var.k("visible", true);
        r0Var.k("locked", true);
        r0Var.k("name", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        n nVar = (n) obj;
        nVar.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        String str = nVar.f19992a;
        String str2 = nVar.f19999j;
        boolean z3 = nVar.i;
        boolean z9 = nVar.f19998h;
        float f10 = nVar.f19997g;
        float f11 = nVar.f19996f;
        float f12 = nVar.e;
        float f13 = nVar.f19995d;
        Integer num = nVar.f19994c;
        Integer num2 = nVar.f19993b;
        a10.v(dVar, 0, str);
        if (a10.x(dVar) || num2 != null) {
            a10.q(dVar, 1, e0.f16506a, num2);
        }
        if (a10.x(dVar) || num != null) {
            a10.q(dVar, 2, e0.f16506a, num);
        }
        if (a10.x(dVar) || Float.compare(f13, 0.0f) != 0) {
            a10.i(dVar, 3, f13);
        }
        if (a10.x(dVar) || Float.compare(f12, 0.0f) != 0) {
            a10.i(dVar, 4, f12);
        }
        if (a10.x(dVar) || Float.compare(f11, 0.2f) != 0) {
            a10.i(dVar, 5, f11);
        }
        if (a10.x(dVar) || Float.compare(f10, 0.2f) != 0) {
            a10.i(dVar, 6, f10);
        }
        if (a10.x(dVar) || !z9) {
            a10.c(dVar, 7, z9);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 8, z3);
        }
        if (a10.x(dVar) || str2 != null) {
            a10.q(dVar, 9, b1.f16494a, str2);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        int i = 0;
        boolean z3 = false;
        boolean z9 = false;
        boolean z10 = true;
        while (z10) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    str2 = k3.B(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) k3.w(dVar, 1, e0.f16506a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) k3.w(dVar, 2, e0.f16506a, num2);
                    i |= 4;
                    break;
                case 3:
                    f10 = k3.d(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    f11 = k3.d(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    f12 = k3.d(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    f13 = k3.d(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    z3 = k3.c(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    z9 = k3.c(dVar, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) k3.w(dVar, 9, b1.f16494a, str);
                    i |= 512;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new n(i, str2, num, num2, f10, f11, f12, f13, z3, z9, str);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        e0 e0Var = e0.f16506a;
        ag.a a10 = va.a(e0Var);
        ag.a a11 = va.a(e0Var);
        ag.a a12 = va.a(b1Var);
        x xVar = x.f16594a;
        eg.f fVar = eg.f.f16510a;
        return new ag.a[]{b1Var, a10, a11, xVar, xVar, xVar, xVar, fVar, fVar, a12};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}