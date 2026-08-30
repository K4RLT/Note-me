package pf;

/* loaded from: classes.dex */
public final class i1 extends g1 {
    public final p A;
    public final Object B;

    /* renamed from: y, reason: collision with root package name */
    public final k1 f22755y;

    /* renamed from: z, reason: collision with root package name */
    public final j1 f22756z;

    public i1(k1 k1Var, j1 j1Var, p pVar, Object obj) {
        this.f22755y = k1Var;
        this.f22756z = j1Var;
        this.A = pVar;
        this.B = obj;
    }

    @Override // pf.g1
    public final boolean k() {
        return false;
    }

    @Override // pf.g1
    public final void l(Throwable th) {
        p pVar = this.A;
        p Z = k1.Z(pVar);
        k1 k1Var = this.f22755y;
        j1 j1Var = this.f22756z;
        Object obj = this.B;
        if (Z == null || !k1Var.i0(j1Var, Z, obj)) {
            j1Var.f22761u.c(new uf.i(2), 2);
            p Z2 = k1.Z(pVar);
            if (Z2 != null && k1Var.i0(j1Var, Z2, obj)) {
                return;
            }
            k1Var.q(k1Var.E(j1Var, obj));
        }
    }
}
