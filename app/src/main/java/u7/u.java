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
import m2.f0;
import o0.y;
import r0.a1;
import r0.l;
import r0.m;
import r0.v0;
import z.b;
import z.e;
import z1.p0;

import android.content.Context;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.List;
import wa.p9;
import ya.sa;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements df.l {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26897u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v7.d f26898v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26899w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26900x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Context f26901y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List f26902z;

    public /* synthetic */ u(int i, Context context, h8.f fVar, List list, m3 m3Var, v7.d dVar) {
        this.f26902z = list;
        this.f26899w = m3Var;
        this.f26900x = i;
        this.f26901y = context;
        this.f26898v = dVar;
        this.A = fVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f26897u) {
            case 0:
                h8.f fVar = (h8.f) this.A;
                e eVar = (e) obj;
                eVar.getClass();
                final int i = this.f26900x;
                final Context context = this.f26901y;
                final m3 m3Var = this.f26899w;
                e.n(eVar, null, new c(-1146651000, new df.q() { // from class: u7.f0
                    @Override // df.q
                    public final Object b(Object obj2, Object obj3, Object obj4) {
                        boolean z3;
                        m mVar = (m) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        ((b) obj2).getClass();
                        if ((intValue & 17) != 16) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        r rVar = (r) mVar;
                        if (rVar.R(intValue & 1, z3)) {
                            o oVar = o.f15687a;
                            r k3 = androidx.compose.foundation.layout.d.k(oVar, 32);
                            f0.d dVar = f0.e.f16629a;
                            r a10 = wa.a(k3, dVar);
                            long j10 = r.f19515d;
                            r b10 = androidx.compose.foundation.a.b(a10, r.c(j10, 0.1f), l0.f19495a);
                            Object O = rVar.O();
                            v0 v0Var = l.f24285a;
                            if (O == v0Var) {
                                O = new f0(14);
                                rVar.k0(O);
                            }
                            r a11 = sa.a(androidx.compose.ui.draw.a.c(b10, (df.l) O), 1, r.c(j10, 0.3f), dVar);
                            m3 m3Var2 = m3Var;
                            boolean h3 = rVar.h(m3Var2);
                            int i10 = i;
                            boolean d2 = h3 | rVar.d(i10);
                            Context context2 = context;
                            boolean h10 = d2 | rVar.h(context2);
                            Object O2 = rVar.O();
                            if (h10 || O2 == v0Var) {
                                O2 = new t(i10, 1, context2, m3Var2);
                                rVar.k0(O2);
                            }
                            r f10 = androidx.compose.foundation.a.f(null, false, a11, (df.a) O2, 7);
                            p0 d10 = x.m.d(c.f15674y, false);
                            int hashCode = Long.hashCode(rVar.T);
                            g l10 = rVar.l();
                            r c10 = a.c(f10, rVar);
                            h.f1471d.getClass();
                            b0 b0Var = g.f1462b;
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(b0Var);
                            } else {
                                rVar.n0();
                            }
                            y.I(g.e, d10, rVar);
                            y.I(g.f1464d, l10, rVar);
                            f fVar2 = g.f1465f;
                            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                                a.t(hashCode, rVar, hashCode, fVar2);
                            }
                            y.I(g.f1463c, c10, rVar);
                            y.b(p9.a(), wa.n7.b(R.string.no_color, rVar), androidx.compose.foundation.layout.d.k(oVar, 16), r.c(j10, 0.8f), rVar, 3456, 0);
                            rVar.p(true);
                        } else {
                            rVar.U();
                        }
                        return pe.z.f22715a;
                    }
                }, true), 3);
                List list = this.f26902z;
                e.p(eVar, list.size(), null, new c(1319163999, new c0(i, context, fVar, list, m3Var, this.f26898v), true), 6);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f26902z;
                a1 a1Var = (a1) this.A;
                e eVar2 = (e) obj;
                eVar2.getClass();
                e.p(eVar2, arrayList.size(), null, new c(-1508143698, new c0(arrayList, this.f26898v, this.f26899w, this.f26900x, this.f26901y, a1Var), true), 6);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ u(ArrayList arrayList, v7.d dVar, m3 m3Var, int i, Context context, a1 a1Var) {
        this.f26902z = arrayList;
        this.f26898v = dVar;
        this.f26899w = m3Var;
        this.f26900x = i;
        this.f26901y = context;
        this.A = a1Var;
    }
}
