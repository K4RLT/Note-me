package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f15553b;

    /* renamed from: c, reason: collision with root package name */
    public static final y0 f15554c;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f15555a;

    static {
        if (b4.f15384x) {
            f15554c = null;
            f15553b = null;
        } else {
            f15554c = new y0(null);
            f15553b = new y0(null);
        }
    }

    public y0(CancellationException cancellationException) {
        this.f15555a = cancellationException;
    }
}
