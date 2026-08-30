package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class e7 {

    /* renamed from: a, reason: collision with root package name */
    public final z7 f14246a = z7.f15330b;

    /* renamed from: b, reason: collision with root package name */
    public final String f14247b;

    public e7(String str) {
        this.f14247b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e7) {
            e7 e7Var = (e7) obj;
            if (this.f14246a.equals(e7Var.f14246a) && this.f14247b.equals(e7Var.f14247b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14246a.hashCode() ^ this.f14247b.hashCode();
    }
}
