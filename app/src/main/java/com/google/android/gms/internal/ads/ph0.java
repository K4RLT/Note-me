package com.google.android.gms.internal.ads;

import android.app.Activity;

/* loaded from: classes.dex */
public final class ph0 {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f9521a;

    /* renamed from: b, reason: collision with root package name */
    public final j9.d f9522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9523c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9524d;

    public ph0(Activity activity, j9.d dVar, String str, String str2) {
        this.f9521a = activity;
        this.f9522b = dVar;
        this.f9523c = str;
        this.f9524d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ph0) {
            ph0 ph0Var = (ph0) obj;
            if (this.f9521a.equals(ph0Var.f9521a)) {
                j9.d dVar = ph0Var.f9522b;
                j9.d dVar2 = this.f9522b;
                if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
                    String str = ph0Var.f9523c;
                    String str2 = this.f9523c;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        String str3 = ph0Var.f9524d;
                        String str4 = this.f9524d;
                        if (str4 != null ? str4.equals(str3) : str3 == null) {
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
        int hashCode2;
        int hashCode3 = this.f9521a.hashCode() ^ 1000003;
        int i = 0;
        j9.d dVar = this.f9522b;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        int i10 = ((hashCode3 * 1000003) ^ hashCode) * 1000003;
        String str = this.f9523c;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str2 = this.f9524d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i11 ^ i;
    }

    public final String toString() {
        String obj = this.f9521a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f9522b);
        int length2 = valueOf.length();
        String str = this.f9523c;
        int length3 = String.valueOf(str).length();
        String str2 = this.f9524d;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        g3.a.t(sb2, "OfflineUtilsParams{activity=", obj, ", adOverlay=", valueOf);
        g3.a.t(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }
}
