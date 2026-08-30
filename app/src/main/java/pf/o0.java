package pf;

/* loaded from: classes.dex */
public final class o0 extends g1 {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f22774y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f22775z;

    public /* synthetic */ o0(int i, Object obj) {
        this.f22774y = i;
        this.f22775z = obj;
    }

    @Override // pf.g1
    public final boolean k() {
        switch (this.f22774y) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // pf.g1
    public final void l(Throwable th) {
        switch (this.f22774y) {
            case 0:
                ((n0) this.f22775z).a();
                return;
            case 1:
                ((df.l) this.f22775z).invoke(th);
                return;
            default:
                Object obj = k1.f22762u.get(j());
                boolean z3 = obj instanceof t;
                h1 h1Var = (h1) this.f22775z;
                if (z3) {
                    h1Var.resumeWith(pe.a.b(((t) obj).f22793a));
                    return;
                } else {
                    h1Var.resumeWith(b0.H(obj));
                    return;
                }
        }
    }
}
