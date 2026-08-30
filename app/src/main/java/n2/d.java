package n2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f21114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21115b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21116c;

    public d(int i, int i10, boolean z3) {
        this.f21114a = i;
        this.f21115b = i10;
        this.f21116c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f21114a == dVar.f21114a && this.f21115b == dVar.f21115b && this.f21116c == dVar.f21116c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21116c) + p.a.b(this.f21115b, Integer.hashCode(this.f21114a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f21114a + ", end=" + this.f21115b + ", isRtl=" + this.f21116c + ')';
    }
}
