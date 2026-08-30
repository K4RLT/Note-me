package u8;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f27109f = new a(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f27110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27112c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27113d;
    public final int e;

    public a(long j10, int i, int i10, long j11, int i11) {
        this.f27110a = j10;
        this.f27111b = i;
        this.f27112c = i10;
        this.f27113d = j11;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f27110a == aVar.f27110a && this.f27111b == aVar.f27111b && this.f27112c == aVar.f27112c && this.f27113d == aVar.f27113d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f27110a;
        int i = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f27111b) * 1000003) ^ this.f27112c) * 1000003;
        long j11 = this.f27113d;
        return ((i ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f27110a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f27111b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f27112c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f27113d);
        sb2.append(", maxBlobByteSizePerRow=");
        return p.a.j(this.e, "}", sb2);
    }
}
