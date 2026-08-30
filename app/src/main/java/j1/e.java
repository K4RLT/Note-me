package j1;

import wa.q8;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f18774a;

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float b(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final float c(long j10) {
        return Math.min(Float.intBitsToFloat((int) ((j10 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j10 & 2147483647L)));
    }

    public static final float d(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final boolean e(long j10) {
        boolean z3;
        boolean z9;
        boolean z10 = false;
        if (j10 == 9205357640488583168L) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Float.intBitsToFloat((int) (j10 >> 32)) <= 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z3 | z9;
        if (Float.intBitsToFloat((int) (j10 & 4294967295L)) <= 0.0f) {
            z10 = true;
        }
        return z11 | z10;
    }

    public static String f(long j10) {
        if (j10 != 9205357640488583168L) {
            return "Size(" + q8.a(Float.intBitsToFloat((int) (j10 >> 32))) + ", " + q8.a(Float.intBitsToFloat((int) (j10 & 4294967295L))) + ')';
        }
        return "Size.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f18774a != ((e) obj).f18774a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18774a);
    }

    public final String toString() {
        return f(this.f18774a);
    }
}
