package com.google.android.gms.internal.ads;
import a5.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class w5 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f12136a;

    /* renamed from: b, reason: collision with root package name */
    public final v5 f12137b;

    /* renamed from: c, reason: collision with root package name */
    public final v5 f12138c;

    public w5(float f10, v5 v5Var, v5 v5Var2) {
        this.f12136a = f10;
        this.f12137b = v5Var;
        this.f12138c = v5Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        if (Float.compare(this.f12136a, w5Var.f12136a) != 0 || !Objects.equals(this.f12137b, w5Var.f12137b) || !Objects.equals(this.f12138c, w5Var.f12138c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Float.hashCode(this.f12136a) * 31;
        int i10 = 0;
        v5 v5Var = this.f12137b;
        if (v5Var != null) {
            i = v5Var.hashCode();
        } else {
            i = 0;
        }
        int i11 = (hashCode + i) * 31;
        v5 v5Var2 = this.f12138c;
        if (v5Var2 != null) {
            i10 = v5Var2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12137b);
        String valueOf2 = String.valueOf(this.f12138c);
        float f10 = this.f12136a;
        int length = String.valueOf(f10).length();
        StringBuilder sb2 = new StringBuilder(length + 37 + valueOf.length() + 10 + valueOf2.length());
        sb2.append("ReplayGain Xing/Info: peak=");
        sb2.append(f10);
        sb2.append(", field 1=");
        sb2.append(valueOf);
        return a5.a.k(sb2, ", field 2=", valueOf2);
    }
}
