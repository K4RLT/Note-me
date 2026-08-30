package z7;
import a.a;
import c.d;
import c.k;
import c.m;

import androidx.compose.foundation.layout.LayoutWeightElement;
import b8.b0;
import com.daren.scraply.R;
import k1.l0;
import m2.f0;
import o0.x1;
import p.p0;
import p.q0;
import q.k1;
import q2.s;
import r0.a1;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import u7.i3;
import wa.j7;
import wa.n7;
import wa.v9;
import x.o0;
import x7.n0;
import ya.ae;
import ya.h9;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31946a = 0;

    static {
        l0.d(4284246976L);
    }

    public static final void a(boolean z3, String str, df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        String str2;
        boolean z10;
        Object i3Var;
        a1 a1Var;
        boolean z11 = z3;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(1713531247);
        if (rVar.g(z11)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar.f(str)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        boolean z12 = true;
        if ((i13 & 147) != 146) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i13 & 1, z9)) {
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = y.B(str);
                rVar.k0(O);
            }
            a1 a1Var2 = (a1) O;
            Boolean valueOf = Boolean.valueOf(z11);
            int i14 = i13 & 14;
            if (i14 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i13 & 112) != 32) {
                z12 = false;
            }
            boolean z13 = z10 | z12;
            Object O2 = rVar.O();
            if (!z13 && O2 != v0Var) {
                str2 = str;
                i3Var = O2;
                a1Var = a1Var2;
            } else {
                a1Var = a1Var2;
                i3Var = new i3(z3, str, a1Var, null, 3);
                str2 = str;
                rVar.k0(i3Var);
            }
            y.g(valueOf, str2, (df.p) i3Var, rVar);
            p0 d2 = androidx.compose.animation.d(q.e.s(300, 0, null, 6), 2);
            k1 s10 = q.e.s(300, 0, null, 6);
            Object O3 = rVar.O();
            if (O3 == v0Var) {
                O3 = new f0(13);
                rVar.k0(O3);
            }
            p0 a10 = d2.a(androidx.compose.animation.k((df.l) O3, s10));
            q0 e = androidx.compose.animation.c.e(q.e.s(300, 0, null, 6), 2);
            k1 s11 = q.e.s(300, 0, null, 6);
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = new f0(13);
                rVar.k0(O4);
            }
            z11 = z3;
            h9.c(z11, null, a10, e.a(androidx.compose.animation.m((df.l) O4, s11)), null, z0.h.d(404428871, new a(aVar, a1Var, 0), rVar), rVar, i14 | 200064, 18);
        } else {
            str2 = str;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b0(z11, str2, aVar, i);
        }
    }

    public static final void b(String str, df.a aVar, r0.m mVar, int i) {
        int i10;
        boolean z3;
        String str2;
        r rVar = (r) mVar;
        rVar.c0(1105751962);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i | i10;
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            d1.r a10 = j7.a(androidx.compose.foundation.layout.d(d1.o.f15687a, 1.0f), f0.e.a(14));
            long j10 = k1.r.f19515d;
            d1.r b10 = androidx.compose.foundation.a.b(a10, k1.r.c(j10, 0.05f), l0.f19495a);
            Object O = rVar.O();
            if (O == r0.l.f24285a) {
                O = new n0(2, aVar);
                rVar.k0(O);
            }
            d1.r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, b10, (df.a) O, 7), 16, 18);
            x.p0 a11 = o0.a(x.h.f29961a, d1.c.E, rVar, 48);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l11 = rVar.l();
            d1.r c10 = d1.a.c(l10, rVar);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(b2.g.e, a11, rVar);
            y.I(b2.g.f1464d, l11, rVar);
            b2.f fVar = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar);
            long e = ae.e(17);
            s sVar = s.A;
            if (1.0f <= 0.0d) {
                y.a("invalid weight; must be greater than zero");
            }
            x1.b(str, new LayoutWeightElement(1.0f, true), j10, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i11 & 14) | 200064, 0, 131024);
            str2 = str;
            rVar = rVar;
            o0.y.b(v9.a(), n7.b(R.string.open, rVar), null, k1.r.c(j10, 0.6f), rVar, 3072, 4);
            rVar.p(true);
        } else {
            str2 = str;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r7.d(str2, aVar, i);
        }
    }
}
