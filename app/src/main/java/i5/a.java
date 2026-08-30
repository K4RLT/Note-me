package i5;

import ya.lc;

/* loaded from: classes.dex */
public final class a implements te.e {

    /* renamed from: u, reason: collision with root package name */
    public final te.f f18207u;

    /* renamed from: v, reason: collision with root package name */
    public final c0 f18208v;

    public a(te.f fVar, c0 c0Var) {
        c0Var.getClass();
        this.f18207u = fVar;
        this.f18208v = c0Var;
    }

    @Override // te.g
    public final Object H(df.p pVar, Object obj) {
        return pVar.invoke(obj, this);
    }

    @Override // te.g
    public final te.e L(te.f fVar) {
        return lc.a(this, fVar);
    }

    @Override // te.g
    public final te.g N(te.f fVar) {
        return lc.b(this, fVar);
    }

    @Override // te.g
    public final te.g V(te.g gVar) {
        return lc.c(this, gVar);
    }

    @Override // te.e
    public final te.f getKey() {
        return this.f18207u;
    }
}
