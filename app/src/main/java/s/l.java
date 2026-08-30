package s;
import a.a;
import d.d;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b3.n;
import c3.a0;
import c3.b0;
import d1.o;
import g0.a1;
import k1.l0;
import k1.r;
import r.m1;
import r0.m;
import r0.q1;
import r0.y;
import wa.m7;
import x.o0;
import x.p0;
import x.q;
import x.q0;
import x.s;
import ya.xa;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f24850a = new b0(14, true);

    /* renamed from: b, reason: collision with root package name */
    public static final b f24851b;

    static {
        long j10 = r.f19515d;
        long j11 = r.f19513b;
        f24851b = new b(j10, j11, j11, r.c(j11, 0.38f), r.c(j11, 0.38f));
    }

    public static final void a(b bVar, z0.c cVar, m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-921259293);
        if (rVar.f(bVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        o oVar = o.f15687a;
        if (rVar.f(oVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i13 & 1, z3)) {
            d1.r d2 = xa.d(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(m7.a(oVar, g.f24839d, f0.e.a(g.e), 0L, 0L, 28), bVar.f24826a, l0.f19495a)), 0.0f, g.i, 1), xa.b(rVar), false, 14);
            x.r a10 = q.a(x.h.f29962b, d1.c.G, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(d2, rVar);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(b2.g.e, a10, rVar);
            y.I(b2.g.f1464d, l10, rVar);
            b2.f fVar = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                p.a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar);
            cVar.b(s.f29999a, rVar, 54);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a0.g(i, 11, bVar, cVar);
        }
    }

    public static final void b(String str, b bVar, df.a aVar, m mVar, int i) {
        int i10;
        boolean z3;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(791018367);
        if ((i & 6) == 0) {
            if (rVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.g(true)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i & 384) == 0) {
            if (rVar.f(bVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        int i17 = i & 3072;
        o oVar = o.f15687a;
        if (i17 == 0) {
            if (rVar.f(oVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i10 |= i13;
        }
        if ((i & 24576) == 0) {
            if (rVar.h(null)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        if ((196608 & i) == 0) {
            if (rVar.h(aVar)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i10 |= i11;
        }
        if ((74899 & i10) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            d1.i iVar = g.f24840f;
            q0 q0Var = x.h.f29961a;
            float f10 = g.f24842h;
            x.e i18 = x.h.i(f10);
            if ((i10 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((458752 & i10) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z9 | z10;
            Object O = rVar.O();
            if (z11 || O == r0.l.f24285a) {
                O = new m1(aVar);
                rVar.k0(O);
            }
            d1.r d2 = androidx.compose.foundation.layout.d(androidx.compose.foundation.a.f(str, true, oVar, (df.a) O, 4), 1.0f);
            float f11 = g.f24836a;
            float f12 = g.f24837b;
            float f13 = g.f24838c;
            d1.r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d.m(d2, f11, f13, f12, f13), f10, 0.0f, 2);
            p0 a10 = o0.a(i18, iVar, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(m4, rVar);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(b2.g.e, a10, rVar);
            y.I(b2.g.f1464d, l10, rVar);
            b2.f fVar = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                p.a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar);
            rVar.a0(554788141);
            rVar.p(false);
            m2.q0 q0Var2 = new m2.q0(bVar.f24827b, g.f24843j, g.f24844k, null, null, g.f24846m, g.f24841g, g.f24845l, null, 16613240);
            if (1.0f <= 0.0d) {
                y.a("invalid weight; must be greater than zero");
            }
            a1.b(str, new LayoutWeightElement(1.0f, true), q0Var2, 0, false, 1, 0, null, rVar, (i10 & 14) | 1572864, 952);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new n(str, bVar, aVar, i);
        }
    }

    public static final void c(a0 a0Var, df.a aVar, df.l lVar, m mVar, int i) {
        int i10;
        boolean z3;
        Integer num;
        int i11;
        int i12;
        int i13;
        int i14;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(712057293);
        if ((i & 6) == 0) {
            if (rVar.f(a0Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i & 384) == 0) {
            if (rVar.f(o.f15687a)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i & 3072) == 0) {
            if (rVar.h(lVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            boolean f10 = rVar.f((Configuration) rVar.j(AndroidCompositionLocals_androidKt.f641a)) | rVar.f(context);
            Object O = rVar.O();
            if (f10 || O == r0.l.f24285a) {
                b bVar = f24851b;
                long j10 = bVar.f24826a;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int F = l0.F(j10);
                int color = obtainStyledAttributes.getColor(0, F);
                obtainStyledAttributes.recycle();
                if (color != F) {
                    j10 = l0.c(color);
                }
                long j11 = j10;
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j12 = bVar.f24827b;
                int F2 = l0.F(j12);
                Integer num2 = null;
                if (colorStateList != null) {
                    num = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, F2));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() != F2) {
                    j12 = l0.c(num.intValue());
                }
                long j13 = j12;
                long j14 = bVar.f24829d;
                int F3 = l0.F(j14);
                if (colorStateList != null) {
                    num2 = Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, F3));
                }
                if (num2 != null && num2.intValue() != F3) {
                    j14 = l0.c(num2.intValue());
                }
                long j15 = j14;
                b bVar2 = new b(j11, j13, j13, j15, j15);
                rVar.k0(bVar2);
                O = bVar2;
            }
            d(a0Var, aVar, (b) O, lVar, rVar, (i10 & 1022) | ((i10 << 3) & 57344));
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new n(a0Var, aVar, lVar, i);
        }
    }

    public static final void d(a0 a0Var, df.a aVar, b bVar, df.l lVar, m mVar, int i) {
        int i10;
        boolean z3;
        df.a aVar2;
        a0 a0Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(1447189339);
        if ((i & 6) == 0) {
            if (rVar.f(a0Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i & 384) == 0) {
            if (rVar.f(o.f15687a)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i & 3072) == 0) {
            if (rVar.f(bVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i10 |= i12;
        }
        if ((i & 24576) == 0) {
            if (rVar.h(lVar)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        if ((i10 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            aVar2 = aVar;
            c3.n.a(a0Var, aVar2, f24850a, z0.h.d(795909757, new a0.g(lVar, bVar), rVar), rVar, (i10 & 14) | 3456 | (i10 & 112), 0);
            a0Var2 = a0Var;
        } else {
            aVar2 = aVar;
            a0Var2 = a0Var;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new k0.b0(a0Var2, aVar2, bVar, lVar, i);
        }
    }
}
