package k7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import eg.b1;
import eg.e0;
import eg.k0;
import eg.r0;
import eg.x;
import eg.y;
import gg.t;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final a f19593a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, k7.a] */
    static {
        Object obj = new Object();
        f19593a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.entity.CanvasElementEntity", obj, 12);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("notebookId", false);
        r0Var.k("spreadIndex", false);
        r0Var.k("pageSide", false);
        r0Var.k("type", false);
        r0Var.k("zIndex", false);
        r0Var.k("x", false);
        r0Var.k("y", false);
        r0Var.k("scale", false);
        r0Var.k("rotation", false);
        r0Var.k("payload", false);
        r0Var.k("createdAt", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(t tVar, Object obj) {
        c cVar = (c) obj;
        cVar.getClass();
        cg.d dVar = descriptor;
        t a10 = tVar.a(dVar);
        a10.v(dVar, 0, cVar.f19594a);
        a10.v(dVar, 1, cVar.f19595b);
        a10.m(2, cVar.f19596c, dVar);
        a10.m(3, cVar.f19597d, dVar);
        a10.v(dVar, 4, cVar.e);
        a10.m(5, cVar.f19598f, dVar);
        a10.i(dVar, 6, cVar.f19599g);
        a10.i(dVar, 7, cVar.f19600h);
        a10.i(dVar, 8, cVar.i);
        a10.i(dVar, 9, cVar.f19601j);
        a10.v(dVar, 10, cVar.f19602k);
        a10.o(dVar, 11, cVar.f19603l);
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        long j10 = 0;
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
                    i10 = k3.m(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    i11 = k3.m(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = k3.B(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i12 = k3.m(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    f10 = k3.d(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    f11 = k3.d(dVar, 7);
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
                case 10:
                    str4 = k3.B(dVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    j10 = k3.e(dVar, 11);
                    i |= 2048;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new c(i, str, str2, i10, i11, str3, i12, f10, f11, f12, f13, str4, j10);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        e0 e0Var = e0.f16506a;
        x xVar = x.f16594a;
        return new ag.a[]{b1Var, b1Var, e0Var, e0Var, b1Var, e0Var, xVar, xVar, xVar, xVar, b1Var, k0.f16535a};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}