package com.google.android.gms.internal.ads;
import g3.a;
import g5.q;
import p.a;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ns1 extends Exception {
    public final int A;
    public final yx1 B;
    public final boolean C;

    /* renamed from: u, reason: collision with root package name */
    public final int f8836u;

    /* renamed from: v, reason: collision with root package name */
    public final long f8837v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8838w;

    /* renamed from: x, reason: collision with root package name */
    public final String f8839x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8840y;

    /* renamed from: z, reason: collision with root package name */
    public final mw1 f8841z;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ns1(int r14, java.lang.Exception r15, int r16, java.lang.String r17, int r18, com.google.android.gms.internal.ads.mw1 r19, int r20, com.google.android.gms.internal.ads.yx1 r21, boolean r22) {
        /*
            r13 = this;
            r8 = r20
            r0 = 0
            if (r14 == 0) goto L75
            r1 = 1
            if (r14 == r1) goto L10
            java.lang.String r1 = "Unexpected runtime error"
            r5 = r17
            r6 = r18
            goto L7b
        L10:
            java.lang.String r2 = java.lang.String.valueOf(r19)
            java.lang.String r3 = com.google.android.gms.internal.ads.bq0.f4860a
            if (r8 == 0) goto L33
            if (r8 == r1) goto L30
            r1 = 2
            if (r8 == r1) goto L2d
            r1 = 3
            if (r8 == r1) goto L2a
            r1 = 4
            if (r8 != r1) goto L26
            java.lang.String r1 = "YES"
            goto L35
        L26:
            q.l()
            throw r0
        L2a:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L35
        L2d:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L35
        L30:
            java.lang.String r1 = "NO_UNSUPPORTED_SUBTYPE"
            goto L35
        L33:
            java.lang.String r1 = "NO"
        L35:
            java.lang.String r3 = java.lang.String.valueOf(r17)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r18)
            int r3 = r3 + 14
            r5 = 9
            int r3 = a.v(r4, r3, r5)
            int r4 = r2.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r4 + 19
            int r5 = r1.length()
            int r5 = r5 + r4
            r3.<init>(r5)
            r5 = r17
            r3.append(r5)
            java.lang.String r4 = " error, index="
            r3.append(r4)
            r6 = r18
            r3.append(r6)
            java.lang.String r4 = ", format="
            r3.append(r4)
            java.lang.String r4 = ", format_supported="
            java.lang.String r1 = a.o(r3, r2, r4, r1)
            goto L7b
        L75:
            r5 = r17
            r6 = r18
            java.lang.String r1 = "Source error"
        L7b:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L87
            java.lang.String r0 = ": null"
            java.lang.String r1 = r1.concat(r0)
        L87:
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r7 = r19
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ns1.<init>(int, java.lang.Exception, int, java.lang.String, int, com.google.android.gms.internal.ads.mw1, int, com.google.android.gms.internal.ads.yx1, boolean):void");
    }

    public final ns1 a(yx1 yx1Var) {
        String message = getMessage();
        String str = bq0.f4860a;
        return new ns1(message, getCause(), this.f8836u, this.f8838w, this.f8839x, this.f8840y, this.f8841z, this.A, yx1Var, this.f8837v, this.C);
    }

    public ns1(int i, Exception exc, int i10) {
        this(i, exc, i10, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns1(String str, Throwable th, int i, int i10, String str2, int i11, mw1 mw1Var, int i12, yx1 yx1Var, long j10, boolean z3) {
        super(str, th);
        boolean z9;
        Bundle bundle = Bundle.EMPTY;
        this.f8836u = i;
        this.f8837v = j10;
        if (!z3) {
            z9 = true;
        } else if (i10 == 1) {
            i10 = 1;
            z9 = true;
        } else {
            z9 = false;
        }
        b80.l(z9);
        b80.l(th != null);
        this.f8838w = i10;
        this.f8839x = str2;
        this.f8840y = i11;
        this.f8841z = mw1Var;
        this.A = i12;
        this.B = yx1Var;
        this.C = z3;
    }
}
