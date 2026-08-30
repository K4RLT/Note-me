package og;
import x.n;
import q.x;

/* loaded from: classes.dex */
public final class v implements sg.t {

    /* renamed from: u, reason: collision with root package name */
    public final sg.f f22059u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final sg.f f22060v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final long f22061w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22062x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f22063y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ w f22064z;

    /* JADX WARN: Type inference failed for: r1v1, types: [sg.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [sg.f, java.lang.Object] */
    public v(w wVar, long j10) {
        this.f22064z = wVar;
        this.f22061w = j10;
    }

    @Override // sg.t
    public final sg.v a() {
        return this.f22064z.i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j10;
        synchronized (this.f22064z) {
            this.f22062x = true;
            sg.f fVar = this.f22060v;
            j10 = fVar.f25274v;
            fVar.skip(j10);
            this.f22064z.e.isEmpty();
            this.f22064z.notifyAll();
        }
        if (j10 > 0) {
            this.f22064z.f22068d.w(j10);
        }
        this.f22064z.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    @Override // sg.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(sg.f r13, long r14) {
        /*
            r12 = this;
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb0
        L6:
            og.w r2 = r12.f22064z
            monitor-enter(r2)
            og.w r3 = r12.f22064z     // Catch: java.lang.Throwable -> L71
            ig.s r3 = r3.i     // Catch: java.lang.Throwable -> L71
            r3.j()     // Catch: java.lang.Throwable -> L71
            og.w r3 = r12.f22064z     // Catch: java.lang.Throwable -> L5b
            int r4 = r3.f22073k     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L17
            goto L18
        L17:
            r4 = 0
        L18:
            boolean r5 = r12.f22062x     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L9e
            java.util.ArrayDeque r3 = r3.e     // Catch: java.lang.Throwable -> L5b
            r3.isEmpty()     // Catch: java.lang.Throwable -> L5b
            sg.f r3 = r12.f22060v     // Catch: java.lang.Throwable -> L5b
            long r5 = r3.f25274v     // Catch: java.lang.Throwable -> L5b
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r8 = -1
            if (r7 <= 0) goto L5d
            long r14 = java.lang.Math.min(r14, r5)     // Catch: java.lang.Throwable -> L5b
            long r13 = r3.q(r13, r14)     // Catch: java.lang.Throwable -> L5b
            og.w r15 = r12.f22064z     // Catch: java.lang.Throwable -> L5b
            long r5 = r15.f22065a     // Catch: java.lang.Throwable -> L5b
            long r5 = r5 + r13
            r15.f22065a = r5     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L81
            og.r r15 = r15.f22068d     // Catch: java.lang.Throwable -> L5b
            b2.t r15 = r15.H     // Catch: java.lang.Throwable -> L5b
            int r15 = r15.b()     // Catch: java.lang.Throwable -> L5b
            int r15 = r15 / 2
            long r10 = (long) r15     // Catch: java.lang.Throwable -> L5b
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 < 0) goto L81
            og.w r15 = r12.f22064z     // Catch: java.lang.Throwable -> L5b
            og.r r3 = r15.f22068d     // Catch: java.lang.Throwable -> L5b
            int r5 = r15.f22067c     // Catch: java.lang.Throwable -> L5b
            long r6 = r15.f22065a     // Catch: java.lang.Throwable -> L5b
            r3.H(r5, r6)     // Catch: java.lang.Throwable -> L5b
            og.w r15 = r12.f22064z     // Catch: java.lang.Throwable -> L5b
            r15.f22065a = r0     // Catch: java.lang.Throwable -> L5b
            goto L81
        L5b:
            r13 = move-exception
            goto La6
        L5d:
            boolean r3 = r12.f22063y     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L80
            if (r4 != 0) goto L80
            og.w r3 = r12.f22064z     // Catch: java.lang.Throwable -> L5b
            r3.wait()     // Catch: java.lang.Throwable -> L5b java.lang.InterruptedException -> L73
            og.w r3 = r12.f22064z     // Catch: java.lang.Throwable -> L71
            ig.s r3 = r3.i     // Catch: java.lang.Throwable -> L71
            r3.o()     // Catch: java.lang.Throwable -> L71
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
            goto L6
        L71:
            r13 = move-exception
            goto Lae
        L73:
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L5b
            r13.interrupt()     // Catch: java.lang.Throwable -> L5b
            java.io.InterruptedIOException r13 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L5b
            r13.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r13     // Catch: java.lang.Throwable -> L5b
        L80:
            r13 = r8
        L81:
            og.w r15 = r12.f22064z     // Catch: java.lang.Throwable -> L71
            ig.s r15 = r15.i     // Catch: java.lang.Throwable -> L71
            r15.o()     // Catch: java.lang.Throwable -> L71
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 == 0) goto L95
            og.w r15 = r12.f22064z
            og.r r15 = r15.f22068d
            r15.w(r13)
            return r13
        L95:
            if (r4 != 0) goto L98
            return r8
        L98:
            og.a0 r13 = new og.a0
            r13.<init>(r4)
            throw r13
        L9e:
            java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r14 = "stream closed"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L5b
            throw r13     // Catch: java.lang.Throwable -> L5b
        La6:
            og.w r14 = r12.f22064z     // Catch: java.lang.Throwable -> L71
            ig.s r14 = r14.i     // Catch: java.lang.Throwable -> L71
            r14.o()     // Catch: java.lang.Throwable -> L71
            throw r13     // Catch: java.lang.Throwable -> L71
        Lae:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
            throw r13
        Lb0:
            java.lang.String r13 = "byteCount < 0: "
            java.lang.String r13 = g3.a.h(r14, r13)
            x.n(r13)
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: og.v.q(sg.f, long):long");
    }
}
