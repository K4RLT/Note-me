package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n61 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8575a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f8576b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8577c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8578d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8579f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f8580g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f8581h;
    public final boolean i;

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[LOOP:0: B:13:0x0063->B:15:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n61(java.lang.String r5, char[] r6, byte[] r7, boolean r8) {
        /*
            r4 = this;
            r4.<init>()
            r4.f8575a = r5
            r6.getClass()
            r4.f8576b = r6
            int r5 = r6.length     // Catch: java.lang.ArithmeticException -> L7b
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L7b
            if (r5 <= 0) goto L7d
            int[] r1 = com.google.android.gms.internal.ads.a71.f4404a     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L7b
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L7b
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L45;
                case 3: goto L45;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                default: goto L1c;
            }     // Catch: java.lang.ArithmeticException -> L7b
        L1c:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L7b
            r5.<init>()     // Catch: java.lang.ArithmeticException -> L7b
            throw r5     // Catch: java.lang.ArithmeticException -> L7b
        L22:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            r3 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r3 = r3 >>> r0
            int r0 = 31 - r0
            int r3 = r3 - r5
            int r3 = r3 >>> 31
            int r0 = r0 + r3
            goto L4b
        L31:
            int r0 = r5 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 32 - r0
            goto L4b
        L3a:
            int r0 = r5 + (-1)
            r0 = r0 & r5
            if (r0 != 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            com.google.android.gms.internal.ads.an1.v(r0)     // Catch: java.lang.ArithmeticException -> L7b
        L45:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r5)     // Catch: java.lang.ArithmeticException -> L7b
            int r0 = 31 - r0
        L4b:
            r4.f8578d = r0     // Catch: java.lang.ArithmeticException -> L7b
            int r6 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r3 = 3 - r6
            int r3 = r2 << r3
            r4.e = r3
            int r6 = r0 >> r6
            r4.f8579f = r6
            int r5 = r5 + (-1)
            r4.f8577c = r5
            r4.f8580g = r7
            boolean[] r5 = new boolean[r3]
        L63:
            int r6 = r4.f8579f
            if (r1 >= r6) goto L76
            int r6 = r1 * 8
            int r7 = r4.f8578d
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            int r6 = com.google.android.gms.internal.ads.x21.u(r6, r7)
            r5[r6] = r2
            int r1 = r1 + 1
            goto L63
        L76:
            r4.f8581h = r5
            r4.i = r8
            return
        L7b:
            r5 = move-exception
            goto L85
        L7d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L7b
            java.lang.String r7 = "x (0) must be > 0"
            r5.<init>(r7)     // Catch: java.lang.ArithmeticException -> L7b
            throw r5     // Catch: java.lang.ArithmeticException -> L7b
        L85:
            int r6 = r6.length
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8 + 24
            r0.<init>(r8)
            java.lang.String r8 = "Illegal alphabet length "
            java.lang.String r6 = a5.a.f(r6, r8, r0)
            r7.<init>(r6, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n61.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    public final int a(char c10) {
        if (c10 <= 127) {
            byte b10 = this.f8580g[c10];
            if (b10 == -1) {
                if (c10 > ' ' && c10 != 127) {
                    throw new IOException(p.a.n(new StringBuilder(String.valueOf(c10).length() + 24), "Unrecognized character: ", c10));
                }
                throw new IOException("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
            }
            return b10;
        }
        throw new IOException("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n61) {
            n61 n61Var = (n61) obj;
            if (this.i == n61Var.i && Arrays.equals(this.f8576b, n61Var.f8576b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.f8576b);
        if (true != this.i) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.f8575a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n61(java.lang.String r9, char[] r10) {
        /*
            r8 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r10.length
            if (r4 >= r5) goto L4b
            char r5 = r10[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            if (r7 == 0) goto L38
            r7 = r1[r5]
            if (r7 != r2) goto L1c
            goto L1d
        L1c:
            r6 = r3
        L1d:
            if (r6 == 0) goto L25
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L25:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Duplicate character: %s"
            java.lang.String r9 = com.google.android.gms.internal.ads.ay0.B(r10, r9)
            q.x.n(r9)
            r9 = 0
            throw r9
        L38:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r9 = com.google.android.gms.internal.ads.ay0.B(r10, r9)
            q.x.n(r9)
            r9 = 0
            throw r9
        L4b:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n61.<init>(java.lang.String, char[]):void");
    }
}
