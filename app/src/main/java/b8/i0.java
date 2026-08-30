package b8;
import b8.i0;
import l.a;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f2183a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [b8.i0, eg.y, java.lang.Object] */
    static {
        Object obj = new Object();
        f2183a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.Certificates.Certificate", obj, 9);
        r0Var.k("notebookId", true);
        r0Var.k("recipeId", true);
        r0Var.k("title", true);
        r0Var.k("serial", true);
        r0Var.k("fromPlay", true);
        r0Var.k("purchasedAt", true);
        r0Var.k("productId", true);
        r0Var.k("price", true);
        r0Var.k("device", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        k0 k0Var = (k0) obj;
        k0Var.getClass();
        String str = k0Var.i;
        String str2 = k0Var.f2293h;
        String str3 = k0Var.f2292g;
        long j10 = k0Var.f2291f;
        boolean z3 = k0Var.e;
        String str4 = k0Var.f2290d;
        String str5 = k0Var.f2289c;
        String str6 = k0Var.f2288b;
        String str7 = k0Var.f2287a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str7, "")) {
            a10.v(dVar, 0, str7);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str6, "")) {
            a10.v(dVar, 1, str6);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str5, "")) {
            a10.v(dVar, 2, str5);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str4, "")) {
            a10.v(dVar, 3, str4);
        }
        if (a10.x(dVar) || z3) {
            a10.c(dVar, 4, z3);
        }
        if (a10.x(dVar) || j10 != 0) {
            a10.o(dVar, 5, j10);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str3, "")) {
            a10.v(dVar, 6, str3);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str2, "")) {
            a10.v(dVar, 7, str2);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str, "")) {
            a10.v(dVar, 8, str);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        boolean z3 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j10 = 0;
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
                    str4 = k3.B(dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = k3.c(dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    j10 = k3.e(dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = k3.B(dVar, 6);
                    i |= 64;
                    break;
                case 7:
                    str6 = k3.B(dVar, 7);
                    i |= 128;
                    break;
                case 8:
                    str7 = k3.B(dVar, 8);
                    i |= 256;
                    break;
                default:
                    throw new ag.e(t3);
            }
        }
        k3.f(dVar);
        return new k0(i, str, str2, str3, str4, z3, j10, str5, str6, str7);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        return new ag.a[]{b1Var, b1Var, b1Var, b1Var, eg.f.f16510a, eg.k0.f16535a, b1Var, b1Var, b1Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}