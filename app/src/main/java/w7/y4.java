package w7;
import w7.y4;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class y4 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final y4 f29495a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, w7.y4] */
    static {
        Object obj = new Object();
        f29495a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.ui.canvas.FrameDef", obj, 6);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("packId", true);
        r0Var.k("file", true);
        r0Var.k("name", true);
        r0Var.k("aspect", true);
        r0Var.k("holes", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        a5 a5Var = (a5) obj;
        a5Var.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        pe.g[] gVarArr = a5.f27867g;
        String str = a5Var.f27868a;
        List list = a5Var.f27872f;
        float f10 = a5Var.e;
        String str2 = a5Var.f27871d;
        String str3 = a5Var.f27870c;
        String str4 = a5Var.f27869b;
        a10.v(dVar, 0, str);
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str4, "")) {
            a10.v(dVar, 1, str4);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str3, "")) {
            a10.v(dVar, 2, str3);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str2, "")) {
            a10.v(dVar, 3, str2);
        }
        if (a10.x(dVar) || Float.compare(f10, 1.0f) != 0) {
            a10.i(dVar, 4, f10);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(list, qe.s.f24023u)) {
            a10.r(dVar, 5, (ag.a) gVarArr[5].getValue(), list);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = a5.f27867g;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        float f10 = 0.0f;
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
                    f10 = k3.d(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) k3.s(dVar, 5, (ag.a) gVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new a5(i, str, str2, str3, str4, f10, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        pe.g[] gVarArr = a5.f27867g;
        eg.b1 b1Var = eg.b1.f16494a;
        return new ag.a[]{b1Var, b1Var, b1Var, b1Var, eg.x.f16594a, gVarArr[5].getValue()};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}