package p8;

/* loaded from: classes.dex */
public final class a implements oe.a {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f22616w = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile b f22617u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f22618v;

    /* JADX WARN: Type inference failed for: r0v1, types: [p8.a, java.lang.Object, oe.a] */
    public static oe.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        Object obj = new Object();
        obj.f22618v = f22616w;
        obj.f22617u = bVar;
        return obj;
    }

    @Override // oe.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f22618v;
        Object obj3 = f22616w;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f22618v;
                    if (obj == obj3) {
                        obj = this.f22617u.get();
                        Object obj4 = this.f22618v;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f22618v = obj;
                        this.f22617u = null;
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