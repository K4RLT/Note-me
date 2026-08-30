package com.google.android.gms.internal.ads;
import a5.a;
import q.x;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ie1 extends qe1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f7116a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7117b;

    /* renamed from: c, reason: collision with root package name */
    public final x91 f7118c;

    public ie1(int i, int i10, x91 x91Var) {
        this.f7116a = i;
        this.f7117b = i10;
        this.f7118c = x91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f7118c != x91.f12520u;
    }

    public final int b() {
        x91 x91Var = x91.f12520u;
        int i = this.f7117b;
        x91 x91Var2 = this.f7118c;
        if (x91Var2 == x91Var) {
            return i;
        }
        if (x91Var2 == x91.f12517r || x91Var2 == x91.f12518s || x91Var2 == x91.f12519t) {
            return i + 5;
        }
        x.o("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ie1) {
            ie1 ie1Var = (ie1) obj;
            if (ie1Var.f7116a == this.f7116a && ie1Var.b() == b() && ie1Var.f7118c == this.f7118c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ie1.class, Integer.valueOf(this.f7116a), Integer.valueOf(this.f7117b), this.f7118c);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7118c);
        int length = valueOf.length();
        int i = this.f7117b;
        int length2 = String.valueOf(i).length();
        int i10 = this.f7116a;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i10).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(valueOf);
        sb2.append(", ");
        sb2.append(i);
        return a.j(sb2, "-byte tags, and ", i10, "-byte key)");
    }
}
