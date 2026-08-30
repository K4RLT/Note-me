package com.google.android.gms.internal.ads;
import g3.a;

/* loaded from: classes.dex */
public final class q21 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9720a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9721b;

    public q21(String str, String str2) {
        this.f9720a = str;
        this.f9721b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q21) {
            q21 q21Var = (q21) obj;
            String str = q21Var.f9720a;
            String str2 = this.f9720a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = q21Var.f9721b;
                String str4 = this.f9721b;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f9720a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.f9721b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f9720a;
        int length = String.valueOf(str).length();
        String str2 = this.f9721b;
        StringBuilder sb2 = new StringBuilder(length + 49 + String.valueOf(str2).length() + 1);
        a.t(sb2, "OverlayDisplayUpdateRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
