package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class i5 extends Exception {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f14460x = 0;

    /* renamed from: u, reason: collision with root package name */
    public final String f14461u;

    /* renamed from: v, reason: collision with root package name */
    public final String f14462v;

    /* renamed from: w, reason: collision with root package name */
    public final String f14463w;

    public i5(String str, String str2, String str3) {
        this.f14461u = str;
        this.f14462v = str2;
        this.f14463w = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i5) {
            i5 i5Var = (i5) obj;
            if (this.f14461u.equals(i5Var.f14461u) && this.f14462v.equals(i5Var.f14462v) && this.f14463w.equals(i5Var.f14463w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14461u.hashCode() ^ 1000003) * 1000003) ^ this.f14462v.hashCode()) * 1000003) ^ this.f14463w.hashCode();
    }
}
