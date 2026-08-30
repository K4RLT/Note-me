package com.google.android.gms.internal.ads;
import l4.a;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class w31 extends m61 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f12127v;

    /* renamed from: w, reason: collision with root package name */
    public int f12128w;

    public w31(int i, int i10) {
        super(0);
        b80.O(i10, i);
        this.f12127v = i;
        this.f12128w = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12128w < this.f12127v;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12128w > 0;
    }

    @Override // com.google.android.gms.internal.ads.m61, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f12128w;
            this.f12128w = i + 1;
            return b(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12128w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f12128w - 1;
            this.f12128w = i;
            return b(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12128w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
