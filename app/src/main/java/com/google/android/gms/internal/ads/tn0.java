package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class tn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11399d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11400f;

    public tn0(String str, int i, int i10, int i11, boolean z3, int i12) {
        this.f11396a = str;
        this.f11397b = i;
        this.f11398c = i10;
        this.f11399d = i11;
        this.e = z3;
        this.f11400f = i12;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z3 = true;
        b80.u(bundle, "carrier", this.f11396a, !TextUtils.isEmpty(r0));
        int i = this.f11397b;
        if (i == -2) {
            z3 = false;
        }
        b80.z(bundle, "cnt", i, z3);
        bundle.putInt("gnt", this.f11398c);
        bundle.putInt("pt", this.f11399d);
        Bundle d2 = b80.d("device", bundle);
        bundle.putBundle("device", d2);
        Bundle d10 = b80.d("network", d2);
        d2.putBundle("network", d10);
        d10.putInt("active_network_state", this.f11400f);
        d10.putBoolean("active_network_metered", this.e);
    }
}
