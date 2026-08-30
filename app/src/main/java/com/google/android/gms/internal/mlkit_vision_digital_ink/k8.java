package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class k8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14553a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f14554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14555c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14556d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f14557f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f14558g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14559h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x007f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k8(java.lang.String r8, char[] r9, byte[] r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.k8.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    public final int a(char c10) {
        if (c10 <= 127) {
            byte b10 = this.f14557f[c10];
            if (b10 == -1) {
                if (c10 > ' ' && c10 != 127) {
                    throw new IOException("Unrecognized character: " + c10);
                }
                throw new IOException("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
            }
            return b10;
        }
        throw new IOException("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c10))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k8) {
            k8 k8Var = (k8) obj;
            if (this.f14559h == k8Var.f14559h && Arrays.equals(this.f14554b, k8Var.f14554b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.f14554b);
        if (true != this.f14559h) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.f14553a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k8(java.lang.String r9, char[] r10) {
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
            java.lang.String r9 = com.google.android.gms.internal.mlkit_vision_digital_ink.tl.e(r10, r9)
            x.n(r9)
            r9 = 0
            throw r9
        L38:
            java.lang.Character r9 = java.lang.Character.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "Non-ASCII character: %s"
            java.lang.String r9 = com.google.android.gms.internal.mlkit_vision_digital_ink.tl.e(r10, r9)
            x.n(r9)
            r9 = 0
            throw r9
        L4b:
            r8.<init>(r9, r10, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.k8.<init>(java.lang.String, char[]):void");
    }
}
