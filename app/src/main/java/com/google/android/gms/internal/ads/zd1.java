package com.google.android.gms.internal.ads;
import a5.a;
import ac.b;
import b2.d2;
import eb.y;
import f9.k;
import fa.b;
import g3.a;
import g9.r;
import g9.w2;
import g9.y1;
import i0.m;
import j6.s;
import k9.a0;
import k9.f0;
import l9.a;
import l9.i;
import n9.e;
import n9.p;
import n9.w;
import p.a;
import q.x;
import r0.a;
import r0.i;
import r0.k;
import r0.l;
import z8.a;

import android.content.Context;
import android.os.RemoteException;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final class zd1 implements be1, l, ba, b, zx, e, a10, s90, zb0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13141u;

    /* renamed from: v, reason: collision with root package name */
    public Object f13142v;

    /* renamed from: w, reason: collision with root package name */
    public Object f13143w;

    /* renamed from: x, reason: collision with root package name */
    public Object f13144x;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.xs1, java.lang.Object] */
    public /* synthetic */ zd1(ys1 ys1Var, Context context) {
        this.f13141u = 26;
        this.f13144x = ys1Var;
        this.f13142v = new WeakReference(context);
        IntConsumer r02 = new IntConsumer() { // from class: com.google.android.gms.internal.ads.xs1
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                ys1 ys1Var2 = (ys1) zd1.this.f13144x;
                if (ys1Var2.f12952p0) {
                    return;
                }
                ys1Var2.k2(1, Integer.valueOf(i), 19);
            }
        };
        this.f13143w = r02;
        androidx.ink.rendering.android.canvas.internal.a.r(context, new i0(2, ys1Var.O.x(ys1Var.M, null)), r02);
    }

    public static zd1 a(String str, x91 x91Var, mm1 mm1Var) {
        int i;
        hh1 C = ih1.C();
        C.b();
        ((ih1) C.f4845v).E(str);
        if (x91Var.equals(x91.f12504c)) {
            i = 2;
        } else if (x91Var.equals(x91.f12505d)) {
            i = 3;
        } else if (x91Var.equals(x91.e)) {
            i = 4;
        } else if (x91Var.equals(x91.f12506f)) {
            i = 5;
        } else if (x91Var.equals(x91.f12507g)) {
            i = 6;
        } else if (x91Var.equals(x91.f12508h)) {
            i = 7;
        } else {
            throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(x91Var.f12526b));
        }
        C.b();
        ((ih1) C.f4845v).H(i);
        C.b();
        ((ih1) C.f4845v).F(mm1Var);
        return j((ih1) C.c());
    }

    public static zd1 j(ih1 ih1Var) {
        x91 x91Var;
        gl1 b10 = fe1.b(ih1Var.z());
        int G = ih1Var.G() - 2;
        if (G != 0) {
            if (G != 1) {
                if (G != 2) {
                    if (G != 3) {
                        if (G != 4) {
                            if (G == 5) {
                                x91Var = x91.f12508h;
                            } else {
                                throw new GeneralSecurityException("Unknown OutputPrefixType ".concat(Integer.toString(G)));
                            }
                        } else {
                            x91Var = x91.f12507g;
                        }
                    } else {
                        x91Var = x91.f12506f;
                    }
                } else {
                    x91Var = x91.e;
                }
            } else {
                x91Var = x91.f12505d;
            }
        } else {
            x91Var = x91.f12504c;
        }
        return new zd1(ih1Var, b10, x91Var);
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void b(dp0 dp0Var, p2 p2Var, fa faVar) {
        this.f13143w = dp0Var;
        faVar.a();
        faVar.b();
        i3 A = p2Var.A(faVar.f5998d, 5);
        this.f13144x = A;
        A.e((mw1) this.f13142v);
    }

    public void c(p2 p2Var, fa faVar) {
        int i = 0;
        while (true) {
            i3[] i3VarArr = (i3[]) this.f13143w;
            if (i < i3VarArr.length) {
                faVar.a();
                faVar.b();
                i3 A = p2Var.A(faVar.f5998d, 3);
                mw1 mw1Var = (mw1) ((List) this.f13142v).get(i);
                String str = mw1Var.f8459o;
                boolean z3 = true;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z3 = false;
                }
                b80.J(z3, "Invalid closed caption MIME type provided: %s", str);
                rv1 rv1Var = new rv1();
                faVar.b();
                rv1Var.f10296a = faVar.e;
                rv1Var.d("video/mp2t");
                rv1Var.e(str);
                rv1Var.e = mw1Var.e;
                rv1Var.f10299d = mw1Var.f8450d;
                rv1Var.M = mw1Var.N;
                rv1Var.f10310q = mw1Var.f8462r;
                A.e(new mw1(rv1Var));
                i3VarArr[i] = A;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // e
    public /* synthetic */ Object d(Object obj) {
        switch (this.f13141u) {
            case 7:
                ts tsVar = (ts) this.f13142v;
                try {
                    ((dt) this.f13144x).f5490v = (p) obj;
                    tsVar.a();
                } catch (RemoteException e) {
                    i.d("", e);
                }
                return new et((as) this.f13143w);
            default:
                xs xsVar = (xs) this.f13142v;
                try {
                    ((dt) this.f13144x).f5491w = (w) obj;
                    xsVar.a();
                } catch (RemoteException e8) {
                    i.d("", e8);
                }
                return new et((as) this.f13143w);
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
        try {
            y yVar = k.C.f16812b;
            y.c(context, (AdOverlayInfoParcel) ((yx) this.f13142v).f12998u.get(), true, (be0) ((yi0) this.f13144x).f12888f);
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ba
    public void f(xk0 xk0Var) {
        long a10;
        long j10;
        long j11;
        ((dp0) this.f13143w).getClass();
        String str = bq0.f4860a;
        dp0 dp0Var = (dp0) this.f13143w;
        synchronized (dp0Var) {
            try {
                long j12 = dp0Var.f5472c;
                if (j12 != -9223372036854775807L) {
                    a10 = j12 + dp0Var.f5471b;
                } else {
                    a10 = dp0Var.a();
                }
                j10 = a10;
            } finally {
            }
        }
        dp0 dp0Var2 = (dp0) this.f13143w;
        synchronized (dp0Var2) {
            j11 = dp0Var2.f5471b;
        }
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            mw1 mw1Var = (mw1) this.f13142v;
            if (j11 != mw1Var.f8464t) {
                rv1 rv1Var = new rv1(mw1Var);
                rv1Var.f10312s = j11;
                mw1 mw1Var2 = new mw1(rv1Var);
                this.f13142v = mw1Var2;
                ((i3) this.f13144x).e(mw1Var2);
            }
            int B = xk0Var.B();
            ((i3) this.f13144x).a(B, xk0Var);
            ((i3) this.f13144x).c(j10, 1, B, 0, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(com.google.android.gms.internal.ads.sp0 r3, com.google.android.gms.internal.ads.qp0 r4, int r5, com.google.android.gms.internal.ads.hi0 r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f13144x
            com.google.android.gms.internal.ads.be0 r0 = (com.google.android.gms.internal.ads.be0) r0
            s r0 = a()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.f11091b
            k(r1, r3)
            i(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            k(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            k(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            k(r3, r5)
            r3 = 0
            if (r6 == 0) goto L61
            y1 r5 = r6.f6823v
            int r5 = r5.f17714u
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            k(r7, r5)
            java.lang.Object r5 = r2.f13142v
            com.google.android.gms.internal.ads.gq0 r5 = (com.google.android.gms.internal.ads.gq0) r5
            java.lang.String r6 = r6.getMessage()
            java.util.regex.Pattern r5 = r5.f6443a
            if (r5 == 0) goto L59
            if (r6 != 0) goto L4a
            goto L59
        L4a:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L59
            java.lang.String r5 = r5.group()
            goto L5a
        L59:
            r5 = r3
        L5a:
            if (r5 == 0) goto L61
            java.lang.String r6 = "areec"
            k(r6, r5)
        L61:
            java.lang.Object r5 = r2.f13143w
            com.google.android.gms.internal.ads.nd0 r5 = (com.google.android.gms.internal.ads.nd0) r5
            java.util.List r4 = r4.f9958t
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.md0 r6 = r5.b(r6)
            if (r6 == 0) goto L6b
            r3 = r6
        L7e:
            if (r3 == 0) goto La1
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.f8326a
            k(r4, r5)
            com.google.android.gms.internal.ads.ft r4 = r3.f8327b
            if (r4 == 0) goto L94
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            k(r5, r4)
        L94:
            com.google.android.gms.internal.ads.ft r3 = r3.f8328c
            if (r3 == 0) goto La1
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            k(r4, r3)
        La1:
            l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zd1.g(com.google.android.gms.internal.ads.sp0, com.google.android.gms.internal.ads.qp0, int, com.google.android.gms.internal.ads.hi0, long):void");
    }

    @Override // b
    public void g0() {
        mf mfVar = (mf) this.f13144x;
        synchronized (mfVar.f8338w) {
            try {
                if (mfVar.f8336u) {
                    return;
                }
                mfVar.f8336u = true;
                cj cjVar = (cj) mfVar.f8337v;
                if (cjVar == null) {
                    return;
                }
                wx wxVar = xx.f12651a;
                dj djVar = (dj) this.f13142v;
                fj fjVar = (fj) this.f13143w;
                fjVar.f12998u.a(new t81(fjVar, 6, wxVar.f(new pt1(this, cjVar, djVar, fjVar, 2))), xx.f12657h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a10
    public void h(String str, int i, String str2, boolean z3) {
        fc0 fc0Var = (fc0) this.f13142v;
        h00 h00Var = (h00) this.f13143w;
        fj fjVar = (fj) this.f13144x;
        if (z3) {
            w2 w2Var = fc0Var.f6010a.f4578a;
            if (w2Var != null && h00Var.d() != null) {
                h00Var.d().w4(w2Var);
            }
            fjVar.d();
            return;
        }
        fc0Var.getClass();
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Html video Web View failed to load. Error code: ");
        sb2.append(i);
        sb2.append(", Description: ");
        sb2.append(str);
        fjVar.c(new cg0(1, a.k(sb2, ", Failing URL: ", str2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r1.f6965x != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        if (r1.f6965x != r11) goto L23;
     */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(com.google.android.gms.internal.ads.pf1 r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.my1 r15) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.i2 r1 = new com.google.android.gms.internal.ads.i2
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f13144x = r1
            java.lang.Object r8 = r7.f13143w
            com.google.android.gms.internal.ads.n2 r8 = (com.google.android.gms.internal.ads.n2) r8
            if (r8 == 0) goto L11
            return
        L11:
            java.lang.Object r8 = r7.f13142v
            com.google.android.gms.internal.ads.q2 r8 = (com.google.android.gms.internal.ads.q2) r8
            com.google.android.gms.internal.ads.n2[] r8 = r8.b(r9, r10)
            int r9 = r8.length
            com.google.android.gms.internal.ads.b51 r10 = com.google.android.gms.internal.ads.d51.f5314v
            java.lang.String r10 = "expectedSize"
            com.google.android.gms.internal.ads.ed1.u(r9, r10)
            com.google.android.gms.internal.ads.a51 r10 = new com.google.android.gms.internal.ads.a51
            r10.<init>(r9)
            r11 = 1
            r12 = 0
            if (r9 != r11) goto L2f
            r8 = r8[r12]
            r7.f13143w = r8
            goto L88
        L2f:
            r13 = r12
        L30:
            if (r13 >= r9) goto L82
            r14 = r8[r13]
            boolean r0 = r14.e(r1)     // Catch: java.lang.Throwable -> L3f java.io.EOFException -> L72
            if (r0 == 0) goto L42
            r7.f13143w = r14     // Catch: java.lang.Throwable -> L3f java.io.EOFException -> L72
            r1.f6967z = r12
            goto L82
        L3f:
            r0 = move-exception
            r8 = r0
            goto L5e
        L42:
            java.util.List r14 = r14.zzb()     // Catch: java.lang.Throwable -> L3f java.io.EOFException -> L72
            r10.b(r14)     // Catch: java.lang.Throwable -> L3f java.io.EOFException -> L72
            java.lang.Object r14 = r7.f13143w
            com.google.android.gms.internal.ads.n2 r14 = (com.google.android.gms.internal.ads.n2) r14
            if (r14 != 0) goto L55
            long r5 = r1.f6965x
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L57
        L55:
            r14 = r11
            goto L58
        L57:
            r14 = r12
        L58:
            com.google.android.gms.internal.ads.b80.K(r14)
            r1.f6967z = r12
            goto L7f
        L5e:
            java.lang.Object r9 = r7.f13143w
            com.google.android.gms.internal.ads.n2 r9 = (com.google.android.gms.internal.ads.n2) r9
            if (r9 != 0) goto L6c
            long r9 = r1.f6965x
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L6b
            goto L6c
        L6b:
            r11 = r12
        L6c:
            com.google.android.gms.internal.ads.b80.K(r11)
            r1.f6967z = r12
            throw r8
        L72:
            java.lang.Object r14 = r7.f13143w
            com.google.android.gms.internal.ads.n2 r14 = (com.google.android.gms.internal.ads.n2) r14
            if (r14 != 0) goto L55
            long r5 = r1.f6965x
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L57
            goto L55
        L7f:
            int r13 = r13 + 1
            goto L30
        L82:
            java.lang.Object r9 = r7.f13143w
            com.google.android.gms.internal.ads.n2 r9 = (com.google.android.gms.internal.ads.n2) r9
            if (r9 == 0) goto L90
        L88:
            java.lang.Object r8 = r7.f13143w
            com.google.android.gms.internal.ads.n2 r8 = (com.google.android.gms.internal.ads.n2) r8
            r8.f(r15)
            return
        L90:
            com.google.android.gms.internal.ads.az1 r9 = new com.google.android.gms.internal.ads.az1
            com.google.android.gms.internal.ads.y51 r8 = com.google.android.gms.internal.ads.d51.v(r8)
            com.google.android.gms.internal.ads.b11 r11 = com.google.android.gms.internal.ads.b11.e
            java.util.AbstractList r8 = com.google.android.gms.internal.ads.ed1.C(r8, r11)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ", "
            com.google.android.gms.internal.ads.ct.t(r11, r8, r12)
            java.lang.String r8 = r11.toString()
            int r11 = r8.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 58
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r13 = ") could read the stream."
            java.lang.String r8 = a.o(r12, r11, r8, r13)
            com.google.android.gms.internal.ads.y51 r10 = r10.f()
            r9.<init>(r8, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zd1.i(com.google.android.gms.internal.ads.pf1, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.my1):void");
    }

    public void k(long j10, xk0 xk0Var) {
        if (xk0Var.B() >= 9) {
            int b10 = xk0Var.b();
            int b11 = xk0Var.b();
            int K = xk0Var.K();
            if (b10 == 434 && b11 == 1195456820 && K == 3) {
                ((d2) this.f13144x).d(j10, xk0Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* renamed from: l */
    public /* synthetic */ void mo213l(Object obj) {
        ((by1) obj).o(0, (yx1) ((m) this.f13142v).f18055w, (qx1) this.f13143w, (vx1) this.f13144x);
    }

    public synchronized void m(sq0 sq0Var, rq0 rq0Var) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f13142v;
            nq0 nq0Var = (nq0) concurrentHashMap.get(sq0Var);
            k.C.f16819k.getClass();
            rq0Var.f10275d = System.currentTimeMillis();
            if (nq0Var == null) {
                qq0 qq0Var = (qq0) this.f13143w;
                nq0 nq0Var2 = new nq0(qq0Var.f9976y, qq0Var.f9977z * AdError.NETWORK_ERROR_CODE);
                if (concurrentHashMap.size() == qq0Var.f9975x) {
                    int i = qq0Var.D;
                    int i10 = i - 1;
                    sq0 sq0Var2 = null;
                    if (i != 0) {
                        long j10 = Long.MAX_VALUE;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    int i11 = Integer.MAX_VALUE;
                                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                        if (((nq0) entry.getValue()).f8823d.f4872d < i11) {
                                            i11 = ((nq0) entry.getValue()).f8823d.f4872d;
                                            sq0Var2 = (sq0) entry.getKey();
                                        }
                                    }
                                    if (sq0Var2 != null) {
                                        concurrentHashMap.remove(sq0Var2);
                                    }
                                }
                            } else {
                                for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                                    if (((nq0) entry2.getValue()).f8823d.f4871c < j10) {
                                        j10 = ((nq0) entry2.getValue()).f8823d.f4871c;
                                        sq0Var2 = (sq0) entry2.getKey();
                                    }
                                }
                                if (sq0Var2 != null) {
                                    concurrentHashMap.remove(sq0Var2);
                                }
                            }
                        } else {
                            for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                                if (((nq0) entry3.getValue()).f8823d.f4869a < j10) {
                                    j10 = ((nq0) entry3.getValue()).f8823d.f4869a;
                                    sq0Var2 = (sq0) entry3.getKey();
                                }
                            }
                            if (sq0Var2 != null) {
                                concurrentHashMap.remove(sq0Var2);
                            }
                        }
                        ma maVar = (ma) this.f13144x;
                        maVar.f8286b++;
                        ((oq0) maVar.f8289f).f9195v = true;
                    } else {
                        throw null;
                    }
                }
                concurrentHashMap.put(sq0Var, nq0Var2);
                ma maVar2 = (ma) this.f13144x;
                maVar2.f8285a++;
                ((oq0) maVar2.f8289f).f9194u = true;
                nq0Var = nq0Var2;
            }
            br0 br0Var = nq0Var.f8823d;
            br0Var.getClass();
            k.C.f16819k.getClass();
            br0Var.f4871c = System.currentTimeMillis();
            br0Var.f4872d++;
            nq0Var.a();
            LinkedList linkedList = nq0Var.f8820a;
            if (linkedList.size() != nq0Var.f8821b) {
                linkedList.add(rq0Var);
            }
            ma maVar3 = (ma) this.f13144x;
            maVar3.e++;
            oq0 oq0Var = (oq0) maVar3.f8289f;
            oq0 clone = oq0Var.clone();
            oq0Var.f9194u = false;
            oq0Var.f9195v = false;
            ar0 ar0Var = nq0Var.f8823d.f4870b;
            ar0 clone2 = ar0Var.clone();
            ar0Var.f4604u = false;
            ar0Var.f4605v = 0;
            ik z3 = nk.z();
            gk A = hk.A();
            A.b();
            ((hk) A.f4845v).B();
            lk A2 = mk.A();
            boolean z9 = clone.f9194u;
            A2.b();
            ((mk) A2.f4845v).B(z9);
            boolean z10 = clone.f9195v;
            A2.b();
            ((mk) A2.f4845v).C(z10);
            int i12 = clone2.f4605v;
            A2.b();
            ((mk) A2.f4845v).z(i12);
            A.b();
            ((hk) A.f4845v).z((mk) A2.c());
            z3.b();
            ((nk) z3.f4845v).A((hk) A.c());
            rq0Var.f10272a.zza().f6992f.G((nk) z3.c());
            v();
        } catch (Throwable th) {
            throw th;
        }
    }

    public long n() {
        i2 i2Var = (i2) this.f13144x;
        if (i2Var != null) {
            return i2Var.f6965x;
        }
        return -1L;
    }

    public la1 o() {
        bl0 bl0Var;
        gl1 b10;
        oa1 oa1Var = (oa1) this.f13142v;
        if (oa1Var != null && (bl0Var = (bl0) this.f13143w) != null) {
            if (oa1Var.f9068a == ((gl1) bl0Var.f4819v).f6427a.length) {
                if (oa1Var.a() && ((Integer) this.f13144x) == null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((oa1) this.f13142v).a() && ((Integer) this.f13144x) != null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                w91 w91Var = ((oa1) this.f13142v).f9070c;
                if (w91Var == w91.f12183j) {
                    b10 = kd1.f7721a;
                } else if (w91Var == w91.i) {
                    b10 = kd1.a(((Integer) this.f13144x).intValue());
                } else if (w91Var == w91.f12182h) {
                    b10 = kd1.b(((Integer) this.f13144x).intValue());
                } else {
                    x.o("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(w91Var)));
                    return null;
                }
                return new la1((oa1) this.f13142v, (bl0) this.f13143w, b10, (Integer) this.f13144x);
            }
            androidx.datastore.preferences.protobuf.s1.q("Key size mismatch");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters and/or key material");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.l
    public y51 p(int i, hi hiVar, int[] iArr) {
        b51 b51Var = d51.f5314v;
        ed1.u(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < hiVar.f6819a) {
            int i12 = i;
            hi hiVar2 = hiVar;
            k kVar = new k(i12, hiVar2, i10, (j) this.f13142v, iArr[i10], (String) this.f13143w, (String) this.f13144x);
            int length = objArr.length;
            int i13 = i11 + 1;
            int d2 = y41.d(length, i13);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i11] = kVar;
            i10++;
            i11 = i13;
            i = i12;
            hiVar = hiVar2;
        }
        return d51.w(objArr, i11);
    }

    public sa1 q() {
        bl0 bl0Var;
        gl1 b10;
        ua1 ua1Var = (ua1) this.f13142v;
        if (ua1Var != null && (bl0Var = (bl0) this.f13143w) != null) {
            if (ua1Var.f11595a == ((gl1) bl0Var.f4819v).f6427a.length) {
                if (ua1Var.a() && ((Integer) this.f13144x) == null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((ua1) this.f13142v).a() && ((Integer) this.f13144x) != null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                ja1 ja1Var = ((ua1) this.f13142v).f11596b;
                if (ja1Var == ja1.D) {
                    b10 = kd1.f7721a;
                } else if (ja1Var == ja1.C) {
                    b10 = kd1.a(((Integer) this.f13144x).intValue());
                } else if (ja1Var == ja1.B) {
                    b10 = kd1.b(((Integer) this.f13144x).intValue());
                } else {
                    x.o("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(ja1Var)));
                    return null;
                }
                return new sa1((ua1) this.f13142v, (bl0) this.f13143w, b10, (Integer) this.f13144x);
            }
            androidx.datastore.preferences.protobuf.s1.q("Key size mismatch");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters and/or key material");
        return null;
    }

    public ge1 r() {
        bl0 bl0Var;
        gl1 a10;
        ie1 ie1Var = (ie1) this.f13142v;
        if (ie1Var != null && (bl0Var = (bl0) this.f13143w) != null) {
            if (ie1Var.f7116a == ((gl1) bl0Var.f4819v).f6427a.length) {
                if (ie1Var.a() && ((Integer) this.f13144x) == null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((ie1) this.f13142v).a() && ((Integer) this.f13144x) != null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                x91 x91Var = ((ie1) this.f13142v).f7118c;
                if (x91Var == x91.f12520u) {
                    a10 = kd1.f7721a;
                } else if (x91Var != x91.f12519t && x91Var != x91.f12518s) {
                    if (x91Var == x91.f12517r) {
                        a10 = kd1.b(((Integer) this.f13144x).intValue());
                    } else {
                        x.o("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(x91Var)));
                        return null;
                    }
                } else {
                    a10 = kd1.a(((Integer) this.f13144x).intValue());
                }
                return new ge1((ie1) this.f13142v, (bl0) this.f13143w, a10, (Integer) this.f13144x);
            }
            androidx.datastore.preferences.protobuf.s1.q("Key size mismatch");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters and/or key material");
        return null;
    }

    public ke1 s() {
        bl0 bl0Var;
        gl1 a10;
        ne1 ne1Var = (ne1) this.f13142v;
        if (ne1Var != null && (bl0Var = (bl0) this.f13143w) != null) {
            if (ne1Var.f8678a == ((gl1) bl0Var.f4819v).f6427a.length) {
                if (ne1Var.a() && ((Integer) this.f13144x) == null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                    return null;
                }
                if (!((ne1) this.f13142v).a() && ((Integer) this.f13144x) != null) {
                    androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                    return null;
                }
                ja1 ja1Var = ((ne1) this.f13142v).f8680c;
                if (ja1Var == ja1.J) {
                    a10 = kd1.f7721a;
                } else if (ja1Var != ja1.I && ja1Var != ja1.H) {
                    if (ja1Var == ja1.G) {
                        a10 = kd1.b(((Integer) this.f13144x).intValue());
                    } else {
                        x.o("Unknown HmacParameters.Variant: ".concat(String.valueOf(ja1Var)));
                        return null;
                    }
                } else {
                    a10 = kd1.a(((Integer) this.f13144x).intValue());
                }
                return new ke1((ne1) this.f13142v, (bl0) this.f13143w, a10, (Integer) this.f13144x);
            }
            androidx.datastore.preferences.protobuf.s1.q("Key size mismatch");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters and/or key material");
        return null;
    }

    public rj1 t() {
        gl1 a10;
        if (((pj1) this.f13142v) != null) {
            BigInteger bigInteger = (BigInteger) this.f13143w;
            if (bigInteger != null) {
                int bitLength = bigInteger.bitLength();
                pj1 pj1Var = (pj1) this.f13142v;
                int i = pj1Var.f9533a;
                if (bitLength == i) {
                    if (pj1Var.a() && ((Integer) this.f13144x) == null) {
                        androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                        return null;
                    }
                    if (!((pj1) this.f13142v).a() && ((Integer) this.f13144x) != null) {
                        androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                        return null;
                    }
                    q91 q91Var = ((pj1) this.f13142v).f9535c;
                    if (q91Var == q91.N) {
                        a10 = kd1.f7721a;
                    } else if (q91Var != q91.M && q91Var != q91.L) {
                        if (q91Var == q91.K) {
                            a10 = kd1.b(((Integer) this.f13144x).intValue());
                        } else {
                            x.o("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(q91Var)));
                            return null;
                        }
                    } else {
                        a10 = kd1.a(((Integer) this.f13144x).intValue());
                    }
                    return new rj1((pj1) this.f13142v, (BigInteger) this.f13143w, a10, (Integer) this.f13144x);
                }
                throw new GeneralSecurityException(a.f(bitLength, i, "Got modulus size ", ", but parameters requires modulus size ", new StringBuilder(String.valueOf(bitLength).length() + 56 + String.valueOf(i).length())));
            }
            androidx.datastore.preferences.protobuf.s1.q("Cannot build without modulus");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters");
        return null;
    }

    public void u() {
        try {
            ((eh0) ((pr1) this.f13142v).zzb()).y0(((a) this.f13143w).f20029u);
            if (((Boolean) r.e.f17698c.a(sl.If)).booleanValue()) {
                s a10 = ((be0) this.f13144x).a();
                a10.k("action", "ptard");
                a10.k("ptard", "l");
                a10.l();
            }
        } catch (RemoteException | NullPointerException e) {
            if (((Boolean) r.e.f17698c.a(sl.Jf)).booleanValue()) {
                k.C.f16817h.d("Preconnect Local", e);
            }
        }
    }

    public void v() {
        if (((Boolean) r.e.f17698c.a(sl.f10808k7)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            qq0 qq0Var = (qq0) this.f13143w;
            sb2.append(qq0Var.f9974w);
            sb2.append(" PoolCollection");
            ma maVar = (ma) this.f13144x;
            sb2.append("\n\tPool does not exist: " + maVar.f8287c + "\n\tNew pools created: " + maVar.f8285a + "\n\tPools removed: " + maVar.f8286b + "\n\tEntries added: " + maVar.e + "\n\tNo entries retrieved: " + maVar.f8288d + "\n");
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f13142v).entrySet()) {
                i++;
                sb2.append(i);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((sq0) entry.getKey()).hashCode());
                sb2.append("    ");
                int i10 = 0;
                while (true) {
                    nq0 nq0Var = (nq0) entry.getValue();
                    nq0Var.a();
                    if (i10 >= nq0Var.f8820a.size()) {
                        break;
                    }
                    sb2.append("[O]");
                    i10++;
                }
                nq0 nq0Var2 = (nq0) entry.getValue();
                nq0Var2.a();
                for (int size = nq0Var2.f8820a.size(); size < qq0Var.f9976y; size++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                br0 br0Var = ((nq0) entry.getValue()).f8823d;
                sb2.append("Created: " + br0Var.f4869a + " Last accessed: " + br0Var.f4871c + " Accesses: " + br0Var.f4872d + "\nEntries retrieved: Valid: " + br0Var.e + " Stale: " + br0Var.f4873f);
                sb2.append("\n");
            }
            while (i < qq0Var.f9975x) {
                i++;
                sb2.append(i);
                sb2.append(".\n");
            }
            String sb3 = sb2.toString();
            int i11 = a0.f19634b;
            i.a(sb3);
        }
    }

    public q81 w(dv dvVar, xg0 xg0Var, xg0 xg0Var2, j81 j81Var) {
        b U;
        wx wxVar = (wx) this.f13142v;
        String str = dvVar.f5529x;
        f0 f0Var = k.C.f16813c;
        if (f0.e(str)) {
            U = ed1.A(new cg0(1));
        } else {
            U = ed1.U(xg0Var.a(dvVar), ExecutionException.class, x20.f12433g, wxVar);
        }
        return ed1.U(ed1.c0(ed1.c0(q81.t(U), x20.e, wxVar), j81Var, wxVar), vg0.class, new lr(this, xg0Var2, dvVar, j81Var, 3), wxVar);
    }

    @Override // e
    public void z(a aVar) {
        switch (this.f13141u) {
            case 7:
                try {
                    ((ts) this.f13142v).r(aVar.a());
                    return;
                } catch (RemoteException e) {
                    i.d("", e);
                    return;
                }
            default:
                try {
                    ((xs) this.f13142v).r(aVar.a());
                    return;
                } catch (RemoteException e8) {
                    i.d("", e8);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public void mo212zza() {
        vr0 vr0Var;
        a0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        dr drVar = (dr) this.f13144x;
        synchronized (drVar.f5484c) {
            try {
                a0.k("loadNewJavascriptEngine (failure): Lock acquired");
                drVar.f5483b = 1;
                a0.k("Failed loading new engine. Marking new engine destroyable.");
                ((cr) this.f13142v).n();
                if (((Boolean) rm.f10241d.p()).booleanValue() && (vr0Var = (vr0) drVar.f5486f) != null) {
                    rr0 rr0Var = (rr0) this.f13143w;
                    rr0Var.R("Failed loading new engine");
                    rr0Var.a(false);
                    vr0Var.b(rr0Var.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a0.k("loadNewJavascriptEngine (failure): Lock released");
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f13143w;
    }

    @Override // b
    public void R(int i) {
    }

    public /* synthetic */ zd1(int i, Object obj, Object obj2, Object obj3) {
        this.f13141u = i;
        this.f13142v = obj;
        this.f13143w = obj2;
        this.f13144x = obj3;
    }

    public zd1(Context context, wx wxVar, wx wxVar2, pr1 pr1Var, a aVar, jk0 jk0Var, be0 be0Var) {
        this.f13141u = 13;
        this.f13142v = pr1Var;
        this.f13143w = aVar;
        this.f13144x = be0Var;
    }

    public zd1(Context context, a aVar, jj jjVar, com.google.android.gms.internal.measurement.e4 e4Var) {
        this.f13141u = 14;
        this.f13143w = context;
        this.f13144x = aVar;
        this.f13142v = jjVar;
    }

    public zd1(com.google.ads.mediation.e eVar, com.google.ads.mediation.e eVar2) {
        this.f13141u = 5;
        this.f13142v = eVar;
        this.f13143w = eVar2;
    }

    public zd1(q2 q2Var) {
        this.f13141u = 28;
        this.f13142v = q2Var;
    }

    public zd1(es esVar, ds dsVar, gs gsVar) {
        this.f13141u = 10;
        this.f13143w = esVar;
        this.f13144x = dsVar;
        this.f13142v = gsVar;
    }

    public zd1(ih1 ih1Var, gl1 gl1Var, x91 x91Var) {
        this.f13141u = 0;
        this.f13143w = ih1Var;
        this.f13142v = gl1Var;
        this.f13144x = x91Var;
    }

    public /* synthetic */ zd1(Object obj, Object obj2, Object obj3, int i, boolean z3) {
        this.f13141u = i;
        this.f13142v = obj2;
        this.f13143w = obj3;
        this.f13144x = obj;
    }

    public zd1() {
        this.f13141u = 19;
        this.f13143w = new ArrayDeque();
        this.f13144x = null;
        this.f13142v = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public zd1(Context context) {
        this.f13141u = 27;
        this.f13142v = context != null ? context.getApplicationContext() : null;
        if (context == null) {
            this.f13143w = vu1.f12010f;
        }
    }

    public zd1(wa0 wa0Var, be0 be0Var) {
        this.f13141u = 17;
        this.f13142v = wa0Var;
        yk0 yk0Var = new yk0(be0Var);
        this.f13143w = yk0Var;
        this.f13144x = new dl0(yk0Var, wa0Var.e);
    }

    public zd1(qq0 qq0Var) {
        this.f13141u = 18;
        this.f13142v = new ConcurrentHashMap(qq0Var.f9976y);
        this.f13143w = qq0Var;
        this.f13144x = new ma();
    }

    public /* synthetic */ zd1(int i) {
        this.f13141u = i;
        this.f13142v = null;
        this.f13143w = null;
        this.f13144x = null;
    }

    public zd1(String str) {
        this.f13141u = 2;
        rv1 rv1Var = new rv1();
        rv1Var.d("video/mp2t");
        rv1Var.e(str);
        this.f13142v = new mw1(rv1Var);
    }

    public zd1(List list) {
        this.f13141u = 3;
        this.f13142v = list;
        this.f13143w = new i3[list.size()];
        d2 d2Var = new d2(new tf(5, this));
        this.f13144x = d2Var;
        d2Var.c(3);
    }
}