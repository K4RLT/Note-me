package x7;
import a.a;
import f0.c;
import f0.d;
import f0.e;
import q.y;
import x.m;

import b8.n4;
import com.daren.scraply.R;
import o0.x1;
import r0.q1;
import ya.ae;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f30155a = k1.l0.d(4289956095L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f30156b = k1.l0.d(4280160304L);

    public static final void a(final int i, final int i10, final d1.r rVar, r0.m mVar) {
        int i11;
        boolean z3;
        boolean z9;
        float f10;
        String valueOf;
        int i12;
        int i13;
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(264137526);
        if ((i10 & 6) == 0) {
            if (rVar2.d(i)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            if (i <= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                rVar2.a0(433101604);
                f10 = ((Number) e.f(e.o("adBadge", rVar2, 0), 0.5f, 1.0f, e.n(e.s(900, 0, y.f23031a, 2), 4), "adBadgeGlow", rVar2, 29112, 0).f22884x.getValue()).floatValue();
                rVar2.p(false);
            } else {
                rVar2.a0(1606620520);
                rVar2.p(false);
                f10 = 1.0f;
            }
            boolean c10 = rVar2.c(f10);
            Object O = rVar2.O();
            if (c10 || O == r0.l.f24285a) {
                O = new n4(6, f10);
                rVar2.k0(O);
            }
            d1.r a10 = androidx.compose.ui.graphics.a(rVar, (df.l) O);
            d dVar = e.f16629a;
            f0.c cVar = new f0.c(50);
            d1.r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(a10, f30155a, new d(cVar, cVar, cVar, cVar)), 5, 1);
            z1.p0 d2 = m.d(d1.c.f15674y, false);
            int hashCode = Long.hashCode(rVar2.T);
            z0.g l11 = rVar2.l();
            d1.r c11 = d1.a.c(l10, rVar2);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            r0.y.I(b2.g.e, d2, rVar2);
            r0.y.I(b2.g.f1464d, l11, rVar2);
            b2.f fVar = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            r0.y.I(b2.g.f1463c, c11, rVar2);
            if (z9) {
                valueOf = a.p(rVar2, 1862075780, R.string.export_ad_badge, rVar2, false);
            } else {
                rVar2.a0(1862077478);
                rVar2.p(false);
                valueOf = String.valueOf(i);
            }
            x1.b(valueOf, null, f30156b, ae.e(9), null, q2.s.B, null, 0L, null, ae.e(11), 0, false, 0, 0, null, rVar2, 200064, 6, 130002);
            rVar2 = rVar2;
            rVar2.p(true);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: x7.b
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = r0.y.L(i10 | 1);
                    a(i, L, rVar, (r0.m) obj);
                    return pe.z.f22715a;
                }
            };
        }
    }
}
