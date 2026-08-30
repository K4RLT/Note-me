package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.wd0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: f, reason: collision with root package name */
    public static final b6 f13654f = new b6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f13655a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f13656b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f13657c;

    /* renamed from: d, reason: collision with root package name */
    public int f13658d = -1;
    public boolean e;

    public b6(int i, int[] iArr, Object[] objArr, boolean z3) {
        this.f13655a = i;
        this.f13656b = iArr;
        this.f13657c = objArr;
        this.e = z3;
    }

    public static b6 e() {
        return new b6(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int t3;
        int r8;
        int i = this.f13658d;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13655a; i11++) {
            int i12 = this.f13656b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 == 5) {
                                ((Integer) this.f13657c[i11]).getClass();
                                i10 = wd0.t(i13 << 3, 4, i10);
                            } else {
                                androidx.datastore.preferences.protobuf.s1.r(new IOException("Protocol message tag had invalid wire type."));
                                return 0;
                            }
                        } else {
                            t3 = t4.s(i13) << 1;
                            r8 = ((b6) this.f13657c[i11]).a();
                        }
                    } else {
                        i10 = t4.m(i13, (s4) this.f13657c[i11]) + i10;
                    }
                } else {
                    ((Long) this.f13657c[i11]).getClass();
                    i10 = wd0.t(i13 << 3, 8, i10);
                }
            } else {
                long longValue = ((Long) this.f13657c[i11]).longValue();
                t3 = t4.t(i13 << 3);
                r8 = t4.r(longValue);
            }
            i10 = r8 + t3 + i10;
        }
        this.f13658d = i10;
        return i10;
    }

    public final void b(int i) {
        int[] iArr = this.f13656b;
        if (i > iArr.length) {
            int i10 = this.f13655a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.f13656b = Arrays.copyOf(iArr, i);
            this.f13657c = Arrays.copyOf(this.f13657c, i);
        }
    }

    public final void c(int i, Object obj) {
        if (this.e) {
            b(this.f13655a + 1);
            int[] iArr = this.f13656b;
            int i10 = this.f13655a;
            iArr[i10] = i;
            this.f13657c[i10] = obj;
            this.f13655a = i10 + 1;
            return;
        }
        q.x.h();
    }

    public final void d(o5 o5Var) {
        if (this.f13655a != 0) {
            o5Var.getClass();
            t4 t4Var = (t4) o5Var.f13873u;
            for (int i = 0; i < this.f13655a; i++) {
                int i10 = this.f13656b[i];
                Object obj = this.f13657c[i];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 5) {
                                    t4Var.c(i11, ((Integer) obj).intValue());
                                } else {
                                    g5.q.k(new IOException("Protocol message tag had invalid wire type."));
                                    return;
                                }
                            } else {
                                t4Var.o(i11, 3);
                                ((b6) obj).d(o5Var);
                                t4Var.o(i11, 4);
                            }
                        } else {
                            s4 s4Var = (s4) obj;
                            t4Var.o(i11, 2);
                            t4Var.n(s4Var.k());
                            t4Var.p(s4Var.f13910v, s4Var.n(), s4Var.k());
                        }
                    } else {
                        t4Var.d(i11, ((Long) obj).longValue());
                    }
                } else {
                    t4Var.k(i11, ((Long) obj).longValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        int i = this.f13655a;
        if (i == b6Var.f13655a) {
            int[] iArr = this.f13656b;
            int[] iArr2 = b6Var.f13656b;
            int i10 = 0;
            while (true) {
                if (i10 < i) {
                    if (iArr[i10] != iArr2[i10]) {
                        break;
                    }
                    i10++;
                } else {
                    Object[] objArr = this.f13657c;
                    Object[] objArr2 = b6Var.f13657c;
                    int i11 = this.f13655a;
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
        int i = this.f13655a;
        int i10 = (i + 527) * 31;
        int[] iArr = this.f13656b;
        int i11 = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i10 + i12) * 31;
        Object[] objArr = this.f13657c;
        int i15 = this.f13655a;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = (i11 * 31) + objArr[i16].hashCode();
        }
        return i14 + i11;
    }
}
