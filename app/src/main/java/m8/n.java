package m8;

/* loaded from: classes.dex */
public final class n extends y {

    /* renamed from: a, reason: collision with root package name */
    public final l f20735a;

    public n(l lVar) {
        this.f20735a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                Object obj2 = x.f20756u;
                if (obj2.equals(obj2)) {
                    if (this.f20735a.equals(((n) yVar).f20735a)) {
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
        return ((x.f20756u.hashCode() ^ 1000003) * 1000003) ^ this.f20735a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.f20756u + ", androidClientInfo=" + this.f20735a + "}";
    }
}
