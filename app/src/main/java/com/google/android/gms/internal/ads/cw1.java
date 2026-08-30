package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class cw1 {
    public static final AtomicInteger Y = new AtomicInteger();
    public long A;
    public int B;
    public boolean C;
    public boolean D;
    public long E;
    public long F;
    public float G;
    public ByteBuffer H;
    public int I;
    public ByteBuffer J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public yd0 Q;
    public AudioDeviceInfo R;
    public int S;
    public long T;
    public long U;
    public long V;
    public Handler W;
    public final hq0 X;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5188a;

    /* renamed from: b, reason: collision with root package name */
    public final wv1 f5189b;

    /* renamed from: c, reason: collision with root package name */
    public final hw1 f5190c;

    /* renamed from: d, reason: collision with root package name */
    public final c40 f5191d;
    public final c40 e;

    /* renamed from: f, reason: collision with root package name */
    public final y51 f5192f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5193g;

    /* renamed from: h, reason: collision with root package name */
    public xv1 f5194h;
    public final ra i;

    /* renamed from: j, reason: collision with root package name */
    public final ra f5195j;

    /* renamed from: k, reason: collision with root package name */
    public tu1 f5196k;

    /* renamed from: l, reason: collision with root package name */
    public lt0 f5197l;

    /* renamed from: m, reason: collision with root package name */
    public zv1 f5198m;

    /* renamed from: n, reason: collision with root package name */
    public zv1 f5199n;

    /* renamed from: o, reason: collision with root package name */
    public nz f5200o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.android.gms.internal.mlkit_vision_digital_ink.lw f5201p;

    /* renamed from: q, reason: collision with root package name */
    public aw1 f5202q;

    /* renamed from: r, reason: collision with root package name */
    public tv1 f5203r;

    /* renamed from: s, reason: collision with root package name */
    public l50 f5204s;

    /* renamed from: t, reason: collision with root package name */
    public bw1 f5205t;

    /* renamed from: u, reason: collision with root package name */
    public bw1 f5206u;

    /* renamed from: v, reason: collision with root package name */
    public vb f5207v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5208w;

    /* renamed from: x, reason: collision with root package name */
    public long f5209x;

    /* renamed from: y, reason: collision with root package name */
    public long f5210y;

    /* renamed from: z, reason: collision with root package name */
    public long f5211z;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0081, code lost:
    
        r9 = r0.getDeviceId();
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.hw1, com.google.android.gms.internal.ads.e20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.yd0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.android.gms.internal.ads.wv1, com.google.android.gms.internal.ads.e20, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cw1(com.google.android.gms.internal.ads.yv1 r9) {
        /*
            r8 = this;
            r8.<init>()
            android.content.Context r0 = r9.f12979a
            if (r0 != 0) goto L9
            r1 = 0
            goto Ld
        L9:
            android.content.Context r1 = r0.getApplicationContext()
        Ld:
            r8.f5188a = r1
            com.google.android.gms.internal.ads.l50 r1 = com.google.android.gms.internal.ads.l50.f7948b
            r8.f5204s = r1
            com.google.android.gms.internal.ads.hq0 r1 = r9.f12983f
            r8.X = r1
            com.google.android.gms.internal.mlkit_vision_digital_ink.lw r9 = r9.e
            r8.f5201p = r9
            com.google.android.gms.internal.ads.wv1 r9 = new com.google.android.gms.internal.ads.wv1
            r9.<init>()
            r8.f5189b = r9
            com.google.android.gms.internal.ads.hw1 r1 = new com.google.android.gms.internal.ads.hw1
            r1.<init>()
            byte[] r2 = com.google.android.gms.internal.ads.bq0.f4861b
            r1.f6908m = r2
            r8.f5190c = r1
            com.google.android.gms.internal.ads.c40 r2 = new com.google.android.gms.internal.ads.c40
            r3 = 0
            r2.<init>(r3)
            r8.f5191d = r2
            com.google.android.gms.internal.ads.c40 r2 = new com.google.android.gms.internal.ads.c40
            r3 = 1
            r2.<init>(r3)
            r8.e = r2
            com.google.android.gms.internal.ads.y51 r9 = com.google.android.gms.internal.ads.d51.r(r1, r9)
            r8.f5192f = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.G = r9
            r9 = 0
            r8.O = r9
            com.google.android.gms.internal.ads.yd0 r1 = new com.google.android.gms.internal.ads.yd0
            r1.<init>()
            r8.Q = r1
            com.google.android.gms.internal.ads.bw1 r2 = new com.google.android.gms.internal.ads.bw1
            com.google.android.gms.internal.ads.vb r3 = com.google.android.gms.internal.ads.vb.f11869d
            r4 = 0
            r6 = 0
            r2.<init>(r3, r4, r6)
            r8.f5206u = r2
            r8.f5207v = r3
            r8.f5208w = r9
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>()
            r8.f5193g = r9
            com.google.android.gms.internal.ads.ra r9 = new com.google.android.gms.internal.ads.ra
            r9.<init>()
            r8.i = r9
            com.google.android.gms.internal.ads.ra r9 = new com.google.android.gms.internal.ads.ra
            r9.<init>()
            r8.f5195j = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = -1
            if (r9 < r1) goto L8a
            if (r0 != 0) goto L81
            goto L8a
        L81:
            int r9 = androidx.ink.rendering.android.canvas.internal.a.a(r0)
            if (r9 == 0) goto L8a
            if (r9 == r2) goto L8a
            r2 = r9
        L8a:
            r8.S = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.<init>(com.google.android.gms.internal.ads.yv1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r9, java.nio.ByteBuffer r10) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.c(int, java.nio.ByteBuffer):int");
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public final void a() {
        if (l()) {
            this.f5209x = 0L;
            this.f5210y = 0L;
            this.f5211z = 0L;
            this.A = 0L;
            this.B = 0;
            this.f5206u = new bw1(this.f5207v, 0L, 0L);
            this.E = 0L;
            this.f5205t = null;
            this.f5193g.clear();
            this.H = null;
            this.I = 0;
            this.J = null;
            this.L = false;
            this.K = false;
            this.M = false;
            this.f5190c.f6910o = 0L;
            d(-9223372036854775807L);
            this.f5194h = null;
            zv1 zv1Var = this.f5198m;
            if (zv1Var != null) {
                this.f5199n = zv1Var;
                this.f5198m = null;
            }
            Y.incrementAndGet();
            tv1 tv1Var = this.f5203r;
            if (tv1Var.e.f12032d.getPlayState() == 3) {
                tv1Var.f11456a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && tv1Var.b()) {
                hq0 hq0Var = tv1Var.f11462h;
                hq0Var.getClass();
                ((tv1) hq0Var.f6874x).f11456a.unregisterStreamEventCallback((sv1) hq0Var.f6873w);
                ((Handler) hq0Var.f6872v).removeCallbacksAndMessages(null);
            }
            na1 na1Var = tv1Var.f11459d;
            if (na1Var != null) {
                qv1 qv1Var = (qv1) na1Var.e;
                qv1Var.getClass();
                ((AudioTrack) na1Var.f8630b).removeOnRoutingChangedListener(qv1Var);
                na1Var.e = null;
                tv1Var.f11459d = null;
            }
            AudioTrack audioTrack = tv1Var.f11456a;
            ig0 ig0Var = tv1Var.i;
            Handler p10 = bq0.p();
            synchronized (tv1.f11453o) {
                try {
                    if (tv1.f11454p == null) {
                        tv1.f11454p = Executors.newSingleThreadScheduledExecutor(new Object());
                    }
                    tv1.f11455q++;
                    tv1.f11454p.schedule(new r1(16, audioTrack, p10, ig0Var), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5203r = null;
        }
        ra raVar = this.f5195j;
        raVar.f10164w = null;
        raVar.f10162u = -9223372036854775807L;
        raVar.f10163v = -9223372036854775807L;
        ra raVar2 = this.i;
        raVar2.f10164w = null;
        raVar2.f10162u = -9223372036854775807L;
        raVar2.f10163v = -9223372036854775807L;
        this.U = 0L;
        this.V = 0L;
        Handler handler = this.W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        a();
        y51 y51Var = this.f5192f;
        int i = y51Var.f12783x;
        for (int i10 = 0; i10 < i; i10++) {
            ((t10) y51Var.get(i10)).f();
        }
        this.f5191d.f();
        this.e.f();
        nz nzVar = this.f5200o;
        if (nzVar != null) {
            int i11 = 0;
            while (true) {
                d51 d51Var = nzVar.f8893a;
                if (i11 >= d51Var.size()) {
                    break;
                }
                t10 t10Var = (t10) d51Var.get(i11);
                t10Var.i(w00.f12087d);
                t10Var.f();
                i11++;
            }
            nzVar.f8894b.clear();
            nzVar.f8895c = new ByteBuffer[0];
            a00 a00Var = a00.e;
            nzVar.f8896d = false;
        }
        this.N = false;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, com.google.android.gms.internal.ads.n00] */
    public final void d(long j10) {
        long j11;
        zv1 zv1Var = this.f5199n;
        this.f5200o = (nz) zv1Var.f13281f;
        if (j10 == -9223372036854775807L) {
            j11 = 0;
        } else {
            j11 = j10 - this.F;
            if (((uh) zv1Var.f13282g) != uh.f11636a && zv1Var.f13283h != null) {
                qg qgVar = new qg();
                zv1 zv1Var2 = this.f5199n;
                ((uh) zv1Var2.f13282g).o(zv1Var2.f13283h, qgVar);
            }
        }
        nz nzVar = this.f5200o;
        n00 n00Var = new n00(0);
        zv1 zv1Var3 = this.f5199n;
        n00Var.f8505b = (uh) zv1Var3.f13282g;
        n00Var.f8506c = zv1Var3.f13283h;
        n00Var.f8504a = j11;
        w00 d2 = n00Var.d();
        ArrayList arrayList = nzVar.f8894b;
        arrayList.clear();
        nzVar.f8896d = false;
        int i = 0;
        while (true) {
            d51 d51Var = nzVar.f8893a;
            if (i >= d51Var.size()) {
                break;
            }
            t10 t10Var = (t10) d51Var.get(i);
            t10Var.i(d2);
            if (t10Var.c()) {
                Object obj = new Object();
                long j12 = d2.f12088a;
                obj.f8504a = j12;
                obj.f8505b = d2.f12089b;
                obj.f8506c = d2.f12090c;
                obj.f8504a = t10Var.d(j12);
                d2 = obj.d();
                arrayList.add(t10Var);
            }
            i++;
        }
        nzVar.f8895c = new ByteBuffer[arrayList.size()];
        for (int i10 = 0; i10 <= nzVar.e(); i10++) {
            nzVar.f8895c[i10] = ((t10) arrayList.get(i10)).b();
        }
    }

    public final tv1 e(gv1 gv1Var) {
        try {
            return this.f5201p.h(gv1Var);
        } catch (fv1 e) {
            int i = gv1Var.f6482b;
            int i10 = gv1Var.f6483c;
            int i11 = gv1Var.f6481a;
            int i12 = gv1Var.f6484d;
            String valueOf = String.valueOf((mw1) this.f5199n.f13279c);
            int length = String.valueOf(i).length();
            int length2 = String.valueOf(i10).length();
            int length3 = String.valueOf(i11).length();
            StringBuilder sb2 = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i12).length() + 2 + valueOf.length());
            g3.a.r(i, i10, "AudioTrack init failed 0 Config(", ", ", sb2);
            g3.a.r(i11, i12, ", ", ", ", sb2);
            Exception exc = new Exception(p.a.o(sb2, ") ", valueOf, ""), e);
            lt0 lt0Var = this.f5197l;
            if (lt0Var != null) {
                lt0Var.h(exc);
                throw exc;
            }
            throw exc;
        }
    }

    public final void f() {
        ByteBuffer byteBuffer;
        i();
        if (this.J == null) {
            if (this.f5200o.b()) {
                while (!this.f5200o.c()) {
                    do {
                        nz nzVar = this.f5200o;
                        if (!nzVar.b()) {
                            byteBuffer = t10.f11228a;
                        } else {
                            ByteBuffer byteBuffer2 = nzVar.f8895c[nzVar.e()];
                            if (byteBuffer2.hasRemaining()) {
                                byteBuffer = byteBuffer2;
                            } else {
                                nzVar.d(t10.f11228a);
                                byteBuffer = nzVar.f8895c[nzVar.e()];
                            }
                        }
                        if (byteBuffer.hasRemaining()) {
                            h(byteBuffer);
                            i();
                        } else {
                            ByteBuffer byteBuffer3 = this.H;
                            if (byteBuffer3 != null && byteBuffer3.hasRemaining()) {
                                nz nzVar2 = this.f5200o;
                                ByteBuffer byteBuffer4 = this.H;
                                if (nzVar2.b() && !nzVar2.f8896d) {
                                    nzVar2.d(byteBuffer4);
                                }
                            } else {
                                return;
                            }
                        }
                    } while (this.J == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer5 = this.H;
            if (byteBuffer5 != null) {
                h(byteBuffer5);
                i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.nz r0 = r4.f5200o
            boolean r0 = r0.b()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L12
            r4.i()
            java.nio.ByteBuffer r0 = r4.J
            if (r0 != 0) goto L43
            goto L42
        L12:
            com.google.android.gms.internal.ads.nz r0 = r4.f5200o
            boolean r3 = r0.b()
            if (r3 == 0) goto L2c
            boolean r3 = r0.f8896d
            if (r3 == 0) goto L1f
            goto L2c
        L1f:
            r0.f8896d = r2
            java.util.ArrayList r0 = r0.f8894b
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.t10 r0 = (com.google.android.gms.internal.ads.t10) r0
            r0.a()
        L2c:
            r4.f()
            com.google.android.gms.internal.ads.nz r0 = r4.f5200o
            boolean r0 = r0.c()
            if (r0 == 0) goto L43
            java.nio.ByteBuffer r0 = r4.J
            if (r0 == 0) goto L42
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L42
            goto L43
        L42:
            return r2
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.g():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
    
        if (r3 < 0.0f) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        if (r3 < 0.0d) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        r3 = (-r3) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c3, code lost:
    
        r3 = r3 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e0, code lost:
    
        if (r3 < 0.0f) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e2, code lost:
    
        r3 = (-r3) * (-2.14748365E9f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e8, code lost:
    
        r3 = r3 * 2.14748365E9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f9, code lost:
    
        if (r3 < 0.0d) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.nio.ByteBuffer r28) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.h(java.nio.ByteBuffer):void");
    }

    public final void i() {
        if (this.J != null) {
            ra raVar = this.f5195j;
            if (((Exception) raVar.f10164w) == null || (Y.get() <= 0 && SystemClock.elapsedRealtime() >= raVar.f10163v)) {
                int remaining = this.J.remaining();
                boolean z3 = false;
                try {
                    boolean a10 = this.f5203r.a(this.I, this.J);
                    this.T = SystemClock.elapsedRealtime();
                    raVar.f10164w = null;
                    raVar.f10162u = -9223372036854775807L;
                    raVar.f10163v = -9223372036854775807L;
                    this.f5203r.b();
                    if (this.f5199n.c()) {
                        this.f5211z += remaining - this.J.remaining();
                    }
                    if (a10) {
                        if (!this.f5199n.c()) {
                            if (this.J == this.H) {
                                z3 = true;
                            }
                            b80.K(z3);
                            this.A = (this.B * this.I) + this.A;
                        }
                        this.J = null;
                    }
                } catch (av1 e) {
                    boolean z9 = e.f4618v;
                    if (z9) {
                        if (m() <= 0) {
                            if (this.f5203r.b()) {
                                this.f5199n.getClass();
                            }
                        }
                        z3 = true;
                    }
                    nv1 nv1Var = new nv1(e.f4617u, (mw1) this.f5199n.f13279c, z3);
                    lt0 lt0Var = this.f5197l;
                    if (lt0Var != null) {
                        lt0Var.h(nv1Var);
                    }
                    if (!z9) {
                        raVar.a(nv1Var);
                        return;
                    }
                    throw nv1Var;
                }
            }
        }
    }

    public final void j() {
        if (this.f5199n != null) {
            zv1 zv1Var = this.f5198m;
            if (zv1Var != null) {
                this.f5199n = zv1Var;
                this.f5198m = null;
            }
            try {
                this.f5199n = this.f5199n.b(this.f5201p.f(n((mw1) this.f5199n.f13280d)));
            } catch (bv1 e) {
                androidx.datastore.preferences.protobuf.s1.r(new lv1(e, (mw1) this.f5199n.f13279c));
                return;
            }
        }
        a();
    }

    public final void k(long j10) {
        vb vbVar;
        boolean z3;
        boolean z9;
        boolean c10 = this.f5199n.c();
        boolean z10 = false;
        hq0 hq0Var = this.X;
        if (c10) {
            int i = ((mw1) this.f5199n.f13279c).K;
            vbVar = this.f5207v;
            w30 w30Var = (w30) hq0Var.f6874x;
            float f10 = vbVar.f11870a;
            w30Var.getClass();
            if (f10 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.l(z3);
            if (w30Var.f12116c != f10) {
                w30Var.f12116c = f10;
                w30Var.i = true;
            }
            float f11 = vbVar.f11871b;
            if (f11 > 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            b80.l(z9);
            if (w30Var.f12117d != f11) {
                w30Var.f12117d = f11;
                w30Var.i = true;
            }
        } else {
            vbVar = vb.f11869d;
        }
        vb vbVar2 = vbVar;
        this.f5207v = vbVar2;
        if (this.f5199n.c()) {
            int i10 = ((mw1) this.f5199n.f13279c).K;
            z10 = this.f5208w;
            ((fw1) hq0Var.f6873w).f6193j = z10;
        }
        this.f5208w = z10;
        this.f5193g.add(new bw1(vbVar2, Math.max(0L, j10), bq0.v(((gv1) this.f5199n.e).f6482b, m())));
        d(j10);
        lt0 lt0Var = this.f5197l;
        if (lt0Var != null) {
            boolean z11 = this.f5208w;
            mu muVar = ((ew1) lt0Var.f8135v).Z0;
            Handler handler = (Handler) muVar.f8422v;
            if (handler != null) {
                handler.post(new lt(2, muVar, z11));
            }
        }
    }

    public final boolean l() {
        return this.f5203r != null;
    }

    public final long m() {
        if (this.f5199n.c()) {
            long j10 = this.f5211z;
            long j11 = this.f5199n.f13278b;
            String str = bq0.f4860a;
            return ((j10 + j11) - 1) / j11;
        }
        return this.A;
    }

    public final cv1 n(mw1 mw1Var) {
        cv1 cv1Var = new cv1(mw1Var);
        cv1Var.f5184b = this.f5204s;
        cv1Var.f5185c = this.R;
        cv1Var.f5186d = this.O;
        cv1Var.f5187f = -1;
        cv1Var.e = this.S;
        return new cv1(cv1Var);
    }

    public final void o() {
        if (!this.L) {
            this.L = true;
            if (this.f5203r.b()) {
                this.M = false;
            }
            tv1 tv1Var = this.f5203r;
            if (!tv1Var.f11463j) {
                tv1Var.f11463j = true;
                vv1 vv1Var = tv1Var.e;
                long d2 = tv1Var.d();
                vv1Var.f12049w = vv1Var.c();
                vv1Var.f12030b.getClass();
                vv1Var.f12047u = bq0.u(SystemClock.elapsedRealtime());
                vv1Var.f12050x = d2;
                tv1Var.f11456a.stop();
            }
        }
    }

    public final int p(mw1 mw1Var) {
        boolean z3;
        int i = mw1Var.K;
        if (bq0.d(i) && i != 2) {
            rv1 rv1Var = new rv1(mw1Var);
            rv1Var.J = 2;
            mw1Var = new mw1(rv1Var);
            z3 = true;
        } else {
            z3 = false;
        }
        int i10 = this.f5201p.e(n(mw1Var)).f5833d;
        if (i10 != 1) {
            if (i10 != 2) {
                return 0;
            }
            if (!z3) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    public final void q(kv1 kv1Var) {
        nz nzVar;
        int i;
        int i10;
        mw1 mw1Var;
        Object obj;
        aw1 aw1Var = this.f5202q;
        com.google.android.gms.internal.mlkit_vision_digital_ink.lw lwVar = this.f5201p;
        if (aw1Var == null && this.f5188a != null) {
            aw1 aw1Var2 = new aw1(this);
            this.f5202q = aw1Var2;
            lwVar.j();
            if (((ig0) lwVar.f14645w) == null) {
                lwVar.f14645w = new ig0(Thread.currentThread());
            }
            ((ig0) lwVar.f14645w).a(aw1Var2);
        }
        mw1 mw1Var2 = kv1Var.f7888a;
        String str = mw1Var2.f8459o;
        int i11 = mw1Var2.H;
        int i12 = -1;
        if ("audio/raw".equals(str)) {
            int i13 = mw1Var2.K;
            b80.l(bq0.d(i13));
            i = bq0.f(i13) * i11;
            y41 y41Var = new y41(4);
            y41Var.b(this.f5192f);
            y41Var.a(this.f5191d);
            t10[] t10VarArr = (t10[]) this.X.f6872v;
            ct.h(t10VarArr, 2);
            y41Var.e(2);
            System.arraycopy(t10VarArr, 0, y41Var.f12774a, y41Var.f12775b, 2);
            y41Var.f12775b += 2;
            nzVar = new nz(y41Var.f());
            if (nzVar.equals(this.f5200o)) {
                nzVar = this.f5200o;
            }
            int i14 = mw1Var2.L;
            int i15 = mw1Var2.M;
            hw1 hw1Var = this.f5190c;
            hw1Var.i = i14;
            hw1Var.f6905j = i15;
            this.f5189b.i = kv1Var.f7889b;
            try {
                a00 a10 = nzVar.a(new a00(mw1Var2.J, i11, i13));
                rv1 rv1Var = new rv1(mw1Var2);
                int i16 = a10.f4301c;
                rv1Var.J = i16;
                rv1Var.I = a10.f4299a;
                int i17 = a10.f4300b;
                rv1Var.G = i17;
                if (i17 == i11) {
                    i12 = mw1Var2.I;
                }
                rv1Var.H = i12;
                mw1Var = new mw1(rv1Var);
                i10 = bq0.f(i16) * i17;
            } catch (i10 e) {
                throw new lv1(e, mw1Var2);
            }
        } else {
            nzVar = new nz(y51.f12781y);
            i = -1;
            i10 = -1;
            mw1Var = mw1Var2;
        }
        nz nzVar2 = nzVar;
        cv1 n10 = n(mw1Var);
        mw1 mw1Var3 = n10.f5183a;
        try {
            gv1 f10 = lwVar.f(n10);
            if (f10.f6481a != 0) {
                if (f10.f6483c != 0) {
                    uh uhVar = kv1Var.f7890c;
                    yx1 yx1Var = kv1Var.f7891d;
                    if (yx1Var != null) {
                        obj = yx1Var.f13003a;
                    } else {
                        obj = null;
                    }
                    zv1 zv1Var = new zv1(mw1Var2, mw1Var, i, i10, f10, nzVar2, uhVar, obj);
                    if (l()) {
                        this.f5198m = zv1Var;
                        return;
                    } else {
                        this.f5199n = zv1Var;
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new lv1(sb2.toString(), mw1Var3);
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 36);
            sb3.append("Invalid output encoding (isOffload=false)");
            throw new lv1(sb3.toString(), mw1Var3);
        } catch (bv1 e8) {
            throw new lv1(e8, mw1Var2);
        }
    }

    public final void r() {
        this.N = true;
        if (l()) {
            tv1 tv1Var = this.f5203r;
            vv1 vv1Var = tv1Var.e;
            if (vv1Var.f12047u != -9223372036854775807L) {
                vv1Var.f12030b.getClass();
                vv1Var.f12047u = bq0.u(SystemClock.elapsedRealtime());
            }
            vv1Var.f12036j = bq0.v(vv1Var.e, vv1Var.c());
            vv1Var.f12035h.a(0);
            if (!tv1Var.f11463j || tv1Var.b()) {
                tv1Var.f11456a.play();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x024e, code lost:
    
        if (r0 != 0) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cw1.s(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean t() {
        if (l()) {
            if (Build.VERSION.SDK_INT < 29 || !this.f5203r.b() || !this.M) {
                long m4 = m();
                long c10 = this.f5203r.c();
                this.f5203r.getClass();
                if (m4 > bq0.w(c10, r2.f11456a.getSampleRate(), 1000000L, RoundingMode.UP)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
