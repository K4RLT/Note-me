package y3;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class m extends OutputStream {

    /* renamed from: u, reason: collision with root package name */
    public final FileOutputStream f30838u;

    public m(FileOutputStream fileOutputStream) {
        this.f30838u = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f30838u.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        this.f30838u.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f30838u.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        bArr.getClass();
        this.f30838u.write(bArr, i, i10);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
