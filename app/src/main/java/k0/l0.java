package k0;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f19349a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f19350b;

    /* renamed from: c, reason: collision with root package name */
    public static final j2.v f19351c = new j2.v("SelectionHandleInfo");

    static {
        float f10 = 25;
        f19349a = f10;
        f19350b = f10;
    }

    public static final long a(long j10) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
