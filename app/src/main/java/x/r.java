package x;
import b.a;
import x.m0;

import java.util.List;
import ya.qd;

/* loaded from: classes.dex */
public final class r implements z1.p0, m0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f29997a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.h f29998b;

    public r(f fVar, d1.h hVar) {
        this.f29997a = fVar;
        this.f29998b = hVar;
    }

    @Override // z1.p0
    public final int a(z1.t tVar, List list, int i) {
        int round;
        int i10;
        int i11;
        int t02 = tVar.t0(this.f29997a.a());
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
                int min2 = Math.min(o0Var.c(Integer.MAX_VALUE), i11);
                min += min2;
                i12 = Math.max(i12, o0Var.l(min2));
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
                i12 = Math.max(i12, o0Var2.l(i10));
            }
        }
        return i12;
    }

    @Override // m0
    public final z1.q0 b(z1.a1[] a1VarArr, z1.r0 r0Var, int[] iArr, int i, int i10) {
        return r0Var.u0(i10, i, qe.t.f24024u, new i1.u(a1VarArr, this, i10, r0Var, iArr));
    }

    @Override // m0
    public final long c(int i, int i10, int i11, boolean z3) {
        if (!z3) {
            return y2.a(0, i11, i, i10);
        }
        return qd.a(0, i11, i, i10);
    }

    @Override // z1.p0
    public final int d(z1.t tVar, List list, int i) {
        int round;
        int i10;
        int i11;
        int t02 = tVar.t0(this.f29997a.a());
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
                int min2 = Math.min(o0Var.c(Integer.MAX_VALUE), i11);
                min += min2;
                i12 = Math.max(i12, o0Var.n(min2));
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
                i12 = Math.max(i12, o0Var2.n(i10));
            }
        }
        return i12;
    }

    @Override // m0
    public final void e(int i, int[] iArr, int[] iArr2, z1.r0 r0Var) {
        this.f29997a.b(r0Var, i, iArr, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!kotlin.jvm.internal.a(this.f29997a, rVar.f29997a) || !this.f29998b.equals(rVar.f29998b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // z1.p0
    public final int f(z1.t tVar, List list, int i) {
        int t02 = tVar.t0(this.f29997a.a());
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
            int c10 = o0Var.c(i);
            if (e == 0.0f) {
                i11 += c10;
            } else if (e > 0.0f) {
                f10 += e;
                i10 = Math.max(i10, Math.round(c10 / e));
            }
        }
        return ((list.size() - 1) * t02) + Math.round(i10 * f10) + i11;
    }

    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        return b.f(this, y2.a.i(j10), y2.a.j(j10), y2.a.g(j10), y2.a.h(j10), r0Var.t0(this.f29997a.a()), r0Var, list, new z1.a1[list.size()], list.size());
    }

    @Override // m0
    public final int h(z1.a1 a1Var) {
        return a1Var.f31770v;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29998b.f15678a) + (this.f29997a.hashCode() * 31);
    }

    @Override // z1.p0
    public final int i(z1.t tVar, List list, int i) {
        int t02 = tVar.t0(this.f29997a.a());
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
            int Z = o0Var.Z(i);
            if (e == 0.0f) {
                i11 += Z;
            } else if (e > 0.0f) {
                f10 += e;
                i10 = Math.max(i10, Math.round(Z / e));
            }
        }
        return ((list.size() - 1) * t02) + Math.round(i10 * f10) + i11;
    }

    @Override // m0
    public final int j(z1.a1 a1Var) {
        return a1Var.f31769u;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f29997a + ", horizontalAlignment=" + this.f29998b + ')';
    }
}
