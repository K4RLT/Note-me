package bc;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f3165a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3166b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3167c;

    public a(long j10, long j11, long j12) {
        this.f3165a = j10;
        this.f3166b = j11;
        this.f3167c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3165a == aVar.f3165a && this.f3166b == aVar.f3166b && this.f3167c == aVar.f3167c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3165a;
        long j11 = this.f3166b;
        int i = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f3167c;
        return i ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f3165a + ", elapsedRealtime=" + this.f3166b + ", uptimeMillis=" + this.f3167c + "}";
    }
}
