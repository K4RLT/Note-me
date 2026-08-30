package ic;

/* loaded from: classes.dex */
public final class n implements gd.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f18413c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f18414a = f18413c;

    /* renamed from: b, reason: collision with root package name */
    public volatile gd.b f18415b;

    public n(gd.b bVar) {
        this.f18415b = bVar;
    }

    @Override // gd.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f18414a;
        Object obj3 = f18413c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f18414a;
                    if (obj == obj3) {
                        obj = this.f18415b.get();
                        this.f18414a = obj;
                        this.f18415b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
