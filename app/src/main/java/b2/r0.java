package b2;
import b2.c1;
import b2.i0;
import b2.r0;
import c2.x;
import j.a;
import l.a;
import l.c;
import n.i0;
import n.j0;
import y1.a;
import z1.a1;
import z1.k0;
import z1.o;
import z1.q0;
import z1.q;
import z1.r0;
import z1.t;
import z1.x;

import java.util.Map;
import ya.td;

/* loaded from: classes.dex */
public abstract class r0 extends a1 implements z1.r0, c1 {
    public df.l A;
    public z1 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final k0 F = new k0(0, this);
    public d2 G;
    public i0 H;

    /* renamed from: z, reason: collision with root package name */
    public o0 f1587z;

    public static void T0(k1 k1Var) {
        i0 i0Var;
        j0 j0Var;
        k1 k1Var2 = k1Var.L;
        i0 i0Var2 = k1Var.I;
        if (k1Var2 != null) {
            i0Var = k1Var2.I;
        } else {
            i0Var = null;
        }
        if (!kotlin.jvm.internal.a(i0Var, i0Var2)) {
            i0Var2.f1478a0.f1558p.Q.f();
            return;
        }
        a h3 = i0Var2.f1478a0.f1558p.h();
        if (h3 != null && (j0Var = ((a1) h3).Q) != null) {
            j0Var.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(i0 r32, q r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.r0.C0(i0, q):void");
    }

    public abstract int F0(o oVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void G0(z1 z1Var, long j10, long j11) {
        char c10;
        long j12;
        long j13;
        long j14;
        i0 i0Var;
        int i;
        char c11;
        long j15;
        r0 r0Var;
        r0 Q0;
        j0 j0Var;
        x1 snapshotObserver;
        i0 i0Var2 = this.H;
        d2 d2Var = this.G;
        if (d2Var == null) {
            d2Var = new d2();
            this.G = d2Var;
        }
        d2 d2Var2 = d2Var;
        v1 v1Var = O0().H;
        if (v1Var != null && (snapshotObserver = ((x) v1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(z1Var, d.f1425w, new p0(this, j10, j11, z1Var));
        }
        boolean j02 = j0();
        j0 j0Var2 = (j0) d2Var2.e;
        j0 j0Var3 = (j0) d2Var2.f1440f;
        int i10 = d2Var2.f1436a;
        for (int i11 = 0; i11 < i10; i11++) {
            byte b10 = ((byte[]) d2Var2.f1439d)[i11];
            if (b10 == 3) {
                q qVar = ((q[]) d2Var2.f1437b)[i11];
                qVar.getClass();
                j0Var3.j(qVar);
            } else if (b10 != 0 && i0Var2 != null) {
                q qVar2 = ((q[]) d2Var2.f1437b)[i11];
                qVar2.getClass();
                j0 j0Var4 = (j0) i0Var2.k(qVar2);
                if (j0Var4 != null) {
                    j0Var2.k(j0Var4);
                }
            }
        }
        int i12 = d2Var2.f1436a;
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr = (byte[]) d2Var2.f1439d;
            if (bArr[i14] == 2) {
                i13++;
            } else if (i13 > 0) {
                q[] qVarArr = (q[]) d2Var2.f1437b;
                qVarArr[i14 - i13] = qVarArr[i14];
            }
            bArr[i14] = 2;
        }
        int i15 = d2Var2.f1436a;
        for (int i16 = i15 - i13; i16 < i15; i16++) {
            ((q[]) d2Var2.f1437b)[i16] = null;
        }
        d2Var2.f1436a -= i13;
        r0 Q02 = Q0();
        Object[] objArr = j0Var3.f20899b;
        long[] jArr = j0Var3.f20898a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i17 = 8;
        if (length >= 0) {
            j13 = 128;
            int i18 = 0;
            while (true) {
                long j17 = jArr[i18];
                j14 = 255;
                if ((((~j17) << c12) & j17 & j16) != j16) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j17 & 255) < 128) {
                            c11 = c12;
                            q qVar3 = (q) objArr[(i18 << 3) + i20];
                            j15 = j16;
                            if (Q02 == null) {
                                r0Var = this;
                            } else {
                                r0Var = Q02;
                            }
                            i = i17;
                            r0 r0Var2 = r0Var;
                            while (true) {
                                d2 d2Var3 = r0Var2.G;
                                if ((d2Var3 == null || qe.k.p(qVar3, (q[]) d2Var3.f1437b) < 0) && (Q0 = r0Var2.Q0()) != null) {
                                    r0Var2 = Q0;
                                }
                            }
                            i0 i0Var3 = r0Var2.H;
                            if (i0Var3 != null) {
                                j0Var = (j0) i0Var3.k(qVar3);
                            } else {
                                j0Var = null;
                            }
                            if (j0Var != null) {
                                r0Var.U0(j0Var);
                            }
                        } else {
                            i = i17;
                            c11 = c12;
                            j15 = j16;
                        }
                        j17 >>= i;
                        i20++;
                        c12 = c11;
                        j16 = j15;
                        i17 = i;
                    }
                    c10 = c12;
                    j12 = j16;
                    if (i19 != i17) {
                        break;
                    }
                } else {
                    c10 = c12;
                    j12 = j16;
                }
                if (i18 == length) {
                    break;
                }
                i18++;
                c12 = c10;
                j16 = j12;
                i17 = 8;
            }
        } else {
            c10 = 7;
            j12 = -9187201950435737472L;
            j13 = 128;
            j14 = 255;
        }
        j0Var3.b();
        Object[] objArr2 = j0Var2.f20899b;
        long[] jArr2 = j0Var2.f20898a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i21 = 0;
            while (true) {
                long j18 = jArr2[i21];
                if ((((~j18) << c10) & j18 & j12) != j12) {
                    int i22 = 8 - ((~(i21 - length2)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j18 & j14) < j13 && (i0Var = (i0) ((k2) objArr2[(i21 << 3) + i23]).get()) != null) {
                            if (j02) {
                                i0Var.S(false);
                            } else {
                                i0Var.U(false);
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length2) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        j0Var2.b();
    }

    public final void H0(q0 q0Var) {
        boolean z3;
        long j10;
        long j11;
        i0 i0Var = this.H;
        if (!this.E) {
            df.l c10 = q0Var.c();
            boolean z9 = false;
            if (c10 == null) {
                if (i0Var != null) {
                    Object[] objArr = i0Var.f20894c;
                    long[] jArr = i0Var.f20892a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j12 = jArr[i];
                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i - length)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((255 & j12) < 128) {
                                        U0((j0) objArr[(i << 3) + i11]);
                                    }
                                    j12 >>= 8;
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
                    i0Var.a();
                }
            } else {
                if (this.A != c10) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && S0().f1561u) {
                    x M0 = M0();
                    long b10 = td.b(M0.v(0L));
                    long k3 = M0.k();
                    if (!y2.a(b10, S0().f1562v) || !y2.c(k3, S0().f1563w)) {
                        z9 = true;
                    }
                    j11 = b10;
                    j10 = k3;
                    z3 = z9;
                } else {
                    j10 = 0;
                    j11 = 9223372034707292159L;
                }
                if (z3) {
                    z1 z1Var = this.B;
                    if (z1Var != null) {
                        z1Var.f1637u = q0Var;
                    } else {
                        z1Var = new z1(q0Var, this);
                        this.B = z1Var;
                    }
                    G0(z1Var, j11, j10);
                    this.A = q0Var.c();
                }
            }
        }
    }

    public final int K0(o oVar) {
        int F0;
        if (!N0() || (F0 = F0(oVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return F0 + ((int) (this.f31773y & 4294967295L));
    }

    public abstract r0 L0();

    public abstract x M0();

    public abstract boolean N0();

    @Override // c1
    public final void O(boolean z3) {
        i0 i0Var;
        e0 e0Var;
        r0 Q0 = Q0();
        e0 e0Var2 = null;
        if (Q0 != null) {
            i0Var = Q0.O0();
        } else {
            i0Var = null;
        }
        if (kotlin.jvm.internal.a(i0Var, O0())) {
            this.C = z3;
            return;
        }
        if (i0Var != null) {
            e0Var = i0Var.f1478a0.f1548d;
        } else {
            e0Var = null;
        }
        if (e0Var != e0.f1445w) {
            if (i0Var != null) {
                e0Var2 = i0Var.f1478a0.f1548d;
            }
            if (e0Var2 != e0.f1446x) {
                return;
            }
        }
        this.C = z3;
    }

    public abstract i0 O0();

    public abstract q0 P0();

    public abstract r0 Q0();

    public abstract long R0();

    public final o0 S0() {
        o0 o0Var = this.f1587z;
        if (o0Var == null) {
            o0 o0Var2 = new o0(this);
            this.f1587z = o0Var2;
            return o0Var2;
        }
        return o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U0(j0 j0Var) {
        i0 i0Var;
        Object[] objArr = j0Var.f20899b;
        long[] jArr = j0Var.f20898a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && (i0Var = (i0) ((k2) objArr[(i << 3) + i11]).get()) != null) {
                            if (j0()) {
                                i0Var.S(false);
                            } else {
                                i0Var.U(false);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void V0();

    @Override // t
    public boolean j0() {
        return false;
    }

    @Override // z1.r0
    public final q0 y(int i, int i10, Map map, df.l lVar, df.l lVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            a.b("Size(" + i + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new q0(i, i10, map, lVar, lVar2, this, 0);
    }
}
