package i1;

import c.f0;
import c2.x;
import n.d0;
import n.j0;
import n.q0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final j f18101a;

    /* renamed from: b, reason: collision with root package name */
    public final x f18102b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f18103c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f18104d;
    public boolean e;

    public g(j jVar, x xVar) {
        this.f18101a = jVar;
        this.f18102b = xVar;
        int i = q0.f20928a;
        this.f18103c = new j0();
        this.f18104d = new j0();
    }

    public final void a() {
        if (!this.e) {
            f0 f0Var = new f0(0, this, g.class, "invalidateNodes", "invalidateNodes()V", 0, 4);
            d0 d0Var = this.f18102b.P0;
            if (d0Var.f(f0Var) < 0) {
                d0Var.a(f0Var);
            }
            this.e = true;
        }
    }
}
