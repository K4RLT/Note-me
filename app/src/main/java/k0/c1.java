package k0;

import b8.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c1 implements z1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f19246a = new Object();

    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            z1.a1 z3 = ((z1.o0) list.get(i11)).z(j10);
            i = Math.max(i, z3.f31769u);
            i10 = Math.max(i10, z3.f31770v);
            arrayList.add(z3);
        }
        return r0Var.u0(i, i10, qe.t.f24024u, new k9(5, arrayList));
    }
}
