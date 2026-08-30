package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class c51 extends d51 {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f5004w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f5005x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d51 f5006y;

    public c51(d51 d51Var, int i, int i10) {
        this.f5006y = d51Var;
        this.f5004w = i;
        this.f5005x = i10;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final Object[] b() {
        return this.f5006y.b();
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int d() {
        return this.f5006y.d() + this.f5004w;
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final int g() {
        return this.f5006y.d() + this.f5004w + this.f5005x;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b80.N(i, this.f5005x);
        return this.f5006y.get(i + this.f5004w);
    }

    @Override // com.google.android.gms.internal.ads.z41
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d51, java.util.List
    /* renamed from: p */
    public final d51 subList(int i, int i10) {
        b80.P(i, i10, this.f5005x);
        int i11 = this.f5004w;
        return this.f5006y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5005x;
    }
}
