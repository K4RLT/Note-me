package com.google.android.gms.internal.ads;
import g3.a;

import android.os.IBinder;

/* loaded from: classes.dex */
public final class o21 {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8927b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8928c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8929d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8930f;

    public o21(IBinder iBinder, String str, int i, float f10, int i10, String str2) {
        this.f8926a = iBinder;
        this.f8927b = str;
        this.f8928c = i;
        this.f8929d = f10;
        this.e = i10;
        this.f8930f = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o21) {
            o21 o21Var = (o21) obj;
            if (this.f8926a.equals(o21Var.f8926a)) {
                String str = o21Var.f8927b;
                String str2 = this.f8927b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f8928c == o21Var.f8928c && Float.floatToIntBits(this.f8929d) == Float.floatToIntBits(o21Var.f8929d) && this.e == o21Var.e) {
                        String str3 = o21Var.f8930f;
                        String str4 = this.f8930f;
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
        int hashCode2 = this.f8926a.hashCode() ^ 1000003;
        int i = 0;
        String str = this.f8927b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.f8928c) * 1000003) ^ Float.floatToIntBits(this.f8929d);
        String str2 = this.f8930f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((floatToIntBits * (-429739981)) ^ this.e) * (-721379959)) ^ i) * 1000003;
    }

    public final String toString() {
        String obj = this.f8926a.toString();
        int length = obj.length();
        String str = this.f8927b;
        int length2 = String.valueOf(str).length();
        int i = this.f8928c;
        int length3 = String.valueOf(i).length();
        float f10 = this.f8929d;
        int length4 = String.valueOf(f10).length();
        int i10 = this.e;
        int length5 = String.valueOf(i10).length();
        String str2 = this.f8930f;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 74 + length5 + 33 + String.valueOf(str2).length() + 30);
        g3.a.t(sb2, "OverlayDisplayShowRequest{windowToken=", obj, ", appId=", str);
        sb2.append(", layoutGravity=");
        sb2.append(i);
        sb2.append(", layoutVerticalMargin=");
        sb2.append(f10);
        sb2.append(", displayMode=0, triggerMode=0, theme=0, sessionToken=null, windowWidthPx=");
        sb2.append(i10);
        sb2.append(", deeplinkUrl=null, adFieldEnifd=");
        sb2.append(str2);
        sb2.append(", thirdPartyAuthCallerId=null}");
        return sb2.toString();
    }
}
