package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kw extends yv {

    /* renamed from: u, reason: collision with root package name */
    public e7.m f7892u;

    /* renamed from: v, reason: collision with root package name */
    public z8.o f7893v;

    @Override // com.google.android.gms.internal.ads.zv
    public final void B(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void C1(g9.y1 y1Var) {
        e7.m mVar = this.f7892u;
        if (mVar != null) {
            z8.a a10 = y1Var.a();
            mVar.getClass();
            e7.o.f15979f.removeCallbacks(mVar.f15964f);
            wd0.o("rewarded no se pudo mostrar: ", a10.f31970b, "AdsManager");
            e7.o.f(mVar.i, mVar.f15967j, mVar.f15966h, mVar.e, mVar.f15965g, mVar.f15968k);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void K1(sv svVar) {
        z8.o oVar = this.f7893v;
        if (oVar != null) {
            oVar.h(new fp(13));
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void a() {
        e7.m mVar = this.f7892u;
        if (mVar != null) {
            mVar.f15963d.f19783u = true;
            mVar.e.f19783u = true;
            e7.o.f15979f.removeCallbacks(mVar.f15964f);
            f7.c.i("ad_shown", f7.c.c(new pe.j("surface", mVar.f15965g)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void b() {
        e7.m mVar = this.f7892u;
        if (mVar != null) {
            String str = mVar.f15965g;
            e7.o.f15979f.removeCallbacks(mVar.f15964f);
            kotlin.jvm.internal.u uVar = mVar.f15966h;
            if (uVar.f19783u) {
                f7.c.i("ad_reward", f7.c.c(new pe.j("surface", str)));
            }
            e7.o.f(mVar.i, mVar.f15967j, uVar, mVar.e, str, mVar.f15968k);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void i() {
    }
}
