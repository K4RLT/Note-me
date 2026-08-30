package com.google.android.gms.internal.play_billing;
import i1.o;
import i1.p;
import q.k;
import q.x;

import com.google.android.gms.internal.ads.wd0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: f, reason: collision with root package name */
    public static final s2 f15527f = new s2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f15528a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15529b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15530c;

    /* renamed from: d, reason: collision with root package name */
    public int f15531d = -1;
    public boolean e;

    public s2(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f15528a = i;
        this.f15529b = iArr;
        this.f15530c = objArr;
        this.e = z3;
    }

    public static s2 b() {
        return new s2(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int o10;
        int p10;
        int o11;
        int i = this.f15531d;
        if (i == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f15528a; i11++) {
                int i12 = this.f15529b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f15530c[i11]).getClass();
                                    o11 = o(i13 << 3) + 4;
                                } else {
                                    androidx.datastore.preferences.protobuf.s1.r(new x1());
                                    return 0;
                                }
                            } else {
                                int o12 = o(i13 << 3);
                                o10 = o12 + o12;
                                p10 = ((s2) this.f15530c[i11]).a();
                            }
                        } else {
                            int i15 = i13 << 3;
                            g1 g1Var = (g1) this.f15530c[i11];
                            int o13 = o(i15);
                            int g8 = g1Var.g();
                            i10 = wd0.u(g8, g8, o13, i10);
                        }
                    } else {
                        ((Long) this.f15530c[i11]).getClass();
                        o11 = o(i13 << 3) + 8;
                    }
                    i10 = o11 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.f15530c[i11]).longValue();
                    o10 = o(i16);
                    p10 = p(longValue);
                }
                i10 = p10 + o10 + i10;
            }
            this.f15531d = i10;
            return i10;
        }
        return i;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            e(this.f15528a + 1);
            int[] iArr = this.f15529b;
            int i10 = this.f15528a;
            iArr[i10] = i;
            this.f15530c[i10] = obj;
            this.f15528a = i10 + 1;
            return;
        }
        x.h();
    }

    public final void d(d2 d2Var) {
        i1 i1Var = (i1) d2Var.f15404a;
        if (this.f15528a != 0) {
            for (int i = 0; i < this.f15528a; i++) {
                int i10 = this.f15529b[i];
                Object obj = this.f15530c[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    i1Var.d(i12, ((Integer) obj).intValue());
                                } else {
                                    g5.k(new x1());
                                    return;
                                }
                            } else {
                                i1Var.j(i12, 3);
                                ((s2) obj).d(d2Var);
                                i1Var.j(i12, 4);
                            }
                        } else {
                            i1Var.c(i12, (g1) obj);
                        }
                    } else {
                        i1Var.f(i12, ((Long) obj).longValue());
                    }
                } else {
                    i1Var.m(i12, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.f15529b;
        if (i > iArr.length) {
            int i10 = this.f15528a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f15529b = Arrays.copyOf(iArr, i);
            this.f15530c = Arrays.copyOf(this.f15530c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof s2)) {
                s2 s2Var = (s2) obj;
                int i = this.f15528a;
                if (i == s2Var.f15528a) {
                    int[] iArr = this.f15529b;
                    int[] iArr2 = s2Var.f15529b;
                    int i10 = 0;
                    while (true) {
                        if (i10 < i) {
                            if (iArr[i10] != iArr2[i10]) {
                                break;
                            }
                            i10++;
                        } else {
                            Object[] objArr = this.f15530c;
                            Object[] objArr2 = s2Var.f15530c;
                            int i11 = this.f15528a;
                            for (int i12 = 0; i12 < i11; i12++) {
                                if (objArr[i12].equals(objArr2[i12])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f15528a;
        int i10 = i + 527;
        int[] iArr = this.f15529b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f15530c;
        int i15 = this.f15528a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
