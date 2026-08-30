package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z6 {

    /* renamed from: a, reason: collision with root package name */
    public final w6 f13086a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13087b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f13088c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f13089d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f13090f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f13091g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f13092h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f13093j;

    public z6(w6 w6Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z3, long j10, int i10) {
        boolean z9;
        boolean z10;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.l(z9);
        if (jArr.length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        b80.l(z10);
        int length3 = iArr2.length;
        b80.l(length3 == length2);
        this.f13086a = w6Var;
        this.f13088c = jArr;
        this.f13089d = iArr;
        this.e = i;
        this.f13090f = jArr2;
        this.f13091g = iArr2;
        this.f13092h = iArr3;
        this.f13093j = z3;
        this.i = j10;
        this.f13087b = i10;
        if (length3 > 0) {
            int i11 = length3 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j10) {
        long[] jArr = this.f13090f;
        if (jArr.length > 0) {
            int i = 0;
            if (this.f13093j) {
                return bq0.s(jArr, j10, false);
            }
            int[] iArr = this.f13092h;
            int length = iArr.length - 1;
            int i10 = -1;
            while (i <= length) {
                int i11 = ((length - i) / 2) + i;
                if (jArr[iArr[i11]] <= j10) {
                    i = i11 + 1;
                    i10 = i11;
                } else {
                    length = i11 - 1;
                }
            }
            if (i10 != -1) {
                long j11 = jArr[iArr[i10]];
                if (j11 == j10) {
                    while (i10 > 0) {
                        int i12 = i10 - 1;
                        if (jArr[iArr[i12]] != j11) {
                            break;
                        }
                        i10 = i12;
                    }
                }
                return iArr[i10];
            }
        }
        return -1;
    }

    public final int b(long j10) {
        long[] jArr = this.f13090f;
        if (jArr.length > 0) {
            if (this.f13093j) {
                String str = bq0.f4860a;
                int binarySearch = Arrays.binarySearch(jArr, j10);
                if (binarySearch < 0) {
                    return ~binarySearch;
                }
                while (true) {
                    int i = binarySearch + 1;
                    if (i >= jArr.length || jArr[i] != j10) {
                        break;
                    }
                    binarySearch = i;
                }
                return binarySearch;
            }
            int[] iArr = this.f13092h;
            int length = iArr.length - 1;
            int i10 = 0;
            int i11 = -1;
            while (i10 <= length) {
                int i12 = ((length - i10) / 2) + i10;
                if (jArr[iArr[i12]] >= j10) {
                    length = i12 - 1;
                    i11 = i12;
                } else {
                    i10 = i12 + 1;
                }
            }
            if (i11 != -1) {
                long j11 = jArr[iArr[i11]];
                if (j11 == j10) {
                    while (i11 < iArr.length - 1) {
                        int i13 = i11 + 1;
                        if (jArr[iArr[i13]] != j11) {
                            break;
                        }
                        i11 = i13;
                    }
                }
                return iArr[i11];
            }
        }
        return -1;
    }
}
