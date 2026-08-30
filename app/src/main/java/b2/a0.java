package b2;
import a0.f0;
import b.b;
import b2.a0;
import b2.k1;
import b2.r0;
import b2.s0;
import b2.x;
import b2.y;
import b2.z;
import c2.x;
import d1.q;
import j.a;
import k1.l0;
import k1.p;
import k1.r;
import l.b;
import l.c;
import n.c0;
import n1.b;
import p.a1;
import p.b1;
import p.j1;
import p.y0;
import q.x;
import r0.c;
import z1.a1;
import z1.f;
import z1.h;
import z1.o0;
import z1.o;
import z1.q0;

/* loaded from: classes.dex */
public final class a0 extends k1 {

    /* renamed from: o0, reason: collision with root package name */
    public static final f0 f1413o0;

    /* renamed from: k0, reason: collision with root package name */
    public x f1414k0;
    public y2.a l0;
    public y m0;

    /* renamed from: n0, reason: collision with root package name */
    public h f1415n0;

    static {
        f0 i = l0.i();
        i.H(r.f19517g);
        i.O(1.0f);
        i.P(1);
        f1413o0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0(i0 i0Var, x xVar) {
        super(i0Var);
        y yVar;
        this.f1414k0 = xVar;
        if (i0Var.B != null) {
            yVar = new y(this);
        } else {
            yVar = null;
        }
        this.m0 = yVar;
        this.f1415n0 = (((q) xVar).f15688u.f15690w & 512) != 0 ? new h(this, (y0) xVar) : null;
    }

    @Override // r0
    public final int F0(o oVar) {
        y yVar = this.m0;
        if (yVar != null) {
            c0 c0Var = yVar.N;
            int d2 = c0Var.d(oVar);
            if (d2 >= 0) {
                return c0Var.f20851c[d2];
            }
            return Integer.MIN_VALUE;
        }
        return c(this, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H1(x xVar) {
        if (!xVar.equals(this.f1414k0)) {
            if ((((q) xVar).f15688u.f15690w & 512) != 0) {
                y0 y0Var = (y0) xVar;
                h hVar = this.f1415n0;
                if (hVar != null) {
                    hVar.f31818v = y0Var;
                } else {
                    hVar = new h(this, y0Var);
                }
                this.f1415n0 = hVar;
            } else {
                this.f1415n0 = null;
            }
        }
        this.f1414k0 = xVar;
    }

    @Override // o0
    public final int Z(int i) {
        h hVar = this.f1415n0;
        if (hVar != null) {
            y0 y0Var = hVar.f31818v;
            k1 k1Var = this.L;
            k1Var.getClass();
            k1 k1Var2 = y0Var.f15688u.B;
            k1Var2.getClass();
            s0 f12 = k1Var2.f1();
            f12.getClass();
            if (f12.N0()) {
                return y0Var.Z0(new f(hVar, hVar.getLayoutDirection()), new m1(k1Var, o1.f1565u, p1.f1576v, 0), y2.b(i, 0, 13)).getHeight();
            }
            return k1Var.Z(i);
        }
        x xVar = this.f1414k0;
        k1 k1Var3 = this.L;
        k1Var3.getClass();
        return xVar.n(this, k1Var3, i);
    }

    @Override // o0
    public final int c(int i) {
        h hVar = this.f1415n0;
        if (hVar != null) {
            y0 y0Var = hVar.f31818v;
            k1 k1Var = this.L;
            k1Var.getClass();
            k1 k1Var2 = y0Var.f15688u.B;
            k1Var2.getClass();
            s0 f12 = k1Var2.f1();
            f12.getClass();
            if (f12.N0()) {
                return y0Var.Z0(new f(hVar, hVar.getLayoutDirection()), new m1(k1Var, o1.f1566v, p1.f1576v, 0), y2.b(i, 0, 13)).getHeight();
            }
            return k1Var.c(i);
        }
        x xVar = this.f1414k0;
        k1 k1Var3 = this.L;
        k1Var3.getClass();
        return xVar.A(this, k1Var3, i);
    }

    @Override // k1
    public final void c1() {
        if (this.m0 == null) {
            this.m0 = new y(this);
        }
    }

    @Override // k1
    public final s0 f1() {
        return this.m0;
    }

    @Override // k1
    public final q h1() {
        return ((q) this.f1414k0).f15688u;
    }

    @Override // o0
    public final int l(int i) {
        h hVar = this.f1415n0;
        if (hVar != null) {
            y0 y0Var = hVar.f31818v;
            k1 k1Var = this.L;
            k1Var.getClass();
            k1 k1Var2 = y0Var.f15688u.B;
            k1Var2.getClass();
            s0 f12 = k1Var2.f1();
            f12.getClass();
            if (f12.N0()) {
                return y0Var.Z0(new f(hVar, hVar.getLayoutDirection()), new m1(k1Var, o1.f1565u, p1.f1575u, 0), y2.b(0, i, 7)).getWidth();
            }
            return k1Var.l(i);
        }
        x xVar = this.f1414k0;
        k1 k1Var3 = this.L;
        k1Var3.getClass();
        return xVar.v(this, k1Var3, i);
    }

    @Override // o0
    public final int n(int i) {
        h hVar = this.f1415n0;
        if (hVar != null) {
            y0 y0Var = hVar.f31818v;
            k1 k1Var = this.L;
            k1Var.getClass();
            k1 k1Var2 = y0Var.f15688u.B;
            k1Var2.getClass();
            s0 f12 = k1Var2.f1();
            f12.getClass();
            if (f12.N0()) {
                return y0Var.Z0(new f(hVar, hVar.getLayoutDirection()), new m1(k1Var, o1.f1566v, p1.f1575u, 0), y2.b(0, i, 7)).getWidth();
            }
            return k1Var.n(i);
        }
        x xVar = this.f1414k0;
        k1 k1Var3 = this.L;
        k1Var3.getClass();
        return xVar.J(this, k1Var3, i);
    }

    @Override // a1
    public final void r0(long j10, float f10, df.l lVar) {
        boolean z3;
        y2.l lVar2;
        if (this.J) {
            s0 f12 = f1();
            f12.getClass();
            w1(f12.J, f10, lVar);
        } else {
            w1(j10, f10, lVar);
        }
        if (!this.D) {
            t1();
            h hVar = this.f1415n0;
            if (hVar != null) {
                this.m0.getClass();
                if (!hVar.f31819w) {
                    long j11 = this.f31771w;
                    y yVar = this.m0;
                    y2.l lVar3 = null;
                    if (yVar != null) {
                        lVar2 = new y2.l(yVar.X0());
                    } else {
                        lVar2 = null;
                    }
                    if (y2.b(j11, lVar2)) {
                        k1 k1Var = this.L;
                        k1Var.getClass();
                        long j12 = k1Var.f31771w;
                        k1 k1Var2 = this.L;
                        k1Var2.getClass();
                        s0 f13 = k1Var2.f1();
                        if (f13 != null) {
                            lVar3 = new y2.l(f13.X0());
                        }
                        if (y2.b(j12, lVar3)) {
                            z3 = true;
                            k1 k1Var3 = this.L;
                            k1Var3.getClass();
                            k1Var3.J = z3;
                        }
                    }
                }
                z3 = false;
                k1 k1Var32 = this.L;
                k1Var32.getClass();
                k1Var32.J = z3;
            }
            P0().a();
            k1 k1Var4 = this.L;
            k1Var4.getClass();
            k1Var4.J = false;
        }
    }

    @Override // k1
    public final void v1(p pVar, b bVar) {
        k1 k1Var;
        k1 k1Var2 = this.L;
        k1Var2.getClass();
        k1Var2.a1(pVar, bVar);
        if (((x) m0.a(this.I)).getShowLayoutBounds() && (k1Var = this.L) != null) {
            if (!y2.c(this.f31771w, k1Var.f31771w) || !y2.a(k1Var.V, 0L)) {
                long j10 = this.f31771w;
                pVar.j(0.5f, 0.5f, ((int) (j10 >> 32)) - 0.5f, ((int) (j10 & 4294967295L)) - 0.5f, f1413o0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (r9 == r1.f31770v) goto L32;
     */
    @Override // o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a1 z(long r8) {
        /*
            r7 = this;
            boolean r0 = r7.K
            if (r0 == 0) goto L12
            y2.a r8 = r7.l0
            if (r8 == 0) goto Lb
            long r8 = r8.f30799a
            goto L12
        Lb:
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            x.n(r8)
            r8 = 0
            return r8
        L12:
            r7.A0(r8)
            h r0 = r7.f1415n0
            if (r0 == 0) goto Lbe
            y0 r1 = r0.f31818v
            b2.a0 r2 = r0.f31817u
            y r2 = r2.m0
            r2.getClass()
            q0 r2 = r2.P0()
            r2.getWidth()
            r2.getHeight()
            b1 r2 = r1.I
            a1 r2 = r2.e()
            boolean r2 = r2.b()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L49
            b1 r2 = r1.I
            a1 r2 = r2.e()
            j1 r2 = r2.f22094b
            boolean r2 = r2.a()
            if (r2 == 0) goto L49
            goto L54
        L49:
            y2.a r2 = r7.l0
            if (r2 != 0) goto L4e
            goto L54
        L4e:
            long r5 = r2.f30799a
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 == 0) goto L56
        L54:
            r2 = r3
            goto L57
        L56:
            r2 = r4
        L57:
            r0.f31819w = r2
            if (r2 != 0) goto L62
            k1 r2 = r7.L
            r2.getClass()
            r2.K = r3
        L62:
            k1 r2 = r7.L
            r2.getClass()
            q0 r8 = r1.Z0(r0, r2, r8)
            k1 r9 = r7.L
            r9.getClass()
            r9.K = r4
            int r9 = r8.getWidth()
            y r1 = r7.m0
            r1.getClass()
            int r1 = r1.f31769u
            if (r9 != r1) goto L8d
            int r9 = r8.getHeight()
            y r1 = r7.m0
            r1.getClass()
            int r1 = r1.f31770v
            if (r9 != r1) goto L8d
            goto L8e
        L8d:
            r3 = r4
        L8e:
            boolean r9 = r0.f31819w
            if (r9 != 0) goto Lc9
            k1 r9 = r7.L
            r9.getClass()
            long r0 = r9.f31771w
            k1 r9 = r7.L
            r9.getClass()
            s0 r9 = r9.f1()
            if (r9 == 0) goto Lae
            long r4 = r9.X0()
            y2.l r9 = new y2.l
            r9.<init>(r4)
            goto Laf
        Lae:
            r9 = 0
        Laf:
            boolean r9 = y2.b(r0, r9)
            if (r9 == 0) goto Lc9
            if (r3 != 0) goto Lc9
            z r9 = new z
            r9.<init>(r8, r7)
            r8 = r9
            goto Lc9
        Lbe:
            x r0 = r7.f1414k0
            k1 r1 = r7.L
            r1.getClass()
            q0 r8 = c(r7, r1, r8)
        Lc9:
            r7.z1(r8)
            r7.s1()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a0.z(long):a1");
    }
}
