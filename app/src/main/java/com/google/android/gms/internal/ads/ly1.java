package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ly1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8189a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8190b;

    public ly1(int i, boolean z3) {
        this.f8189a = i;
        this.f8190b = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ly1.class == obj.getClass()) {
                ly1 ly1Var = (ly1) obj;
                if (this.f8189a == ly1Var.f8189a && this.f8190b == ly1Var.f8190b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f8189a * 31) + (this.f8190b ? 1 : 0);
    }
}
