package j1;

import wa.q8;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f18762a;

    public static long a(long j10, int i, float f10) {
        float f11;
        if ((i & 1) != 0) {
            f11 = Float.intBitsToFloat((int) (j10 >> 32));
        } else {
            f11 = 0.0f;
        }
        if ((i & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        return (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public static final long b(long j10, float f10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / f10;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / f10;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final boolean c(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final float d(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
    }

    public static final float e(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static final long g(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long h(long j10, long j11) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final long i(long j10, float f10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * f10;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f10;
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static String j(long j10) {
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            return "Offset(" + q8.a(Float.intBitsToFloat((int) (j10 >> 32))) + ", " + q8.a(Float.intBitsToFloat((int) (j10 & 4294967295L))) + ')';
        }
        return "Offset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.f18762a != ((b) obj).f18762a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18762a);
    }

    public final /* synthetic */ long k() {
        return this.f18762a;
    }

    public final String toString() {
        return j(this.f18762a);
    }
}
