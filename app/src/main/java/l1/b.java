package l1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final long f19806a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f19807b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f19808c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f19809d;
    public static final /* synthetic */ int e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f19806a = (0 & 4294967295L) | j11;
        f19807b = (1 & 4294967295L) | j11;
        f19808c = j11 | (2 & 4294967295L);
        f19809d = (j10 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static String b(long j10) {
        if (a(j10, f19806a)) {
            return "Rgb";
        }
        if (a(j10, f19807b)) {
            return "Xyz";
        }
        if (a(j10, f19808c)) {
            return "Lab";
        }
        if (a(j10, f19809d)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
