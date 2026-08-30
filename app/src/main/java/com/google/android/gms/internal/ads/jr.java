package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class jr {

    /* renamed from: b, reason: collision with root package name */
    public static final fp f7512b = new fp(7);

    /* renamed from: a, reason: collision with root package name */
    public final dr f7513a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.dr] */
    public jr(Context context, l9.a aVar, String str, vr0 vr0Var) {
        ?? obj = new Object();
        obj.f5484c = new Object();
        obj.f5483b = 1;
        obj.f5482a = str;
        obj.f5485d = context.getApplicationContext();
        obj.e = aVar;
        obj.f5486f = vr0Var;
        this.f7513a = obj;
    }

    public final lr a(String str, hr hrVar, gr grVar) {
        return new lr(this.f7513a, str, hrVar, grVar);
    }
}
