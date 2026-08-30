package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class j6 implements a6 {

    /* renamed from: a, reason: collision with root package name */
    public final a6 f14499a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14500b;

    public j6(a6 a6Var, Object obj) {
        this.f14499a = a6Var;
        n5.e(obj, "log site qualifier");
        this.f14500b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        if (!this.f14499a.equals(j6Var.f14499a) || !this.f14500b.equals(j6Var.f14500b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14499a.hashCode() ^ this.f14500b.hashCode();
    }

    public final String toString() {
        return a5.a.h("SpecializedLogSiteKey{ delegate='", this.f14499a.toString(), "', qualifier='", this.f14500b.toString(), "' }");
    }
}
