package y2;
import f.b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f30807a;

    public static final float a(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f30807a != ((h) obj).f30807a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30807a);
    }

    public final String toString() {
        long j10 = this.f30807a;
        if (j10 != 9205357640488583168L) {
            return ((Object) b(b(j10))) + " x " + ((Object) b(a(j10)));
        }
        return "DpSize.Unspecified";
    }
}
