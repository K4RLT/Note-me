package com.google.android.gms.internal.ads;
import i0.m;

import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ry1 implements i3 {
    public boolean A;
    public mw1 B;
    public boolean C;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final py1 f10371a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f10372b;

    /* renamed from: c, reason: collision with root package name */
    public final nb f10373c;

    /* renamed from: d, reason: collision with root package name */
    public final s6 f10374d;
    public my1 e;

    /* renamed from: f, reason: collision with root package name */
    public mw1 f10375f;

    /* renamed from: g, reason: collision with root package name */
    public zq0 f10376g;

    /* renamed from: h, reason: collision with root package name */
    public int f10377h;
    public long[] i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f10378j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f10379k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f10380l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f10381m;

    /* renamed from: n, reason: collision with root package name */
    public h3[] f10382n;

    /* renamed from: o, reason: collision with root package name */
    public int f10383o;

    /* renamed from: p, reason: collision with root package name */
    public int f10384p;

    /* renamed from: q, reason: collision with root package name */
    public int f10385q;

    /* renamed from: r, reason: collision with root package name */
    public int f10386r;

    /* renamed from: s, reason: collision with root package name */
    public long f10387s;

    /* renamed from: t, reason: collision with root package name */
    public long f10388t;

    /* renamed from: u, reason: collision with root package name */
    public long f10389u;

    /* renamed from: v, reason: collision with root package name */
    public long f10390v;

    /* renamed from: w, reason: collision with root package name */
    public int f10391w;

    /* renamed from: x, reason: collision with root package name */
    public int f10392x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10393y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10394z;

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.py1, java.lang.Object] */
    public ry1(w wVar, s6 s6Var, z11 z11Var) {
        this.f10374d = s6Var;
        com.google.android.gms.internal.ads.py1 obj = new Object();
        obj.f9668v = wVar;
        obj.f9669w = new xk0(32);
        d6 d6Var = new d6(0L);
        obj.f9670x = d6Var;
        obj.f9671y = d6Var;
        obj.f9672z = d6Var;
        this.f10371a = obj;
        this.f10372b = new r7(2);
        this.f10377h = AdError.NETWORK_ERROR_CODE;
        this.i = new long[AdError.NETWORK_ERROR_CODE];
        this.f10378j = new long[AdError.NETWORK_ERROR_CODE];
        this.f10381m = new long[AdError.NETWORK_ERROR_CODE];
        this.f10380l = new int[AdError.NETWORK_ERROR_CODE];
        this.f10379k = new int[AdError.NETWORK_ERROR_CODE];
        this.f10382n = new h3[AdError.NETWORK_ERROR_CODE];
        this.f10373c = new nb(9, false);
        this.f10387s = Long.MIN_VALUE;
        this.f10389u = Long.MIN_VALUE;
        this.f10390v = Long.MIN_VALUE;
        this.A = true;
        this.f10394z = true;
        this.C = true;
        this.f10388t = Long.MIN_VALUE;
        this.f10391w = -1;
        this.f10392x = -1;
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final int b(fs1 fs1Var, int i, boolean z3) {
        py1 py1Var = this.f10371a;
        int b10 = py1Var.b(i);
        d6 d6Var = (d6) py1Var.f9672z;
        v vVar = (v) d6Var.f5317w;
        byte[] bArr = vVar.f11763a;
        long j10 = py1Var.f9667u - d6Var.f5315u;
        vVar.getClass();
        int e = fs1Var.e(bArr, (int) j10, b10);
        if (e == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        long j11 = py1Var.f9667u + e;
        py1Var.f9667u = j11;
        d6 d6Var2 = (d6) py1Var.f9672z;
        if (j11 == d6Var2.f5316v) {
            py1Var.f9672z = (d6) d6Var2.f5318x;
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (((com.google.android.gms.internal.ads.qy1) ((android.util.SparseArray) r0.f8635v).valueAt(r2.size() - 1)).f10039a.equals(r17.B) == false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r18, int r20, int r21, int r22, com.google.android.gms.internal.ads.h3 r23) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ry1.c(long, int, int, int, com.google.android.gms.internal.ads.h3):void");
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void e(mw1 mw1Var) {
        boolean z3;
        boolean z9;
        String str;
        boolean z10;
        synchronized (this) {
            z3 = false;
            try {
                this.A = false;
                if (!Objects.equals(mw1Var, this.B)) {
                    nb nbVar = this.f10373c;
                    if (((SparseArray) nbVar.f8635v).size() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        if (((qy1) ((SparseArray) nbVar.f8635v).valueAt(r2.size() - 1)).f10039a.equals(mw1Var)) {
                            this.B = ((qy1) ((SparseArray) nbVar.f8635v).valueAt(r6.size() - 1)).f10039a;
                            boolean z11 = this.C;
                            mw1 mw1Var2 = this.B;
                            str = mw1Var2.f8459o;
                            String str2 = mw1Var2.f8455k;
                            if (ha.f(str) != 1 && ha.d(str, str2)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.C = z11 & z10;
                            this.D = false;
                            z3 = true;
                        }
                    }
                    this.B = mw1Var;
                    boolean z112 = this.C;
                    mw1 mw1Var22 = this.B;
                    str = mw1Var22.f8459o;
                    String str22 = mw1Var22.f8455k;
                    if (ha.f(str) != 1) {
                    }
                    z10 = false;
                    this.C = z112 & z10;
                    this.D = false;
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        my1 my1Var = this.e;
        if (my1Var != null && z3) {
            my1Var.I.post(my1Var.G);
        }
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void f(xk0 xk0Var, int i, int i10) {
        while (true) {
            py1 py1Var = this.f10371a;
            if (i > 0) {
                int b10 = py1Var.b(i);
                d6 d6Var = (d6) py1Var.f9672z;
                v vVar = (v) d6Var.f5317w;
                byte[] bArr = vVar.f11763a;
                long j10 = py1Var.f9667u - d6Var.f5315u;
                vVar.getClass();
                xk0Var.H(bArr, (int) j10, b10);
                i -= b10;
                long j11 = py1Var.f9667u + b10;
                py1Var.f9667u = j11;
                d6 d6Var2 = (d6) py1Var.f9672z;
                if (j11 == d6Var2.f5316v) {
                    py1Var.f9672z = (d6) d6Var2.f5318x;
                }
            } else {
                py1Var.getClass();
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.lw1, java.lang.Exception] */
    public final void g(mw1 mw1Var, i0.m mVar) {
        nu1 nu1Var;
        int i;
        mw1 mw1Var2 = this.f10375f;
        zq0 zq0Var = null;
        if (mw1Var2 == null) {
            nu1Var = null;
        } else {
            nu1Var = mw1Var2.f8463s;
        }
        this.f10375f = mw1Var;
        nu1 nu1Var2 = mw1Var.f8463s;
        this.f10374d.getClass();
        if (nu1Var2 != null) {
            i = 1;
        } else {
            i = 0;
        }
        rv1 rv1Var = new rv1(mw1Var);
        rv1Var.O = i;
        mVar.f18054v = new mw1(rv1Var);
        mVar.f18055w = this.f10376g;
        if (mw1Var2 != null && Objects.equals(nu1Var, nu1Var2)) {
            return;
        }
        if (nu1Var2 != null) {
            zq0Var = new zq0(15, new iw1(new Exception()));
        }
        this.f10376g = zq0Var;
        mVar.f18055w = zq0Var;
    }

    public final int h(int i, int i10, long j10, boolean z3) {
        int i11 = -1;
        for (int i12 = 0; i12 < i10; i12++) {
            long j11 = this.f10381m[i];
            if (j11 > j10) {
                break;
            }
            if (!z3 || (this.f10380l[i] & 1) != 0) {
                if (j11 == j10) {
                    return i12;
                }
                i11 = i12;
            }
            i++;
            if (i == this.f10377h) {
                i = 0;
            }
        }
        return i11;
    }

    public final long i(int i) {
        long j10 = this.f10389u;
        long j11 = Long.MIN_VALUE;
        int i10 = 0;
        if (i != 0) {
            int j12 = j(i - 1);
            for (int i11 = 0; i11 < i; i11++) {
                j11 = Math.max(j11, this.f10381m[j12]);
                if ((this.f10380l[j12] & 1) != 0) {
                    break;
                }
                j12--;
                if (j12 == -1) {
                    j12 = this.f10377h - 1;
                }
            }
        }
        this.f10389u = Math.max(j10, j11);
        this.f10383o -= i;
        int i12 = this.f10384p + i;
        this.f10384p = i12;
        int i13 = this.f10385q + i;
        this.f10385q = i13;
        int i14 = this.f10377h;
        if (i13 >= i14) {
            this.f10385q = i13 - i14;
        }
        int i15 = this.f10386r - i;
        this.f10386r = i15;
        if (i15 < 0) {
            this.f10386r = 0;
        }
        while (true) {
            nb nbVar = this.f10373c;
            SparseArray sparseArray = (SparseArray) nbVar.f8635v;
            if (i10 >= sparseArray.size() - 1) {
                break;
            }
            int i16 = i10 + 1;
            if (i12 < sparseArray.keyAt(i16)) {
                break;
            }
            ((bx1) nbVar.f8636w).mo213l(sparseArray.valueAt(i10));
            sparseArray.removeAt(i10);
            int i17 = nbVar.f8634u;
            if (i17 > 0) {
                nbVar.f8634u = i17 - 1;
            }
            i10 = i16;
        }
        if (this.f10383o == 0) {
            int i18 = this.f10385q;
            if (i18 == 0) {
                i18 = this.f10377h;
            }
            return this.f10378j[i18 - 1] + this.f10379k[r12];
        }
        return this.f10378j[this.f10385q];
    }

    public final int j(int i) {
        int i10 = this.f10385q + i;
        int i11 = this.f10377h;
        return i10 < i11 ? i10 : i10 - i11;
    }

    public final void k(boolean z3) {
        boolean z9;
        nb nbVar;
        SparseArray sparseArray;
        py1 py1Var = this.f10371a;
        w wVar = (w) py1Var.f9668v;
        d6 d6Var = (d6) py1Var.f9670x;
        if (((v) d6Var.f5317w) != null) {
            wVar.n(d6Var);
            d6Var.f5317w = null;
            d6Var.f5318x = null;
        }
        d6 d6Var2 = (d6) py1Var.f9670x;
        int i = 0;
        if (((v) d6Var2.f5317w) == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.K(z9);
        d6Var2.f5315u = 0L;
        d6Var2.f5316v = 65536L;
        d6 d6Var3 = (d6) py1Var.f9670x;
        py1Var.f9671y = d6Var3;
        py1Var.f9672z = d6Var3;
        py1Var.f9667u = 0L;
        wVar.mo204k();
        this.f10383o = 0;
        this.f10384p = 0;
        this.f10385q = 0;
        this.f10386r = 0;
        this.f10391w = -1;
        this.f10392x = -1;
        this.f10394z = true;
        this.f10387s = Long.MIN_VALUE;
        this.f10389u = Long.MIN_VALUE;
        this.f10390v = Long.MIN_VALUE;
        this.f10393y = false;
        while (true) {
            nbVar = this.f10373c;
            sparseArray = (SparseArray) nbVar.f8635v;
            if (i >= sparseArray.size()) {
                break;
            }
            ((bx1) nbVar.f8636w).mo213l(sparseArray.valueAt(i));
            i++;
        }
        nbVar.f8634u = -1;
        sparseArray.clear();
        if (z3) {
            this.B = null;
            this.A = true;
            this.C = true;
        }
    }

    public final synchronized mw1 l() {
        if (this.A) {
            return null;
        }
        return this.B;
    }

    public final synchronized boolean m(boolean z3) {
        boolean z9;
        boolean z10;
        int i;
        try {
            int i10 = this.f10384p;
            int i11 = this.f10386r;
            int i12 = i10 + i11;
            int i13 = this.f10391w;
            boolean z11 = true;
            if (i13 != -1 && i12 >= i13) {
                return true;
            }
            if (i11 != this.f10383o) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (i13 == -1 && (i = this.f10392x) != -1 && i10 + i11 >= i) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (((qy1) this.f10373c.d(i12)).f10039a != this.f10375f) {
                        return true;
                    }
                    int j10 = j(this.f10386r);
                    if (this.f10376g != null) {
                        int i14 = this.f10380l[j10];
                        z11 = false;
                    }
                    return z11;
                }
            }
            if (!z3 && !this.f10393y) {
                mw1 mw1Var = this.B;
                if (mw1Var != null) {
                    if (mw1Var == this.f10375f) {
                        return false;
                    }
                } else {
                    z11 = false;
                }
            }
            return z11;
        } finally {
        }
    }

    public final synchronized boolean n(long j10, boolean z3) {
        Throwable th;
        boolean z9;
        ry1 ry1Var;
        long j11;
        int h3;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f10386r = 0;
                        py1 py1Var = this.f10371a;
                        py1Var.f9671y = (d6) py1Var.f9670x;
                        int j12 = j(0);
                        long j13 = this.f10388t;
                        long j14 = this.f10390v;
                        if (j13 != Long.MIN_VALUE) {
                            try {
                                j14 = Math.min(j14, j13);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                throw th3;
                            }
                        }
                        int i = this.f10386r;
                        int i10 = this.f10383o;
                        if (i != i10) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9 && j10 >= this.f10381m[j12]) {
                            if (j10 > j14) {
                                if (z3) {
                                    z3 = true;
                                }
                            }
                            if (this.C) {
                                h3 = i10 - i;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < h3) {
                                        if (this.f10381m[j12] < j10) {
                                            j12++;
                                            if (j12 == this.f10377h) {
                                                j12 = 0;
                                            }
                                            i11++;
                                        } else {
                                            ry1Var = this;
                                            j11 = j10;
                                            h3 = i11;
                                            break;
                                        }
                                    } else {
                                        ry1Var = this;
                                        j11 = j10;
                                        if (!z3) {
                                            h3 = -1;
                                        }
                                    }
                                }
                            } else {
                                ry1Var = this;
                                j11 = j10;
                                h3 = ry1Var.h(j12, i10 - i, j11, true);
                            }
                            if (h3 == -1) {
                                return false;
                            }
                            ry1Var.f10387s = j11;
                            ry1Var.f10386r += h3;
                            return true;
                        }
                        return false;
                    } finally {
                        th = th;
                        while (true) {
                            th = th;
                            try {
                                break;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th3;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void o() {
        long i;
        py1 py1Var = this.f10371a;
        synchronized (this) {
            int i10 = this.f10383o;
            if (i10 == 0) {
                i = -1;
            } else {
                i = i(i10);
            }
        }
        py1Var.a(i);
    }
}
