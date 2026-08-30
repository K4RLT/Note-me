package u7;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import k1.l0;
import o0.x1;
import p7.e;
import q2.v;
import r0.a1;
import r0.l;
import r0.m;
import r0.v0;
import r0.y;
import t.m1;
import x7.g0;
import z.b;
import z1.p0;

import android.content.Context;
import android.graphics.Typeface;
import com.daren.scraply.R;
import java.util.List;
import ya.ae;
import ya.sa;
import ya.w9;

/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements df.r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26050u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26051v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26052w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26053x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26054y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26055z;

    public /* synthetic */ d0(int i, Context context, a1 a1Var, a1 a1Var2, m3 m3Var) {
        this.f26053x = context;
        this.f26051v = m3Var;
        this.f26052w = i;
        this.f26054y = a1Var;
        this.f26055z = a1Var2;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z3;
        String str;
        boolean z9;
        c cVar;
        String str2;
        String str3;
        long j10;
        float f10;
        float f11;
        long j11;
        String str4;
        v vVar;
        int i = this.f26050u;
        pe.z zVar = pe.z.f22715a;
        int i10 = 16;
        v0 v0Var = l.f24285a;
        Object obj5 = this.f26055z;
        Object obj6 = this.f26054y;
        switch (i) {
            case 0:
                a1 a1Var = (a1) obj6;
                a1 a1Var2 = (a1) obj5;
                int intValue = ((Integer) obj2).intValue();
                m mVar = (m) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((b) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    if (((r) mVar).d(intValue)) {
                        i10 = 32;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 145) != 144) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue2 & 1, z3)) {
                    a1 a1Var3 = (a1) c1.f25989a.get(intValue);
                    String str5 = a1Var3.f25888a;
                    String concat = "cover:".concat(str5);
                    String b10 = wa.n7.b(a1Var3.f25889b, rVar);
                    rVar.a0(1388393213);
                    f fVar = (f) u0.f26907f.get(str5);
                    if (fVar != null) {
                        rVar.p(false);
                    } else {
                        boolean f12 = rVar.f(a1Var3);
                        Object O = rVar.O();
                        if (!f12 && O != v0Var) {
                            str = null;
                        } else {
                            str = null;
                            O = new m1(a1Var3, (te.c) null, 7);
                            rVar.k0(O);
                        }
                        fVar = (f) y.D(str, str5, (df.p) O, rVar, 6).getValue();
                        rVar.p(false);
                    }
                    f fVar2 = fVar;
                    int i11 = a1Var3.e;
                    boolean a10 = g0.a(concat);
                    Context context = this.f26053x;
                    boolean h3 = rVar.h(context) | rVar.f(concat);
                    m3 m3Var = this.f26051v;
                    boolean h10 = h3 | rVar.h(m3Var);
                    int i12 = this.f26052w;
                    boolean d2 = h10 | rVar.d(i12) | rVar.f(a1Var3);
                    Object O2 = rVar.O();
                    if (d2 || O2 == v0Var) {
                        y3 y3Var = new y3(context, concat, m3Var, i12, a1Var3, a1Var, a1Var2);
                        rVar.k0(y3Var);
                        O2 = y3Var;
                    }
                    u0.m(b10, fVar2, i11, (df.a) O2, a10, rVar, 0, 0);
                } else {
                    rVar.U();
                }
                return zVar;
            default:
                List list = (List) obj6;
                v7.d dVar = (v7.d) obj5;
                int intValue3 = ((Integer) obj2).intValue();
                m mVar2 = (m) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((b) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    if (((r) mVar2).d(intValue3)) {
                        i10 = 32;
                    }
                    intValue4 |= i10;
                }
                if ((intValue4 & 145) != 144) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue4 & 1, z9)) {
                    if (intValue3 == 0) {
                        cVar = null;
                    } else {
                        cVar = (c) list.get(intValue3 - 1);
                    }
                    String str6 = dVar.f27415l;
                    if (cVar != null) {
                        str2 = cVar.f22431a;
                    } else {
                        str2 = null;
                    }
                    boolean a11 = kotlin.jvm.internal.a(str6, str2);
                    if (cVar != null) {
                        str3 = cVar.f22431a;
                    } else {
                        str3 = null;
                    }
                    boolean f13 = rVar2.f(str3) | rVar2.d(e.e.h());
                    Object O3 = rVar2.O();
                    Context context2 = this.f26053x;
                    if (f13 || O3 == v0Var) {
                        if (cVar != null) {
                            O3 = e.e(context2, cVar.f22431a);
                        } else {
                            O3 = null;
                        }
                        rVar2.k0(O3);
                    }
                    Typeface typeface = (Typeface) O3;
                    float f14 = 10;
                    r a12 = wa.a(o.f15687a, f0.e.a(f14));
                    if (a11) {
                        j10 = r.f19515d;
                        f10 = 0.22f;
                    } else {
                        j10 = r.f19515d;
                        f10 = 0.08f;
                    }
                    r b11 = androidx.compose.foundation.a.b(a12, r.c(j10, f10), l0.f19495a);
                    if (a11) {
                        f11 = (float) 1.5d;
                    } else {
                        f11 = 0;
                    }
                    if (a11) {
                        j11 = r.f19515d;
                    } else {
                        j11 = r.f19520k;
                    }
                    r a13 = sa.a(b11, f11, j11, f0.e.a(f14));
                    m3 m3Var2 = this.f26051v;
                    boolean h11 = rVar2.h(m3Var2);
                    int i13 = this.f26052w;
                    boolean d10 = h11 | rVar2.d(i13) | rVar2.h(context2) | rVar2.f(cVar);
                    Object O4 = rVar2.O();
                    if (d10 || O4 == v0Var) {
                        p pVar = new p(m3Var2, i13, context2, cVar, 1);
                        rVar2.k0(pVar);
                        O4 = pVar;
                    }
                    r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, a13, (df.a) O4, 7), 12, 7);
                    p0 d11 = x.m.d(c.f15674y, false);
                    int hashCode = Long.hashCode(rVar2.T);
                    g l11 = rVar2.l();
                    r c10 = a.c(l10, rVar2);
                    h.f1471d.getClass();
                    b0 b0Var = g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var);
                    } else {
                        rVar2.n0();
                    }
                    y.I(g.e, d11, rVar2);
                    y.I(g.f1464d, l11, rVar2);
                    f fVar3 = g.f1465f;
                    if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar2, hashCode, fVar3);
                    }
                    y.I(g.f1463c, c10, rVar2);
                    if (cVar != null) {
                        str4 = cVar.f22432b;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = a.p(rVar2, 967677761, R.string.cover_label_font_auto, rVar2, false);
                    } else {
                        rVar2.a0(967675653);
                        rVar2.p(false);
                    }
                    String str7 = str4;
                    long j12 = r.f19515d;
                    long e = ae.e(13);
                    if (typeface != null) {
                        vVar = w9.a(typeface);
                    } else {
                        vVar = null;
                    }
                    x1.b(str7, null, j12, e, null, null, vVar, 0L, null, 0L, 0, false, 1, 0, null, rVar2, 3456, 3072, 122802);
                    rVar2.p(true);
                } else {
                    rVar2.U();
                }
                return zVar;
        }
    }

    public /* synthetic */ d0(List list, v7.d dVar, m3 m3Var, int i, Context context) {
        this.f26054y = list;
        this.f26055z = dVar;
        this.f26051v = m3Var;
        this.f26052w = i;
        this.f26053x = context;
    }
}
