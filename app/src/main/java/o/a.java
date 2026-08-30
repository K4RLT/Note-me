package o;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21371a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f21372b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f21373c = new Object[0];

    public static final int a(int[] iArr, int i, int i10) {
        iArr.getClass();
        int i11 = i - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int b(long[] jArr, int i, long j10) {
        jArr.getClass();
        int i10 = i - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j11 = jArr[i12];
            if (j11 < j10) {
                i11 = i12 + 1;
            } else if (j11 > j10) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
