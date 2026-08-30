package pf;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: u, reason: collision with root package name */
    public final c[] f22738u;

    public d(c[] cVarArr) {
        this.f22738u = cVarArr;
    }

    public final void a() {
        for (c cVar : this.f22738u) {
            n0 n0Var = cVar.f22734z;
            if (n0Var != null) {
                n0Var.a();
            } else {
                kotlin.jvm.internal.l.h("handle");
                throw null;
            }
        }
    }

    @Override // pf.j
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f22738u + ']';
    }
}
