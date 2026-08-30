package t8;

import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f25665a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25666b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f25667c;

    public b(long j10, long j11, Set set) {
        this.f25665a = j10;
        this.f25666b = j11;
        this.f25667c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f25665a == bVar.f25665a && this.f25666b == bVar.f25666b && this.f25667c.equals(bVar.f25667c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f25665a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f25666b;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f25667c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f25665a + ", maxAllowedDelay=" + this.f25666b + ", flags=" + this.f25667c + "}";
    }
}
