package b8;
import a.a;
import a1.f;
import a1.j;
import b.b;
import b2.b0;
import b2.g;
import b2.h;
import b8.o;
import d.d;
import d1.c;
import d1.r;
import f0.e;
import k1.l0;
import o0.x1;
import q2.i;
import q2.s;
import r0.l;
import r0.m;
import r0.q1;
import r0.v0;
import r0.y;
import x2.k;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ya.ae;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2467a = l0.d(3039041294L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f2468b = l0.c(1965299470);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2469c = l0.c(1042552590);

    /* renamed from: d, reason: collision with root package name */
    public static final long f2470d = l0.c(1258291199);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r32, final java.lang.String r33, final i r34, boolean r35, m r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.o.a(java.lang.String, java.lang.String, i, boolean, m, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    public static final void b(k0 k0Var, x5 x5Var, r rVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        x5 x5Var2;
        r rVar2;
        Object kVar;
        Object kVar2;
        Object kVar3;
        Object obj;
        Object kVar4;
        Object kVar5;
        Locale locale;
        int i13;
        boolean z9;
        Object r42;
        String p10;
        long j10 = k0Var.f2291f;
        String str = k0Var.f2288b;
        String str2 = k0Var.f2289c;
        r rVar3 = (r) mVar;
        rVar3.c0(1041394202);
        if (rVar3.f(k0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar3.h(x5Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar3.f(rVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i12 | i15;
        if ((i16 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i16 & 1, z3)) {
            Context context = (Context) rVar3.j(AndroidCompositionLocals_androidKt.f642b);
            boolean d2 = rVar3.d(e.e.h());
            Object O = rVar3.O();
            v0 v0Var = l.f24285a;
            Object obj2 = null;
            if (d2 || O == v0Var) {
                try {
                    kVar = e.e(context, "great-vibes");
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (kVar instanceof pe.k) {
                    kVar = null;
                }
                Typeface typeface = (Typeface) kVar;
                if (typeface == null) {
                    typeface = Typeface.create("cursive", 2);
                }
                O = typeface;
                rVar3.k0(O);
            }
            Typeface typeface2 = (Typeface) O;
            boolean f10 = rVar3.f(typeface2);
            Object O2 = rVar3.O();
            if (f10 || O2 == v0Var) {
                typeface2.getClass();
                O2 = ya.a(typeface2);
                rVar3.k0(O2);
            }
            i iVar = (i) O2;
            boolean d10 = rVar3.d(e.e.h());
            Object O3 = rVar3.O();
            if (d10 || O3 == v0Var) {
                try {
                    kVar2 = ya.a(e.e(context, "playfair"));
                } catch (Throwable th2) {
                    kVar2 = new pe.k(th2);
                }
                if (kVar2 instanceof pe.k) {
                    kVar2 = null;
                }
                Object obj3 = (i) kVar2;
                if (obj3 == null) {
                    obj3 = i.f23347w;
                }
                O3 = obj3;
                rVar3.k0(O3);
            }
            i iVar2 = (i) O3;
            boolean d11 = rVar3.d(e.e.h());
            Object O4 = rVar3.O();
            if (d11 || O4 == v0Var) {
                try {
                    kVar3 = ya.a(e.e(context, "cinzel"));
                } catch (Throwable th3) {
                    kVar3 = new pe.k(th3);
                }
                if (kVar3 instanceof pe.k) {
                    kVar3 = null;
                }
                i iVar3 = (i) kVar3;
                if (iVar3 == null) {
                    O4 = iVar2;
                } else {
                    O4 = iVar3;
                }
                rVar3.k0(O4);
            }
            i iVar4 = (i) O4;
            boolean f11 = rVar3.f(str2) | rVar3.f(str);
            Object O5 = rVar3.O();
            if (f11 || O5 == v0Var) {
                if (mf.f.u(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                    Iterator it = p1.f2508a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m1) obj).f2382a.equals(str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    m1 m1Var = (m1) obj;
                    if (m1Var != null) {
                        try {
                            kVar4 = context.getString(m1Var.e);
                        } catch (Throwable th4) {
                            kVar4 = new pe.k(th4);
                        }
                        if (!(kVar4 instanceof pe.k)) {
                            obj2 = kVar4;
                        }
                        obj2 = (String) obj2;
                    }
                    if (obj2 == null) {
                        String string = context.getString(R.string.app_name);
                        string.getClass();
                        O5 = string;
                    } else {
                        O5 = obj2;
                    }
                } else {
                    O5 = str2;
                }
                rVar3.k0(O5);
            }
            String str3 = (String) O5;
            boolean e = rVar3.e(j10);
            Object O6 = rVar3.O();
            if (e || O6 == v0Var) {
                try {
                    kVar5 = DateFormat.getDateInstance(1).format(new Date(j10));
                } catch (Throwable th5) {
                    kVar5 = new pe.k(th5);
                }
                if (kVar5 instanceof pe.k) {
                    kVar5 = "";
                }
                O6 = (String) kVar5;
                rVar3.k0(O6);
            }
            String str4 = (String) O6;
            l0 l0Var = m0.Companion;
            String str5 = k0Var.f2292g;
            l0Var.getClass();
            str5.getClass();
            if (n.f2432a[m0.KRAFT.ordinal()] == 1) {
                r b10 = androidx.compose.ui.draw.a.b(wa.a(androidx.compose.ui.draw.a(androidx.compose.foundation.layout.a.c(rVar, 0.69f), new j(10)), e.a(6)), new j(9));
                z1.p0 d12 = x.d(c.f15670u, false);
                int hashCode = Long.hashCode(rVar3.T);
                g l10 = rVar3.l();
                r c10 = a.c(b10, rVar3);
                h.f1471d.getClass();
                b0 b0Var = g.f1462b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var);
                } else {
                    rVar3.n0();
                }
                f fVar = g.e;
                y.I(fVar, d12, rVar3);
                f fVar2 = g.f1464d;
                y.I(fVar2, l10, rVar3);
                f fVar3 = g.f1465f;
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                    a.t(hashCode, rVar3, hashCode, fVar3);
                }
                f fVar4 = g.f1463c;
                y.I(fVar4, c10, rVar3);
                r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.d.f506c, 22, 20);
                h hVar = c.H;
                x.c cVar = x.h.f29962b;
                x.r a10 = x.q.a(cVar, hVar, rVar3, 48);
                int hashCode2 = Long.hashCode(rVar3.T);
                g l12 = rVar3.l();
                r c11 = a.c(l11, rVar3);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var);
                } else {
                    rVar3.n0();
                }
                y.I(fVar, a10, rVar3);
                y.I(fVar2, l12, rVar3);
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                    a.t(hashCode2, rVar3, hashCode2, fVar3);
                }
                y.I(fVar4, c11, rVar3);
                String k3 = a.k("✦  ", wa.n7.b(R.string.certificate_atelier, rVar3), "  ✦");
                long d13 = ae.d(7.2d);
                s sVar = s.B;
                long c12 = ae.c(0.28d);
                d1.o oVar = d1.o.f15687a;
                x1.b(k3, androidx.compose.foundation.layout.d(oVar, 1.0f), f2468b, d13, null, sVar, iVar4, c12, k.a(), 0L, 0, false, 0, 0, null, rVar3, 12783024, 0, 130320);
                String b11 = wa.n7.b(R.string.certificate_title, rVar3);
                Locale locale2 = Locale.ROOT;
                String upperCase = b11.toUpperCase(locale2);
                upperCase.getClass();
                long j11 = r4.f2648p;
                float f12 = 3;
                x1.b(upperCase, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13), j11, ae.e(11), null, sVar, iVar4, ae.c(0.16d), k.a(), 0L, 0, false, 0, 0, null, rVar3, 12783024, 0, 130320);
                String b12 = wa.n7.b(R.string.certificate_statement, rVar3);
                long d14 = ae.d(7.5d);
                long e8 = ae.e(11);
                float f13 = 4;
                float f14 = 8;
                r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f14, f13, f14, 0.0f, 8);
                q2.o oVar2 = new q2.o(1);
                k a11 = k.a();
                long j12 = f2467a;
                x1.b(b12, o10, j12, d14, oVar2, null, iVar2, 0L, a11, e8, 0, false, 0, 0, null, rVar3, 3456, 6, 129440);
                e(6, androidx.compose.foundation.layout.a.o(oVar, 0.0f, f14, 0.0f, f13, 5), rVar3);
                x.b(x.a(), rVar3);
                x1.b(str3, androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.d(oVar, 1.0f), f14, 2), j11, ae.e(32), null, null, iVar, 0L, k.a(), ae.e(36), 2, false, 2, 0, null, rVar3, 3504, 3126, 119216);
                x.b(x.a(), rVar3);
                float f15 = 10;
                e(6, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 0.0f, 0.0f, f15, 7), rVar3);
                a(wa.n7.b(R.string.certificate_number, rVar3), k0Var.f2290d, iVar2, true, rVar3, 3072, 0);
                str4.getClass();
                if (!mf.f.u(str4)) {
                    rVar3.a0(-92879971);
                    locale = locale2;
                    i13 = -103565020;
                    a(wa.n7.b(R.string.certificate_date, rVar3), str4, iVar2, false, rVar3, 0, 8);
                    z9 = false;
                } else {
                    locale = locale2;
                    i13 = -103565020;
                    z9 = false;
                    rVar3.a0(-103565020);
                }
                rVar3.p(z9);
                if (!mf.f.u(k0Var.f2293h)) {
                    rVar3.a0(-92640682);
                    r42 = z9;
                    a(wa.n7.b(R.string.certificate_amount, rVar3), k0Var.f2293h, iVar2, false, rVar3, 0, 8);
                } else {
                    boolean z10 = z9;
                    int i17 = i13;
                    r42 = z10;
                    rVar3.a0(i17);
                }
                rVar3.p(r42);
                a(wa.n7.b(R.string.certificate_status_label, rVar3), wa.n7.b(R.string.certificate_status_val, rVar3), iVar2, false, rVar3, 0, 8);
                if (!mf.f.u(k0Var.i)) {
                    rVar3.a0(-91901611);
                    a(wa.n7.b(R.string.certificate_device, rVar3), k0Var.i, iVar2, false, rVar3, 0, 8);
                } else {
                    rVar3.a0(-103565020);
                }
                rVar3.p(r42);
                x.b(androidx.compose.foundation.layout.f(oVar, f15), rVar3);
                r d15 = androidx.compose.foundation.layout.d(oVar, 1.0f);
                x.p0 a12 = x.a(x.h.e, c.F, rVar3, 54);
                int hashCode3 = Long.hashCode(rVar3.T);
                g l13 = rVar3.l();
                r c13 = a.c(d15, rVar3);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var);
                } else {
                    rVar3.n0();
                }
                y.I(fVar, a12, rVar3);
                y.I(fVar2, l13, rVar3);
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar3, hashCode3, fVar3);
                }
                y.I(fVar4, c13, rVar3);
                if (1.0f <= 0.0d) {
                    a("invalid weight; must be greater than zero");
                }
                r o11 = androidx.compose.foundation.layout.a.o(new LayoutWeightElement(1.0f, true), 0.0f, 0.0f, f14, 0.0f, 11);
                x.r a13 = x.q.a(cVar, c.G, rVar3, r42);
                int hashCode4 = Long.hashCode(rVar3.T);
                g l14 = rVar3.l();
                r c14 = a.c(o11, rVar3);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var);
                } else {
                    rVar3.n0();
                }
                y.I(fVar, a13, rVar3);
                y.I(fVar2, l14, rVar3);
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode4))) {
                    a.t(hashCode4, rVar3, hashCode4, fVar3);
                }
                y.I(fVar4, c14, rVar3);
                typeface2.getClass();
                c(typeface2, androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(oVar, 0.92f), 36), rVar3, 48);
                float f16 = 1;
                x.a(r42, androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(androidx.compose.foundation.layout.a.o(oVar, 0.0f, f16, 0.0f, 0.0f, 13), 0.85f), f16), new j(11)), rVar3);
                String upperCase2 = wa.n7.b(R.string.certificate_issuer, rVar3).toUpperCase(locale);
                upperCase2.getClass();
                x1.b(upperCase2, androidx.compose.foundation.layout.a.o(oVar, 0.0f, f12, 0.0f, 0.0f, 13), j12, ae.d(6.4d), null, sVar, iVar4, ae.c(0.16d), null, ae.e(9), 0, false, 0, 0, null, rVar3, 12783024, 6, 129808);
                rVar3.p(true);
                x5Var2 = x5Var;
                d(x5Var2, androidx.compose.foundation.layout.d.k(oVar, 72), rVar3, ((i16 >> 3) & 14) | 392);
                rVar3.p(true);
                if (k0Var.e) {
                    rVar3.a0(-89996351);
                    p10 = wa.n7.c(R.string.certificate_foot_play, new Object[]{k0Var.f2290d}, rVar3);
                    rVar3.p(r42);
                } else {
                    p10 = a.p(rVar3, -89892563, R.string.certificate_foot_local, rVar3, r42);
                }
                x1.b(p10, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f13, f15, f13, 0.0f, 8), j12, ae.d(6.6d), null, null, null, 0L, k.a(), ae.d(9.5d), 0, false, 0, 0, null, rVar3, 3456, 6, 129520);
                r rVar4 = rVar3;
                rVar4.p(true);
                rVar4.p(true);
                rVar2 = rVar4;
            } else {
                a.o();
                return;
            }
        } else {
            x5Var2 = x5Var;
            rVar3.U();
            rVar2 = rVar3;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new g(k0Var, x5Var2, rVar, i, 0);
        }
    }

    public static final void c(Typeface typeface, r rVar, m mVar, int i) {
        int i10;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(1917615177);
        if (rVar2.h(typeface)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            boolean h3 = rVar2.h(typeface);
            Object O = rVar2.O();
            if (h3 || O == l.f24285a) {
                O = new f(4, typeface);
                rVar2.k0(O);
            }
            ya.a(rVar, (df.l) O, rVar2, 6);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new l(i, 0, typeface, rVar);
        }
    }

    public static final void d(x5 x5Var, r rVar, m mVar, int i) {
        int i10;
        boolean z3;
        Object kVar;
        Object kVar2;
        int i11;
        int i12;
        boolean h3;
        int i13;
        r rVar2 = (r) mVar;
        rVar2.c0(477156270);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h3 = rVar2.f(x5Var);
            } else {
                h3 = rVar2.h(x5Var);
            }
            if (h3) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 48) == 0) {
            if (rVar2.c(0.9f)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i & 384) == 0) {
            if (rVar2.f(rVar)) {
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
            Context context = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
            String b10 = wa.n7.b(R.string.certificate_seal_top, rVar2);
            Locale locale = Locale.ROOT;
            String upperCase = b10.toUpperCase(locale);
            upperCase.getClass();
            String str = "★  " + upperCase + "  ★";
            String upperCase2 = wa.n7.b(R.string.certificate_seal_bottom, rVar2).toUpperCase(locale);
            upperCase2.getClass();
            String k3 = a.k("★  ", upperCase2, "  ★");
            boolean d2 = rVar2.d(e.e.h());
            Object O = rVar2.O();
            Object obj = null;
            v0 v0Var = l.f24285a;
            if (d2 || O == v0Var) {
                try {
                    kVar = e.e(context, "great-vibes");
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (kVar instanceof pe.k) {
                    kVar = null;
                }
                O = (Typeface) kVar;
                rVar2.k0(O);
            }
            Typeface typeface = (Typeface) O;
            boolean d10 = rVar2.d(e.e.h());
            Object O2 = rVar2.O();
            if (d10 || O2 == v0Var) {
                try {
                    kVar2 = e.e(context, "cinzel");
                } catch (Throwable th2) {
                    kVar2 = new pe.k(th2);
                }
                if (!(kVar2 instanceof pe.k)) {
                    obj = kVar2;
                }
                O2 = (Typeface) obj;
                rVar2.k0(O2);
            }
            Typeface typeface2 = (Typeface) O2;
            Object O3 = rVar2.O();
            if (O3 == v0Var) {
                O3 = new j(12);
                rVar2.k0(O3);
            }
            r b11 = androidx.compose.ui.draw.a.b(androidx.compose.ui.graphics.a(rVar, (df.l) O3), new androidx.ink.authoring.compose.c(str, k3, typeface, typeface2, 1));
            List list = u.f2812a;
            b11.getClass();
            x.a(0, androidx.compose.ui.draw.a.b(b11, new p(x5Var, 0)), rVar2);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new h(i, 0, x5Var, rVar);
        }
    }

    public static final void e(int i, r rVar, m mVar) {
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-919395267);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i & 1, z3)) {
            r f10 = androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(rVar, 1.0f), 8);
            Object O = rVar2.O();
            if (O == l.f24285a) {
                O = new j(8);
                rVar2.k0(O);
            }
            ya.a(f10, (df.l) O, rVar2, 48);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new m(i, 0, rVar);
        }
    }

    public static final void f(b bVar, long j10, float f10, float f11) {
        d.D(bVar, f2470d, f10, b.a(j10, 1, Float.intBitsToFloat((int) (4294967295L & j10)) + 0.9f), new h(f11, 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
        d.D(bVar, f2467a, f10, j10, new h(f11, 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
    }

    public static final float g(kotlin.jvm.internal.w wVar) {
        wVar.f19785u = ((wVar.f19785u * 1103515245) + 12345) & Integer.MAX_VALUE;
        return (r0 % 10000) / 10000.0f;
    }
}