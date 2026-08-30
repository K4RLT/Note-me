package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class dz implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f5555u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f5556v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f5557w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5558x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kz f5559y;

    public dz(kz kzVar, String str, String str2, int i, int i10) {
        this.f5555u = str;
        this.f5556v = str2;
        this.f5557w = i;
        this.f5558x = i10;
        this.f5559y = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f5555u);
        hashMap.put("cachedSrc", this.f5556v);
        hashMap.put("bytesLoaded", Integer.toString(this.f5557w));
        hashMap.put("totalBytes", Integer.toString(this.f5558x));
        hashMap.put("cacheReady", "0");
        this.f5559y.n(hashMap);
    }
}
