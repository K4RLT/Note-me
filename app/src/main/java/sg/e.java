package sg;

import java.io.InputStream;
import okio.BufferedSource;
import q.x;
import ya.bc;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25270u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f25271v;

    public /* synthetic */ e(BufferedSource bufferedSource, int i) {
        this.f25270u = i;
        this.f25271v = bufferedSource;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f25270u) {
            case 0:
                return (int) Math.min(((f) this.f25271v).f25274v, Integer.MAX_VALUE);
            default:
                n nVar = (n) this.f25271v;
                if (!nVar.f25295u) {
                    return (int) Math.min(nVar.f25296v.f25274v, Integer.MAX_VALUE);
                }
                x.p("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f25270u) {
            case 0:
                return;
            default:
                ((n) this.f25271v).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f25270u) {
            case 0:
                f fVar = (f) this.f25271v;
                if (fVar.f25274v > 0) {
                    return fVar.readByte() & 255;
                }
                return -1;
            default:
                n nVar = (n) this.f25271v;
                f fVar2 = nVar.f25296v;
                if (!nVar.f25295u) {
                    if (fVar2.f25274v == 0 && nVar.f25297w.q(fVar2, 8192) == -1) {
                        return -1;
                    }
                    return fVar2.readByte() & 255;
                }
                x.p("closed");
                return 0;
        }
    }

    public final String toString() {
        switch (this.f25270u) {
            case 0:
                return ((f) this.f25271v) + ".inputStream()";
            default:
                return ((n) this.f25271v) + ".inputStream()";
        }
    }

    private final void f() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        int i11 = this.f25270u;
        bArr.getClass();
        switch (i11) {
            case 0:
                return ((f) this.f25271v).read(bArr, i, i10);
            default:
                n nVar = (n) this.f25271v;
                f fVar = nVar.f25296v;
                if (!nVar.f25295u) {
                    bc.a(bArr.length, i, i10);
                    if (fVar.f25274v == 0 && nVar.f25297w.q(fVar, 8192) == -1) {
                        return -1;
                    }
                    return fVar.read(bArr, i, i10);
                }
                x.p("closed");
                return 0;
        }
    }
}
