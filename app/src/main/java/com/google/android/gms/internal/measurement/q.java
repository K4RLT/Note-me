package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements n {

    /* renamed from: u, reason: collision with root package name */
    public final String f13884u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f13885v;

    public q(String str, ArrayList arrayList) {
        this.f13884u = str;
        ArrayList arrayList2 = new ArrayList();
        this.f13885v = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        String str = qVar.f13884u;
        String str2 = this.f13884u;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        ArrayList arrayList = qVar.f13885v;
        ArrayList arrayList2 = this.f13885v;
        if (arrayList2 != null) {
            return arrayList2.equals(arrayList);
        }
        if (arrayList == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10 = 0;
        String str = this.f13884u;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 31;
        ArrayList arrayList = this.f13885v;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return i11 + i10;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, j6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
