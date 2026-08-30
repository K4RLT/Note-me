package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yr1 implements wr1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12931c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile sr1 f12932a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f12933b;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.wr1, com.google.android.gms.internal.ads.yr1, java.lang.Object] */
    public static wr1 a(sr1 sr1Var) {
        if (!(sr1Var instanceof yr1) && !(sr1Var instanceof rr1)) {
            ?? obj = new Object();
            obj.f12933b = f12931c;
            obj.f12932a = sr1Var;
            return obj;
        }
        return sr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object obj = this.f12933b;
        if (obj == f12931c) {
            sr1 sr1Var = this.f12932a;
            if (sr1Var == null) {
                return this.f12933b;
            }
            Object zzb = sr1Var.zzb();
            this.f12933b = zzb;
            this.f12932a = null;
            return zzb;
        }
        return obj;
    }
}
