package w7;
import w7.na;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class na implements eg.y {

    /* renamed from: a, reason: collision with root package name */
    public static final na f28808a;
    private static final cg.d descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eg.y, w7.na, java.lang.Object] */
    static {
        Object obj = new Object();
        f28808a = obj;
        eg.r0 r0Var = new eg.r0("com.daren.scraply.ui.canvas.TapeDef", obj, 5);
        r0Var.k(FacebookMediationAdapter.KEY_ID, false);
        r0Var.k("file", true);
        r0Var.k("name", true);
        r0Var.k("color", true);
        r0Var.k("pattern", true);
        descriptor = r0Var;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        pa paVar = (pa) obj;
        paVar.getClass();
        cg.d dVar = descriptor;
        gg.t a10 = tVar.a(dVar);
        String str = paVar.f28920a;
        String str2 = paVar.e;
        String str3 = paVar.f28923d;
        String str4 = paVar.f28922c;
        String str5 = paVar.f28921b;
        a10.v(dVar, 0, str);
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str5, "")) {
            a10.v(dVar, 1, str5);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str4, "")) {
            a10.v(dVar, 2, str4);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str3, "")) {
            a10.v(dVar, 3, str3);
        }
        if (a10.x(dVar) || !kotlin.jvm.internal.l.a(str2, "")) {
            a10.v(dVar, 4, str2);
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
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z3 = true;
        while (z3) {
            int t3 = k3.t(dVar);
            if (t3 != -1) {
                if (t3 != 0) {
                    if (t3 != 1) {
                        if (t3 != 2) {
                            if (t3 != 3) {
                                if (t3 == 4) {
                                    str5 = k3.B(dVar, 4);
                                    i |= 16;
                                } else {
                                    throw new ag.e(t3);
                                }
                            } else {
                                str4 = k3.B(dVar, 3);
                                i |= 8;
                            }
                        } else {
                            str3 = k3.B(dVar, 2);
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
        return new pa(i, str, str2, str3, str4, str5);
    }

    @Override // eg.y
    public final ag.a[] c() {
        eg.b1 b1Var = eg.b1.f16494a;
        return new ag.a[]{b1Var, b1Var, b1Var, b1Var, b1Var};
    }

    @Override // ag.a
    public final cg.d d() {
        return descriptor;
    }
}