package w1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f27688a;

    /* renamed from: b, reason: collision with root package name */
    public float f27689b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f27688a == aVar.f27688a && Float.compare(this.f27689b, aVar.f27689b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27689b) + (Long.hashCode(this.f27688a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f27688a);
        sb2.append(", dataPoint=");
        return p.a.m(sb2, this.f27689b, ')');
    }
}
