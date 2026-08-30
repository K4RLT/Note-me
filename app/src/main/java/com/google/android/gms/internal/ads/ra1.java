package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ra1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10188a;

    /* renamed from: b, reason: collision with root package name */
    public final x91 f10189b;

    public ra1(int i, x91 x91Var) {
        this.f10188a = i;
        this.f10189b = x91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f10189b != x91.f12510k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ra1) {
            ra1 ra1Var = (ra1) obj;
            if (ra1Var.f10188a == this.f10188a && ra1Var.f10189b == this.f10189b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ra1.class, Integer.valueOf(this.f10188a), 12, 16, this.f10189b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10189b);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.f10188a;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
