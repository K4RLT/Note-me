package b2;
import b2.d1;
import d1.p;
import d1.q;
import l.a;
import r0.b;
import r0.e;
import t0.e;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.gms.internal.ads.bl0;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.cs1;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.qu0;
import com.google.android.gms.internal.ads.qw1;
import com.google.android.gms.internal.ads.tw1;
import com.google.android.gms.internal.ads.uw1;
import com.google.android.gms.internal.measurement.e4;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d1 implements tw1 {

    /* renamed from: u, reason: collision with root package name */
    public boolean f1430u;

    /* renamed from: v, reason: collision with root package name */
    public int f1431v;

    /* renamed from: w, reason: collision with root package name */
    public Object f1432w;

    /* renamed from: x, reason: collision with root package name */
    public Object f1433x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1434y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f1435z;

    public /* synthetic */ d1(MediaCodec mediaCodec, HandlerThread handlerThread, uw1 uw1Var, e4 e4Var) {
        this.f1432w = mediaCodec;
        this.f1433x = new qw1(handlerThread);
        this.f1434y = uw1Var;
        this.f1435z = e4Var;
        this.f1431v = 0;
    }

    public static String k(int i, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i == 1) {
            sb2.append("Audio");
        } else if (i == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public ByteBuffer B(int i) {
        return ((MediaCodec) this.f1432w).getInputBuffer(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x0038, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002a, B:20:0x0044, B:23:0x0038, B:24:0x0046, B:25:0x004b), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.tw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1434y
            com.google.android.gms.internal.ads.uw1 r0 = (com.google.android.gms.internal.ads.uw1) r0
            e()
            java.lang.Object r0 = r7.f1433x
            com.google.android.gms.internal.ads.qw1 r0 = (com.google.android.gms.internal.ads.qw1) r0
            java.lang.Object r1 = r0.f9998a
            monitor-enter(r1)
            b()     // Catch: java.lang.Throwable -> L28
            long r2 = r0.f10007l     // Catch: java.lang.Throwable -> L28
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L22
            boolean r2 = r0.f10008m     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L20
            goto L22
        L20:
            r2 = r3
            goto L23
        L22:
            r2 = r4
        L23:
            r5 = -1
            if (r2 == 0) goto L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            return r5
        L28:
            r0 = move-exception
            goto L4c
        L2a:
            androidx.datastore.preferences.protobuf.i r0 = r0.f10001d     // Catch: java.lang.Throwable -> L28
            int r2 = r0.f734v     // Catch: java.lang.Throwable -> L28
            int r6 = r0.f735w     // Catch: java.lang.Throwable -> L28
            if (r2 != r6) goto L33
            r3 = r4
        L33:
            if (r3 == 0) goto L36
            goto L44
        L36:
            if (r2 == r6) goto L46
            java.lang.Object r3 = r0.f737y     // Catch: java.lang.Throwable -> L28
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L28
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L28
            int r2 = r2 + r4
            int r3 = r0.f736x     // Catch: java.lang.Throwable -> L28
            r2 = r2 & r3
            r0.f734v = r2     // Catch: java.lang.Throwable -> L28
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            return r5
        L46:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            throw r0     // Catch: java.lang.Throwable -> L28
        L4c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d1.a():int");
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f1432w).getOutputBuffer(i);
    }

    public boolean c(int i, int i10) {
        e eVar = (e) this.f1433x;
        int i11 = this.f1431v;
        p pVar = (p) eVar.f25617u[i + i11];
        p pVar2 = (p) ((e) this.f1434y).f25617u[i11 + i10];
        if (kotlin.jvm.internal.a(pVar, pVar2) || pVar.getClass() == pVar2.getClass()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r7 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.media.MediaFormat r6, android.view.Surface r7, int r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1433x
            com.google.android.gms.internal.ads.qw1 r0 = (com.google.android.gms.internal.ads.qw1) r0
            java.lang.Object r1 = r5.f1432w
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1
            android.os.Handler r2 = r0.f10000c
            r3 = 1
            if (r2 != 0) goto Lf
            r2 = r3
            goto L10
        Lf:
            r2 = 0
        L10:
            com.google.android.gms.internal.ads.b80.K(r2)
            android.os.HandlerThread r2 = r0.f9999b
            r2.start()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r2 = r2.getLooper()
            r4.<init>(r2)
            r1.setCallback(r0, r4)
            r0.f10000c = r4
            java.lang.String r0 = "configureCodec"
            android.os.Trace.beginSection(r0)
            r0 = 0
            r1.configure(r6, r7, r0, r8)
            android.os.Trace.endSection()
            java.lang.Object r6 = r5.f1434y
            com.google.android.gms.internal.ads.uw1 r6 = (com.google.android.gms.internal.ads.uw1) r6
            r6.mo209zza()
            java.lang.String r6 = "startCodec"
            android.os.Trace.beginSection(r6)
            r1.start()
            android.os.Trace.endSection()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 35
            if (r6 < r7) goto L68
            java.lang.Object r6 = r5.f1435z
            com.google.android.gms.internal.measurement.e4 r6 = (com.google.android.gms.internal.measurement.e4) r6
            if (r6 == 0) goto L68
            java.lang.Object r7 = r6.f13729w
            android.media.LoudnessCodecController r7 = (android.media.LoudnessCodecController) r7
            if (r7 == 0) goto L5d
            boolean r7 = com.google.android.gms.internal.ads.pa.g(r7, r1)
            if (r7 != 0) goto L5d
            goto L68
        L5d:
            java.lang.Object r6 = r6.f13728v
            java.util.HashSet r6 = (java.util.HashSet) r6
            boolean r6 = r6.add(r1)
            com.google.android.gms.internal.ads.b80.K(r6)
        L68:
            r5.f1431v = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d1.d(android.media.MediaFormat, android.view.Surface, int):void");
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public MediaFormat e() {
        MediaFormat mediaFormat;
        qw1 qw1Var = (qw1) this.f1433x;
        synchronized (qw1Var.f9998a) {
            try {
                mediaFormat = qw1Var.f10004h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void f(ArrayList arrayList) {
        ((MediaCodec) this.f1432w).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void g(int i, cs1 cs1Var, long j10, int i10) {
        ((uw1) this.f1434y).c(i, cs1Var, j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void h() {
        e4 e4Var;
        e4 e4Var2;
        e4 e4Var3;
        try {
            try {
                if (this.f1431v == 1) {
                    ((uw1) this.f1434y).b();
                    qw1 qw1Var = (qw1) this.f1433x;
                    synchronized (qw1Var.f9998a) {
                        qw1Var.f10008m = true;
                        qw1Var.f9999b.quit();
                        qw1Var.a();
                    }
                }
                this.f1431v = 2;
                if (!this.f1430u) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30 && i < 33) {
                        ((MediaCodec) this.f1432w).stop();
                    }
                    if (i >= 35 && (e4Var3 = (e4) this.f1435z) != null) {
                        e4Var3.n((MediaCodec) this.f1432w);
                    }
                    ((MediaCodec) this.f1432w).release();
                    this.f1430u = true;
                }
            } catch (Throwable th) {
                if (!this.f1430u) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        ((MediaCodec) this.f1432w).stop();
                    }
                    if (i10 >= 35 && (e4Var2 = (e4) this.f1435z) != null) {
                        e4Var2.n((MediaCodec) this.f1432w);
                    }
                    ((MediaCodec) this.f1432w).release();
                    this.f1430u = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (e4Var = (e4) this.f1435z) != null) {
                e4Var.n((MediaCodec) this.f1432w);
            }
            ((MediaCodec) this.f1432w).release();
            this.f1430u = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void i() {
        ((uw1) this.f1434y).a();
        MediaCodec mediaCodec = (MediaCodec) this.f1432w;
        mediaCodec.flush();
        qw1 qw1Var = (qw1) this.f1433x;
        synchronized (qw1Var.f9998a) {
            qw1Var.f10007l++;
            Handler handler = qw1Var.f10000c;
            String str = bq0.f4860a;
            handler.post(new qu0(18, qw1Var));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void j(Bundle bundle) {
        ((uw1) this.f1434y).d(bundle);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void l(Surface surface) {
        ((MediaCodec) this.f1432w).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void m(int i) {
        ((MediaCodec) this.f1432w).releaseOutputBuffer(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0028, DONT_GENERATE, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0036, B:22:0x003a, B:24:0x0048, B:26:0x004c, B:27:0x0071, B:30:0x0062, B:33:0x0066, B:34:0x0073, B:35:0x0078), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:4:0x000e, B:6:0x001b, B:12:0x0026, B:15:0x002b, B:19:0x0036, B:22:0x003a, B:24:0x0048, B:26:0x004c, B:27:0x0071, B:30:0x0062, B:33:0x0066, B:34:0x0073, B:35:0x0078), top: B:3:0x000e }] */
    @Override // com.google.android.gms.internal.ads.tw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int n(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1434y
            com.google.android.gms.internal.ads.uw1 r0 = (com.google.android.gms.internal.ads.uw1) r0
            e()
            java.lang.Object r0 = r10.f1433x
            com.google.android.gms.internal.ads.qw1 r0 = (com.google.android.gms.internal.ads.qw1) r0
            java.lang.Object r1 = r0.f9998a
            monitor-enter(r1)
            b()     // Catch: java.lang.Throwable -> L28
            long r2 = r0.f10007l     // Catch: java.lang.Throwable -> L28
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L22
            boolean r2 = r0.f10008m     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L20
            goto L22
        L20:
            r2 = r3
            goto L23
        L22:
            r2 = r4
        L23:
            r5 = -1
            if (r2 == 0) goto L2b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            return r5
        L28:
            r0 = move-exception
            r11 = r0
            goto L79
        L2b:
            androidx.datastore.preferences.protobuf.i r2 = e     // Catch: java.lang.Throwable -> L28
            int r6 = r2.f734v     // Catch: java.lang.Throwable -> L28
            int r7 = r2.f735w     // Catch: java.lang.Throwable -> L28
            if (r6 != r7) goto L34
            r3 = r4
        L34:
            if (r3 == 0) goto L38
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            return r5
        L38:
            if (r6 == r7) goto L73
            java.lang.Object r3 = r2.f737y     // Catch: java.lang.Throwable -> L28
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L28
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L28
            int r6 = r6 + r4
            int r4 = r2.f736x     // Catch: java.lang.Throwable -> L28
            r4 = r4 & r6
            r2.f734v = r4     // Catch: java.lang.Throwable -> L28
            if (r3 < 0) goto L63
            android.media.MediaFormat r2 = r0.f10004h     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L61
            java.util.ArrayDeque r0 = r0.f10002f     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L28
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L28
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L28
            int r6 = r0.size     // Catch: java.lang.Throwable -> L28
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L28
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L28
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L28
            goto L71
        L61:
            r11 = 0
            throw r11     // Catch: java.lang.Throwable -> L28
        L63:
            r11 = -2
            if (r3 != r11) goto L71
            java.util.ArrayDeque r2 = r0.f10003g     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L28
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch: java.lang.Throwable -> L28
            r0.f10004h = r2     // Catch: java.lang.Throwable -> L28
            r3 = r11
        L71:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            return r3
        L73:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L28
            r11.<init>()     // Catch: java.lang.Throwable -> L28
            throw r11     // Catch: java.lang.Throwable -> L28
        L79:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d1.n(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void o(int i) {
        ((MediaCodec) this.f1432w).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void p() {
        ((MediaCodec) this.f1432w).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public boolean r(bl0 bl0Var) {
        qw1 qw1Var = (qw1) this.f1433x;
        synchronized (qw1Var.f9998a) {
            qw1Var.f10010o = bl0Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void v(int i, int i10, int i11, long j10) {
        ((uw1) this.f1434y).f(i, i10, i11, j10);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void w(ou1 ou1Var) {
        iv1 iv1Var = new iv1(this, 1, ou1Var);
        qw1 qw1Var = (qw1) this.f1433x;
        synchronized (qw1Var.f9998a) {
            qw1Var.b();
            iv1Var.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void x(int i, long j10) {
        ((MediaCodec) this.f1432w).releaseOutputBuffer(i, j10);
    }

    public d1(f1 f1Var, q qVar, int i, e eVar, e eVar2, boolean z3) {
        this.f1435z = f1Var;
        this.f1432w = qVar;
        this.f1431v = i;
        this.f1433x = eVar;
        this.f1434y = eVar2;
        this.f1430u = z3;
    }
}
