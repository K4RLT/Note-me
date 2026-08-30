package cd;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4083u;

    /* renamed from: v, reason: collision with root package name */
    public long f4084v;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) {
        int i11;
        int length;
        int i12;
        int length2;
        int i13;
        switch (this.f4083u) {
            case 0:
                if (i >= 0 && i <= bArr.length && i10 >= 0 && (i11 = i + i10) <= bArr.length && i11 >= 0) {
                    this.f4084v += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (i >= 0 && i <= (length = bArr.length) && i10 >= 0 && (i12 = i + i10) <= length && i12 >= 0) {
                    this.f4084v += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
            default:
                if (i >= 0 && i <= (length2 = bArr.length) && i10 >= 0 && (i13 = i + i10) <= length2 && i13 >= 0) {
                    this.f4084v += i10;
                    return;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.f4083u) {
            case 0:
                this.f4084v += bArr.length;
                return;
            case 1:
                this.f4084v += bArr.length;
                return;
            default:
                this.f4084v += bArr.length;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.f4083u) {
            case 0:
                this.f4084v++;
                return;
            case 1:
                this.f4084v++;
                return;
            default:
                this.f4084v++;
                return;
        }
    }
}
