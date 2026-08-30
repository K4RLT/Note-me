package r0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class m2 implements Iterable, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final b2 f24297u;

    /* renamed from: v, reason: collision with root package name */
    public final int f24298v;

    /* renamed from: w, reason: collision with root package name */
    public final b f24299w;

    public m2(b2 b2Var, int i, o0 o0Var, b bVar) {
        this.f24297u = b2Var;
        this.f24298v = i;
        this.f24299w = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new n0(this.f24297u, this.f24298v, null, this.f24299w);
    }
}
