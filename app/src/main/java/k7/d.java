package k7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import eg.b1;
import eg.e0;
import eg.k0;
import eg.r0;
import eg.x;
import eg.y;
import gg.t;
import va.r;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final d f19604a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, k7.d, java.lang.Object] */
    static {
        Object obj = new Object();
        f19604a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.entity.NotebookEntity", obj, 13);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("title", false);
        r0Var.k("pageCount", false);
        r0Var.k("colorR", false);
        r0Var.k("colorG", false);
        r0Var.k("colorB", false);
        r0Var.k("orderIndex", false);
        r0Var.k("coverConfig", true);
        r0Var.k("backgroundConfig", true);
        r0Var.k("sizeId", true);
        r0Var.k("stackId", true);
        r0Var.k("createdAt", false);
        r0Var.k("updatedAt", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(t tVar, Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        cg.d dVar = descriptor;
        t a10 = tVar.a(dVar);
        String str = fVar.f19605a;
        String str2 = fVar.f19613k;
        String str3 = fVar.f19612j;
        String str4 = fVar.i;
        String str5 = fVar.f19611h;
        a10.v(dVar, 0, str);
        a10.v(dVar, 1, fVar.f19606b);
        a10.m(2, fVar.f19607c, dVar);
        a10.i(dVar, 3, fVar.f19608d);
        a10.i(dVar, 4, fVar.e);
        a10.i(dVar, 5, fVar.f19609f);
        a10.m(6, fVar.f19610g, dVar);
        if (a10.x(dVar) || str5 != null) {
            a10.q(dVar, 7, b1.f16494a, str5);
        }
        if (a10.x(dVar) || str4 != null) {
            a10.q(dVar, 8, b1.f16494a, str4);
        }
        if (a10.x(dVar) || str3 != null) {
            a10.q(dVar, 9, b1.f16494a, str3);
        }
        if (a10.x(dVar) || str2 != null) {
            a10.q(dVar, 10, b1.f16494a, str2);
        }
        a10.o(dVar, 11, fVar.f19614l);
        a10.o(dVar, 12, fVar.f19615m);
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        String str = null;
        String str2 = null;
        String str3 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        long j10 = 0;
        long j11 = 0;
        boolean z3 = true;
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z3) {
            int t3 = k3.t(dVar);
            switch (t3) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    str2 = k3.B(dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = k3.B(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    i10 = k3.m(dVar, 2);
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
                    i11 = k3.m(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) k3.w(dVar, 7, b1.f16494a, str);
                    i |= 128;
                    break;
                case 8:
                    str4 = (String) k3.w(dVar, 8, b1.f16494a, str4);
                    i |= 256;
                    break;
                case 9:
                    str5 = (String) k3.w(dVar, 9, b1.f16494a, str5);
                    i |= 512;
                    break;
                case 10:
                    str6 = (String) k3.w(dVar, 10, b1.f16494a, str6);
                    i |= 1024;
                    break;
                case 11:
                    j10 = k3.e(dVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    j11 = k3.e(dVar, 12);
                    i |= 4096;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new f(i, str2, str3, i10, f10, f11, f12, i11, str, str4, str5, str6, j10, j11);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        ag.a a10 = r.a(b1Var);
        ag.a a11 = r.a(b1Var);
        ag.a a12 = r.a(b1Var);
        ag.a a13 = r.a(b1Var);
        e0 e0Var = e0.f16506a;
        x xVar = x.f16594a;
        k0 k0Var = k0.f16535a;
        return new ag.a[]{b1Var, b1Var, e0Var, xVar, xVar, xVar, e0Var, a10, a11, a12, a13, k0Var, k0Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}