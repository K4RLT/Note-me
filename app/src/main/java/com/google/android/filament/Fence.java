package com.google.android.filament;
import d.b;

import q.x;

/* loaded from: classes.dex */
public class Fence {

    /* renamed from: a, reason: collision with root package name */
    public long f4218a;

    private static native int nWait(long j10, int i, long j11);

    public final void a() {
        long j10 = this.f4218a;
        if (j10 != 0) {
            nWait(j10, q0.b(1), -1L);
        } else {
            x.o("Calling method on destroyed Fence");
        }
    }
}
