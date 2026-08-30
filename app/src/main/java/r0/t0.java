package r0;
import b0.b;
import b0.x;
import c1.c;
import n.a;
import r0.v1;

import java.util.concurrent.CancellationException;
import ya.lc;

/* loaded from: classes.dex */
public final class t0 implements v1, pf.x {

    /* renamed from: u, reason: collision with root package name */
    public final te.g f24382u;

    /* renamed from: v, reason: collision with root package name */
    public final df.p f24383v;

    /* renamed from: w, reason: collision with root package name */
    public final uf.c f24384w;

    /* renamed from: x, reason: collision with root package name */
    public pf.r1 f24385x;

    public t0(te.g gVar, df.p pVar) {
        te.g gVar2;
        this.f24382u = gVar;
        this.f24383v = pVar;
        if (gVar.L(c.f3445v) != null) {
            gVar2 = this;
        } else {
            gVar2 = te.h.f25707u;
        }
        this.f24384w = pf.b(gVar.V(gVar2));
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

    @Override // v1
    public final void a() {
        pf.r1 r1Var = this.f24385x;
        if (r1Var != null) {
            r1Var.v(new l0(1));
        }
        this.f24385x = null;
    }

    @Override // v1
    public final void b() {
        pf.r1 r1Var = this.f24385x;
        if (r1Var != null) {
            r1Var.v(new l0(1));
        }
        this.f24385x = null;
    }

    @Override // v1
    public final void d() {
        pf.r1 r1Var = this.f24385x;
        if (r1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            r1Var.j(cancellationException);
        }
        this.f24385x = pf.x(this.f24384w, null, this.f24383v, 3);
    }

    @Override // te.e
    public final te.f getKey() {
        return pf.w.f22802u;
    }

    @Override // pf.x
    public final void o(Throwable th, te.g gVar) {
        c cVar = (c) gVar.L(c.f3445v);
        if (cVar != null) {
            wa.a(th, new androidx.ink.brush.b(cVar, 5, this));
        }
        pf.x xVar = (pf.x) this.f24382u.L(pf.w.f22802u);
        if (xVar != null) {
            xVar.o(th, gVar);
            return;
        }
        throw th;
    }
}
