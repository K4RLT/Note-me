package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class q51 extends k61 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9758v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractList f9759w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q51(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.f9758v = i;
        this.f9759w = abstractList;
    }

    @Override // com.google.android.gms.internal.ads.k61
    public final Object a(Object obj) {
        switch (this.f9758v) {
            case 0:
                return ((r51) this.f9759w).f10102v.apply(obj);
            default:
                return ((s51) this.f9759w).f10529v.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f7671u).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f7671u).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f7671u).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f7671u).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
