package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class l6 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f7953a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f7954b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7955c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7956d;
    public final int e;

    public /* synthetic */ l6(SparseArray sparseArray, SparseArray sparseArray2, long j10, long j11, int i) {
        this.f7953a = sparseArray;
        this.f7954b = sparseArray2;
        this.f7955c = j10;
        this.f7956d = j11;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        SparseArray sparseArray = this.f7953a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.f7954b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length != 0 && j10 >= jArr[0]) {
            int s10 = bq0.s(jArr, j10, true);
            b3 b3Var = new b3(jArr[s10], jArr2[s10]);
            return new z2(b3Var, b3Var);
        }
        b3 b3Var2 = new b3(0L, this.f7956d);
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f7955c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
