package com.google.android.gms.internal.ads;
import ac.b;
import c7.x;
import f9.k;
import g9.p;
import g9.r;
import r.e;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class eq0 {

    /* renamed from: a, reason: collision with root package name */
    public final qp0 f5755a;

    /* renamed from: b, reason: collision with root package name */
    public final sp0 f5756b;

    /* renamed from: c, reason: collision with root package name */
    public final xs0 f5757c;

    /* renamed from: d, reason: collision with root package name */
    public final vs0 f5758d;
    public final ur0 e;

    /* renamed from: f, reason: collision with root package name */
    public final g30 f5759f;

    public eq0(xs0 xs0Var, vs0 vs0Var, qp0 qp0Var, sp0 sp0Var, g30 g30Var, ur0 ur0Var) {
        this.f5755a = qp0Var;
        this.f5756b = sp0Var;
        this.f5757c = xs0Var;
        this.f5758d = vs0Var;
        this.f5759f = g30Var;
        this.e = ur0Var;
    }

    public final void a(ArrayList arrayList, s70 s70Var) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            qp0 qp0Var = this.f5755a;
            if (!qp0Var.f9939i0) {
                ur0 ur0Var = this.e;
                this.f5757c.b(str, qp0Var.f9967x0, ur0Var, s70Var);
            } else {
                String str2 = this.f5756b.f11091b;
                vs0 vs0Var = this.f5758d;
                vs0Var.getClass();
                f9.k.C.f16819k.getClass();
                rb rbVar = new rb(2, System.currentTimeMillis(), str2, str);
                rh0 rh0Var = vs0Var.f11978a;
                rh0Var.getClass();
                rh0Var.f(new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(rh0Var, 7, rbVar));
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        ac.b e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            if (((Boolean) g9.r.e.f17698c.a(sl.f10986vb)).booleanValue() && g30.b(str)) {
                e = this.f5759f.a(str, g9.p.f17688g.e);
            } else {
                e = ed1.e(str);
            }
            c7.x xVar = new c7.x(this, i, 7);
            e.a(new t81(e, 0, xVar), xx.f12651a);
        }
    }
}
