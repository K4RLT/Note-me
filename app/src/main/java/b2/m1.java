package b2;
import z1.a1;
import z1.o0;
import z1.s0;
import z1.t0;
import z1.u;
import z1.v;

/* loaded from: classes.dex */
public final class m1 implements o0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1541u;

    /* renamed from: v, reason: collision with root package name */
    public final o0 f1542v;

    /* renamed from: w, reason: collision with root package name */
    public final Enum f1543w;

    /* renamed from: x, reason: collision with root package name */
    public final Enum f1544x;

    public /* synthetic */ m1(o0 o0Var, Enum r22, Enum r32, int i) {
        this.f1541u = i;
        this.f1542v = o0Var;
        this.f1543w = r22;
        this.f1544x = r32;
    }

    @Override // o0
    public final Object H() {
        switch (this.f1541u) {
            case 0:
                return this.f1542v.H();
            case 1:
                return this.f1542v.H();
            default:
                return this.f1542v.H();
        }
    }

    @Override // o0
    public final int Z(int i) {
        switch (this.f1541u) {
            case 0:
                return this.f1542v.Z(i);
            case 1:
                return this.f1542v.Z(i);
            default:
                return this.f1542v.Z(i);
        }
    }

    @Override // o0
    public final int c(int i) {
        switch (this.f1541u) {
            case 0:
                return this.f1542v.c(i);
            case 1:
                return this.f1542v.c(i);
            default:
                return this.f1542v.c(i);
        }
    }

    @Override // o0
    public final int l(int i) {
        switch (this.f1541u) {
            case 0:
                return this.f1542v.l(i);
            case 1:
                return this.f1542v.l(i);
            default:
                return this.f1542v.l(i);
        }
    }

    @Override // o0
    public final int n(int i) {
        switch (this.f1541u) {
            case 0:
                return this.f1542v.n(i);
            case 1:
                return this.f1542v.n(i);
            default:
                return this.f1542v.n(i);
        }
    }

    @Override // o0
    public final a1 z(long j10) {
        int Z;
        int l10;
        int Z2;
        int l11;
        int Z3;
        int l12;
        switch (this.f1541u) {
            case 0:
                p1 p1Var = (p1) this.f1544x;
                o1 o1Var = (o1) this.f1543w;
                o1 o1Var2 = o1.f1566v;
                int i = 32767;
                o0 o0Var = this.f1542v;
                if (p1Var == p1.f1575u) {
                    if (o1Var == o1Var2) {
                        l10 = o0Var.n(y2.a.g(j10));
                    } else {
                        l10 = o0Var.l(y2.a.g(j10));
                    }
                    if (y2.a.c(j10)) {
                        i = y2.a.g(j10);
                    }
                    return new n1(l10, i, 0);
                }
                if (o1Var == o1Var2) {
                    Z = o0Var.c(y2.a.h(j10));
                } else {
                    Z = o0Var.Z(y2.a.h(j10));
                }
                if (y2.a.d(j10)) {
                    i = y2.a.h(j10);
                }
                return new n1(i, Z, 0);
            case 1:
                v vVar = (v) this.f1544x;
                u uVar = (u) this.f1543w;
                u uVar2 = u.f31894v;
                int i10 = 32767;
                o0 o0Var2 = this.f1542v;
                if (vVar == v.f31898u) {
                    if (uVar == uVar2) {
                        l11 = o0Var2.n(y2.a.g(j10));
                    } else {
                        l11 = o0Var2.l(y2.a.g(j10));
                    }
                    if (y2.a.c(j10)) {
                        i10 = y2.a.g(j10);
                    }
                    return new n1(l11, i10, 1);
                }
                if (uVar == uVar2) {
                    Z2 = o0Var2.c(y2.a.h(j10));
                } else {
                    Z2 = o0Var2.Z(y2.a.h(j10));
                }
                if (y2.a.d(j10)) {
                    i10 = y2.a.h(j10);
                }
                return new n1(i10, Z2, 1);
            default:
                t0 t0Var = (t0) this.f1544x;
                s0 s0Var = (s0) this.f1543w;
                s0 s0Var2 = s0.f31888v;
                int i11 = 32767;
                o0 o0Var3 = this.f1542v;
                if (t0Var == t0.f31890u) {
                    if (s0Var == s0Var2) {
                        l12 = o0Var3.n(y2.a.g(j10));
                    } else {
                        l12 = o0Var3.l(y2.a.g(j10));
                    }
                    if (y2.a.c(j10)) {
                        i11 = y2.a.g(j10);
                    }
                    return new n1(l12, i11, 2);
                }
                if (s0Var == s0Var2) {
                    Z3 = o0Var3.c(y2.a.h(j10));
                } else {
                    Z3 = o0Var3.Z(y2.a.h(j10));
                }
                if (y2.a.d(j10)) {
                    i11 = y2.a.h(j10);
                }
                return new n1(i11, Z3, 2);
        }
    }
}
