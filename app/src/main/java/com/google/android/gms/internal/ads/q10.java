package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class q10 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9702a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f9703b;

    public /* synthetic */ q10(tw twVar, rr1 rr1Var, int i) {
        this.f9702a = i;
        this.f9703b = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Set set;
        int i = this.f9702a;
        rr1 rr1Var = this.f9703b;
        switch (i) {
            case 0:
                cf0 cf0Var = (cf0) rr1Var.zzb();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                if (((Boolean) g9.r.e.f17698c.a(sl.f10805k2)).booleanValue()) {
                    set = Collections.singleton(new c90(cf0Var, wxVar));
                } else {
                    set = Collections.EMPTY_SET;
                }
                lo1.b(set);
                return set;
            case 1:
                return new ej0((od0) rr1Var.zzb());
            case 2:
                return new zj0((od0) rr1Var.zzb());
            case 3:
                qc0 qc0Var = (qc0) rr1Var.zzb();
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new jq0(qc0Var, wxVar2);
            case 4:
                return new y20((Context) rr1Var.zzb());
            case 5:
                c90 c90Var = new c90((t40) rr1Var.zzb(), xx.f12657h);
                int i10 = j51.f7334w;
                return new k51(c90Var);
            case 6:
                Set singleton = Collections.singleton(new c90((t40) rr1Var.zzb(), xx.f12657h));
                lo1.b(singleton);
                return singleton;
            case 7:
                return new c90((q40) rr1Var.zzb(), xx.f12655f);
            case 8:
                return new c90((q40) rr1Var.zzb(), xx.f12655f);
            case 9:
                Set singleton2 = Collections.singleton(new c90((t40) rr1Var.zzb(), xx.f12657h));
                lo1.b(singleton2);
                return singleton2;
            case 10:
                x40 x40Var = (x40) rr1Var.zzb();
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new c90(x40Var, wxVar3);
            case 11:
                return new h50((g70) rr1Var.zzb());
            case 12:
                s70 s70Var = (s70) rr1Var.zzb();
                wx wxVar4 = xx.f12651a;
                lo1.b(wxVar4);
                return new c90(s70Var, wxVar4);
            case 13:
                s70 s70Var2 = (s70) rr1Var.zzb();
                wx wxVar5 = xx.f12651a;
                lo1.b(wxVar5);
                return new c90(s70Var2, wxVar5);
            case 14:
                return new c90((n50) rr1Var.zzb(), xx.f12657h);
            case 15:
                return new c90((n50) rr1Var.zzb(), xx.f12657h);
            case 16:
                return new c90((n50) rr1Var.zzb(), xx.f12657h);
            case 17:
                return new c90((n50) rr1Var.zzb(), xx.f12657h);
            case 18:
                return new c90((n50) rr1Var.zzb(), xx.f12657h);
            case 19:
                return new c90((n50) rr1Var.zzb(), xx.f12657h);
            case 20:
                c90 c90Var2 = new c90((p50) rr1Var.zzb(), xx.f12657h);
                int i11 = j51.f7334w;
                return new k51(c90Var2);
            case gl.zzm /* 21 */:
                c90 c90Var3 = new c90((p50) rr1Var.zzb(), xx.f12657h);
                int i12 = j51.f7334w;
                return new k51(c90Var3);
            case 22:
                h90 h90Var = (h90) rr1Var.zzb();
                wx wxVar6 = xx.f12651a;
                lo1.b(wxVar6);
                return new c90(h90Var, wxVar6);
            case 23:
                n30 n30Var = (n30) rr1Var.zzb();
                wx wxVar7 = xx.f12651a;
                lo1.b(wxVar7);
                return new c90(n30Var, wxVar7);
            case 24:
                n30 n30Var2 = (n30) rr1Var.zzb();
                wx wxVar8 = xx.f12651a;
                lo1.b(wxVar8);
                return new c90(n30Var2, wxVar8);
            case 25:
                n30 n30Var3 = (n30) rr1Var.zzb();
                wx wxVar9 = xx.f12651a;
                lo1.b(wxVar9);
                return new c90(n30Var3, wxVar9);
            case 26:
                n30 n30Var4 = (n30) rr1Var.zzb();
                wx wxVar10 = xx.f12651a;
                lo1.b(wxVar10);
                return new c90(n30Var4, wxVar10);
            case 27:
                n30 n30Var5 = (n30) rr1Var.zzb();
                wx wxVar11 = xx.f12651a;
                lo1.b(wxVar11);
                return new c90(n30Var5, wxVar11);
            case 28:
                n30 n30Var6 = (n30) rr1Var.zzb();
                wx wxVar12 = xx.f12651a;
                lo1.b(wxVar12);
                return new c90(n30Var6, wxVar12);
            default:
                n30 n30Var7 = (n30) rr1Var.zzb();
                wx wxVar13 = xx.f12651a;
                lo1.b(wxVar13);
                return new c90(n30Var7, wxVar13);
        }
    }

    public /* synthetic */ q10(rr1 rr1Var, int i) {
        this.f9702a = i;
        this.f9703b = rr1Var;
    }
}
