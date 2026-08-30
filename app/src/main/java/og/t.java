package og;
import x.p;
import a.a;
import d.c;
import q.x;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.BufferedSource;

/* loaded from: classes.dex */
public final class t implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f22050y = Logger.getLogger(f.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final BufferedSource f22051u;

    /* renamed from: v, reason: collision with root package name */
    public final s f22052v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f22053w;

    /* renamed from: x, reason: collision with root package name */
    public final c f22054x;

    public t(sg.n nVar, boolean z3) {
        this.f22051u = nVar;
        this.f22053w = z3;
        s sVar = new s(nVar);
        this.f22052v = sVar;
        this.f22054x = new c(sVar);
    }

    public static int f(int i, byte b10, short s10) {
        if ((b10 & 8) != 0) {
            i--;
        }
        if (s10 <= i) {
            return (short) (i - s10);
        }
        c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s10), Integer.valueOf(i));
        throw null;
    }

    public static int r(BufferedSource bufferedSource) {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public final void A(p pVar, int i, byte b10, int i10) {
        long j10;
        boolean z3;
        w[] wVarArr = null;
        if (i10 == 0) {
            if ((b10 & 1) != 0) {
                if (i != 0) {
                    c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    throw null;
                }
                return;
            }
            if (i % 6 == 0) {
                b2.t tVar = new b2.t(2, (byte) 0);
                for (int i11 = 0; i11 < i; i11 += 6) {
                    int readShort = this.f22051u.readShort() & 65535;
                    int readInt = this.f22051u.readInt();
                    if (readShort != 2) {
                        if (readShort != 3) {
                            if (readShort != 4) {
                                if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                                    c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                                    throw null;
                                }
                            } else if (readInt >= 0) {
                                readShort = 7;
                            } else {
                                c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                        } else {
                            readShort = 4;
                        }
                    } else if (readInt != 0 && readInt != 1) {
                        c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    tVar.i(readShort, readInt);
                }
                synchronized (((r) pVar.f22035x)) {
                    try {
                        int b11 = ((r) pVar.f22035x).I.b();
                        b2.t tVar2 = ((r) pVar.f22035x).I;
                        tVar2.getClass();
                        for (int i12 = 0; i12 < 10; i12++) {
                            if (((1 << i12) & tVar.f1592a) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                tVar2.i(i12, tVar.f1593b[i12]);
                            }
                        }
                        try {
                            r rVar = (r) pVar.f22035x;
                            rVar.B.execute(new p(pVar, new Object[]{rVar.f22041x}, tVar));
                        } catch (RejectedExecutionException unused) {
                        }
                        int b12 = ((r) pVar.f22035x).I.b();
                        if (b12 != -1 && b12 != b11) {
                            j10 = b12 - b11;
                            r rVar2 = (r) pVar.f22035x;
                            if (!rVar2.J) {
                                rVar2.J = true;
                            }
                            if (!rVar2.f22040w.isEmpty()) {
                                wVarArr = (w[]) ((r) pVar.f22035x).f22040w.values().toArray(new w[((r) pVar.f22035x).f22040w.size()]);
                            }
                        } else {
                            j10 = 0;
                        }
                        r.O.execute(new q(pVar, ((r) pVar.f22035x).f22041x));
                    } finally {
                    }
                }
                if (wVarArr != null && j10 != 0) {
                    for (w wVar : wVarArr) {
                        synchronized (wVar) {
                            wVar.f22066b += j10;
                            if (j10 > 0) {
                                wVar.notifyAll();
                            }
                        }
                    }
                    return;
                }
                return;
            }
            c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
        c("TYPE_SETTINGS streamId != 0", new Object[0]);
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f22051u.close();
    }

    public final boolean j(boolean z3, p pVar) {
        int i;
        boolean z9;
        int i10;
        w[] wVarArr;
        int i11 = 0;
        try {
            this.f22051u.Q(9L);
            int r8 = r(this.f22051u);
            if (r8 >= 0 && r8 <= 16384) {
                byte readByte = (byte) (this.f22051u.readByte() & 255);
                if (z3 && readByte != 4) {
                    c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                    throw null;
                }
                byte readByte2 = (byte) (this.f22051u.readByte() & 255);
                int readInt = this.f22051u.readInt();
                int i12 = Integer.MAX_VALUE & readInt;
                Logger logger = f22050y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(a(true, i12, r8, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m(pVar, r8, readByte2, i12);
                        return true;
                    case 1:
                        p(pVar, r8, readByte2, i12);
                        return true;
                    case 2:
                        if (r8 == 5) {
                            if (i12 != 0) {
                                BufferedSource bufferedSource = this.f22051u;
                                bufferedSource.readInt();
                                bufferedSource.readByte();
                                return true;
                            }
                            c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                        c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(r8));
                        throw null;
                    case 3:
                        if (r8 == 4) {
                            if (i12 != 0) {
                                int readInt2 = this.f22051u.readInt();
                                int[] c10 = q0.c(11);
                                int length = c10.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length) {
                                        i = c10[i13];
                                        if (g3.a(i) != readInt2) {
                                            i13++;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    r rVar = (r) pVar.f22035x;
                                    if (i12 != 0 && (readInt & 1) == 0) {
                                        i11 = 1;
                                    }
                                    if (i11 != 0) {
                                        rVar.o(new k(rVar, new Object[]{rVar.f22041x, Integer.valueOf(i12)}, i12, i));
                                        return true;
                                    }
                                    w p10 = rVar.p(i12);
                                    if (p10 != null) {
                                        synchronized (p10) {
                                            if (p10.f22073k == 0) {
                                                p10.f22073k = i;
                                                p10.notifyAll();
                                            }
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                                throw null;
                            }
                            c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(r8));
                        throw null;
                    case 4:
                        A(pVar, r8, readByte2, i12);
                        return true;
                    case 5:
                        w(pVar, r8, readByte2, i12);
                        return true;
                    case 6:
                        if (r8 == 8) {
                            if (i12 == 0) {
                                int readInt3 = this.f22051u.readInt();
                                int readInt4 = this.f22051u.readInt();
                                if ((readByte2 & 1) != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                r rVar2 = (r) pVar.f22035x;
                                if (z9) {
                                    synchronized (rVar2) {
                                        r rVar3 = (r) pVar.f22035x;
                                        rVar3.E = false;
                                        rVar3.notifyAll();
                                    }
                                } else {
                                    try {
                                        rVar2.B.execute(new o(rVar2, true, readInt3, readInt4));
                                    } catch (RejectedExecutionException unused) {
                                    }
                                }
                                return true;
                            }
                            c("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                        c("TYPE_PING length != 8: %s", Integer.valueOf(r8));
                        throw null;
                    case 7:
                        if (r8 >= 8) {
                            if (i12 == 0) {
                                int readInt5 = this.f22051u.readInt();
                                int readInt6 = this.f22051u.readInt();
                                int i14 = r8 - 8;
                                int[] c11 = q0.c(11);
                                int length2 = c11.length;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < length2) {
                                        i10 = c11[i15];
                                        if (g3.a(i10) != readInt6) {
                                            i15++;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                if (i10 != 0) {
                                    sg.h hVar = sg.h.f25276y;
                                    if (i14 > 0) {
                                        hVar = this.f22051u.l(i14);
                                    }
                                    hVar.b();
                                    synchronized (((r) pVar.f22035x)) {
                                        wVarArr = (w[]) ((r) pVar.f22035x).f22040w.values().toArray(new w[((r) pVar.f22035x).f22040w.size()]);
                                        ((r) pVar.f22035x).A = true;
                                    }
                                    int length3 = wVarArr.length;
                                    while (i11 < length3) {
                                        w wVar = wVarArr[i11];
                                        if (wVar.f22067c > readInt5 && wVar.f()) {
                                            synchronized (wVar) {
                                                if (wVar.f22073k == 0) {
                                                    wVar.f22073k = 5;
                                                    wVar.notifyAll();
                                                }
                                            }
                                            ((r) pVar.f22035x).p(wVar.f22067c);
                                        }
                                        i11++;
                                    }
                                    return true;
                                }
                                c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt6));
                                throw null;
                            }
                            c("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                        c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(r8));
                        throw null;
                    case 8:
                        if (r8 == 4) {
                            long readInt7 = this.f22051u.readInt() & 2147483647L;
                            if (readInt7 != 0) {
                                r rVar4 = (r) pVar.f22035x;
                                if (i12 == 0) {
                                    synchronized (rVar4) {
                                        r rVar5 = (r) pVar.f22035x;
                                        rVar5.G += readInt7;
                                        rVar5.notifyAll();
                                    }
                                    return true;
                                }
                                w k3 = rVar4.k(i12);
                                if (k3 != null) {
                                    synchronized (k3) {
                                        k3.f22066b += readInt7;
                                        if (readInt7 > 0) {
                                            k3.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                                return true;
                            }
                            c("windowSizeIncrement was 0", Long.valueOf(readInt7));
                            throw null;
                        }
                        c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(r8));
                        throw null;
                    default:
                        this.f22051u.skip(r8);
                        return true;
                }
            }
            c("FRAME_SIZE_ERROR: %s", Integer.valueOf(r8));
            throw null;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void k(p pVar) {
        if (this.f22053w) {
            if (!j(true, pVar)) {
                c("Required SETTINGS preface not received", new Object[0]);
                throw null;
            }
            return;
        }
        sg.h hVar = f.f22002a;
        hVar.getClass();
        char[] cArr = tg.a.f25759a;
        sg.h l10 = this.f22051u.l(hVar.f25279w.length);
        Level level = Level.FINE;
        Logger logger = f22050y;
        if (logger.isLoggable(level)) {
            String c10 = l10.c();
            byte[] bArr = jg.b.f19199a;
            Locale locale = Locale.US;
            logger.fine("<< CONNECTION " + c10);
        }
        if (hVar.equals(l10)) {
            return;
        }
        c("Expected a connection header but was %s", l10.i());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [sg.f, java.lang.Object] */
    public final void m(p pVar, int i, byte b10, int i10) {
        boolean z3;
        short s10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 != 0) {
            if ((b10 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b10 & 32) == 0) {
                if ((b10 & 8) != 0) {
                    s10 = (short) (this.f22051u.readByte() & 255);
                } else {
                    s10 = 0;
                }
                int f10 = f(i, b10, s10);
                BufferedSource bufferedSource = this.f22051u;
                r rVar = (r) pVar.f22035x;
                if (i10 != 0 && (i10 & 1) == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    Object obj = new Object();
                    long j10 = f10;
                    bufferedSource.Q(j10);
                    bufferedSource.q(obj, j10);
                    if (obj.f25274v == j10) {
                        rVar.o(new l(rVar, new Object[]{rVar.f22041x, Integer.valueOf(i10)}, i10, obj, f10, z3));
                    } else {
                        throw new IOException(obj.f25274v + " != " + f10);
                    }
                } else {
                    w k3 = rVar.k(i10);
                    if (k3 == null) {
                        ((r) pVar.f22035x).B(i10, 2);
                        long j11 = f10;
                        ((r) pVar.f22035x).w(j11);
                        bufferedSource.skip(j11);
                    } else {
                        v vVar = k3.f22070g;
                        long j12 = f10;
                        while (true) {
                            if (j12 > 0) {
                                synchronized (vVar.f22064z) {
                                    z10 = vVar.f22063y;
                                    if (vVar.f22060v.f25274v + j12 > vVar.f22061w) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                }
                                if (z11) {
                                    bufferedSource.skip(j12);
                                    w wVar = vVar.f22064z;
                                    if (wVar.d(4)) {
                                        wVar.f22068d.B(wVar.f22067c, 4);
                                    }
                                } else {
                                    if (z10) {
                                        bufferedSource.skip(j12);
                                        break;
                                    }
                                    long q10 = bufferedSource.q(vVar.f22059u, j12);
                                    if (q10 != -1) {
                                        j12 -= q10;
                                        synchronized (vVar.f22064z) {
                                            try {
                                                sg.f fVar = vVar.f22060v;
                                                if (fVar.f25274v == 0) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                fVar.B(vVar.f22059u);
                                                if (z12) {
                                                    vVar.f22064z.notifyAll();
                                                }
                                            } finally {
                                            }
                                        }
                                    } else {
                                        throw new EOFException();
                                    }
                                }
                            } else {
                                vVar.getClass();
                                break;
                            }
                        }
                        if (z3) {
                            k3.h();
                        }
                    }
                }
                this.f22051u.skip(s10);
                return;
            }
            c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    public final ArrayList o(int i, short s10, byte b10, int i10) {
        s sVar = this.f22052v;
        sVar.f22048y = i;
        sVar.f22045v = i;
        sVar.f22049z = s10;
        sVar.f22046w = b10;
        sVar.f22047x = i10;
        c cVar = this.f22054x;
        sg.n nVar = cVar.f21987b;
        ArrayList arrayList = cVar.f21986a;
        while (!nVar.f()) {
            byte readByte = nVar.readByte();
            int i11 = readByte & 255;
            if (i11 != 128) {
                if ((readByte & 128) == 128) {
                    int e = cVar.e(i11, 127);
                    int i12 = e - 1;
                    if (i12 >= 0) {
                        b[] bVarArr = e.f22000a;
                        if (i12 <= bVarArr.length - 1) {
                            arrayList.add(bVarArr[i12]);
                        }
                    }
                    int length = cVar.f21990f + 1 + (i12 - e.f22000a.length);
                    if (length >= 0) {
                        b[] bVarArr2 = cVar.e;
                        if (length < bVarArr2.length) {
                            arrayList.add(bVarArr2[length]);
                        }
                    }
                    x.p(g3.a.g(e, "Header index too large "));
                    return null;
                }
                if (i11 == 64) {
                    sg.h d2 = cVar.d();
                    e.a(d2);
                    cVar.c(new b(d2, cVar.d()));
                } else if ((readByte & 64) == 64) {
                    cVar.c(new b(cVar.b(cVar.e(i11, 63) - 1), cVar.d()));
                } else if ((readByte & 32) == 32) {
                    int e8 = cVar.e(i11, 31);
                    cVar.f21989d = e8;
                    if (e8 >= 0 && e8 <= cVar.f21988c) {
                        int i13 = cVar.f21992h;
                        if (e8 < i13) {
                            if (e8 == 0) {
                                Arrays.fill(cVar.e, (Object) null);
                                cVar.f21990f = cVar.e.length - 1;
                                cVar.f21991g = 0;
                                cVar.f21992h = 0;
                            } else {
                                cVar.a(i13 - e8);
                            }
                        }
                    } else {
                        throw new IOException("Invalid dynamic table size update " + cVar.f21989d);
                    }
                } else if (i11 != 16 && i11 != 0) {
                    arrayList.add(new b(cVar.b(cVar.e(i11, 15) - 1), cVar.d()));
                } else {
                    sg.h d10 = cVar.d();
                    e.a(d10);
                    arrayList.add(new b(d10, cVar.d()));
                }
            } else {
                x.p("index == 0");
                return null;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void p(p pVar, int i, byte b10, int i10) {
        boolean z3;
        short s10;
        boolean g8;
        boolean z9 = false;
        if (i10 != 0) {
            if ((b10 & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f22051u.readByte() & 255);
            } else {
                s10 = 0;
            }
            if ((b10 & 32) != 0) {
                BufferedSource bufferedSource = this.f22051u;
                bufferedSource.readInt();
                bufferedSource.readByte();
                i -= 5;
            }
            ArrayList o10 = o(f(i, b10, s10), s10, b10, i10);
            r rVar = (r) pVar.f22035x;
            if (i10 != 0 && (i10 & 1) == 0) {
                z9 = true;
            }
            if (z9) {
                try {
                    rVar.o(new k(rVar, new Object[]{rVar.f22041x, Integer.valueOf(i10)}, i10, o10, z3));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (rVar) {
                try {
                    w k3 = ((r) pVar.f22035x).k(i10);
                    if (k3 == null) {
                        r rVar2 = (r) pVar.f22035x;
                        if (rVar2.A) {
                            return;
                        }
                        if (i10 <= rVar2.f22042y) {
                            return;
                        }
                        if (i10 % 2 == rVar2.f22043z % 2) {
                            return;
                        }
                        w wVar = new w(i10, (r) pVar.f22035x, false, z3, jg.b.s(o10));
                        r rVar3 = (r) pVar.f22035x;
                        rVar3.f22042y = i10;
                        rVar3.f22040w.put(Integer.valueOf(i10), wVar);
                        r.O.execute(new p(pVar, new Object[]{((r) pVar.f22035x).f22041x, Integer.valueOf(i10)}, wVar));
                        return;
                    }
                    synchronized (k3) {
                        k3.f22069f = true;
                        k3.e.add(jg.b.s(o10));
                        g8 = k3.g();
                        k3.notifyAll();
                    }
                    if (!g8) {
                        k3.f22068d.p(k3.f22067c);
                    }
                    if (z3) {
                        k3.h();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void w(p pVar, int i, byte b10, int i10) {
        short s10 = 0;
        if (i10 != 0) {
            if ((b10 & 8) != 0) {
                s10 = (short) (this.f22051u.readByte() & 255);
            }
            int readInt = this.f22051u.readInt() & Integer.MAX_VALUE;
            ArrayList o10 = o(f(i - 4, b10, s10), s10, b10, i10);
            r rVar = (r) pVar.f22035x;
            synchronized (rVar) {
                try {
                    if (rVar.N.contains(Integer.valueOf(readInt))) {
                        rVar.B(readInt, 2);
                        return;
                    }
                    rVar.N.add(Integer.valueOf(readInt));
                    try {
                        rVar.o(new k(rVar, new Object[]{rVar.f22041x, Integer.valueOf(readInt)}, readInt, o10));
                        return;
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }
}