package pc;

import g5.q;

/* loaded from: classes.dex */
public final class b extends m {

    /* renamed from: b, reason: collision with root package name */
    public final String f22648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22649c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22650d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22651f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f22648b = str;
            if (str2 != null) {
                this.f22649c = str2;
                this.f22650d = str3;
                if (str4 != null) {
                    this.e = str4;
                    this.f22651f = j10;
                    return;
                } else {
                    q.h("Null variantId");
                    throw null;
                }
            }
            q.h("Null parameterKey");
            throw null;
        }
        q.h("Null rolloutId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof m) {
                b bVar = (b) ((m) obj);
                if (this.f22648b.equals(bVar.f22648b) && this.f22649c.equals(bVar.f22649c) && this.f22650d.equals(bVar.f22650d) && this.e.equals(bVar.e) && this.f22651f == bVar.f22651f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f22648b.hashCode() ^ 1000003) * 1000003) ^ this.f22649c.hashCode()) * 1000003) ^ this.f22650d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        long j10 = this.f22651f;
        return hashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f22648b + ", parameterKey=" + this.f22649c + ", parameterValue=" + this.f22650d + ", variantId=" + this.e + ", templateVersion=" + this.f22651f + "}";
    }
}
