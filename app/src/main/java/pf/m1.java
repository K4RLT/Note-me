package pf;

import ya.rc;

/* loaded from: classes.dex */
public final class m1 extends r1 {

    /* renamed from: x, reason: collision with root package name */
    public final te.c f22771x;

    public m1(te.g gVar, df.p pVar) {
        super(gVar, false);
        this.f22771x = rc.a(pVar, this, this);
    }

    @Override // pf.k1
    public final void c0() {
        try {
            uf.a.h(pe.z.f22715a, rc.b(this.f22771x));
        } catch (Throwable th) {
            resumeWith(new pe.k(th));
            throw th;
        }
    }
}
