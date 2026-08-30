package com.google.android.gms.internal.ads;
import g3.a;

import android.os.Build;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vu1 {
    public static final y51 e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu1 f12010f;

    /* renamed from: g, reason: collision with root package name */
    public static final y51 f12011g;

    /* renamed from: h, reason: collision with root package name */
    public static final d61 f12012h;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f12013a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f12014b;

    /* renamed from: c, reason: collision with root package name */
    public final d51 f12015c;

    /* renamed from: d, reason: collision with root package name */
    public final d51 f12016d;

    static {
        y51 q10 = d51.q(12);
        e = q10;
        f12010f = new vu1(d51.q(uu1.f11724d), q10, y51.f12781y);
        Object[] objArr = {2, 5, 6};
        ct.h(objArr, 3);
        f12011g = d51.w(objArr, 3);
        nb nbVar = new nb(4);
        nbVar.e(5, 6);
        nbVar.e(17, 6);
        nbVar.e(7, 6);
        nbVar.e(30, 10);
        nbVar.e(18, 6);
        nbVar.e(6, 8);
        nbVar.e(8, 8);
        nbVar.e(14, 8);
        f12012h = nbVar.q(true);
    }

    public vu1(y51 y51Var, d51 d51Var, List list) {
        for (int i = 0; i < y51Var.f12783x; i++) {
            uu1 uu1Var = (uu1) y51Var.get(i);
            this.f12013a.put(uu1Var.f11725a, uu1Var);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12013a.size(); i11++) {
            i10 = Math.max(i10, ((uu1) this.f12013a.valueAt(i11)).f11726b);
        }
        this.f12014b = i10;
        this.f12015c = d51.u(d51Var);
        this.f12016d = d51.u(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x006a, code lost:
    
        r6 = r8.getSpeakerLayoutChannelMask();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00ae, code lost:
    
        if (r6.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01c2, code lost:
    
        if (r2.isEmpty() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01c5, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01d2, code lost:
    
        if (r2.isEmpty() == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x01f2, code lost:
    
        if (r2.isEmpty() == false) goto L125;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.i51, com.google.android.gms.internal.ads.y41] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.vu1 a(android.content.Context r22, android.content.Intent r23, com.google.android.gms.internal.ads.l50 r24, android.media.AudioDeviceInfo r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vu1.a(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.l50, android.media.AudioDeviceInfo, java.util.List):com.google.android.gms.internal.ads.vu1");
    }

    public static y51 c(int i, int[] iArr) {
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i11 = 0;
        while (i10 < iArr.length) {
            uu1 uu1Var = new uu1(iArr[i10], i);
            int length = objArr.length;
            int i12 = i11 + 1;
            int d2 = y41.d(length, i12);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i11] = uu1Var;
            i10++;
            i11 = i12;
        }
        return d51.w(objArr, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x004a, code lost:
    
        if (r10.indexOfKey(30) < 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair b(com.google.android.gms.internal.ads.mw1 r17, com.google.android.gms.internal.ads.l50 r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vu1.b(com.google.android.gms.internal.ads.mw1, com.google.android.gms.internal.ads.l50):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r0 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            if (r7 != r8) goto L3
            goto L5a
        L3:
            boolean r0 = r8 instanceof com.google.android.gms.internal.ads.vu1
            r1 = 0
            if (r0 != 0) goto L9
            goto L5c
        L9:
            com.google.android.gms.internal.ads.vu1 r8 = (com.google.android.gms.internal.ads.vu1) r8
            android.util.SparseArray r0 = r8.f12013a
            java.lang.String r2 = com.google.android.gms.internal.ads.bq0.f4860a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            android.util.SparseArray r4 = r7.f12013a
            if (r2 < r3) goto L1e
            boolean r0 = com.google.android.gms.internal.ads.ru1.z(r4, r0)
            if (r0 == 0) goto L5c
            goto L40
        L1e:
            int r2 = r4.size()
            int r3 = r0.size()
            if (r2 != r3) goto L5c
            r3 = r1
        L29:
            if (r3 >= r2) goto L40
            int r5 = r4.keyAt(r3)
            java.lang.Object r6 = r4.valueAt(r3)
            java.lang.Object r5 = r0.get(r5)
            boolean r5 = java.util.Objects.equals(r6, r5)
            if (r5 == 0) goto L5c
            int r3 = r3 + 1
            goto L29
        L40:
            int r0 = r7.f12014b
            int r2 = r8.f12014b
            if (r0 != r2) goto L5c
            com.google.android.gms.internal.ads.d51 r0 = r7.f12015c
            com.google.android.gms.internal.ads.d51 r2 = r8.f12015c
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L5c
            com.google.android.gms.internal.ads.d51 r0 = r7.f12016d
            com.google.android.gms.internal.ads.d51 r8 = r8.f12016d
            boolean r8 = java.util.Objects.equals(r0, r8)
            if (r8 == 0) goto L5c
        L5a:
            r8 = 1
            return r8
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vu1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        String str = bq0.f4860a;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f12013a;
        if (i10 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i11 = 17;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                i11 = Objects.hashCode(sparseArray.valueAt(i12)) + ((sparseArray.keyAt(i12) + (i11 * 31)) * 31);
            }
            i = i11;
        }
        return Objects.hashCode(this.f12016d) + ((Objects.hashCode(this.f12015c) + (((this.f12014b * 31) + i) * 31)) * 31);
    }

    public final String toString() {
        String obj = this.f12013a.toString();
        String valueOf = String.valueOf(this.f12015c);
        String valueOf2 = String.valueOf(this.f12016d);
        int i = this.f12014b;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 28 + valueOf.length() + 26 + valueOf2.length() + 1);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i);
        sb2.append(", audioProfiles=");
        sb2.append(obj);
        a.t(sb2, ", speakerLayoutChannelMasks=", valueOf, ", spatializerChannelMasks=", valueOf2);
        sb2.append("]");
        return sb2.toString();
    }
}
