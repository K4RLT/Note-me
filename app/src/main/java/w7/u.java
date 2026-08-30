package w7;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.c;
import d1.o;
import d1.r;
import eb.w;
import j1.b;
import k1.c0;
import k1.l0;
import o0.y;
import q1.e;
import r0.a1;
import r0.m;
import v1.t;
import z1.n;
import z1.p0;

import androidx.compose.foundation.layout.FillElement;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29161u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f29162v;

    public /* synthetic */ u(a1 a1Var, int i) {
        this.f29161u = i;
        this.f29162v = a1Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        switch (this.f29161u) {
            case 0:
                t tVar = (t) obj;
                tVar.getClass();
                tVar.a();
                a1 a1Var = this.f29162v;
                n4.S0(a1Var, b.h(n4.e(a1Var), ((b) obj2).f18762a));
                return pe.z.f22715a;
            case 1:
                String str = (String) obj2;
                ((t9) obj).getClass();
                str.getClass();
                this.f29162v.setValue(str);
                return pe.z.f22715a;
            case 2:
                String str2 = (String) obj2;
                ((t9) obj).getClass();
                str2.getClass();
                this.f29162v.setValue(str2);
                return pe.z.f22715a;
            case 3:
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    a1 a1Var2 = this.f29162v;
                    if (((f) a1Var2.getValue()) != null) {
                        rVar.a0(-270608469);
                        f fVar = (f) a1Var2.getValue();
                        fVar.getClass();
                        FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                        ya.wa.b(fVar, null, fillElement, n.f31848a, rVar, 25008, 232);
                        m.a(6, androidx.compose.foundation.a(fillElement, w.k(qe.m.h(new r(r.f19520k), new r(r.c(r.f19513b, 0.55f))), 0.0f, 0.0f, 14), 6), rVar);
                        rVar.p(false);
                    } else {
                        rVar.a0(-269820728);
                        r a10 = androidx.compose.foundation.a(androidx.compose.foundation.layout.d.f506c, new c0(qe.m.h(new r(l0.d(4282210944L)), new r(l0.d(4280982927L))), null, 0L, 9187343241974906880L), 6);
                        p0 d2 = m.d(c.f15674y, false);
                        int hashCode = Long.hashCode(rVar.T);
                        g l10 = rVar.l();
                        r c10 = a.c(a10, rVar);
                        h.f1471d.getClass();
                        b0 b0Var = g.f1462b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(b0Var);
                        } else {
                            rVar.n0();
                        }
                        y.I(g.e, d2, rVar);
                        y.I(g.f1464d, l10, rVar);
                        f fVar2 = g.f1465f;
                        if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar, hashCode, fVar2);
                        }
                        y.I(g.f1463c, c10, rVar);
                        y.b((e) z.f29517a.getValue(), null, androidx.compose.foundation.layout.d.k(o.f15687a, 28), r.c(r.f19515d, 0.7f), rVar, 3504, 0);
                        rVar.p(true);
                        rVar.p(false);
                    }
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            case 4:
                m mVar2 = (m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    FillElement fillElement2 = androidx.compose.foundation.layout.d.f506c;
                    r b10 = androidx.compose.foundation.a.b(fillElement2, l0.d(4281017395L), l0.f19495a);
                    p0 d10 = m.d(c.f15674y, false);
                    int hashCode2 = Long.hashCode(rVar2.T);
                    g l11 = rVar2.l();
                    r c11 = a.c(b10, rVar2);
                    h.f1471d.getClass();
                    b0 b0Var2 = g.f1462b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(b0Var2);
                    } else {
                        rVar2.n0();
                    }
                    y.I(g.e, d10, rVar2);
                    y.I(g.f1464d, l11, rVar2);
                    f fVar3 = g.f1465f;
                    if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar2, hashCode2, fVar3);
                    }
                    y.I(g.f1463c, c11, rVar2);
                    a1 a1Var3 = this.f29162v;
                    if (((f) a1Var3.getValue()) != null) {
                        rVar2.a0(2006559213);
                        f fVar4 = (f) a1Var3.getValue();
                        fVar4.getClass();
                        ya.wa.b(fVar4, null, androidx.compose.foundation.layout.a.k(fillElement2, 16), n.f31849b, rVar2, 25008, 232);
                    } else {
                        rVar2.a0(1973707552);
                    }
                    rVar2.p(false);
                    rVar2.p(true);
                } else {
                    rVar2.U();
                }
                return pe.z.f22715a;
            default:
                String str3 = (String) obj2;
                ((t9) obj).getClass();
                str3.getClass();
                this.f29162v.setValue(str3);
                return pe.z.f22715a;
        }
    }
}
