package r0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c2 implements Iterable, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final b2 f24200u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24201v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24202w;

    public c2(b2 b2Var, int i, int i10) {
        this.f24200u = b2Var;
        this.f24201v = i;
        this.f24202w = i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b2 b2Var = this.f24200u;
        if (b2Var.B != this.f24202w) {
            d2.e();
        }
        int i = this.f24201v;
        b2Var.o(i);
        return new n0(b2Var, i + 1, b2Var.f24191u[(i * 5) + 3] + i);
    }
}
