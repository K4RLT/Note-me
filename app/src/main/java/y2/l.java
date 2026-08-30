package y2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f30813a;

    public /* synthetic */ l(long j10) {
        this.f30813a = j10;
    }

    public static final /* synthetic */ l a(long j10) {
        return new l(j10);
    }

    public static boolean b(long j10, Object obj) {
        if (!(obj instanceof l) || j10 != ((l) obj).f30813a) {
            return false;
        }
        return true;
    }

    public static final boolean c(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static String d(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return b(this.f30813a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f30813a);
    }

    public final String toString() {
        return d(this.f30813a);
    }
}
