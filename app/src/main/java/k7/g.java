package k7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import eg.b1;
import eg.e0;
import eg.k0;
import eg.r0;
import eg.y;
import gg.t;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements y {

    /* renamed from: a, reason: collision with root package name */
    public static final g f19616a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, k7.g, java.lang.Object] */
    static {
        Object obj = new Object();
        f19616a = obj;
        r0 r0Var = new r0("com.daren.scraply.data.local.entity.StackEntity", obj, 5);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("title", false);
        r0Var.k("orderIndex", false);
        r0Var.k("createdAt", false);
        r0Var.k("updatedAt", false);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(t tVar, Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        cg.d dVar = descriptor;
        t a10 = tVar.a(dVar);
        a10.v(dVar, 0, iVar.f19617a);
        a10.v(dVar, 1, iVar.f19618b);
        a10.m(2, iVar.f19619c, dVar);
        a10.o(dVar, 3, iVar.f19620d);
        a10.o(dVar, 4, iVar.e);
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
        long j10 = 0;
        long j11 = 0;
        boolean z3 = true;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 != 1) {
                        if (t3 != 2) {
                            if (t3 != 3) {
                                if (t3 == 4) {
                                    j11 = k3.e(dVar, 4);
                                    i |= 16;
                                } else {
                                    throw new ag.e(t3);
                                }
                            } else {
                                j10 = k3.e(dVar, 3);
                                i |= 8;
                            }
                        } else {
                            i10 = k3.m(dVar, 2);
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
        return new i(i, str, str2, i10, j10, j11);
    }

    @Override // eg.y
    public final ag.a[] c() {
        b1 b1Var = b1.f16494a;
        k0 k0Var = k0.f16535a;
        return new ag.a[]{b1Var, b1Var, e0.f16506a, k0Var, k0Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}