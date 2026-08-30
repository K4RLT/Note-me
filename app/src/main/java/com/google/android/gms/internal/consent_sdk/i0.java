package com.google.android.gms.internal.consent_sdk;
import f0.d;
import l4.a;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class i0 extends r0 implements ListIterator {

    /* renamed from: u, reason: collision with root package name */
    public final int f13437u;

    /* renamed from: v, reason: collision with root package name */
    public int f13438v;

    /* renamed from: w, reason: collision with root package name */
    public final k0 f13439w;

    public i0(k0 k0Var, int i) {
        int size = k0Var.size();
        d(i, size);
        this.f13437u = size;
        this.f13438v = i;
        this.f13439w = k0Var;
    }

    public final Object a(int i) {
        return this.f13439w.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f13438v < this.f13437u) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f13438v > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f13438v;
            this.f13438v = i + 1;
            return a(i);
        }
        a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f13438v;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f13438v - 1;
            this.f13438v = i;
            return a(i);
        }
        a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f13438v - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
