package w7;
import r.a;
import w7.q9;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final q9 f28962a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [w7.q9, eg.y, java.lang.Object] */
    static {
        Object obj = new Object();
        f28962a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.ui.canvas.StickerPack", obj, 13);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("name", false);
        r0Var.k("premium", true);
        r0Var.k("tape", true);
        r0Var.k("delivery", true);
        r0Var.k("thumb", true);
        r0Var.k("unlock", true);
        r0Var.k("diecut", true);
        r0Var.k("files", true);
        r0Var.k("frames", true);
        r0Var.k("tapes", true);
        r0Var.k("ornaments", true);
        r0Var.k("taller", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        s9 s9Var = (s9) obj;
        s9Var.getClass();
        boolean z3 = s9Var.f29090m;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        pe.g[] gVarArr = s9.f29079n;
        String str = s9Var.f29080a;
        List list = s9Var.f29089l;
        List list2 = s9Var.f29088k;
        List list3 = s9Var.f29087j;
        List list4 = s9Var.i;
        boolean z9 = s9Var.f29086h;
        String str2 = s9Var.f29085g;
        String str3 = s9Var.f29084f;
        String str4 = s9Var.e;
        boolean z10 = s9Var.f29083d;
        boolean z11 = s9Var.f29082c;
        a10.v(dVar, 0, str);
        a10.v(dVar, 1, s9Var.f29081b);
        if (a10.x(dVar) || z11) {
            a10.c(dVar, 2, z11);
        }
        if (a10.x(dVar) || z10) {
            a10.c(dVar, 3, z10);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str4, "bundled")) {
            a10.v(dVar, 4, str4);
        }
        if (a10.x(dVar) || str3 != null) {
            a10.q(dVar, 5, eg.b1.f16494a, str3);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str2, "")) {
            a10.v(dVar, 6, str2);
        }
        if (a10.x(dVar) || z9) {
            a10.c(dVar, 7, z9);
        }
        boolean x9 = a10.x(dVar);
        qe.s sVar = qe.s.f24023u;
        if (x9 || !kotlin.jvm.internal.l.a(list4, sVar)) {
            a10.r(dVar, 8, (ag.a) gVarArr[8].getValue(), list4);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(list3, sVar)) {
            a10.r(dVar, 9, (ag.a) gVarArr[9].getValue(), list3);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(list2, sVar)) {
            a10.r(dVar, 10, (ag.a) gVarArr[10].getValue(), list2);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(list, sVar)) {
            a10.r(dVar, 11, (ag.a) gVarArr[11].getValue(), list);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 12, z3);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        pe.g[] gVarArr = s9.f29079n;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        String str2 = null;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z3 = true;
        int i = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
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
                    z9 = k3.c(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    z10 = k3.c(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = k3.B(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) k3.w(dVar, 5, eg.b1.f16494a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = k3.B(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    z11 = k3.c(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) k3.s(dVar, 8, (ag.a) gVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    list2 = (List) k3.s(dVar, 9, (ag.a) gVarArr[9].getValue(), list2);
                    i |= 512;
                    break;
                case 10:
                    list3 = (List) k3.s(dVar, 10, (ag.a) gVarArr[10].getValue(), list3);
                    i |= 1024;
                    break;
                case 11:
                    list4 = (List) k3.s(dVar, 11, (ag.a) gVarArr[11].getValue(), list4);
                    i |= 2048;
                    break;
                case 12:
                    z12 = k3.c(dVar, 12);
                    i |= 4096;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new s9(i, str, str2, z9, z10, str3, str4, str5, z11, list, list2, list3, list4, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eg.y
    public final ag.a[] c() {
        pe.g[] gVarArr = s9.f29079n;
        eg.b1 b1Var = eg.b1.f16494a;
        eg.f fVar = eg.f.f16510a;
        return new ag.a[]{b1Var, b1Var, fVar, fVar, b1Var, va.a(b1Var), b1Var, fVar, gVarArr[8].getValue(), gVarArr[9].getValue(), gVarArr[10].getValue(), gVarArr[11].getValue(), fVar};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}