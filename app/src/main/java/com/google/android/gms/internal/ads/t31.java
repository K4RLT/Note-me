package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t31 implements r31 {

    /* renamed from: u, reason: collision with root package name */
    public final v31 f11237u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public volatile r31 f11238v;

    /* renamed from: w, reason: collision with root package name */
    public Object f11239w;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.v31, java.lang.Object] */
    public t31(r31 r31Var) {
        this.f11238v = r31Var;
    }

    public final String toString() {
        Object obj = this.f11238v;
        if (obj == null) {
            String valueOf = String.valueOf(this.f11239w);
            obj = p.a.o(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return p.a.o(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    @Override // com.google.android.gms.internal.ads.r31
    public final Object zza() {
        if (this.f11238v != null) {
            synchronized (this.f11237u) {
                try {
                    if (this.f11238v != null) {
                        Object zza = this.f11238v.zza();
                        this.f11239w = zza;
                        this.f11238v = null;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f11239w;
    }
}
