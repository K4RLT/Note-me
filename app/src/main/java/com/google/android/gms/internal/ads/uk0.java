package com.google.android.gms.internal.ads;
import c9.a;
import c9.d;
import g9.c3;
import g9.d0;
import g9.f0;
import g9.g0;
import g9.w2;
import g9.x0;
import g9.x;
import n.r0;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uk0 extends f0 {

    /* renamed from: u, reason: collision with root package name */
    public final Context f11657u;

    /* renamed from: v, reason: collision with root package name */
    public final y10 f11658v;

    /* renamed from: w, reason: collision with root package name */
    public final zp0 f11659w;

    /* renamed from: x, reason: collision with root package name */
    public final a8 f11660x;

    /* renamed from: y, reason: collision with root package name */
    public x f11661y;

    public uk0(y10 y10Var, Context context, String str) {
        zp0 zp0Var = new zp0();
        this.f11659w = zp0Var;
        this.f11660x = new a8();
        this.f11658v = y10Var;
        zp0Var.f13228c = str;
        this.f11657u = context;
    }

    @Override // g0
    public final void K0(oq oqVar) {
        this.f11660x.f4409y = oqVar;
    }

    @Override // g0
    public final void T3(a aVar) {
        zp0 zp0Var = this.f11659w;
        zp0Var.f13233j = aVar;
        if (aVar != null) {
            zp0Var.e = aVar.f4006u;
        }
    }

    @Override // g0
    public final void X2(lq lqVar) {
        zp0 zp0Var = this.f11659w;
        zp0Var.f13237n = lqVar;
        zp0Var.f13229d = new w2(false, true, false);
    }

    @Override // g0
    public final d0 a() {
        a8 a8Var = this.f11660x;
        a8Var.getClass();
        wa0 wa0Var = new wa0(a8Var);
        ArrayList arrayList = new ArrayList();
        if (wa0Var.f12200c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (wa0Var.f12198a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (wa0Var.f12199b != null) {
            arrayList.add(Integer.toString(2));
        }
        r0 r0Var = wa0Var.f12202f;
        if (!r0Var.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (wa0Var.e != null) {
            arrayList.add(Integer.toString(7));
        }
        zp0 zp0Var = this.f11659w;
        zp0Var.f13230f = arrayList;
        ArrayList arrayList2 = new ArrayList(r0Var.f20934w);
        for (int i = 0; i < r0Var.f20934w; i++) {
            arrayList2.add((String) r0Var.g(i));
        }
        zp0Var.f13231g = arrayList2;
        if (zp0Var.f13227b == null) {
            zp0Var.f13227b = c3.a();
        }
        return new vk0(this.f11657u, this.f11658v, zp0Var, wa0Var, this.f11661y);
    }

    @Override // g0
    public final void f1(x xVar) {
        this.f11661y = xVar;
    }

    @Override // g0
    public final void i2(String str, qo qoVar, oo ooVar) {
        a8 a8Var = this.f11660x;
        ((r0) a8Var.f4410z).put(str, qoVar);
        if (ooVar != null) {
            ((r0) a8Var.A).put(str, ooVar);
        }
    }

    @Override // g0
    public final void i3(uo uoVar) {
        this.f11660x.f4407w = uoVar;
    }

    @Override // g0
    public final void k4(rn rnVar) {
        this.f11659w.f13232h = rnVar;
    }

    @Override // g0
    public final void l4(d dVar) {
        zp0 zp0Var = this.f11659w;
        zp0Var.f13234k = dVar;
        if (dVar != null) {
            zp0Var.e = dVar.f4013u;
            zp0Var.f13235l = dVar.f4014v;
        }
    }

    @Override // g0
    public final void q1(lo loVar) {
        this.f11660x.f4406v = loVar;
    }

    @Override // g0
    public final void w3(mo moVar) {
        this.f11660x.f4405u = moVar;
    }

    @Override // g0
    public final void x2(x0 x0Var) {
        this.f11659w.f13247x = x0Var;
    }

    @Override // g0
    public final void y2(so soVar, c3 c3Var) {
        this.f11660x.f4408x = soVar;
        this.f11659w.f13227b = c3Var;
    }
}
