package k0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f19383a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19384b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19385c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19386d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final m2.m0 f19387f;

    public p(long j10, int i, int i10, int i11, int i12, m2.m0 m0Var) {
        this.f19383a = j10;
        this.f19384b = i;
        this.f19385c = i10;
        this.f19386d = i11;
        this.e = i12;
        this.f19387f = m0Var;
    }

    public final q a(int i) {
        return new q(v0.u(this.f19387f, i), i, this.f19383a);
    }

    public final i b() {
        int i = this.f19385c;
        int i10 = this.f19386d;
        if (i < i10) {
            return i.f19303v;
        }
        if (i > i10) {
            return i.f19302u;
        }
        return i.f19304w;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f19383a);
        sb2.append(", range=(");
        int i = this.f19385c;
        sb2.append(i);
        sb2.append('-');
        m2.m0 m0Var = this.f19387f;
        sb2.append(v0.u(m0Var, i));
        sb2.append(',');
        int i10 = this.f19386d;
        sb2.append(i10);
        sb2.append('-');
        sb2.append(v0.u(m0Var, i10));
        sb2.append("), prevOffset=");
        return a5.a.i(sb2, this.e, ')');
    }
}
