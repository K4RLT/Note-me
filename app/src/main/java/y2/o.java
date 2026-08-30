package y2;
import p.a;

import ya.ae;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final p[] f30818b = {new p(0), new p(4294967296L), new p(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f30819c = ae.f(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f30820a;

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final long b(long j10) {
        return f30818b[(int) ((j10 & 1095216660480L) >>> 32)].f30821a;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final boolean d(long j10) {
        if ((j10 & 1095216660480L) == 8589934592L) {
            return true;
        }
        return false;
    }

    public static String e(long j10) {
        long b10 = b(j10);
        if (a(b10, 0L)) {
            return "Unspecified";
        }
        if (a(b10, 4294967296L)) {
            return c(j10) + ".sp";
        }
        if (a(b10, 8589934592L)) {
            return c(j10) + ".em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (this.f30820a != ((o) obj).f30820a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30820a);
    }

    public final String toString() {
        return e(this.f30820a);
    }
}
