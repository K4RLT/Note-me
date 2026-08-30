package og;
import p.a;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements Closeable {
    public static final ThreadPoolExecutor O;
    public boolean A;
    public final ScheduledThreadPoolExecutor B;
    public final ThreadPoolExecutor C;
    public final z D;
    public boolean E;
    public long G;
    public final b2.t H;
    public final b2.t I;
    public boolean J;
    public final Socket K;
    public final x L;
    public final p M;
    public final LinkedHashSet N;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f22038u;

    /* renamed from: v, reason: collision with root package name */
    public final n f22039v;

    /* renamed from: x, reason: collision with root package name */
    public final String f22041x;

    /* renamed from: y, reason: collision with root package name */
    public int f22042y;

    /* renamed from: z, reason: collision with root package name */
    public int f22043z;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f22040w = new LinkedHashMap();
    public long F = 0;

    static {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = jg.b.f19199a;
        O = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, synchronousQueue, new a6.b("OkHttp Http2Connection", true));
    }

    public r(c0.z zVar) {
        int i;
        b2.t tVar = new b2.t(2, (byte) 0);
        this.H = tVar;
        b2.t tVar2 = new b2.t(2, (byte) 0);
        this.I = tVar2;
        this.J = false;
        this.N = new LinkedHashSet();
        this.D = z.f22084a;
        boolean z3 = zVar.f3436u;
        this.f22038u = z3;
        this.f22039v = (n) zVar.f3441z;
        if (z3) {
            i = 1;
        } else {
            i = 2;
        }
        this.f22043z = i;
        if (z3) {
            this.f22043z = i + 2;
        }
        if (z3) {
            tVar.i(7, 16777216);
        }
        String str = (String) zVar.f3438w;
        this.f22041x = str;
        byte[] bArr = jg.b.f19199a;
        Locale locale = Locale.US;
        this.B = new ScheduledThreadPoolExecutor(1, new a6.b(a.k("OkHttp ", str, " Writer"), false));
        this.C = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a6.b(a.k("OkHttp ", str, " Push Observer"), true));
        tVar2.i(7, 65535);
        tVar2.i(5, 16384);
        this.G = tVar2.b();
        this.K = (Socket) zVar.f3437v;
        this.L = new x((sg.m) zVar.f3440y, z3);
        this.M = new p(this, new t((sg.n) zVar.f3439x, z3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.L.f22077x);
        r6 = r2;
        r8.G -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(int r9, boolean r10, sg.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            og.x r12 = r8.L
            r12.j(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.G     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L32
            java.util.LinkedHashMap r2 = r8.f22040w     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            goto L12
        L28:
            r9 = move-exception
            goto L63
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L56
        L32:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L28
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L28
            og.x r4 = r8.L     // Catch: java.lang.Throwable -> L28
            int r4 = r4.f22077x     // Catch: java.lang.Throwable -> L28
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L28
            long r4 = r8.G     // Catch: java.lang.Throwable -> L28
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L28
            long r4 = r4 - r6
            r8.G = r4     // Catch: java.lang.Throwable -> L28
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            long r12 = r12 - r6
            og.x r4 = r8.L
            if (r10 == 0) goto L51
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = r3
        L52:
            r4.j(r5, r9, r11, r2)
            goto Ld
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L28
            r9.interrupt()     // Catch: java.lang.Throwable -> L28
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L28
            r9.<init>()     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L28
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.r.A(int, boolean, sg.f, long):void");
    }

    public final void B(int i, int i10) {
        try {
            this.B.execute(new i(this, new Object[]{this.f22041x, Integer.valueOf(i)}, i, i10));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void H(int i, long j10) {
        try {
            this.B.execute(new j(this, new Object[]{this.f22041x, Integer.valueOf(i)}, i, j10));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(1, 6);
    }

    public final void f(int i, int i10) {
        w[] wVarArr = null;
        try {
            r(i);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            try {
                if (!this.f22040w.isEmpty()) {
                    wVarArr = (w[]) this.f22040w.values().toArray(new w[this.f22040w.size()]);
                    this.f22040w.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(i10);
                } catch (IOException e8) {
                    if (e != null) {
                        e = e8;
                    }
                }
            }
        }
        try {
            this.L.close();
        } catch (IOException e10) {
            if (e == null) {
                e = e10;
            }
        }
        try {
            this.K.close();
        } catch (IOException e11) {
            e = e11;
        }
        this.B.shutdown();
        this.C.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void flush() {
        this.L.flush();
    }

    public final void j() {
        try {
            f(2, 2);
        } catch (IOException unused) {
        }
    }

    public final synchronized w k(int i) {
        return (w) this.f22040w.get(Integer.valueOf(i));
    }

    public final synchronized int m() {
        int i;
        b2.t tVar = this.I;
        if ((tVar.f1592a & 16) != 0) {
            i = tVar.f1593b[4];
        } else {
            i = Integer.MAX_VALUE;
        }
        return i;
    }

    public final synchronized void o(jg.a aVar) {
        synchronized (this) {
        }
        if (!this.A) {
            this.C.execute(aVar);
        }
    }

    public final synchronized w p(int i) {
        w wVar;
        wVar = (w) this.f22040w.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void r(int i) {
        synchronized (this.L) {
            synchronized (this) {
                if (this.A) {
                    return;
                }
                this.A = true;
                this.L.m(jg.b.f19199a, this.f22042y, i);
            }
        }
    }

    public final synchronized void w(long j10) {
        long j11 = this.F + j10;
        this.F = j11;
        if (j11 >= this.H.b() / 2) {
            H(0, this.F);
            this.F = 0L;
        }
    }
}
