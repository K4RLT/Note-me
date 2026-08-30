package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class de1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5410a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f5411b;

    public /* synthetic */ de1(Class cls, Class cls2) {
        this.f5410a = cls;
        this.f5411b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof de1) {
            de1 de1Var = (de1) obj;
            if (de1Var.f5410a.equals(this.f5410a) && de1Var.f5411b.equals(this.f5411b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5410a, this.f5411b);
    }

    public final String toString() {
        String simpleName = this.f5410a.getSimpleName();
        String simpleName2 = this.f5411b.getSimpleName();
        return p.a.o(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
