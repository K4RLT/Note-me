package v1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f27340a;

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static String b(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (this.f27340a != ((s) obj).f27340a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27340a);
    }

    public final String toString() {
        return b(this.f27340a);
    }
}
