package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class qb1 implements pf1 {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9801u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f9802v = new ArrayList(1);

    /* renamed from: w, reason: collision with root package name */
    public int f9803w;

    /* renamed from: x, reason: collision with root package name */
    public dj1 f9804x;

    public qb1(boolean z3) {
        this.f9801u = z3;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void b(as1 as1Var) {
        as1Var.getClass();
        ArrayList arrayList = this.f9802v;
        if (!arrayList.contains(as1Var)) {
            arrayList.add(as1Var);
            this.f9803w++;
        }
    }

    public final void d(dj1 dj1Var) {
        for (int i = 0; i < this.f9803w; i++) {
            ((as1) this.f9802v.get(i)).getClass();
        }
    }

    public final void g(dj1 dj1Var) {
        this.f9804x = dj1Var;
        for (int i = 0; i < this.f9803w; i++) {
            ((as1) this.f9802v.get(i)).c(this, dj1Var, this.f9801u);
        }
    }

    public final void i(int i) {
        dj1 dj1Var = this.f9804x;
        String str = bq0.f4860a;
        for (int i10 = 0; i10 < this.f9803w; i10++) {
            ((as1) this.f9802v.get(i10)).k(dj1Var, this.f9801u, i);
        }
    }

    public final void j() {
        dj1 dj1Var = this.f9804x;
        String str = bq0.f4860a;
        for (int i = 0; i < this.f9803w; i++) {
            ((as1) this.f9802v.get(i)).e(dj1Var, this.f9801u);
        }
        this.f9804x = null;
    }
}
