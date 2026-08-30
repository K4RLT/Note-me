package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class tb extends ByteArrayOutputStream {

    /* renamed from: u, reason: collision with root package name */
    public final nb f11303u;

    public tb(nb nbVar, int i) {
        this.f11303u = nbVar;
        ((ByteArrayOutputStream) this).buf = nbVar.f(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f11303u.m(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void f(int i) {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i11 = i10 + i;
        nb nbVar = this.f11303u;
        byte[] f10 = nbVar.f(i11 + i11);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, f10, 0, ((ByteArrayOutputStream) this).count);
        nbVar.m(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = f10;
    }

    public final void finalize() {
        this.f11303u.m(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        f(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i10) {
        f(i10);
        super.write(bArr, i, i10);
    }
}
