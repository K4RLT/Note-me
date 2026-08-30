package com.google.android.gms.internal.ads;
import p.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class xa1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final q91 f12537a;

    public xa1(q91 q91Var) {
        this.f12537a = q91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f12537a != q91.E;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof xa1) && ((xa1) obj).f12537a == this.f12537a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(xa1.class, this.f12537a);
    }

    public final String toString() {
        String str = this.f12537a.f9792v;
        return a.o(new StringBuilder(str.length() + 39), "ChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
