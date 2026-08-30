package x;
import b.a;
import g0.u0;
import x.m0;

import java.util.List;
import ya.qd;

/* loaded from: classes.dex */
public final class p0 implements z1.p0, m0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f29992a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.i f29993b;

    public p0(d dVar, d1.i iVar) {
        this.f29992a = dVar;
        this.f29993b = iVar;
    }

    @Override // z1.p0
    public final int a(z1.t tVar, List list, int i) {
        int t02 = tVar.t0(this.f29992a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z1.o0 o0Var = (z1.o0) list.get(i12);
            float e = b.e(b.d(o0Var));
            int l10 = o0Var.l(i);
            if (e == 0.0f) {
                i11 += l10;
            } else if (e > 0.0f) {
                f10 += e;
                i10 = Math.max(i10, Math.round(l10 / e));
            }
        }
        return ((list.size() - 1) * t02) + Math.round(i10 * f10) + i11;
    }

    @Override // m0
    public final z1.q0 b(z1.a1[] a1VarArr, z1.r0 r0Var, int[] iArr, int i, int i10) {
        return r0Var.u0(i, i10, qe.t.f24024u, new u0(a1VarArr, this, i10, iArr));
    }

    @Override // m0
    public final long c(int i, int i10, int i11, boolean z3) {
        if (!z3) {
            return y2.a(i, i10, 0, i11);
        }
        return qd.b(i, i10, 0, i11);
    }

    @Override // z1.p0
    public final int d(z1.t tVar, List list, int i) {
        int t02 = tVar.t0(this.f29992a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i10 = 0;
        int i11 = 0;
        float f10 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z1.o0 o0Var = (z1.o0) list.get(i12);
            float e = b.e(b.d(o0Var));
            int n10 = o0Var.n(i);
            if (e == 0.0f) {
                i11 += n10;
            } else if (e > 0.0f) {
                f10 += e;
                i10 = Math.max(i10, Math.round(n10 / e));
            }
        }
        return ((list.size() - 1) * t02) + Math.round(i10 * f10) + i11;
    }

    @Override // m0
    public final void e(int i, int[] iArr, int[] iArr2, z1.r0 r0Var) {
        this.f29992a.c(r0Var, i, iArr, r0Var.getLayoutDirection(), iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (kotlin.jvm.internal.a(this.f29992a, p0Var.f29992a) && kotlin.jvm.internal.a(this.f29993b, p0Var.f29993b)) {
            return true;
        }
        return false;
    }

    @Override // z1.p0
    public final int f(z1.t tVar, List list, int i) {
        int round;
        int i10;
        int i11;
        int t02 = tVar.t0(this.f29992a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * t02, i);
        List list2 = list;
        int size = list2.size();
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            z1.o0 o0Var = (z1.o0) list.get(i13);
            float e = b.e(b.d(o0Var));
            if (e == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = i - min;
                }
                int min2 = Math.min(o0Var.n(Integer.MAX_VALUE), i11);
                min += min2;
                i12 = Math.max(i12, o0Var.c(min2));
            } else if (e > 0.0f) {
                f10 += e;
            }
        }
        if (f10 == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f10);
        }
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            z1.o0 o0Var2 = (z1.o0) list.get(i14);
            float e8 = b.e(b.d(o0Var2));
            if (e8 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i10 = Math.round(round * e8);
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                i12 = Math.max(i12, o0Var2.c(i10));
            }
        }
        return i12;
    }

    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        return b.f(this, y2.a.j(j10), y2.a.i(j10), y2.a.h(j10), y2.a.g(j10), r0Var.t0(this.f29992a.a()), r0Var, list, new z1.a1[list.size()], list.size());
    }

    @Override // m0
    public final int h(z1.a1 a1Var) {
        return a1Var.f31769u;
    }

    public final int hashCode() {
        return this.f29993b.hashCode() + (this.f29992a.hashCode() * 31);
    }

    @Override // z1.p0
    public final int i(z1.t tVar, List list, int i) {
        int round;
        int i10;
        int i11;
        int t02 = tVar.t0(this.f29992a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * t02, i);
        List list2 = list;
        int size = list2.size();
        int i12 = 0;
        float f10 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            z1.o0 o0Var = (z1.o0) list.get(i13);
            float e = b.e(b.d(o0Var));
            if (e == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = i - min;
                }
                int min2 = Math.min(o0Var.n(Integer.MAX_VALUE), i11);
                min += min2;
                i12 = Math.max(i12, o0Var.Z(min2));
            } else if (e > 0.0f) {
                f10 += e;
            }
        }
        if (f10 == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f10);
        }
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            z1.o0 o0Var2 = (z1.o0) list.get(i14);
            float e8 = b.e(b.d(o0Var2));
            if (e8 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i10 = Math.round(round * e8);
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                i12 = Math.max(i12, o0Var2.Z(i10));
            }
        }
        return i12;
    }

    @Override // m0
    public final int j(z1.a1 a1Var) {
        return a1Var.f31770v;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f29992a + ", verticalAlignment=" + this.f29993b + ')';
    }
}
