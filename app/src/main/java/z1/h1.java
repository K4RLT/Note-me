package z1;
import b0.d1;
import d1.a;
import d1.r;
import j1.c;
import l.a;
import p.a;
import r.m1;
import r0.l;
import r0.m;
import r0.p;
import r0.q1;
import r0.r;
import r0.y;
import z0.c;
import z0.g;

/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f31820a = new u0(4);

    public static final void a(c cVar, m mVar, int i) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(441837433);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            Object O = rVar.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = new Object();
                rVar.k0(O);
            }
            Object obj2 = (n0) O;
            Object O2 = rVar.O();
            if (O2 == obj) {
                O2 = j.f31825w;
                rVar.k0(O2);
            }
            df.a aVar = (df.a) O2;
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.n0();
            }
            if (rVar.S) {
                rVar.b(new m2.a0(21), pe.z.f22715a);
            }
            y.I(l.f31844w, obj2, rVar);
            cVar.b(obj2, rVar, 48);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d1(cVar, i, 3);
        }
    }

    public static final void b(r rVar, df.p pVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        r rVar2 = (r) mVar;
        rVar2.c0(-1298353104);
        if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.h(pVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            Object O = rVar2.O();
            if (O == l.f24285a) {
                O = new k1(u0.f31896v);
                rVar2.k0(O);
            }
            c((k1) O, rVar, pVar, rVar2, (i10 << 3) & 1008);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new c3.g(rVar, pVar, i, 1);
        }
    }

    public static final void c(k1 k1Var, r rVar, df.p pVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        r rVar2 = (r) mVar;
        rVar2.c0(-511989831);
        if ((i & 6) == 0) {
            if (rVar2.h(k1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i & 384) == 0) {
            if (rVar2.h(pVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        if ((i10 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            int hashCode = Long.hashCode(rVar2.T);
            p F = y.F(rVar2);
            r c10 = a.c(rVar, rVar2);
            g l10 = rVar2.l();
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b2.b0.f1423u);
            } else {
                rVar2.n0();
            }
            y.I(k1Var.f31841c, k1Var, rVar2);
            y.I(k1Var.f31842d, F, rVar2);
            y.I(k1Var.e, pVar, rVar2);
            b2.h.f1471d.getClass();
            y.I(b2.g.f1464d, l10, rVar2);
            y.I(b2.g.f1463c, c10, rVar2);
            b2.f fVar = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            rVar2.p(true);
            if (!rVar2.D()) {
                rVar2.a0(-1259274676);
                boolean h3 = rVar2.h(k1Var);
                Object O = rVar2.O();
                if (h3 || O == l.f24285a) {
                    O = new m1(10, k1Var);
                    rVar2.k0(O);
                }
                y.j((df.a) O, rVar2);
                rVar2.p(false);
            } else {
                rVar2.a0(-1259216055);
                rVar2.p(false);
            }
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b3.n(k1Var, rVar, pVar, i, 7);
        }
    }

    public static final float d(long j10, long j11) {
        return Math.min(Float.intBitsToFloat((int) (j11 >> 32)) / Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)) / Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final float e(z0 z0Var, boolean z3, q[] qVarArr, float f10) {
        boolean z9;
        float f11 = Float.NaN;
        for (q qVar : qVarArr) {
            float c10 = z0Var.c(qVar);
            if (!Float.isNaN(f11)) {
                if (c10 > f11) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z3 != z9) {
                }
            }
            f11 = c10;
        }
        if (Float.isNaN(f11)) {
            return f10;
        }
        return f11;
    }

    public static final c f(x xVar) {
        x J = xVar.J();
        if (J != null) {
            return J.u(xVar, true);
        }
        return new c(0.0f, 0.0f, (int) (xVar.k() >> 32), (int) (xVar.k() & 4294967295L));
    }

    public static final c g(x xVar) {
        x i = i(xVar);
        float k3 = (int) (i.k() >> 32);
        float k4 = (int) (i.k() & 4294967295L);
        c u9 = i.u(xVar, true);
        float f10 = u9.f18763a;
        float f11 = 0.0f;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > k3) {
            f10 = k3;
        }
        float f12 = u9.f18764b;
        if (f12 < 0.0f) {
            f12 = 0.0f;
        }
        if (f12 > k4) {
            f12 = k4;
        }
        float f13 = u9.f18765c;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 <= k3) {
            k3 = f13;
        }
        float f14 = u9.f18766d;
        if (f14 >= 0.0f) {
            f11 = f14;
        }
        if (f11 <= k4) {
            k4 = f11;
        }
        if (f10 == k3 || f12 == k4) {
            return c.e;
        }
        long f15 = i.f((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        long f16 = i.f((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(k3) << 32));
        long f17 = i.f((Float.floatToRawIntBits(k3) << 32) | (Float.floatToRawIntBits(k4) & 4294967295L));
        long f18 = i.f((Float.floatToRawIntBits(k4) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (f15 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f16 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (f18 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (f17 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (f15 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (f16 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (f18 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (f17 & 4294967295L));
        return new c(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final boolean h(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final x i(x xVar) {
        x xVar2;
        b2.k1 k1Var;
        x J = xVar.J();
        while (true) {
            x xVar3 = J;
            xVar2 = xVar;
            xVar = xVar3;
            if (xVar == null) {
                break;
            }
            J = xVar.J();
        }
        if (xVar2 instanceof b2.k1) {
            k1Var = (b2.k1) xVar2;
        } else {
            k1Var = null;
        }
        if (k1Var == null) {
            return xVar2;
        }
        b2.k1 k1Var2 = k1Var.M;
        while (true) {
            b2.k1 k1Var3 = k1Var2;
            b2.k1 k1Var4 = k1Var;
            k1Var = k1Var3;
            if (k1Var != null) {
                k1Var2 = k1Var.M;
            } else {
                return k1Var4;
            }
        }
    }

    public static final b2.s0 j(b2.s0 s0Var) {
        b2.i0 i0Var;
        b2.i0 i0Var2 = s0Var.I.I;
        while (true) {
            b2.i0 v2 = i0Var2.v();
            b2.i0 i0Var3 = null;
            if (v2 != null) {
                i0Var = v2.B;
            } else {
                i0Var = null;
            }
            if (i0Var != null) {
                b2.i0 v4 = i0Var2.v();
                if (v4 != null) {
                    i0Var3 = v4.B;
                }
                i0Var3.getClass();
                if (i0Var3.A) {
                    i0Var2 = i0Var2.v();
                    i0Var2.getClass();
                } else {
                    b2.i0 v10 = i0Var2.v();
                    v10.getClass();
                    i0Var2 = v10.B;
                    i0Var2.getClass();
                }
            } else {
                b2.s0 f12 = ((b2.k1) i0Var2.Z.f1459y).f1();
                f12.getClass();
                return f12;
            }
        }
    }

    public static final long k(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) * Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
