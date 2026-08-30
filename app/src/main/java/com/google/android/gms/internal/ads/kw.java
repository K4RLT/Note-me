package com.google.android.gms.internal.ads;
import e7.m;
import e7.o;
import f7.c;
import g9.y1;
import pe.j;
import z8.a;
import z8.o;

/* loaded from: classes.dex */
public final class kw extends yv {

    /* renamed from: u, reason: collision with root package name */
    public m f7892u;

    /* renamed from: v, reason: collision with root package name */
    public o f7893v;

    @Override // com.google.android.gms.internal.ads.zv
    public final void B(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void C1(y1 y1Var) {
        m mVar = this.f7892u;
        if (mVar != null) {
            a a10 = y1Var.a();
            mVar.getClass();
            o.f15979f.removeCallbacks(mVar.f15964f);
            wd0.o("rewarded no se pudo mostrar: ", a10.f31970b, "AdsManager");
            o.f(mVar.i, mVar.f15967j, mVar.f15966h, mVar.e, mVar.f15965g, mVar.f15968k);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void K1(sv svVar) {
        o oVar = this.f7893v;
        if (oVar != null) {
            oVar.h(new fp(13));
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void a() {
        m mVar = this.f7892u;
        if (mVar != null) {
            mVar.f15963d.f19783u = true;
            mVar.e.f19783u = true;
            o.f15979f.removeCallbacks(mVar.f15964f);
            c.i("ad_shown", c.c(new j("surface", mVar.f15965g)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void b() {
        m mVar = this.f7892u;
        if (mVar != null) {
            String str = mVar.f15965g;
            o.f15979f.removeCallbacks(mVar.f15964f);
            kotlin.jvm.internal.u uVar = mVar.f15966h;
            if (uVar.f19783u) {
                c.i("ad_reward", c.c(new j("surface", str)));
            }
            o.f(mVar.i, mVar.f15967j, uVar, mVar.e, str, mVar.f15968k);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final void i() {
    }
}
