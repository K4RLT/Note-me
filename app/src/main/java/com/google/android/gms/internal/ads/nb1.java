package com.google.android.gms.internal.ads;
import p.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class nb1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final w91 f8641a;

    public nb1(w91 w91Var) {
        this.f8641a = w91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f8641a != w91.f12188o;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof nb1) && ((nb1) obj).f8641a == this.f8641a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(nb1.class, this.f8641a);
    }

    public final String toString() {
        String str = this.f8641a.f12196b;
        return a.o(new StringBuilder(str.length() + 40), "XChaCha20Poly1305 Parameters (variant: ", str, ")");
    }
}
