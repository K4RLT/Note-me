package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class da implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f5349a;

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f5350b = new xk0(new byte[9400], 0);

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f5351c;

    /* renamed from: d, reason: collision with root package name */
    public final g9 f5352d;
    public final s6 e;

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f5353f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f5354g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f5355h;
    public final y9 i;

    /* renamed from: j, reason: collision with root package name */
    public z3 f5356j;

    /* renamed from: k, reason: collision with root package name */
    public p2 f5357k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5358l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5359m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5360n;

    /* renamed from: o, reason: collision with root package name */
    public int f5361o;

    static {
        int i = ay0.F;
    }

    public da(s6 s6Var, dp0 dp0Var, g9 g9Var) {
        this.f5352d = g9Var;
        this.e = s6Var;
        this.f5349a = Collections.singletonList(dp0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f5354g = sparseBooleanArray;
        this.f5355h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f5353f = sparseArray;
        this.f5351c = new SparseIntArray();
        this.i = new y9(1);
        this.f5357k = p2.f9325f;
        this.f5361o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        int i = 0;
        while (true) {
            SparseArray sparseArray3 = this.f5353f;
            if (i < size) {
                sparseArray3.put(sparseArray2.keyAt(i), (ga) sparseArray2.valueAt(i));
                i++;
            } else {
                sparseArray3.put(0, new ca(new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(this)));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(com.google.android.gms.internal.ads.o2 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.xk0 r0 = r6.f5350b
            byte[] r0 = r0.f12580a
            com.google.android.gms.internal.ads.i2 r7 = (com.google.android.gms.internal.ads.i2) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.E(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.x(r2, r1)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.da.e(com.google.android.gms.internal.ads.o2):boolean");
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        this.f5357k = new d(p2Var, this.e);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        z3 z3Var;
        long j12;
        List list = this.f5349a;
        int size = list.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            dp0 dp0Var = (dp0) list.get(i10);
            synchronized (dp0Var) {
                j12 = dp0Var.f5471b;
            }
            if (j12 != -9223372036854775807L) {
                long a10 = dp0Var.a();
                if (a10 != -9223372036854775807L) {
                    if (a10 != 0) {
                        if (a10 == j11) {
                        }
                    }
                }
            }
            dp0Var.b(j11);
        }
        if (j11 != 0 && (z3Var = this.f5356j) != null) {
            z3Var.a(j11);
        }
        this.f5350b.y(0);
        this.f5351c.clear();
        while (true) {
            SparseArray sparseArray = this.f5353f;
            if (i < sparseArray.size()) {
                ((ga) sparseArray.valueAt(i)).zzb();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.ads.nb, java.lang.Object, com.google.android.gms.internal.ads.g2] */
    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, b0.a aVar) {
        o2 o2Var2;
        int i;
        int i10;
        ga gaVar;
        int i11;
        int i12;
        long j10;
        long j11;
        long p10 = o2Var.p();
        if (this.f5358l) {
            long j12 = -9223372036854775807L;
            y9 y9Var = this.i;
            if (p10 != -1 && !y9Var.f12817c) {
                int i13 = this.f5361o;
                xk0 xk0Var = y9Var.f12816b;
                if (i13 <= 0) {
                    y9Var.b(o2Var);
                    return 0;
                }
                if (!y9Var.e) {
                    long p11 = o2Var.p();
                    int min = (int) Math.min(112800L, p11);
                    long j13 = p11 - min;
                    if (o2Var.n() != j13) {
                        aVar.f1139v = j13;
                        return 1;
                    }
                    xk0Var.y(min);
                    o2Var.h();
                    o2Var.y(xk0Var.f12580a, 0, min);
                    int i14 = xk0Var.f12581b;
                    int i15 = xk0Var.f12582c;
                    int i16 = i15 - 188;
                    while (true) {
                        if (i16 < i14) {
                            break;
                        }
                        byte[] bArr = xk0Var.f12580a;
                        int i17 = -4;
                        int i18 = 0;
                        while (true) {
                            if (i17 > 4) {
                                break;
                            }
                            int i19 = (i17 * 188) + i16;
                            if (i19 < i14 || i19 >= i15 || bArr[i19] != 71) {
                                i18 = 0;
                            } else {
                                i18++;
                                if (i18 == 5) {
                                    long w10 = x21.w(xk0Var, i16, i13);
                                    if (w10 != -9223372036854775807L) {
                                        j12 = w10;
                                        break;
                                    }
                                }
                            }
                            i17++;
                        }
                        i16--;
                    }
                    y9Var.f12820g = j12;
                    y9Var.e = true;
                    return 0;
                }
                if (y9Var.f12820g == -9223372036854775807L) {
                    y9Var.b(o2Var);
                    return 0;
                }
                if (!y9Var.f12818d) {
                    int min2 = (int) Math.min(112800L, o2Var.p());
                    if (o2Var.n() != 0) {
                        aVar.f1139v = 0L;
                        return 1;
                    }
                    xk0Var.y(min2);
                    o2Var.h();
                    o2Var.y(xk0Var.f12580a, 0, min2);
                    int i20 = xk0Var.f12581b;
                    int i21 = xk0Var.f12582c;
                    while (true) {
                        if (i20 < i21) {
                            if (xk0Var.f12580a[i20] == 71) {
                                j11 = x21.w(xk0Var, i20, i13);
                                if (j11 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i20++;
                        } else {
                            j11 = -9223372036854775807L;
                            break;
                        }
                    }
                    y9Var.f12819f = j11;
                    y9Var.f12818d = true;
                    return 0;
                }
                long j14 = y9Var.f12819f;
                if (j14 == -9223372036854775807L) {
                    y9Var.b(o2Var);
                    return 0;
                }
                dp0 dp0Var = y9Var.f12815a;
                y9Var.f12821h = dp0Var.d(y9Var.f12820g) - dp0Var.c(j14);
                y9Var.b(o2Var);
                return 0;
            }
            if (!this.f5359m) {
                this.f5359m = true;
                long j15 = y9Var.f12821h;
                if (j15 != -9223372036854775807L) {
                    dp0 dp0Var2 = y9Var.f12815a;
                    int i22 = this.f5361o;
                    s6 s6Var = new s6(11);
                    ?? obj = new Object();
                    obj.f8634u = i22;
                    obj.f8635v = dp0Var2;
                    obj.f8636w = new xk0();
                    i = 1;
                    j10 = 0;
                    z3 z3Var = new z3(s6Var, obj, j15, j15 + 1, 0L, p10, 188L, 940);
                    this.f5356j = z3Var;
                    this.f5357k.B(z3Var.f13052a);
                } else {
                    i = 1;
                    j10 = 0;
                    this.f5357k.B(new r2(j15, 0L));
                }
            } else {
                i = 1;
                j10 = 0;
            }
            if (this.f5360n) {
                this.f5360n = false;
                g(j10, j10);
                if (o2Var.n() != j10) {
                    aVar.f1139v = j10;
                    return i;
                }
            }
            z3 z3Var2 = this.f5356j;
            if (z3Var2 != null && z3Var2.f13054c != null) {
                return z3Var2.b(o2Var, aVar);
            }
            o2Var2 = o2Var;
        } else {
            o2Var2 = o2Var;
            i = 1;
        }
        xk0 xk0Var2 = this.f5350b;
        byte[] bArr2 = xk0Var2.f12580a;
        if (9400 - xk0Var2.f12581b < 188) {
            int B = xk0Var2.B();
            if (B > 0) {
                System.arraycopy(bArr2, xk0Var2.f12581b, bArr2, 0, B);
            }
            xk0Var2.z(bArr2, B);
        }
        while (true) {
            int B2 = xk0Var2.B();
            SparseArray sparseArray = this.f5353f;
            if (B2 < 188) {
                int i23 = xk0Var2.f12582c;
                int e = o2Var2.e(bArr2, i23, 9400 - i23);
                if (e == -1) {
                    int i24 = 0;
                    while (i24 < sparseArray.size()) {
                        ga gaVar2 = (ga) sparseArray.valueAt(i24);
                        if (gaVar2 instanceof x9) {
                            x9 x9Var = (x9) gaVar2;
                            int i25 = x9Var.f12494c;
                            if (i25 == 3) {
                                if (x9Var.f12499j == -1) {
                                    i12 = i;
                                    x9Var.a(i12, new xk0());
                                }
                            } else {
                                i12 = i;
                                if (i25 != i12) {
                                }
                                x9Var.a(i12, new xk0());
                            }
                        }
                        i24++;
                        i = 1;
                    }
                    return -1;
                }
                xk0Var2.C(i23 + e);
                i = 1;
            } else {
                int i26 = xk0Var2.f12581b;
                int i27 = xk0Var2.f12582c;
                byte[] bArr3 = xk0Var2.f12580a;
                while (i26 < i27 && bArr3[i26] != 71) {
                    i26++;
                }
                xk0Var2.E(i26);
                int i28 = i26 + 188;
                int i29 = xk0Var2.f12582c;
                if (i28 > i29) {
                    return 0;
                }
                int b10 = xk0Var2.b();
                if ((8388608 & b10) != 0) {
                    xk0Var2.E(i28);
                    return 0;
                }
                if ((4194304 & b10) != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                int i30 = b10 & 32;
                int i31 = (b10 >> 8) & 8191;
                if ((b10 & 16) != 0) {
                    gaVar = (ga) sparseArray.get(i31);
                } else {
                    gaVar = null;
                }
                if (gaVar == null) {
                    xk0Var2.E(i28);
                    return 0;
                }
                int i32 = b10 & 15;
                SparseIntArray sparseIntArray = this.f5351c;
                int i33 = sparseIntArray.get(i31, i32 - 1);
                sparseIntArray.put(i31, i32);
                if (i33 == i32) {
                    xk0Var2.E(i28);
                    return 0;
                }
                if (i32 != ((i33 + 1) & 15)) {
                    gaVar.zzb();
                }
                if (i30 != 0) {
                    int K = xk0Var2.K();
                    if ((xk0Var2.K() & 64) != 0) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    i10 |= i11;
                    xk0Var2.G(K - 1);
                }
                boolean z3 = this.f5358l;
                if (z3 || !this.f5355h.get(i31, false)) {
                    xk0Var2.C(i28);
                    gaVar.a(i10, xk0Var2);
                    xk0Var2.C(i29);
                }
                if (!z3 && this.f5358l && p10 != -1) {
                    this.f5360n = true;
                }
                xk0Var2.E(i28);
                return 0;
            }
        }
    }
}
