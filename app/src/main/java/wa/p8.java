package wa;

/* loaded from: classes.dex */
public abstract class p8 {
    public static long a(float f10) {
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }
}
