package vd;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final i f27609a;

    /* renamed from: b, reason: collision with root package name */
    public final i f27610b;

    /* renamed from: c, reason: collision with root package name */
    public final double f27611c;

    public j(i iVar, i iVar2, double d2) {
        this.f27609a = iVar;
        this.f27610b = iVar2;
        this.f27611c = d2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f27609a != jVar.f27609a || this.f27610b != jVar.f27610b || Double.compare(this.f27611c, jVar.f27611c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Double.hashCode(this.f27611c) + ((this.f27610b.hashCode() + (this.f27609a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f27609a + ", crashlytics=" + this.f27610b + ", sessionSamplingRate=" + this.f27611c + ')';
    }
}
