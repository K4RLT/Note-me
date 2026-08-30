package r;
import a0.j0;
import b0.i;
import b0.x;
import c.a;
import d1.q;
import n.a0;
import n.o;
import r.d;
import v.i;

import android.view.KeyEvent;
import b8.d5;
import t.k2;

/* loaded from: classes.dex */
public final class v extends d implements b2.i {

    /* renamed from: b0, reason: collision with root package name */
    public df.a f24151b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f24152c0;

    /* renamed from: d0, reason: collision with root package name */
    public final a0 f24153d0;

    /* renamed from: e0, reason: collision with root package name */
    public final a0 f24154e0;

    public v(df.a aVar, df.a aVar2, q0 q0Var, i iVar) {
        super(iVar, q0Var, true, null, null, aVar);
        this.f24151b0 = aVar2;
        this.f24152c0 = true;
        a0 a0Var = o.f20920a;
        this.f24153d0 = new a0();
        this.f24154e0 = new a0();
    }

    @Override // q
    public final void S0() {
        j1();
    }

    @Override // d
    public final void b1(j2.j jVar) {
        if (this.f24151b0 != null) {
            a2.c cVar = new a2.c(28, this);
            kf.g[] gVarArr = j2.u.f18865a;
            jVar.k(j2.i.f18791c, new j2.a(null, cVar));
        }
    }

    @Override // d
    public final Object c1(v1.w wVar, te.c cVar) {
        u uVar;
        te.c cVar2 = null;
        if (this.O && this.f24151b0 != null) {
            uVar = new u(this, 0);
        } else {
            uVar = null;
        }
        p pVar = new p(this, cVar2, 1);
        u uVar2 = new u(this, 1);
        s6.r rVar = k2.f25444a;
        Object i = pf.i(new d5(wVar, pVar, uVar, (df.l) null, uVar2, (te.c) null), cVar);
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        if (i != aVar) {
            i = zVar;
        }
        if (i == aVar) {
            return i;
        }
        return zVar;
    }

    @Override // d
    public final void f1() {
        j1();
    }

    @Override // d
    public final boolean g1(KeyEvent keyEvent) {
        boolean z3;
        long a10 = t1.a(keyEvent);
        if (this.f24151b0 != null) {
            a0 a0Var = this.f24153d0;
            if (a0Var.e(a10) == null) {
                a0Var.h(a10, pf.x(M0(), null, new j0(this, null, 13), 3));
                z3 = true;
                return z3;
            }
        }
        z3 = false;
        return z3;
    }

    @Override // d
    public final void h1(KeyEvent keyEvent) {
        long a10 = t1.a(keyEvent);
        a0 a0Var = this.f24153d0;
        boolean z3 = false;
        if (a0Var.e(a10) != null) {
            pf.d1 d1Var = (pf.d1) a0Var.e(a10);
            if (d1Var != null) {
                if (d1Var.f()) {
                    d1Var.j(null);
                } else {
                    z3 = true;
                }
            }
            a0Var.g(a10);
        }
        if (!z3) {
            this.P.invoke();
        }
    }

    public final void j1() {
        char c10;
        long j10;
        long j11;
        long j12;
        char c11;
        long j13;
        a0 a0Var = this.f24153d0;
        Object[] objArr = a0Var.f20837c;
        long[] jArr = a0Var.f20835a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j14 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            j11 = 128;
            while (true) {
                long j15 = jArr[i];
                j12 = 255;
                if ((((~j15) << c12) & j15 & j14) != j14) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j15 & 255) < 128) {
                            c11 = c12;
                            j13 = j14;
                            ((pf.d1) objArr[(i << 3) + i11]).j(null);
                        } else {
                            c11 = c12;
                            j13 = j14;
                        }
                        j15 >>= 8;
                        i11++;
                        c12 = c11;
                        j14 = j13;
                    }
                    c10 = c12;
                    j10 = j14;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    c10 = c12;
                    j10 = j14;
                }
                if (i == length) {
                    break;
                }
                i++;
                c12 = c10;
                j14 = j10;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        a0Var.a();
        a0 a0Var2 = this.f24154e0;
        Object[] objArr2 = a0Var2.f20837c;
        long[] jArr2 = a0Var2.f20835a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i12 = 0;
            while (true) {
                long j16 = jArr2[i12];
                if ((((~j16) << c10) & j16 & j10) != j10) {
                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j16 & j12) >= j11) {
                            j16 >>= 8;
                        } else {
                            ((t) objArr2[(i12 << 3) + i14]).getClass();
                            throw null;
                        }
                    }
                    if (i13 != 8) {
                        break;
                    }
                }
                if (i12 == length2) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        a0Var2.a();
    }
}
