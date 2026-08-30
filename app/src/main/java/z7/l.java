package z7;
import a.a;
import b.a;
import b.b;
import c.d;
import c.k;
import c.m;
import d.a;
import d.d;
import d.f;
import l.a;
import m.d;
import p.a;
import p.p0;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.b0;
import b8.b8;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.Locale;
import k1.l0;
import k1.r0;
import m2.f0;
import o0.x1;
import p.q0;
import q.k1;
import q1.a0;
import q2.s;
import r0.a1;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import u7.c2;
import u7.r3;
import w7.b9;
import w7.r5;
import wa.j7;
import wa.n7;
import wa.u9;
import wa.v9;
import wa.w9;
import x.o0;
import x.p0;
import x.q;
import x7.n0;
import ya.ae;
import ya.h9;
import ya.xa;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31962a = 0;

    static {
        l0.d(4284246976L);
    }

    public static final void a(String str, r0.m mVar, int i) {
        int i10;
        boolean z3;
        r rVar;
        r rVar2 = (r) mVar;
        rVar2.c0(1242198939);
        if (rVar2.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            rVar = rVar2;
            x1.b(upperCase, androidx.compose.foundation.layout.a.o(d1.o.f15687a, 0.0f, 0.0f, 0.0f, 8, 7), k1.r.c(k1.r.f19515d, 0.5f), ae.e(13), null, s.B, null, ae.e(1), null, 0L, 0, false, 0, 0, null, rVar, 12783024, 0, 130896);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b9(str, i, 1);
        }
    }

    public static final void b(df.l lVar, r0.m mVar, int i) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-979136231);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            d1.r d2 = xa.d(androidx.compose.foundation.layout.d.f506c, xa.b(rVar), false, 14);
            x.r a10 = q.a(x.h.f29962b, d1.c.G, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(d2, rVar);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
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
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar);
            String b10 = n7.b(R.string.help_support_tutorials, rVar);
            long j10 = k1.r.f19515d;
            x1.b(b10, null, k1.r.c(j10, 0.5f), ae.e(13), null, s.B, null, ae.e(1), null, 0L, 0, false, 0, 0, null, rVar, 12782976, 0, 130898);
            d1.o oVar = d1.o.f15687a;
            x.b(androidx.compose.foundation.layout.f(oVar, 12), rVar);
            String b11 = n7.b(R.string.help_faq, rVar);
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = new c2(28);
                rVar.k0(O);
            }
            c(b11, (df.a) O, rVar, 48);
            float f10 = 10;
            x.b(androidx.compose.foundation.layout.f(oVar, f10), rVar);
            String b12 = n7.b(R.string.help_quick_start, rVar);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new b8(13, lVar);
                rVar.k0(O2);
            }
            c(b12, (df.a) O2, rVar, 0);
            x.b(androidx.compose.foundation.layout.f(oVar, f10), rVar);
            String b13 = n7.b(R.string.help_contact_support, rVar);
            boolean h3 = rVar.h(context);
            Object O3 = rVar.O();
            if (h3 || O3 == v0Var) {
                O3 = new t7.c(context, 5);
                rVar.k0(O3);
            }
            c(b13, (df.a) O3, rVar, 0);
            float f11 = 32;
            x.b(androidx.compose.foundation.layout.f(oVar, f11), rVar);
            x1.b(n7.b(R.string.help_cant_find, rVar), androidx.compose.foundation.layout.d(oVar, 1.0f), k1.r.c(j10, 0.4f), ae.e(12), null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar, 3504, 0, 130544);
            rVar = rVar;
            x.b(androidx.compose.foundation.layout.f(oVar, f11), rVar);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a1.a(lVar, i, 20);
        }
    }

    public static final void c(String str, df.a aVar, r0.m mVar, int i) {
        int i10;
        boolean z3;
        String str2;
        boolean z9;
        int i11;
        r rVar = (r) mVar;
        rVar.c0(-740170678);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i | i10;
        if ((i & 48) == 0) {
            if (rVar.h(aVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        if ((i12 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i12 & 1, z3)) {
            d1.r a10 = j7.a(androidx.compose.foundation.layout.d(d1.o.f15687a, 1.0f), f0.e.a(14));
            long j10 = k1.r.f19515d;
            d1.r b10 = androidx.compose.foundation.a.b(a10, k1.r.c(j10, 0.05f), l0.f19495a);
            if ((i12 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O = rVar.O();
            if (z9 || O == r0.l.f24285a) {
                O = new n0(3, aVar);
                rVar.k0(O);
            }
            d1.r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, b10, (df.a) O, 7), 16, 18);
            p0 a11 = o0.a(x.h.f29961a, d1.c.E, rVar, 48);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l11 = rVar.l();
            d1.r c10 = d1.a.c(l10, rVar);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
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
            x1.b(str, new LayoutWeightElement(1.0f, true), j10, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i12 & 14) | 200064, 0, 131024);
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
            t3.f24332d = new b8.h(i, 5, str2, aVar);
        }
    }

    public static final void d(boolean z3, df.a aVar, r0.m mVar, int i) {
        int i10;
        boolean z9;
        boolean z10;
        boolean z11;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(889680610);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        boolean z12 = true;
        if ((i11 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i11 & 1, z9)) {
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = y.B(m.MAIN);
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            Boolean valueOf = Boolean.valueOf(z3);
            int i12 = i11 & 14;
            if (i12 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O2 = rVar.O();
            if (z11 || O2 == v0Var) {
                O2 = new i(z3, a1Var, null, 0);
                rVar.k0(O2);
            }
            y.f((df.p) O2, valueOf, rVar);
            Boolean valueOf2 = Boolean.valueOf(z3);
            if (i12 != 4) {
                z12 = false;
            }
            Object O3 = rVar.O();
            if (z12 || O3 == v0Var) {
                O3 = new j(z3, null);
                rVar.k0(O3);
            }
            y.f((df.p) O3, valueOf2, rVar);
            p0 d2 = androidx.compose.animation.d(q.e.s(300, 0, null, 6), 2);
            k1 s10 = q.e.s(300, 0, null, 6);
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = new f0(13);
                rVar.k0(O4);
            }
            p0 a10 = d2.a(androidx.compose.animation.k((df.l) O4, s10));
            q0 e = androidx.compose.animation.c.e(q.e.s(300, 0, null, 6), 2);
            k1 s11 = q.e.s(300, 0, null, 6);
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = new f0(13);
                rVar.k0(O5);
            }
            z10 = z3;
            h9.c(z10, null, a10, e.a(androidx.compose.animation.m((df.l) O5, s11)), null, z0.h.d(222179594, new a(aVar, a1Var, 1), rVar), rVar, i12 | 200064, 18);
        } else {
            z10 = z3;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r3(z10, aVar, i, 2);
        }
    }

    public static final void e(int i, r0.m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1240129275);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            d1.r d2 = xa.d(androidx.compose.foundation.layout.d.f506c, xa.b(rVar), false, 14);
            x.r a10 = q.a(x.h.f29962b, d1.c.G, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(d2, rVar);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
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
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(b2.g.f1463c, c10, rVar);
            a(n7.b(R.string.help_cat_management, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_move_title, rVar), n7.b(R.string.help_tut_move_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_dup_title, rVar), n7.b(R.string.help_tut_dup_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_export_title, rVar), n7.b(R.string.help_tut_export_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_cover_title, rVar), n7.b(R.string.help_tut_cover_content, rVar), rVar, 0);
            float f10 = 24;
            d1.o oVar = d1.o.f15687a;
            x.b(androidx.compose.foundation.layout.f(oVar, f10), rVar);
            a(n7.b(R.string.help_cat_navigation, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_nav_title, rVar), n7.b(R.string.help_tut_nav_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_view_title, rVar), n7.b(R.string.help_tut_view_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_zoom_title, rVar), n7.b(R.string.help_tut_zoom_content, rVar), rVar, 0);
            x.b(androidx.compose.foundation.layout.f(oVar, f10), rVar);
            a(n7.b(R.string.help_cat_editing, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_tools_title, rVar), n7.b(R.string.help_tut_tools_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_scissor_title, rVar), n7.b(R.string.help_tut_scissor_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_import_title, rVar), n7.b(R.string.help_tut_import_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_text_title, rVar), n7.b(R.string.help_tut_text_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_paper_title, rVar), n7.b(R.string.help_tut_paper_content, rVar), rVar, 0);
            f(n7.b(R.string.help_tut_layers_title, rVar), n7.b(R.string.help_tut_layers_content, rVar), rVar, 0);
            x.b(androidx.compose.foundation.layout.f(oVar, 32), rVar);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 28);
        }
    }

    public static final void f(String str, String str2, r0.m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        String str3;
        q1.e b10;
        int i12;
        boolean z9;
        boolean z10;
        r rVar = (r) mVar;
        rVar.c0(49369454);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if ((i14 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i14 & 1, z3)) {
            Object O = rVar.O();
            v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = y.B(Boolean.FALSE);
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            d1.o oVar = d1.o.f15687a;
            d1.r a10 = j7.a(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, 10, 7), f0.e.a(14));
            long j10 = k1.r.f19515d;
            d1.r b11 = androidx.compose.foundation.a.b(a10, k1.r.c(j10, 0.05f), l0.f19495a);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new w7.h9(a1Var, 15);
                rVar.k0(O2);
            }
            d1.r a11 = androidx.compose.animation.a(androidx.compose.foundation.a.f(null, false, b11, (df.a) O2, 7));
            x.r a12 = q.a(x.h.f29962b, d1.c.G, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(a11, rVar);
            b2.h.f1471d.getClass();
            b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            b2.f fVar = b2.g.e;
            y.I(fVar, a12, rVar);
            b2.f fVar2 = b2.g.f1464d;
            y.I(fVar2, l10, rVar);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            y.I(fVar4, c10, rVar);
            d1.r d2 = androidx.compose.foundation.layout.d(oVar, 1.0f);
            float f10 = 16;
            float f11 = 18;
            d1.r l11 = androidx.compose.foundation.layout.a.l(d2, f10, f11);
            p0 a13 = o0.a(x.h.f29961a, d1.c.E, rVar, 48);
            int hashCode2 = Long.hashCode(rVar.T);
            z0.g l12 = rVar.l();
            d1.r c11 = d1.a.c(l11, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, a13, rVar);
            y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar);
            long e = ae.e(17);
            s sVar = s.A;
            if (1.0f <= 0.0d) {
                y.a("invalid weight; must be greater than zero");
            }
            x1.b(str, new LayoutWeightElement(1.0f, true), j10, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i14 & 14) | 200064, 0, 131024);
            rVar = rVar;
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                b10 = w9.f29850a;
                if (b10 == null) {
                    q1.d dVar = new q1.d("Filled.KeyboardArrowUp", 24.0f, 24.0f, 96);
                    int i15 = a0.f23216a;
                    r0 r0Var = new r0(k1.r.f19513b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new q1.m(7.41f, 15.41f));
                    arrayList.add(new q1.l(12.0f, 10.83f));
                    arrayList.add(new q1.q(4.59f, 4.58f));
                    arrayList.add(new q1.l(18.0f, 14.0f));
                    arrayList.add(new q1.q(-6.0f, -6.0f));
                    arrayList.add(new q1.q(-6.0f, 6.0f));
                    arrayList.add(q1.i.f23278b);
                    q1.a(dVar, arrayList, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
                    b10 = dVar.b();
                    w9.f29850a = b10;
                }
            } else {
                q1.e eVar = u9.f29830a;
                if (eVar != null) {
                    b10 = eVar;
                } else {
                    q1.d dVar2 = new q1.d("Filled.KeyboardArrowDown", 24.0f, 24.0f, 96);
                    int i16 = a0.f23216a;
                    r0 r0Var2 = new r0(k1.r.f19513b);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new q1.m(7.41f, 8.59f));
                    arrayList2.add(new q1.l(12.0f, 13.17f));
                    arrayList2.add(new q1.q(4.59f, -4.58f));
                    arrayList2.add(new q1.l(18.0f, 10.0f));
                    arrayList2.add(new q1.q(-6.0f, 6.0f));
                    arrayList2.add(new q1.q(-6.0f, -6.0f));
                    arrayList2.add(new q1.q(1.41f, -1.41f));
                    arrayList2.add(q1.i.f23278b);
                    q1.a(dVar2, arrayList2, 0, r0Var2, null, 1.0f, 0, 2, 1.0f);
                    b10 = dVar2.b();
                    u9.f29830a = b10;
                }
            }
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                i12 = R.string.collapse;
            } else {
                i12 = R.string.expand;
            }
            o0.y.b(b10, n7.b(i12, rVar), null, k1.r.c(j10, 0.6f), rVar, 3072, 4);
            rVar.p(true);
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                rVar.a0(550880254);
                d1.r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f10, 0.0f, f10, f11, 2);
                z1.p0 d10 = x.d(d1.c.f15670u, false);
                int hashCode3 = Long.hashCode(rVar.T);
                z0.g l13 = rVar.l();
                d1.r c12 = d1.a.c(o10, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(fVar, d10, rVar);
                y.I(fVar2, l13, rVar);
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar, hashCode3, fVar3);
                }
                y.I(fVar4, c12, rVar);
                str3 = str2;
                x1.b(str3, null, k1.r.c(j10, 0.8f), ae.e(15), null, null, null, 0L, null, ae.e(22), 0, false, 0, 0, null, rVar, ((i14 >> 3) & 14) | 3456, 6, 130034);
                rVar = rVar;
                z9 = true;
                rVar.p(true);
                z10 = false;
            } else {
                z9 = true;
                z10 = false;
                str3 = str2;
                rVar.a0(540077374);
            }
            rVar.p(z10);
            rVar.p(z9);
        } else {
            str3 = str2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.l(i, 18, str, str3);
        }
    }
}
