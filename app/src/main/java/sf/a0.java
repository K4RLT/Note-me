package sf;

/* loaded from: classes.dex */
public final class a0 implements l0, g, tf.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n0 f25140u;

    public a0(n0 n0Var) {
        this.f25140u = n0Var;
    }

    @Override // tf.p
    public final g a(te.g gVar, int i, rf.a aVar) {
        if ((((i >= 0 && i < 2) || i == -2) && aVar == rf.a.f24770v) || ((i == 0 || i == -3) && aVar == rf.a.f24769u)) {
            return this;
        }
        return new tf.f(this, gVar, i, aVar);
    }

    @Override // sf.g
    public final Object b(h hVar, te.c cVar) {
        this.f25140u.b(hVar, cVar);
        return ue.a.f27192u;
    }

    @Override // sf.l0
    public final Object getValue() {
        return this.f25140u.getValue();
    }
}
