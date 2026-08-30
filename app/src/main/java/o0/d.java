package o0;
import c2.p1;
import d1.o;
import d1.r;
import e0.b;
import k1.p0;
import k1.r;
import k1.t0;
import m1.a;
import n.a;
import p0.d;
import q.i0;
import q0.g;
import q0.h;
import r.l1;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;
import x.j0;
import x.k0;
import z0.c;
import z0.h;

import ya.xa;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c3.b0 f21443a = new c3.b0(14, true);

    public static final void a(boolean z3, df.a aVar, r rVar, long j10, l1 l1Var, c3.b0 b0Var, p0 p0Var, long j11, float f10, float f11, c cVar, m mVar, int i) {
        int i10;
        long floatToRawIntBits;
        c3.b0 b0Var2;
        l1 l1Var2;
        p0 p0Var2;
        long j12;
        float f12;
        float f13;
        r rVar2;
        long j13;
        c3.b0 b0Var3;
        r rVar3;
        l1 l1Var3;
        p0 p0Var3;
        long j14;
        float f14;
        float f15;
        r rVar4 = (r) mVar;
        rVar4.c0(1431928300);
        if (rVar4.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        if (((i | i10 | 910896512) & 306783379) == 306783378 && rVar4.D()) {
            rVar4.U();
            rVar3 = rVar;
            j13 = j10;
            l1Var3 = l1Var;
            b0Var3 = b0Var;
            p0Var3 = p0Var;
            j14 = j11;
            f14 = f10;
            f15 = f11;
        } else {
            rVar4.W();
            if ((i & 1) != 0 && !rVar4.A()) {
                rVar4.U();
                rVar2 = rVar;
                floatToRawIntBits = j10;
                l1Var2 = l1Var;
                b0Var2 = b0Var;
                p0Var2 = p0Var;
                j12 = j11;
                f12 = f10;
                f13 = f11;
            } else {
                floatToRawIntBits = (Float.floatToRawIntBits(r1) & 4294967295L) | (Float.floatToRawIntBits(0) << 32);
                l1 b10 = xa.b(rVar4);
                float f16 = b0.f21412a;
                p0 a10 = a(h.f23112b, rVar4);
                long c10 = o.c(37, rVar4);
                float f17 = b0.f21412a;
                float f18 = b0.f21413b;
                o oVar = o.f15687a;
                b0Var2 = f21443a;
                l1Var2 = b10;
                p0Var2 = a10;
                j12 = c10;
                f12 = f17;
                f13 = f18;
                rVar2 = oVar;
            }
            rVar4.q();
            Object O = rVar4.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = new i0(Boolean.FALSE);
                rVar4.k0(O);
            }
            i0 i0Var = (i0) O;
            i0Var.f22920c.setValue(Boolean.valueOf(z3));
            if (((Boolean) i0Var.f22919b.getValue()).booleanValue() || ((Boolean) i0Var.f22920c.getValue()).booleanValue()) {
                Object O2 = rVar4.O();
                if (O2 == obj) {
                    O2 = y.B(new t0(t0.f19529b));
                    rVar4.k0(O2);
                }
                a1 a1Var = (a1) O2;
                y2.c cVar2 = (y2.c) rVar4.j(p1.f3606h);
                boolean f19 = rVar4.f(cVar2);
                Object O3 = rVar4.O();
                if (f19 || O3 == obj) {
                    O3 = new p0.d(floatToRawIntBits, cVar2, new c3.d(a1Var, 1));
                    rVar4.k0(O3);
                }
                c3.a((p0.d) O3, aVar, b0Var2, h.d(2126968933, new a(rVar2, i0Var, a1Var, l1Var2, p0Var2, j12, f12, f13, cVar), rVar4), rVar4, 3504, 0);
            }
            j13 = floatToRawIntBits;
            b0Var3 = b0Var2;
            rVar3 = rVar2;
            l1Var3 = l1Var2;
            p0Var3 = p0Var2;
            j14 = j12;
            f14 = f12;
            f15 = f13;
        }
        q1 t3 = rVar4.t();
        if (t3 != null) {
            t3.f24332d = new b(z3, aVar, rVar3, j13, l1Var3, b0Var3, p0Var3, j14, f14, f15, cVar, i);
        }
    }

    public static final void b(c cVar, df.a aVar, r rVar, boolean z3, c0 c0Var, j0 j0Var, m mVar, int i) {
        int i10;
        c0 c0Var2;
        int i11;
        boolean z9;
        r rVar2;
        j0 j0Var2;
        c0 c0Var3;
        r rVar3;
        boolean z10;
        c0 c0Var4;
        j0 j0Var3;
        int i12;
        r rVar4 = (r) mVar;
        rVar4.c0(1826340448);
        if ((i & 48) == 0) {
            if (rVar4.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 = i | i12;
        } else {
            i10 = i;
        }
        int i13 = i10 | 113995136;
        if ((38347923 & i13) == 38347922 && rVar4.D()) {
            rVar4.U();
            rVar3 = rVar;
            z10 = z3;
            c0Var4 = c0Var;
            j0Var3 = j0Var;
        } else {
            rVar4.W();
            if ((i & 1) != 0 && !rVar4.A()) {
                rVar4.U();
                i11 = i13 & (-3670017);
                rVar2 = rVar;
                z9 = z3;
                c0Var3 = c0Var;
                j0Var2 = j0Var;
            } else {
                float f10 = b0.f21412a;
                m mVar2 = (m) rVar4.j(o.f21604a);
                c0 c0Var5 = mVar2.M;
                if (c0Var5 == null) {
                    c0Var2 = new c0(o.b(mVar2, g.f23109g), o.b(mVar2, g.f23110h), o.b(mVar2, g.i), r.c(o.b(mVar2, g.f23107d), g.f23104a), r.c(o.b(mVar2, g.e), g.f23105b), r.c(o.b(mVar2, g.f23108f), g.f23106c));
                    mVar2.M = c0Var2;
                } else {
                    c0Var2 = c0Var5;
                }
                i11 = i13 & (-3670017);
                k0 k0Var = b0.f21414c;
                z9 = true;
                rVar2 = o.f15687a;
                j0Var2 = k0Var;
                c0Var3 = c0Var2;
            }
            rVar4.q();
            b(cVar, aVar, rVar2, z9, c0Var3, j0Var2, rVar4, i11 & 268435454);
            rVar3 = rVar2;
            z10 = z9;
            c0Var4 = c0Var3;
            j0Var3 = j0Var2;
        }
        q1 t3 = rVar4.t();
        if (t3 != null) {
            t3.f24332d = new c(cVar, aVar, rVar3, z10, c0Var4, j0Var3, i, 0);
        }
    }
}
