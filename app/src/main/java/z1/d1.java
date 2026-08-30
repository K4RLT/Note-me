package z1;
import b0.n;

import b8.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d1 extends b2.f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d1 f31796b = new b2.f0("Undefined intrinsics block and it is required");

    @Override // z1.p0
    public final q0 g(r0 r0Var, List list, long j10) {
        int size = list.size();
        qe.t tVar = qe.t.f24024u;
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int i = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size2; i11++) {
                    a1 z3 = ((o0) list.get(i11)).z(j10);
                    i = Math.max(z3.f31769u, i);
                    i10 = Math.max(z3.f31770v, i10);
                    arrayList.add(z3);
                }
                return r0Var.u0(y2.b.g(i, j10), y2.b.f(i10, j10), tVar, new k9(9, arrayList));
            }
            a1 z9 = ((o0) list.get(0)).z(j10);
            return r0Var.u0(y2.b.g(z9.f31769u, j10), y2.b.f(z9.f31770v, j10), tVar, new n(z9, 15));
        }
        return r0Var.u0(y2.a.j(j10), y2.a.i(j10), tVar, b1.f31778w);
    }
}
