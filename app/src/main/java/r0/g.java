package r0;

import ya.lc;

/* loaded from: classes.dex */
public final class g implements te.e {

    /* renamed from: u, reason: collision with root package name */
    public static final v0 f24252u = new v0(5);

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
        return f24252u;
    }
}
