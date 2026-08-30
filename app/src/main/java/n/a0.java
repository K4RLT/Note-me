package n;
import a0.b;
import a0.e;
import a0.g;
import x.n;
import n.a0;
import o.a;
import p0.b;
import p0.c;
import p0.d;
import q.x;
import r0.e;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20835a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f20836b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f20837c;

    /* renamed from: d, reason: collision with root package name */
    public int f20838d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f20839f;

    public a0(int i) {
        this.f20835a = p0.f20923a;
        this.f20836b = p.f20922a;
        this.f20837c = a.f21373c;
        if (i >= 0) {
            f(d(i));
        } else {
            x.n("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.f20835a;
        if (jArr != p0.f20923a) {
            qe.k.k(-9187201950435737472L, jArr);
            long[] jArr2 = this.f20835a;
            int i = this.f20838d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        qe.k.j(0, this.f20838d, null, this.f20837c);
        this.f20839f = a(this.f20838d) - this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f20838d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f20835a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.f20836b
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a0.b(long):boolean");
    }

    public final int c(long j10) {
        long j11;
        long j12;
        int i;
        int i10;
        long j13;
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i11;
        long[] jArr3;
        int i12 = -862048943;
        int hashCode = Long.hashCode(j10) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f20838d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr4 = this.f20835a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j14 = ((jArr4[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr4[i19] >>> i20);
            long j15 = i15;
            int i22 = i18;
            int i23 = 0;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (~j16) & (j16 - 72340172838076673L) & (-9187201950435737472L);
            while (j17 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j17) >> 3)) & i16;
                int i24 = i12;
                if (this.f20836b[numberOfTrailingZeros] == j10) {
                    return numberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i12 = i24;
            }
            int i25 = i12;
            if ((((~j14) << 6) & j14 & (-9187201950435737472L)) != 0) {
                int d2 = d(i14);
                if (this.f20839f != 0 || ((this.f20835a[d2 >> 3] >> ((d2 & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j15;
                    i = 0;
                    i10 = 1;
                    j13 = 128;
                } else {
                    int i26 = this.f20838d;
                    if (i26 > 8) {
                        j13 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i26 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr5 = this.f20835a;
                            int i27 = this.f20838d;
                            long[] jArr6 = this.f20836b;
                            Object[] objArr2 = this.f20837c;
                            int i28 = (i27 + 7) >> 3;
                            j11 = 255;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j18 = jArr5[i29] & (-9187201950435737472L);
                                jArr5[i29] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i29++;
                                i21 = i21;
                                i23 = i23;
                                j15 = j15;
                            }
                            j12 = j15;
                            i = i23;
                            int i30 = i21;
                            char c10 = 7;
                            int n10 = qe.k.n(jArr5);
                            int i31 = n10 - 1;
                            long j19 = 72057594037927935L;
                            jArr5[i31] = (jArr5[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[n10] = jArr5[i];
                            int i32 = i;
                            while (i32 != i27) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j20 = (jArr5[i33] >> i34) & 255;
                                if (j20 == 128 || j20 != 254) {
                                    i32++;
                                } else {
                                    int hashCode2 = Long.hashCode(jArr6[i32]) * i25;
                                    int i35 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int d10 = d(i35);
                                    int i36 = i35 & i27;
                                    char c11 = c10;
                                    if (((d10 - i36) & i27) / 8 == ((i32 - i36) & i27) / 8) {
                                        int i37 = i30;
                                        long j21 = j19;
                                        jArr5[i33] = ((r9 & 127) << i34) | (jArr5[i33] & (~(255 << i34)));
                                        jArr5[jArr5.length - i37] = (jArr5[i] & j21) | Long.MIN_VALUE;
                                        i32++;
                                        i30 = i37;
                                        c10 = c11;
                                        j19 = j21;
                                    } else {
                                        int i38 = i30;
                                        long j22 = j19;
                                        int i39 = d10 >> 3;
                                        long j23 = jArr5[i39];
                                        int i40 = (d10 & 7) << 3;
                                        if (((j23 >> i40) & 255) == 128) {
                                            i11 = i38;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i39] = (j23 & (~(255 << i40))) | ((r9 & 127) << i40);
                                            jArr5[i33] = (jArr5[i33] & (~(255 << i34))) | (128 << i34);
                                            jArr3[d10] = jArr3[i32];
                                            jArr3[i32] = 0;
                                            objArr[d10] = objArr[i32];
                                            objArr[i32] = null;
                                        } else {
                                            objArr = objArr2;
                                            i11 = i38;
                                            jArr3 = jArr6;
                                            jArr5[i39] = ((r9 & 127) << i40) | (j23 & (~(255 << i40)));
                                            long j24 = jArr3[d10];
                                            jArr3[d10] = jArr3[i32];
                                            jArr3[i32] = j24;
                                            Object obj = objArr[d10];
                                            objArr[d10] = objArr[i32];
                                            objArr[i32] = obj;
                                            i32--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i] & j22) | Long.MIN_VALUE;
                                        i32++;
                                        jArr6 = jArr3;
                                        i30 = i11;
                                        c10 = c11;
                                        j19 = j22;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            i10 = i30;
                            this.f20839f = a(this.f20838d) - this.e;
                            d2 = d(i14);
                        }
                    } else {
                        j13 = 128;
                    }
                    j11 = 255;
                    j12 = j15;
                    i = 0;
                    i10 = 1;
                    int b10 = b(this.f20838d);
                    long[] jArr7 = this.f20835a;
                    long[] jArr8 = this.f20836b;
                    Object[] objArr3 = this.f20837c;
                    int i41 = this.f20838d;
                    f(b10);
                    long[] jArr9 = this.f20835a;
                    long[] jArr10 = this.f20836b;
                    Object[] objArr4 = this.f20837c;
                    int i42 = this.f20838d;
                    int i43 = 0;
                    while (i43 < i41) {
                        if (((jArr7[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j13) {
                            long j25 = jArr8[i43];
                            int hashCode3 = Long.hashCode(j25) * i25;
                            int i44 = hashCode3 ^ (hashCode3 << 16);
                            int d11 = d(i44 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j26 = i44 & 127;
                            int i45 = d11 >> 3;
                            int i46 = (d11 & 7) << 3;
                            long j27 = (jArr[i45] & (~(255 << i46))) | (j26 << i46);
                            jArr[i45] = j27;
                            jArr[(((d11 - 7) & i42) + (i42 & 7)) >> 3] = j27;
                            jArr10[d11] = j25;
                            objArr4[d11] = objArr3[i43];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i43++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    d2 = d(i14);
                }
                this.e++;
                int i47 = this.f20839f;
                long[] jArr11 = this.f20835a;
                int i48 = d2 >> 3;
                long j28 = jArr11[i48];
                int i49 = (d2 & 7) << 3;
                if (((j28 >> i49) & j11) != j13) {
                    i10 = i;
                }
                this.f20839f = i47 - i10;
                int i50 = this.f20838d;
                long j29 = (j28 & (~(j11 << i49))) | (j12 << i49);
                jArr11[i48] = j29;
                jArr11[(((d2 - 7) & i50) + (i50 & 7)) >> 3] = j29;
                return d2;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i25;
        }
    }

    public final int d(int i) {
        int i10 = this.f20838d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f20835a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f20838d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f20835a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f20836b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r0 = r14.f20837c
            r0 = r0[r10]
            return r0
        L6d:
            r0 = 0
            return r0
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a0.e(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof n.a0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            n.a0 r1 = (n.a0) r1
            int r3 = r1.e
            int r5 = e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f20836b
            java.lang.Object[] r5 = r0.f20837c
            long[] r6 = r0.f20835a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L87
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L7c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L76
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L6c
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L61
            java.lang.Object r14 = r1.e(r2)
            if (r14 != 0) goto L60
            boolean r2 = r1.b(r2)
            if (r2 != 0) goto L6f
        L60:
            return r4
        L61:
            java.lang.Object r2 = r1.e(r2)
            boolean r2 = r14.equals(r2)
            if (r2 != 0) goto L6f
            return r4
        L6c:
            r15 = r2
            r16 = r3
        L6f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L76:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L88
            goto L7f
        L7c:
            r15 = r2
            r16 = r3
        L7f:
            if (r8 == r7) goto L88
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L87:
            r15 = r2
        L88:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a0.equals(java.lang.Object):boolean");
    }

    public final void f(int i) {
        int i10;
        long[] jArr;
        if (i > 0) {
            i10 = Math.max(7, c(i));
        } else {
            i10 = 0;
        }
        this.f20838d = i10;
        if (i10 == 0) {
            jArr = p0.f20923a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f20835a = jArr;
        int i12 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f20839f = a(this.f20838d) - this.e;
        this.f20836b = new long[i10];
        this.f20837c = new Object[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f20838d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f20835a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f20836b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L99
            r10 = -1
        L66:
            r0 = 0
            if (r10 < 0) goto L98
            int r1 = r14.e
            int r1 = r1 + (-1)
            r14.e = r1
            long[] r1 = r14.f20835a
            int r2 = r14.f20838d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r1 = r14.f20837c
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L98:
            return r0
        L99:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.a0.g(long):java.lang.Object");
    }

    public final void h(long j10, Object obj) {
        int c10 = c(j10);
        this.f20836b[c10] = j10;
        this.f20837c[c10] = obj;
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.f20836b;
        Object[] objArr = this.f20837c;
        long[] jArr2 = this.f20835a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        long j11 = jArr[i14];
                        Object obj = objArr[i14];
                        int hashCode = Long.hashCode(j11);
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i11 += i ^ hashCode;
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 != length) {
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final String toString() {
        int i;
        int i10;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f20836b;
        Object[] objArr = this.f20837c;
        long[] jArr2 = this.f20835a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr2[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            i10 = i11;
                            long j11 = jArr[i15];
                            Object obj = objArr[i15];
                            sb2.append(j11);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i12++;
                            if (i12 < this.e) {
                                sb2.append(", ");
                            }
                        } else {
                            i10 = i11;
                        }
                        j10 >>= 8;
                        i14++;
                        i11 = i10;
                    }
                    int i16 = i11;
                    if (i13 != 8) {
                        break;
                    }
                    i = i16;
                } else {
                    i = i11;
                }
                if (i == length) {
                    break;
                }
                i11 = i + 1;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ a0() {
        this(6);
    }
}
