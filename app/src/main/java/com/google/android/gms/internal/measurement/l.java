package com.google.android.gms.internal.measurement;
import j6.n;
import n.i;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l implements n {
    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return "null";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return n.i;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof l;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, j6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }
}
