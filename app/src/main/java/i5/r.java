package i5;

import ya.lc;

/* loaded from: classes.dex */
public final class r implements te.e {

    /* renamed from: v, reason: collision with root package name */
    public static final eb.x f18282v = new eb.x(23);

    /* renamed from: u, reason: collision with root package name */
    public final q f18283u;

    public r(q qVar) {
        this.f18283u = qVar;
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
        return f18282v;
    }
}
