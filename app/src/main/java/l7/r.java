package l7;
import l.a;

import eg.b1;
import eg.e0;
import eg.r0;
import eg.x;
import eg.y;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final r f20005a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, java.lang.Object, l7.r] */
    static {
        Object obj = new Object();
        f20005a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.payload.TextPayload", obj, 14);
        r0Var.k("text", false);
        r0Var.k("colorArgb", false);
        r0Var.k("fontSizeSp", false);
        r0Var.k("fontFamily", true);
        r0Var.k("bold", true);
        r0Var.k("italic", true);
        r0Var.k("align", true);
        r0Var.k("visible", true);
        r0Var.k("locked", true);
        r0Var.k("name", true);
        r0Var.k("boxWFrac", true);
        r0Var.k("effect", true);
        r0Var.k("effectColorArgb", true);
        r0Var.k("effectAmount", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        t tVar2 = (t) obj;
        tVar2.getClass();
        float f10 = tVar2.f20017n;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        String str = tVar2.f20006a;
        int i = tVar2.f20016m;
        String str2 = tVar2.f20015l;
        Float f11 = tVar2.f20014k;
        String str3 = tVar2.f20013j;
        boolean z3 = tVar2.i;
        boolean z9 = tVar2.f20012h;
        int i10 = tVar2.f20011g;
        boolean z10 = tVar2.f20010f;
        boolean z11 = tVar2.e;
        String str4 = tVar2.f20009d;
        a10.v(dVar, 0, str);
        a10.m(1, tVar2.f20007b, dVar);
        a10.i(dVar, 2, tVar2.f20008c);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str4, "default")) {
            a10.v(dVar, 3, str4);
        }
        if (a10.x(dVar) || z11) {
            a10.c(dVar, 4, z11);
        }
        if (a10.x(dVar) || z10) {
            a10.c(dVar, 5, z10);
        }
        if (a10.x(dVar) || i10 != 0) {
            a10.m(6, i10, dVar);
        }
        if (a10.x(dVar) || !z9) {
            a10.c(dVar, 7, z9);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 8, z3);
        }
        if (a10.x(dVar) || str3 != null) {
            a10.q(dVar, 9, b1.f16494a, str3);
        }
        if (a10.x(dVar) || f11 != null) {
            a10.q(dVar, 10, x.f16594a, f11);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str2, "none")) {
            a10.v(dVar, 11, str2);
        }
        if (a10.x(dVar) || i != -1) {
            a10.m(12, i, dVar);
        }
        if (a10.x(dVar) || Float.compare(f10, 0.5f) != 0) {
            a10.i(dVar, 13, f10);
        }
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
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z3 = true;
        int i = 0;
        int i10 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        Float f12 = null;
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
                    i10 = k3.m(dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    f10 = k3.d(dVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = k3.B(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z9 = k3.c(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    z10 = k3.c(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i11 = k3.m(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    z11 = k3.c(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    z12 = k3.c(dVar, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) k3.w(dVar, 9, b1.f16494a, str);
                    i |= 512;
                    break;
                case 10:
                    f12 = (Float) k3.w(dVar, 10, x.f16594a, f12);
                    i |= 1024;
                    break;
                case 11:
                    str4 = k3.B(dVar, 11);
                    i |= 2048;
                    break;
                case 12:
                    i12 = k3.m(dVar, 12);
                    i |= 4096;
                    break;
                case 13:
                    f11 = k3.d(dVar, 13);
                    i |= 8192;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new t(i, str2, i10, f10, str3, z9, z10, i11, z11, z12, str, f12, str4, i12, f11);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        x xVar = x.f16594a;
        ag.a a10 = va.a(b1Var);
        ag.a a11 = va.a(xVar);
        e0 e0Var = e0.f16506a;
        eg.f fVar = eg.f.f16510a;
        return new ag.a[]{b1Var, e0Var, xVar, b1Var, fVar, fVar, e0Var, fVar, fVar, a10, a11, b1Var, e0Var, xVar};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}