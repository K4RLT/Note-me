package com.google.android.gms.internal.ads;
import p.a;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class tl {

    /* renamed from: b, reason: collision with root package name */
    public static final tl f11370b = new tl(0);

    /* renamed from: c, reason: collision with root package name */
    public static final tl f11371c = new tl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final tl f11372d = new tl(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11373a;

    public /* synthetic */ tl(int i) {
        this.f11373a = i;
    }

    public static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i10 = 0;
        while (i10 < str.length() && str.charAt(i10) == ',') {
            i10++;
        }
        while (length > 0) {
            int i11 = length - 1;
            if (str.charAt(i11) != ',') {
                break;
            }
            length = i11;
        }
        if (length < i10) {
            return null;
        }
        if (i10 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i = i10;
        }
        return str.substring(i, length);
    }

    public final String a(String str, String str2) {
        switch (this.f11373a) {
            case 0:
                return str2;
            case 1:
                if (str == null) {
                    return str2;
                }
                return str;
            default:
                String b10 = b(str);
                String b11 = b(str2);
                if (TextUtils.isEmpty(b10)) {
                    return b11;
                }
                if (!TextUtils.isEmpty(b11)) {
                    return a.o(new StringBuilder(String.valueOf(b10).length() + 1 + String.valueOf(b11).length()), b10, ",", b11);
                }
                return b10;
        }
    }
}
