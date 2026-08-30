package og;
import a.a;
import f.a;
import f.b;
import q.x;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class x implements Closeable {
    public static final Logger A = Logger.getLogger(f.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final sg.g f22074u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f22075v;

    /* renamed from: w, reason: collision with root package name */
    public final sg.f f22076w;

    /* renamed from: x, reason: collision with root package name */
    public int f22077x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22078y;

    /* renamed from: z, reason: collision with root package name */
    public final d f22079z;

    /* JADX WARN: Type inference failed for: r1v1, types: [sg.f, java.lang.Object] */
    public x(sg.m mVar, boolean z3) {
        this.f22074u = mVar;
        this.f22075v = z3;
        Object obj = new Object();
        this.f22076w = obj;
        this.f22079z = new d(obj);
        this.f22077x = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22078y = true;
        this.f22074u.close();
    }

    public final synchronized void f(b2.t tVar) {
        int i;
        try {
            if (!this.f22078y) {
                int i10 = this.f22077x;
                int i11 = tVar.f1592a;
                if ((i11 & 32) != 0) {
                    i10 = tVar.f1593b[5];
                }
                this.f22077x = i10;
                int i12 = -1;
                if ((i11 & 2) != 0) {
                    i = tVar.f1593b[1];
                } else {
                    i = -1;
                }
                if (i != -1) {
                    d dVar = this.f22079z;
                    if ((i11 & 2) != 0) {
                        i12 = tVar.f1593b[1];
                    }
                    dVar.getClass();
                    int min = Math.min(i12, 16384);
                    int i13 = dVar.f21996d;
                    if (i13 != min) {
                        if (min < i13) {
                            dVar.f21994b = Math.min(dVar.f21994b, min);
                        }
                        dVar.f21995c = true;
                        dVar.f21996d = min;
                        int i14 = dVar.f21999h;
                        if (min < i14) {
                            if (min == 0) {
                                Arrays.fill(dVar.e, (Object) null);
                                dVar.f21997f = dVar.e.length - 1;
                                dVar.f21998g = 0;
                                dVar.f21999h = 0;
                            } else {
                                dVar.a(i14 - min);
                            }
                        }
                    }
                }
                k(0, 0, (byte) 4, (byte) 1);
                this.f22074u.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (!this.f22078y) {
            this.f22074u.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(boolean z3, int i, sg.f fVar, int i10) {
        byte b10;
        if (!this.f22078y) {
            if (z3) {
                b10 = (byte) 1;
            } else {
                b10 = 0;
            }
            k(i, i10, (byte) 0, b10);
            if (i10 > 0) {
                this.f22074u.G(fVar, i10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void k(int i, int i10, byte b10, byte b11) {
        Level level = Level.FINE;
        Logger logger = A;
        if (logger.isLoggable(level)) {
            logger.fine(a(false, i, i10, b10, b11));
        }
        int i11 = this.f22077x;
        if (i10 <= i11) {
            if ((Integer.MIN_VALUE & i) == 0) {
                sg.g gVar = this.f22074u;
                gVar.writeByte((i10 >>> 16) & 255);
                gVar.writeByte((i10 >>> 8) & 255);
                gVar.writeByte(i10 & 255);
                gVar.writeByte(b10 & 255);
                gVar.writeByte(b11 & 255);
                gVar.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i11), Integer.valueOf(i10));
        throw null;
    }

    public final synchronized void m(byte[] bArr, int i, int i10) {
        try {
            if (!this.f22078y) {
                if (g3.a(i10) != -1) {
                    k(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f22074u.writeInt(i);
                    this.f22074u.writeInt(g3.a(i10));
                    if (bArr.length > 0) {
                        this.f22074u.write(bArr);
                    }
                    this.f22074u.flush();
                } else {
                    b("errorCode.httpCode == -1", new Object[0]);
                    throw null;
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(boolean z3, int i, ArrayList arrayList) {
        byte b10;
        byte b11;
        int i10;
        int i11;
        if (!this.f22078y) {
            d dVar = this.f22079z;
            if (dVar.f21995c) {
                int i12 = dVar.f21994b;
                if (i12 < dVar.f21996d) {
                    dVar.d(i12, 31, 32);
                }
                dVar.f21995c = false;
                dVar.f21994b = Integer.MAX_VALUE;
                dVar.d(dVar.f21996d, 31, 32);
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                b bVar = (b) arrayList.get(i13);
                sg.h h3 = bVar.f21983a.h();
                sg.h hVar = bVar.f21984b;
                Integer num = (Integer) e.f22001b.get(h3);
                if (num != null) {
                    int intValue = num.intValue();
                    i11 = intValue + 1;
                    if (i11 > 1 && i11 < 8) {
                        b[] bVarArr = e.f22000a;
                        if (jg.b.j(bVarArr[intValue].f21984b, hVar)) {
                            i10 = i11;
                        } else if (jg.b.j(bVarArr[i11].f21984b, hVar)) {
                            i11 = intValue + 2;
                            i10 = i11;
                        }
                    }
                    i10 = i11;
                    i11 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i11 == -1) {
                    int i14 = dVar.f21997f + 1;
                    int length = dVar.e.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        if (jg.b.j(dVar.e[i14].f21983a, h3)) {
                            if (jg.b.j(dVar.e[i14].f21984b, hVar)) {
                                i11 = (i14 - dVar.f21997f) + e.f22000a.length;
                                break;
                            } else if (i10 == -1) {
                                i10 = (i14 - dVar.f21997f) + e.f22000a.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i11 != -1) {
                    dVar.d(i11, 127, 128);
                } else if (i10 == -1) {
                    dVar.f21993a.H(64);
                    dVar.c(h3);
                    dVar.c(hVar);
                    dVar.b(bVar);
                } else {
                    sg.h hVar2 = b.f21979d;
                    h3.getClass();
                    hVar2.getClass();
                    if (h3.g(hVar2, hVar2.b()) && !b.i.equals(h3)) {
                        dVar.d(i10, 15, 0);
                        dVar.c(hVar);
                    } else {
                        dVar.d(i10, 63, 64);
                        dVar.c(hVar);
                        dVar.b(bVar);
                    }
                }
            }
            sg.f fVar = this.f22076w;
            long j10 = fVar.f25274v;
            int min = (int) Math.min(this.f22077x, j10);
            long j11 = min;
            if (j10 == j11) {
                b10 = 4;
            } else {
                b10 = 0;
            }
            if (z3) {
                b10 = (byte) (b10 | 1);
            }
            k(i, min, (byte) 1, b10);
            sg.g gVar = this.f22074u;
            gVar.G(fVar, j11);
            if (j10 > j11) {
                long j12 = j10 - j11;
                while (j12 > 0) {
                    int min2 = (int) Math.min(this.f22077x, j12);
                    long j13 = min2;
                    j12 -= j13;
                    if (j12 == 0) {
                        b11 = 4;
                    } else {
                        b11 = 0;
                    }
                    k(i, min2, (byte) 9, b11);
                    gVar.G(fVar, j13);
                }
                return;
            }
            return;
        }
        q.x.p("closed");
    }

    public final synchronized void p(int i, int i10, boolean z3) {
        if (!this.f22078y) {
            k(0, 8, (byte) 6, z3 ? (byte) 1 : (byte) 0);
            this.f22074u.writeInt(i);
            this.f22074u.writeInt(i10);
            this.f22074u.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void r(int i, int i10) {
        if (!this.f22078y) {
            if (g3.a(i10) != -1) {
                k(i, 4, (byte) 3, (byte) 0);
                this.f22074u.writeInt(g3.a(i10));
                this.f22074u.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void w(int i, long j10) {
        if (!this.f22078y) {
            if (j10 != 0 && j10 <= 2147483647L) {
                k(i, 4, (byte) 8, (byte) 0);
                this.f22074u.writeInt((int) j10);
                this.f22074u.flush();
            } else {
                b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
                throw null;
            }
        } else {
            throw new IOException("closed");
        }
    }
}