package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class g41 extends b41 implements SortedSet {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u51 f6303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g41(u51 u51Var, SortedMap sortedMap) {
        super(u51Var, sortedMap);
        Objects.requireNonNull(u51Var);
        this.f6303x = u51Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f4714v;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new g41(this.f6303x, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new g41(this.f6303x, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new g41(this.f6303x, a().tailMap(obj));
    }
}
