package g0;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.r;
import f.b;
import h.a;
import l.a;
import p.a;
import r0.m;
import r0.r;
import r0.y;
import x.m;
import z0.g;
import z1.p0;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17004u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f17005v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, r rVar) {
        super(2);
        this.f17004u = j10;
        this.f17005v = rVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            long j10 = this.f17004u;
            if (j10 != 9205357640488583168L) {
                rVar.a0(1828931592);
                r j11 = androidx.compose.foundation.layout.d.j(this.f17005v, y2.h.b(j10), y2.h.a(j10), 0.0f, 0.0f, 12);
                p0 d2 = m.d(c.f15671v, false);
                int hashCode = Long.hashCode(rVar.T);
                g l10 = rVar.l();
                r c10 = d1.a.c(j11, rVar);
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
                f fVar = g.f1465f;
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                    p.a.t(hashCode, rVar, hashCode, fVar);
                }
                y.I(g.f1463c, c10, rVar);
                b(0, 1, null, rVar);
                rVar.p(true);
                rVar.p(false);
            } else {
                rVar.a0(1829298756);
                b(0, 0, this.f17005v, rVar);
                rVar.p(false);
            }
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
