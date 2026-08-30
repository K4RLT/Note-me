package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cy1 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f5224a;

    /* renamed from: b, reason: collision with root package name */
    public final hi f5225b;

    public cy1(r rVar, hi hiVar) {
        this.f5224a = rVar;
        this.f5225b = hiVar;
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int a() {
        return this.f5224a.a();
    }

    public final boolean b(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy1)) {
            return false;
        }
        return this.f5224a.equals(((cy1) obj).f5224a);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final mw1 c() {
        return this.f5225b.f6822d[this.f5224a.d()];
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int d() {
        return this.f5224a.d();
    }

    public final boolean equals(Object obj) {
        if (b(obj) && (obj instanceof cy1)) {
            return this.f5225b.equals(((cy1) obj).f5225b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5225b.hashCode() + (this.f5224a.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int o0(int i) {
        return this.f5224a.o0(i);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final int u(int i) {
        return this.f5224a.u(i);
    }

    @Override // com.google.android.gms.internal.ads.r
    public final mw1 w(int i) {
        return this.f5225b.f6822d[this.f5224a.u(i)];
    }

    @Override // com.google.android.gms.internal.ads.r
    public final hi zza() {
        return this.f5225b;
    }
}
