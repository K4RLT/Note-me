package com.google.android.gms.internal.ads;
import g3.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ox1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9262b;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public ox1(String str, String str2) {
        this.f9261a = bq0.q(str);
        this.f9262b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ox1.class == obj.getClass()) {
            ox1 ox1Var = (ox1) obj;
            if (Objects.equals(this.f9261a, ox1Var.f9261a) && Objects.equals(this.f9262b, ox1Var.f9262b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f9262b.hashCode() * 31;
        String str = this.f9261a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.f9261a;
        int length = String.valueOf(str).length();
        String str2 = this.f9262b;
        StringBuilder sb2 = new StringBuilder(length + 10 + String.valueOf(str2).length() + 3);
        a.t(sb2, "{ lang=", str, ", '", str2);
        sb2.append("' }");
        return sb2.toString();
    }
}
