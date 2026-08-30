package f0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f16629a;

    static {
        c cVar = new c(50);
        f16629a = new d(cVar, cVar, cVar, cVar);
    }

    public static final d a(float f10) {
        b bVar = new b(f10);
        return new d(bVar, bVar, bVar, bVar);
    }

    public static final d b(float f10, float f11, float f12, float f13) {
        return new d(new b(f10), new b(f11), new b(f12), new b(f13));
    }

    public static d c(float f10, float f11) {
        return b(f10, f11, 0, 0);
    }

    public static final d d() {
        return f16629a;
    }
}
