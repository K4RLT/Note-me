package com.google.android.gms.internal.mlkit_vision_digital_ink;
import l4.a;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class e4 extends k5 implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final int f14237u;

    /* renamed from: v, reason: collision with root package name */
    public int f14238v;

    /* renamed from: w, reason: collision with root package name */
    public final h4 f14239w;

    public e4(h4 h4Var, int i) {
        int size = h4Var.size();
        pa.l(i, size);
        this.f14237u = size;
        this.f14238v = i;
        this.f14239w = h4Var;
    }

    public final Object a(int i) {
        return this.f14239w.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f14238v < this.f14237u) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f14238v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f14238v;
            this.f14238v = i + 1;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14238v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f14238v - 1;
            this.f14238v = i;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14238v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
