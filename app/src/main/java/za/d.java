package za;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable, c {

    /* renamed from: u, reason: collision with root package name */
    public final transient f f32015u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final c f32016v;

    /* renamed from: w, reason: collision with root package name */
    public volatile transient boolean f32017w;

    /* renamed from: x, reason: collision with root package name */
    public transient Object f32018x;

    /* JADX WARN: Type inference failed for: r0v0, types: [za.f, java.lang.Object] */
    public d(c cVar) {
        this.f32016v = cVar;
    }

    public final String toString() {
        Object obj;
        if (this.f32017w) {
            obj = p.a.k("<supplier that returned ", String.valueOf(this.f32018x), ">");
        } else {
            obj = this.f32016v;
        }
        return p.a.k("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // za.c
    public final Object zza() {
        if (!this.f32017w) {
            synchronized (this.f32015u) {
                try {
                    if (!this.f32017w) {
                        Object zza = this.f32016v.zza();
                        this.f32018x = zza;
                        this.f32017w = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f32018x;
    }
}
