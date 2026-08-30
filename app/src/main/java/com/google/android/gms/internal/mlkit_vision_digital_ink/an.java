package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class an {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14024a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14025b;

    public an(int i, km kmVar) {
        this.f14024a = kmVar;
        this.f14025b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof an)) {
            return false;
        }
        an anVar = (an) obj;
        if (this.f14024a != anVar.f14024a || this.f14025b != anVar.f14025b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14024a) * 65535) + this.f14025b;
    }
}
