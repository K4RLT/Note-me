package h0;

import b2.a2;
import b2.g1;
import b2.h2;
import b2.k;
import b2.m;
import b8.s;
import i1.e;
import i1.p;
import i1.r;
import v1.d0;
import v1.h0;
import v1.l;
import y2.c;

/* loaded from: classes.dex */
public final class a extends k implements a2, e, p {
    public df.a K;
    public boolean L;
    public final h0 M;

    public a(df.a aVar) {
        this.K = aVar;
        s sVar = new s(2, this);
        v1.k kVar = d0.f27293a;
        h0 h0Var = new h0(null, null, null, sVar);
        Y0(h0Var);
        this.M = h0Var;
    }

    @Override // b2.a2
    public final void H(v1.k kVar, l lVar, long j10) {
        this.M.H(kVar, lVar, j10);
    }

    @Override // i1.e
    public final void L0(r rVar) {
        this.L = rVar.b();
    }

    @Override // b2.a2
    public final void O() {
        this.M.O();
    }

    @Override // b2.a2
    public final long l() {
        m mVar = androidx.compose.foundation.text.handwriting.a.f547a;
        c cVar = b2.l.u(this).S;
        mVar.getClass();
        int i = h2.f1476b;
        return g1.c(cVar.t0(mVar.f1536a), cVar.t0(mVar.f1537b), cVar.t0(mVar.f1538c), cVar.t0(mVar.f1539d));
    }
}
