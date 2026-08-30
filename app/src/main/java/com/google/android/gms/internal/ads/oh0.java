package com.google.android.gms.internal.ads;
import p.a;
import g3.a;
import g5.q;
import q.h;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class oh0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9123b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f9124c;

    public oh0(String str, String str2, Drawable drawable) {
        this.f9122a = str;
        if (str2 != null) {
            this.f9123b = str2;
            this.f9124c = drawable;
        } else {
            g5.q.h("Null imageUrl");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oh0) {
            oh0 oh0Var = (oh0) obj;
            String str = oh0Var.f9122a;
            String str2 = this.f9122a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f9123b.equals(oh0Var.f9123b)) {
                    Drawable drawable = oh0Var.f9124c;
                    Drawable drawable2 = this.f9124c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f9122a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = ((hashCode ^ 1000003) * 1000003) ^ this.f9123b.hashCode();
        Drawable drawable = this.f9124c;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return i ^ (hashCode2 * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9124c);
        String str = this.f9122a;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.f9123b;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        g3.a.t(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return p.a.o(sb2, ", icon=", valueOf, "}");
    }
}
