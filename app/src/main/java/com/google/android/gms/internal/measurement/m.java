package com.google.android.gms.internal.measurement;
import j6.n;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class m implements i, n {

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f13839u = new HashMap();

    @Override // com.google.android.gms.internal.measurement.i
    public final boolean C(String str) {
        return this.f13839u.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        m mVar = new m();
        for (Map.Entry entry : this.f13839u.entrySet()) {
            boolean z3 = entry.getValue() instanceof i;
            HashMap hashMap = mVar.f13839u;
            if (z3) {
                hashMap.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((n) entry.getValue()).c());
            }
        }
        return mVar;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return new k(this.f13839u.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f13839u.equals(((m) obj).f13839u);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final void g(String str, n nVar) {
        HashMap hashMap = this.f13839u;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    public final int hashCode() {
        return this.f13839u.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.TRUE;
    }

    public n n(String str, n nVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new p(toString());
        }
        return g4.b(this, new p(str), nVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final n o(String str) {
        HashMap hashMap = this.f13839u;
        if (hashMap.containsKey(str)) {
            return (n) hashMap.get(str);
        }
        return n.f13848h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.f13839u;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
