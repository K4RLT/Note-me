package w7;
import a1.g;
import c.d;
import c.k;
import c.m;
import d1.c;
import d1.o;
import d1.r;
import h9.c;
import m2.f0;
import p.p0;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import x.p;
import z0.h;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q7 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28961a = 50;

    public static final void a(p pVar, boolean z3, e3 e3Var, df.a aVar, m mVar, int i) {
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        pVar.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(345499699);
        if ((i & 6) == 0) {
            if (rVar.f(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            z9 = z3;
            if (rVar.g(z9)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        } else {
            z9 = z3;
        }
        if ((i & 384) == 0) {
            if (rVar.f(e3Var)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i & 3072) == 0) {
            if (rVar.h(aVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.R(i10 & 1, z10)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            r b10 = x7.y0.b(e3Var.p(), pVar.a(o.f15687a, c.B), rVar);
            q.r0 r8 = q.e.r(0.8f, 520.0f, null, 4);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new f0(13);
                rVar.k0(O);
            }
            p0 a10 = androidx.compose.animation.k((df.l) O, r8).a(androidx.compose.animation.d(q.e.r(0.8f, 520.0f, null, 4), 2));
            q.r0 r10 = q.e.r(1.0f, 800.0f, null, 4);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new f0(13);
                rVar.k0(O2);
            }
            ya.c(z9, b10, a10, androidx.compose.animation.m((df.l) O2, r10).a(androidx.compose.animation.c.e(q.e.r(1.0f, 800.0f, null, 4), 2)), null, h.d(911816971, new r7.j(4, aVar, e3Var, context), rVar), rVar, ((i10 >> 3) & 14) | 196608, 16);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new x7.k(pVar, z3, e3Var, aVar, i);
        }
    }

    public static final void b(String str, String str2, List list, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        boolean z9;
        r rVar = (r) mVar;
        rVar.c0(1827303634);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i;
        if (rVar.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.h(list)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        boolean z10 = false;
        if ((i15 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i15 & 1, z3)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            if ((i15 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i15 & 112) == 32) {
                z10 = true;
            }
            boolean h3 = z9 | z10 | rVar.h(list);
            Object O = rVar.O();
            if (h3 || O == l.f24285a) {
                O = new g(21, str, str2, list);
                rVar.k0(O);
            }
            ya.ta.a(fillElement, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.g(str, str2, list, i, 5);
        }
    }

    public static final void c(int i, r rVar, m mVar) {
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-451308100);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i & 1, z3)) {
            Object O = rVar2.O();
            if (O == l.f24285a) {
                O = new f3(14);
                rVar2.k0(O);
            }
            ya.ta.a(rVar, (df.l) O, rVar2, 54);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b8.m(i, 5, rVar);
        }
    }
}
