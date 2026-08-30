package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class fz implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ mz D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f6218u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f6219v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6220w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6221x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f6222y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f6223z;

    public fz(mz mzVar, String str, String str2, int i, int i10, long j10, long j11, boolean z3, int i11, int i12) {
        this.f6218u = str;
        this.f6219v = str2;
        this.f6220w = i;
        this.f6221x = i10;
        this.f6222y = j10;
        this.f6223z = j11;
        this.A = z3;
        this.B = i11;
        this.C = i12;
        this.D = mzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f6218u);
        hashMap.put("cachedSrc", this.f6219v);
        hashMap.put("bytesLoaded", Integer.toString(this.f6220w));
        hashMap.put("totalBytes", Integer.toString(this.f6221x));
        hashMap.put("bufferedDuration", Long.toString(this.f6222y));
        hashMap.put("totalDuration", Long.toString(this.f6223z));
        if (true != this.A) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.B));
        hashMap.put("playerPreparedCount", Integer.toString(this.C));
        this.D.n(hashMap);
    }
}
