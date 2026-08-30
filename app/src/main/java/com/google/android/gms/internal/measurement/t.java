package com.google.android.gms.internal.measurement;
import j6.n;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t implements n {
    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return n.f13848h;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof t;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, j6.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }
}
