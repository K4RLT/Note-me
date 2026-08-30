package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class i41 extends z31 implements ListIterator {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j41 f6985y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(j41 j41Var, int i) {
        super(j41Var, ((List) j41Var.f7318w).listIterator(i));
        this.f6985y = j41Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        j41 j41Var = this.f6985y;
        boolean isEmpty = j41Var.isEmpty();
        a();
        ((ListIterator) this.f13063v).add(obj);
        ((u51) j41Var.A).f11553y++;
        if (isEmpty) {
            j41Var.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f13063v).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f13063v).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f13063v).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f13063v).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f13063v).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i41(j41 j41Var) {
        super(j41Var);
        this.f6985y = j41Var;
    }
}
