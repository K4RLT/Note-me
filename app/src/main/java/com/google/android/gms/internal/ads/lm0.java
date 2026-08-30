package com.google.android.gms.internal.ads;
import ac.b;
import la.a;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class lm0 {

    /* renamed from: a, reason: collision with root package name */
    public final ac.b f8063a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8064b;

    /* renamed from: c, reason: collision with root package name */
    public final la.a f8065c;

    public lm0(ac.b bVar, long j10, la.a aVar) {
        this.f8063a = bVar;
        this.f8065c = aVar;
        aVar.getClass();
        this.f8064b = SystemClock.elapsedRealtime() + j10;
    }
}
