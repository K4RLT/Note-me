package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.app.blob.BlobStoreManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class o extends ParcelFileDescriptor.AutoCloseOutputStream {

    /* renamed from: u, reason: collision with root package name */
    public final BlobStoreManager.Session f14728u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14729v;

    public o(ParcelFileDescriptor parcelFileDescriptor, BlobStoreManager.Session session) {
        super(parcelFileDescriptor);
        this.f14729v = false;
        this.f14728u = session;
    }

    @Override // android.os.ParcelFileDescriptor.AutoCloseOutputStream, java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.n] */
    public final void f() {
        int i;
        Throwable th = null;
        if (!this.f14729v) {
            this.f14729v = true;
            try {
                final CompletableFuture completableFuture = new CompletableFuture();
                this.f14728u.commit(ia.f14473u, new Consumer() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.n
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        completableFuture.complete((Integer) obj);
                    }
                });
                i = ((Integer) completableFuture.get()).intValue();
            } catch (InterruptedException | RuntimeException | ExecutionException e) {
                th = e;
                i = -1;
            }
        } else {
            i = 0;
        }
        BlobStoreManager.Session session = this.f14728u;
        if (i == 0) {
            if (session != null) {
                session.close();
            }
        } else {
            try {
                throw new IOException("Commit operation failed", th);
            } catch (Throwable th2) {
                if (session != null) {
                    try {
                        session.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
