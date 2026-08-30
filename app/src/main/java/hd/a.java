package hd;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18003a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18004b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18005c;

    public a(long j10, long j11, String str) {
        this.f18003a = str;
        this.f18004b = j10;
        this.f18005c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f18003a.equals(aVar.f18003a) && this.f18004b == aVar.f18004b && this.f18005c == aVar.f18005c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f18003a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f18004b;
        long j11 = this.f18005c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f18003a + ", tokenExpirationTimestamp=" + this.f18004b + ", tokenCreationTimestamp=" + this.f18005c + "}";
    }
}
