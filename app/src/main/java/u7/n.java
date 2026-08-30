package u7;
import b.b;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d.f;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import l.a;
import p.a;
import p.x;
import q.a;
import r0.a1;
import r0.l;
import r0.m;
import r0.r;
import r0.v0;
import r0.y;
import z.b;
import z.e;
import z0.c;
import z0.g;

import android.content.Context;
import com.daren.scraply.R;
import java.util.List;
import ya.we;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements df.q {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26580u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v7.d f26581v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26582w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26583x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f26584y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f26585z;

    public /* synthetic */ n(v7.d dVar, m3 m3Var, int i, Context context, a1 a1Var, a1 a1Var2, int i10) {
        this.f26580u = i10;
        this.f26581v = dVar;
        this.f26582w = m3Var;
        this.f26583x = i;
        this.f26584y = context;
        this.f26585z = a1Var;
        this.A = a1Var2;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i = this.f26580u;
        pe.z zVar = pe.z.f22715a;
        v0 v0Var = l.f24285a;
        boolean z3 = false;
        switch (i) {
            case 0:
                m mVar = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                x.r a10 = x.a(x.h.f29962b, c.G, mVar, 0);
                int t3 = y.t(mVar);
                r rVar = (r) mVar;
                g l10 = rVar.l();
                o oVar = o.f15687a;
                r c10 = a.c(oVar, mVar);
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
                final List h3 = qe.m.h(new pe.o(wa.n7.b(R.string.tpl_dog, mVar), "cover_dog", -3392998), new pe.o(wa.n7.b(R.string.tpl_cat, mVar), "cover_cat", -7656756), new pe.o(wa.n7.b(R.string.tpl_space, mVar), "cover_space", -724760), new pe.o(wa.n7.b(R.string.tpl_penguin, mVar), "cover_penguin", -3372006));
                float f10 = 15;
                r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f10, 0.0f, f10, 0.0f, 10);
                final v7.d dVar = this.f26581v;
                boolean h10 = rVar.h(dVar);
                final m3 m3Var = this.f26582w;
                boolean h11 = h10 | rVar.h(m3Var);
                final int i10 = this.f26583x;
                boolean d2 = h11 | rVar.d(i10);
                final Context context = this.f26584y;
                boolean h12 = d2 | rVar.h(context) | rVar.f(h3);
                Object O = rVar.O();
                if (h12 || O == v0Var) {
                    final a1 a1Var = this.f26585z;
                    final a1 a1Var2 = this.A;
                    O = new df.l() { // from class: u7.x
                        @Override // df.l
                        public final Object invoke(Object obj4) {
                            e eVar = (e) obj4;
                            eVar.getClass();
                            v7.d dVar2 = dVar;
                            m3 m3Var2 = m3Var;
                            int i11 = i10;
                            Context context2 = context;
                            a1 a1Var3 = a1Var;
                            a1 a1Var4 = a1Var2;
                            e.n(eVar, null, new c(1040051339, new n(dVar2, m3Var2, i11, context2, a1Var3, a1Var4, 1), true), 3);
                            List list = h3;
                            e.p(eVar, list.size(), null, new c(-789100958, new c0(list, context2, m3Var2, i11, a1Var3, a1Var4, 0), true), 6);
                            e.p(eVar, c1.f25989a.size(), null, new c(-917773493, new d0(i11, context2, a1Var3, a1Var4, m3Var2), true), 6);
                            return pe.z.f22715a;
                        }
                    };
                    rVar.k0(O);
                }
                we.b(o10, null, null, null, null, null, false, null, (df.l) O, mVar, 6, 510);
                x.b(androidx.compose.foundation.layout.f(oVar, 4), mVar);
                rVar.p(true);
                return zVar;
            default:
                m mVar2 = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((b) obj).getClass();
                if ((intValue & 17) != 16) {
                    z3 = true;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue & 1, z3)) {
                    String b10 = wa.n7.b(R.string.tpl_none, rVar2);
                    int i11 = this.f26581v.f27408c;
                    m3 m3Var2 = this.f26582w;
                    boolean h13 = rVar2.h(m3Var2);
                    int i12 = this.f26583x;
                    boolean d10 = h13 | rVar2.d(i12);
                    Context context2 = this.f26584y;
                    boolean h14 = d10 | rVar2.h(context2);
                    Object O2 = rVar2.O();
                    if (h14 || O2 == v0Var) {
                        q qVar = new q(i12, context2, this.f26585z, this.A, m3Var2);
                        rVar2.k0(qVar);
                        O2 = qVar;
                    }
                    u0.m(b10, null, i11, (df.a) O2, false, rVar2, 48, 16);
                } else {
                    rVar2.U();
                }
                return zVar;
        }
    }
}
