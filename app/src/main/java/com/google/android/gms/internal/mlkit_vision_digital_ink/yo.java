package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.k;
import q.x;
import x.h;

import com.google.android.gms.internal.ads.wd0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yo {

    /* renamed from: f, reason: collision with root package name */
    public static final yo f15293f = new yo(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f15294a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f15295b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f15296c;

    /* renamed from: d, reason: collision with root package name */
    public int f15297d = -1;
    public boolean e;

    public yo(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f15294a = i;
        this.f15295b = iArr;
        this.f15296c = objArr;
        this.e = z3;
    }

    public static yo b() {
        return new yo(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int c10;
        int d2;
        int c11;
        int i = this.f15297d;
        if (i == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f15294a; i11++) {
                int i12 = this.f15295b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f15296c[i11]).getClass();
                                    c11 = ym.c(i13 << 3) + 4;
                                } else {
                                    androidx.datastore.preferences.protobuf.s1.r(new wn());
                                    return 0;
                                }
                            } else {
                                int c12 = ym.c(i13 << 3);
                                c10 = c12 + c12;
                                d2 = ((yo) this.f15296c[i11]).a();
                            }
                        } else {
                            int i15 = i13 << 3;
                            tm tmVar = (tm) this.f15296c[i11];
                            int c13 = ym.c(i15);
                            int d10 = tmVar.d();
                            i10 = wd0.s(d10, d10, c13, i10);
                        }
                    } else {
                        ((Long) this.f15296c[i11]).getClass();
                        c11 = ym.c(i13 << 3) + 8;
                    }
                    i10 = c11 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.f15296c[i11]).longValue();
                    c10 = ym.c(i16);
                    d2 = ym.d(longValue);
                }
                i10 = d2 + c10 + i10;
            }
            this.f15297d = i10;
            return i10;
        }
        return i;
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            e(this.f15294a + 1);
            int[] iArr = this.f15295b;
            int i10 = this.f15294a;
            iArr[i10] = i;
            this.f15296c[i10] = obj;
            this.f15294a = i10 + 1;
            return;
        }
        q.x.h();
    }

    public final void d(s5 s5Var) {
        ym ymVar = (ym) s5Var.f14961v;
        if (this.f15294a != 0) {
            for (int i = 0; i < this.f15294a; i++) {
                int i10 = this.f15295b[i];
                Object obj = this.f15296c[i];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 5) {
                                    ymVar.l(i12, ((Integer) obj).intValue());
                                } else {
                                    g5.q.k(new wn());
                                    return;
                                }
                            } else {
                                ymVar.w(i12, 3);
                                ((yo) obj).d(s5Var);
                                ymVar.w(i12, 4);
                            }
                        } else {
                            ymVar.j(i12, (tm) obj);
                        }
                    } else {
                        ymVar.n(i12, ((Long) obj).longValue());
                    }
                } else {
                    ymVar.z(i12, ((Long) obj).longValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.f15295b;
        if (i > iArr.length) {
            int i10 = this.f15294a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f15295b = Arrays.copyOf(iArr, i);
            this.f15296c = Arrays.copyOf(this.f15296c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof yo)) {
                yo yoVar = (yo) obj;
                int i = this.f15294a;
                if (i == yoVar.f15294a) {
                    int[] iArr = this.f15295b;
                    int[] iArr2 = yoVar.f15295b;
                    int i10 = 0;
                    while (true) {
                        if (i10 < i) {
                            if (iArr[i10] != iArr2[i10]) {
                                break;
                            }
                            i10++;
                        } else {
                            Object[] objArr = this.f15296c;
                            Object[] objArr2 = yoVar.f15296c;
                            int i11 = this.f15294a;
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
        int i = this.f15294a;
        int i10 = i + 527;
        int[] iArr = this.f15295b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f15296c;
        int i15 = this.f15294a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
