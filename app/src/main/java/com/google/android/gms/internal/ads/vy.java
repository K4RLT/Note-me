package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class vy extends iy implements TextureView.SurfaceTextureListener, my {
    public ly A;
    public Surface B;
    public wz C;
    public String D;
    public String[] E;
    public boolean F;
    public int G;
    public py H;
    public final boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public float N;

    /* renamed from: w, reason: collision with root package name */
    public final h00 f12067w;

    /* renamed from: x, reason: collision with root package name */
    public final ry f12068x;

    /* renamed from: y, reason: collision with root package name */
    public final qy f12069y;

    /* renamed from: z, reason: collision with root package name */
    public final be0 f12070z;

    public vy(Context context, ry ryVar, h00 h00Var, boolean z3, qy qyVar, be0 be0Var) {
        super(context);
        this.G = 1;
        this.f12067w = h00Var;
        this.f12068x = ryVar;
        this.I = z3;
        this.f12069y = qyVar;
        ryVar.a(this);
        this.f12070z = be0Var;
    }

    public static String J(Exception exc, String str) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        g3.a.t(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void A(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.E = new String[]{str};
        } else {
            this.E = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.D;
        boolean z3 = false;
        if (this.f12069y.f10033k && str2 != null && !str.equals(str2) && this.G == 4) {
            z3 = true;
        }
        this.D = str;
        F(z3, num);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void B(int i) {
        wz wzVar = this.C;
        if (wzVar != null) {
            rz rzVar = wzVar.f12373v;
            synchronized (rzVar) {
                rzVar.f10396b = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void C(int i) {
        wz wzVar = this.C;
        if (wzVar != null) {
            rz rzVar = wzVar.f12373v;
            synchronized (rzVar) {
                rzVar.f10397c = i * 1000;
            }
        }
    }

    public final boolean D() {
        wz wzVar = this.C;
        if (wzVar != null && wzVar.A != null && !this.F) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        return D() && this.G != 1;
    }

    public final void F(boolean z3, Integer num) {
        wz wzVar = this.C;
        if (wzVar != null && !z3) {
            wzVar.K = num;
            return;
        }
        if (this.D != null && this.B != null) {
            if (z3) {
                if (D()) {
                    eu1 eu1Var = wzVar.A;
                    eu1Var.f5814x.b();
                    eu1Var.f5813w.m2();
                    G();
                } else {
                    int i = k9.a0.f19634b;
                    l9.i.f("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.D.startsWith("cache:")) {
                jz d12 = this.f12067w.d1(this.D);
                if (d12 instanceof oz) {
                    oz ozVar = (oz) d12;
                    synchronized (ozVar) {
                        ozVar.A = true;
                        ozVar.notify();
                    }
                    wz wzVar2 = ozVar.f9284x;
                    wzVar2.D = null;
                    ozVar.f9284x = null;
                    this.C = wzVar2;
                    wzVar2.K = num;
                    if (wzVar2.A == null) {
                        int i10 = k9.a0.f19634b;
                        l9.i.f("Precached video player has been released.");
                        return;
                    }
                } else if (d12 instanceof mz) {
                    mz mzVar = (mz) d12;
                    h00 h00Var = this.f12067w;
                    f9.k.C.f16813c.E(h00Var.getContext(), h00Var.A().f20029u);
                    synchronized (mzVar.E) {
                        try {
                            ByteBuffer byteBuffer = mzVar.C;
                            if (byteBuffer != null && !mzVar.D) {
                                byteBuffer.flip();
                                mzVar.D = true;
                            }
                            mzVar.f8500z = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ByteBuffer byteBuffer2 = mzVar.C;
                    boolean z9 = mzVar.H;
                    String str = mzVar.f8498x;
                    if (str == null) {
                        int i11 = k9.a0.f19634b;
                        l9.i.f("Stream cache URL is null.");
                        return;
                    }
                    qy qyVar = this.f12069y;
                    h00 h00Var2 = this.f12067w;
                    wz wzVar3 = new wz(h00Var2.getContext(), qyVar, h00Var2, num);
                    int i12 = k9.a0.f19634b;
                    l9.i.e("ExoPlayerAdapter initialized.");
                    this.C = wzVar3;
                    wzVar3.u(new Uri[]{Uri.parse(str)}, byteBuffer2, z9);
                } else {
                    String valueOf = String.valueOf(this.D);
                    int i13 = k9.a0.f19634b;
                    l9.i.f("Stream cache miss: ".concat(valueOf));
                    return;
                }
            } else {
                qy qyVar2 = this.f12069y;
                h00 h00Var3 = this.f12067w;
                wz wzVar4 = new wz(h00Var3.getContext(), qyVar2, h00Var3, num);
                int i14 = k9.a0.f19634b;
                l9.i.e("ExoPlayerAdapter initialized.");
                this.C = wzVar4;
                h00 h00Var4 = this.f12067w;
                f9.k.C.f16813c.E(h00Var4.getContext(), h00Var4.A().f20029u);
                Uri[] uriArr = new Uri[this.E.length];
                int i15 = 0;
                while (true) {
                    String[] strArr = this.E;
                    if (i15 >= strArr.length) {
                        break;
                    }
                    uriArr[i15] = Uri.parse(strArr[i15]);
                    i15++;
                }
                wz wzVar5 = this.C;
                wzVar5.getClass();
                wzVar5.u(uriArr, ByteBuffer.allocate(0), false);
            }
            this.C.D = this;
            H(this.B);
            eu1 eu1Var2 = this.C.A;
            if (eu1Var2 != null) {
                int x12 = eu1Var2.x1();
                this.G = x12;
                if (x12 == 3) {
                    I();
                }
            }
        }
    }

    public final void G() {
        if (this.C != null) {
            H(null);
            wz wzVar = this.C;
            if (wzVar != null) {
                wzVar.D = null;
                eu1 eu1Var = wzVar.A;
                if (eu1Var != null) {
                    eu1Var.f5814x.b();
                    eu1Var.f5813w.W1(wzVar);
                    eu1 eu1Var2 = wzVar.A;
                    eu1Var2.f5814x.b();
                    eu1Var2.f5813w.X1();
                    wzVar.A = null;
                    wz.P.decrementAndGet();
                }
                this.C = null;
            }
            this.G = 1;
            this.F = false;
            this.J = false;
            this.K = false;
        }
    }

    public final void H(Surface surface) {
        int i;
        wz wzVar = this.C;
        if (wzVar != null) {
            try {
                eu1 eu1Var = wzVar.A;
                if (eu1Var != null) {
                    eu1Var.f5814x.b();
                    ys1 ys1Var = eu1Var.f5813w;
                    ys1Var.Q0();
                    ys1Var.i2(surface);
                    if (surface == null) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    ys1Var.j2(i, i);
                    return;
                }
                return;
            } catch (IOException e) {
                int i10 = k9.a0.f19634b;
                l9.i.g("", e);
                return;
            }
        }
        int i11 = k9.a0.f19634b;
        l9.i.f("Trying to set surface before player is initialized.");
    }

    public final void I() {
        if (!this.J) {
            this.J = true;
            k9.f0.f19676l.post(new ty(this, 0));
            t();
            ry ryVar = this.f12068x;
            if (ryVar.i && !ryVar.f10344j) {
                an1.j(ryVar.e, ryVar.f10340d, "vfr2");
                ryVar.f10344j = true;
            }
            if (this.K) {
                h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void S(int i) {
        wz wzVar;
        if (this.G != i) {
            this.G = i;
            if (i != 3) {
                if (i == 4) {
                    if (this.f12069y.f10025a && (wzVar = this.C) != null) {
                        wzVar.s(false);
                    }
                    this.f12068x.f10347m = false;
                    sy syVar = this.f7252v;
                    syVar.f11196d = false;
                    syVar.a();
                    k9.f0.f19676l.post(new ty(this, 2));
                    return;
                }
                return;
            }
            I();
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void a(int i) {
        wz wzVar = this.C;
        if (wzVar != null) {
            rz rzVar = wzVar.f12373v;
            synchronized (rzVar) {
                rzVar.f10398d = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void b(int i) {
        wz wzVar = this.C;
        if (wzVar != null) {
            rz rzVar = wzVar.f12373v;
            synchronized (rzVar) {
                rzVar.e = i * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void c(int i) {
        wz wzVar = this.C;
        if (wzVar != null) {
            Iterator it = wzVar.N.iterator();
            while (it.hasNext()) {
                qz qzVar = (qz) ((WeakReference) it.next()).get();
                if (qzVar != null) {
                    qzVar.L = i;
                    Iterator it2 = qzVar.M.iterator();
                    while (it2.hasNext()) {
                        Socket socket = (Socket) it2.next();
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(qzVar.L);
                            } catch (SocketException e) {
                                int i10 = k9.a0.f19634b;
                                l9.i.g("Failed to update receive buffer size.", e);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final String d() {
        return "ExoPlayer/2".concat(true != this.I ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void e(ly lyVar) {
        this.A = lyVar;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void f(String str) {
        if (str != null) {
            A(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void g() {
        if (D()) {
            eu1 eu1Var = this.C.A;
            eu1Var.f5814x.b();
            eu1Var.f5813w.m2();
            G();
        }
        ry ryVar = this.f12068x;
        ryVar.f10347m = false;
        sy syVar = this.f7252v;
        syVar.f11196d = false;
        syVar.a();
        ryVar.b();
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void h() {
        wz wzVar;
        if (E()) {
            if (this.f12069y.f10025a && (wzVar = this.C) != null) {
                wzVar.s(true);
            }
            eu1 eu1Var = this.C.A;
            eu1Var.f5814x.b();
            eu1Var.f5813w.l2(true);
            this.f12068x.d();
            sy syVar = this.f7252v;
            syVar.f11196d = true;
            syVar.a();
            this.f7251u.f8892c = true;
            k9.f0.f19676l.post(new ty(this, 3));
            return;
        }
        this.K = true;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void i() {
        wz wzVar;
        if (E()) {
            if (this.f12069y.f10025a && (wzVar = this.C) != null) {
                wzVar.s(false);
            }
            eu1 eu1Var = this.C.A;
            eu1Var.f5814x.b();
            eu1Var.f5813w.l2(false);
            this.f12068x.f10347m = false;
            sy syVar = this.f7252v;
            syVar.f11196d = false;
            syVar.a();
            k9.f0.f19676l.post(new ty(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int j() {
        if (E()) {
            return (int) this.C.A.V1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int k() {
        if (E()) {
            return (int) this.C.A.W1();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void l(int i) {
        if (E()) {
            long j10 = i;
            eu1 eu1Var = this.C.A;
            eu1Var.e0(eu1Var.N1(), j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void m(float f10, float f11) {
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.c(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int n() {
        return this.L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int o() {
        return this.M;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.N;
        if (f10 != 0.0f && this.H == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i10) {
        wz wzVar;
        int i11;
        SurfaceTexture surfaceTexture2;
        be0 be0Var;
        if (this.I) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Qe)).booleanValue() && (be0Var = this.f12070z) != null) {
                j6.s a10 = be0Var.a();
                a10.k("action", "svp_aepv");
                a10.l();
            }
            py pyVar = new py(getContext());
            this.H = pyVar;
            pyVar.G = i;
            pyVar.F = i10;
            pyVar.I = surfaceTexture;
            pyVar.start();
            if (pyVar.I == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    pyVar.N.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = pyVar.H;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.H.b();
                this.H = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.B = surface;
        if (this.C == null) {
            F(false, null);
        } else {
            H(surface);
            if (!this.f12069y.f10025a && (wzVar = this.C) != null) {
                wzVar.s(true);
            }
        }
        int i12 = this.L;
        float f10 = 1.0f;
        if (i12 != 0 && (i11 = this.M) != 0) {
            if (i11 > 0) {
                f10 = i12 / i11;
            }
            if (this.N != f10) {
                this.N = f10;
                requestLayout();
            }
        } else {
            if (i10 > 0) {
                f10 = i / i10;
            }
            if (this.N != f10) {
                this.N = f10;
                requestLayout();
            }
        }
        k9.f0.f19676l.post(new ty(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i();
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.b();
            this.H = null;
        }
        wz wzVar = this.C;
        if (wzVar != null) {
            if (wzVar != null) {
                wzVar.s(false);
            }
            Surface surface = this.B;
            if (surface != null) {
                surface.release();
            }
            this.B = null;
            H(null);
        }
        k9.f0.f19676l.post(new ty(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i10) {
        py pyVar = this.H;
        if (pyVar != null) {
            pyVar.a(i, i10);
        }
        k9.f0.f19676l.post(new gy(this, i, i10, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f12068x.c(this);
        this.f7251u.a(surfaceTexture, this.A);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i);
        k9.a0.k(sb2.toString());
        k9.f0.f19676l.post(new c4.i(this, i, 5));
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long p() {
        wz wzVar = this.C;
        if (wzVar != null) {
            if (wzVar.M != null && wzVar.M.J) {
                return 0L;
            }
            return wzVar.E;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long q() {
        wz wzVar = this.C;
        if (wzVar != null) {
            return wzVar.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long r() {
        wz wzVar = this.C;
        if (wzVar != null) {
            return wzVar.r();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final int s() {
        wz wzVar = this.C;
        if (wzVar != null) {
            return wzVar.F;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void t() {
        k9.f0.f19676l.post(new ty(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void u() {
        k9.f0.f19676l.post(new ty(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void v(long j10, boolean z3) {
        if (this.f12067w != null) {
            xx.f12655f.execute(new uy(this, z3, j10, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void w(int i, int i10) {
        float f10;
        this.L = i;
        this.M = i10;
        if (i10 > 0) {
            f10 = i / i10;
        } else {
            f10 = 1.0f;
        }
        if (this.N != f10) {
            this.N = f10;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void x(IOException iOException) {
        String J = J(iOException, "onLoadException");
        String concat = "ExoPlayerAdapter exception: ".concat(J);
        int i = k9.a0.f19634b;
        l9.i.f(concat);
        f9.k.C.f16817h.e("AdExoPlayerView.onException", iOException);
        k9.f0.f19676l.post(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 10, J));
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void y(Exception exc, String str) {
        wz wzVar;
        String J = J(exc, str);
        String concat = "ExoPlayerAdapter error: ".concat(J);
        int i = k9.a0.f19634b;
        l9.i.f(concat);
        this.F = true;
        if (this.f12069y.f10025a && (wzVar = this.C) != null) {
            wzVar.s(false);
        }
        k9.f0.f19676l.post(new ac.a(this, 9, J));
        f9.k.C.f16817h.e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final Integer z() {
        wz wzVar = this.C;
        if (wzVar != null) {
            return wzVar.K;
        }
        return null;
    }
}
