package p;

import b8.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements z1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f22229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22230b;

    public q(y yVar) {
        this.f22229a = yVar;
    }

    @Override // z1.p0
    public final int a(z1.t tVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int l10 = ((z1.o0) list.get(0)).l(i);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int l11 = ((z1.o0) list.get(i10)).l(i);
                if (l11 > l10) {
                    l10 = l11;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return l10;
    }

    @Override // z1.p0
    public final int d(z1.t tVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int n10 = ((z1.o0) list.get(0)).n(i);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int n11 = ((z1.o0) list.get(i10)).n(i);
                if (n11 > n10) {
                    n10 = n11;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return n10;
    }

    @Override // z1.p0
    public final int f(z1.t tVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int c10 = ((z1.o0) list.get(0)).c(i);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int c11 = ((z1.o0) list.get(i10)).c(i);
                if (c11 > c10) {
                    c10 = c11;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return c10;
    }

    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            z1.a1 z3 = ((z1.o0) list.get(i11)).z(j10);
            i = Math.max(i, z3.f31769u);
            i10 = Math.max(i10, z3.f31770v);
            arrayList.add(z3);
        }
        boolean j02 = r0Var.j0();
        y yVar = this.f22229a;
        if (j02) {
            this.f22230b = true;
            yVar.f22292b.setValue(new y2.l((4294967295L & i10) | (i << 32)));
        } else if (!this.f22230b) {
            yVar.f22292b.setValue(new y2.l((4294967295L & i10) | (i << 32)));
        }
        return r0Var.u0(i, i10, qe.t.f24024u, new k9(6, arrayList));
    }

    @Override // z1.p0
    public final int i(z1.t tVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int Z = ((z1.o0) list.get(0)).Z(i);
        int i10 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int Z2 = ((z1.o0) list.get(i10)).Z(i);
                if (Z2 > Z) {
                    Z = Z2;
                }
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        return Z;
    }
}
