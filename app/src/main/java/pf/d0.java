package pf;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f22739a;

    static {
        String str;
        boolean z3;
        g0 g0Var;
        int i = uf.t.f27241a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z3 = Boolean.parseBoolean(str);
        } else {
            z3 = false;
        }
        if (!z3) {
            g0Var = c0.D;
        } else {
            wf.e eVar = l0.f22767a;
            qf.d dVar = uf.n.f27235a;
            qf.d dVar2 = dVar.f24037z;
            g0Var = dVar;
            if (dVar == null) {
                g0Var = c0.D;
            }
        }
        f22739a = g0Var;
    }
}
