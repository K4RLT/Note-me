package n;
import a0.k0;
import l.a;
import n.j0;
import o.a;
import p0.a;
import p0.b;
import p0.c;
import p0.d;
import q.x;
import r0.m;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20898a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20899b;

    /* renamed from: c, reason: collision with root package name */
    public int f20900c;

    /* renamed from: d, reason: collision with root package name */
    public int f20901d;
    public int e;

    public j0(int i) {
        this.f20898a = p0.f20923a;
        this.f20899b = a.f21373c;
        if (i >= 0) {
            f(d(i));
        } else {
            x.n("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f20901d;
        this.f20899b[d(obj)] = obj;
        if (this.f20901d != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f20901d = 0;
        long[] jArr = this.f20898a;
        if (jArr != p0.f20923a) {
            qe.k.k(-9187201950435737472L, jArr);
            long[] jArr2 = this.f20898a;
            int i = this.f20900c;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        qe.k.j(0, this.f20900c, null, this.f20899b);
        this.e = a(this.f20900c) - this.f20901d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f20900c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f20898a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f20899b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        Object[] objArr;
        int i13;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i14 = -862048943;
        int i15 = i * (-862048943);
        int i16 = i15 ^ (i15 << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f20900c;
        int i20 = i17 & i19;
        int i21 = 0;
        while (true) {
            long[] jArr3 = this.f20898a;
            int i22 = i20 >> 3;
            int i23 = (i20 & 7) << 3;
            long j13 = ((jArr3[i22 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr3[i22] >>> i23);
            long j14 = i18;
            int i24 = i18;
            int i25 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i20 + (Long.numberOfTrailingZeros(j16) >> 3)) & i19;
                int i26 = i14;
                if (kotlin.jvm.internal.a(this.f20899b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i14 = i26;
            }
            int i27 = i14;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int e = e(i17);
                long j17 = 255;
                if (this.e != 0 || ((this.f20898a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i28 = this.f20900c;
                    if (i28 > 8) {
                        int i29 = 8;
                        if (Long.compare((this.f20901d * 32) ^ Long.MIN_VALUE, (i28 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f20898a;
                            int i30 = this.f20900c;
                            Object[] objArr2 = this.f20899b;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = 0;
                            j12 = 128;
                            while (i32 < i31) {
                                long j18 = j17;
                                long j19 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i32++;
                                i29 = i29;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int i33 = i29;
                            int n10 = qe.k.n(jArr4);
                            int i34 = n10 - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[n10] = jArr4[0];
                            int i35 = 0;
                            while (i35 != i30) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j21 = (jArr4[i36] >> i37) & j10;
                                if (j21 == 128 || j21 != 254) {
                                    i35++;
                                } else {
                                    Object obj2 = objArr2[i35];
                                    if (obj2 != null) {
                                        i11 = obj2.hashCode();
                                    } else {
                                        i11 = 0;
                                    }
                                    int i38 = i11 * i27;
                                    int i39 = (i38 ^ (i38 << 16)) >>> 7;
                                    int e8 = e(i39);
                                    int i40 = i39 & i30;
                                    if (((e8 - i40) & i30) / i33 == ((i35 - i40) & i30) / i33) {
                                        long j22 = j20;
                                        jArr4[i36] = ((r7 & 127) << i37) | ((~(j10 << i37)) & jArr4[i36]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i35++;
                                        j20 = j22;
                                    } else {
                                        long j23 = j20;
                                        int i41 = e8 >> 3;
                                        long j24 = jArr4[i41];
                                        int i42 = (e8 & 7) << 3;
                                        if (((j24 >> i42) & j10) == 128) {
                                            i13 = i33;
                                            i12 = i30;
                                            objArr = objArr2;
                                            jArr4[i41] = ((~(j10 << i42)) & j24) | ((r7 & 127) << i42);
                                            jArr4[i36] = (jArr4[i36] & (~(j10 << i37))) | (128 << i37);
                                            objArr[e8] = objArr[i35];
                                            objArr[i35] = null;
                                        } else {
                                            i12 = i30;
                                            objArr = objArr2;
                                            i13 = i33;
                                            jArr4[i41] = ((r7 & 127) << i42) | ((~(j10 << i42)) & j24);
                                            Object obj3 = objArr[e8];
                                            objArr[e8] = objArr[i35];
                                            objArr[i35] = obj3;
                                            i35--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j23) | Long.MIN_VALUE;
                                        i35++;
                                        j20 = j23;
                                        i33 = i13;
                                        i30 = i12;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.e = a(this.f20900c) - this.f20901d;
                            e = e(i17);
                        }
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int b10 = b(this.f20900c);
                    long[] jArr5 = this.f20898a;
                    Object[] objArr3 = this.f20899b;
                    int i43 = this.f20900c;
                    f(b10);
                    long[] jArr6 = this.f20898a;
                    Object[] objArr4 = this.f20899b;
                    int i44 = this.f20900c;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i45];
                            if (obj4 != null) {
                                i10 = obj4.hashCode();
                            } else {
                                i10 = 0;
                            }
                            int i46 = i10 * i27;
                            int i47 = i46 ^ (i46 << 16);
                            int e10 = e(i47 >>> 7);
                            long j25 = i47 & 127;
                            int i48 = e10 >> 3;
                            int i49 = (e10 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = (jArr6[i48] & (~(255 << i49))) | (j25 << i49);
                            jArr[i48] = j26;
                            jArr[(((e10 - 7) & i44) + (i44 & 7)) >> 3] = j26;
                            objArr4[e10] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i17);
                }
                this.f20901d++;
                int i50 = this.e;
                long[] jArr7 = this.f20898a;
                int i51 = e >> 3;
                long j27 = jArr7[i51];
                int i52 = (e & 7) << 3;
                if (((j27 >> i52) & j10) == j12) {
                    i25 = 1;
                }
                this.e = i50 - i25;
                int i53 = this.f20900c;
                long j28 = (j27 & (~(j10 << i52))) | (j11 << i52);
                jArr7[i51] = j28;
                jArr7[(((e - 7) & i53) + (i53 & 7)) >> 3] = j28;
                return e;
            }
            i21 += 8;
            i20 = (i20 + i21) & i19;
            i18 = i24;
            i14 = i27;
        }
    }

    public final int e(int i) {
        int i10 = this.f20900c;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f20898a;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (j0Var.f20901d != this.f20901d) {
            return false;
        }
        Object[] objArr = this.f20899b;
        long[] jArr = this.f20898a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && !j0Var.c(objArr[(i << 3) + i11])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        int i10;
        long[] jArr;
        Object[] objArr;
        if (i > 0) {
            i10 = Math.max(7, c(i));
        } else {
            i10 = 0;
        }
        this.f20900c = i10;
        if (i10 == 0) {
            jArr = p0.f20923a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f20898a = jArr;
        int i12 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.e = a(this.f20900c) - this.f20901d;
        if (i10 == 0) {
            objArr = a.f21373c;
        } else {
            objArr = new Object[i10];
        }
        this.f20899b = objArr;
    }

    public final boolean g() {
        if (this.f20901d == 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f20901d != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10 = (this.f20900c * 31) + this.f20901d;
        Object[] objArr = this.f20899b;
        long[] jArr = this.f20898a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            if (!kotlin.jvm.internal.a(obj, this)) {
                                if (obj != null) {
                                    i = obj.hashCode();
                                } else {
                                    i = 0;
                                }
                                i10 += i;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return i10;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f20900c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f20898a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f20899b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j0.i(java.lang.Object):void");
    }

    public final void j(Object obj) {
        this.f20899b[d(obj)] = obj;
    }

    public final void k(j0 j0Var) {
        j0Var.getClass();
        Object[] objArr = j0Var.f20899b;
        long[] jArr = j0Var.f20898a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128) {
                            j(objArr[(i << 3) + i11]);
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f20900c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f20898a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f20899b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: n.j0.l(java.lang.Object):boolean");
    }

    public final void m(int i) {
        this.f20901d--;
        long[] jArr = this.f20898a;
        int i10 = this.f20900c;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f20899b[i] = null;
    }

    public final String toString() {
        k0 k0Var = new k0(27, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f20899b;
        long[] jArr = this.f20898a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i10 = 0;
            loop0: while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i << 3) + i12];
                            if (i10 == -1) {
                                sb2.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i10 != 0) {
                                sb2.append((CharSequence) ", ");
                            }
                            sb2.append((CharSequence) k0Var.invoke(obj));
                            i10++;
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }

    public /* synthetic */ j0() {
        this(6);
    }
}
