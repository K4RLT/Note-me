package c3;
import b0.n;

import b8.k9;
import java.util.ArrayList;
import java.util.List;
import z1.a1;
import z1.o0;
import z1.p0;
import z1.q0;
import z1.r0;

/* loaded from: classes.dex */
public final class f implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f3766b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f3767c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3768a;

    public /* synthetic */ f(int i) {
        this.f3768a = i;
    }

    @Override // z1.p0
    public final q0 g(r0 r0Var, List list, long j10) {
        switch (this.f3768a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    a1 z3 = ((o0) list.get(i11)).z(j10);
                    i = Math.max(i, z3.f31769u);
                    i10 = Math.max(i10, z3.f31770v);
                    arrayList.add(z3);
                }
                if (list.isEmpty()) {
                    i = y2.a.j(j10);
                    i10 = y2.a.i(j10);
                }
                return r0Var.u0(i, i10, qe.t.f24024u, new k9(2, arrayList));
            default:
                int size2 = list.size();
                qe.t tVar = qe.t.f24024u;
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i12 = 0;
                        int i13 = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            a1 z9 = ((o0) list.get(i14)).z(j10);
                            i12 = Math.max(i12, z9.f31769u);
                            i13 = Math.max(i13, z9.f31770v);
                            arrayList2.add(z9);
                        }
                        return r0Var.u0(i12, i13, tVar, new k9(3, arrayList2));
                    }
                    a1 z10 = ((o0) list.get(0)).z(j10);
                    return r0Var.u0(z10.f31769u, z10.f31770v, tVar, new n(z10, 1));
                }
                return r0Var.u0(0, 0, tVar, c.f3755z);
        }
    }
}
