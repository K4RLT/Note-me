package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final String f4428a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4429b;

    public ab(String str, String str2) {
        this.f4428a = str;
        this.f4429b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ab.class == obj.getClass()) {
            ab abVar = (ab) obj;
            if (TextUtils.equals(this.f4428a, abVar.f4428a) && TextUtils.equals(this.f4429b, abVar.f4429b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4429b.hashCode() + (this.f4428a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.f4428a;
        int length = String.valueOf(str).length();
        String str2 = this.f4429b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        g3.a.t(sb2, "Header[name=", str, ",value=", str2);
        sb2.append("]");
        return sb2.toString();
    }
}
