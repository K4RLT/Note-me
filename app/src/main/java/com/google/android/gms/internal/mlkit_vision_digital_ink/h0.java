package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class h0 implements h {

    /* renamed from: u, reason: collision with root package name */
    public boolean f14388u;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.h
    public final Object d(g gVar) {
        if (this.f14388u) {
            if (gVar.f14347c.isEmpty()) {
                return gVar.f14346b.c(gVar.f14349f);
            }
            throw new IOException("Short circuit would skip transforms.");
        }
        Closeable d2 = i0.a().d(gVar);
        try {
            if (d2 instanceof v) {
                File zza = ((v) d2).zza();
                if (d2 != null) {
                    d2.close();
                }
                return zza;
            }
            throw new IOException("Not convertible and fallback to pipe is disabled.");
        } catch (Throwable th) {
            if (d2 != null) {
                try {
                    d2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
