package w7;
import a.a;
import b.b;
import o0.a;
import r.c;
import b2.f;
import b2.g;
import b2.h;
import c.c;
import c.d;
import c.i;
import d1.a;
import d1.o;
import d1.r;
import h9.b;
import r0.a1;
import r0.l;
import r0.m;
import r0.y;
import x.o0;
import x.p0;
import x.s;

import androidx.compose.foundation.layout.LayoutWeightElement;
import com.daren.scraply.R;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements df.q {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29519u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29520v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29521w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29522x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29523y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f29524z;

    public /* synthetic */ z0(u7.c cVar, u7.m3 m3Var, int i, int i10, a1 a1Var, a1 a1Var2) {
        this.f29523y = cVar;
        this.f29520v = m3Var;
        this.f29521w = i;
        this.f29522x = i10;
        this.f29524z = a1Var;
        this.A = a1Var2;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        Object a9Var;
        Object obj4;
        Integer num;
        float f10;
        Integer num2;
        o oVar;
        int i;
        int i10;
        u7.m3 m3Var;
        boolean z9;
        boolean z10;
        Object a9Var2;
        u7.m3 m3Var2;
        int i11;
        int i12;
        int i13;
        int i14 = this.f29519u;
        Object obj5 = this.A;
        Object obj6 = this.f29524z;
        Object obj7 = this.f29523y;
        switch (i14) {
            case 0:
                return n4.e0(this.f29520v, this.f29521w, this.f29522x, (df.l) obj7, (kotlin.jvm.internal.y) obj6, (b1.v) obj5, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
            default:
                final u7.c cVar = (u7.c) obj7;
                a1 a1Var = (a1) obj6;
                a1 a1Var2 = (a1) obj5;
                s sVar = (s) obj;
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                sVar.getClass();
                if ((intValue & 6) == 0) {
                    if (((r) mVar).f(sVar)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    intValue |= i13;
                }
                int i15 = intValue;
                if ((i15 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(i15 & 1, z3)) {
                    String b10 = wa.n7.b(R.string.shape_fill, rVar);
                    Integer num3 = cVar.f25971c;
                    float f11 = cVar.f25973f;
                    boolean booleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                    Object O = rVar.O();
                    Object obj8 = l.f24285a;
                    if (O == obj8) {
                        O = new u7.k4(a1Var, 25);
                        rVar.k0(O);
                    }
                    df.a aVar = (df.a) O;
                    Object O2 = rVar.O();
                    if (O2 == obj8) {
                        O2 = new u7.k4(a1Var, 28);
                        rVar.k0(O2);
                    }
                    df.a aVar2 = (df.a) O2;
                    final u7.m3 m3Var3 = this.f29520v;
                    boolean h3 = rVar.h(m3Var3);
                    final int i16 = this.f29521w;
                    boolean d2 = h3 | rVar.d(i16);
                    final int i17 = this.f29522x;
                    boolean d10 = d2 | rVar.d(i17) | rVar.f(cVar);
                    Object O3 = rVar.O();
                    if (!d10 && O3 != obj8) {
                        f10 = f11;
                        num = num3;
                        a9Var = O3;
                        obj4 = obj8;
                    } else {
                        obj4 = obj8;
                        num = num3;
                        f10 = f11;
                        a9Var = new a9(i16, i17, 2, cVar, m3Var3);
                        rVar.k0(a9Var);
                    }
                    df.l lVar = (df.l) a9Var;
                    boolean f12 = rVar.f(cVar) | rVar.h(m3Var3) | rVar.d(i16) | rVar.d(i17);
                    Object O4 = rVar.O();
                    if (f12 || O4 == obj4) {
                        final int i18 = 0;
                        Object obj9 = new df.a() { // from class: w7.g9
                            @Override // df.a
                            public final Object invoke() {
                                switch (i18) {
                                    case 0:
                                        n4.K0(cVar, m3Var3, i16, i17, true);
                                        break;
                                    default:
                                        n4.K0(cVar, m3Var3, i16, i17, false);
                                        break;
                                }
                                return pe.z.f22715a;
                            }
                        };
                        rVar.k0(obj9);
                        O4 = obj9;
                    }
                    n4.v0(b10, num, booleanValue, aVar, aVar2, lVar, (df.a) O4, rVar, 27648);
                    o oVar2 = o.f15687a;
                    b.b(androidx.compose.foundation.layout.f(oVar2, 10), rVar);
                    String b11 = wa.n7.b(R.string.shape_border, rVar);
                    Integer num4 = cVar.f25972d;
                    boolean booleanValue2 = ((Boolean) a1Var2.getValue()).booleanValue();
                    Object O5 = rVar.O();
                    if (O5 == obj4) {
                        O5 = new u7.k4(a1Var2, 29);
                        rVar.k0(O5);
                    }
                    df.a aVar3 = (df.a) O5;
                    Object O6 = rVar.O();
                    if (O6 == obj4) {
                        O6 = new h9(a1Var2, 0);
                        rVar.k0(O6);
                    }
                    df.a aVar4 = (df.a) O6;
                    boolean h10 = rVar.h(m3Var3) | rVar.d(i16) | rVar.d(i17) | rVar.f(cVar);
                    Object O7 = rVar.O();
                    if (h10 || O7 == obj4) {
                        O7 = new a9(cVar, m3Var3, i16, i17);
                        rVar.k0(O7);
                    }
                    df.l lVar2 = (df.l) O7;
                    boolean f13 = rVar.f(cVar) | rVar.h(m3Var3) | rVar.d(i16) | rVar.d(i17);
                    Object O8 = rVar.O();
                    if (f13 || O8 == obj4) {
                        num2 = num4;
                        oVar = oVar2;
                        final int i19 = 1;
                        Object obj10 = new df.a() { // from class: w7.g9
                            @Override // df.a
                            public final Object invoke() {
                                switch (i19) {
                                    case 0:
                                        n4.K0(cVar, m3Var3, i16, i17, true);
                                        break;
                                    default:
                                        n4.K0(cVar, m3Var3, i16, i17, false);
                                        break;
                                }
                                return pe.z.f22715a;
                            }
                        };
                        i = i17;
                        i10 = i16;
                        m3Var = m3Var3;
                        rVar.k0(obj10);
                        O8 = obj10;
                    } else {
                        num2 = num4;
                        oVar = oVar2;
                        i = i17;
                        i10 = i16;
                        m3Var = m3Var3;
                    }
                    n4.v0(b11, num2, booleanValue2, aVar3, aVar4, lVar2, (df.a) O8, rVar, 27648);
                    if (cVar.f25972d != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    Object obj11 = obj4;
                    ya.b(sVar, z9, null, androidx.compose.animation.c(q.e.r(0.9f, 700.0f, null, 4), 14).a(androidx.compose.animation.d(q.e.r(0.0f, 700.0f, null, 5), 2)), androidx.compose.animation.i(q.e.r(1.0f, 900.0f, null, 4), 14).a(androidx.compose.animation.c.e(q.e.r(0.0f, 900.0f, null, 5), 2)), null, h.d(-1580700615, new c8(cVar, m3Var, i10, i), rVar), rVar, (i15 & 14) | 1600512, 18);
                    if (kotlin.jvm.internal.l.a(cVar.f25970b, "rect")) {
                        rVar.a0(-911509309);
                        b.b(androidx.compose.foundation.layout.f(oVar, 12), rVar);
                        n4.A0(wa.n7.b(R.string.shape_corners, rVar), rVar, 0);
                        float f14 = 14;
                        r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d(oVar, 1.0f), f14, 0.0f, 2);
                        p0 a10 = o0.a(h.i(f14), c.E, rVar, 54);
                        int hashCode = Long.hashCode(rVar.T);
                        g l10 = rVar.l();
                        r c10 = a.c(m4, rVar);
                        h.f1471d.getClass();
                        df.a aVar5 = g.f1462b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(aVar5);
                        } else {
                            rVar.n0();
                        }
                        f fVar = g.e;
                        y.I(fVar, a10, rVar);
                        f fVar2 = g.f1464d;
                        y.I(fVar2, l10, rVar);
                        f fVar3 = g.f1465f;
                        if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar, hashCode, fVar3);
                        }
                        f fVar4 = g.f1463c;
                        y.I(fVar4, c10, rVar);
                        r k3 = androidx.compose.foundation.layout.d.k(oVar, 40);
                        p0 d11 = m.d(c.f15674y, false);
                        int i20 = i;
                        int hashCode2 = Long.hashCode(rVar.T);
                        g l11 = rVar.l();
                        r c11 = a.c(k3, rVar);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(aVar5);
                        } else {
                            rVar.n0();
                        }
                        y.I(fVar, d11, rVar);
                        y.I(fVar2, l11, rVar);
                        if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                            a.t(hashCode2, rVar, hashCode2, fVar3);
                        }
                        y.I(fVar4, c11, rVar);
                        m.a(0, ya.a(androidx.compose.foundation.layout.d.k(oVar, 26), (float) 1.5d, r.c(r.f19515d, 0.92f), f0.e.a(wa.b9.d(f10, 0.0f, 0.5f) * 26.0f)), rVar);
                        rVar.p(true);
                        float d12 = wa.b9.d(f10, 0.0f, 0.5f);
                        if (1.0f <= 0.0d) {
                            a.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        boolean h11 = rVar.h(m3Var) | rVar.d(i10) | rVar.d(i20) | rVar.f(cVar);
                        Object O9 = rVar.O();
                        if (!h11 && O9 != obj11) {
                            a9Var2 = O9;
                            m3Var2 = m3Var;
                            i11 = i10;
                            i12 = i20;
                        } else {
                            m3Var2 = m3Var;
                            i11 = i10;
                            i12 = i20;
                            a9Var2 = new a9(i11, i12, 0, cVar, m3Var2);
                            rVar.k0(a9Var2);
                        }
                        df.l lVar3 = (df.l) a9Var2;
                        boolean h12 = rVar.h(m3Var2) | rVar.d(i11) | rVar.d(i12);
                        Object O10 = rVar.O();
                        if (h12 || O10 == obj11) {
                            O10 = new u7.o2(m3Var2, i11, i12, 7);
                            rVar.k0(O10);
                        }
                        x7.a(d12, 0.0f, 0.5f, lVar3, layoutWeightElement, (df.a) O10, rVar, 432, 0);
                        rVar.p(true);
                        z10 = false;
                    } else {
                        z10 = false;
                        rVar.a0(-922986687);
                    }
                    rVar.p(z10);
                    b.b(androidx.compose.foundation.layout.f(oVar, 16), rVar);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ z0(u7.m3 m3Var, int i, int i10, df.l lVar, kotlin.jvm.internal.y yVar, b1.v vVar) {
        this.f29520v = m3Var;
        this.f29521w = i;
        this.f29522x = i10;
        this.f29523y = lVar;
        this.f29524z = yVar;
        this.A = vVar;
    }
}
