package q;
import c0.d0;
import r0.a1;
import r0.i1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import t0.e;

import b8.l2;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f22890a = new e(new e0[16]);

    /* renamed from: b, reason: collision with root package name */
    public final i1 f22891b = y.B(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public long f22892c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f22893d = y.B(Boolean.TRUE);

    public final void a(int i, m mVar) {
        int i10;
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-318043801);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            Object O = rVar.O();
            te.c cVar = null;
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(null);
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            if (!((Boolean) this.f22893d.getValue()).booleanValue() && !((Boolean) this.f22891b.getValue()).booleanValue()) {
                rVar.a0(1721270456);
                rVar.p(false);
            } else {
                rVar.a0(1719883733);
                boolean h3 = rVar.h(this);
                Object O2 = rVar.O();
                if (h3 || O2 == v0Var) {
                    O2 = new l2(a1Var, this, cVar, 13);
                    rVar.k0(O2);
                }
                y.f((df.p) O2, this, rVar);
                rVar.p(false);
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d0(this, i, 14);
        }
    }
}
