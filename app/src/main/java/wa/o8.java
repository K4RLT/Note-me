package wa;
import q8.a;

/* loaded from: classes.dex */
public abstract class o8 {
    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static String b(long j10) {
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + a(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + a(Float.intBitsToFloat(i)) + ", " + a(Float.intBitsToFloat(i10)) + ')';
    }
}
