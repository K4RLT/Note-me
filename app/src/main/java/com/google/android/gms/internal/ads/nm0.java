package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class nm0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f8764a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f8765b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public final la.a f8766c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f8767d;
    public final qn0 e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8768f;

    /* renamed from: g, reason: collision with root package name */
    public final be0 f8769g;

    public nm0(qn0 qn0Var, long j10, la.a aVar, wx wxVar, be0 be0Var) {
        this.f8766c = aVar;
        this.e = qn0Var;
        this.f8768f = j10;
        this.f8767d = wxVar;
        this.f8769g = be0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if (r3 < android.os.SystemClock.elapsedRealtime()) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.qn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ac.b zza() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nm0.zza():ac.b");
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return this.e.zzb();
    }
}
