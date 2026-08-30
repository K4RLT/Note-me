package s;

import b1.v;
import c0.d0;
import c0.n;
import df.q;
import r0.m;
import r0.q1;
import r0.r;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final v f24835a = new v();

    public static void b(f fVar, d0 d0Var, df.a aVar) {
        fVar.f24835a.add(new z0.c(262103052, new n(d0Var, aVar), true));
    }

    public final void a(b bVar, m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1320309496);
        if (rVar.f(bVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar.f(this)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i13 & 1, z3)) {
            v vVar = this.f24835a;
            int size = vVar.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((q) vVar.get(i14)).b(bVar, rVar, Integer.valueOf(i13 & 14));
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a0.g(i, 10, this, bVar);
        }
    }
}
