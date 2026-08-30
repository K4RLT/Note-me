package sg;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import q.x;

/* loaded from: classes.dex */
public final class j implements t {

    /* renamed from: u, reason: collision with root package name */
    public byte f25280u;

    /* renamed from: v, reason: collision with root package name */
    public final n f25281v;

    /* renamed from: w, reason: collision with root package name */
    public final Inflater f25282w;

    /* renamed from: x, reason: collision with root package name */
    public final k f25283x;

    /* renamed from: y, reason: collision with root package name */
    public final CRC32 f25284y;

    public j(t tVar) {
        tVar.getClass();
        n nVar = new n(tVar);
        this.f25281v = nVar;
        Inflater inflater = new Inflater(true);
        this.f25282w = inflater;
        this.f25283x = new k(nVar, inflater);
        this.f25284y = new CRC32();
    }

    public static void f(String str, int i, int i10) {
        if (i10 == i) {
        } else {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // sg.t
    public final v a() {
        return this.f25281v.f25297w.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25283x.close();
    }

    public final void j(f fVar, long j10, long j11) {
        o oVar = fVar.f25273u;
        if (oVar == null) {
            kotlin.jvm.internal.l.g();
            throw null;
        }
        do {
            int i = oVar.f25300c;
            int i10 = oVar.f25299b;
            if (j10 >= i - i10) {
                j10 -= i - i10;
                oVar = oVar.f25302f;
            } else {
                while (j11 > 0) {
                    int min = (int) Math.min(oVar.f25300c - r7, j11);
                    this.f25284y.update(oVar.f25298a, (int) (oVar.f25299b + j10), min);
                    j11 -= min;
                    oVar = oVar.f25302f;
                    if (oVar != null) {
                        j10 = 0;
                    } else {
                        kotlin.jvm.internal.l.g();
                        throw null;
                    }
                }
                return;
            }
        } while (oVar != null);
        kotlin.jvm.internal.l.g();
        throw null;
    }

    @Override // sg.t
    public final long q(f fVar, long j10) {
        boolean z3;
        f fVar2;
        long j11;
        j jVar = this;
        fVar.getClass();
        if (j10 >= 0) {
            if (j10 == 0) {
                return 0L;
            }
            byte b10 = jVar.f25280u;
            CRC32 crc32 = jVar.f25284y;
            n nVar = jVar.f25281v;
            if (b10 == 0) {
                nVar.Q(10L);
                f fVar3 = nVar.f25296v;
                byte k3 = fVar3.k(3L);
                if (((k3 >> 1) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    jVar.j(nVar.f25296v, 0L, 10L);
                }
                f("ID1ID2", 8075, nVar.readShort());
                nVar.skip(8L);
                if (((k3 >> 2) & 1) == 1) {
                    nVar.Q(2L);
                    if (z3) {
                        j(nVar.f25296v, 0L, 2L);
                    }
                    short readShort = fVar3.readShort();
                    long j12 = (short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8));
                    nVar.Q(j12);
                    if (z3) {
                        j(nVar.f25296v, 0L, j12);
                    }
                    nVar.skip(j12);
                }
                if (((k3 >> 3) & 1) == 1) {
                    fVar2 = fVar3;
                    long j13 = nVar.j(0L, Long.MAX_VALUE, (byte) 0);
                    if (j13 != -1) {
                        if (z3) {
                            j11 = 2;
                            j(nVar.f25296v, 0L, j13 + 1);
                        } else {
                            j11 = 2;
                        }
                        nVar.skip(j13 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    fVar2 = fVar3;
                    j11 = 2;
                }
                if (((k3 >> 4) & 1) == 1) {
                    long j14 = j11;
                    long j15 = nVar.j(0L, Long.MAX_VALUE, (byte) 0);
                    if (j15 != -1) {
                        if (z3) {
                            j11 = j14;
                            jVar = this;
                            jVar.j(nVar.f25296v, 0L, j15 + 1);
                        } else {
                            jVar = this;
                            j11 = j14;
                        }
                        nVar.skip(j15 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    jVar = this;
                }
                if (z3) {
                    nVar.Q(j11);
                    short readShort2 = fVar2.readShort();
                    f("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) crc32.getValue());
                    crc32.reset();
                }
                jVar.f25280u = (byte) 1;
            }
            if (jVar.f25280u == 1) {
                long j16 = fVar.f25274v;
                long q10 = jVar.f25283x.q(fVar, j10);
                if (q10 != -1) {
                    jVar.j(fVar, j16, q10);
                    return q10;
                }
                jVar.f25280u = (byte) 2;
            }
            if (jVar.f25280u == 2) {
                f("CRC", nVar.o(), (int) crc32.getValue());
                f("ISIZE", nVar.o(), (int) jVar.f25282w.getBytesWritten());
                jVar.f25280u = (byte) 3;
                if (!nVar.f()) {
                    x.p("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        x.j(g3.a.h(j10, "byteCount < 0: "));
        return 0L;
    }
}
