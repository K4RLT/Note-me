package w7;
import p.e;
import r.c;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d.d;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import k1.o0;
import m2.h0;
import o0.x1;
import q2.i;
import q2.p;
import q2.s;
import r0.m;
import r0.y;
import t2.b;
import x2.l;
import z1.p0;

import java.util.ArrayList;
import java.util.List;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class b9 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27995u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f27996v;

    public /* synthetic */ b9(String str) {
        this.f27995u = 2;
        this.f27996v = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f27995u) {
            case 0:
                ((Integer) obj2).getClass();
                n4.A0(this.f27996v, (m) obj, y.L(1));
                return pe.z.f22715a;
            case 1:
                ((Integer) obj2).getClass();
                l.a(this.f27996v, (m) obj, y.L(1));
                return pe.z.f22715a;
            case 2:
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    r m4 = androidx.compose.foundation.layout.a.m(ya.d(androidx.compose.foundation.layout.d(s.a(), 1.0f), ya.b(rVar), false, 14), 8, 0.0f, 2);
                    p0 d2 = m.d(c.f15670u, false);
                    int hashCode = Long.hashCode(rVar.T);
                    g l10 = rVar.l();
                    r c10 = a.c(m4, rVar);
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
                        a.t(hashCode, rVar, hashCode, fVar);
                    }
                    y.I(g.f1463c, c10, rVar);
                    d dVar = new d();
                    List C = mf.f.C(this.f27996v, new String[]{"**"});
                    int size = C.size();
                    for (int i = 0; i < size; i++) {
                        int i10 = i % 2;
                        StringBuilder sb2 = dVar.f20446u;
                        if (i10 == 1) {
                            c cVar = new c(new h0(0L, 0L, s.B, (o) null, (p) null, (i) null, (String) null, 0L, (a) null, (p) null, (b) null, 0L, (l) null, (o0) null, 65531), sb2.length(), 0, 12);
                            ArrayList arrayList = dVar.f20447v;
                            arrayList.add(cVar);
                            dVar.f20448w.add(cVar);
                            int size2 = arrayList.size() - 1;
                            try {
                                sb2.append((String) C.get(i));
                            } finally {
                                dVar.b(size2);
                            }
                        } else {
                            sb2.append((String) C.get(i));
                        }
                    }
                    x1.c(dVar.c(), androidx.compose.foundation.layout.a.o(o.f15687a, 0.0f, 0.0f, 0.0f, 48, 7), r.c(r.f19515d, 0.85f), ae.e(15), 0L, ae.e(22), 0, false, 0, 0, null, null, null, rVar, 3504);
                    rVar.p(true);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            default:
                ((Integer) obj2).getClass();
                p.e(this.f27996v, (m) obj, y.L(1));
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ b9(String str, int i, int i10) {
        this.f27995u = i10;
        this.f27996v = str;
    }
}
