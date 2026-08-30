package b2;
import a0.h0;
import a0.l0;
import a2.a;
import a2.b;
import a2.d;
import a2.e;
import a2.f;
import a2.g;
import b2.a2;
import b2.c;
import b2.e2;
import b2.j;
import b2.n;
import b2.o;
import b2.w1;
import b2.w;
import b2.x;
import b2.y1;
import c0.i0;
import d1.p;
import d1.q;
import i1.k;
import i1.r;
import j2.v;
import n.d0;
import r.o0;
import v1.l;
import v1.y;
import v1.z;
import x.a0;
import x.s0;
import x.v0;
import x.y0;
import z.m;
import z1.q0;
import z1.r0;
import z1.t0;
import z1.x0;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.HashSet;
import ya.vd;

/* loaded from: classes.dex */
public final class c extends q implements x, n, e2, a2, e, f, y1, w, o, e, n, p, w1, a {
    public p I;
    public a J;
    public HashSet K;

    @Override // x
    public final int A(r0 r0Var, o0 o0Var, int i) {
        p pVar = this.I;
        pVar.getClass();
        return ((z) pVar).c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, s0.f31888v, t0.f31891v, 2), y2.b(i, 0, 13)).getHeight();
    }

    @Override // n
    public final void A0(k kVar) {
        p pVar = this.I;
        a.b("applyFocusProperties called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // e2
    public final void F0(j jVar) {
        int i;
        p pVar = this.I;
        pVar.getClass();
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) pVar;
        j jVar2 = new j();
        jVar2.f18815w = appendedSemanticsElement.f646a;
        appendedSemanticsElement.f647b.invoke(jVar2);
        jVar.getClass();
        i0 i0Var = jVar.f18813u;
        if (jVar2.f18815w) {
            jVar.f18815w = true;
        }
        if (jVar2.f18816x) {
            jVar.f18816x = true;
        }
        i0 i0Var2 = jVar2.f18813u;
        Object[] objArr = i0Var2.f20893b;
        Object[] objArr2 = i0Var2.f20894c;
        long[] jArr = i0Var2.f20892a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            Object obj = objArr[i14];
                            Object obj2 = objArr2[i14];
                            v vVar = (v) obj;
                            if (!i0Var.b(vVar)) {
                                i0Var.m(vVar, obj2);
                            } else if (obj2 instanceof a) {
                                Object g8 = i0Var.g(vVar);
                                g8.getClass();
                                a aVar = (a) g8;
                                i = i11;
                                String str = aVar.f18775a;
                                if (str == null) {
                                    str = ((a) obj2).f18775a;
                                }
                                pe.d dVar = aVar.f18776b;
                                if (dVar == null) {
                                    dVar = ((a) obj2).f18776b;
                                }
                                i0Var.m(vVar, new a(str, dVar));
                                j10 >>= i;
                                i13++;
                                i11 = i;
                            }
                        }
                        i = i11;
                        j10 >>= i;
                        i13++;
                        i11 = i;
                    }
                    if (i12 != i11) {
                        return;
                    }
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(k r11, l r12, long r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.c.H(k, l, long):void");
    }

    @Override // x
    public final int J(r0 r0Var, o0 o0Var, int i) {
        p pVar = this.I;
        pVar.getClass();
        return ((z) pVar).c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, s0.f31888v, t0.f31890u, 2), y2.b(0, i, 7)).getWidth();
    }

    @Override // e
    public final void L0(r rVar) {
        p pVar = this.I;
        a.b("onFocusEvent called on wrong node");
        pVar.getClass();
        throw new ClassCastException();
    }

    @Override // a2
    public final void O() {
        p pVar = this.I;
        pVar.getClass();
        j6.n nVar = ((z) pVar).f27375d;
        x xVar = (x) nVar.f18939w;
        z zVar = (z) nVar.f18941y;
        if (xVar == x.f27367v) {
            long uptimeMillis = SystemClock.uptimeMillis();
            y yVar = new y(zVar, 0);
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            yVar.invoke(obtain);
            obtain.recycle();
            nVar.f18939w = x.f27366u;
            zVar.f27374c = false;
            nVar.f18940x = null;
        }
    }

    @Override // q
    public final void Q0() {
        Y0(true);
    }

    @Override // q
    public final void R0() {
        Z0();
    }

    @Override // n
    public final void W() {
        l.k(this);
    }

    @Override // a2
    public final void X() {
        p pVar = this.I;
        pVar.getClass();
        ((z) pVar).f27375d.getClass();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [a, java.lang.Object] */
    public final void Y0(boolean z3) {
        if (!this.H) {
            a.b("initializeModifier called on unattached node");
        }
        p pVar = this.I;
        if ((this.f15690w & 32) != 0) {
            boolean z9 = pVar instanceof a0;
            if (z9) {
                b bVar = new b(this, 0);
                d0 d0Var = ((x) l.v(this)).P0;
                if (d0Var.f(bVar) < 0) {
                    d0Var.a(bVar);
                }
            }
            if (z9) {
                a0 a0Var = (a0) pVar;
                a aVar = this.J;
                if (aVar != null) {
                    g gVar = y0.f30031a;
                    if (aVar.a(gVar)) {
                        aVar.f225a = a0Var;
                        d modifierLocalManager = ((x) l.v(this)).getModifierLocalManager();
                        modifierLocalManager.f230b.b(this);
                        modifierLocalManager.f231c.b(gVar);
                        modifierLocalManager.a();
                    }
                }
                Object obj = new Object();
                obj.f225a = a0Var;
                this.J = obj;
                g2 g2Var = (g2) l.u(this).Z.f1460z;
                g2Var.getClass();
                if (g2Var.I) {
                    d modifierLocalManager2 = ((x) l.v(this)).getModifierLocalManager();
                    g gVar2 = y0.f30031a;
                    modifierLocalManager2.f230b.b(this);
                    modifierLocalManager2.f231c.b(gVar2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f15690w & 4) != 0 && !z3) {
            l.s(this, 2).o1();
        }
        if ((this.f15690w & 2) != 0) {
            g2 g2Var2 = (g2) l.u(this).Z.f1460z;
            g2Var2.getClass();
            if (g2Var2.I) {
                k1 k1Var = this.B;
                k1Var.getClass();
                ((a0) k1Var).H1(this);
                u1 u1Var = k1Var.f1531e0;
                if (u1Var != null) {
                    ((y1) u1Var).c();
                }
            }
            if (!z3) {
                l.s(this, 2).o1();
                l.u(this).E();
            }
        }
        if (pVar instanceof h0) {
            h0 h0Var = (h0) pVar;
            i0 u9 = l.u(this);
            switch (h0Var.f61a) {
                case 0:
                    ((l0) h0Var.f62b).f93j = u9;
                    break;
                case 1:
                    ((i0) h0Var.f62b).f3354y.setValue(u9);
                    break;
                default:
                    ((m) h0Var.f62b).f31735j = u9;
                    break;
            }
        }
        if ((this.f15690w & 256) != 0 && (pVar instanceof e)) {
            g2 g2Var3 = (g2) l.u(this).Z.f1460z;
            g2Var3.getClass();
            if (g2Var3.I) {
                l.u(this).E();
            }
        }
        int i = this.f15690w;
        if ((i & 16) != 0 && (pVar instanceof z)) {
            ((z) pVar).f27375d.f18938v = this.B;
        }
        if ((i & 8) != 0) {
            ((x) l.v(this)).B();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.internal.m, df.a] */
    public final void Z0() {
        if (!this.H) {
            a.b("unInitializeModifier called on unattached node");
        }
        p pVar = this.I;
        if ((this.f15690w & 32) != 0) {
            boolean z3 = pVar instanceof a0;
            if (z3) {
                d modifierLocalManager = ((x) l.v(this)).getModifierLocalManager();
                g gVar = y0.f30031a;
                modifierLocalManager.f232d.b(l.u(this));
                modifierLocalManager.e.b(gVar);
                modifierLocalManager.a();
            }
            if (z3) {
                a0 a0Var = (a0) pVar;
                v0 v0Var = (v0) y0.f30031a.f234a.invoke();
                v0 v0Var2 = a0Var.f29935a;
                a0Var.f29936b.setValue(new v(v0Var2, v0Var));
                a0Var.f29937c.setValue(new s0(v0Var, v0Var2));
            }
        }
        if ((this.f15690w & 8) != 0) {
            ((x) l.v(this)).B();
        }
    }

    @Override // a
    public final y2.c a() {
        return l.u(this).S;
    }

    public final void a1() {
        if (this.H) {
            this.K.clear();
            ((x) l.v(this)).getSnapshotObserver().a(this, d.f1424v, new b(this, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [q] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [q] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // e, f
    public final Object b(g gVar) {
        f1 f1Var;
        this.K.add(gVar);
        if (!this.f15688u.H) {
            a.b("visitAncestors called on an unattached node");
        }
        q qVar = this.f15688u.f15692y;
        i0 u9 = l.u(this);
        while (u9 != null) {
            if ((((q) u9.Z.A).f15691x & 32) != 0) {
                while (qVar != null) {
                    if ((qVar.f15690w & 32) != 0) {
                        k kVar = qVar;
                        Object r42 = 0;
                        while (kVar != 0) {
                            if (kVar instanceof e) {
                                e eVar = (e) kVar;
                                if (eVar.f0().a(gVar)) {
                                    return eVar.f0().b(gVar);
                                }
                            } else if ((kVar.f15690w & 32) != 0 && (kVar instanceof k)) {
                                q qVar2 = kVar.J;
                                int i = 0;
                                kVar = kVar;
                                r42 = r42;
                                while (qVar2 != null) {
                                    if ((qVar2.f15690w & 32) != 0) {
                                        i++;
                                        r42 = r42;
                                        if (i == 1) {
                                            kVar = qVar2;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new e(new q[16]);
                                            }
                                            if (kVar != 0) {
                                                r42.b(kVar);
                                                kVar = 0;
                                            }
                                            r42.b(qVar2);
                                        }
                                    }
                                    qVar2 = qVar2.f15693z;
                                    kVar = kVar;
                                    r42 = r42;
                                }
                                if (i == 1) {
                                }
                            }
                            kVar = e(r42);
                        }
                    }
                    qVar = qVar.f15692y;
                }
            }
            u9 = u9.v();
            if (u9 != null && (f1Var = u9.Z) != null) {
                qVar = (g2) f1Var.f1460z;
            } else {
                qVar = null;
            }
        }
        return gVar.f234a.invoke();
    }

    @Override // x
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        p pVar = this.I;
        pVar.getClass();
        return ((z) pVar).c(r0Var, o0Var, j10);
    }

    @Override // j
    public final void d() {
        if (this.I instanceof z) {
            O();
        }
    }

    @Override // a
    public final long e() {
        return vd.c(l.s(this, 128).f31771w);
    }

    @Override // n
    public final void e0(l0 l0Var) {
        p pVar = this.I;
        pVar.getClass();
        ((o0) pVar).f24134a.c(l0Var);
    }

    @Override // e
    public final bc.b f0() {
        a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        return b.f226a;
    }

    @Override // a
    public final y2.m getLayoutDirection() {
        return l.u(this).T;
    }

    @Override // o
    public final void h0(k1 k1Var) {
        p pVar = this.I;
        pVar.getClass();
        e eVar = (e) pVar;
        if (!eVar.f1175a) {
            eVar.f1175a = true;
            pf.l lVar = eVar.f1176b;
            if (lVar != null) {
                lVar.resumeWith(pe.z.f22715a);
            }
            eVar.f1176b = null;
        }
    }

    @Override // y1
    public final Object k(y2.c cVar, Object obj) {
        p pVar = this.I;
        pVar.getClass();
        return ((x0) pVar).e();
    }

    @Override // x
    public final int n(r0 r0Var, o0 o0Var, int i) {
        p pVar = this.I;
        pVar.getClass();
        return ((z) pVar).c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, s0.f31887u, t0.f31891v, 2), y2.b(i, 0, 13)).getHeight();
    }

    @Override // w1
    public final boolean r() {
        return this.H;
    }

    public final String toString() {
        return this.I.toString();
    }

    @Override // x
    public final int v(r0 r0Var, o0 o0Var, int i) {
        p pVar = this.I;
        pVar.getClass();
        return ((z) pVar).c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, s0.f31887u, t0.f31890u, 2), y2.b(0, i, 7)).getWidth();
    }

    @Override // a2
    public final boolean x0() {
        p pVar = this.I;
        pVar.getClass();
        ((z) pVar).f27375d.getClass();
        return true;
    }

    @Override // w
    public final void f(x xVar) {
    }

    @Override // w
    public final void m(long j10) {
    }
}