package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class p21 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9332a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9334c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f9335d;

    public p21(int i, String str, int i10, Boolean bool) {
        this.f9332a = i;
        this.f9333b = str;
        this.f9334c = i10;
        this.f9335d = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p21) {
            p21 p21Var = (p21) obj;
            if (this.f9332a == p21Var.f9332a) {
                String str = p21Var.f9333b;
                String str2 = this.f9333b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f9334c == p21Var.f9334c) {
                        Boolean bool = p21Var.f9335d;
                        Boolean bool2 = this.f9335d;
                        if (bool2 != null ? bool2.equals(bool) : bool == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f9333b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        Boolean bool = this.f9335d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i ^ ((((hashCode ^ ((this.f9332a ^ 1000003) * 1000003)) * 1000003) ^ this.f9334c) * 1000003);
    }

    public final String toString() {
        int i = this.f9332a;
        int length = String.valueOf(i).length();
        String str = this.f9333b;
        int length2 = String.valueOf(str).length();
        int i10 = this.f9334c;
        int length3 = String.valueOf(i10).length();
        Boolean bool = this.f9335d;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + length3 + 17 + String.valueOf(bool).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i10);
        sb2.append(", userInteracted=");
        sb2.append(bool);
        sb2.append("}");
        return sb2.toString();
    }
}
