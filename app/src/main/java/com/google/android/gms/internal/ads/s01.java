package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes.dex */
public final class s01 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10442a;

    /* renamed from: b, reason: collision with root package name */
    public final rr1 f10443b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f10444c;

    /* renamed from: d, reason: collision with root package name */
    public final wr1 f10445d;

    public /* synthetic */ s01(rr1 rr1Var, rr1 rr1Var2, Object obj, int i) {
        this.f10442a = i;
        this.f10443b = rr1Var;
        this.f10444c = rr1Var2;
        this.f10445d = (wr1) obj;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f10442a) {
            case 0:
                return new v01((File) this.f10443b.zzb(), (bv0) this.f10444c.zzb(), (h21) this.f10445d.zzb());
            default:
                pr1 b10 = rr1.b(this.f10443b);
                pr1 b11 = rr1.b(this.f10444c);
                if (true == ((rx0) this.f10445d.zzb()).g0()) {
                    b10 = b11;
                }
                l11 l11Var = (l11) b10.zzb();
                lo1.b(l11Var);
                return l11Var;
        }
    }
}
