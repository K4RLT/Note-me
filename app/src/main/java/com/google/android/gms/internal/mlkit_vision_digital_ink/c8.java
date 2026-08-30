package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class c8 implements Closeable {

    /* renamed from: v, reason: collision with root package name */
    public static final a7.k f14151v = new a7.k(16);

    /* renamed from: u, reason: collision with root package name */
    public int f14152u;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f14152u;
        if (i > 0) {
            this.f14152u = i - 1;
        } else {
            g5.q.f("Mismatched calls to RecursionDepth (possible error in core library)");
        }
    }
}
