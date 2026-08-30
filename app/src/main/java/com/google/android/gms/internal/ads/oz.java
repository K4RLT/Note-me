package com.google.android.gms.internal.ads;
import a5.a;
import bb.a;
import d.d;
import f9.k;
import g3.a;
import g9.r;
import k9.a0;
import k9.f0;
import l9.d;
import l9.i;
import r.e;

import android.net.Uri;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class oz extends jz implements my {
    public boolean A;
    public bz B;
    public long C;
    public long D;

    /* renamed from: x, reason: collision with root package name */
    public wz f9284x;

    /* renamed from: y, reason: collision with root package name */
    public String f9285y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9286z;

    public static final String o(String str) {
        return "cache:".concat(String.valueOf(l9.d.d(str, "MD5")));
    }

    public static String p(Exception exc, String str) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        g3.a.t(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void S(int i) {
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void a() {
        wz wzVar = this.f9284x;
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
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final boolean b(String str) {
        return d(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.jz, com.google.android.gms.internal.ads.oz] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [long] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.google.android.gms.internal.ads.jz
    public final boolean d(String str, String[] strArr) {
        Object r42;
        boolean z3;
        Object r22;
        boolean z9;
        String str2;
        String str3;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z10;
        long j15;
        long j16;
        long j17;
        int i;
        int i10;
        bb.a aVar;
        long j18;
        oz ozVar = this;
        String str4 = str;
        ozVar.f9285y = str4;
        String o10 = o(str4);
        String str5 = " ms";
        String str6 = "Timeout reached. Limit: ";
        boolean z11 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i11 = 0; i11 < strArr.length; i11++) {
                uriArr[i11] = Uri.parse(strArr[i11]);
            }
            wz wzVar = ozVar.f9284x;
            wzVar.getClass();
            wzVar.u(uriArr, ByteBuffer.allocate(0), false);
            h00 h00Var = (h00) ozVar.f7585w.get();
            if (h00Var != null) {
                h00Var.u0(o10, ozVar);
            }
            f9.k.C.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            nl nlVar = sl.f10770i0;
            g9.r rVar = g9.r.e;
            long longValue = ((Long) rVar.f17698c.a(nlVar)).longValue();
            long longValue2 = ((Long) rVar.f17698c.a(sl.f10755h0)).longValue() * 1000;
            long intValue = ((Integer) rVar.f17698c.a(sl.A)).intValue();
            boolean booleanValue = ((Boolean) rVar.f17698c.a(sl.f11010x2)).booleanValue();
            long j19 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!ozVar.f9286z) {
                                if (ozVar.A) {
                                    return true;
                                }
                                eu1 eu1Var = ozVar.f9284x.A;
                                if (eu1Var != null) {
                                    z9 = true;
                                } else {
                                    z9 = z11;
                                }
                                if (z9) {
                                    long V1 = eu1Var.V1();
                                    if (V1 > 0) {
                                        long X1 = ozVar.f9284x.A.X1();
                                        if (X1 != j19) {
                                            if (X1 > 0) {
                                                z10 = true;
                                            } else {
                                                z10 = z11;
                                            }
                                            if (booleanValue) {
                                                try {
                                                    wz wzVar2 = ozVar.f9284x;
                                                    if (wzVar2.M != null && wzVar2.M.J) {
                                                        j15 = 0;
                                                    } else {
                                                        j15 = wzVar2.E;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r42 = o10;
                                                    z3 = false;
                                                    o10 = str4;
                                                    r22 = ozVar;
                                                    throw th;
                                                }
                                            } else {
                                                j15 = -1;
                                            }
                                            if (booleanValue) {
                                                j16 = ozVar.f9284x.q();
                                            } else {
                                                j16 = -1;
                                            }
                                            if (booleanValue) {
                                                j17 = ozVar.f9284x.r();
                                            } else {
                                                j17 = -1;
                                            }
                                            try {
                                                i = wz.O.get();
                                                i10 = wz.P.get();
                                                aVar = l9.d.f20036b;
                                                str2 = str5;
                                                str3 = str6;
                                                j13 = longValue;
                                                j11 = intValue;
                                                j10 = longValue2;
                                                j18 = j16;
                                                z3 = false;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z3 = false;
                                                r22 = this;
                                                r42 = o10;
                                                o10 = str;
                                                throw th;
                                            }
                                            try {
                                                ez ezVar = new ez(ozVar, str4, o10, X1, V1, j15, j18, j17, z10, i, i10);
                                                j14 = X1;
                                                r42 = V1;
                                                aVar.post(ezVar);
                                                j19 = j14;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r22 = this;
                                                r42 = o10;
                                                o10 = str;
                                                throw th;
                                            }
                                        } else {
                                            str2 = str5;
                                            str3 = str6;
                                            z3 = z11;
                                            j13 = longValue;
                                            r42 = V1;
                                            j14 = X1;
                                            j10 = longValue2;
                                            j11 = intValue;
                                        }
                                        r22 = (j14 > r42 ? 1 : (j14 == r42 ? 0 : -1));
                                        if (r22 >= 0) {
                                            ozVar = this;
                                            str4 = str;
                                            try {
                                                l9.d.f20036b.post(new hz(ozVar, str4, o10, (long) r42));
                                                return true;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r42 = o10;
                                                o10 = str4;
                                                r22 = ozVar;
                                                throw th;
                                            }
                                        }
                                        try {
                                            oz ozVar2 = this;
                                            r42 = o10;
                                            o10 = str;
                                            if (ozVar2.f9284x.E >= j11 && j14 > 0) {
                                                return true;
                                            }
                                            j12 = j13;
                                            r22 = ozVar2;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    } else {
                                        str2 = str5;
                                        str3 = str6;
                                        z3 = z11;
                                        j10 = longValue2;
                                        j11 = intValue;
                                        r42 = o10;
                                        o10 = str4;
                                        r22 = ozVar;
                                        j12 = longValue;
                                    }
                                    try {
                                        r22.wait(j12);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            String str7 = str6;
                            long j20 = longValue2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j20).length() + 27);
                            sb2.append(str7);
                            sb2.append(j20);
                            sb2.append(str5);
                            throw new IOException(sb2.toString());
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r42 = o10;
                        z3 = z11;
                    }
                }
                try {
                    throw th;
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    String l10 = a5.a.l(new StringBuilder(String.valueOf(o10).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", o10, " Exception: ", message);
                    int i12 = k9.a0.f19634b;
                    l9.i.f(l10);
                    f9.k.C.f16817h.e("VideoStreamExoPlayerCache.preload", e);
                    r22.a();
                    r22.m(o10, r42, "error", p(e, "error"));
                    return z3;
                }
                longValue = j12;
                ozVar = r22;
                str4 = o10;
                o10 = r42;
                longValue2 = j10;
                intValue = j11;
                z11 = z3;
                str5 = str2;
                str6 = str3;
            }
        } catch (Exception e8) {
            e = e8;
            r42 = o10;
            z3 = z11;
            o10 = str4;
            r22 = ozVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final boolean f(String str, String[] strArr, bz bzVar) {
        this.f9285y = str;
        this.B = bzVar;
        String o10 = o(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            wz wzVar = this.f9284x;
            wzVar.getClass();
            wzVar.u(uriArr, ByteBuffer.allocate(0), false);
            h00 h00Var = (h00) this.f7585w.get();
            if (h00Var != null) {
                h00Var.u0(o10, this);
            }
            f9.k.C.f16819k.getClass();
            this.C = System.currentTimeMillis();
            this.D = -1L;
            k9.f0.f19676l.postDelayed(new f(21, this), 0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            String l10 = a5.a.l(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i10 = k9.a0.f19634b;
            l9.i.f(l10);
            f9.k.C.f16817h.e("VideoStreamExoPlayerCache.preload", e);
            a();
            m(str, o10, "error", p(e, "error"));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void g(int i) {
        rz rzVar = this.f9284x.f12373v;
        synchronized (rzVar) {
            rzVar.f10397c = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void h(int i) {
        rz rzVar = this.f9284x.f12373v;
        synchronized (rzVar) {
            rzVar.f10396b = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void i(int i) {
        rz rzVar = this.f9284x.f12373v;
        synchronized (rzVar) {
            rzVar.f10398d = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void j(int i) {
        rz rzVar = this.f9284x.f12373v;
        synchronized (rzVar) {
            rzVar.e = i * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.jz
    public final void l() {
        synchronized (this) {
            this.f9286z = true;
            notify();
            a();
        }
        String str = this.f9285y;
        if (str != null) {
            m(this.f9285y, o(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void u() {
        int i = k9.a0.f19634b;
        l9.i.f("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void v(long j10, boolean z3) {
        h00 h00Var = (h00) this.f7585w.get();
        if (h00Var != null) {
            xx.f12655f.execute(new uy(h00Var, z3, j10, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void w(int i, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void x(IOException iOException) {
        int i = k9.a0.f19634b;
        l9.i.g("Precache exception", iOException);
        f9.k.C.f16817h.e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.my
    public final void y(Exception exc, String str) {
        int i = k9.a0.f19634b;
        l9.i.g("Precache error", exc);
        f9.k.C.f16817h.e("VideoStreamExoPlayerCache.onError", exc);
    }
}
