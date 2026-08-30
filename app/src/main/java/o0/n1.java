package o0;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c2.p1;
import c2.w0;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import f.a;
import k.a;
import k1.l0;
import k1.p0;
import k1.r;
import k1.t0;
import k1.z;
import l.a;
import p.a;
import r0.m;
import r0.r;
import r0.y;
import u.a;
import v1.c0;
import x.m;
import z0.c;
import z0.g;
import z1.p0;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import wa.j7;

/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f21598u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f21599v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f21600w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f21601x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f21602y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c f21603z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(r rVar, p0 p0Var, long j10, float f10, float f11, c cVar) {
        super(2);
        this.f21598u = rVar;
        this.f21599v = p0Var;
        this.f21600w = j10;
        this.f21601x = f10;
        this.f21602y = f11;
        this.f21603z = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        r rVar;
        r d2;
        m mVar = (m) obj;
        int i = 3;
        int intValue = ((Number) obj2).intValue() & 3;
        pe.z zVar = pe.z.f22715a;
        int i10 = 2;
        if (intValue == 2) {
            r rVar2 = (r) mVar;
            if (rVar2.D()) {
                rVar2.U();
                return zVar;
            }
        }
        r rVar3 = (r) mVar;
        m mVar2 = (m) rVar3.j(o.f21604a);
        boolean booleanValue = ((Boolean) rVar3.j(o.f21605b)).booleanValue();
        long j10 = mVar2.f21568p;
        int i11 = r.f19522m;
        long j11 = this.f21600w;
        if (pe.a(j11, j10) && booleanValue) {
            if (!y2.a(this.f21601x, 0)) {
                j10 = l0.n(r.c(mVar2.f21572t, ((((float) Math.log(r9 + 1)) * 4.5f) + 2.0f) / 100.0f), j10);
            }
        } else {
            j10 = j11;
        }
        float l0 = ((y2.c) rVar3.j(p1.f3606h)).l0(this.f21602y);
        o oVar = o.f15687a;
        p0 p0Var = this.f21599v;
        if (l0 > 0.0f) {
            long j12 = t0.f19529b;
            long j13 = z.f19535a;
            rVar = androidx.compose.ui.graphics.a.b(oVar, 1.0f, 1.0f, 1.0f, l0, 0.0f, j12, p0Var, false, j13, j13);
        } else {
            rVar = oVar;
        }
        d2 = j2.a(j7.a(androidx.compose.foundation.a.b(this.f21598u.d(rVar).d(oVar), j10, p0Var), p0Var), false, k0.f21539x).d(new SuspendPointerInputElement(pe.z.f22715a, null, null, new c0(new w0(i10, null, i)), 6));
        p0 d10 = m.d(c.f15670u, true);
        int hashCode = Long.hashCode(rVar3.T);
        g l10 = rVar3.l();
        r c10 = a.c(d2, rVar3);
        h.f1471d.getClass();
        b0 b0Var = g.f1462b;
        rVar3.e0();
        if (rVar3.S) {
            rVar3.k(b0Var);
        } else {
            rVar3.n0();
        }
        y.I(g.e, d10, rVar3);
        y.I(g.f1464d, l10, rVar3);
        f fVar = g.f1465f;
        if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
            a.t(hashCode, rVar3, hashCode, fVar);
        }
        y.I(g.f1463c, c10, rVar3);
        this.f21603z.invoke(rVar3, 0);
        rVar3.p(true);
        return zVar;
    }
}
