package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class tq implements uq {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f15020w = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile uq f15021u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f15022v;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.tq, java.lang.Object] */
    public static tq a(uq uqVar) {
        if (uqVar instanceof tq) {
            return (tq) uqVar;
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.tq obj = new Object();
        obj.f15022v = f15020w;
        obj.f15021u = uqVar;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public final Object c() {
        Object obj = this.f15022v;
        Object obj2 = f15020w;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    Object obj3 = this.f15022v;
                    if (obj3 == obj2) {
                        Object c10 = this.f15021u.c();
                        Object obj4 = this.f15022v;
                        if (obj4 != obj2 && obj4 != c10) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + c10 + ". This is likely due to a circular dependency.");
                        }
                        this.f15022v = c10;
                        this.f15021u = null;
                        return c10;
                    }
                    return obj3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
