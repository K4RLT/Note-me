package sg;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import okio.BufferedSource;
import q.x;

/* loaded from: classes.dex */
public final class n implements BufferedSource {

    /* renamed from: u, reason: collision with root package name */
    public boolean f25295u;

    /* renamed from: v, reason: collision with root package name */
    public final f f25296v;

    /* renamed from: w, reason: collision with root package name */
    public final t f25297w;

    /* JADX WARN: Type inference failed for: r1v1, types: [sg.f, java.lang.Object] */
    public n(t tVar) {
        tVar.getClass();
        this.f25297w = tVar;
        this.f25296v = new Object();
    }

    @Override // okio.BufferedSource
    public final String I() {
        return t(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public final void Q(long j10) {
        if (p(j10)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public final long S() {
        f fVar;
        byte k3;
        Q(1L);
        int i = 0;
        while (true) {
            int i10 = i + 1;
            boolean p10 = p(i10);
            fVar = this.f25296v;
            if (!p10) {
                break;
            }
            k3 = fVar.k(i);
            if ((k3 < ((byte) 48) || k3 > ((byte) 57)) && ((k3 < ((byte) 97) || k3 > ((byte) FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH)) && (k3 < ((byte) 65) || k3 > ((byte) 70)))) {
                break;
            }
            i = i10;
        }
        if (i == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(k3)}, 1)));
        }
        return fVar.S();
    }

    @Override // okio.BufferedSource
    public final InputStream U() {
        return new e(this, 1);
    }

    @Override // sg.t
    public final v a() {
        return this.f25297w.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f25295u) {
            return;
        }
        this.f25295u = true;
        this.f25297w.close();
        f fVar = this.f25296v;
        fVar.skip(fVar.f25274v);
    }

    public final boolean f() {
        if (!this.f25295u) {
            f fVar = this.f25296v;
            if (fVar.j()) {
                if (this.f25297w.q(fVar, 8192) == -1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        x.o("closed");
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f25295u;
    }

    public final long j(long j10, long j11, byte b10) {
        if (!this.f25295u) {
            if (j11 >= 0) {
                long j12 = 0;
                while (j12 < j11) {
                    long j13 = j11;
                    byte b11 = b10;
                    long m4 = this.f25296v.m(j12, j13, b11);
                    if (m4 != -1) {
                        return m4;
                    }
                    f fVar = this.f25296v;
                    long j14 = fVar.f25274v;
                    if (j14 >= j13) {
                        break;
                    }
                    if (this.f25297w.q(fVar, 8192) == -1) {
                        break;
                    }
                    j12 = Math.max(j12, j14);
                    j11 = j13;
                    b10 = b11;
                }
                return -1L;
            }
            x.j(g3.a.h(j11, "fromIndex=0 toIndex="));
            return 0L;
        }
        x.o("closed");
        return 0L;
    }

    public final long k(h hVar) {
        long j10;
        long j11;
        long j12;
        hVar.getClass();
        if (!this.f25295u) {
            long j13 = 0;
            while (true) {
                f fVar = this.f25296v;
                fVar.getClass();
                hVar.getClass();
                long j14 = 0;
                if (j13 >= 0) {
                    o oVar = fVar.f25273u;
                    if (oVar != null) {
                        long j15 = fVar.f25274v;
                        int i = 0;
                        if (j15 - j13 < j13) {
                            while (j15 > j13) {
                                oVar = oVar.f25303g;
                                if (oVar != null) {
                                    j15 -= oVar.f25300c - oVar.f25299b;
                                } else {
                                    kotlin.jvm.internal.l.g();
                                    throw null;
                                }
                            }
                            if (hVar.b() == 2) {
                                byte e = hVar.e(0);
                                byte e8 = hVar.e(1);
                                long j16 = j13;
                                while (j15 < fVar.f25274v) {
                                    byte[] bArr = oVar.f25298a;
                                    int i10 = oVar.f25300c;
                                    for (int i11 = (int) ((oVar.f25299b + j16) - j15); i11 < i10; i11++) {
                                        byte b10 = bArr[i11];
                                        if (b10 == e || b10 == e8) {
                                            j12 = i11 - oVar.f25299b;
                                            j10 = j12 + j15;
                                            break;
                                        }
                                    }
                                    j16 = (oVar.f25300c - oVar.f25299b) + j15;
                                    oVar = oVar.f25302f;
                                    if (oVar != null) {
                                        j15 = j16;
                                    } else {
                                        kotlin.jvm.internal.l.g();
                                        throw null;
                                    }
                                }
                            } else {
                                byte[] d2 = hVar.d();
                                long j17 = j13;
                                Throwable th = null;
                                while (j15 < fVar.f25274v) {
                                    byte[] bArr2 = oVar.f25298a;
                                    int i12 = (int) ((oVar.f25299b + j17) - j15);
                                    int i13 = oVar.f25300c;
                                    while (i12 < i13) {
                                        byte b11 = bArr2[i12];
                                        int length = d2.length;
                                        Throwable th2 = th;
                                        for (int i14 = i; i14 < length; i14++) {
                                            if (b11 == d2[i14]) {
                                                j12 = i12 - oVar.f25299b;
                                                j10 = j12 + j15;
                                                break;
                                            }
                                        }
                                        i12++;
                                        th = th2;
                                        i = 0;
                                    }
                                    Throwable th3 = th;
                                    j17 = j15 + (oVar.f25300c - oVar.f25299b);
                                    oVar = oVar.f25302f;
                                    if (oVar != null) {
                                        j15 = j17;
                                        th = th3;
                                        i = 0;
                                    } else {
                                        kotlin.jvm.internal.l.g();
                                        throw th3;
                                    }
                                }
                            }
                        } else {
                            while (true) {
                                long j18 = (oVar.f25300c - oVar.f25299b) + j14;
                                if (j18 > j13) {
                                    if (hVar.b() == 2) {
                                        byte e10 = hVar.e(0);
                                        byte e11 = hVar.e(1);
                                        long j19 = j13;
                                        while (j14 < fVar.f25274v) {
                                            byte[] bArr3 = oVar.f25298a;
                                            int i15 = oVar.f25300c;
                                            for (int i16 = (int) ((oVar.f25299b + j19) - j14); i16 < i15; i16++) {
                                                byte b12 = bArr3[i16];
                                                if (b12 == e10 || b12 == e11) {
                                                    j11 = i16 - oVar.f25299b;
                                                    j10 = j14 + j11;
                                                    break;
                                                }
                                            }
                                            j19 = (oVar.f25300c - oVar.f25299b) + j14;
                                            oVar = oVar.f25302f;
                                            if (oVar != null) {
                                                j14 = j19;
                                            } else {
                                                kotlin.jvm.internal.l.g();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        int i17 = 0;
                                        byte[] d10 = hVar.d();
                                        long j20 = j13;
                                        while (j14 < fVar.f25274v) {
                                            byte[] bArr4 = oVar.f25298a;
                                            int i18 = (int) ((oVar.f25299b + j20) - j14);
                                            int i19 = oVar.f25300c;
                                            while (i18 < i19) {
                                                byte b13 = bArr4[i18];
                                                int length2 = d10.length;
                                                for (int i20 = i17; i20 < length2; i20++) {
                                                    if (b13 == d10[i20]) {
                                                        j11 = i18 - oVar.f25299b;
                                                        j10 = j14 + j11;
                                                        break;
                                                    }
                                                }
                                                i18++;
                                                i17 = 0;
                                            }
                                            j20 = j14 + (oVar.f25300c - oVar.f25299b);
                                            oVar = oVar.f25302f;
                                            if (oVar != null) {
                                                j14 = j20;
                                                i17 = 0;
                                            } else {
                                                kotlin.jvm.internal.l.g();
                                                throw null;
                                            }
                                        }
                                    }
                                } else {
                                    oVar = oVar.f25302f;
                                    if (oVar != null) {
                                        j14 = j18;
                                    } else {
                                        kotlin.jvm.internal.l.g();
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    j10 = -1;
                } else {
                    x.j(g3.a.h(j13, "fromIndex < 0: "));
                    j10 = 0;
                }
                if (j10 != -1) {
                    return j10;
                }
                long j21 = fVar.f25274v;
                if (this.f25297w.q(fVar, 8192) == -1) {
                    return -1L;
                }
                j13 = Math.max(j13, j21);
            }
        } else {
            x.o("closed");
            return 0L;
        }
    }

    @Override // okio.BufferedSource
    public final h l(long j10) {
        Q(j10);
        return this.f25296v.l(j10);
    }

    public final void m(byte[] bArr) {
        f fVar = this.f25296v;
        int i = 0;
        try {
            Q(bArr.length);
            fVar.getClass();
            while (i < bArr.length) {
                int read = fVar.read(bArr, i, bArr.length - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e) {
            while (true) {
                long j10 = fVar.f25274v;
                if (j10 > 0) {
                    int read2 = fVar.read(bArr, i, (int) j10);
                    if (read2 != -1) {
                        i += read2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public final int o() {
        Q(4L);
        int readInt = this.f25296v.readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean p(long j10) {
        f fVar;
        if (j10 >= 0) {
            if (this.f25295u) {
                x.o("closed");
                return false;
            }
            do {
                fVar = this.f25296v;
                if (fVar.f25274v < j10) {
                } else {
                    return true;
                }
            } while (this.f25297w.q(fVar, 8192) != -1);
            return false;
        }
        x.j(g3.a.h(j10, "byteCount < 0: "));
        return false;
    }

    @Override // sg.t
    public final long q(f fVar, long j10) {
        fVar.getClass();
        if (j10 >= 0) {
            if (!this.f25295u) {
                f fVar2 = this.f25296v;
                if (fVar2.f25274v == 0) {
                    if (this.f25297w.q(fVar2, 8192) == -1) {
                        return -1L;
                    }
                }
                return fVar2.q(fVar, Math.min(j10, fVar2.f25274v));
            }
            x.o("closed");
            return 0L;
        }
        x.j(g3.a.h(j10, "byteCount < 0: "));
        return 0L;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        f fVar = this.f25296v;
        if (fVar.f25274v == 0) {
            if (this.f25297w.q(fVar, 8192) == -1) {
                return -1;
            }
        }
        return fVar.read(byteBuffer);
    }

    @Override // okio.BufferedSource
    public final byte readByte() {
        Q(1L);
        return this.f25296v.readByte();
    }

    @Override // okio.BufferedSource
    public final int readInt() {
        Q(4L);
        return this.f25296v.readInt();
    }

    @Override // okio.BufferedSource
    public final short readShort() {
        Q(2L);
        return this.f25296v.readShort();
    }

    @Override // okio.BufferedSource
    public final void skip(long j10) {
        if (!this.f25295u) {
            while (j10 > 0) {
                f fVar = this.f25296v;
                if (fVar.f25274v == 0) {
                    if (this.f25297w.q(fVar, 8192) == -1) {
                        throw new EOFException();
                    }
                }
                long min = Math.min(j10, fVar.f25274v);
                fVar.skip(min);
                j10 -= min;
            }
            return;
        }
        x.o("closed");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [sg.f, java.lang.Object] */
    @Override // okio.BufferedSource
    public final String t(long j10) {
        long j11;
        if (j10 >= 0) {
            if (j10 == Long.MAX_VALUE) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = j10 + 1;
            }
            byte b10 = (byte) 10;
            long j12 = j(0L, j11, b10);
            f fVar = this.f25296v;
            if (j12 != -1) {
                return fVar.w(j12);
            }
            if (j11 < Long.MAX_VALUE && p(j11) && fVar.k(j11 - 1) == ((byte) 13) && p(j11 + 1) && fVar.k(j11) == b10) {
                return fVar.w(j11);
            }
            Object obj = new Object();
            fVar.f(obj, 0L, Math.min(32, fVar.f25274v));
            throw new EOFException("\\n not found: limit=" + Math.min(fVar.f25274v, j10) + " content=" + new h(obj.o(obj.f25274v)).c() + "…");
        }
        x.j(g3.a.h(j10, "limit < 0: "));
        return null;
    }

    public final String toString() {
        return "buffer(" + this.f25297w + ')';
    }
}