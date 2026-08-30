package pf;

import ya.lc;

/* loaded from: classes.dex */
public final class a2 implements te.e, te.f {

    /* renamed from: u, reason: collision with root package name */
    public static final a2 f22722u = new Object();

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
        return this;
    }
}
