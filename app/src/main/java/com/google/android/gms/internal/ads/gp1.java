package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class gp1 extends co1 {

    /* renamed from: w, reason: collision with root package name */
    public final int f6442w;

    public gp1(int i, pg1 pg1Var) {
        super(a5.a.f(i, "Response code: ", new StringBuilder(String.valueOf(i).length() + 15)), pg1Var, AdError.INTERNAL_ERROR_2004, 1);
        this.f6442w = i;
    }
}
