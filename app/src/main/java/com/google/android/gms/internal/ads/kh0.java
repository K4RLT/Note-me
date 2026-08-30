package com.google.android.gms.internal.ads;
import c7.f0;
import g9.r;
import g9.y1;
import k9.c0;
import r.e;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class kh0 implements k70, v60 {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f7751w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static int f7752x;

    /* renamed from: u, reason: collision with root package name */
    public final k9.c0 f7753u;

    /* renamed from: v, reason: collision with root package name */
    public final nh0 f7754v;

    public kh0(nh0 nh0Var, k9.c0 c0Var) {
        this.f7754v = nh0Var;
        this.f7753u = c0Var;
    }

    public final void a(boolean z3) {
        int i;
        int intValue;
        nl nlVar = sl.f10713e7;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && !this.f7753u.t()) {
            Object obj = f7751w;
            synchronized (obj) {
                i = f7752x;
                intValue = ((Integer) rVar.f17698c.a(sl.f10729f7)).intValue();
            }
            if (i < intValue) {
                nh0 nh0Var = this.f7754v;
                hr0 d2 = nh0Var.e.d(new Bundle());
                d2.a(new t81(d2, 0, new c7.f0(nh0Var, z3)), xx.f12657h);
                synchronized (obj) {
                    f7752x++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(g9.y1 y1Var) {
        a(false);
    }
}
