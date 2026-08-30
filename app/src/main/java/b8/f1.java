package b8;
import b.b;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import e1.m;
import f0.e;
import k1.l0;
import o0.x1;
import p.x;
import q2.s;
import r0.y;
import x2.k;
import z7.p;

import com.daren.scraply.R;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2058u;

    public /* synthetic */ f1(int i) {
        this.f2058u = i;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        int i = this.f2058u;
        o oVar = o.f15687a;
        boolean z9 = false;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                m mVar = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                float f10 = 10;
                x.e i10 = x.h.i(f10);
                r o10 = androidx.compose.foundation.layout.a.o(o.f15687a, f10, 0.0f, 0.0f, 0.0f, 14);
                x.p0 a10 = x.a(i10, c.D, mVar, 6);
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
                m(0, null, mVar);
                m(0, null, mVar);
                rVar.p(true);
                return zVar;
            case 1:
                w7.t9 t9Var = (w7.t9) obj;
                int intValue = ((Integer) obj3).intValue();
                t9Var.getClass();
                w7.n4.h0(t9Var, (m) obj2, intValue & 14);
                return zVar;
            case 2:
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                String b10 = wa.n7.b(R.string.sticker_pack_remove_hint, mVar2);
                long j10 = r.f19515d;
                float f11 = 9;
                x1.b(b10, androidx.compose.foundation.layout.a.l(ya.a(androidx.compose.foundation.a.b(wa.a(oVar, e.a(f11)), l0.d(3860075038L), l0.f19495a), (float) 0.8d, r.c(j10, 0.14f), e.a(f11)), 10, 4), r.c(j10, 0.72f), ae.d(9.5d), null, s.f23368z, null, 0L, new k(3), 0L, 0, false, 0, 0, null, mVar2, 200064, 0, 130512);
                return zVar;
            case 3:
                m mVar3 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((x.p) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z9 = true;
                }
                r rVar2 = (r) mVar3;
                if (!rVar2.R(intValue2 & 1, z9)) {
                    rVar2.U();
                }
                return zVar;
            case 4:
                m mVar4 = (m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((x.p) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z9 = true;
                }
                r rVar3 = (r) mVar4;
                if (!rVar3.R(intValue3 & 1, z9)) {
                    rVar3.U();
                }
                return zVar;
            default:
                m mVar5 = (m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((x.s) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar4 = (r) mVar5;
                if (rVar4.R(intValue4 & 1, z3)) {
                    z7.a(0, rVar4);
                    x.b(androidx.compose.foundation.layout.f(oVar, 32), rVar4);
                } else {
                    rVar4.U();
                }
                return zVar;
        }
    }
}
