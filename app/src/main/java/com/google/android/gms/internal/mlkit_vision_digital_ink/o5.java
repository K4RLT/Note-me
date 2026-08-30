package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class o5 extends h6 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14734d = 0;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f14735c = new AtomicLong(-1);

    static {
        new l5(1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h6
    public final void a() {
        AtomicLong atomicLong = this.f14735c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
