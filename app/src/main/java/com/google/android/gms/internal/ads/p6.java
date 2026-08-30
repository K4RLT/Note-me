package com.google.android.gms.internal.ads;
import p6.a;

/* loaded from: classes.dex */
public final class p6 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f9409a;

    /* renamed from: b, reason: collision with root package name */
    public final q6[] f9410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9411c;

    public p6(long j10, q6[] q6VarArr, int i) {
        this.f9409a = j10;
        this.f9410b = q6VarArr;
        this.f9411c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c7  */
    @Override // com.google.android.gms.internal.ads.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.z2 a(long r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            com.google.android.gms.internal.ads.q6[] r3 = r0.f9410b
            int r4 = r3.length
            com.google.android.gms.internal.ads.b3 r5 = com.google.android.gms.internal.ads.b3.f4701c
            if (r4 != 0) goto L11
            com.google.android.gms.internal.ads.z2 r1 = new com.google.android.gms.internal.ads.z2
            r1.<init>(r5, r5)
            return r1
        L11:
            r4 = -1
            int r10 = r0.f9411c
            if (r10 == r4) goto L4f
            r11 = r3[r10]
            com.google.android.gms.internal.ads.z6 r11 = r11.f9761b
            int r12 = r11.a(r1)
            if (r12 != r4) goto L24
            int r12 = r11.b(r1)
        L24:
            if (r12 != r4) goto L2c
            com.google.android.gms.internal.ads.z2 r1 = new com.google.android.gms.internal.ads.z2
            r1.<init>(r5, r5)
            return r1
        L2c:
            long[] r5 = r11.f13090f
            r13 = r5[r12]
            long[] r15 = r11.f13088c
            r16 = r15[r12]
            int r18 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r18 >= 0) goto L55
            int r6 = r11.f13087b
            int r6 = r6 + r4
            if (r12 >= r6) goto L55
            int r1 = r11.b(r1)
            if (r1 == r4) goto L55
            if (r1 == r12) goto L55
            r6 = r5[r1]
            r1 = r15[r1]
            r20 = r6
            r6 = r1
            r1 = r20
            goto L5c
        L4f:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = r1
        L55:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
        L5c:
            r5 = 0
            r11 = r16
        L5f:
            int r15 = r3.length
            if (r5 >= r15) goto Lb3
            if (r5 == r10) goto La4
            r15 = r3[r5]
            com.google.android.gms.internal.ads.z6 r15 = r15.f9761b
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long[] r8 = r15.f13088c
            int r9 = r15.a(r13)
            if (r9 != r4) goto L79
            int r9 = r15.b(r13)
        L79:
            if (r9 != r4) goto L7e
            r19 = r5
            goto L86
        L7e:
            r19 = r5
            r4 = r8[r9]
            long r11 = java.lang.Math.min(r4, r11)
        L86:
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 == 0) goto La1
            int r4 = r15.a(r1)
            r5 = -1
            if (r4 != r5) goto L95
            int r4 = r15.b(r1)
        L95:
            if (r4 != r5) goto L99
            r9 = r3
            goto Lad
        L99:
            r9 = r3
            r3 = r8[r4]
            long r6 = java.lang.Math.min(r3, r6)
            goto Lad
        La1:
            r9 = r3
            r5 = -1
            goto Lad
        La4:
            r9 = r3
            r19 = r5
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r4
        Lad:
            int r3 = r19 + 1
            r4 = r5
            r5 = r3
            r3 = r9
            goto L5f
        Lb3:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.b3 r3 = new com.google.android.gms.internal.ads.b3
            r3.<init>(r13, r11)
            int r4 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r4 != 0) goto Lc7
            com.google.android.gms.internal.ads.z2 r1 = new com.google.android.gms.internal.ads.z2
            r1.<init>(r3, r3)
            return r1
        Lc7:
            com.google.android.gms.internal.ads.b3 r4 = new com.google.android.gms.internal.ads.b3
            r4.<init>(r1, r6)
            com.google.android.gms.internal.ads.z2 r1 = new com.google.android.gms.internal.ads.z2
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p6.a(long):com.google.android.gms.internal.ads.z2");
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f9409a;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        return true;
    }
}
