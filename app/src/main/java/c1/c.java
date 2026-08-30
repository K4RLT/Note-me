package c1;

import df.p;
import java.util.List;
import r0.r;
import s0.j0;
import ya.lc;

/* loaded from: classes.dex */
public final class c implements j0, te.e {

    /* renamed from: v, reason: collision with root package name */
    public static final ed.e f3445v = new ed.e(7);

    /* renamed from: u, reason: collision with root package name */
    public final r f3446u;

    public c(r rVar) {
        this.f3446u = rVar;
    }

    @Override // te.g
    public final Object H(p pVar, Object obj) {
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

    @Override // s0.j0
    public final List a(Integer num) {
        return this.f3446u.H();
    }

    @Override // te.e
    public final te.f getKey() {
        return f3445v;
    }
}
