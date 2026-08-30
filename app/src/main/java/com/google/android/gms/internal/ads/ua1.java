package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ua1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11595a;

    /* renamed from: b, reason: collision with root package name */
    public final ja1 f11596b;

    public ua1(int i, ja1 ja1Var) {
        this.f11595a = i;
        this.f11596b = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f11596b != ja1.D;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ua1) {
            ua1 ua1Var = (ua1) obj;
            if (ua1Var.f11595a == this.f11595a && ua1Var.f11596b == this.f11596b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ua1.class, Integer.valueOf(this.f11595a), this.f11596b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11596b);
        int length = valueOf.length();
        int i = this.f11595a;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(i);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
