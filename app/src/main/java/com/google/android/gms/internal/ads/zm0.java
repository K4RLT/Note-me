package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13213a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13214b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13215c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13216d;
    public final boolean e;

    public zm0(String str, boolean z3, boolean z9, boolean z10, boolean z11) {
        this.f13213a = str;
        this.f13214b = z3;
        this.f13215c = z9;
        this.f13216d = z10;
        this.e = z11;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f13213a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z3 = this.f13214b;
        bundle.putInt("test_mode", z3 ? 1 : 0);
        boolean z9 = this.f13215c;
        bundle.putInt("linked_device", z9 ? 1 : 0);
        if (z3 || z9) {
            nl nlVar = sl.Aa;
            g9.r rVar = g9.r.e;
            if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                bundle.putInt("risd", !this.f13216d ? 1 : 0);
            }
            if (((Boolean) rVar.f17698c.a(sl.Ea)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.e);
            }
        }
    }
}
