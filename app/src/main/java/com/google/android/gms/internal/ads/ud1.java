package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ud1 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f11631a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f11632b;

    public /* synthetic */ ud1(Class cls, Class cls2) {
        this.f11631a = cls;
        this.f11632b = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ud1) {
            ud1 ud1Var = (ud1) obj;
            if (ud1Var.f11631a.equals(this.f11631a) && ud1Var.f11632b.equals(this.f11632b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11631a, this.f11632b);
    }

    public final String toString() {
        String simpleName = this.f11631a.getSimpleName();
        String simpleName2 = this.f11632b.getSimpleName();
        return p.a.o(new StringBuilder(simpleName.length() + 22 + simpleName2.length()), simpleName, " with primitive type: ", simpleName2);
    }
}
