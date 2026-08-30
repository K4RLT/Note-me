package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mi0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8346a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f8347b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f8348c;

    /* renamed from: d, reason: collision with root package name */
    public final o60 f8349d;
    public final wr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final tr1 f8350f;

    /* renamed from: g, reason: collision with root package name */
    public final rr1 f8351g;

    /* renamed from: h, reason: collision with root package name */
    public final wr1 f8352h;
    public final rr1 i;

    /* renamed from: j, reason: collision with root package name */
    public final wr1 f8353j;

    public mi0(tr1 tr1Var, rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, o60 o60Var, u10 u10Var, rr1 rr1Var4, rr1 rr1Var5, rr1 rr1Var6) {
        this.f8346a = 0;
        this.f8350f = tr1Var;
        this.f8347b = rr1Var;
        this.f8348c = rr1Var2;
        this.f8351g = rr1Var3;
        this.f8349d = o60Var;
        this.e = u10Var;
        this.f8352h = rr1Var4;
        this.i = rr1Var5;
        this.f8353j = rr1Var6;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f8346a) {
            case 0:
                b20 b20Var = (b20) this.f8350f.f11431a;
                return new li0(b20Var, (Executor) this.f8348c.zzb(), (gd0) this.f8351g.zzb(), this.f8349d.a(), ((u10) this.e).a(), new op(), (wh0) this.f8352h.zzb(), (zd0) this.i.zzb(), (be0) this.f8353j.zzb());
            case 1:
                return new cj0((Context) this.f8347b.zzb(), ((u10) this.f8348c).a(), this.f8349d.a(), (Executor) this.e.zzb(), (h20) this.f8350f.f11431a, (gd0) this.f8351g.zzb(), new op(), (wh0) this.f8352h.zzb(), (zd0) this.i.zzb(), (be0) this.f8353j.zzb());
            default:
                return new cj0((Context) this.f8347b.zzb(), ((u10) this.f8348c).a(), this.f8349d.a(), (Executor) this.e.zzb(), (k20) this.f8350f.f11431a, (gd0) this.f8351g.zzb(), new op(), (wh0) this.f8352h.zzb(), (zd0) this.i.zzb(), (be0) this.f8353j.zzb());
        }
    }

    public /* synthetic */ mi0(rr1 rr1Var, wr1 wr1Var, o60 o60Var, wr1 wr1Var2, tr1 tr1Var, rr1 rr1Var2, wr1 wr1Var3, rr1 rr1Var3, wr1 wr1Var4, int i) {
        this.f8346a = i;
        this.f8347b = rr1Var;
        this.f8348c = wr1Var;
        this.f8349d = o60Var;
        this.e = wr1Var2;
        this.f8350f = tr1Var;
        this.f8351g = rr1Var2;
        this.f8352h = wr1Var3;
        this.i = rr1Var3;
        this.f8353j = wr1Var4;
    }
}
