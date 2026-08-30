package com.google.android.gms.internal.consent_sdk;
import f0.b;
import f0.e;

/* loaded from: classes.dex */
public final class j0 extends k0 {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f13449w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f13450x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k0 f13451y;

    public j0(k0 k0Var, int i, int i10) {
        this.f13451y = k0Var;
        this.f13449w = i;
        this.f13450x = i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int b() {
        return this.f13451y.d() + this.f13449w + this.f13450x;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final int d() {
        return this.f13451y.d() + this.f13449w;
    }

    @Override // com.google.android.gms.internal.consent_sdk.h0
    public final Object[] g() {
        return this.f13451y.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        f0.b(i, this.f13450x);
        return this.f13451y.get(i + this.f13449w);
    }

    @Override // com.google.android.gms.internal.consent_sdk.k0, java.util.List
    /* renamed from: k */
    public final k0 subList(int i, int i10) {
        f0.e(i, i10, this.f13450x);
        int i11 = this.f13449w;
        return this.f13451y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13450x;
    }
}
