package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class au0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f4614u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e40 f4615v;

    public au0(e40 e40Var, float f10) {
        this.f4614u = f10;
        this.f4615v = e40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ku0 ku0Var = ((bu0) this.f4615v.f5589v).f4881g;
        float f10 = this.f4614u;
        ku0Var.f7878a = f10;
        if (ku0Var.f7880c == null) {
            ku0Var.f7880c = eu0.f5810c;
        }
        Iterator it = Collections.unmodifiableCollection(ku0Var.f7880c.f5812b).iterator();
        while (it.hasNext()) {
            nu0 nu0Var = ((tt0) it.next()).f11440d;
            s6.A.C(nu0Var.c(), "setDeviceVolume", Float.valueOf(f10), nu0Var.f8867a);
        }
    }
}
