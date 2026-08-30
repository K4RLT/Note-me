package com.google.android.gms.internal.ads;
import l4.a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class i61 extends h61 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f6613u).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f6613u.iterator();
        it.getClass();
        i31 i31Var = this.f6614v;
        i31Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (i31Var.l(next)) {
                return next;
            }
        }
        a.c();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.h61, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new h61(((SortedSet) this.f6613u).headSet(obj), this.f6614v);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f6613u;
        while (true) {
            Object last = sortedSet.last();
            if (this.f6614v.l(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.h61, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new h61(((SortedSet) this.f6613u).subSet(obj, obj2), this.f6614v);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.h61, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new h61(((SortedSet) this.f6613u).tailSet(obj), this.f6614v);
    }
}
