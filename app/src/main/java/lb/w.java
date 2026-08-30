package lb;

import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class w extends InputStream {

    /* renamed from: u, reason: collision with root package name */
    public final FileInputStream f20292u;

    /* renamed from: v, reason: collision with root package name */
    public long f20293v;

    public w(FileInputStream fileInputStream, long j10) {
        this.f20292u = fileInputStream;
        this.f20293v = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f20292u.close();
        this.f20293v = 0L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        long j10 = this.f20293v;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f20292u.read(bArr, i, (int) Math.min(i10, j10));
        if (read != -1) {
            this.f20293v -= read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j10 = this.f20293v;
        if (j10 <= 0) {
            return -1;
        }
        this.f20293v = j10 - 1;
        return this.f20292u.read();
    }
}
