package j4;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f18904a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18905b;

    public d(int i, long j10) {
        this.f18904a = i;
        this.f18905b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f18904a == dVar.f18904a && this.f18905b == dVar.f18905b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18905b) + (Integer.hashCode(this.f18904a) * 31);
    }

    public final String toString() {
        return "FdSignalPair(fd=" + this.f18904a + ", signalTime=" + this.f18905b + ')';
    }
}
