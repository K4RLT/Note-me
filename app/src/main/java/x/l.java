package x;

import java.util.List;

/* loaded from: classes.dex */
public final class l implements z1.p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l f29973b = new l(0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f29974c = new l(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29975a;

    public /* synthetic */ l(int i) {
        this.f29975a = i;
    }

    @Override // z1.p0
    public final z1.q0 g(z1.r0 r0Var, List list, long j10) {
        int i;
        switch (this.f29975a) {
            case 0:
                return r0Var.u0(y2.a.j(j10), y2.a.i(j10), qe.t.f24024u, k.f29965v);
            default:
                int i10 = 0;
                if (y2.a.f(j10)) {
                    i = y2.a.h(j10);
                } else {
                    i = 0;
                }
                if (y2.a.e(j10)) {
                    i10 = y2.a.g(j10);
                }
                return r0Var.u0(i, i10, qe.t.f24024u, k.f29967x);
        }
    }
}
