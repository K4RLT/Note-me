package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class d41 extends g41 implements NavigableSet {

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u51 f5307y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d41(u51 u51Var, NavigableMap navigableMap) {
        super(u51Var, navigableMap);
        Objects.requireNonNull(u51Var);
        this.f5307y = u51Var;
    }

    @Override // com.google.android.gms.internal.ads.g41
    public final /* synthetic */ SortedMap a() {
        return (NavigableMap) ((SortedMap) this.f4714v);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4714v)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((b41) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new d41(this.f5307y, ((NavigableMap) ((SortedMap) this.f4714v)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4714v)).floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        return new d41(this.f5307y, ((NavigableMap) ((SortedMap) this.f4714v)).headMap(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4714v)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f4714v)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        z31 z31Var = (z31) iterator();
        if (z31Var.hasNext()) {
            Object next = z31Var.next();
            z31Var.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z9) {
        return new d41(this.f5307y, ((NavigableMap) ((SortedMap) this.f4714v)).subMap(obj, z3, obj2, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        return new d41(this.f5307y, ((NavigableMap) ((SortedMap) this.f4714v)).tailMap(obj, z3));
    }

    @Override // com.google.android.gms.internal.ads.g41, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.android.gms.internal.ads.g41, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.g41, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
