package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class c60 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f5014a;

    public c60(wp0 wp0Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.f5014a = atomicLong;
        atomicLong.set(((aq0) wp0Var.f12312a.f4819v).f4596u.get());
    }

    public final void a(long j10) {
        this.f5014a.set(j10);
    }
}
