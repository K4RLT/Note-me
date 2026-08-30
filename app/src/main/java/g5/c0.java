package g5;

import ya.lc;

/* loaded from: classes.dex */
public final class c0 implements te.e {

    /* renamed from: v, reason: collision with root package name */
    public static final b0 f17425v = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final pf.v f17426u;

    public c0(pf.v vVar) {
        this.f17426u = vVar;
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
        return f17425v;
    }
}
