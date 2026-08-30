package t;
import b0.x;
import b2.i;
import b2.k1;
import b2.l;
import b2.w;
import d1.q;
import j1.c;
import l.b;
import t0.e;
import w.a;

import ya.vd;

/* loaded from: classes.dex */
public final class i extends q implements w, b2.i {
    public z0 I;
    public final z1 J;
    public boolean K;
    public d L;
    public x N;
    public boolean O;
    public boolean P;
    public boolean R;
    public final k6.i M = new k6.i(29);
    public long Q = 0;

    public i(z0 z0Var, z1 z1Var, boolean z3, d dVar) {
        this.I = z0Var;
        this.J = z1Var;
        this.K = z3;
        this.L = dVar;
    }

    public static final float Y0(i iVar, d dVar) {
        c cVar;
        int compare;
        if (!y2.c(iVar.Q, 0L)) {
            e eVar = (e) iVar.M.f19569v;
            int i = eVar.f25619w - 1;
            Object[] objArr = eVar.f25617u;
            c cVar2 = null;
            if (i < objArr.length) {
                cVar = null;
                while (true) {
                    if (i < 0) {
                        break;
                    }
                    c cVar3 = (c) ((h) objArr[i]).f25405a.invoke();
                    if (cVar3 != null) {
                        long c10 = cVar3.c();
                        long c11 = vd.c(iVar.Q);
                        int ordinal = iVar.I.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                compare = Float.compare(Float.intBitsToFloat((int) (c10 >> 32)), Float.intBitsToFloat((int) (c11 >> 32)));
                            } else {
                                l4.a.o();
                                return 0.0f;
                            }
                        } else {
                            compare = Float.compare(Float.intBitsToFloat((int) (c10 & 4294967295L)), Float.intBitsToFloat((int) (c11 & 4294967295L)));
                        }
                        if (compare <= 0) {
                            cVar = cVar3;
                        } else if (cVar == null) {
                            cVar = cVar3;
                        }
                    }
                    i--;
                }
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (iVar.O) {
                    cVar2 = iVar.Z0();
                }
                if (cVar2 == null) {
                    return 0.0f;
                }
                cVar = cVar2;
            }
            long c12 = vd.c(iVar.Q);
            int ordinal2 = iVar.I.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    float f10 = cVar.f18763a;
                    return dVar.a(f10, cVar.f18765c - f10, Float.intBitsToFloat((int) (c12 >> 32)));
                }
                l4.a.o();
                return 0.0f;
            }
            float f11 = cVar.f18764b;
            return dVar.a(f11, cVar.f18766d - f11, Float.intBitsToFloat((int) (c12 & 4294967295L)));
        }
        return 0.0f;
    }

    @Override // q
    public final boolean N0() {
        return false;
    }

    public final c Z0() {
        if (this.H) {
            k1 t3 = l.t(this);
            x xVar = this.N;
            if (xVar != null) {
                if (!xVar.i()) {
                    xVar = null;
                }
                if (xVar != null) {
                    return t3.u(xVar, false);
                }
            }
        }
        return null;
    }

    public final boolean a1(c cVar, long j10) {
        long c12 = c1(cVar, j10);
        if (Math.abs(Float.intBitsToFloat((int) (c12 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (c12 & 4294967295L))) <= 0.5f) {
            return true;
        }
        return false;
    }

    public final void b1() {
        d dVar = this.L;
        if (dVar == null) {
            dVar = (d) l.h(this, g.f25392a);
        }
        d dVar2 = dVar;
        if (this.R) {
            a.c("launchAnimation called when previous animation was running");
        }
        d.f25356a.getClass();
        pf.x(M0(), null, new b8.l2(this, new m2(c.f25342b), dVar2, (te.c) null, 17), 1);
    }

    public final long c1(c cVar, long j10) {
        long c10 = vd.c(j10);
        int ordinal = this.I.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                d dVar = this.L;
                if (dVar == null) {
                    dVar = (d) l.h(this, g.f25392a);
                }
                float f10 = cVar.f18763a;
                return (Float.floatToRawIntBits(dVar.a(f10, cVar.f18765c - f10, Float.intBitsToFloat((int) (c10 >> 32)))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            }
            l4.a.o();
            return 0L;
        }
        d dVar2 = this.L;
        if (dVar2 == null) {
            dVar2 = (d) l.h(this, g.f25392a);
        }
        float f11 = cVar.f18764b;
        float a10 = dVar2.a(f11, cVar.f18766d - f11, Float.intBitsToFloat((int) (c10 & 4294967295L)));
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(a10) & 4294967295L);
    }

    @Override // w
    public final void m(long j10) {
        int b10;
        c Z0;
        long j11 = this.Q;
        this.Q = j10;
        int ordinal = this.I.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b10 = kotlin.jvm.internal.b((int) (j10 >> 32), (int) (j11 >> 32));
            } else {
                l4.a.o();
                return;
            }
        } else {
            b10 = kotlin.jvm.internal.b((int) (j10 & 4294967295L), (int) (4294967295L & j11));
        }
        if (b10 < 0 && !this.R && !this.O && (Z0 = Z0()) != null && a1(Z0, j11)) {
            this.P = true;
        }
    }
}
