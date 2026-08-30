package w7;
import w7.y7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final y7 f29502a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, w7.y7] */
    static {
        Object obj = new Object();
        f29502a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.ui.canvas.OrnamentDef", obj, 10);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("mesh", false);
        r0Var.k("tex", true);
        r0Var.k("normal", true);
        r0Var.k("name", true);
        r0Var.k("scale", true);
        r0Var.k("rotDeg", true);
        r0Var.k("argb", true);
        r0Var.k("metallic", true);
        r0Var.k("roughness", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        a8 a8Var = (a8) obj;
        a8Var.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        String str = a8Var.f27891a;
        float f10 = a8Var.f27898j;
        float f11 = a8Var.i;
        int i = a8Var.f27897h;
        float f12 = a8Var.f27896g;
        float f13 = a8Var.f27895f;
        String str2 = a8Var.e;
        String str3 = a8Var.f27894d;
        String str4 = a8Var.f27893c;
        a10.v(dVar, 0, str);
        a10.v(dVar, 1, a8Var.f27892b);
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str4, "")) {
            a10.v(dVar, 2, str4);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str3, "")) {
            a10.v(dVar, 3, str3);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str2, "")) {
            a10.v(dVar, 4, str2);
        }
        if (a10.x(dVar) || Float.compare(f13, 1.0f) != 0) {
            a10.i(dVar, 5, f13);
        }
        if (a10.x(dVar) || Float.compare(f12, 0.0f) != 0) {
            a10.i(dVar, 6, f12);
        }
        if (a10.x(dVar) || i != -7697776) {
            a10.m(7, i, dVar);
        }
        if (a10.x(dVar) || Float.compare(f11, 0.85f) != 0) {
            a10.i(dVar, 8, f11);
        }
        if (a10.x(dVar) || Float.compare(f10, 0.4f) != 0) {
            a10.i(dVar, 9, f10);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        boolean z3 = true;
        while (z3) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z3 = false;
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
                    str4 = k3.B(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = k3.B(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    f10 = k3.d(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    f11 = k3.d(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    i10 = k3.m(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    f12 = k3.d(dVar, 8);
                    i |= 256;
                    break;
                case 9:
                    f13 = k3.d(dVar, 9);
                    i |= 512;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new a8(i, str, str2, str3, str4, str5, f10, f11, i10, f12, f13);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        eg.x xVar = eg.x.f16594a;
        return new ag.a[]{b1Var, b1Var, b1Var, b1Var, b1Var, xVar, xVar, eg.e0.f16506a, xVar, xVar};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}