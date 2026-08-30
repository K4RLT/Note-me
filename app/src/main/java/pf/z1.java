package pf;

/* loaded from: classes.dex */
public final class z1 extends uf.q {
    private volatile boolean threadLocalIsSet;

    /* renamed from: y, reason: collision with root package name */
    public final ThreadLocal f22814y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z1(te.c r3, te.g r4) {
        /*
            r2 = this;
            pf.a2 r0 = pf.a2.f22722u
            te.e r1 = r4.L(r0)
            if (r1 != 0) goto Ld
            te.g r0 = r4.V(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f22814y = r0
            te.g r3 = r3.getContext()
            te.d r0 = te.d.f25706u
            te.e r3 = r3.L(r0)
            boolean r3 = r3 instanceof pf.v
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = uf.a.l(r4, r3)
            uf.a.g(r4, r3)
            r2.n0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.z1.<init>(te.c, te.g):void");
    }

    public final boolean m0() {
        boolean z3;
        if (this.threadLocalIsSet && this.f22814y.get() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f22814y.remove();
        return !z3;
    }

    public final void n0(te.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f22814y.set(new pe.j(gVar, obj));
    }

    @Override // uf.q, pf.k1
    public final void s(Object obj) {
        if (this.threadLocalIsSet) {
            pe.j jVar = (pe.j) this.f22814y.get();
            if (jVar != null) {
                uf.a.g((te.g) jVar.f22693u, jVar.f22694v);
            }
            this.f22814y.remove();
        }
        Object A = b0.A(obj);
        te.c cVar = this.f27237x;
        te.g context = cVar.getContext();
        z1 z1Var = null;
        Object l10 = uf.a.l(context, null);
        if (l10 != uf.a.f27205d) {
            z1Var = b0.I(cVar, context, l10);
        }
        try {
            this.f27237x.resumeWith(A);
            if (z1Var != null && !z1Var.m0()) {
                return;
            }
            uf.a.g(context, l10);
        } catch (Throwable th) {
            if (z1Var == null || z1Var.m0()) {
                uf.a.g(context, l10);
            }
            throw th;
        }
    }
}
