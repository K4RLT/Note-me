package wa;
import j1.c;

/* loaded from: classes.dex */
public abstract class s8 {
    public static final c a(long j10, long j11) {
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        return new c(Float.intBitsToFloat(i), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i10));
    }
}
