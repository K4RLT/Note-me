package n;
import l.a;
import o.a;
import p0.a;
import p0.b;
import p0.c;
import p0.d;
import q.x;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f20849a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f20850b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f20851c;

    /* renamed from: d, reason: collision with root package name */
    public int f20852d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f20853f;

    public c0(int i) {
        boolean z3;
        this.f20849a = p0.f20923a;
        this.f20850b = a.f21373c;
        this.f20851c = m.f20915a;
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

    public final void a() {
        this.e = 0;
        long[] jArr = this.f20849a;
        if (jArr != p0.f20923a) {
            qe.k.k(-9187201950435737472L, jArr);
            long[] jArr2 = this.f20849a;
            int i = this.f20852d;
            int i10 = i >> 3;
            long j10 = 255 << ((i & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
        }
        qe.k.j(0, this.f20852d, null, this.f20850b);
        this.f20853f = a(this.f20852d) - this.e;
    }

    public final int b(int i) {
        int i10 = this.f20852d;
        int i11 = i & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f20849a;
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

    public final int c(Object obj) {
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
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i13 = -862048943;
        int i14 = i * (-862048943);
        int i15 = i14 ^ (i14 << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f20852d;
        int i19 = i16 & i18;
        int i20 = 0;
        while (true) {
            long[] jArr3 = this.f20849a;
            int i21 = i19 >> 3;
            int i22 = (i19 & 7) << 3;
            long j13 = ((jArr3[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr3[i21] >>> i22);
            long j14 = i17;
            int i23 = i17;
            int i24 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int numberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j16) >> 3)) & i18;
                int i25 = i13;
                if (kotlin.jvm.internal.a(this.f20850b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i13 = i25;
            }
            int i26 = i13;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int b10 = b(i16);
                long j17 = 255;
                if (this.f20853f != 0 || ((this.f20849a[b10 >> 3] >> ((b10 & 7) << 3)) & 255) == 254) {
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i27 = this.f20852d;
                    if (i27 > 8) {
                        int i28 = 8;
                        if (Long.compare((this.e * 32) ^ Long.MIN_VALUE, (i27 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f20849a;
                            int i29 = this.f20852d;
                            Object[] objArr2 = this.f20850b;
                            int[] iArr = this.f20851c;
                            j12 = 128;
                            int i30 = (i29 + 7) >> 3;
                            int i31 = 0;
                            while (i31 < i30) {
                                long j18 = j17;
                                long j19 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j19) + (j19 >>> 7));
                                i31++;
                                i28 = i28;
                                j14 = j14;
                                j17 = j18;
                            }
                            j10 = j17;
                            j11 = j14;
                            int i32 = i28;
                            int n10 = qe.k.n(jArr4);
                            int i33 = n10 - 1;
                            long j20 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[n10] = jArr4[0];
                            int i34 = 0;
                            while (i34 != i29) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j21 = (jArr4[i35] >> i36) & j10;
                                if (j21 == 128 || j21 != 254) {
                                    i34++;
                                } else {
                                    Object obj2 = objArr2[i34];
                                    if (obj2 != null) {
                                        i11 = obj2.hashCode();
                                    } else {
                                        i11 = 0;
                                    }
                                    int i37 = i11 * i26;
                                    int i38 = (i37 ^ (i37 << 16)) >>> 7;
                                    int b11 = b(i38);
                                    int i39 = i38 & i29;
                                    long j22 = j20;
                                    if (((b11 - i39) & i29) / 8 == ((i34 - i39) & i29) / i32) {
                                        jArr4[i35] = ((r8 & 127) << i36) | (jArr4[i35] & (~(j10 << i36)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i34++;
                                        j20 = j22;
                                        i32 = i32;
                                    } else {
                                        int i40 = i32;
                                        int i41 = b11 >> 3;
                                        long j23 = jArr4[i41];
                                        int i42 = (b11 & 7) << 3;
                                        if (((j23 >> i42) & j10) == 128) {
                                            i12 = i29;
                                            objArr = objArr2;
                                            jArr4[i41] = ((~(j10 << i42)) & j23) | ((r8 & 127) << i42);
                                            jArr4[i35] = (jArr4[i35] & (~(j10 << i36))) | (128 << i36);
                                            objArr[b11] = objArr[i34];
                                            objArr[i34] = null;
                                            iArr[b11] = iArr[i34];
                                            iArr[i34] = 0;
                                        } else {
                                            i12 = i29;
                                            objArr = objArr2;
                                            jArr4[i41] = ((r8 & 127) << i42) | ((~(j10 << i42)) & j23);
                                            Object obj3 = objArr[b11];
                                            objArr[b11] = objArr[i34];
                                            objArr[i34] = obj3;
                                            int i43 = iArr[b11];
                                            iArr[b11] = iArr[i34];
                                            iArr[i34] = i43;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j22) | Long.MIN_VALUE;
                                        i34++;
                                        i29 = i12;
                                        j20 = j22;
                                        i32 = i40;
                                        objArr2 = objArr;
                                    }
                                }
                            }
                            this.f20853f = a(this.f20852d) - this.e;
                            b10 = b(i16);
                        }
                    }
                    j10 = 255;
                    j11 = j14;
                    j12 = 128;
                    int b12 = b(this.f20852d);
                    long[] jArr5 = this.f20849a;
                    Object[] objArr3 = this.f20850b;
                    int[] iArr2 = this.f20851c;
                    int i44 = this.f20852d;
                    f(b12);
                    long[] jArr6 = this.f20849a;
                    Object[] objArr4 = this.f20850b;
                    int[] iArr3 = this.f20851c;
                    int i45 = this.f20852d;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr5[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i46];
                            if (obj4 != null) {
                                i10 = obj4.hashCode();
                            } else {
                                i10 = 0;
                            }
                            int i47 = i10 * i26;
                            int i48 = i47 ^ (i47 << 16);
                            int b13 = b(i48 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = i48 & 127;
                            int i49 = b13 >> 3;
                            int i50 = (b13 & 7) << 3;
                            long j25 = (jArr[i49] & (~(255 << i50))) | (j24 << i50);
                            jArr[i49] = j25;
                            jArr[(((b13 - 7) & i45) + (i45 & 7)) >> 3] = j25;
                            objArr4[b13] = obj4;
                            iArr3[b13] = iArr2[i46];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i46++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    b10 = b(i16);
                }
                this.e++;
                int i51 = this.f20853f;
                long[] jArr7 = this.f20849a;
                int i52 = b10 >> 3;
                long j26 = jArr7[i52];
                int i53 = (b10 & 7) << 3;
                if (((j26 >> i53) & j10) == j12) {
                    i24 = 1;
                }
                this.f20853f = i51 - i24;
                int i54 = this.f20852d;
                long j27 = (j26 & (~(j10 << i53))) | (j11 << i53);
                jArr7[i52] = j27;
                jArr7[(((b10 - 7) & i54) + (i54 & 7)) >> 3] = j27;
                return ~b10;
            }
            i20 += 8;
            i19 = (i19 + i20) & i18;
            i17 = i23;
            i13 = i26;
        }
    }

    public final int d(Object obj) {
        int i;
        int i10 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * (-862048943);
        int i12 = i11 ^ (i11 << 16);
        int i13 = i12 & 127;
        int i14 = this.f20852d;
        int i15 = i12 >>> 7;
        while (true) {
            int i16 = i15 & i14;
            long[] jArr = this.f20849a;
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j10 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j11 = (i13 * 72340172838076673L) ^ j10;
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i16) & i14;
                if (kotlin.jvm.internal.a(this.f20850b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i15 = i16 + i10;
        }
    }

    public final int e(Object obj) {
        int d2 = d(obj);
        if (d2 >= 0) {
            return this.f20851c[d2];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final boolean equals(Object obj) {
        boolean z3;
        boolean z9;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (c0Var.e != this.e) {
            return false;
        }
        Object[] objArr = this.f20850b;
        int[] iArr = this.f20851c;
        long[] jArr = this.f20849a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j10 = jArr[i];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j10) < 128) {
                        int i12 = (i << 3) + i11;
                        Object obj2 = objArr[i12];
                        int i13 = iArr[i12];
                        int d2 = c0Var.d(obj2);
                        if (d2 < 0) {
                            break loop0;
                        }
                        z9 = z10;
                        if (i13 != c0Var.f20851c[d2]) {
                            break loop0;
                        }
                    } else {
                        z9 = z10;
                    }
                    j10 >>= 8;
                    i11++;
                    z10 = z9;
                }
                z3 = z10;
                if (i10 != 8) {
                    return z3;
                }
            } else {
                z3 = z10;
            }
            if (i != length) {
                i++;
                z10 = z3;
            } else {
                return z3;
            }
        }
        return false;
    }

    public final void f(int i) {
        int i10;
        long[] jArr;
        if (i > 0) {
            i10 = Math.max(7, c(i));
        } else {
            i10 = 0;
        }
        this.f20852d = i10;
        if (i10 == 0) {
            jArr = p0.f20923a;
        } else {
            int i11 = ((i10 + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i11];
            Arrays.fill(jArr2, 0, i11, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f20849a = jArr;
        int i12 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i12] = (jArr[i12] & (~j10)) | j10;
        this.f20853f = a(this.f20852d) - this.e;
        this.f20850b = new Object[i10];
        this.f20851c = new int[i10];
    }

    public final void g(int i) {
        this.e--;
        long[] jArr = this.f20849a;
        int i10 = this.f20852d;
        int i11 = i >> 3;
        int i12 = (i & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((i - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.f20850b[i] = null;
    }

    public final void h(int i, Object obj) {
        int c10 = c(obj);
        if (c10 < 0) {
            c10 = ~c10;
        }
        this.f20850b[c10] = obj;
        this.f20851c[c10] = i;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.f20850b;
        int[] iArr = this.f20851c;
        long[] jArr = this.f20849a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        int i15 = iArr[i14];
                        if (obj != null) {
                            i = obj.hashCode();
                        } else {
                            i = 0;
                        }
                        i11 += Integer.hashCode(i15) ^ i;
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        Object[] objArr = this.f20850b;
        int[] iArr = this.f20851c;
        long[] jArr = this.f20849a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i10 = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i << 3) + i12;
                            Object obj = objArr[i13];
                            int i14 = iArr[i13];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            sb2.append("=");
                            sb2.append(i14);
                            i10++;
                            if (i10 < this.e) {
                                sb2.append(", ");
                            }
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
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ c0() {
        this(6);
    }
}
