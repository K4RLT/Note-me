package sg;

import java.nio.ByteBuffer;
import q.x;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: u, reason: collision with root package name */
    public final f f25292u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25293v;

    /* renamed from: w, reason: collision with root package name */
    public final r f25294w;

    /* JADX WARN: Type inference failed for: r1v1, types: [sg.f, java.lang.Object] */
    public m(r rVar) {
        rVar.getClass();
        this.f25294w = rVar;
        this.f25292u = new Object();
    }

    @Override // sg.g
    public final g C(long j10) {
        if (!this.f25293v) {
            this.f25292u.K(j10);
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.r
    public final void G(f fVar, long j10) {
        fVar.getClass();
        if (!this.f25293v) {
            this.f25292u.G(fVar, j10);
            f();
        } else {
            x.o("closed");
        }
    }

    @Override // sg.r
    public final v a() {
        return this.f25294w.a();
    }

    @Override // sg.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f25294w;
        if (!this.f25293v) {
            try {
                f fVar = this.f25292u;
                long j10 = fVar.f25274v;
                if (j10 > 0) {
                    rVar.G(fVar, j10);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                rVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f25293v = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    public final g f() {
        if (!this.f25293v) {
            f fVar = this.f25292u;
            long j10 = fVar.f25274v;
            if (j10 == 0) {
                j10 = 0;
            } else {
                o oVar = fVar.f25273u;
                if (oVar != null) {
                    o oVar2 = oVar.f25303g;
                    if (oVar2 != null) {
                        if (oVar2.f25300c < 8192 && oVar2.e) {
                            j10 -= r6 - oVar2.f25299b;
                        }
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.l.g();
                    throw null;
                }
            }
            if (j10 > 0) {
                this.f25294w.G(fVar, j10);
            }
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.g, sg.r, java.io.Flushable
    public final void flush() {
        if (!this.f25293v) {
            f fVar = this.f25292u;
            long j10 = fVar.f25274v;
            r rVar = this.f25294w;
            if (j10 > 0) {
                rVar.G(fVar, j10);
            }
            rVar.flush();
            return;
        }
        x.o("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f25293v;
    }

    public final String toString() {
        return "buffer(" + this.f25294w + ')';
    }

    @Override // sg.g
    public final g write(byte[] bArr) {
        if (!this.f25293v) {
            f fVar = this.f25292u;
            fVar.getClass();
            fVar.m228write(bArr, 0, bArr.length);
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.g
    public final g writeByte(int i) {
        if (!this.f25293v) {
            this.f25292u.H(i);
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.g
    public final g writeInt(int i) {
        if (!this.f25293v) {
            this.f25292u.L(i);
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.g
    public final g writeShort(int i) {
        if (!this.f25293v) {
            this.f25292u.M(i);
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.g
    public final g x(String str) {
        str.getClass();
        if (!this.f25293v) {
            f fVar = this.f25292u;
            fVar.getClass();
            fVar.N(str, 0, str.length());
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // sg.g
    public final g write(byte[] bArr, int i, int i10) {
        bArr.getClass();
        if (!this.f25293v) {
            this.f25292u.m228write(bArr, i, i10);
            f();
            return this;
        }
        x.o("closed");
        return null;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.f25293v) {
            int write = this.f25292u.write(byteBuffer);
            f();
            return write;
        }
        x.o("closed");
        return 0;
    }
}
