package ya;
import s0.k0;

/* loaded from: classes.dex */
public abstract class sb {
    public static final void a(k0 k0Var, int i, Object obj) {
        k0Var.e[(k0Var.f24887f - k0Var.f24883a[k0Var.f24884b - 1].f24880b) + i] = obj;
    }

    public static final void b(k0 k0Var, int i, Object obj, int i10, Object obj2) {
        int i11 = k0Var.f24887f - k0Var.f24883a[k0Var.f24884b - 1].f24880b;
        Object[] objArr = k0Var.e;
        objArr[i + i11] = obj;
        objArr[i11 + i10] = obj2;
    }
}
