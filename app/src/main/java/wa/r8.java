package wa;

/* loaded from: classes.dex */
public abstract class r8 {
    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }
}
