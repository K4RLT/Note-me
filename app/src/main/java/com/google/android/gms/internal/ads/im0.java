package com.google.android.gms.internal.ads;
import g9.r;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class im0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7168a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7169b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7170c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7171d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7172f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7173g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7174h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f7175j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7176k;

    public im0(int i, boolean z3, boolean z9, int i10, int i11, int i12, int i13, int i14, float f10, boolean z10, boolean z11) {
        this.f7168a = i;
        this.f7169b = z3;
        this.f7170c = z9;
        this.f7171d = i10;
        this.e = i11;
        this.f7172f = i12;
        this.f7173g = i13;
        this.f7174h = i14;
        this.i = f10;
        this.f7175j = z10;
        this.f7176k = z11;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) r.e.f17698c.a(sl.sc)).booleanValue()) {
            bundle.putInt("muv_min", this.e);
            bundle.putInt("muv_max", this.f7172f);
        }
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.f7175j);
        if (!this.f7176k) {
            bundle.putInt("am", this.f7168a);
            bundle.putBoolean("ma", this.f7169b);
            bundle.putBoolean("sp", this.f7170c);
            bundle.putInt("muv", this.f7171d);
            bundle.putInt("rm", this.f7173g);
            bundle.putInt("riv", this.f7174h);
        }
    }
}
