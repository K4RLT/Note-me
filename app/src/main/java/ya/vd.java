package ya;

/* loaded from: classes.dex */
public abstract class vd {
    public static final long a(int i, int i10) {
        return (i10 & 4294967295L) | (i << 32);
    }

    public static final long b(long j10) {
        return (Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32);
    }

    public static final long c(long j10) {
        return (Float.floatToRawIntBits((int) (j10 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j10 >> 32)) << 32);
    }
}
