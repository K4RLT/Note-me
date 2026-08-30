package m8;

/* loaded from: classes.dex */
public final class o extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f20736a;

    public o(r rVar) {
        z zVar = z.f20758u;
        this.f20736a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a0) {
                if (this.f20736a.equals(((o) ((a0) obj)).f20736a)) {
                    Object obj2 = z.f20758u;
                    if (obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f20736a.hashCode() ^ 1000003) * 1000003) ^ z.f20758u.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f20736a + ", productIdOrigin=" + z.f20758u + "}";
    }
}
