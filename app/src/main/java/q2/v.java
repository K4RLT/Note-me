package q2;
import u.c;

/* loaded from: classes.dex */
public final class v extends i {

    /* renamed from: z, reason: collision with root package name */
    public final c f23372z;

    public v(c cVar) {
        this.f23372z = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                if (!this.f23372z.equals(((v) obj).f23372z)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f23372z.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f23372z + ')';
    }
}
