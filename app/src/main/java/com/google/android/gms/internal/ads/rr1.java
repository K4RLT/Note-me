package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rr1 implements wr1, pr1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10279c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile wr1 f10280a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10281b = f10279c;

    public rr1(wr1 wr1Var) {
        this.f10280a = wr1Var;
    }

    public static rr1 a(wr1 wr1Var) {
        if (wr1Var instanceof rr1) {
            return (rr1) wr1Var;
        }
        return new rr1(wr1Var);
    }

    public static pr1 b(wr1 wr1Var) {
        if (wr1Var instanceof pr1) {
            return (pr1) wr1Var;
        }
        wr1Var.getClass();
        return new rr1(wr1Var);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        Object obj = this.f10281b;
        Object obj2 = f10279c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    Object obj3 = this.f10281b;
                    if (obj3 == obj2) {
                        Object zzb = this.f10280a.zzb();
                        Object obj4 = this.f10281b;
                        if (obj4 != obj2 && obj4 != zzb) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + zzb + ". This is likely due to a circular dependency.");
                        }
                        this.f10281b = zzb;
                        this.f10280a = null;
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
