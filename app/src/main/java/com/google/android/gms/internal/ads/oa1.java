package com.google.android.gms.internal.ads;
import a5.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class oa1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9068a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9069b;

    /* renamed from: c, reason: collision with root package name */
    public final w91 f9070c;

    public oa1(int i, int i10, w91 w91Var) {
        this.f9068a = i;
        this.f9069b = i10;
        this.f9070c = w91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f9070c != w91.f12183j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oa1) {
            oa1 oa1Var = (oa1) obj;
            if (oa1Var.f9068a == this.f9068a && oa1Var.f9069b == this.f9069b && oa1Var.f9070c == this.f9070c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(oa1.class, Integer.valueOf(this.f9068a), Integer.valueOf(this.f9069b), 16, this.f9070c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9070c);
        int length = valueOf.length();
        int i = this.f9069b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.f9068a;
        StringBuilder sb2 = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i10).length() + 10);
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(i);
        return a5.a.j(sb2, "-byte IV, 16-byte tag, and ", i10, "-byte key)");
    }
}
