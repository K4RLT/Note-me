package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* loaded from: classes.dex */
public final class sz0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11200a;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f11201b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f11202c;

    /* renamed from: d, reason: collision with root package name */
    public final tr1 f11203d;
    public final tr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final wr1 f11204f;

    public /* synthetic */ sz0(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2, tr1 tr1Var3, rr1 rr1Var2, int i) {
        this.f11200a = i;
        this.f11201b = tr1Var;
        this.f11202c = rr1Var;
        this.f11203d = tr1Var2;
        this.e = tr1Var3;
        this.f11204f = rr1Var2;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f11200a) {
            case 0:
                return new rz0((wd) this.f11201b.f11431a, (pz0) this.f11202c.zzb(), (View) this.f11203d.f11431a, (Activity) this.e.f11431a, (h21) this.f11204f.zzb());
            default:
                return new rz0((wd) this.f11201b.f11431a, (pz0) this.f11202c.zzb(), (yx0) this.f11203d.f11431a, (Map) this.e.f11431a, (h21) this.f11204f.zzb());
        }
    }
}
