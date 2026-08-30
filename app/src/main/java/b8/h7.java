package b8;
import p.a;

/* loaded from: classes.dex */
public final class h7 extends l7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2160a;

    public h7(String str) {
        this.f2160a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof h7) || !this.f2160a.equals(((h7) obj).f2160a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2160a.hashCode();
    }

    public final String toString() {
        return a.k("Failed(reason=", this.f2160a, ")");
    }
}
