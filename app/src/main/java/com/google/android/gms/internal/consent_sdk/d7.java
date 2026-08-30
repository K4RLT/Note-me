package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class d7 implements f7 {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f13391w = new Object();

    /* renamed from: u, reason: collision with root package name */
    public volatile e7 f13392u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f13393v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.consent_sdk.d7] */
    public static d7 a(e7 e7Var) {
        if (e7Var instanceof d7) {
            return (d7) e7Var;
        }
        Object obj = new Object();
        obj.f13393v = f13391w;
        obj.f13392u = e7Var;
        return obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.f7
    public final Object zzb() {
        Object obj = this.f13393v;
        Object obj2 = f13391w;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    Object obj3 = this.f13393v;
                    if (obj3 == obj2) {
                        Object zzb = this.f13392u.zzb();
                        Object obj4 = this.f13393v;
                        if (obj4 != obj2 && obj4 != zzb) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + zzb + ". This is likely due to a circular dependency.");
                        }
                        this.f13393v = zzb;
                        this.f13392u = null;
                        return zzb;
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