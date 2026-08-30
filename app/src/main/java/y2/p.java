package y2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final long f30821a;

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static String b(long j10) {
        if (a(j10, 0L)) {
            return "Unspecified";
        }
        if (a(j10, 4294967296L)) {
            return "Sp";
        }
        if (a(j10, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (this.f30821a != ((p) obj).f30821a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30821a);
    }

    public final String toString() {
        return b(this.f30821a);
    }
}
