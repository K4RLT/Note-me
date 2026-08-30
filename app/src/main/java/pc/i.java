package pc;

import g5.q;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class i extends InputStream {

    /* renamed from: u, reason: collision with root package name */
    public int f22663u;

    /* renamed from: v, reason: collision with root package name */
    public int f22664v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f22665w;

    public i(k kVar, h hVar) {
        this.f22665w = kVar;
        this.f22663u = kVar.H(hVar.f22661a + 4);
        this.f22664v = hVar.f22662b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        if (bArr != null) {
            if ((i | i10) >= 0 && i10 <= bArr.length - i) {
                int i11 = this.f22664v;
                if (i11 > 0) {
                    if (i10 > i11) {
                        i10 = i11;
                    }
                    int i12 = this.f22663u;
                    k kVar = this.f22665w;
                    kVar.w(i12, i, i10, bArr);
                    this.f22663u = kVar.H(this.f22663u + i10);
                    this.f22664v -= i10;
                    return i10;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        q.h("buffer");
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        k kVar = this.f22665w;
        RandomAccessFile randomAccessFile = kVar.f22666u;
        if (this.f22664v == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f22663u);
        int read = randomAccessFile.read();
        this.f22663u = kVar.H(this.f22663u + 1);
        this.f22664v--;
        return read;
    }
}
