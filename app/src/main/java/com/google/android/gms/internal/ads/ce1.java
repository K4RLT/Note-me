package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ce1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5081a;

    /* renamed from: b, reason: collision with root package name */
    public final gl1 f5082b;

    public /* synthetic */ ce1(Class cls, gl1 gl1Var) {
        this.f5081a = cls;
        this.f5082b = gl1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ce1) {
            ce1 ce1Var = (ce1) obj;
            if (ce1Var.f5081a.equals(this.f5081a) && ce1Var.f5082b.equals(this.f5082b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5081a, this.f5082b);
    }

    public final String toString() {
        String simpleName = this.f5081a.getSimpleName();
        String valueOf = String.valueOf(this.f5082b);
        return p.a.o(new StringBuilder(simpleName.length() + 21 + valueOf.length()), simpleName, ", object identifier: ", valueOf);
    }
}
