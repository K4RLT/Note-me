package eg;

/* loaded from: classes.dex */
public final class s {
    public static final long[] e = new long[0];

    /* renamed from: a, reason: collision with root package name */
    public final cg.d f16578a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.u f16579b;

    /* renamed from: c, reason: collision with root package name */
    public long f16580c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f16581d;

    public s(cg.d dVar, g5.u uVar) {
        dVar.getClass();
        this.f16578a = dVar;
        this.f16579b = uVar;
        int f10 = dVar.f();
        if (f10 <= 64) {
            this.f16580c = f10 != 64 ? (-1) << f10 : 0L;
            this.f16581d = e;
            return;
        }
        this.f16580c = 0L;
        int i = (f10 - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f10 & 63) != 0) {
            jArr[i - 1] = (-1) << f10;
        }
        this.f16581d = jArr;
    }
}
