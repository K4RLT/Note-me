package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class t50 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11253a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f11254b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f11255c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f11256d;
    public static final String e;

    static {
        String str = bq0.f4860a;
        f11253a = Integer.toString(0, 36);
        f11254b = Integer.toString(1, 36);
        f11255c = Integer.toString(2, 36);
        f11256d = Integer.toString(3, 36);
        e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f11253a, spanned.getSpanStart(obj));
        bundle2.putInt(f11254b, spanned.getSpanEnd(obj));
        bundle2.putInt(f11255c, spanned.getSpanFlags(obj));
        bundle2.putInt(f11256d, i);
        if (bundle != null) {
            bundle2.putBundle(e, bundle);
        }
        return bundle2;
    }
}
