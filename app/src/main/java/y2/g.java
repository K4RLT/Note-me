package y2;
import f.b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f30806a;

    public static String a(long j10) {
        if (j10 != 9205357640488583168L) {
            return "(" + ((Object) b(Float.intBitsToFloat((int) (j10 >> 32)))) + ", " + ((Object) b(Float.intBitsToFloat((int) (j10 & 4294967295L)))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (this.f30806a != ((g) obj).f30806a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30806a);
    }

    public final String toString() {
        return a(this.f30806a);
    }
}
