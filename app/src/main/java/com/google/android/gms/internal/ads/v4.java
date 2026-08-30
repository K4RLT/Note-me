package com.google.android.gms.internal.ads;
import g3.a;
import p.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v4 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f11794b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11795c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11796d;

    public v4(String str, String str2, String str3) {
        super("COMM");
        this.f11794b = str;
        this.f11795c = str2;
        this.f11796d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && v4.class == obj.getClass()) {
                v4 v4Var = (v4) obj;
                if (this.f11795c.equals(v4Var.f11795c) && this.f11794b.equals(v4Var.f11794b) && Objects.equals(this.f11796d, v4Var.f11796d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f11795c.hashCode() + ((this.f11794b.hashCode() + 527) * 31);
        String str = this.f11796d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f12467a;
        int length = str.length();
        String str2 = this.f11796d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f11794b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.f11795c;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 7 + length2);
        a.t(sb2, str, ": language=", str3, ", description=");
        return a.o(sb2, str4, ", text=", str2);
    }
}
