package x;
import b.a;
import l.a;
import o0.h;

import java.util.List;

/* loaded from: classes.dex */
public final class o implements z1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1.e f29989a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29990b;

    public o(d1.e eVar, boolean z3) {
        this.f29989a = eVar;
        this.f29990b = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (!kotlin.jvm.internal.a(this.f29989a, oVar.f29989a) || this.f29990b != oVar.f29990b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.jvm.internal.w] */
    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        long j11;
        int i;
        int i10;
        j jVar;
        boolean z3;
        j jVar2;
        boolean z9;
        boolean z10;
        int j12;
        int i11;
        boolean z11;
        z1.a1 z12;
        boolean isEmpty = list.isEmpty();
        qe.t tVar = qe.t.f24024u;
        if (isEmpty) {
            return r0Var.u0(y2.a.j(j10), y2.a.i(j10), tVar, k.f29966w);
        }
        if (this.f29990b) {
            j11 = j10;
        } else {
            j11 = j10 & (-8589934589L);
        }
        j jVar3 = null;
        boolean z13 = true;
        if (list.size() == 1) {
            z1.o0 o0Var = (z1.o0) list.get(0);
            Object H = o0Var.H();
            if (H instanceof j) {
                jVar3 = (j) H;
            }
            if (jVar3 != null) {
                z10 = jVar3.J;
            } else {
                z10 = false;
            }
            if (!z10) {
                z12 = o0Var.z(j11);
                j12 = Math.max(y2.a.j(j10), z12.f31769u);
                i11 = Math.max(y2.a.i(j10), z12.f31770v);
            } else {
                j12 = y2.a.j(j10);
                i11 = y2.a.i(j10);
                int j13 = y2.a.j(j10);
                int i12 = y2.a.i(j10);
                if (j13 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i12 < 0) {
                    z13 = false;
                }
                if (!(z13 & z11)) {
                    y2.i.a("width and height must be >= 0");
                }
                z12 = o0Var.z(y2.b.h(j13, j13, i12, i12));
            }
            int i13 = i11;
            int i14 = j12;
            return r0Var.u0(i14, i13, tVar, new n(z12, o0Var, r0Var, i14, i13, this));
        }
        z1.a1[] a1VarArr = new z1.a1[list.size()];
        Object obj = new Object();
        obj.f19785u = y2.a.j(j10);
        Object obj2 = new Object();
        obj2.f19785u = y2.a.i(j10);
        List list2 = list;
        int size = list2.size();
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            z1.o0 o0Var2 = (z1.o0) list.get(i15);
            Object H2 = o0Var2.H();
            if (H2 instanceof j) {
                jVar2 = (j) H2;
            } else {
                jVar2 = null;
            }
            if (jVar2 != null) {
                z9 = jVar2.J;
            } else {
                z9 = false;
            }
            if (!z9) {
                z1.a1 z15 = o0Var2.z(j11);
                a1VarArr[i15] = z15;
                obj.f19785u = Math.max(obj.f19785u, z15.f31769u);
                obj2.f19785u = Math.max(obj2.f19785u, z15.f31770v);
            } else {
                z14 = true;
            }
        }
        if (z14) {
            int i16 = obj.f19785u;
            if (i16 != Integer.MAX_VALUE) {
                i = i16;
            } else {
                i = 0;
            }
            int i17 = obj2.f19785u;
            if (i17 != Integer.MAX_VALUE) {
                i10 = i17;
            } else {
                i10 = 0;
            }
            long a10 = y2.a(i, i16, i10, i17);
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                z1.o0 o0Var3 = (z1.o0) list.get(i18);
                Object H3 = o0Var3.H();
                if (H3 instanceof j) {
                    jVar = (j) H3;
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    z3 = jVar.J;
                } else {
                    z3 = false;
                }
                if (z3) {
                    a1VarArr[i18] = o0Var3.z(a10);
                }
            }
        }
        return r0Var.u0(obj.f19785u, obj2.f19785u, tVar, new h(a1VarArr, list, r0Var, obj, obj2, this, 1));
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29990b) + (this.f29989a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f29989a + ", propagateMinConstraints=" + this.f29990b + ')';
    }
}