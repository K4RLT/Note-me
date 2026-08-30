package com.google.android.gms.internal.ads;
import m8.a;
import p.a;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    public final q7[] f8272a;

    public m8(List list) {
        this.f8272a = (q7[]) list.toArray(new q7[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r11.l(r5) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.y51 a(java.lang.Class r10, com.google.android.gms.internal.ads.i31 r11) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.b51 r0 = com.google.android.gms.internal.ads.d51.f5314v
            java.lang.String r0 = "initialCapacity"
            r1 = 4
            com.google.android.gms.internal.ads.ed1.u(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.q7[] r1 = r9.f8272a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L41
            r5 = r1[r3]
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r10.isAssignableFrom(r6)
            if (r6 == 0) goto L2a
            java.lang.Object r5 = r10.cast(r5)
            com.google.android.gms.internal.ads.q7 r5 = (com.google.android.gms.internal.ads.q7) r5
            boolean r6 = r11.l(r5)
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L3e
            int r6 = r0.length
            int r7 = r4 + 1
            int r8 = com.google.android.gms.internal.ads.y41.d(r6, r7)
            if (r8 > r6) goto L37
            goto L3b
        L37:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
        L3b:
            r0[r4] = r5
            r4 = r7
        L3e:
            int r3 = r3 + 1
            goto Lf
        L41:
            com.google.android.gms.internal.ads.y51 r10 = com.google.android.gms.internal.ads.d51.w(r0, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a(java.lang.Class, com.google.android.gms.internal.ads.i31):com.google.android.gms.internal.ads.y51");
    }

    public final m8 b(m8 m8Var) {
        if (m8Var == null) {
            return this;
        }
        return c(m8Var.f8272a);
    }

    public final m8 c(q7... q7VarArr) {
        int length = q7VarArr.length;
        if (length == 0) {
            return this;
        }
        String str = bq0.f4860a;
        q7[] q7VarArr2 = this.f8272a;
        int length2 = q7VarArr2.length;
        Object[] copyOf = Arrays.copyOf(q7VarArr2, length2 + length);
        System.arraycopy(q7VarArr, 0, copyOf, length2, length);
        return new m8((q7[]) copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m8.class == obj.getClass() && Arrays.equals(this.f8272a, ((m8) obj).f8272a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.f8272a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f8272a);
        return a.o(new StringBuilder(String.valueOf(arrays).length() + 8), "entries=", arrays, "");
    }

    public m8(q7... q7VarArr) {
        this.f8272a = q7VarArr;
    }
}
