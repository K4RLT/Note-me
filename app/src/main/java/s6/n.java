package s6;

import pf.b0;
import r0.g0;
import r0.i1;
import r0.n2;
import r0.y;

/* loaded from: classes.dex */
public final class n implements n2 {

    /* renamed from: u, reason: collision with root package name */
    public final pf.q f24970u = b0.a();

    /* renamed from: v, reason: collision with root package name */
    public final i1 f24971v = y.B(null);

    /* renamed from: w, reason: collision with root package name */
    public final i1 f24972w = y.B(null);

    /* renamed from: x, reason: collision with root package name */
    public final g0 f24973x;

    /* renamed from: y, reason: collision with root package name */
    public final g0 f24974y;

    public n() {
        y.r(new m(this, 2));
        this.f24973x = y.r(new m(this, 0));
        y.r(new m(this, 1));
        this.f24974y = y.r(new m(this, 3));
    }

    @Override // r0.n2
    public final Object getValue() {
        return (o6.a) this.f24971v.getValue();
    }
}
