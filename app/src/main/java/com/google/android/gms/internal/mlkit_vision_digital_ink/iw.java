package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.cs1;
import com.google.android.gms.internal.ads.dp0;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.mb0;
import com.google.android.gms.internal.ads.pf1;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.tw1;
import com.google.android.gms.internal.ads.tz;
import com.google.android.gms.internal.ads.wz;
import com.google.android.gms.internal.ads.x21;
import com.google.android.gms.internal.ads.xe1;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.xt0;
import com.google.android.gms.internal.ads.y51;
import com.google.android.gms.internal.ads.yc1;
import com.google.android.gms.internal.ads.za0;
import com.google.android.gms.internal.ads.zh0;
import com.google.android.gms.internal.ads.zt0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class iw implements c7.d, com.google.android.gms.internal.ads.g2, n9.e, xe1, com.google.android.gms.internal.ads.qn, zh0, tw1, da, uq, ib.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14488u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14489v;

    /* renamed from: w, reason: collision with root package name */
    public Object f14490w;

    public iw(int i) {
        this.f14488u = i;
        switch (i) {
            case 9:
                iw iwVar = ed1.L;
                this.f14489v = new hq0((hq0) iwVar.f14489v);
                this.f14490w = Arrays.copyOf((long[]) iwVar.f14490w, 10);
                return;
            default:
                this.f14489v = new t0.e(new b2.i0[16]);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void A(b2.i0 i0Var) {
        if (i0Var.f1487j0 > 0) {
            if (i0Var.f1478a0.f1548d == b2.e0.f1447y && !i0Var.p() && !i0Var.q() && !i0Var.f1488k0 && i0Var.J()) {
                d1.q qVar = (d1.q) i0Var.Z.A;
                if ((qVar.f15691x & 256) != 0) {
                    while (qVar != null) {
                        if ((qVar.f15690w & 256) != 0) {
                            b2.k kVar = qVar;
                            Object r52 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof b2.o) {
                                    b2.o oVar = (b2.o) kVar;
                                    oVar.h0(b2.l.s(oVar, 256));
                                } else if ((kVar.f15690w & 256) != 0 && (kVar instanceof b2.k)) {
                                    d1.q qVar2 = kVar.J;
                                    int i = 0;
                                    kVar = kVar;
                                    r52 = r52;
                                    while (qVar2 != null) {
                                        if ((qVar2.f15690w & 256) != 0) {
                                            i++;
                                            r52 = r52;
                                            if (i == 1) {
                                                kVar = qVar2;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new t0.e(new d1.q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r52.b(kVar);
                                                    kVar = 0;
                                                }
                                                r52.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.f15693z;
                                        kVar = kVar;
                                        r52 = r52;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                kVar = b2.l.e(r52);
                            }
                        }
                        if ((qVar.f15691x & 256) == 0) {
                            break;
                        } else {
                            qVar = qVar.f15693z;
                        }
                    }
                }
            }
            i0Var.f1486i0 = false;
            t0.e z3 = i0Var.z();
            Object[] objArr = z3.f25617u;
            int i10 = z3.f25619w;
            for (int i11 = 0; i11 < i10; i11++) {
                A((b2.i0) objArr[i11]);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public ByteBuffer B(int i) {
        return ((MediaCodec) this.f14489v).getInputBuffer(i);
    }

    public void C(boolean z3, boolean z9) {
        synchronized (this) {
            boolean z10 = false;
            if (z3) {
                if (((PowerManager.WakeLock) this.f14490w) == null) {
                    Context context = (Context) this.f14489v;
                    if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        x21.F("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (powerManager == null) {
                        x21.F("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        this.f14490w = newWakeLock;
                        newWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f14490w;
            if (wakeLock == null) {
                return;
            }
            if (z3 && z9) {
                z10 = true;
            }
            if (z10) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public int a() {
        return ((MediaCodec) this.f14489v).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public ByteBuffer b(int i) {
        return ((MediaCodec) this.f14489v).getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public Object c() {
        ((s5) this.f14490w).e();
        return (s2) ((lw) this.f14489v).A;
    }

    @Override // n9.e
    public /* synthetic */ Object d(Object obj) {
        com.google.android.gms.internal.ads.as asVar = (com.google.android.gms.internal.ads.as) this.f14489v;
        try {
            ((com.google.android.gms.internal.ads.ks) this.f14490w).A = (com.google.ads.mediation.a) obj;
            asVar.f();
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
        return new com.google.android.gms.internal.ads.is(asVar);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public MediaFormat e() {
        return ((MediaCodec) this.f14489v).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void f(ArrayList arrayList) {
        ((MediaCodec) this.f14489v).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void g(int i, cs1 cs1Var, long j10, int i10) {
        ((MediaCodec) this.f14489v).queueSecureInputBuffer(i, 0, cs1Var.i, j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void h() {
        com.google.android.gms.internal.measurement.e4 e4Var = (com.google.android.gms.internal.measurement.e4) this.f14490w;
        MediaCodec mediaCodec = (MediaCodec) this.f14489v;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && e4Var != null) {
                e4Var.n(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && e4Var != null) {
                e4Var.n(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void i() {
        ((MediaCodec) this.f14489v).flush();
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void j(Bundle bundle) {
        ((MediaCodec) this.f14489v).setParameters(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    @Override // com.google.android.gms.internal.ads.qn
    public JSONObject k() {
        return ((com.google.android.gms.internal.ads.ph) this.f14489v).p();
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void l(Surface surface) {
        ((MediaCodec) this.f14489v).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void m(int i) {
        ((MediaCodec) this.f14489v).releaseOutputBuffer(i, false);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f14489v).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void o(int i) {
        ((MediaCodec) this.f14489v).setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void p() {
        ((MediaCodec) this.f14489v).detachOutputSurface();
    }

    @Override // ib.g
    public ib.o q(Object obj) {
        vc.a aVar = (vc.a) obj;
        com.google.android.gms.internal.ads.xe xeVar = (com.google.android.gms.internal.ads.xe) this.f14489v;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return wa.h8.e(null);
        }
        pw pwVar = (pw) xeVar.f12556c;
        oc.n nVar = (oc.n) pwVar.f14822w;
        oc.n.b((oc.n) pwVar.f14822w);
        nVar.f21909m.u(null, (Executor) this.f14490w);
        nVar.f21913q.d(null);
        return wa.h8.e(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.ph, android.view.View$OnTouchListener] */
    @Override // com.google.android.gms.internal.ads.qn
    public void s(MotionEvent motionEvent) {
        ((com.google.android.gms.internal.ads.ph) this.f14489v).onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.g2
    public com.google.android.gms.internal.ads.f2 t(com.google.android.gms.internal.ads.o2 o2Var, long j10) {
        int d2;
        long n10 = o2Var.n();
        int min = (int) Math.min(20000L, o2Var.p() - n10);
        xk0 xk0Var = (xk0) this.f14490w;
        xk0Var.y(min);
        o2Var.y(xk0Var.f12580a, 0, min);
        int i = -1;
        int i10 = -1;
        long j11 = -9223372036854775807L;
        while (xk0Var.B() >= 4) {
            if (com.google.android.gms.internal.ads.z3.d(xk0Var.f12580a, xk0Var.f12581b) != 442) {
                xk0Var.G(1);
            } else {
                xk0Var.G(4);
                long a10 = com.google.android.gms.internal.ads.y9.a(xk0Var);
                if (a10 != -9223372036854775807L) {
                    long c10 = ((dp0) this.f14489v).c(a10);
                    if (c10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new com.google.android.gms.internal.ads.f2(c10, -1, n10);
                        }
                        return new com.google.android.gms.internal.ads.f2(-9223372036854775807L, 0, n10 + i10);
                    }
                    long j12 = c10 + 100000;
                    int i11 = xk0Var.f12581b;
                    if (j12 > j10) {
                        return new com.google.android.gms.internal.ads.f2(-9223372036854775807L, 0, n10 + i11);
                    }
                    i10 = i11;
                    j11 = c10;
                }
                int i12 = xk0Var.f12582c;
                if (xk0Var.B() < 10) {
                    xk0Var.E(i12);
                } else {
                    xk0Var.G(9);
                    int K = xk0Var.K() & 7;
                    if (xk0Var.B() < K) {
                        xk0Var.E(i12);
                    } else {
                        xk0Var.G(K);
                        if (xk0Var.B() < 4) {
                            xk0Var.E(i12);
                        } else {
                            if (com.google.android.gms.internal.ads.z3.d(xk0Var.f12580a, xk0Var.f12581b) == 443) {
                                xk0Var.G(4);
                                int L = xk0Var.L();
                                if (xk0Var.B() < L) {
                                    xk0Var.E(i12);
                                } else {
                                    xk0Var.G(L);
                                }
                            }
                            while (true) {
                                if (xk0Var.B() < 4 || (d2 = com.google.android.gms.internal.ads.z3.d(xk0Var.f12580a, xk0Var.f12581b)) == 442 || d2 == 441 || (d2 >>> 8) != 1) {
                                    break;
                                }
                                xk0Var.G(4);
                                if (xk0Var.B() < 2) {
                                    xk0Var.E(i12);
                                    break;
                                }
                                xk0Var.E(Math.min(xk0Var.f12582c, xk0Var.f12581b + xk0Var.L()));
                            }
                        }
                    }
                }
                i = xk0Var.f12581b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new com.google.android.gms.internal.ads.f2(j11, -2, n10 + i);
        }
        return com.google.android.gms.internal.ads.f2.f5884d;
    }

    public String toString() {
        switch (this.f14488u) {
            case 12:
                return "propagating=[" + ((da) this.f14490w) + "]";
            default:
                return super.toString();
        }
    }

    @Override // c7.d
    public void u(c7.f fVar) {
        com.google.android.gms.internal.play_billing.t.g("BillingClient", "Reconnection finished with result: " + fVar.f3946a);
        try {
            ((com.google.android.gms.internal.play_billing.c4) this.f14489v).a(fVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingClient", "Exception setting completer.", th);
        }
        c7.c cVar = (c7.c) this.f14490w;
        if (cVar.A != null) {
            t81 t81Var = new t81(this, 4, fVar);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                t81Var.run();
            } else {
                cVar.e.post(t81Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void v(int i, int i10, int i11, long j10) {
        ((MediaCodec) this.f14489v).queueInputBuffer(i, 0, i10, j10, i11);
    }

    @Override // com.google.android.gms.internal.ads.tw1
    public void x(int i, long j10) {
        ((MediaCodec) this.f14489v).releaseOutputBuffer(i, j10);
    }

    @Override // c7.d
    public void y() {
        com.google.android.gms.internal.play_billing.t.g("BillingClient", "Reconnection attempt failed.");
        try {
            ((com.google.android.gms.internal.play_billing.c4) this.f14489v).a(c7.e0.f3937j);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.t.i("BillingClient", "Exception setting completer.", th);
        }
        c7.c cVar = (c7.c) this.f14490w;
        if (cVar.A != null) {
            a6.x xVar = new a6.x(4, this);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                xVar.run();
            } else {
                cVar.e.post(xVar);
            }
        }
    }

    @Override // n9.e
    public void z(z8.a aVar) {
        try {
            String canonicalName = ((com.google.android.gms.internal.ads.ks) this.f14490w).f7860u.getClass().getCanonicalName();
            int i = aVar.f31969a;
            String str = aVar.f31970b;
            String str2 = aVar.f31971c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(i);
            sb2.append(". ErrorMessage = ");
            sb2.append(str);
            sb2.append(". ErrorDomain = ");
            sb2.append(str2);
            l9.i.a(sb2.toString());
            com.google.android.gms.internal.ads.as asVar = (com.google.android.gms.internal.ads.as) this.f14489v;
            asVar.K2(aVar.a());
            asVar.o4(i, str);
            asVar.o0(i);
        } catch (RemoteException e) {
            l9.i.d("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public Object zza() {
        l9.a aVar = (l9.a) this.f14489v;
        int i = aVar.f20030v;
        int i10 = aVar.f20031w;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i10).length());
        sb2.append(i);
        sb2.append(".");
        sb2.append(i10);
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(sb3)) {
                return new xt0(new zt0("Google", sb3), (WebView) this.f14490w);
            }
            q.x.n("Version is null or empty");
            return null;
        }
        q.x.n("Name is null or empty");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.g2
    public void zzb() {
        byte[] bArr = bq0.f4861b;
        int length = bArr.length;
        ((xk0) this.f14490w).z(bArr, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    @Override // com.google.android.gms.internal.ads.qn
    /* renamed from: c, reason: collision with other method in class */
    public JSONObject mo216c() {
        return ((com.google.android.gms.internal.ads.ph) this.f14489v).n();
    }

    public /* synthetic */ iw(int i, boolean z3) {
        this.f14488u = i;
    }

    public iw(Context context) {
        this.f14488u = 8;
        this.f14489v = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iw(mb0 mb0Var, ViewGroup viewGroup) {
        this.f14488u = 6;
        this.f14489v = (com.google.android.gms.internal.ads.ph) mb0Var;
        this.f14490w = viewGroup;
    }

    public /* synthetic */ iw(Object obj, int i, Object obj2) {
        this.f14488u = i;
        this.f14489v = obj;
        this.f14490w = obj2;
    }

    public /* synthetic */ iw(MediaCodec.CryptoInfo cryptoInfo) {
        this.f14488u = 10;
        this.f14489v = cryptoInfo;
        this.f14490w = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public iw(MediaCodec mediaCodec, com.google.android.gms.internal.measurement.e4 e4Var) {
        boolean addMediaCodec;
        this.f14488u = 11;
        this.f14489v = mediaCodec;
        this.f14490w = e4Var;
        if (Build.VERSION.SDK_INT < 35 || e4Var == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) e4Var.f13729w;
        if (loudnessCodecController != null) {
            addMediaCodec = loudnessCodecController.addMediaCodec(mediaCodec);
            if (!addMediaCodec) {
                return;
            }
        }
        b80.K(((HashSet) e4Var.f13728v).add(mediaCodec));
    }

    public /* synthetic */ iw(dp0 dp0Var) {
        this.f14488u = 3;
        this.f14489v = dp0Var;
        this.f14490w = new xk0();
    }

    public /* synthetic */ iw(int i, Object obj, Object obj2, boolean z3) {
        this.f14488u = i;
        this.f14489v = obj2;
        this.f14490w = obj;
    }

    @Override // com.google.android.gms.internal.ads.zh0
    public ya zza() {
        e2 e2Var = (e2) this.f14489v;
        d2 a10 = q1.a();
        e2 c10 = q1.c(a10, e2Var);
        try {
            ya zza = ((da) this.f14490w).zza();
            q1.c(a10, c10);
            zza.getClass();
            return zza;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.xe1
    /* renamed from: zza */
    public /* synthetic */ pf1 mo210zza() {
        AtomicInteger atomicInteger = wz.O;
        pf1 mo210zza = ((xe1) this.f14489v).mo210zza();
        byte[] bArr = (byte[]) this.f14490w;
        return new tz(new yc1(bArr), bArr.length, mo210zza);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ph, android.view.View$OnClickListener, com.google.android.gms.internal.ads.mb0] */
    @Override // com.google.android.gms.internal.ads.qn, com.google.android.gms.internal.ads.el0
    /* renamed from: zza */
    public void mo201zza() {
        y51 y51Var = za0.J;
        com.google.android.gms.internal.ads.mb0 r12 = (com.google.android.gms.internal.ads.ph) this.f14489v;
        Map g8 = r12.g();
        if (g8 == null) {
            return;
        }
        int i = y51Var.f12783x;
        int i10 = 0;
        while (i10 < i) {
            Object obj = g8.get((String) y51Var.get(i10));
            i10++;
            if (obj != null) {
                r12.onClick((ViewGroup) this.f14490w);
                return;
            }
        }
    }
}
