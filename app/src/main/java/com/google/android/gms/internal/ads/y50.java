package com.google.android.gms.internal.ads;
import k9.g;
import l9.a;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class y50 implements f31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12780d;

    public /* synthetic */ y50(int i, Object obj, Object obj2, Object obj3) {
        this.f12777a = i;
        this.f12778b = obj;
        this.f12779c = obj2;
        this.f12780d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object apply(Object obj) {
        switch (this.f12777a) {
            case 0:
                qp0 qp0Var = (qp0) obj;
                g gVar = new g((Context) this.f12778b);
                gVar.f19688c = qp0Var.B;
                gVar.f19690f = qp0Var.C.toString();
                gVar.e = ((a) this.f12779c).f20029u;
                gVar.f19689d = ((aq0) this.f12780d).f4583g;
                return gVar;
            case 1:
                h00 h00Var = (h00) this.f12778b;
                if (((qp0) this.f12779c).M) {
                    h00Var.B0();
                }
                z10 z10Var = (z10) this.f12780d;
                h00Var.l1();
                h00Var.onPause();
                return z10Var.l0();
            case 2:
                h00 h00Var2 = (h00) this.f12778b;
                if (((qp0) this.f12779c).M) {
                    h00Var2.B0();
                }
                g20 g20Var = (g20) this.f12780d;
                h00Var2.l1();
                h00Var2.onPause();
                return g20Var.l0();
            default:
                h00 h00Var3 = (h00) this.f12778b;
                if (((qp0) this.f12779c).M) {
                    h00Var3.B0();
                }
                j20 j20Var = (j20) this.f12780d;
                h00Var3.l1();
                h00Var3.onPause();
                return j20Var.l0();
        }
    }
}
