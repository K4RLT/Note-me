package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends zl {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6940w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f6941x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f6942y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f6943z;

    public i(j jVar) {
        a(jVar);
        this.f6940w = jVar.f7263w;
        this.f6941x = jVar.f7264x;
        this.f6942y = jVar.f7265y;
        this.f6943z = jVar.f7266z;
        this.A = jVar.A;
        this.B = jVar.B;
        this.C = jVar.C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = jVar.D;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.D = sparseArray;
                this.E = jVar.E.clone();
                return;
            }
        }
    }

    public i() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f6940w = true;
        this.f6941x = true;
        this.f6942y = true;
        this.f6943z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
