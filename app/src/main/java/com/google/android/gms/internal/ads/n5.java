package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class n5 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final h2 f8542a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f8543b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8544c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8545d;

    public n5(SparseArray sparseArray, long j10, int i, long j11, long j12) {
        int i10;
        this.f8543b = sparseArray;
        this.f8544c = j10;
        this.f8545d = i;
        List list = (List) sparseArray.get(i);
        h2 h2Var = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArr = new int[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                m5 m5Var = (m5) list.get(i12);
                jArr3[i12] = m5Var.f8247u;
                jArr[i12] = m5Var.f8248v;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArr3[i14] >= j10) {
                i14--;
            }
            iArr[i14] = (int) ((j11 + j12) - jArr[i14]);
            jArr2[i14] = j10 - jArr3[i14];
            if (i14 < i10) {
                x21.F("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArr = Arrays.copyOf(iArr, i15);
                jArr = Arrays.copyOf(jArr, i15);
                jArr2 = Arrays.copyOf(jArr2, i15);
                jArr3 = Arrays.copyOf(jArr3, i15);
            }
            h2Var = new h2(iArr, jArr, jArr2, jArr3);
        }
        this.f8542a = h2Var;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        h2 h2Var = this.f8542a;
        if (h2Var != null) {
            return h2Var.a(j10);
        }
        b3 b3Var = b3.f4701c;
        return new z2(b3Var, b3Var);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f8544c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        List list = (List) this.f8543b.get(this.f8545d);
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }
}
