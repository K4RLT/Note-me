package com.google.android.gms.internal.ads;
import g3.a;
import a5.a;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final b3 f13048a;

    /* renamed from: b, reason: collision with root package name */
    public final b3 f13049b;

    public z2(b3 b3Var, b3 b3Var2) {
        this.f13048a = b3Var;
        this.f13049b = b3Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z2.class == obj.getClass()) {
                z2 z2Var = (z2) obj;
                if (this.f13048a.equals(z2Var.f13048a) && this.f13049b.equals(z2Var.f13049b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13049b.hashCode() + (this.f13048a.hashCode() * 31);
    }

    public final String toString() {
        String concat;
        b3 b3Var = this.f13048a;
        String b3Var2 = b3Var.toString();
        b3 b3Var3 = this.f13049b;
        if (b3Var.equals(b3Var3)) {
            concat = "";
        } else {
            concat = ", ".concat(b3Var3.toString());
        }
        return a5.a.l(new StringBuilder(g3.a.v(concat, b3Var2.length() + 1, 1)), "[", b3Var2, concat, "]");
    }
}
