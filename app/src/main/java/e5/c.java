package e5;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f15913a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15914b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15915c;

    public c(long j10, int i, long j11) {
        this.f15913a = j10;
        this.f15914b = j11;
        this.f15915c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15913a == cVar.f15913a && this.f15914b == cVar.f15914b && this.f15915c == cVar.f15915c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15915c) + p.a.d(this.f15914b, Long.hashCode(this.f15913a) * 31, 31);
    }

    public final String toString() {
        return "Topic { ".concat("TaxonomyVersion=" + this.f15913a + ", ModelVersion=" + this.f15914b + ", TopicCode=" + this.f15915c + " }");
    }
}
