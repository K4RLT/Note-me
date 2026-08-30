package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zu1 {

    /* renamed from: d, reason: collision with root package name */
    public static final zu1 f13272d = new Object().a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13273a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13274b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13275c;

    public /* synthetic */ zu1(f6 f6Var) {
        this.f13273a = f6Var.f5940a;
        this.f13274b = f6Var.f5941b;
        this.f13275c = f6Var.f5942c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && zu1.class == obj.getClass()) {
                zu1 zu1Var = (zu1) obj;
                if (this.f13273a == zu1Var.f13273a && this.f13274b == zu1Var.f13274b && this.f13275c == zu1Var.f13275c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = (this.f13273a ? 1 : 0) << 2;
        boolean z3 = this.f13274b;
        return (z3 ? 1 : 0) + (z3 ? 1 : 0) + i + (this.f13275c ? 1 : 0);
    }
}
