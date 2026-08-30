package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ti0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11348a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f11349b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f11350c;

    /* renamed from: d, reason: collision with root package name */
    public final tr1 f11351d;

    public /* synthetic */ ti0(rr1 rr1Var, tr1 tr1Var, wr1 wr1Var, int i) {
        this.f11348a = i;
        this.f11349b = rr1Var;
        this.f11351d = tr1Var;
        this.f11350c = wr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f11348a) {
            case 0:
                return new oi0((Context) this.f11349b.zzb(), (d20) this.f11351d.f11431a, (Executor) this.f11350c.zzb(), 1);
            case 1:
                Context context = (Context) this.f11349b.zzb();
                l9.a a10 = ((u10) this.f11350c).a();
                h20 h20Var = (h20) this.f11351d.f11431a;
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new vi0(context, a10, h20Var, wxVar);
            case 2:
                return new oi0((Context) this.f11349b.zzb(), (x10) this.f11351d.f11431a, (Executor) this.f11350c.zzb(), 2);
            case 3:
                return new vi0((Context) this.f11349b.zzb(), (x10) this.f11351d.f11431a, ((u10) this.f11350c).a());
            case 4:
                return new wj0((Context) this.f11349b.zzb(), (Executor) this.f11350c.zzb(), (k20) this.f11351d.f11431a, 0);
            default:
                return new wj0((Context) this.f11349b.zzb(), (Executor) this.f11350c.zzb(), (k20) this.f11351d.f11431a, 1);
        }
    }

    public /* synthetic */ ti0(rr1 rr1Var, wr1 wr1Var, tr1 tr1Var, int i) {
        this.f11348a = i;
        this.f11349b = rr1Var;
        this.f11350c = wr1Var;
        this.f11351d = tr1Var;
    }
}
