package w7;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f28067a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f28068b;

    static {
        int[] iArr = new int[g5.values().length];
        try {
            iArr[g5.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g5.TEXT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g5.SHAPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f28067a = iArr;
        int[] iArr2 = new int[x7.q.values().length];
        try {
            iArr2[x7.q.INK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[x7.q.IMAGES.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[x7.q.EVERYTHING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f28068b = iArr2;
    }
}
