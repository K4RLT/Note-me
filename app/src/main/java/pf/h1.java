package pf;

/* loaded from: classes.dex */
public final class h1 extends l {
    public final k1 C;

    public h1(te.c cVar, k1 k1Var) {
        super(1, cVar);
        this.C = k1Var;
    }

    @Override // pf.l
    public final Throwable q(k1 k1Var) {
        Throwable b10;
        k1 k1Var2 = this.C;
        k1Var2.getClass();
        Object obj = k1.f22762u.get(k1Var2);
        if ((obj instanceof j1) && (b10 = ((j1) obj).b()) != null) {
            return b10;
        }
        if (obj instanceof t) {
            return ((t) obj).f22793a;
        }
        return k1Var.r();
    }

    @Override // pf.l
    public final String z() {
        return "AwaitContinuation";
    }
}
