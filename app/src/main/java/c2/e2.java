package c2;
import d1.t;
import r0.e1;

import ya.lc;

/* loaded from: classes.dex */
public final class e2 implements t {

    /* renamed from: u, reason: collision with root package name */
    public final e1 f3512u = new e1(1.0f);

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

    @Override // t
    public final float w() {
        return this.f3512u.h();
    }
}
