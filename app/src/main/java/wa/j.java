package wa;
import a1.a;
import p.a;
import c0.a;
import c0.b0;
import c0.d;
import c0.k;
import c0.n;
import c0.p;
import c2.p1;
import d1.c;
import d1.i;
import d1.r;
import i0.m;
import p.u1;
import q.e;
import q.r0;
import q.t1;
import q.u;
import r.a1;
import r.f;
import r0.l;
import r0.q1;
import u.h;
import x.j0;
import x.k0;

/* loaded from: classes.dex */
public abstract class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [b0, java.lang.Object] */
    public static final void a(d dVar, r rVar, j0 j0Var, k kVar, float f10, i iVar, h hVar, boolean z3, a aVar, m mVar, f fVar, c cVar, m mVar2, int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        j0 j0Var2;
        k kVar2;
        i iVar2;
        h hVar2;
        a aVar2;
        m mVar3;
        f fVar2;
        boolean z10;
        k kVar3;
        a aVar3;
        int i13;
        f fVar3;
        j0 j0Var3;
        i iVar3;
        h hVar3;
        r rVar2 = (r) mVar2;
        rVar2.c0(-1372972868);
        if (rVar2.f(dVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar2.f(rVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11 | 5795200;
        if (rVar2.g(z3)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i16 = i15 | i12 | 805306368;
        boolean z11 = false;
        if ((306783379 & i16) == 306783378) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (rVar2.R(i16 & 1, z9)) {
            rVar2.W();
            if ((i & 1) != 0 && !rVar2.A()) {
                rVar2.U();
                i13 = i16 & (-29360129);
                j0Var3 = j0Var;
                kVar3 = kVar;
                iVar3 = iVar;
                hVar3 = hVar;
                aVar3 = aVar;
                mVar3 = mVar;
                fVar3 = fVar;
            } else {
                float f11 = 0;
                k0 k0Var = new k0(f11, f11, f11, f11);
                i iVar4 = c.E;
                int i17 = (i16 & 14) | 196608;
                Object obj = new Object();
                u a10 = p.a(rVar2);
                c cVar2 = t1.f23011a;
                r0 r8 = e.r(0.0f, 400.0f, Float.valueOf(1), 1);
                c cVar3 = (c) rVar2.j(p1.f3606h);
                m mVar4 = (m) rVar2.j(p1.f3611n);
                if ((((i17 & 14) ^ 6) > 4 && rVar2.f(dVar)) || (i17 & 6) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean f12 = z10 | rVar2.f(a10) | rVar2.f(r8) | rVar2.f(obj) | rVar2.f(cVar3) | rVar2.f(mVar4);
                Object O = rVar2.O();
                Object obj2 = l.f24285a;
                if (f12 || O == obj2) {
                    m mVar5 = new m(dVar, new n(dVar, 0, mVar4), (b0) obj);
                    float f13 = l.f25798a;
                    Object hVar4 = new h(mVar5, a10, r8);
                    rVar2.k0(hVar4);
                    O = hVar4;
                }
                h hVar5 = (h) O;
                int i18 = i16 & (-29360129);
                int i19 = (i16 & 14) | 432;
                if ((((i19 & 14) ^ 6) > 4 && rVar2.f(dVar)) || (i19 & 6) == 4) {
                    z11 = true;
                }
                Object O2 = rVar2.O();
                if (z11 || O2 == obj2) {
                    O2 = new a(dVar);
                    rVar2.k0(O2);
                }
                f a11 = a1.a(rVar2);
                kVar3 = k.f3367a;
                mVar3 = m.f25799a;
                aVar3 = (a) O2;
                i13 = i18;
                fVar3 = a11;
                j0Var3 = k0Var;
                iVar3 = iVar4;
                hVar3 = hVar5;
            }
            rVar2.q();
            i.a(rVar, dVar, j0Var3, hVar3, z3, fVar3, f10, kVar3, aVar3, iVar3, mVar3, cVar, rVar2, ((i13 >> 6) & 3670016) | ((i13 >> 3) & 14) | 24576 | ((i13 << 3) & 112) | 3456 | 905969664, 1797510);
            fVar2 = fVar3;
            kVar2 = kVar3;
            iVar2 = iVar3;
            hVar2 = hVar3;
            aVar2 = aVar3;
            j0Var2 = j0Var3;
        } else {
            rVar2.U();
            j0Var2 = j0Var;
            kVar2 = kVar;
            iVar2 = iVar;
            hVar2 = hVar;
            aVar2 = aVar;
            mVar3 = mVar;
            fVar2 = fVar;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new p(dVar, rVar, j0Var2, kVar2, f10, iVar2, hVar2, z3, aVar2, mVar3, fVar2, cVar, i);
        }
    }
}