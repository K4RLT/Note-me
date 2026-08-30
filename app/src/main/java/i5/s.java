package i5;

/* loaded from: classes.dex */
public final class s implements b {

    /* renamed from: u, reason: collision with root package name */
    public final p5.b f18284u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18285v;

    /* renamed from: w, reason: collision with root package name */
    public final kotlin.jvm.internal.j f18286w;

    /* renamed from: x, reason: collision with root package name */
    public final pe.n f18287x = new pe.n(new a1.c(22, this));

    /* JADX WARN: Multi-variable type inference failed */
    public s(p5.b bVar, String str, df.p pVar) {
        this.f18284u = bVar;
        this.f18285v = str;
        this.f18286w = (kotlin.jvm.internal.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [df.p, kotlin.jvm.internal.j] */
    @Override // i5.b
    public final Object F(boolean z3, df.p pVar, ve.c cVar) {
        q qVar;
        r rVar = (r) cVar.getContext().L(r.f18282v);
        if (rVar != null) {
            qVar = rVar.f18283u;
        } else {
            qVar = null;
        }
        if (qVar != null) {
            return pVar.invoke(qVar, cVar);
        }
        q qVar2 = new q(this.f18286w, (p5.a) this.f18287x.getValue());
        return pf.b0.J(new r(qVar2), new b5.a(pVar, qVar2, (te.c) null), cVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        pe.n nVar = this.f18287x;
        if (nVar.f22701v != pe.w.f22712a) {
            ((p5.a) nVar.getValue()).close();
        }
    }
}
