package kb;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f19740w = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile c f19741u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f19742v;

    /* JADX WARN: Type inference failed for: r0v1, types: [kb.b, java.lang.Object, kb.c] */
    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        Object obj = new Object();
        obj.f19742v = f19740w;
        obj.f19741u = cVar;
        return obj;
    }

    @Override // kb.c, com.google.android.gms.internal.ads.i81
    /* renamed from: zza */
    public final Object mo207zza() {
        Object obj;
        Object obj2 = this.f19742v;
        Object obj3 = f19740w;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f19742v;
                    if (obj == obj3) {
                        obj = this.f19741u.mo207zza();
                        Object obj4 = this.f19742v;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f19742v = obj;
                        this.f19741u = null;
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