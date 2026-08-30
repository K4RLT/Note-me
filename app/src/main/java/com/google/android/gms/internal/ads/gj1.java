package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gj1 extends qe1 {

    /* renamed from: a, reason: collision with root package name */
    public final ja1 f6417a;

    public gj1(ja1 ja1Var) {
        this.f6417a = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f6417a != ja1.N;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gj1) && ((gj1) obj).f6417a == this.f6417a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(gj1.class, this.f6417a);
    }

    public final String toString() {
        String str = this.f6417a.f7390v;
        return p.a.o(new StringBuilder(str.length() + 30), "Ed25519 Parameters (variant: ", str, ")");
    }
}
