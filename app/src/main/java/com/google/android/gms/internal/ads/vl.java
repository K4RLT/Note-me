package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vl {

    /* renamed from: a, reason: collision with root package name */
    public final String f11932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11933b;

    public vl(String str) {
        boolean z3;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f11932a = str;
            this.f11933b = null;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public String a(String str) {
        String str2 = this.f11933b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    public vl(String str, String str2) {
        this.f11932a = str;
        this.f11933b = str2;
    }
}
