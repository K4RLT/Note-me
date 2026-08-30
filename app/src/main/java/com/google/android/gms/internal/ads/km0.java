package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class km0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final double f7806a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7807b;

    public km0(double d2, boolean z3) {
        this.f7806a = d2;
        this.f7807b = z3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle d2 = b80.d("device", bundle);
        bundle.putBundle("device", d2);
        Bundle d10 = b80.d("battery", d2);
        d2.putBundle("battery", d10);
        d10.putBoolean("is_charging", this.f7807b);
        d10.putDouble("battery_level", this.f7806a);
    }
}
