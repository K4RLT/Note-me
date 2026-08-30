package com.google.android.gms.internal.ads;
import g3.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bb1 extends da1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4757a;

    /* renamed from: b, reason: collision with root package name */
    public final w91 f4758b;

    public bb1(String str, w91 w91Var) {
        this.f4757a = str;
        this.f4758b = w91Var;
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return this.f4758b != w91.f12185l;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bb1) {
            bb1 bb1Var = (bb1) obj;
            if (bb1Var.f4757a.equals(this.f4757a) && bb1Var.f4758b.equals(this.f4758b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(bb1.class, this.f4757a, this.f4758b);
    }

    public final String toString() {
        String str = this.f4758b.f12196b;
        String str2 = this.f4757a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        g3.a.t(sb2, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb2.append(")");
        return sb2.toString();
    }
}
