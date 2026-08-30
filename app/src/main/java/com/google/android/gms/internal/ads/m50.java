package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m50 {

    /* renamed from: a, reason: collision with root package name */
    public static final n41 f8250a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.n41] */
    static {
        b51 b51Var = d51.f5314v;
        new m50(y51.f12781y);
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public m50(y51 y51Var) {
        b51 b51Var = d51.f5314v;
        Object[] array = (y51Var == null ? ed1.i(y51Var.listIterator(0)) : y51Var).toArray();
        int length = array.length;
        ct.h(array, length);
        Arrays.sort(array, f8250a);
        d51.w(array, length);
    }
}
