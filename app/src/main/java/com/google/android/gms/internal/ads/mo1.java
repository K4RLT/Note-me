package com.google.android.gms.internal.ads;
import l4.a;

import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mo1 implements Iterator {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayDeque f8390u;

    /* renamed from: v, reason: collision with root package name */
    public lm1 f8391v;

    public mo1(om1 om1Var) {
        if (om1Var instanceof no1) {
            no1 no1Var = (no1) om1Var;
            ArrayDeque arrayDeque = new ArrayDeque(no1Var.A);
            this.f8390u = arrayDeque;
            arrayDeque.push(no1Var);
            om1 om1Var2 = no1Var.f8792x;
            while (om1Var2 instanceof no1) {
                no1 no1Var2 = (no1) om1Var2;
                this.f8390u.push(no1Var2);
                om1Var2 = no1Var2.f8792x;
            }
            this.f8391v = (lm1) om1Var2;
            return;
        }
        this.f8390u = null;
        this.f8391v = (lm1) om1Var;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lm1 next() {
        lm1 lm1Var;
        lm1 lm1Var2 = this.f8391v;
        if (lm1Var2 == null) {
            l4.a.c();
            return null;
        }
        do {
            ArrayDeque arrayDeque = this.f8390u;
            lm1Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            om1 om1Var = ((no1) arrayDeque.pop()).f8793y;
            while (om1Var instanceof no1) {
                no1 no1Var = (no1) om1Var;
                arrayDeque.push(no1Var);
                om1Var = no1Var.f8792x;
            }
            lm1Var = (lm1) om1Var;
        } while (lm1Var.k() == 0);
        this.f8391v = lm1Var;
        return lm1Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8391v != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
