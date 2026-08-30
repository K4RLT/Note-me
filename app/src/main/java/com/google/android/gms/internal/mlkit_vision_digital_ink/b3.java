package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class b3 implements z2 {

    /* renamed from: x, reason: collision with root package name */
    public static final w0 f14057x = new w0(1);

    /* renamed from: u, reason: collision with root package name */
    public final c3 f14058u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public volatile z2 f14059v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14060w;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.c3, java.lang.Object] */
    public b3(z2 z2Var) {
        z2Var.getClass();
        this.f14059v = z2Var;
    }

    public final String toString() {
        Object obj = this.f14059v;
        if (obj == f14057x) {
            obj = p.a.k("<supplier that returned ", String.valueOf(this.f14060w), ">");
        }
        return p.a.k("Suppliers.memoize(", String.valueOf(obj), ")");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.z2
    public final Object zza() {
        z2 z2Var = this.f14059v;
        w0 w0Var = f14057x;
        if (z2Var != w0Var) {
            synchronized (this.f14058u) {
                try {
                    if (this.f14059v != w0Var) {
                        Object zza = this.f14059v.zza();
                        this.f14060w = zza;
                        this.f14059v = w0Var;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f14060w;
    }
}
