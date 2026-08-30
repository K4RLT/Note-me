package w6;

import q6.s;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27770a;

    /* renamed from: b, reason: collision with root package name */
    public final v6.b f27771b;

    /* renamed from: c, reason: collision with root package name */
    public final v6.b f27772c;

    /* renamed from: d, reason: collision with root package name */
    public final v6.b f27773d;
    public final boolean e;

    public p(String str, int i, v6.b bVar, v6.b bVar2, v6.b bVar3, boolean z3) {
        this.f27770a = i;
        this.f27771b = bVar;
        this.f27772c = bVar2;
        this.f27773d = bVar3;
        this.e = z3;
    }

    @Override // w6.b
    public final q6.c a(o6.j jVar, o6.a aVar, x6.b bVar) {
        return new s(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f27771b + ", end: " + this.f27772c + ", offset: " + this.f27773d + "}";
    }
}
