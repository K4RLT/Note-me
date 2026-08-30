package r;
import b0.x;
import c.a;
import c.b;
import d1.q;
import n.a0;
import n.o;
import r.b0;
import r.d;
import r.q0;
import r0.d1;
import s.i;
import u.c;
import v.f;
import v.g;
import v.j;
import v.k;

import android.view.KeyEvent;
import b2.a2;
import b2.e2;
import b2.j2;
import g0.u1;

/* loaded from: classes.dex */
public abstract class d extends b2.k implements a2, t1.d, e2, j2 {

    /* renamed from: a0, reason: collision with root package name */
    public static final x0 f24052a0 = new Object();
    public i K;
    public q0 L;
    public String M;
    public j2.g N;
    public boolean O;
    public df.a P;
    public final b0 Q;
    public v1.h0 R;
    public b2.j S;
    public k T;
    public f U;
    public final a0 V;
    public long W;
    public i X;
    public boolean Y;
    public final x0 Z;

    public d(i iVar, q0 q0Var, boolean z3, String str, j2.g gVar, df.a aVar) {
        this.K = iVar;
        this.L = q0Var;
        this.M = str;
        this.N = gVar;
        this.O = z3;
        this.P = aVar;
        boolean z9 = false;
        this.Q = new b0(iVar, 0, new u1(1, this, d.class, "onFocusChange", "onFocusChange(Z)V", 0, 3));
        a0 a0Var = o.f20920a;
        this.V = new a0();
        this.W = 0L;
        i iVar2 = this.K;
        this.X = iVar2;
        if (iVar2 == null && this.L != null) {
            z9 = true;
        }
        this.Y = z9;
        this.Z = f24052a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    @Override // t1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.e1()
            long r0 = t1.a(r11)
            boolean r2 = r10.O
            r3 = 3
            r4 = 0
            a0 r5 = r10.V
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = t1.b(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = androidx.compose.foundation.a.k(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.b(r0)
            if (r2 != 0) goto L41
            k r2 = new k
            long r8 = r10.W
            r2.<init>(r8)
            r5.h(r0, r2)
            i r0 = r10.K
            if (r0 == 0) goto L3f
            pf.z r0 = r10.M0()
            b r1 = new b
            r5 = 1
            r1.<init>(r10, r2, r4, r5)
            pf.x(r0, r4, r1, r3)
        L3f:
            r0 = r6
            goto L42
        L41:
            r0 = r7
        L42:
            boolean r11 = r10.g1(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.O
            if (r2 == 0) goto L7a
            int r2 = t1.b(r11)
            if (r2 != r6) goto L7a
            boolean r2 = androidx.compose.foundation.a.k(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.g(r0)
            k r0 = (k) r0
            if (r0 == 0) goto L77
            i r1 = r10.K
            if (r1 == 0) goto L74
            pf.z r1 = r10.M0()
            b r2 = new b
            r5 = 2
            r2.<init>(r10, r0, r4, r5)
            pf.x(r1, r4, r2, r3)
        L74:
            r10.h1(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.E(android.view.KeyEvent):boolean");
    }

    @Override // b2.e2
    public final void F0(j2.j jVar) {
        j2.g gVar = this.N;
        if (gVar != null) {
            j2.c(jVar, gVar.f18786a);
        }
        String str = this.M;
        a2.c cVar = new a2.c(27, this);
        kf.g[] gVarArr = j2.u.f18865a;
        jVar.k(j2.i.f18790b, new j2.a(str, cVar));
        if (this.O) {
            this.Q.F0(jVar);
        } else {
            jVar.k(j2.i, pe.z.f22715a);
        }
        b1(jVar);
    }

    @Override // b2.a2
    public final void H(v1.k kVar, v1.l lVar, long j10) {
        long j11 = ((j10 >> 33) << 32) | (((j10 << 32) >> 33) & 4294967295L);
        this.W = (Float.floatToRawIntBits((int) (j11 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j11 & 4294967295L)) & 4294967295L);
        e1();
        int i = 3;
        te.c cVar = null;
        if (this.O && lVar == v1.l.f27332v) {
            int i10 = kVar.e;
            if (i10 == 4) {
                pf.x(M0(), null, new c(this, cVar, 0), 3);
            } else if (i10 == 5) {
                pf.x(M0(), null, new c(this, cVar, 1), 3);
            }
        }
        if (this.R == null) {
            b8.s sVar = new b8.s(i, this);
            v1.k kVar2 = v1.d0.f27293a;
            v1.h0 h0Var = new v1.h0(null, null, null, sVar);
            Y0(h0Var);
            this.R = h0Var;
        }
        v1.h0 h0Var2 = this.R;
        if (h0Var2 != null) {
            h0Var2.H(kVar, lVar, j10);
        }
    }

    @Override // b2.e2
    public final boolean H0() {
        return true;
    }

    @Override // q
    public final boolean N0() {
        return false;
    }

    @Override // b2.a2
    public final void O() {
        f fVar;
        i iVar = this.K;
        if (iVar != null && (fVar = this.U) != null) {
            iVar.b(new g(fVar));
        }
        this.U = null;
        v1.h0 h0Var = this.R;
        if (h0Var != null) {
            h0Var.O();
        }
    }

    @Override // q
    public final void Q0() {
        if (!this.Y) {
            e1();
        }
        if (this.O) {
            Y0(this.Q);
        }
    }

    @Override // q
    public final void R0() {
        d1();
        if (this.X == null) {
            this.K = null;
        }
        b2.j jVar = this.S;
        if (jVar != null) {
            Z0(jVar);
        }
        this.S = null;
    }

    public abstract Object c1(v1.w wVar, te.c cVar);

    public final void d1() {
        i iVar = this.K;
        a0 a0Var = this.V;
        if (iVar != null) {
            k kVar = this.T;
            if (kVar != null) {
                iVar.b(new j(kVar));
            }
            f fVar = this.U;
            if (fVar != null) {
                iVar.b(new g(fVar));
            }
            Object[] objArr = a0Var.f20837c;
            long[] jArr = a0Var.f20835a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j10 = jArr[i];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j10) < 128) {
                                iVar.b(new j((k) objArr[(i << 3) + i11]));
                            }
                            j10 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.T = null;
        this.U = null;
        a0Var.a();
    }

    public final void e1() {
        q0 q0Var;
        if (this.S == null && (q0Var = this.L) != null) {
            if (this.K == null) {
                this.K = new i();
            }
            this.Q.d1(this.K);
            i iVar = this.K;
            iVar.getClass();
            b2.j a10 = q0Var.a(iVar);
            Y0(a10);
            this.S = a10;
        }
    }

    public abstract boolean g1(KeyEvent keyEvent);

    @Override // t1.d
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    public abstract void h1(KeyEvent keyEvent);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r3.S == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i1(i r4, q0 r5, boolean r6, java.lang.String r7, j2.g r8, df.a r9) {
        /*
            r3 = this;
            i r0 = r3.X
            boolean r0 = kotlin.jvm.internal.a(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.d1()
            r3.X = r4
            r3.K = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            q0 r0 = r3.L
            boolean r0 = kotlin.jvm.internal.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.L = r5
            r4 = r1
        L1f:
            boolean r5 = r3.O
            b0 r0 = r3.Q
            if (r5 == r6) goto L36
            if (r6 == 0) goto L2b
            r3.Y0(r0)
            goto L31
        L2b:
            r3.Z0(r0)
            r3.d1()
        L31:
            b2.l.m(r3)
            r3.O = r6
        L36:
            java.lang.String r5 = r3.M
            boolean r5 = kotlin.jvm.internal.a(r5, r7)
            if (r5 != 0) goto L43
            r3.M = r7
            b2.l.m(r3)
        L43:
            j2.g r5 = r3.N
            boolean r5 = kotlin.jvm.internal.a(r5, r8)
            if (r5 != 0) goto L50
            r3.N = r8
            b2.l.m(r3)
        L50:
            r3.P = r9
            boolean r5 = r3.Y
            i r6 = r3.X
            if (r6 != 0) goto L5e
            q0 r7 = r3.L
            if (r7 == 0) goto L5e
            r7 = r1
            goto L5f
        L5e:
            r7 = r2
        L5f:
            if (r5 == r7) goto L71
            if (r6 != 0) goto L68
            q0 r5 = r3.L
            if (r5 == 0) goto L68
            r2 = r1
        L68:
            r3.Y = r2
            if (r2 != 0) goto L71
            b2.j r5 = r3.S
            if (r5 != 0) goto L71
            goto L72
        L71:
            r1 = r4
        L72:
            if (r1 == 0) goto L87
            b2.j r4 = r3.S
            if (r4 != 0) goto L7c
            boolean r5 = r3.Y
            if (r5 != 0) goto L87
        L7c:
            if (r4 == 0) goto L81
            r3.Z0(r4)
        L81:
            r4 = 0
            r3.S = r4
            r3.e1()
        L87:
            i r4 = r3.K
            d1(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.i1(i, q0, boolean, java.lang.String, j2.g, df.a):void");
    }

    @Override // b2.j2
    public final Object j() {
        return this.Z;
    }

    public void f1() {
    }

    public void b1(j2.j jVar) {
    }
}
