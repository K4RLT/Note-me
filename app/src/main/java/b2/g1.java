package b2;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1470a;

    public static final int a(int i, long j10) {
        int i10 = h2.f1476b;
        return ((int) (j10 >> (i * 15))) & 32767;
    }

    public static long c(int i, int i10, int i11, int i12) {
        return ((i10 & 32767) << 15) | (i & 32767) | ((i11 & 32767) << 30) | ((i12 & 32767) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f1470a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
