package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class vg {

    /* renamed from: a, reason: collision with root package name */
    public final dg f11898a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11899b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11900c;
    public final Class[] e;

    /* renamed from: d, reason: collision with root package name */
    public volatile Method f11901d = null;

    /* renamed from: f, reason: collision with root package name */
    public final CountDownLatch f11902f = new CountDownLatch(1);

    public vg(dg dgVar, String str, String str2, Class... clsArr) {
        this.f11898a = dgVar;
        this.f11899b = str;
        this.f11900c = str2;
        this.e = clsArr;
        dgVar.f5419b.submit(new f(7, this));
    }
}
