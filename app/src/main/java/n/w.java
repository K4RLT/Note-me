package n;
import n.w;
import o.a;
import p0.a;
import p0.b;
import p0.c;
import p0.d;
import q.x;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w extends k {

    /* renamed from: f, reason: collision with root package name */
    public int f20954f;

    public w(int i) {
        boolean z3;
        this.f20902a = p0.f20923a;
        this.f20903b = m.f20915a;
        this.f20904c = a.f21373c;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f(d(i));
        } else {
            x.n("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.f20902a;
        if (jArr != p0.f20923a) {
            qe.k.k(-9187201950435737472L, jArr);
            long[] jArr2 = this.f20902a;
            int i = this.f20905d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        qe.k.j(0, this.f20905d, null, this.f20904c);
        this.f20954f = a(this.f20905d) - this.e;
    }

    public final int d(int i) {
        long j10;
        long j11;
        int i10;
        long j12;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i11;
        int i12 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i13 = hashCode ^ (hashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f20905d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f20902a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            long j13 = ((jArr3[i19 + 1] << (64 - i20)) & ((-i20) >> 63)) | (jArr3[i19] >>> i20);
            long j14 = i15;
            int i22 = i18;
            int i23 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                int i24 = i12;
                int i25 = i23;
                if (this.f20903b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i24;
                i23 = i25;
            }
            int i26 = i12;
            int i27 = i23;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int e = e(i14);
                long j17 = 255;
                if (this.f20954f != 0 || ((this.f20902a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    i10 = 1;
                    j12 = 128;
                } else {
                    int i28 = this.f20905d;
                    if (i28 > 8) {
                        j12 = 128;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i28 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f20902a;
                            int i29 = this.f20905d;
                            int[] iArr2 = this.f20903b;
                            Object[] objArr2 = this.f20904c;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = i27;
                            while (i31 < i30) {
                                long j18 = j17;
                                long j19 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i31++;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int n10 = qe.k.n(jArr4);
                            int i32 = n10 - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[n10] = jArr4[i27];
                            int i33 = i27;
                            while (i33 != i29) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j21 = (jArr4[i34] >> i35) & j10;
                                if (j21 == 128 || j21 != 254) {
                                    i33++;
                                } else {
                                    int hashCode2 = Integer.hashCode(iArr2[i33]) * i26;
                                    int i36 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e8 = e(i36);
                                    int i37 = i36 & i29;
                                    if (((e8 - i37) & i29) / 8 == ((i33 - i37) & i29) / 8) {
                                        long j22 = j20;
                                        jArr4[i34] = ((r8 & 127) << i35) | ((~(j10 << i35)) & jArr4[i34]);
                                        jArr4[jArr4.length - i21] = (jArr4[i27] & j22) | Long.MIN_VALUE;
                                        i33++;
                                        j20 = j22;
                                    } else {
                                        long j23 = j20;
                                        int i38 = e8 >> 3;
                                        long j24 = jArr4[i38];
                                        int i39 = (e8 & 7) << 3;
                                        if (((j24 >> i39) & j10) == 128) {
                                            i11 = i21;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i38] = ((~(j10 << i39)) & j24) | ((r8 & 127) << i39);
                                            jArr4[i34] = (jArr4[i34] & (~(j10 << i35))) | (128 << i35);
                                            iArr[e8] = iArr[i33];
                                            iArr[i33] = i27;
                                            objArr[e8] = objArr[i33];
                                            objArr[i33] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i11 = i21;
                                            jArr4[i38] = ((r8 & 127) << i39) | ((~(j10 << i39)) & j24);
                                            int i40 = iArr[e8];
                                            iArr[e8] = iArr[i33];
                                            iArr[i33] = i40;
                                            Object obj = objArr[e8];
                                            objArr[e8] = objArr[i33];
                                            objArr[i33] = obj;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i27] & j23) | Long.MIN_VALUE;
                                        i33++;
                                        j20 = j23;
                                        i21 = i11;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            i10 = i21;
                            this.f20954f = a(this.f20905d) - this.e;
                            e = e(i14);
                        }
                    } else {
                        j12 = 128;
                    }
                    j10 = 255;
                    j11 = j14;
                    i10 = 1;
                    int b10 = b(this.f20905d);
                    long[] jArr5 = this.f20902a;
                    int[] iArr3 = this.f20903b;
                    Object[] objArr3 = this.f20904c;
                    int i41 = this.f20905d;
                    f(b10);
                    long[] jArr6 = this.f20902a;
                    int[] iArr4 = this.f20903b;
                    Object[] objArr4 = this.f20904c;
                    int i42 = this.f20905d;
                    int i43 = i27;
                    while (i43 < i41) {
                        if (((jArr5[i43 >> 3] >> ((i43 & 7) << 3)) & 255) < j12) {
                            int i44 = iArr3[i43];
                            int hashCode3 = Integer.hashCode(i44) * i26;
                            int i45 = hashCode3 ^ (hashCode3 << 16);
                            int e10 = e(i45 >>> 7);
                            long j25 = i45 & 127;
                            int i46 = e10 >> 3;
                            int i47 = (e10 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = (jArr6[i46] & (~(255 << i47))) | (j25 << i47);
                            jArr[i46] = j26;
                            jArr[(((e10 - 7) & i42) + (i42 & 7)) >> 3] = j26;
                            iArr4[e10] = i44;
                            objArr4[e10] = objArr3[i43];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i43++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i14);
                }
                this.e++;
                int i48 = this.f20954f;
                long[] jArr7 = this.f20902a;
                int i49 = e >> 3;
                long j27 = jArr7[i49];
                int i50 = (e & 7) << 3;
                if (((j27 >> i50) & j10) != j12) {
                    i10 = i27;
                }
                this.f20954f = i48 - i10;
                int i51 = this.f20905d;
                long j28 = (j27 & (~(j10 << i50))) | (j11 << i50);
                jArr7[i49] = j28;
                jArr7[(((e - 7) & i51) + (i51 & 7)) >> 3] = j28;
                return e;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i12 = i26;
        }
    }

    public final int e(int i) {
        int i10 = this.f20905d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f20902a;
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

    public final void f(int i) {
        int i10;
        long[] jArr;
        if (i > 0) {
            i10 = Math.max(7, c(i));
        } else {
            i10 = 0;
        }
        this.f20905d = i10;
        if (i10 == 0) {
            jArr = p0.f20923a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f20902a = jArr;
        int i12 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f20954f = a(this.f20905d) - this.e;
        this.f20903b = new int[i10];
        this.f20904c = new Object[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f20905d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f20902a
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
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f20903b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.h(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: n.w.g(int):java.lang.Object");
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.f20902a;
        int i10 = this.f20905d;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        Object[] objArr = this.f20904c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void i(int i, Object obj) {
        int d2 = d(i);
        this.f20903b[d2] = i;
        this.f20904c[d2] = obj;
    }

    public /* synthetic */ w() {
        this(6);
    }
}
