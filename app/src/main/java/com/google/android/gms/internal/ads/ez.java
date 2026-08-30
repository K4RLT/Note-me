package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import r.e;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ez implements Runnable {
    public final /* synthetic */ long A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ jz E;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f5865u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f5866v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f5867w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f5868x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f5869y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f5870z;

    public ez(jz jzVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z3, int i, int i10) {
        this.f5865u = str;
        this.f5866v = str2;
        this.f5867w = j10;
        this.f5868x = j11;
        this.f5869y = j12;
        this.f5870z = j13;
        this.A = j14;
        this.B = z3;
        this.C = i;
        this.D = i10;
        this.E = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f5865u);
        hashMap.put("cachedSrc", this.f5866v);
        hashMap.put("bufferedDuration", Long.toString(this.f5867w));
        hashMap.put("totalDuration", Long.toString(this.f5868x));
        if (((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f5869y));
            hashMap.put("qoeCachedBytes", Long.toString(this.f5870z));
            hashMap.put("totalBytes", Long.toString(this.A));
            f9.k.C.f16819k.getClass();
            hashMap.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        if (true != this.B) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.C));
        hashMap.put("playerPreparedCount", Integer.toString(this.D));
        this.E.n(hashMap);
    }
}
