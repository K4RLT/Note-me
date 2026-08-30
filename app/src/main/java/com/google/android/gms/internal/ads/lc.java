package com.google.android.gms.internal.ads;
import c7.f0;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    public final c7.f0 f8006a = new c7.f0(4);

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {16, 17, 18, 21, 22, 23, 28, 30};
        for (int i = 0; i < 8; i++) {
            int i10 = iArr[i];
            b80.K(!false);
            sparseBooleanArray.append(i10, true);
        }
        b80.K(!false);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32};
        for (int i11 = 0; i11 < 27; i11++) {
            int i12 = iArr2[i11];
            b80.K(!false);
            sparseBooleanArray2.append(i12, true);
        }
        b80.K(!false);
    }

    public final void a(int i, boolean z3) {
        if (z3) {
            this.f8006a.p(i);
        }
    }
}
