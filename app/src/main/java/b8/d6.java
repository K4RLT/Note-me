package b8;
import b8.d6;
import l.a;

/* loaded from: classes.dex */
public final /* synthetic */ class d6 implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final d6 f1980a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, b8.d6, java.lang.Object] */
    static {
        Object obj = new Object();
        f1980a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.universe.UniverseAccount.TokenResponse", obj, 4);
        r0Var.k("access_token", true);
        r0Var.k("refresh_token", true);
        r0Var.k("expires_in", true);
        r0Var.k("user", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        f6 f6Var = (f6) obj;
        f6Var.getClass();
        i6 i6Var = f6Var.f2083d;
        long j10 = f6Var.f2082c;
        String str = f6Var.f2081b;
        String str2 = f6Var.f2080a;
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str2, "")) {
            a10.v(dVar, 0, str2);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.a(str, "")) {
            a10.v(dVar, 1, str);
        }
        if (a10.x(dVar) || j10 != 3600) {
            a10.o(dVar, 2, j10);
        }
        if (a10.x(dVar) || i6Var != null) {
            a10.q(dVar, 3, g6.f2126a, i6Var);
        }
        a10.w(dVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        cg.d dVar = descriptor;
        dg.a k3 = bVar.k(dVar);
        int i = 0;
        String str = null;
        String str2 = null;
        i6 i6Var = null;
        long j10 = 0;
        boolean z3 = true;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 != 1) {
                        if (t3 != 2) {
                            if (t3 == 3) {
                                i6Var = (i6) k3.w(dVar, 3, g6.f2126a, i6Var);
                                i |= 8;
                            } else {
                                throw new ag.e(t3);
                            }
                        } else {
                            j10 = k3.e(dVar, 2);
                            i |= 4;
                        }
                    } else {
                        str2 = k3.B(dVar, 1);
                        i |= 2;
                    }
                } else {
                    str = k3.B(dVar, 0);
                    i |= 1;
                }
            } else {
                z3 = false;
            }
        }
        k3.f(dVar);
        return new f6(i, str, str2, j10, i6Var);
    }

    @Override // eg.y
    public final ag.a[] c() {
        ag.a a10 = va.r.a(g6.f2126a);
        eg.b1 b1Var = eg.b1.f16494a;
        return new ag.a[]{b1Var, b1Var, eg.k0.f16535a, a10};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}