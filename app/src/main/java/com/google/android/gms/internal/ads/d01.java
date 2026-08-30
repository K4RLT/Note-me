package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class d01 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5241a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f5242b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f5243c;

    /* renamed from: d, reason: collision with root package name */
    public final rr1 f5244d;
    public final tr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f5245f;

    public d01(tr1 tr1Var, rr1 rr1Var, rr1 rr1Var2, tr1 tr1Var2, rr1 rr1Var3) {
        this.f5242b = tr1Var;
        this.f5243c = rr1Var;
        this.f5244d = rr1Var2;
        this.e = tr1Var2;
        this.f5245f = rr1Var3;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f5241a) {
            case 0:
                return new a01((wd) this.f5242b.f11431a, (pz0) this.f5243c.zzb(), (Map) this.e.f11431a, (DisplayMetrics) this.f5244d.zzb(), (h21) this.f5245f.zzb());
            default:
                return new rz0((wd) this.f5242b.f11431a, (pz0) this.f5243c.zzb(), (DisplayMetrics) this.f5244d.zzb(), (View) this.e.f11431a, (h21) this.f5245f.zzb());
        }
    }

    public d01(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, rr1 rr1Var2, rr1 rr1Var3) {
        this.f5242b = tr1Var;
        this.f5243c = rr1Var;
        this.e = tr1Var2;
        this.f5244d = rr1Var2;
        this.f5245f = rr1Var3;
    }
}
