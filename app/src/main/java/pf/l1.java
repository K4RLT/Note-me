package pf;

import ya.rc;

/* loaded from: classes.dex */
public final class l1 extends f0 {

    /* renamed from: x, reason: collision with root package name */
    public final te.c f22768x;

    public l1(te.g gVar, df.p pVar) {
        super(gVar, false);
        this.f22768x = rc.a(pVar, this, this);
    }

    @Override // pf.k1
    public final void c0() {
        try {
            uf.a.h(pe.z.f22715a, rc.b(this.f22768x));
        } catch (Throwable th) {
            resumeWith(new pe.k(th));
            throw th;
        }
    }
}
