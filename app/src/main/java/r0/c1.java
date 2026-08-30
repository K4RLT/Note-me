package r0;
import p.a;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f24199a;

    public c1(String str) {
        this.f24199a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c1) || !this.f24199a.equals(((c1) obj).f24199a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f24199a.hashCode();
    }

    public final String toString() {
        return a.n(new StringBuilder("OpaqueKey(key="), this.f24199a, ')');
    }
}
