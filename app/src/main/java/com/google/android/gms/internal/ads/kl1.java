package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class kl1 extends ll1 implements Iterable {

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f7801u = new ArrayList();

    @Override // com.google.android.gms.internal.ads.ll1
    public final String a() {
        ArrayList arrayList = this.f7801u;
        int size = arrayList.size();
        if (size == 1) {
            return ((ll1) arrayList.get(0)).a();
        }
        q.x.o(a5.a.f(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof kl1) && ((kl1) obj).f7801u.equals(this.f7801u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7801u.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f7801u.iterator();
    }
}
