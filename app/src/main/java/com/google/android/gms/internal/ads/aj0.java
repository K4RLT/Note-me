package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class aj0 extends ov implements h70 {

    /* renamed from: u, reason: collision with root package name */
    public bk0 f4522u;

    /* renamed from: v, reason: collision with root package name */
    public mf f4523v;

    /* renamed from: w, reason: collision with root package name */
    public tw f4524w;

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void B1(oa.a aVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4816w.P1(f70.f5957y);
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void C3(oa.a aVar, qv qvVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4817x.K(qvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void J0(oa.a aVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4817x.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void Q(oa.a aVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4814u.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void T2(oa.a aVar, int i) {
        mf mfVar = this.f4523v;
        if (mfVar != null) {
            mfVar.f(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void U1(oa.a aVar) {
        mf mfVar = this.f4523v;
        if (mfVar != null) {
            synchronized (mfVar) {
                ((yx) mfVar.f8338w).b(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void a1(oa.a aVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4817x.K(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void a2() {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4816w.U1();
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void c0(oa.a aVar) {
        tw twVar = this.f4524w;
        if (twVar != null) {
            gi0 gi0Var = (gi0) twVar.f11472x;
            int i = 8;
            ((wj0) twVar.f11473y).f12252c.execute(new r1(i, (wp0) twVar.f11470v, (qp0) twVar.f11471w, gi0Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void g4(oa.a aVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.g4(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void h3(oa.a aVar) {
        bk0 bk0Var = this.f4522u;
        if (bk0Var != null) {
            bk0Var.f4815v.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final synchronized void v1(mf mfVar) {
        this.f4523v = mfVar;
    }

    @Override // com.google.android.gms.internal.ads.pv
    public final synchronized void x3() {
        tw twVar = this.f4524w;
        if (twVar != null) {
            String str = ((gi0) twVar.f11472x).f6406a;
            int i = k9.a0.f19634b;
            l9.i.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }
}
