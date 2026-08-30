package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class uz0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11759a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f11760b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f11761c;

    /* renamed from: d, reason: collision with root package name */
    public final tr1 f11762d;
    public final wr1 e;

    public uz0(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, rr1 rr1Var2) {
        this.f11760b = tr1Var;
        this.f11761c = rr1Var;
        this.f11762d = tr1Var2;
        this.e = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f11759a) {
            case 0:
                return new tz0((wd) this.f11760b.f11431a, (Map) this.f11762d.f11431a, (rx0) this.f11761c.zzb(), (h21) this.e.zzb());
            default:
                return new yz0((wd) this.f11760b.f11431a, (pz0) this.f11761c.zzb(), (Map) this.f11762d.f11431a, (h21) this.e.zzb());
        }
    }

    public uz0(tr1 tr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var) {
        this.f11760b = tr1Var;
        this.f11762d = tr1Var2;
        this.f11761c = tr1Var3;
        this.e = rr1Var;
    }
}
