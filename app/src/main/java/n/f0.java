package n;
import a0.k0;
import l.a;
import n.f0;
import p0.b;
import p0.c;
import p0.d;
import q.x;
import r0.h;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20868a = p0.f20923a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20869b = a.f21373c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f20870c = r.f20930b;

    /* renamed from: d, reason: collision with root package name */
    public int f20871d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f20872f;

    /* renamed from: g, reason: collision with root package name */
    public int f20873g;

    /* renamed from: h, reason: collision with root package name */
    public int f20874h;

    public f0(int i) {
        if (i >= 0) {
            f(d(i));
        } else {
            x.n("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i = this.f20873g;
        int d2 = d(obj);
        this.f20869b[d2] = obj;
        long[] jArr = this.f20870c;
        int i10 = this.f20871d;
        jArr[d2] = (i10 & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((d2 & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f20871d = d2;
        if (this.e == Integer.MAX_VALUE) {
            this.e = d2;
        }
        if (this.f20873g != i) {
            return true;
        }
        return false;
    }

    public final void b() {
        this.f20873g = 0;
        long[] jArr = this.f20868a;
        if (jArr != p0.f20923a) {
            qe.k.k(-9187201950435737472L, jArr);
            long[] jArr2 = this.f20868a;
            int i = this.f20872f;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        qe.k.j(0, this.f20872f, null, this.f20869b);
        qe.k.k(4611686018427387903L, this.f20870c);
        this.f20871d = Integer.MAX_VALUE;
        this.e = Integer.MAX_VALUE;
        this.f20874h = a(this.f20872f) - this.f20873g;
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
            int r5 = r0.f20872f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f20868a
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
            java.lang.Object[] r15 = r0.f20869b
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
        throw new UnsupportedOperationException("Method not decompiled: n.f0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i;
        int i10;
        long j10;
        long j11;
        long j12;
        char c10;
        int i11;
        int i12;
        long[] jArr;
        long[] jArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        long j13;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i17 = -862048943;
        int i18 = i * (-862048943);
        int i19 = i18 ^ (i18 << 16);
        int i20 = i19 >>> 7;
        int i21 = i19 & 127;
        int i22 = this.f20872f;
        int i23 = i20 & i22;
        int i24 = 0;
        while (true) {
            long[] jArr3 = this.f20868a;
            int i25 = i23 >> 3;
            int i26 = (i23 & 7) << 3;
            long j14 = ((jArr3[i25 + 1] << (64 - i26)) & ((-i26) >> 63)) | (jArr3[i25] >>> i26);
            long j15 = i21;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i23) & i22;
                int i27 = i17;
                if (kotlin.jvm.internal.a(this.f20869b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i17 = i27;
            }
            int i28 = i17;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int e = e(i20);
                long j18 = 255;
                if (this.f20874h != 0 || ((this.f20868a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    i10 = 0;
                    j10 = j15;
                    j11 = 255;
                    j12 = 128;
                } else {
                    int i29 = this.f20872f;
                    if (i29 > 8) {
                        c10 = 31;
                        j12 = 128;
                        if (Long.compare((this.f20873g * 32) ^ Long.MIN_VALUE, (i29 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f20868a;
                            if (jArr4 == null) {
                                i10 = 0;
                                j10 = j15;
                                j11 = 255;
                            } else {
                                int i30 = this.f20872f;
                                Object[] objArr = this.f20869b;
                                long[] jArr5 = this.f20870c;
                                long[] jArr6 = new long[i30];
                                Arrays.fill(jArr6, 0, i30, 9223372034707292159L);
                                i10 = 0;
                                int i31 = (i30 + 7) >> 3;
                                int i32 = 0;
                                while (i32 < i31) {
                                    long j19 = j18;
                                    long j20 = jArr4[i32] & (-9187201950435737472L);
                                    int i33 = i32;
                                    jArr4[i33] = ((~j20) + (j20 >>> 7)) & (-72340172838076674L);
                                    i32 = i33 + 1;
                                    j18 = j19;
                                }
                                j11 = j18;
                                int length = jArr4.length;
                                int i34 = length - 1;
                                int i35 = length - 2;
                                jArr4[i35] = (jArr4[i35] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i34] = jArr4[0];
                                int i36 = 0;
                                while (i36 != i30) {
                                    int i37 = i36 >> 3;
                                    int i38 = (i36 & 7) << 3;
                                    long j21 = (jArr4[i37] >> i38) & j11;
                                    if (j21 == 128 || j21 != 254) {
                                        i36++;
                                    } else {
                                        Object obj2 = objArr[i36];
                                        if (obj2 != null) {
                                            i16 = obj2.hashCode();
                                        } else {
                                            i16 = 0;
                                        }
                                        int i39 = i16 * i28;
                                        int i40 = (i39 ^ (i39 << 16)) >>> 7;
                                        int e8 = e(i40);
                                        int i41 = i40 & i30;
                                        if (((e8 - i41) & i30) / 8 == ((i36 - i41) & i30) / 8) {
                                            int i42 = i30;
                                            Object[] objArr2 = objArr;
                                            jArr4[i37] = (jArr4[i37] & (~(j11 << i38))) | ((r17 & 127) << i38);
                                            if (jArr6[i36] == 9223372034707292159L) {
                                                long j22 = i36;
                                                jArr6[i36] = j22 | (j22 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i36++;
                                            i30 = i42;
                                            objArr = objArr2;
                                        } else {
                                            int i43 = i30;
                                            Object[] objArr3 = objArr;
                                            int i44 = e8 >> 3;
                                            long j23 = jArr4[i44];
                                            int i45 = (e8 & 7) << 3;
                                            if (((j23 >> i45) & j11) == 128) {
                                                jArr4[i44] = (j23 & (~(j11 << i45))) | ((r17 & 127) << i45);
                                                jArr4[i37] = (jArr4[i37] & (~(j11 << i38))) | (128 << i38);
                                                objArr3[e8] = objArr3[i36];
                                                objArr3[i36] = null;
                                                jArr5[e8] = jArr5[i36];
                                                jArr5[i36] = 4611686018427387903L;
                                                int i46 = (int) ((jArr6[i36] >> 32) & 4294967295L);
                                                int i47 = Integer.MAX_VALUE;
                                                if (i46 != Integer.MAX_VALUE) {
                                                    j13 = j15;
                                                    jArr6[i46] = e8 | (jArr6[i46] & (-4294967296L));
                                                    jArr6[i36] = (jArr6[i36] & 4294967295L) | (-4294967296L);
                                                    i47 = Integer.MAX_VALUE;
                                                } else {
                                                    j13 = j15;
                                                    jArr6[i36] = (Integer.MAX_VALUE << 32) | e8;
                                                }
                                                jArr6[e8] = (i36 << 32) | i47;
                                            } else {
                                                j13 = j15;
                                                jArr4[i44] = ((r17 & 127) << i45) | (j23 & (~(j11 << i45)));
                                                Object obj3 = objArr3[e8];
                                                objArr3[e8] = objArr3[i36];
                                                objArr3[i36] = obj3;
                                                long j24 = jArr5[e8];
                                                jArr5[e8] = jArr5[i36];
                                                jArr5[i36] = j24;
                                                int i48 = (int) ((jArr6[i36] >> 32) & 4294967295L);
                                                if (i48 != Integer.MAX_VALUE) {
                                                    long j25 = e8;
                                                    jArr6[i48] = (jArr6[i48] & (-4294967296L)) | j25;
                                                    jArr6[i36] = (jArr6[i36] & 4294967295L) | (j25 << 32);
                                                } else {
                                                    long j26 = e8;
                                                    jArr6[i36] = j26 | (j26 << 32);
                                                    i48 = i36;
                                                }
                                                jArr6[e8] = (i48 << 32) | i36;
                                                i36--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i36++;
                                            i30 = i43;
                                            objArr = objArr3;
                                            j15 = j13;
                                        }
                                    }
                                }
                                j10 = j15;
                                this.f20874h = a(this.f20872f) - this.f20873g;
                                long[] jArr7 = this.f20870c;
                                int length2 = jArr7.length;
                                for (int i49 = 0; i49 < length2; i49++) {
                                    long j27 = jArr7[i49];
                                    int i50 = (int) ((j27 >> 31) & 2147483647L);
                                    int i51 = (int) (j27 & 2147483647L);
                                    long j28 = j27 & (-4611686018427387904L);
                                    if (i50 == Integer.MAX_VALUE) {
                                        i14 = Integer.MAX_VALUE;
                                    } else {
                                        i14 = (int) (jArr6[i50] & 4294967295L);
                                    }
                                    long j29 = (j28 | i14) << 31;
                                    if (i51 == Integer.MAX_VALUE) {
                                        i15 = Integer.MAX_VALUE;
                                    } else {
                                        i15 = (int) (jArr6[i51] & 4294967295L);
                                    }
                                    jArr7[i49] = j29 | i15;
                                }
                                int i52 = this.f20871d;
                                if (i52 != Integer.MAX_VALUE) {
                                    this.f20871d = (int) (jArr6[i52] & 4294967295L);
                                }
                                int i53 = this.e;
                                if (i53 != Integer.MAX_VALUE) {
                                    this.e = (int) (jArr6[i53] & 4294967295L);
                                }
                            }
                            e = e(i20);
                        }
                    } else {
                        c10 = 31;
                        j12 = 128;
                    }
                    i10 = 0;
                    j10 = j15;
                    j11 = 255;
                    int b10 = b(this.f20872f);
                    long[] jArr8 = this.f20868a;
                    Object[] objArr4 = this.f20869b;
                    long[] jArr9 = this.f20870c;
                    int i54 = this.f20872f;
                    int[] iArr = new int[i54];
                    f(b10);
                    long[] jArr10 = this.f20868a;
                    Object[] objArr5 = this.f20869b;
                    long[] jArr11 = this.f20870c;
                    int i55 = this.f20872f;
                    int i56 = 0;
                    while (i56 < i54) {
                        if (((jArr8[i56 >> 3] >> ((i56 & 7) << 3)) & 255) < j12) {
                            Object obj4 = objArr4[i56];
                            if (obj4 != null) {
                                i13 = obj4.hashCode();
                            } else {
                                i13 = 0;
                            }
                            int i57 = i13 * i28;
                            int i58 = i57 ^ (i57 << 16);
                            int e10 = e(i58 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j30 = i58 & 127;
                            int i59 = e10 >> 3;
                            int i60 = (e10 & 7) << 3;
                            long j31 = (jArr[i59] & (~(255 << i60))) | (j30 << i60);
                            jArr[i59] = j31;
                            jArr[(((e10 - 7) & i55) + (i55 & 7)) >> 3] = j31;
                            objArr5[e10] = obj4;
                            jArr11[e10] = jArr9[i56];
                            iArr[i56] = e10;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i56++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f20870c;
                    int length3 = jArr12.length;
                    for (int i61 = 0; i61 < length3; i61++) {
                        long j32 = jArr12[i61];
                        int i62 = (int) ((j32 >> c10) & 2147483647L);
                        int i63 = (int) (j32 & 2147483647L);
                        long j33 = j32 & (-4611686018427387904L);
                        if (i62 == Integer.MAX_VALUE) {
                            i11 = Integer.MAX_VALUE;
                        } else {
                            i11 = iArr[i62];
                        }
                        long j34 = (j33 | i11) << c10;
                        if (i63 == Integer.MAX_VALUE) {
                            i12 = Integer.MAX_VALUE;
                        } else {
                            i12 = iArr[i63];
                        }
                        jArr12[i61] = j34 | i12;
                    }
                    int i64 = this.f20871d;
                    if (i64 != Integer.MAX_VALUE) {
                        this.f20871d = iArr[i64];
                    }
                    int i65 = this.e;
                    if (i65 != Integer.MAX_VALUE) {
                        this.e = iArr[i65];
                    }
                    e = e(i20);
                }
                this.f20873g++;
                int i66 = this.f20874h;
                long[] jArr13 = this.f20868a;
                int i67 = e >> 3;
                long j35 = jArr13[i67];
                int i68 = (e & 7) << 3;
                if (((j35 >> i68) & j11) == j12) {
                    i10 = 1;
                }
                this.f20874h = i66 - i10;
                int i69 = this.f20872f;
                long j36 = (j35 & (~(j11 << i68))) | (j10 << i68);
                jArr13[i67] = j36;
                jArr13[(((e - 7) & i69) + (i69 & 7)) >> 3] = j36;
                return e;
            }
            i24 += 8;
            i23 = (i23 + i24) & i22;
            i17 = i28;
        }
    }

    public final int e(int i) {
        int i10 = this.f20872f;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f20868a;
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
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (f0Var.f20873g != this.f20873g) {
            return false;
        }
        Object[] objArr = this.f20869b;
        long[] jArr = this.f20868a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && !f0Var.c(objArr[(i << 3) + i11])) {
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
        long[] jArr2;
        if (i > 0) {
            i10 = Math.max(7, c(i));
        } else {
            i10 = 0;
        }
        this.f20872f = i10;
        if (i10 == 0) {
            jArr = p0.f20923a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i11];
            Arrays.fill(jArr3, 0, i11, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f20868a = jArr;
        int i12 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f20874h = a(this.f20872f) - this.f20873g;
        if (i10 == 0) {
            objArr = a.f21373c;
        } else {
            objArr = new Object[i10];
        }
        this.f20869b = objArr;
        if (i10 == 0) {
            jArr2 = r.f20930b;
        } else {
            long[] jArr4 = new long[i10];
            Arrays.fill(jArr4, 0, i10, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f20870c = jArr2;
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
    public final boolean g(java.lang.Object r18) {
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
            int r5 = r0.f20872f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f20868a
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
            java.lang.Object[] r15 = r0.f20869b
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
            h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f0.g(java.lang.Object):boolean");
    }

    public final void h(int i) {
        this.f20873g--;
        long[] jArr = this.f20868a;
        int i10 = this.f20872f;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f20869b[i] = null;
        long[] jArr2 = this.f20870c;
        long j11 = jArr2[i];
        int i13 = (int) ((j11 >> 31) & 2147483647L);
        int i14 = (int) (j11 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (i14 & 2147483647L);
        } else {
            this.f20871d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.e = i13;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final int hashCode() {
        int i;
        int i10 = (this.f20872f * 31) + this.f20873g;
        Object[] objArr = this.f20869b;
        long[] jArr = this.f20868a;
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

    public final boolean i(Collection collection) {
        collection.getClass();
        Object[] objArr = this.f20869b;
        int i = this.f20873g;
        long[] jArr = this.f20868a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!qe.l.s(collection, objArr[i13])) {
                                h(i13);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        if (i == this.f20873g) {
            return false;
        }
        return true;
    }

    public final String toString() {
        k0 k0Var = new k0(26, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f20869b;
        long[] jArr = this.f20870c;
        int i = this.e;
        int i10 = 0;
        while (true) {
            if (i != Integer.MAX_VALUE) {
                int i11 = (int) ((jArr[i] >> 31) & 2147483647L);
                Object obj = objArr[i];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) k0Var.invoke(obj));
                i10++;
                i = i11;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }
}
