package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class my1 implements xx1, p2 {

    /* renamed from: i0, reason: collision with root package name */
    public static final Map f8482i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final mw1 f8483j0;
    public final w A;
    public final long B;
    public final long C;
    public final zd1 E;
    public Object J;
    public q4 K;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public na1 S;
    public a3 T;
    public long U;
    public boolean V;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f8484a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f8485b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f8486c0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f8488e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f8489f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f8490g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f8491h0;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f8492u;

    /* renamed from: v, reason: collision with root package name */
    public final pf1 f8493v;

    /* renamed from: w, reason: collision with root package name */
    public final s6 f8494w;

    /* renamed from: x, reason: collision with root package name */
    public final i0.m f8495x;

    /* renamed from: y, reason: collision with root package name */
    public final z11 f8496y;

    /* renamed from: z, reason: collision with root package name */
    public final oy1 f8497z;
    public final hq0 D = new hq0(1);
    public final qb0 F = new Object();
    public final e0 G = new e0(this, 3);
    public final e0 H = new e0(this, 1);
    public final Handler I = bq0.p();
    public ly1[] N = new ly1[0];
    public ry1[] M = new ry1[0];
    public iy1[] L = new iy1[0];

    /* renamed from: d0, reason: collision with root package name */
    public long f8487d0 = -9223372036854775807L;
    public int W = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f8482i0 = Collections.unmodifiableMap(hashMap);
        rv1 rv1Var = new rv1();
        rv1Var.f10296a = "icy";
        rv1Var.e("application/x-icy");
        f8483j0 = new mw1(rv1Var);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.qb0, java.lang.Object] */
    public my1(Uri uri, pf1 pf1Var, zd1 zd1Var, s6 s6Var, z11 z11Var, i0.m mVar, oy1 oy1Var, w wVar, int i, long j10) {
        this.f8492u = uri;
        this.f8493v = pf1Var;
        this.f8494w = s6Var;
        this.f8496y = z11Var;
        this.f8495x = mVar;
        this.f8497z = oy1Var;
        this.A = wVar;
        this.B = i;
        this.E = zd1Var;
        this.C = j10;
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final i3 A(int i, int i10) {
        return p(new ly1(i, false));
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void B(a3 a3Var) {
        this.I.post(new iv1(this, 2, a3Var));
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void X(long j10) {
        long j11;
        long j12;
        int i;
        int i10;
        if (!this.R) {
            w();
            if (!u()) {
                boolean[] zArr = (boolean[]) this.S.f8632d;
                int length = this.M.length;
                int i11 = 0;
                while (i11 < length) {
                    ry1 ry1Var = this.M[i11];
                    boolean z3 = zArr[i11];
                    py1 py1Var = ry1Var.f10371a;
                    synchronized (ry1Var) {
                        try {
                            int i12 = ry1Var.f10383o;
                            if (i12 != 0) {
                                long[] jArr = ry1Var.f10381m;
                                int i13 = ry1Var.f10385q;
                                if (j10 >= jArr[i13]) {
                                    if (z3 && (i10 = ry1Var.f10386r) != i12) {
                                        i = i10 + 1;
                                    } else {
                                        i = i12;
                                    }
                                    j11 = j10;
                                    int h3 = ry1Var.h(i13, i, j11, false);
                                    if (h3 != -1) {
                                        j12 = ry1Var.i(h3);
                                    }
                                    j12 = -1;
                                }
                            }
                            j11 = j10;
                            j12 = -1;
                        } finally {
                        }
                    }
                    py1Var.a(j12);
                    i11++;
                    j10 = j11;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean a() {
        boolean z3;
        if (!this.f8490g0 && ((d0) this.D.f6873w) != null) {
            qb0 qb0Var = this.F;
            synchronized (qb0Var) {
                z3 = qb0Var.f9800a;
            }
            if (z3) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long b(long j10) {
        boolean n10;
        int i;
        int i10;
        w();
        boolean[] zArr = (boolean[]) this.S.f8631c;
        boolean z3 = true;
        if (true != this.T.zzb()) {
            j10 = 0;
        }
        this.Y = false;
        long j11 = this.f8486c0;
        this.f8486c0 = j10;
        if (u()) {
            this.f8487d0 = j10;
            return j10;
        }
        if (this.W != 7 && (this.f8490g0 || ((d0) this.D.f6873w) != null)) {
            int length = this.M.length;
            for (int i11 = 0; i11 < length; i11++) {
                ry1 ry1Var = this.M[i11];
                if (this.L[i11].f7256d.get() == hy1.f6927u) {
                    int i12 = ry1Var.f10384p;
                    if (ry1Var.f10386r + i12 != 0 || j11 != j10) {
                        if (this.R) {
                            synchronized (ry1Var) {
                                synchronized (ry1Var) {
                                    ry1Var.f10386r = 0;
                                    py1 py1Var = ry1Var.f10371a;
                                    py1Var.f9671y = (d6) py1Var.f9670x;
                                }
                            }
                            int i13 = ry1Var.f10384p;
                            if (i12 >= i13 && i12 <= ry1Var.f10383o + i13 && (((i = ry1Var.f10391w) == -1 || i12 < i) && ((i10 = ry1Var.f10392x) == -1 || i12 < i10))) {
                                ry1Var.f10387s = Long.MIN_VALUE;
                                ry1Var.f10386r = i12 - i13;
                                n10 = true;
                            }
                            n10 = false;
                        } else {
                            n10 = ry1Var.n(j10, this.f8490g0);
                        }
                        if (n10) {
                            continue;
                        } else if (!zArr[i11] && this.Q) {
                        }
                    }
                }
            }
            return j10;
        }
        this.f8488e0 = false;
        this.f8487d0 = j10;
        this.f8490g0 = false;
        this.Z = false;
        hq0 hq0Var = this.D;
        if (((d0) hq0Var.f6873w) == null) {
            z3 = false;
        }
        if (z3) {
            for (ry1 ry1Var2 : this.M) {
                ry1Var2.o();
            }
            d0 d0Var = (d0) hq0Var.f6873w;
            d0Var.getClass();
            d0Var.a(false);
            return j10;
        }
        hq0Var.f6874x = null;
        for (ry1 ry1Var3 : this.M) {
            ry1Var3.k(false);
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long c() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void d(wx1 wx1Var, long j10) {
        this.J = wx1Var;
        this.F.a();
        r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r13 == Long.MIN_VALUE) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0067  */
    @Override // com.google.android.gms.internal.ads.xx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r13, com.google.android.gms.internal.ads.du1 r15) {
        /*
            r12 = this;
            r12.w()
            com.google.android.gms.internal.ads.a3 r0 = r12.T
            boolean r0 = r0.zzb()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            com.google.android.gms.internal.ads.a3 r0 = r12.T
            com.google.android.gms.internal.ads.z2 r0 = r0.a(r13)
            com.google.android.gms.internal.ads.b3 r3 = r0.f13048a
            com.google.android.gms.internal.ads.b3 r0 = r0.f13049b
            long r4 = r15.f5525a
            int r15 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r15 != 0) goto L1f
            return r13
        L1f:
            java.lang.String r15 = com.google.android.gms.internal.ads.bq0.f4860a
            long r6 = r13 - r4
            long r4 = r4 ^ r13
            long r8 = r13 ^ r6
            int r15 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r15 < 0) goto L2e
            r15 = r8
            goto L2f
        L2e:
            r15 = r9
        L2f:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L35
            r1 = r8
            goto L36
        L35:
            r1 = r9
        L36:
            r15 = r15 | r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r15 == 0) goto L40
            r4 = r6
            goto L48
        L40:
            r15 = 63
            long r4 = r6 >>> r15
            r10 = 1
            long r4 = r4 ^ r10
            long r4 = r4 + r1
        L48:
            r10 = -9223372036854775808
            int r15 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r15 != 0) goto L56
            int r15 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r15 != 0) goto L54
            r6 = r10
            goto L56
        L54:
            r4 = r10
            goto L60
        L56:
            int r15 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r15 != 0) goto L60
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 == 0) goto L5f
            goto L54
        L5f:
            r4 = r1
        L60:
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 != 0) goto L67
            if (r15 != 0) goto L70
            goto L68
        L67:
            r10 = r13
        L68:
            int r15 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r15 != 0) goto L6f
            int r15 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            goto L70
        L6f:
            r1 = r13
        L70:
            long r6 = r3.f4702a
            int r15 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r15 > 0) goto L7c
            int r15 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r15 > 0) goto L7c
            r15 = r8
            goto L7d
        L7c:
            r15 = r9
        L7d:
            long r10 = r0.f4702a
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 > 0) goto L88
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 > 0) goto L88
            goto L89
        L88:
            r8 = r9
        L89:
            if (r15 == 0) goto L9e
            if (r8 == 0) goto L9e
            long r0 = r6 - r13
            long r13 = r10 - r13
            long r0 = java.lang.Math.abs(r0)
            long r13 = java.lang.Math.abs(r13)
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 > 0) goto La3
            goto La0
        L9e:
            if (r15 == 0) goto La1
        La0:
            return r6
        La1:
            if (r8 == 0) goto La4
        La3:
            return r10
        La4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.my1.e(long, com.google.android.gms.internal.ads.du1):long");
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final boolean f(jt1 jt1Var) {
        if (!this.f8490g0) {
            hq0 hq0Var = this.D;
            if (((IOException) hq0Var.f6874x) == null && !this.f8488e0) {
                if (!this.P || this.f8484a0 != 0) {
                    boolean a10 = this.F.a();
                    if (((d0) hq0Var.f6873w) != null) {
                        return a10;
                    }
                    r();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final void g(long j10) {
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    public final void h(jy1 jy1Var, boolean z3) {
        Object obj = jy1Var.f7573b.f14387w;
        Object obj2 = new Object();
        vx1 vx1Var = new vx1(-1, null, bq0.t(jy1Var.i), bq0.t(this.U));
        i0.m mVar = this.f8495x;
        mVar.s(new zd1(29, mVar, obj2, vx1Var));
        if (!z3) {
            for (ry1 ry1Var : this.M) {
                ry1Var.k(false);
            }
            if (this.f8484a0 > 0) {
                Object r14 = this.J;
                r14.getClass();
                r14.j(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long i(r[] rVarArr, boolean[] zArr, sy1[] sy1VarArr, boolean[] zArr2, long j10) {
        boolean z3;
        r rVar;
        boolean z9;
        boolean z10;
        w();
        na1 na1Var = this.S;
        zy1 zy1Var = (zy1) na1Var.f8630b;
        boolean[] zArr3 = (boolean[]) na1Var.f8632d;
        int i = this.f8484a0;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            sy1 sy1Var = sy1VarArr[i10];
            if (sy1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                int i11 = ((ky1) sy1Var).f7903a;
                b80.K(zArr3[i11]);
                this.f8484a0--;
                zArr3[i11] = false;
                sy1VarArr[i10] = null;
            }
        }
        if (!this.X ? !(j10 == 0 || this.R) : i == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (sy1VarArr[i12] == null && (rVar = rVarArr[i12]) != null) {
                if (rVar.a() == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b80.K(z9);
                if (rVar.u(0) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b80.K(z10);
                int indexOf = zy1Var.f13338b.indexOf(rVar.zza());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                b80.K(!zArr3[indexOf]);
                this.f8484a0++;
                zArr3[indexOf] = true;
                this.Z = rVar.c().f8465u | this.Z;
                sy1VarArr[i12] = new ky1(this, indexOf);
                zArr2[i12] = true;
                if (!z3) {
                    ry1 ry1Var = this.M[indexOf];
                    if (ry1Var.f10384p + ry1Var.f10386r != 0 && !ry1Var.n(j10, true)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
        }
        if (this.f8484a0 == 0) {
            this.f8488e0 = false;
            this.Y = false;
            this.Z = false;
            hq0 hq0Var = this.D;
            if (((d0) hq0Var.f6873w) != null) {
                for (ry1 ry1Var2 : this.M) {
                    ry1Var2.o();
                }
                d0 d0Var = (d0) hq0Var.f6873w;
                d0Var.getClass();
                d0Var.a(false);
            } else {
                this.f8490g0 = false;
                for (ry1 ry1Var3 : this.M) {
                    ry1Var3.k(false);
                }
            }
        } else if (z3) {
            j10 = b(j10);
            for (int i13 = 0; i13 < sy1VarArr.length; i13++) {
                if (sy1VarArr[i13] != null) {
                    zArr2[i13] = true;
                }
            }
        }
        this.X = true;
        return j10;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    public final void j(jy1 jy1Var) {
        long j10;
        if (this.U == -9223372036854775807L && this.T != null) {
            long t3 = t(true);
            if (t3 == Long.MIN_VALUE) {
                j10 = 0;
            } else {
                j10 = t3 + 10000;
            }
            this.U = j10;
            this.f8497z.s(j10, this.T, this.V);
        }
        Object obj = jy1Var.f7573b.f14387w;
        Object obj2 = new Object();
        long j11 = jy1Var.i;
        long j12 = this.U;
        i0.m mVar = this.f8495x;
        mVar.s(new hq0(mVar, obj2, new vx1(-1, null, bq0.t(j11), bq0.t(j12)), 29, false));
        this.f8490g0 = true;
        Object r15 = this.J;
        r15.getClass();
        r15.j(this);
    }

    public final void k(int i) {
        w();
        na1 na1Var = this.S;
        boolean[] zArr = (boolean[]) na1Var.e;
        if (!zArr[i]) {
            mw1 mw1Var = ((zy1) na1Var.f8630b).a(i).f6822d[0];
            vx1 vx1Var = new vx1(ha.f(mw1Var.f8459o), mw1Var, bq0.t(this.f8486c0), -9223372036854775807L);
            i0.m mVar = this.f8495x;
            mVar.s(new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(mVar, 11, vx1Var));
            zArr[i] = true;
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    public final void l(int i) {
        w();
        if (this.f8488e0) {
            if ((!this.Q || ((boolean[]) this.S.f8631c)[i]) && !this.M[i].m(false)) {
                this.f8487d0 = 0L;
                this.f8488e0 = false;
                this.Y = true;
                this.f8486c0 = 0L;
                this.f8489f0 = 0;
                for (ry1 ry1Var : this.M) {
                    ry1Var.k(false);
                }
                Object r52 = this.J;
                r52.getClass();
                r52.j(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final void m() {
        int i;
        IOException iOException;
        if (this.W == 7) {
            i = 6;
        } else {
            i = 3;
        }
        hq0 hq0Var = this.D;
        IOException iOException2 = (IOException) hq0Var.f6874x;
        if (iOException2 == null) {
            d0 d0Var = (d0) hq0Var.f6873w;
            if (d0Var != null && (iOException = d0Var.f5235w) != null && d0Var.f5236x > i) {
                throw iOException;
            }
            if (this.f8490g0 && !this.P) {
                throw va.a(null, "Loading finished before preparation is complete.");
            }
            return;
        }
        throw iOException2;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final zy1 n() {
        w();
        return (zy1) this.S.f8630b;
    }

    public final boolean o() {
        return this.Y || u();
    }

    public final i3 p(ly1 ly1Var) {
        int length = this.M.length;
        for (int i = 0; i < length; i++) {
            if (ly1Var.equals(this.N[i])) {
                return this.M[i];
            }
        }
        if (this.O) {
            int i10 = ly1Var.f8189a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
            sb2.append("Extractor added new track (id=");
            sb2.append(i10);
            sb2.append(") after finishing tracks.");
            x21.F("ProgressiveMediaPeriod", sb2.toString());
            return new l2();
        }
        ry1 ry1Var = new ry1(this.A, this.f8494w, this.f8496y);
        iy1 iy1Var = new iy1(ry1Var);
        ry1Var.e = this;
        int i11 = length + 1;
        ly1[] ly1VarArr = (ly1[]) Arrays.copyOf(this.N, i11);
        ly1VarArr[length] = ly1Var;
        String str = bq0.f4860a;
        this.N = ly1VarArr;
        ry1[] ry1VarArr = (ry1[]) Arrays.copyOf(this.M, i11);
        ry1VarArr[length] = ry1Var;
        this.M = ry1VarArr;
        iy1[] iy1VarArr = (iy1[]) Arrays.copyOf(this.L, i11);
        iy1VarArr[length] = iy1Var;
        this.L = iy1VarArr;
        return iy1Var;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.gms.internal.ads.wx1, java.lang.Object] */
    public final void q() {
        boolean z3;
        boolean z9;
        int i;
        m8 c10;
        int i10;
        char c11;
        if (!this.f8491h0 && !this.P && this.O && this.T != null) {
            for (ry1 ry1Var : this.M) {
                if (ry1Var.l() == null) {
                    return;
                }
            }
            qb0 qb0Var = this.F;
            synchronized (qb0Var) {
                qb0Var.f9800a = false;
            }
            int length = this.M.length;
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                char c12 = 1;
                if (i12 >= length) {
                    break;
                }
                mw1 l10 = this.M[i12].l();
                l10.getClass();
                int f10 = ha.f(l10.f8459o);
                if (f10 != 1) {
                    if (f10 != 2) {
                        if (f10 != 3) {
                            if (f10 != 4) {
                                c11 = 0;
                            } else {
                                c11 = 2;
                            }
                        } else {
                            c11 = 1;
                        }
                    } else {
                        c11 = 4;
                    }
                } else {
                    c11 = 3;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                c12 = 0;
                            } else {
                                c12 = 2;
                            }
                        }
                    } else {
                        c12 = 4;
                    }
                } else {
                    c12 = 3;
                }
                if (c11 > c12) {
                    i11 = f10;
                }
                if (c11 > c12) {
                    i13 = i12;
                }
                i12++;
            }
            hi[] hiVarArr = new hi[length];
            boolean[] zArr = new boolean[length];
            for (int i14 = 0; i14 < length; i14++) {
                mw1 l11 = this.M[i14].l();
                l11.getClass();
                String str = l11.f8459o;
                boolean a10 = ha.a(str);
                if (a10 || ha.b(str)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zArr[i14] = z3;
                this.Q = z3 | this.Q;
                boolean c13 = ha.c(str);
                if (this.C != -9223372036854775807L && length == 1 && c13) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.R = z9;
                q4 q4Var = this.K;
                if (q4Var != null) {
                    if (a10 || this.N[i14].f8190b) {
                        m8 m8Var = l11.f8456l;
                        if (m8Var == null) {
                            c10 = new m8(q4Var);
                        } else {
                            c10 = m8Var.c(q4Var);
                        }
                        rv1 rv1Var = new rv1(l11);
                        rv1Var.f10304k = c10;
                        l11 = new mw1(rv1Var);
                    }
                    if (a10 && l11.f8453h == -1 && l11.i == -1 && (i10 = q4Var.f9732a) != -1) {
                        rv1 rv1Var2 = new rv1(l11);
                        rv1Var2.f10302h = i10;
                        l11 = new mw1(rv1Var2);
                    }
                }
                this.f8494w.getClass();
                if (l11.f8463s != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                rv1 rv1Var3 = new rv1(l11);
                rv1Var3.O = i;
                mw1 mw1Var = new mw1(rv1Var3);
                if (i14 != i13) {
                    rv1 rv1Var4 = new rv1(mw1Var);
                    rv1Var4.f10305l = Integer.toString(i13);
                    mw1Var = new mw1(rv1Var4);
                }
                hiVarArr[i14] = new hi(Integer.toString(i14), mw1Var);
                this.Z = mw1Var.f8465u | this.Z;
                ry1 ry1Var2 = this.M[i14];
                synchronized (ry1Var2) {
                    if (ry1Var2.f10388t != Long.MIN_VALUE) {
                        ry1Var2.f10388t = Long.MIN_VALUE;
                        ry1Var2.f10391w = -1;
                        ry1Var2.f10392x = -1;
                    }
                }
            }
            this.S = new na1(new zy1(hiVarArr), zArr);
            if (this.R && this.U == -9223372036854775807L) {
                this.U = this.C;
                this.T = new gy1(this, this.T);
            }
            this.f8497z.s(this.U, this.T, this.V);
            this.P = true;
            Object r02 = this.J;
            r02.getClass();
            r02.h(this);
        }
    }

    public final void r() {
        jy1 jy1Var = new jy1(this, this.f8492u, this.f8493v, this.E, this, this.F);
        boolean z3 = false;
        if (this.P) {
            b80.K(u());
            long j10 = this.U;
            if (j10 != -9223372036854775807L && this.f8487d0 > j10) {
                this.f8490g0 = true;
                this.f8487d0 = -9223372036854775807L;
                return;
            }
            a3 a3Var = this.T;
            a3Var.getClass();
            b3 b3Var = a3Var.a(this.f8487d0).f13048a;
            long j11 = this.f8487d0;
            jy1Var.f7576f.f1139v = b3Var.f4703b;
            jy1Var.i = j11;
            jy1Var.f7578h = true;
            jy1Var.f7581l = false;
            for (ry1 ry1Var : this.M) {
                ry1Var.f10387s = this.f8487d0;
            }
            this.f8487d0 = -9223372036854775807L;
        }
        this.f8489f0 = s();
        hq0 hq0Var = this.D;
        hq0Var.getClass();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        hq0Var.f6874x = null;
        d0 d0Var = new d0(hq0Var, myLooper, jy1Var, this, SystemClock.elapsedRealtime());
        hq0 hq0Var2 = d0Var.B;
        if (((d0) hq0Var2.f6873w) == null) {
            z3 = true;
        }
        b80.K(z3);
        hq0Var2.f6873w = d0Var;
        d0Var.b();
    }

    public final int s() {
        int i = 0;
        for (ry1 ry1Var : this.M) {
            i += ry1Var.f10384p + ry1Var.f10383o;
        }
        return i;
    }

    public final long t(boolean z3) {
        long j10;
        int i = 0;
        long j11 = Long.MIN_VALUE;
        while (true) {
            ry1[] ry1VarArr = this.M;
            if (i < ry1VarArr.length) {
                if (!z3) {
                    na1 na1Var = this.S;
                    na1Var.getClass();
                    if (!((boolean[]) na1Var.f8632d)[i]) {
                        continue;
                        i++;
                    }
                }
                ry1 ry1Var = ry1VarArr[i];
                synchronized (ry1Var) {
                    j10 = ry1Var.f10390v;
                }
                j11 = Math.max(j11, j10);
                i++;
            } else {
                return j11;
            }
        }
    }

    public final boolean u() {
        return this.f8487d0 != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.xx1
    public final long v() {
        if (this.Z) {
            this.Z = false;
        } else if (this.Y) {
            if (this.f8490g0 || s() > this.f8489f0) {
                this.Y = false;
            } else {
                return -9223372036854775807L;
            }
        } else {
            return -9223372036854775807L;
        }
        return this.f8486c0;
    }

    public final void w() {
        b80.K(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // com.google.android.gms.internal.ads.p2
    public final void z() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override // com.google.android.gms.internal.ads.ty1
    public final long zzb() {
        long j10;
        boolean z3;
        long j11;
        w();
        if (this.f8490g0 || this.f8484a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f8487d0;
        }
        if (this.Q) {
            int length = this.M.length;
            j10 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                na1 na1Var = this.S;
                if (((boolean[]) na1Var.f8631c)[i] && ((boolean[]) na1Var.f8632d)[i]) {
                    ry1 ry1Var = this.M[i];
                    synchronized (ry1Var) {
                        z3 = ry1Var.f10393y;
                    }
                    if (z3) {
                        continue;
                    } else {
                        ry1 ry1Var2 = this.M[i];
                        synchronized (ry1Var2) {
                            j11 = ry1Var2.f10390v;
                        }
                        j10 = Math.min(j10, j11);
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = t(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f8486c0;
        }
        return j10;
    }
}
