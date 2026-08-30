package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kb1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final q91 f7711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7712b;

    public kb1(q91 q91Var, int i) {
        this.f7711a = q91Var;
        this.f7712b = i;
    }

    public static kb1 b(q91 q91Var, int i) {
        if (i >= 8 && i <= 12) {
            return new kb1(q91Var, i);
        }
        androidx.datastore.preferences.protobuf.s1.q("Salt size must be between 8 and 12 bytes");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f7711a != q91.G;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kb1) {
            kb1 kb1Var = (kb1) obj;
            if (kb1Var.f7711a == this.f7711a && kb1Var.f7712b == this.f7712b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(kb1.class, this.f7711a, Integer.valueOf(this.f7712b));
    }

    public final String toString() {
        String str = this.f7711a.f9792v;
        int length = str.length();
        int i = this.f7712b;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(str);
        sb2.append("salt_size_bytes: ");
        sb2.append(i);
        sb2.append(")");
        return sb2.toString();
    }
}
