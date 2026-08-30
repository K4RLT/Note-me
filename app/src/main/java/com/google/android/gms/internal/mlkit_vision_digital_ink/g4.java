package com.google.android.gms.internal.mlkit_vision_digital_ink;
import pa.d;

/* loaded from: classes.dex */
public final class g4 extends h4 {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f14355w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f14356x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h4 f14357y;

    public g4(h4 h4Var, int i, int i10) {
        this.f14357y = h4Var;
        this.f14355w = i;
        this.f14356x = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int b() {
        return this.f14357y.d() + this.f14355w + this.f14356x;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final int d() {
        return this.f14357y.d() + this.f14355w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pa.d(i, this.f14356x);
        return this.f14357y.get(i + this.f14355w);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final boolean n() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.c4
    public final Object[] o() {
        return this.f14357y.o();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h4, java.util.List
    /* renamed from: q */
    public final h4 subList(int i, int i10) {
        pa.r(i, i10, this.f14356x);
        int i11 = this.f14355w;
        return this.f14357y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14356x;
    }
}
