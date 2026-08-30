package com.google.android.gms.internal.play_billing;
import a0.a;
import a0.c;

/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f15510w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f15511x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f15512y;

    public q(r rVar, int i, int i10) {
        this.f15512y = rVar;
        this.f15510w = i;
        this.f15511x = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int b() {
        return this.f15512y.d() + this.f15510w + this.f15511x;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return this.f15512y.d() + this.f15510w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        wa.a(i, this.f15511x);
        return this.f15512y.get(i + this.f15510w);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final boolean k() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final Object[] n() {
        return this.f15512y.n();
    }

    @Override // com.google.android.gms.internal.play_billing.r, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final r subList(int i, int i10) {
        wa.c(i, i10, this.f15511x);
        int i11 = this.f15510w;
        return this.f15512y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15511x;
    }
}
