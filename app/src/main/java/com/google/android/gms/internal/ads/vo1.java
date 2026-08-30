package com.google.android.gms.internal.ads;
import g5.q;
import q.k;
import q.x;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vo1 {

    /* renamed from: f, reason: collision with root package name */
    public static final vo1 f11961f = new vo1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f11962a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f11963b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f11964c;

    /* renamed from: d, reason: collision with root package name */
    public int f11965d = -1;
    public boolean e;

    public vo1(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f11962a = i;
        this.f11963b = iArr;
        this.f11964c = objArr;
        this.e = z3;
    }

    public static vo1 a() {
        return new vo1(0, new int[8], new Object[8], true);
    }

    public final void b(lt0 lt0Var) {
        um1 um1Var = (um1) lt0Var.f8135v;
        if (this.f11962a != 0) {
            for (int i = 0; i < this.f11962a; i++) {
                int i10 = this.f11963b[i];
                Object obj = this.f11964c[i];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    um1Var.s1(i11, ((Integer) obj).intValue());
                                } else {
                                    g5.q.k(new on1());
                                    return;
                                }
                            } else {
                                um1Var.a0(i11, 3);
                                ((vo1) obj).b(lt0Var);
                                um1Var.a0(i11, 4);
                            }
                        } else {
                            um1Var.C1(i11, (om1) obj);
                        }
                    } else {
                        um1Var.w1(i11, ((Long) obj).longValue());
                    }
                } else {
                    um1Var.u1(i11, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int c() {
        int T;
        int V;
        int T2;
        int i = this.f11965d;
        if (i == -1) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f11962a; i11++) {
                int i12 = this.f11963b[i11];
                int i13 = i12 >>> 3;
                int i14 = i12 & 7;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 == 5) {
                                    ((Integer) this.f11964c[i11]).getClass();
                                    T2 = um1.T(i13 << 3) + 4;
                                } else {
                                    androidx.datastore.preferences.protobuf.s1.r(new on1());
                                    return 0;
                                }
                            } else {
                                int T3 = um1.T(i13 << 3);
                                T = T3 + T3;
                                V = ((vo1) this.f11964c[i11]).c();
                            }
                        } else {
                            int i15 = i13 << 3;
                            om1 om1Var = (om1) this.f11964c[i11];
                            int T4 = um1.T(i15);
                            int k3 = om1Var.k();
                            i10 = wd0.k(k3, k3, T4, i10);
                        }
                    } else {
                        ((Long) this.f11964c[i11]).getClass();
                        T2 = um1.T(i13 << 3) + 8;
                    }
                    i10 = T2 + i10;
                } else {
                    int i16 = i13 << 3;
                    long longValue = ((Long) this.f11964c[i11]).longValue();
                    T = um1.T(i16);
                    V = um1.V(longValue);
                }
                i10 = V + T + i10;
            }
            this.f11965d = i10;
            return i10;
        }
        return i;
    }

    public final void d(int i, Object obj) {
        if (this.e) {
            e(this.f11962a + 1);
            int[] iArr = this.f11963b;
            int i10 = this.f11962a;
            iArr[i10] = i;
            this.f11964c[i10] = obj;
            this.f11962a = i10 + 1;
            return;
        }
        q.x.h();
    }

    public final void e(int i) {
        int[] iArr = this.f11963b;
        if (i > iArr.length) {
            int i10 = this.f11962a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f11963b = Arrays.copyOf(iArr, i);
            this.f11964c = Arrays.copyOf(this.f11964c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vo1)) {
            return false;
        }
        vo1 vo1Var = (vo1) obj;
        int i = this.f11962a;
        if (i == vo1Var.f11962a) {
            int[] iArr = this.f11963b;
            int[] iArr2 = vo1Var.f11963b;
            int i10 = 0;
            while (true) {
                if (i10 < i) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f11964c;
                    Object[] objArr2 = vo1Var.f11964c;
                    int i11 = this.f11962a;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f11962a;
        int i10 = i + 527;
        int[] iArr = this.f11963b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i10 * 31) + i12) * 31;
        Object[] objArr = this.f11964c;
        int i15 = this.f11962a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
