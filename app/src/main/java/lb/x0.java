package lb;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

/* loaded from: classes.dex */
public final class x0 extends InputStream {

    /* renamed from: u, reason: collision with root package name */
    public final Enumeration f20302u;

    /* renamed from: v, reason: collision with root package name */
    public FileInputStream f20303v;

    public x0(Enumeration enumeration) {
        this.f20302u = enumeration;
        f();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        FileInputStream fileInputStream = this.f20303v;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f20303v = null;
        }
    }

    public final void f() {
        FileInputStream fileInputStream = this.f20303v;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Enumeration enumeration = this.f20302u;
        if (enumeration.hasMoreElements()) {
            this.f20303v = new FileInputStream((File) enumeration.nextElement());
        } else {
            this.f20303v = null;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        if (this.f20303v != null) {
            bArr.getClass();
            if (i >= 0 && i10 >= 0 && i10 <= bArr.length - i) {
                if (i10 == 0) {
                    return 0;
                }
                do {
                    int read = this.f20303v.read(bArr, i, i10);
                    if (read > 0) {
                        return read;
                    }
                    f();
                } while (this.f20303v != null);
                return -1;
            }
            throw new IndexOutOfBoundsException();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read() {
        while (true) {
            FileInputStream fileInputStream = this.f20303v;
            if (fileInputStream == null) {
                return -1;
            }
            int read = fileInputStream.read();
            if (read != -1) {
                return read;
            }
            f();
        }
    }
}
