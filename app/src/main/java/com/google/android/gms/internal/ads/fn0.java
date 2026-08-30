package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class fn0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final wr1 f6132a;

    /* renamed from: b, reason: collision with root package name */
    public final wr1 f6133b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f6134c;

    public fn0(rr1 rr1Var, rr1 rr1Var2, o10 o10Var) {
        this.f6132a = rr1Var;
        this.f6133b = rr1Var2;
        this.f6134c = o10Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rl0 zzb() {
        return new rl0(2, (ApplicationInfo) this.f6132a.zzb(), (PackageInfo) this.f6133b.zzb(), ((o10) this.f6134c).a());
    }
}
