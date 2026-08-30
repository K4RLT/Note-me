package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class v30 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11789a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f11790b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f11791c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f11792d;
    public final rr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f11793f;

    public /* synthetic */ v30(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, Object obj, Object obj2, int i) {
        this.f11789a = i;
        this.f11791c = rr1Var;
        this.f11792d = rr1Var2;
        this.e = rr1Var3;
        this.f11790b = (wr1) obj;
        this.f11793f = (wr1) obj2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f11789a) {
            case 0:
                return new u30((pr) this.f11791c.zzb(), (r30) this.f11792d.zzb(), (Executor) this.f11790b.zzb(), (q30) this.e.zzb(), (la.a) this.f11793f.zzb());
            case 1:
                return new bw0((Context) this.f11790b.zzb(), (cw0) this.f11791c.zzb(), (cv0) this.f11792d.zzb(), (bv0) this.e.zzb(), ((rx0) this.f11793f.zzb()).f0());
            case 2:
                return new y01((bw0) this.f11791c.zzb(), (l11) this.f11792d.zzb(), (t11) this.e.zzb(), (h21) this.f11790b.zzb(), (ExecutorService) this.f11793f.zzb());
            default:
                return new s11((ly0) this.f11791c.zzb(), (ly0) this.f11792d.zzb(), rr1.b(this.e), (ExecutorService) this.f11790b.zzb(), (h21) this.f11793f.zzb());
        }
    }

    public v30(rr1 rr1Var, rr1 rr1Var2, rr1 rr1Var3, rr1 rr1Var4, rr1 rr1Var5) {
        this.f11789a = 0;
        this.f11791c = rr1Var;
        this.f11792d = rr1Var2;
        this.f11790b = rr1Var3;
        this.e = rr1Var4;
        this.f11793f = rr1Var5;
    }

    public v30(tr1 tr1Var, rr1 rr1Var, rr1 rr1Var2, tr1 tr1Var2, rr1 rr1Var3) {
        this.f11789a = 1;
        this.f11790b = tr1Var;
        this.f11791c = rr1Var;
        this.f11792d = rr1Var2;
        this.e = rr1Var3;
        this.f11793f = tr1Var2;
    }
}
