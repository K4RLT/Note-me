package w6;

import q6.q;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27760b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.a f27761c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27762d;

    public n(String str, int i, v6.a aVar, boolean z3) {
        this.f27759a = str;
        this.f27760b = i;
        this.f27761c = aVar;
        this.f27762d = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new q(jVar, bVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f27759a);
        sb2.append(", index=");
        return a5.a.i(sb2, this.f27760b, '}');
    }
}
