package za;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: u, reason: collision with root package name */
    public final f f32019u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public volatile c f32020v;

    /* renamed from: w, reason: collision with root package name */
    public Object f32021w;

    /* JADX WARN: Type inference failed for: r0v0, types: [za.f, java.lang.Object] */
    public e(c cVar) {
        this.f32020v = cVar;
    }

    public final String toString() {
        Object obj = this.f32020v;
        if (obj == null) {
            obj = p.a.k("<supplier that returned ", String.valueOf(this.f32021w), ">");
        }
        return p.a.k("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // za.c
    public final Object zza() {
        if (this.f32020v != null) {
            synchronized (this.f32019u) {
                try {
                    if (this.f32020v != null) {
                        Object zza = this.f32020v.zza();
                        this.f32021w = zza;
                        this.f32020v = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f32021w;
    }
}
