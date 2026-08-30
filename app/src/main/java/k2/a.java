package k2;

import a2.c;
import android.os.Handler;
import b0.e1;
import b2.a1;
import b2.f1;
import b2.i0;
import b2.k1;
import b2.s;
import b2.u1;
import c2.y1;
import g5.q;
import k1.l0;
import n.d0;
import n.w;
import t0.e;
import wa.d9;
import y2.j;
import ya.td;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f19536a;

    /* renamed from: b, reason: collision with root package name */
    public final b f19537b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f19538c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19539d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19540f;

    /* renamed from: g, reason: collision with root package name */
    public b3.a f19541g;

    /* renamed from: h, reason: collision with root package name */
    public long f19542h;
    public final c i;

    /* renamed from: j, reason: collision with root package name */
    public final j1.a f19543j;

    public a() {
        e1 e1Var = new e1(11, (char) 0);
        e1Var.f1180c = new long[192];
        e1Var.f1181d = new long[192];
        this.f19536a = e1Var;
        this.f19537b = new b();
        this.f19538c = new d0();
        this.f19542h = -1L;
        this.i = new c(20, this);
        this.f19543j = new j1.a();
    }

    public static long g(i0 i0Var) {
        float[] b10;
        int a10;
        f1 f1Var = i0Var.Z;
        k1 k1Var = (k1) f1Var.f1459y;
        k1 k1Var2 = (s) f1Var.f1458x;
        long j10 = 0;
        while (k1Var2 != null && k1Var2 != k1Var) {
            u1 u1Var = k1Var2.f1531e0;
            j10 = td.a(j10, k1Var2.V);
            k1Var2 = k1Var2.M;
            if (u1Var != null && (a10 = d9.a((b10 = ((y1) u1Var).b()))) != 3) {
                if ((a10 & 2) == 0) {
                    return 9223372034707292159L;
                }
                j10 = k1.d0.b(j10, b10);
            }
        }
        return td.b(j10);
    }

    public static void h(i0 i0Var) {
        long j10;
        long j11 = ((k1) i0Var.Z.f1459y).V;
        i0 v2 = i0Var.v();
        if (v2 != null) {
            if (j.a(v2.f1491w, 9223372034707292159L)) {
                h(v2);
            }
            long j12 = v2.f1491w;
            if (!j.a(j12, 9223372034707292159L)) {
                if (v2.f1494z) {
                    j10 = g(v2);
                    v2.f1493y = j10;
                    v2.f1494z = false;
                } else {
                    j10 = v2.f1493y;
                }
                if (!j.a(j10, 9223372034707292159L)) {
                    j11 = j.c(j.c(j12, j10), j11);
                }
            }
            j11 = 9223372034707292159L;
        }
        i0Var.f1491w = j11;
    }

    public final void a() {
        boolean z3;
        boolean z9;
        long j10;
        long j11;
        long j12;
        Handler handler = d1.b.f15669a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z10 = this.f19539d;
        if (!z10 && !this.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        e1 e1Var = this.f19536a;
        b bVar = this.f19537b;
        if (z10) {
            this.f19539d = false;
            d0 d0Var = this.f19538c;
            j10 = 128;
            Object[] objArr = d0Var.f20855a;
            int i = d0Var.f20856b;
            for (int i10 = 0; i10 < i; i10++) {
                ((df.a) objArr[i10]).invoke();
            }
            long[] jArr = (long[]) e1Var.f1180c;
            int i11 = e1Var.f1179b;
            j11 = 255;
            for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
                long j13 = jArr[i12 + 2];
                if ((((int) (j13 >> 61)) & 1) != 0) {
                    long j14 = jArr[i12];
                    long j15 = jArr[i12 + 1];
                    if (bVar.f19544a.b(((int) j13) & 67108863) != null) {
                        q.b();
                        return;
                    }
                }
            }
            j12 = -9187201950435737472L;
            w wVar = bVar.f19544a;
            Object[] objArr2 = wVar.f20904c;
            long[] jArr2 = wVar.f20902a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j16 = jArr2[i13];
                    z9 = z3;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j16 & 255) < 128 && objArr2[(i13 << 3) + i15] != null) {
                                q.b();
                                return;
                            }
                            j16 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    z3 = z9;
                }
            } else {
                z9 = z3;
            }
            long[] jArr3 = (long[]) e1Var.f1180c;
            int i16 = e1Var.f1179b;
            for (int i17 = 0; i17 < jArr3.length - 2 && i17 < i16; i17 += 3) {
                int i18 = i17 + 2;
                jArr3[i18] = jArr3[i18] & (-2305843009213693953L);
            }
        } else {
            z9 = z3;
            j10 = 128;
            j11 = 255;
            j12 = -9187201950435737472L;
        }
        if (this.e) {
            this.e = false;
            w wVar2 = bVar.f19544a;
            Object[] objArr3 = wVar2.f20904c;
            long[] jArr4 = wVar2.f20902a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i19 = 0;
                while (true) {
                    long j17 = jArr4[i19];
                    if ((((~j17) << 7) & j17 & j12) != j12) {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        for (int i21 = 0; i21 < i20; i21++) {
                            if ((j17 & j11) < j10 && objArr3[(i19 << 3) + i21] != null) {
                                q.b();
                                return;
                            }
                            j17 >>= 8;
                        }
                        if (i20 != 8) {
                            break;
                        }
                    }
                    if (i19 == length2) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        }
        if (z9) {
            bVar.getClass();
        }
        if (this.f19540f) {
            this.f19540f = false;
            long[] jArr5 = (long[]) e1Var.f1180c;
            int i22 = e1Var.f1179b;
            long[] jArr6 = (long[]) e1Var.f1181d;
            int i23 = 0;
            for (int i24 = 0; i24 < jArr5.length - 2 && i23 < jArr6.length - 2 && i24 < i22; i24 += 3) {
                int i25 = i24 + 2;
                if (jArr5[i25] != 2305843009213693951L) {
                    jArr6[i23] = jArr5[i24];
                    jArr6[i23 + 1] = jArr5[i24 + 1];
                    jArr6[i23 + 2] = jArr5[i25];
                    i23 += 3;
                }
            }
            e1Var.f1179b = i23;
            e1Var.f1180c = jArr6;
            e1Var.f1181d = jArr5;
        }
        if (bVar.f19545b > currentTimeMillis) {
            return;
        }
        w wVar3 = bVar.f19544a;
        Object[] objArr4 = wVar3.f20904c;
        long[] jArr7 = wVar3.f20902a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i26 = 0;
            while (true) {
                long j18 = jArr7[i26];
                if ((((~j18) << 7) & j18 & j12) != j12) {
                    int i27 = 8 - ((~(i26 - length3)) >>> 31);
                    for (int i28 = 0; i28 < i27; i28++) {
                        if ((j18 & j11) < j10 && objArr4[(i26 << 3) + i28] != null) {
                            q.b();
                            return;
                        }
                        j18 >>= 8;
                    }
                    if (i27 != 8) {
                        break;
                    }
                }
                if (i26 == length3) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        bVar.f19545b = -1L;
    }

    public final void b(i0 i0Var, boolean z3) {
        char c10;
        boolean z9;
        int i;
        f1 f1Var = i0Var.Z;
        k1 k1Var = (k1) f1Var.f1459y;
        a1 a1Var = i0Var.f1478a0.f1558p;
        int f02 = a1Var.f0();
        float e02 = a1Var.e0();
        j1.a aVar = this.f19543j;
        aVar.f18758a = 0.0f;
        aVar.f18759b = 0.0f;
        aVar.f18760c = f02;
        aVar.f18761d = e02;
        while (true) {
            c10 = ' ';
            if (k1Var == null) {
                break;
            }
            u1 u1Var = k1Var.f1531e0;
            long j10 = k1Var.V;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j10 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            aVar.f18758a += intBitsToFloat;
            aVar.f18759b += intBitsToFloat2;
            aVar.f18760c += intBitsToFloat;
            aVar.f18761d += intBitsToFloat2;
            k1Var = k1Var.M;
            if (u1Var != null) {
                float[] b10 = ((y1) u1Var).b();
                if (!l0.s(b10)) {
                    k1.d0.c(b10, aVar);
                }
            }
        }
        int i10 = (int) aVar.f18758a;
        int i11 = (int) aVar.f18759b;
        int i12 = (int) aVar.f18760c;
        int i13 = (int) aVar.f18761d;
        int i14 = i0Var.f1490v;
        e1 e1Var = this.f19536a;
        if (!z3) {
            int i15 = i14 & 67108863;
            long[] jArr = (long[]) e1Var.f1180c;
            int i16 = e1Var.f1179b;
            int i17 = 0;
            while (i17 < jArr.length - 2 && i17 < i16) {
                int i18 = i17 + 2;
                char c11 = c10;
                e1 e1Var2 = e1Var;
                long j11 = jArr[i18];
                z9 = true;
                if ((((int) j11) & 67108863) == i15) {
                    jArr[i17] = (i10 << c11) | (i11 & 4294967295L);
                    jArr[i17 + 1] = (i12 << c11) | (i13 & 4294967295L);
                    jArr[i18] = 2305843009213693952L | j11;
                    break;
                } else {
                    i17 += 3;
                    c10 = c11;
                    e1Var = e1Var2;
                }
            }
        }
        e1 e1Var3 = e1Var;
        z9 = true;
        i0 v2 = i0Var.v();
        if (v2 != null) {
            i = v2.f1490v;
        } else {
            i = -1;
        }
        e1Var3.g(i14, i10, i11, i12, i13, i, f1Var.n(1024), f1Var.n(16));
        this.f19539d = z9;
    }

    public final void c(i0 i0Var) {
        e z3 = i0Var.z();
        Object[] objArr = z3.f25617u;
        int i = z3.f25619w;
        for (int i10 = 0; i10 < i; i10++) {
            i0 i0Var2 = (i0) objArr[i10];
            b(i0Var2, false);
            c(i0Var2);
        }
    }

    public final void d(i0 i0Var) {
        boolean z3 = true;
        this.f19539d = true;
        int i = i0Var.f1490v & 67108863;
        e1 e1Var = this.f19536a;
        long[] jArr = (long[]) e1Var.f1180c;
        int i10 = e1Var.f1179b;
        int i11 = 0;
        while (true) {
            if (i11 >= jArr.length - 2 || i11 >= i10) {
                break;
            }
            int i12 = i11 + 2;
            long j10 = jArr[i12];
            if ((((int) j10) & 67108863) == i) {
                jArr[i12] = 2305843009213693952L | j10;
                break;
            }
            i11 += 3;
        }
        b3.a aVar = this.f19541g;
        if (aVar == null) {
            z3 = false;
        }
        long j11 = this.f19537b.f19545b;
        if (j11 >= 0 || !z3) {
            if (this.f19542h == j11 && z3) {
                return;
            }
            if (aVar != null) {
                Handler handler = d1.b.f15669a;
                d1.b.f15669a.removeCallbacks(aVar);
            }
            Handler handler2 = d1.b.f15669a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j11, 16 + currentTimeMillis);
            this.f19542h = max;
            b3.a aVar2 = new b3.a(4, this.i);
            d1.b.f15669a.postDelayed(aVar2, max - currentTimeMillis);
            this.f19541g = aVar2;
        }
    }

    public final void e(i0 i0Var) {
        long g8 = g(i0Var);
        if (!j.a(g8, 9223372034707292159L)) {
            i0Var.f1493y = g8;
            i0Var.f1494z = false;
            e z3 = i0Var.z();
            Object[] objArr = z3.f25617u;
            int i = z3.f25619w;
            for (int i10 = 0; i10 < i; i10++) {
                f((i0) objArr[i10], false);
            }
            d(i0Var);
            return;
        }
        c(i0Var);
    }

    public final void f(i0 i0Var, boolean z3) {
        int i;
        boolean z9;
        boolean z10;
        int i10;
        long j10;
        char c10;
        a1 a1Var = i0Var.f1478a0.f1558p;
        int f02 = a1Var.f0();
        int e02 = a1Var.e0();
        long j11 = i0Var.f1491w;
        long j12 = i0Var.f1492x;
        int i11 = (int) (j12 >> 32);
        int i12 = (int) (j12 & 4294967295L);
        h(i0Var);
        long j13 = i0Var.f1491w;
        if (j.a(j13, 9223372034707292159L)) {
            b(i0Var, z3);
            return;
        }
        i0Var.f1492x = (e02 & 4294967295L) | (f02 << 32);
        int i13 = (int) (j13 >> 32);
        int i14 = (int) (j13 & 4294967295L);
        int i15 = i13 + f02;
        int i16 = i14 + e02;
        if (!z3 && j.a(j13, j11) && i11 == f02 && i12 == e02) {
            return;
        }
        int i17 = i0Var.f1490v;
        f1 f1Var = i0Var.Z;
        e1 e1Var = this.f19536a;
        if (!z3) {
            int i18 = i17 & 67108863;
            long[] jArr = (long[]) e1Var.f1180c;
            int i19 = e1Var.f1179b;
            int i20 = 0;
            while (i20 < jArr.length - 2 && i20 < i19) {
                int i21 = i20 + 2;
                int i22 = i20;
                long j14 = jArr[i21];
                if ((((int) j14) & 67108863) == i18) {
                    long j15 = jArr[i22];
                    jArr[i22] = (i13 << 32) | (i14 & 4294967295L);
                    jArr[i22 + 1] = (i15 << 32) | (i16 & 4294967295L);
                    long j16 = 2305843009213693952L;
                    jArr[i21] = j14 | 2305843009213693952L;
                    int i23 = i13 - ((int) (j15 >> 32));
                    int i24 = i14 - ((int) j15);
                    if (i23 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i24 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z9 | z10) {
                        long j17 = -4503599560261633L;
                        char c11 = 26;
                        long[] jArr2 = (long[]) e1Var.f1180c;
                        long[] jArr3 = (long[]) e1Var.f1181d;
                        int i25 = e1Var.f1179b / 3;
                        jArr3[0] = (j14 & (-4503599560261633L)) | (((i22 + 3) & 67108863) << 26);
                        int i26 = 1;
                        while (i26 > 0) {
                            i26--;
                            long j18 = jArr3[i26];
                            int i27 = ((int) j18) & 67108863;
                            char c12 = c11;
                            long j19 = j17;
                            int i28 = ((int) (j18 >> c12)) & 67108863;
                            char c13 = '4';
                            int i29 = (int) (j18 >> 52);
                            char c14 = 511;
                            int i30 = i29 & 511;
                            if (i30 == 511) {
                                i10 = i25;
                            } else {
                                i10 = i30 + i28;
                            }
                            if (i28 < 0) {
                                break;
                            }
                            while (i28 < jArr2.length - 2 && i28 < i10) {
                                int i31 = i28 + 2;
                                long j20 = jArr2[i31];
                                char c15 = c13;
                                int i32 = i10;
                                if ((((int) (j20 >> c12)) & 67108863) == i27) {
                                    long j21 = jArr2[i28];
                                    int i33 = i28 + 1;
                                    j10 = j16;
                                    long j22 = jArr2[i33];
                                    jArr2[i28] = ((((int) j21) + i24) & 4294967295L) | ((((int) (j21 >> 32)) + i23) << 32);
                                    jArr2[i33] = ((((int) j22) + i24) & 4294967295L) | ((((int) (j22 >> 32)) + i23) << 32);
                                    jArr2[i31] = j20 | j10;
                                    c10 = 511;
                                    if ((((int) (j20 >> c15)) & 511) > 0) {
                                        jArr3[i26] = (((i28 + 3) & 67108863) << c12) | (j20 & j19);
                                        i26++;
                                    }
                                } else {
                                    j10 = j16;
                                    c10 = c14;
                                }
                                i28 += 3;
                                c14 = c10;
                                c13 = c15;
                                i10 = i32;
                                j16 = j10;
                            }
                            c11 = c12;
                            j17 = j19;
                            j16 = j16;
                        }
                    }
                    this.f19539d = true;
                }
                i20 = i22 + 3;
            }
        }
        i0 v2 = i0Var.v();
        if (v2 != null) {
            i = v2.f1490v;
        } else {
            i = -1;
        }
        e1Var.g(i17, i13, i14, i15, i16, i, f1Var.n(1024), f1Var.n(16));
        this.f19539d = true;
    }

    public final void i(i0 i0Var) {
        int i = i0Var.f1490v & 67108863;
        e1 e1Var = this.f19536a;
        long[] jArr = (long[]) e1Var.f1180c;
        int i10 = e1Var.f1179b;
        int i11 = 0;
        while (true) {
            if (i11 >= jArr.length - 2 || i11 >= i10) {
                break;
            }
            int i12 = i11 + 2;
            if ((((int) jArr[i12]) & 67108863) == i) {
                jArr[i11] = -1;
                jArr[i11 + 1] = -1;
                jArr[i12] = 2305843009213693951L;
                break;
            }
            i11 += 3;
        }
        this.f19539d = true;
        this.f19540f = true;
    }
}
