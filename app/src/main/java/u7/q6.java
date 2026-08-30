package u7;
import l.a;
import u7.q6;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final q6 f26761a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, u7.q6] */
    static {
        Object obj = new Object();
        f26761a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.ui.book.OrnamentSpec", obj, 15);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("mesh", false);
        r0Var.k("tex", true);
        r0Var.k("normal", true);
        r0Var.k("anchor", true);
        r0Var.k("u", true);
        r0Var.k("v", true);
        r0Var.k("rotDeg", true);
        r0Var.k("scale", true);
        r0Var.k("argb", true);
        r0Var.k("metallic", true);
        r0Var.k("roughness", true);
        r0Var.k("slot", true);
        r0Var.k("packId", true);
        r0Var.k("name", true);
        descriptor = r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        if (kotlin.jvm.internal.a(r0, "") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
    
        if (kotlin.jvm.internal.a(r0, "") == false) goto L71;
     */
    @Override // ag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(gg.t r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.q6.a(gg.t, java.lang.Object):void");
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
        String str6 = null;
        String str7 = null;
        String str8 = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
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
                    str3 = (String) k3.w(dVar, 2, eg.b1.f16494a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) k3.w(dVar, 3, eg.b1.f16494a, str4);
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
                    f12 = k3.d(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    f13 = k3.d(dVar, 8);
                    i |= 256;
                    break;
                case 9:
                    i10 = k3.m(dVar, 9);
                    i |= 512;
                    break;
                case 10:
                    f14 = k3.d(dVar, 10);
                    i |= 1024;
                    break;
                case 11:
                    f15 = k3.d(dVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    str6 = k3.B(dVar, 12);
                    i |= 4096;
                    break;
                case 13:
                    str7 = k3.B(dVar, 13);
                    i |= 8192;
                    break;
                case 14:
                    str8 = k3.B(dVar, 14);
                    i |= 16384;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new s6(i, str, str2, str3, str4, str5, f10, f11, f12, f13, i10, f14, f15, str6, str7, str8);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        ag.a a10 = va.r.a(b1Var);
        ag.a a11 = va.r.a(b1Var);
        eg.x xVar = eg.x.f16594a;
        return new ag.a[]{b1Var, b1Var, a10, a11, b1Var, xVar, xVar, xVar, xVar, eg.e0.f16506a, xVar, xVar, b1Var, b1Var, b1Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}