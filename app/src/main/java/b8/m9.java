package b8;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d1.a;
import d1.c;
import d1.i;
import d1.o;
import d1.r;
import k1.l0;
import k1.r;
import k7.f;
import l.a;
import o0.a;
import o0.x1;
import p.a;
import r0.l;
import r0.m;
import r0.r;
import r0.y;
import u7.m3;
import v.i;
import x7.m0;
import y.a;
import z.b;
import z0.g;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import java.util.List;
import ya.ae;

/* loaded from: classes.dex */
public final class m9 extends kotlin.jvm.internal.m implements df.r {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f2429u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f2430v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f2431w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(List list, df.l lVar, m3 m3Var) {
        super(4);
        this.f2429u = list;
        this.f2430v = lVar;
        this.f2431w = m3Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        int i10;
        String str;
        int i11;
        int i12;
        b bVar = (b) obj;
        int intValue = ((Number) obj2).intValue();
        m mVar = (m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((r) mVar).f(bVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i = i12 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((r) mVar).d(intValue)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i |= i11;
        }
        if ((i & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(i & 1, z3)) {
            f fVar = (f) this.f2429u.get(intValue);
            rVar.a0(336959574);
            i iVar = c.E;
            x.e i13 = x.h.i(14);
            r d2 = androidx.compose.foundation.layout.d(o.f15687a, 1.0f);
            Object O = rVar.O();
            Object obj5 = l.f24285a;
            if (O == obj5) {
                O = a.r(rVar);
            }
            i iVar2 = (i) O;
            df.l lVar = this.f2430v;
            boolean f10 = rVar.f(lVar) | rVar.f(fVar);
            Object O2 = rVar.O();
            if (f10 || O2 == obj5) {
                O2 = new c9(lVar, fVar, 1);
                rVar.k0(O2);
            }
            r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(d2, iVar2, null, false, null, (df.a) O2, 28), 20, 10);
            x.p0 a10 = x.a(i13, iVar, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            r c10 = a.c(l10, rVar);
            h.f1471d.getClass();
            df.a aVar = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.n0();
            }
            f fVar2 = g.e;
            y.I(fVar2, a10, rVar);
            f fVar3 = g.f1464d;
            y.I(fVar3, l11, rVar);
            f fVar4 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar4);
            }
            f fVar5 = g.f1463c;
            y.I(fVar5, c10, rVar);
            long e = l0.e(wa.b9.d(fVar.f19608d, 0.0f, 1.0f), wa.b9.d(fVar.e, 0.0f, 1.0f), wa.b9.d(fVar.f19609f, 0.0f, 1.0f), null, 24);
            String str2 = fVar.f19605a;
            String str3 = fVar.f19606b;
            int F = l0.F(e);
            m3 m3Var = this.f2431w;
            m3Var.getClass();
            str2.getClass();
            str3.getClass();
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            int x9 = m3Var.x(str2);
            if (x9 >= 0) {
                i10 = m3Var.P(x9);
            } else {
                i10 = 0;
            }
            a4 a4Var = new a4(null, -15198181, true);
            Integer valueOf = Integer.valueOf(i10);
            boolean h3 = rVar.h(context) | rVar.f(str2) | rVar.h(m3Var) | rVar.f(str3) | rVar.d(F);
            Object O3 = rVar.O();
            if (!h3 && O3 != obj5) {
                str = str2;
            } else {
                str = str2;
                O3 = new k1(m3Var, str, context, str3, F, null);
                rVar.k0(O3);
            }
            a4 a4Var2 = (a4) y.C(a4Var, str, valueOf, (df.p) O3, rVar, 0).getValue();
            m0.a(a4Var2.f1833a, a4Var2.f1834b, 50, null, 6, e, fVar.f19606b, null, a4Var2.f1835c, null, rVar, 24960, 648);
            if (1.0f <= 0.0d) {
                a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            x.r a11 = x.q.a(x.h.f29962b, c.G, rVar, 0);
            int hashCode2 = Long.hashCode(rVar.T);
            g l12 = rVar.l();
            r c11 = a.c(layoutWeightElement, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar);
            } else {
                rVar.n0();
            }
            y.I(fVar2, a11, rVar);
            y.I(fVar3, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar4);
            }
            y.I(fVar5, c11, rVar);
            String str4 = fVar.f19606b;
            long j10 = r.f19515d;
            x1.b(str4, null, j10, ae.e(15), null, null, null, 0L, null, 0L, 2, false, 1, 0, null, rVar, 3456, 3120, 120818);
            x1.b(wa.n7.c(R.string.universe_pages, new Object[]{Integer.valueOf(fVar.f19607c)}, rVar), null, r.c(j10, 0.45f), ae.e(12), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 3456, 0, 131058);
            rVar.p(true);
            rVar.p(true);
            rVar.p(false);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
