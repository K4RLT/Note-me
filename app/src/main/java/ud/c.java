package ud;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public final String f27186b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27187c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27188d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27189f;

    public c(String str, String str2, String str3, String str4, long j10) {
        this.f27186b = str;
        this.f27187c = str2;
        this.f27188d = str3;
        this.e = str4;
        this.f27189f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            c cVar = (c) ((e) obj);
            if (this.f27186b.equals(cVar.f27186b) && this.f27187c.equals(cVar.f27187c) && this.f27188d.equals(cVar.f27188d) && this.e.equals(cVar.e) && this.f27189f == cVar.f27189f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f27186b.hashCode() ^ 1000003) * 1000003) ^ this.f27187c.hashCode()) * 1000003) ^ this.f27188d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j10 = this.f27189f;
        return hashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f27186b + ", variantId=" + this.f27187c + ", parameterKey=" + this.f27188d + ", parameterValue=" + this.e + ", templateVersion=" + this.f27189f + "}";
    }
}
