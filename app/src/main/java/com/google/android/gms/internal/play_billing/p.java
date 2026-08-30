package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class p extends b0 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f15503v;

    /* renamed from: w, reason: collision with root package name */
    public int f15504w;

    /* renamed from: x, reason: collision with root package name */
    public final r f15505x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, int i) {
        super(0);
        int size = rVar.size();
        wa.a0.b(i, size);
        this.f15503v = size;
        this.f15504w = i;
        this.f15505x = rVar;
    }

    public final Object a(int i) {
        return this.f15505x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f15504w < this.f15503v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f15504w > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f15504w;
            this.f15504w = i + 1;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f15504w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f15504w - 1;
            this.f15504w = i;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f15504w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
