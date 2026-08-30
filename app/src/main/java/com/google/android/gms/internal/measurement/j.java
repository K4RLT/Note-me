package com.google.android.gms.internal.measurement;
import j6.n;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class j implements i, n {

    /* renamed from: u, reason: collision with root package name */
    public final String f13784u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f13785v = new HashMap();

    public j(String str) {
        this.f13784u = str;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final boolean C(String str) {
        return this.f13785v.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return this.f13784u;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new k(this.f13785v.keySet().iterator());
    }

    public abstract n e(n nVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        String str = this.f13784u;
        if (str == null) {
            return false;
        }
        return str.equals(jVar.f13784u);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final void g(String str, n nVar) {
        HashMap hashMap = this.f13785v;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    public final int hashCode() {
        String str = this.f13784u;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, n nVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new p(this.f13784u);
        }
        return g4.b(this, new p(str), nVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final n o(String str) {
        HashMap hashMap = this.f13785v;
        if (hashMap.containsKey(str)) {
            return (n) hashMap.get(str);
        }
        return n.f13848h;
    }
}
