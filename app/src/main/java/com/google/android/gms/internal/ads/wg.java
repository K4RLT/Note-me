package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class wg implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final dg f12232a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12233b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12234c;

    /* renamed from: d, reason: collision with root package name */
    public final wd f12235d;
    public Method e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12236f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12237g;

    public wg(dg dgVar, String str, String str2, wd wdVar, int i, int i10) {
        this.f12232a = dgVar;
        this.f12233b = str;
        this.f12234c = str2;
        this.f12235d = wdVar;
        this.f12236f = i;
        this.f12237g = i10;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            dg dgVar = this.f12232a;
            Method d2 = dgVar.d(this.f12233b, this.f12234c);
            this.e = d2;
            if (d2 != null) {
                a();
                kf kfVar = dgVar.f5426k;
                if (kfVar != null && (i = this.f12236f) != Integer.MIN_VALUE) {
                    kfVar.a(this.f12237g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
