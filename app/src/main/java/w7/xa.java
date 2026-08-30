package w7;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d1.c;
import d1.i;
import d1.o;
import d1.r;
import k1.b;
import k1.l0;
import o0.x1;
import q2.s;
import r0.e1;
import r0.l;
import r0.m;
import r0.q1;
import r0.v0;
import r0.y;
import x.e;
import x.k0;
import x.o0;
import x.p0;
import x.q0;
import x.q;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.List;
import ya.ae;
import ya.we;

/* loaded from: classes.dex */
public abstract class xa {

    /* renamed from: a, reason: collision with root package name */
    public static final float f29464a = 62;

    /* renamed from: b, reason: collision with root package name */
    public static final float f29465b = 42;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f29466c;

    static {
        List h3 = qe.m.h(new r(l0.d(4294967295L)), new r(l0.d(4280032286L)));
        List list = cb.f28050b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            long j10 = ((r) obj).f19523a;
            if (!pe.a(j10, l0.d(4280032286L)) && !pe.a(j10, l0.d(4294507002L))) {
                arrayList.add(obj);
            }
        }
        f29466c = qe.l.E(h3, arrayList);
    }

    public static final void a(final u7.d dVar, final String str, final int i, final float f10, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        r rVar = (r) mVar;
        rVar.c0(-848403469);
        if (rVar.f(dVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i15 = i10 | i11;
        if (rVar.f(str)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i16 = i15 | i12;
        if (rVar.d(i)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i17 = i16 | i13;
        if (rVar.c(f10)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i18 = i17 | i14;
        boolean z12 = false;
        if ((i18 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i18 & 1, z3)) {
            final Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            r l10 = androidx.compose.foundation.layout.d.l(o.f15687a, f29464a, f29465b);
            if ((i18 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i18 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z13 = z9 | z10;
            if ((i18 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = z13 | z11;
            if ((i18 & 7168) == 2048) {
                z12 = true;
            }
            boolean h3 = z14 | z12 | rVar.h(context);
            Object O = rVar.O();
            if (h3 || O == l.f24285a) {
                O = new df.l() { // from class: w7.wa
                    @Override // df.l
                    public final Object invoke(Object obj) {
                        d dVar2 = (d) obj;
                        dVar2.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar2.e() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.e() & 4294967295L));
                        u7.e.H(b.a(dVar2.p0().j()), context, u7.a(u7.d.this, null, "Aa", null, 0, 0.5f, 0.5f, 1.0f, 0.0f, 0, false, false, null, false, false, null, str, i, f10, 32269), intBitsToFloat, intBitsToFloat2);
                        return pe.z.f22715a;
                    }
                };
                rVar.k0(O);
            }
            ya.ta.a(l10, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p(str, i, f10, i10) { // from class: w7.ra

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f29024v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f29025w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f29026x;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(1);
                    a(u7.d.this, this.f29024v, this.f29025w, this.f29026x, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void b(u7.d dVar, u7.m3 m3Var, int i, int i10, m mVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        int i16;
        float f10;
        f fVar;
        q0 q0Var;
        f fVar2;
        f fVar3;
        u7.d dVar2;
        int i17;
        o oVar;
        f fVar4;
        i iVar;
        f fVar5;
        float f11;
        boolean z12;
        float f12;
        float f13;
        long j10;
        int i18;
        boolean z13;
        f fVar6;
        v0 v0Var;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object qaVar;
        int i19;
        v0 v0Var2;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        v0 v0Var3;
        f fVar7;
        b0 b0Var;
        f fVar8;
        Object obj;
        u7.m3 m3Var2 = m3Var;
        int i20 = i;
        int i21 = i10;
        dVar.getClass();
        String str = dVar.f26047q;
        r rVar = (r) mVar;
        rVar.c0(-1511233112);
        if (rVar.f(dVar)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i22 = i11 | i12;
        if (rVar.h(m3Var2)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i23 = i22 | i13;
        if (rVar.d(i20)) {
            i14 = 256;
        } else {
            i14 = 128;
        }
        int i24 = i23 | i14;
        if (rVar.d(i21)) {
            i15 = 2048;
        } else {
            i15 = 1024;
        }
        int i25 = i24 | i15;
        if ((i25 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i25 & 1, z3)) {
            u7.d8 a10 = u7.e8.a(str);
            o oVar2 = o.f15687a;
            r d2 = androidx.compose.foundation.layout.d(oVar2, 1.0f);
            r a11 = q.a(h.f29962b, c.G, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(d2, rVar);
            h.f1471d.getClass();
            b0 b0Var2 = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var2);
            } else {
                rVar.n0();
            }
            f fVar9 = g.e;
            y.I(fVar9, a11, rVar);
            f fVar10 = g.f1464d;
            y.I(fVar10, l10, rVar);
            f fVar11 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar11);
            }
            f fVar12 = g.f1463c;
            y.I(fVar12, c10, rVar);
            float f14 = 14;
            r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d(oVar2, 1.0f), f14, 0.0f, 2);
            i iVar2 = c.E;
            q0 q0Var2 = h.f29961a;
            p0 a12 = o0.a(q0Var2, iVar2, rVar, 48);
            int hashCode2 = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            r c11 = a.c(m4, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var2);
            } else {
                rVar.n0();
            }
            y.I(fVar9, a12, rVar);
            y.I(fVar10, l11, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar11);
            }
            y.I(fVar12, c11, rVar);
            String b10 = wa.n7.b(R.string.text_effect_label, rVar);
            long j11 = r.f19515d;
            long c12 = r.c(j11, 0.6f);
            long e = ae.e(11);
            s sVar = s.f23368z;
            x1.b(b10, null, c12, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
            s sVar2 = sVar;
            rVar.p(true);
            b.b(androidx.compose.foundation.layout.f(oVar2, 6), rVar);
            float f15 = 8;
            e i26 = h.i(f15);
            k0 a13 = androidx.compose.foundation.layout.a(2, f14);
            r d10 = androidx.compose.foundation.layout.d(oVar2, 1.0f);
            boolean f16 = rVar.f(a10);
            int i27 = i25 & 14;
            if (i27 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean h3 = f16 | z9 | rVar.h(m3Var2);
            int i28 = i25 & 896;
            if (i28 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z23 = h3 | z10;
            int i29 = i25 & 7168;
            if (i29 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z24 = z23 | z11;
            Object O = rVar.O();
            v0 v0Var4 = l.f24285a;
            if (!z24 && O != v0Var4) {
                i16 = i29;
                f10 = f14;
                fVar = fVar10;
                q0Var = q0Var2;
                fVar2 = fVar12;
            } else {
                i16 = i29;
                f10 = f14;
                fVar = fVar10;
                q0Var = q0Var2;
                fVar2 = fVar12;
                qa qaVar2 = new qa(a10, dVar, m3Var2, i, i10);
                m3Var2 = m3Var2;
                rVar.k0(qaVar2);
                O = qaVar2;
            }
            df.l lVar = (df.l) O;
            int i30 = i28;
            f fVar13 = fVar;
            b0 b0Var3 = b0Var2;
            f fVar14 = fVar9;
            we.b(d10, null, a13, i26, null, null, false, null, lVar, rVar, 24966, 490);
            rVar = rVar;
            boolean z25 = a10.f26107c;
            boolean z26 = a10.f26108d;
            if (!z25 && !z26) {
                rVar.a0(1715493412);
                rVar.p(false);
                i20 = i;
                i21 = i10;
                z14 = true;
            } else {
                rVar.a0(1723044423);
                float f17 = 10;
                b.b(androidx.compose.foundation.layout.f(oVar2, f17), rVar);
                float f18 = f10;
                r m10 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d(oVar2, 1.0f), f18, 0.0f, 2);
                p0 a14 = o0.a(h.i(f15), iVar2, rVar, 54);
                int hashCode3 = Long.hashCode(rVar.T);
                g l12 = rVar.l();
                r c13 = a.c(m10, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var3);
                } else {
                    rVar.n0();
                }
                y.I(fVar14, a14, rVar);
                y.I(fVar13, l12, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode3))) {
                    fVar3 = fVar11;
                    a.t(hashCode3, rVar, hashCode3, fVar3);
                } else {
                    fVar3 = fVar11;
                }
                f fVar15 = fVar2;
                y.I(fVar15, c13, rVar);
                if (a10.f26107c) {
                    rVar.a0(-1313770947);
                    z12 = z26;
                    f fVar16 = fVar3;
                    oVar = oVar2;
                    fVar5 = fVar15;
                    f12 = f17;
                    iVar = iVar2;
                    f11 = f18;
                    j10 = j11;
                    z13 = false;
                    x1.b(wa.n7.b(R.string.text_effect_color_label, rVar), null, r.c(j11, 0.6f), ae.e(11), null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                    sVar2 = sVar2;
                    e i31 = h.i(7);
                    r g8 = q0.g(1.0f);
                    if (i27 == 4) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    boolean h10 = rVar.h(m3Var2) | z20;
                    if (i30 == 256) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    boolean z27 = h10 | z21;
                    int i32 = i16;
                    if (i32 == 2048) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    boolean z28 = z27 | z22;
                    Object O2 = rVar.O();
                    if (!z28) {
                        v0Var3 = v0Var4;
                        if (O2 != v0Var3) {
                            b0Var = b0Var3;
                            fVar4 = fVar16;
                            fVar7 = fVar14;
                            i17 = i27;
                            obj = O2;
                            f13 = f15;
                            dVar2 = dVar;
                            fVar8 = fVar13;
                            df.l lVar2 = (df.l) obj;
                            fVar6 = fVar8;
                            i30 = i30;
                            b0Var3 = b0Var;
                            fVar14 = fVar7;
                            i18 = i32;
                            v0Var = v0Var3;
                            we.b(g8, null, null, i31, null, null, false, null, lVar2, rVar, 24576, 494);
                            rVar = rVar;
                        }
                    } else {
                        v0Var3 = v0Var4;
                    }
                    b0Var = b0Var3;
                    fVar4 = fVar16;
                    fVar7 = fVar14;
                    fVar8 = fVar13;
                    i17 = i27;
                    f13 = f15;
                    dVar2 = dVar;
                    obj = new sa(dVar2, m3Var2, i, i10, 0);
                    rVar.k0(obj);
                    df.l lVar22 = (df.l) obj;
                    fVar6 = fVar8;
                    i30 = i30;
                    b0Var3 = b0Var;
                    fVar14 = fVar7;
                    i18 = i32;
                    v0Var = v0Var3;
                    we.b(g8, null, null, i31, null, null, false, null, lVar22, rVar, 24576, 494);
                    rVar = rVar;
                } else {
                    dVar2 = dVar;
                    i17 = i27;
                    oVar = oVar2;
                    fVar4 = fVar3;
                    iVar = iVar2;
                    fVar5 = fVar15;
                    f11 = f18;
                    z12 = z26;
                    f12 = f17;
                    f13 = f15;
                    j10 = j11;
                    i18 = i16;
                    z13 = false;
                    fVar6 = fVar13;
                    v0Var = v0Var4;
                    rVar.a0(-1321580219);
                }
                rVar.p(z13);
                rVar.p(true);
                if (z12) {
                    rVar.a0(1725010319);
                    o oVar3 = oVar;
                    b.b(androidx.compose.foundation.layout.f(oVar3, f13), rVar);
                    r m11 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d(oVar3, 1.0f), f11, 0.0f, 2);
                    p0 a15 = o0.a(q0Var, iVar, rVar, 48);
                    int hashCode4 = Long.hashCode(rVar.T);
                    g l13 = rVar.l();
                    r c14 = a.c(m11, rVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var3);
                    } else {
                        rVar.n0();
                    }
                    y.I(fVar14, a15, rVar);
                    y.I(fVar6, l13, rVar);
                    if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode4))) {
                        a.t(hashCode4, rVar, hashCode4, fVar4);
                    }
                    y.I(fVar5, c14, rVar);
                    r rVar2 = rVar;
                    x1.b(wa.n7.b(R.string.text_effect_amount_label, rVar), null, r.c(j10, 0.6f), ae.e(11), null, sVar2, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 200064, 0, 131026);
                    rVar = rVar2;
                    b.b(androidx.compose.foundation.layout.d.n(oVar3, f12), rVar);
                    boolean f19 = rVar.f(dVar2.f26033a) | rVar.f(str);
                    Object O3 = rVar.O();
                    if (f19 || O3 == v0Var) {
                        O3 = g(dVar2.f26049s, rVar);
                    }
                    e1 e1Var = (e1) O3;
                    float h11 = e1Var.h();
                    r f20 = androidx.compose.foundation.layout.f(q0.g(1.0f), 28);
                    boolean f21 = rVar.f(e1Var) | rVar.h(m3Var2);
                    int i33 = i30;
                    if (i33 == 256) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    boolean z29 = f21 | z15;
                    int i34 = i18;
                    if (i34 == 2048) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    boolean z30 = z29 | z16;
                    if (i17 == 4) {
                        z17 = true;
                    } else {
                        z17 = z13;
                    }
                    boolean z31 = z30 | z17;
                    Object O4 = rVar.O();
                    if (!z31 && O4 != v0Var) {
                        v0Var2 = v0Var;
                        qaVar = O4;
                        i21 = i10;
                        i19 = i33;
                        i20 = i;
                    } else {
                        i19 = i33;
                        v0Var2 = v0Var;
                        u7.d dVar3 = dVar2;
                        u7.m3 m3Var3 = m3Var2;
                        qaVar = new qa(m3Var3, i, i10, dVar3, e1Var);
                        i21 = i10;
                        i20 = i;
                        m3Var2 = m3Var3;
                        rVar.k0(qaVar);
                    }
                    df.l lVar3 = (df.l) qaVar;
                    boolean h12 = rVar.h(m3Var2);
                    if (i19 == 256) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    boolean z32 = h12 | z18;
                    if (i34 == 2048) {
                        z19 = true;
                    } else {
                        z19 = z13;
                    }
                    boolean z33 = z32 | z19;
                    Object O5 = rVar.O();
                    if (z33 || O5 == v0Var2) {
                        O5 = new u7.o2(m3Var2, i20, i21, 8);
                        rVar.k0(O5);
                    }
                    z14 = true;
                    x7.a(h11, 0.0f, 1.0f, lVar3, f20, (df.a) O5, rVar, 432, 0);
                    rVar.p(true);
                } else {
                    i20 = i;
                    i21 = i10;
                    z14 = true;
                    rVar.a0(1715493412);
                }
                rVar.p(z13);
                rVar.p(z13);
            }
            rVar.p(z14);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a1(dVar, m3Var2, i20, i21, i11);
        }
    }
}
