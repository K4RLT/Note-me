package g0;
import z1.o0;
import z1.p0;
import z1.q0;
import z1.r0;

import b8.k9;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f17103b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f17104c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17105a;

    public /* synthetic */ g(int i) {
        this.f17105a = i;
    }

    @Override // p0
    public final q0 g(r0 r0Var, List list, long j10) {
        switch (this.f17105a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((o0) list.get(i)).z(j10));
                }
                return r0Var.u0(y2.a.h(j10), y2.a.g(j10), qe.t.f24024u, new k9(4, arrayList));
            default:
                return r0Var.u0(y2.a.h(j10), y2.a.g(j10), qe.t.f24024u, l.f17190z);
        }
    }
}
