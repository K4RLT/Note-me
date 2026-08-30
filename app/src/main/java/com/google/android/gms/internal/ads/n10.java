package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import l9.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class n10 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final o10 f8511b;

    public /* synthetic */ n10(o10 o10Var, int i) {
        this.f8510a = i;
        this.f8511b = o10Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f8510a) {
            case 0:
                ApplicationInfo applicationInfo = this.f8511b.a().getApplicationInfo();
                lo1.b(applicationInfo);
                return applicationInfo;
            case 1:
                Context a10 = this.f8511b.a();
                if (((Boolean) r.e.f17698c.a(sl.Rc)).booleanValue()) {
                    return d.j(a10);
                }
                return null;
            case 2:
                return new gv0(this.f8511b.a(), k.C.f16828t.a());
            case 3:
                return hq0.i(this.f8511b.a());
            case 4:
                return new ef0(this.f8511b.a());
            case 5:
                return new xf0(this.f8511b.a());
            case 6:
                return new yf0(this.f8511b.a());
            case 7:
                Context a11 = this.f8511b.a();
                wx wxVar = xx.f12651a;
                lo1.b(wxVar);
                return new rh0(a11, wxVar);
            case 8:
                wx wxVar2 = xx.f12651a;
                lo1.b(wxVar2);
                return new yl0(wxVar2, this.f8511b.a(), 2);
            case 9:
                Context a12 = this.f8511b.a();
                wx wxVar3 = xx.f12651a;
                lo1.b(wxVar3);
                return new yl0(a12, wxVar3, 6);
            default:
                return new ao0(this.f8511b.a());
        }
    }
}
