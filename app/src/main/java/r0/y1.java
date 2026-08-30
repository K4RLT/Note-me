package r0;
import b0.h;
import c1.c;
import r0.v1;

/* loaded from: classes.dex */
public final class y1 implements pf.z, v1 {

    /* renamed from: x, reason: collision with root package name */
    public static final g f24438x = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final te.g f24439u;

    /* renamed from: v, reason: collision with root package name */
    public final y1 f24440v = this;

    /* renamed from: w, reason: collision with root package name */
    public volatile te.g f24441w;

    public y1(te.g gVar) {
        this.f24439u = gVar;
    }

    @Override // pf.z
    public final te.g A() {
        te.g gVar;
        te.g gVar2;
        te.g gVar3 = this.f24441w;
        if (gVar3 == null || gVar3 == f24438x) {
            c cVar = (c) this.f24439u.L(c.f3445v);
            if (cVar != null) {
                gVar = new x1(cVar, this);
            } else {
                gVar = te.h.f25707u;
            }
            synchronized (this.f24440v) {
                try {
                    te.g gVar4 = this.f24441w;
                    if (gVar4 == null) {
                        te.g gVar5 = this.f24439u;
                        gVar2 = gVar5.V(new pf.f1((pf.d1) gVar5.L(pf.w.f22803v))).V(te.h.f25707u).V(gVar);
                    } else if (gVar4 == f24438x) {
                        te.g gVar6 = this.f24439u;
                        pf.f1 f1Var = new pf.f1((pf.d1) gVar6.L(pf.w.f22803v));
                        f1Var.u(new l0(0));
                        gVar2 = gVar6.V(f1Var).V(te.h.f25707u).V(gVar);
                    } else {
                        gVar2 = gVar4;
                    }
                    this.f24441w = gVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            gVar3 = gVar2;
        }
        gVar3.getClass();
        return gVar3;
    }

    @Override // v1
    public final void a() {
        c();
    }

    @Override // v1
    public final void b() {
        c();
    }

    public final void c() {
        synchronized (this.f24440v) {
            try {
                te.g gVar = this.f24441w;
                if (gVar == null) {
                    this.f24441w = f24438x;
                } else {
                    pf.h(gVar, new l0(0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v1
    public final void d() {
    }
}
