package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class u51 extends l41 implements Serializable {

    /* renamed from: x, reason: collision with root package name */
    public final transient Map f11552x;

    /* renamed from: y, reason: collision with root package name */
    public transient int f11553y;

    /* renamed from: z, reason: collision with root package name */
    public final transient v31 f11554z;

    public u51(Map map, v31 v31Var) {
        b80.l(map.isEmpty());
        this.f11552x = map;
        this.f11554z = v31Var;
    }

    @Override // com.google.android.gms.internal.ads.l41
    public final Collection a() {
        return new k41(0, this);
    }

    @Override // com.google.android.gms.internal.ads.l41
    public final Map b() {
        Map map = this.f11552x;
        if (map instanceof NavigableMap) {
            return new c41(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new f41(this, (SortedMap) map);
        }
        return new a41(this, map);
    }

    public final void e() {
        Map map = this.f11552x;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f11553y = 0;
    }
}
