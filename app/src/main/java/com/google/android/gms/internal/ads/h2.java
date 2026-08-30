package com.google.android.gms.internal.ads;
import p.a;
import g3.a;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h2 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6541a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f6542b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f6543c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f6544d;
    public final long[] e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6545f;

    public h2(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f6542b = iArr;
        this.f6543c = jArr;
        this.f6544d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f6541a = length;
        if (length > 0) {
            int i = length - 1;
            this.f6545f = jArr2[i] + jArr3[i];
        } else {
            this.f6545f = 0L;
        }
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        long[] jArr = this.e;
        int s10 = bq0.s(jArr, j10, true);
        long j11 = jArr[s10];
        long[] jArr2 = this.f6543c;
        b3 b3Var = new b3(j11, jArr2[s10]);
        if (j11 < j10 && s10 != this.f6541a - 1) {
            int i = s10 + 1;
            return new z2(b3Var, new b3(jArr[i], jArr2[i]));
        }
        return new z2(b3Var, b3Var);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f6542b);
        String arrays2 = Arrays.toString(this.f6543c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.f6544d);
        int i = this.f6541a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(arrays2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(arrays3).length() + 14 + String.valueOf(arrays4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i);
        sb2.append(", sizes=");
        sb2.append(arrays);
        g3.a.t(sb2, ", offsets=", arrays2, ", timeUs=", arrays3);
        return p.a.o(sb2, ", durationsUs=", arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f6545f;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
