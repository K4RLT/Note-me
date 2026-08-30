package u7;
import x1.b;
import b.b;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import o0.x1;
import o0.y;
import p.x;
import p7.e;
import q2.s;
import r0.a1;
import r0.l;
import r0.m;
import z1.p0;

import android.content.Context;
import com.daren.scraply.R;
import java.util.List;
import wa.p9;
import ya.ae;
import ya.we;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26387u = 2;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f26388v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Context f26389w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m3 f26390x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f26391y;

    public /* synthetic */ k(int i, Context context, a1 a1Var, m3 m3Var) {
        this.f26390x = m3Var;
        this.f26391y = i;
        this.f26389w = context;
        this.f26388v = a1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        m3 m3Var;
        int i;
        Context context;
        boolean z3;
        int i10 = this.f26387u;
        pe.z zVar = pe.z.f22715a;
        Object obj4 = l.f24285a;
        o oVar = o.f15687a;
        Object obj5 = this.f26388v;
        switch (i10) {
            case 0:
                v7.d dVar = (v7.d) obj5;
                m mVar = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                float f10 = 24;
                float f11 = 12;
                r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f10, 0.0f, f10, f11, 2);
                x.r a10 = x.a(x.h.f29962b, c.G, mVar, 0);
                int t3 = y.t(mVar);
                r rVar = (r) mVar;
                g l10 = rVar.l();
                r c10 = a.c(o10, mVar);
                h.f1471d.getClass();
                b0 b0Var = g.f1462b;
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(g.e, a10, mVar);
                y.I(g.f1464d, l10, mVar);
                f fVar = g.f1465f;
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(t3))) {
                    a.t(t3, rVar, t3, fVar);
                }
                y.I(g.f1463c, c10, mVar);
                x.e i11 = x.h.i(f11);
                boolean h3 = rVar.h(dVar);
                m3 m3Var2 = this.f26390x;
                boolean h10 = h3 | rVar.h(m3Var2);
                int i12 = this.f26391y;
                boolean d2 = h10 | rVar.d(i12);
                Context context2 = this.f26389w;
                boolean h11 = d2 | rVar.h(context2);
                Object O = rVar.O();
                if (!h11 && O != obj4) {
                    m3Var = m3Var2;
                    i = i12;
                    context = context2;
                } else {
                    O = new y(dVar, m3Var2, i12, context2, 2);
                    m3Var = m3Var2;
                    i = i12;
                    context = context2;
                    rVar.k0(O);
                }
                we.b(null, null, null, i11, null, null, false, null, (df.l) O, mVar, 24576, 495);
                if (dVar.f27409d) {
                    rVar.a0(-171183740);
                    x.b(androidx.compose.foundation.layout.f(oVar, 14), mVar);
                    x1.b(wa.n7.b(R.string.cover_label_font, mVar), null, r.f19515d, ae.e(12), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, mVar, 200064, 0, 131026);
                    float f12 = 8;
                    x.b(androidx.compose.foundation.layout.f(oVar, f12), mVar);
                    List list = e.f22444a;
                    x.e i13 = x.h.i(f12);
                    boolean h12 = rVar.h(list) | rVar.h(dVar) | rVar.h(context) | rVar.h(m3Var) | rVar.d(i);
                    Object O2 = rVar.O();
                    if (h12 || O2 == obj4) {
                        O2 = new z(list, dVar, m3Var, i, context);
                        rVar.k0(O2);
                    }
                    we.b(null, null, null, i13, null, null, false, null, (df.l) O2, mVar, 24576, 495);
                } else {
                    rVar.a0(-234141640);
                }
                rVar.p(false);
                x.b(androidx.compose.foundation.layout.f(oVar, 8), mVar);
                rVar.p(true);
                return zVar;
            case 1:
                v7.d dVar2 = (v7.d) obj5;
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                x.r a11 = x.a(x.h.f29962b, c.G, mVar2, 0);
                int t10 = y.t(mVar2);
                r rVar2 = (r) mVar2;
                g l11 = rVar2.l();
                r c11 = a.c(oVar, mVar2);
                h.f1471d.getClass();
                df.a aVar = g.f1462b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(aVar);
                } else {
                    rVar2.n0();
                }
                y.I(g.e, a11, mVar2);
                y.I(g.f1464d, l11, mVar2);
                f fVar2 = g.f1465f;
                if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(t10))) {
                    a.t(t10, rVar2, t10, fVar2);
                }
                y.I(g.f1463c, c11, mVar2);
                float f13 = 24;
                r o11 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f13, 0.0f, f13, 4, 2);
                x.e i14 = x.h.i(8);
                boolean h13 = rVar2.h(dVar2);
                Context context3 = this.f26389w;
                boolean h14 = h13 | rVar2.h(context3);
                m3 m3Var3 = this.f26390x;
                boolean h15 = h14 | rVar2.h(m3Var3);
                int i15 = this.f26391y;
                boolean d10 = h15 | rVar2.d(i15);
                Object O3 = rVar2.O();
                if (d10 || O3 == obj4) {
                    O3 = new y(dVar2, context3, m3Var3, i15);
                    rVar2.k0(O3);
                }
                we.b(o11, null, null, i14, null, null, false, null, (df.l) O3, mVar2, 24582, 494);
                x.b(androidx.compose.foundation.layout.f(oVar, 20), mVar2);
                rVar2.p(true);
                return zVar;
            default:
                a1 a1Var = (a1) obj5;
                m mVar3 = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((b) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar3 = (r) mVar3;
                if (rVar3.R(intValue & 1, z3)) {
                    r o12 = u0.o(androidx.compose.foundation.layout.d.k(oVar, 76), 8);
                    m3 m3Var4 = this.f26390x;
                    boolean h16 = rVar3.h(m3Var4);
                    int i16 = this.f26391y;
                    boolean d11 = h16 | rVar3.d(i16);
                    Context context4 = this.f26389w;
                    boolean h17 = d11 | rVar3.h(context4);
                    Object O4 = rVar3.O();
                    if (h17 || O4 == obj4) {
                        O4 = new s(i16, 1, context4, a1Var, m3Var4);
                        rVar3.k0(O4);
                    }
                    r f14 = androidx.compose.foundation.a.f(null, false, o12, (df.a) O4, 7);
                    p0 d12 = x.m.d(c.f15674y, false);
                    int hashCode = Long.hashCode(rVar3.T);
                    g l12 = rVar3.l();
                    r c12 = a.c(f14, rVar3);
                    h.f1471d.getClass();
                    b0 b0Var2 = g.f1462b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(b0Var2);
                    } else {
                        rVar3.n0();
                    }
                    f fVar3 = g.e;
                    y.I(fVar3, d12, rVar3);
                    f fVar4 = g.f1464d;
                    y.I(fVar4, l12, rVar3);
                    f fVar5 = g.f1465f;
                    if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar3, hashCode, fVar5);
                    }
                    f fVar6 = g.f1463c;
                    y.I(fVar6, c12, rVar3);
                    x.r a12 = x.a(x.h.f29963c, c.H, rVar3, 54);
                    int hashCode2 = Long.hashCode(rVar3.T);
                    g l13 = rVar3.l();
                    r c13 = a.c(oVar, rVar3);
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(b0Var2);
                    } else {
                        rVar3.n0();
                    }
                    y.I(fVar3, a12, rVar3);
                    y.I(fVar4, l13, rVar3);
                    if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar3, hashCode2, fVar5);
                    }
                    y.I(fVar6, c13, rVar3);
                    e a13 = p9.a();
                    String b10 = wa.n7.b(R.string.cover_no_image, rVar3);
                    long j10 = r.f19515d;
                    y.b(a13, b10, androidx.compose.foundation.layout.d.k(oVar, 20), r.c(j10, 0.7f), rVar3, 3456, 0);
                    x.b(androidx.compose.foundation.layout.f(oVar, 4), rVar3);
                    x1.b("Ninguna", null, r.c(j10, 0.7f), ae.e(11), null, s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 200070, 0, 131026);
                    rVar3.p(true);
                    rVar3.p(true);
                } else {
                    rVar3.U();
                }
                return zVar;
        }
    }

    public /* synthetic */ k(v7.d dVar, Context context, m3 m3Var, int i) {
        this.f26388v = dVar;
        this.f26389w = context;
        this.f26390x = m3Var;
        this.f26391y = i;
    }

    public /* synthetic */ k(v7.d dVar, m3 m3Var, int i, Context context) {
        this.f26388v = dVar;
        this.f26390x = m3Var;
        this.f26391y = i;
        this.f26389w = context;
    }
}
