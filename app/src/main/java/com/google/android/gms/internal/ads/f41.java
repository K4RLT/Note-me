package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class f41 extends a41 implements SortedMap {
    public final /* synthetic */ u51 A;

    /* renamed from: z, reason: collision with root package name */
    public SortedSet f5930z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f41(u51 u51Var, SortedMap sortedMap) {
        super(u51Var, sortedMap);
        Objects.requireNonNull(u51Var);
        this.A = u51Var;
    }

    public SortedSet b() {
        return new g41(this.A, e());
    }

    @Override // com.google.android.gms.internal.ads.a41, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f5930z;
        if (sortedSet == null) {
            SortedSet b10 = b();
            this.f5930z = b10;
            return b10;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedMap e() {
        return (SortedMap) this.f4356v;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new f41(this.A, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new f41(this.A, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new f41(this.A, e().tailMap(obj));
    }
}
