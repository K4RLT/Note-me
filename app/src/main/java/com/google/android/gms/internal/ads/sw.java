package com.google.android.gms.internal.ads;
import la.a;

import android.content.Context;

/* loaded from: classes.dex */
public final class sw implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11179a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f11180b;

    /* renamed from: c, reason: collision with root package name */
    public final tr1 f11181c;

    public sw(tr1 tr1Var, rr1 rr1Var) {
        this.f11179a = 0;
        this.f11181c = tr1Var;
        this.f11180b = rr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f11179a) {
            case 0:
                return new x90((la.a) this.f11181c.f11431a, 5, (qw) this.f11180b.zzb());
            case 1:
                return new rd0((jj) this.f11180b.zzb(), (bp0) this.f11181c.f11431a);
            case 2:
                Context context = (Context) this.f11180b.zzb();
                b20 b20Var = (b20) this.f11181c.f11431a;
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new oi0(context, b20Var, wxVar, 0);
            case 3:
                return new qi0((Context) this.f11180b.zzb(), (b20) this.f11181c.f11431a, 0);
            case 4:
                return new vi0((Context) this.f11180b.zzb(), (d20) this.f11181c.f11431a);
            case 5:
                return new qi0((Context) this.f11180b.zzb(), (h20) this.f11181c.f11431a, 1);
            default:
                return new qi0((Context) this.f11180b.zzb(), (k20) this.f11181c.f11431a, 2);
        }
    }

    public /* synthetic */ sw(rr1 rr1Var, tr1 tr1Var, int i) {
        this.f11179a = i;
        this.f11180b = rr1Var;
        this.f11181c = tr1Var;
    }
}
