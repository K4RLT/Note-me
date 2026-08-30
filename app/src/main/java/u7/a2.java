package u7;
import a.a;
import a2.a;
import b2.f;
import b2.g;
import b2.h;
import b8.a0;
import b8.z;
import c2.p1;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import g0.c1;
import g0.d1;
import g0.o;
import i1.i;
import i1.o;
import k1.l0;
import k1.r0;
import k1.r;
import l.a;
import m2.g0;
import m2.q0;
import p.a;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;
import r2.x;
import y2.f;
import z0.g;
import z1.p0;
import z5.a;

import androidx.compose.foundation.layout.FillElement;

/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f25895a = 8;

    public static final void a(final String str, final long j10, final float f10, final df.l lVar, m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        r rVar;
        boolean z9;
        boolean z10;
        boolean z11;
        str.getClass();
        lVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-1579888527);
        if (rVar2.f(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i | i10;
        if (rVar2.e(j10)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar2.c(f10)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar2.h(lVar)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        if ((i17 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i17 & 1, z3)) {
            Object O = rVar2.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = new o();
                rVar2.k0(O);
            }
            o oVar = (o) O;
            Object obj2 = (i) rVar2.j(p1.i);
            int i18 = i17 & 112;
            if (i18 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O2 = rVar2.O();
            if (z9 || O2 == obj) {
                O2 = y.B(new x(str, g0.b(0, str.length()), 4));
                rVar2.k0(O2);
            }
            a1 a1Var = (a1) O2;
            boolean h3 = rVar2.h(obj2) | rVar2.f(a1Var);
            if ((i17 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = z10 | h3;
            if (i18 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z12 | z11;
            Object O3 = rVar2.O();
            if (z13 || O3 == obj) {
                Object eVar = new androidx.ink.brush.e(obj2, lVar, str, a1Var, 2);
                rVar2.k0(eVar);
                O3 = eVar;
            }
            df.a aVar = (df.a) O3;
            Object O4 = rVar2.O();
            if (O4 == obj) {
                O4 = new z1(oVar, null, 0);
                rVar2.k0(O4);
            }
            y.f((df.p) O4, pe.z.f22715a, rVar2);
            boolean f11 = rVar2.f(aVar);
            Object O5 = rVar2.O();
            if (f11 || O5 == obj) {
                O5 = new z(9, aVar);
                rVar2.k0(O5);
            }
            wa.a(true, (df.a) O5, rVar2, 6, 0);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            p0 d2 = x.m.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(fillElement, rVar2);
            h.f1471d.getClass();
            df.a aVar2 = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(aVar2);
            } else {
                rVar2.n0();
            }
            y.I(g.e, d2, rVar2);
            y.I(g.f1464d, l10, rVar2);
            f fVar = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar2);
            r b10 = androidx.compose.foundation.a.b(fillElement, r.c(r.f19513b, 0.55f), l0.f19495a);
            Object O6 = rVar2.O();
            if (O6 == obj) {
                O6 = a.r(rVar2);
            }
            v.i iVar = (v.i) O6;
            boolean f12 = rVar2.f(aVar);
            Object O7 = rVar2.O();
            if (f12 || O7 == obj) {
                O7 = new z(10, aVar);
                rVar2.k0(O7);
            }
            x.m.a(0, androidx.compose.foundation.a.e(b10, iVar, null, false, null, (df.a) O7, 28), rVar2);
            x xVar = (x) a1Var.getValue();
            long j11 = r.f19515d;
            q0 q0Var = new q0(j11, j10, s.B, null, null, 0L, 3, 0L, null, 16744440);
            r0 r0Var = new r0(j11);
            d1 d1Var = new d1(0, 7, 118);
            boolean f13 = rVar2.f(aVar);
            Object O8 = rVar2.O();
            if (f13 || O8 == obj) {
                O8 = new x1(0, aVar);
                rVar2.k0(O8);
            }
            c1 c1Var = new c1(62, (df.l) O8);
            r a10 = androidx.compose.foundation.layout.b.f501a.a(o.f15687a, c.f15671v);
            float f14 = f25895a;
            f fVar2 = new f(f10 - f14);
            f fVar3 = new f(0);
            if (fVar2.compareTo(fVar3) < 0) {
                fVar2 = fVar3;
            }
            float f15 = 24;
            r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(androidx.compose.ui.focus.a(androidx.compose.foundation.layout.d.o(androidx.compose.foundation.layout.a.o(a10, f15, fVar2.f30805u, f15, 0.0f, 8), 140, 460), oVar), r.c(j11, 0.1f), f0.e.a(12)), 14, f14);
            boolean f16 = rVar2.f(a1Var);
            Object O9 = rVar2.O();
            if (f16 || O9 == obj) {
                O9 = new a0(a1Var, 10);
                rVar2.k0(O9);
            }
            o.b(xVar, (df.l) O9, l11, false, q0Var, d1Var, c1Var, true, 0, 0, null, null, r0Var, null, rVar2, 100663296, 24576, 48664);
            rVar = rVar2;
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p(str, j10, f10, lVar, i) { // from class: u7.y1

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f27052u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ long f27053v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f27054w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.l f27055x;

                @Override // df.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int L = y.L(7);
                    a(this.f27052u, this.f27053v, this.f27054w, this.f27055x, (m) obj3, L);
                    return pe.z.f22715a;
                }
            };
        }
    }
}
