package com.google.android.gms.internal.ads;
import g3.a;

/* loaded from: classes.dex */
public final class m21 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8211a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8212b;

    public m21(String str, String str2) {
        this.f8211a = str;
        this.f8212b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m21) {
            m21 m21Var = (m21) obj;
            String str = m21Var.f8211a;
            String str2 = this.f8211a;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = m21Var.f8212b;
                String str4 = this.f8212b;
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
        String str = this.f8211a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.f8212b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str = this.f8211a;
        int length = String.valueOf(str).length();
        String str2 = this.f8212b;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        g3.a.t(sb2, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
