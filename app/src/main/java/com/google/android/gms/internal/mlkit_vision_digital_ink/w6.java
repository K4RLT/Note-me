package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class w6 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final d6 f15180u;

    /* renamed from: v, reason: collision with root package name */
    public int f15181v;

    /* renamed from: w, reason: collision with root package name */
    public int f15182w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x6 f15183x;

    public /* synthetic */ w6(x6 x6Var, d6 d6Var, int i) {
        this.f15183x = x6Var;
        this.f15180u = d6Var;
        int i10 = i & 31;
        this.f15181v = i10;
        this.f15182w = i >>> (i10 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15181v >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object r8;
        int i = this.f15181v;
        x6 x6Var = this.f15183x;
        gn gnVar = x6Var.f15230b;
        int a10 = gnVar.a();
        if (i >= a10) {
            r8 = x6Var.f15231c.r(i - a10);
        } else {
            r8 = gnVar.r(i);
        }
        Object cast = this.f15180u.f14185b.cast(r8);
        int i10 = this.f15182w;
        if (i10 != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i10) + 1;
            this.f15182w >>>= numberOfTrailingZeros;
            this.f15181v += numberOfTrailingZeros;
            return cast;
        }
        this.f15181v = -1;
        return cast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
