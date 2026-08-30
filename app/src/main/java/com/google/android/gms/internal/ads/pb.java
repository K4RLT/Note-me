package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class pb extends FilterInputStream {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9452u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f9453v;

    /* renamed from: w, reason: collision with root package name */
    public long f9454w;

    public pb(InputStream inputStream, long j10) {
        super(inputStream);
        boolean z3;
        this.f9454w = -1L;
        inputStream.getClass();
        if (j10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.w("limit must be non-negative", z3);
        this.f9453v = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        long min;
        switch (this.f9452u) {
            case 1:
                min = Math.min(((FilterInputStream) this).in.available(), this.f9453v);
                break;
            case 2:
                min = Math.min(((FilterInputStream) this).in.available(), this.f9453v);
                break;
            default:
                return super.available();
        }
        return (int) min;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f9452u) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f9454w = this.f9453v;
                }
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f9454w = this.f9453v;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        switch (this.f9452u) {
            case 0:
                int read = super.read(bArr, i, i10);
                if (read != -1) {
                    this.f9454w += read;
                }
                return read;
            case 1:
                long j10 = this.f9453v;
                if (j10 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j10));
                if (read2 != -1) {
                    this.f9453v -= read2;
                }
                return read2;
            default:
                long j11 = this.f9453v;
                if (j11 == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j11));
                if (read3 != -1) {
                    this.f9453v -= read3;
                }
                return read3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.f9452u) {
            case 1:
                synchronized (this) {
                    if (((FilterInputStream) this).in.markSupported()) {
                        if (this.f9454w != -1) {
                            ((FilterInputStream) this).in.reset();
                            this.f9453v = this.f9454w;
                        } else {
                            throw new IOException("Mark not set");
                        }
                    } else {
                        throw new IOException("Mark not supported");
                    }
                }
                return;
            case 2:
                synchronized (this) {
                    if (((FilterInputStream) this).in.markSupported()) {
                        if (this.f9454w != -1) {
                            ((FilterInputStream) this).in.reset();
                            this.f9453v = this.f9454w;
                        } else {
                            throw new IOException("Mark not set");
                        }
                    } else {
                        throw new IOException("Mark not supported");
                    }
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        switch (this.f9452u) {
            case 1:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f9453v));
                this.f9453v -= skip;
                return skip;
            case 2:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j10, this.f9453v));
                this.f9453v -= skip2;
                return skip2;
            default:
                return super.skip(j10);
        }
    }

    public pb(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f9453v = j10;
    }

    public pb(InputStream inputStream) {
        super(inputStream);
        this.f9454w = -1L;
        this.f9453v = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f9452u) {
            case 0:
                int read = super.read();
                if (read != -1) {
                    this.f9454w++;
                }
                return read;
            case 1:
                if (this.f9453v == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f9453v--;
                }
                return read2;
            default:
                if (this.f9453v == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 != -1) {
                    this.f9453v--;
                }
                return read3;
        }
    }
}
