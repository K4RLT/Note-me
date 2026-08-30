package mb;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f20771w = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile f f20772u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f20773v = f20771w;

    public e(f fVar) {
        this.f20772u = fVar;
    }

    public static e a(f fVar) {
        if (fVar instanceof e) {
            return (e) fVar;
        }
        return new e(fVar);
    }

    @Override // mb.f
    public final Object b() {
        Object obj;
        Object obj2 = this.f20773v;
        Object obj3 = f20771w;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f20773v;
                    if (obj == obj3) {
                        obj = this.f20772u.b();
                        Object obj4 = this.f20773v;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f20773v = obj;
                        this.f20772u = null;
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
