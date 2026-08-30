package com.google.android.gms.internal.ads;
import l4.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class nr1 extends AbstractList {

    /* renamed from: w, reason: collision with root package name */
    public static final lr1 f8827w = lr1.c(nr1.class);

    /* renamed from: u, reason: collision with root package name */
    public final List f8828u;

    /* renamed from: v, reason: collision with root package name */
    public final kr1 f8829v;

    public nr1(ArrayList arrayList, kr1 kr1Var) {
        this.f8828u = arrayList;
        this.f8829v = kr1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.f8828u;
        if (list.size() > i) {
            return list.get(i);
        }
        kr1 kr1Var = this.f8829v;
        if (kr1Var.hasNext()) {
            list.add(kr1Var.next());
            return get(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new mr1(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        lr1 lr1Var = f8827w;
        lr1Var.b("potentially expensive size() call");
        lr1Var.b("blowup running");
        while (true) {
            kr1 kr1Var = this.f8829v;
            boolean hasNext = kr1Var.hasNext();
            List list = this.f8828u;
            if (hasNext) {
                list.add(kr1Var.next());
            } else {
                return list.size();
            }
        }
    }
}
