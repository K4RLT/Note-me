package com.google.android.gms.internal.ads;
import g9.r;
import k9.a0;
import k9.f0;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseBooleanArray;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class wz implements as1, hu1 {
    public static final AtomicInteger O = new AtomicInteger(0);
    public static final AtomicInteger P = new AtomicInteger(0);
    public eu1 A;
    public ByteBuffer B;
    public boolean C;
    public my D;
    public int E;
    public int F;
    public long G;
    public final String H;
    public final int I;
    public Integer K;
    public final ArrayList L;
    public volatile sz M;

    /* renamed from: u, reason: collision with root package name */
    public final Context f12372u;

    /* renamed from: v, reason: collision with root package name */
    public final rz f12373v;

    /* renamed from: w, reason: collision with root package name */
    public final p f12374w;

    /* renamed from: x, reason: collision with root package name */
    public final qy f12375x;

    /* renamed from: y, reason: collision with root package name */
    public final WeakReference f12376y;

    /* renamed from: z, reason: collision with root package name */
    public final tc f12377z;
    public final Object J = new Object();
    public final HashSet N = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
    
        if (((java.lang.Boolean) r1.f17698c.a(com.google.android.gms.internal.ads.sl.f11010x2)).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.android.gms.internal.ads.tc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wz(android.content.Context r6, com.google.android.gms.internal.ads.qy r7, com.google.android.gms.internal.ads.h00 r8, java.lang.Integer r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wz.<init>(android.content.Context, com.google.android.gms.internal.ads.qy, com.google.android.gms.internal.ads.h00, java.lang.Integer):void");
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void b(int i) {
        this.F += i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.as1
    public final void c(qb1 qb1Var, dj1 dj1Var, boolean z3) {
        if (qb1Var instanceof iq1) {
            synchronized (this.J) {
                this.L.add((iq1) qb1Var);
            }
        } else if (qb1Var instanceof sz) {
            this.M = (sz) qb1Var;
            h00 h00Var = (h00) this.f12376y.get();
            if (((Boolean) r.e.f17698c.a(sl.f11010x2)).booleanValue() && h00Var != null && this.M.I) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.M.K));
                hashMap.put("gcacheDownloaded", String.valueOf(this.M.L));
                f0.f19676l.post(new t81(h00Var, 11, hashMap));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void d(int i) {
        my myVar = this.D;
        if (myVar != null) {
            myVar.S(i);
        }
    }

    public final void finalize() {
        O.decrementAndGet();
        if (a0.m()) {
            a0.k("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void h(ir irVar) {
        my myVar = this.D;
        if (myVar != null) {
            myVar.w(irVar.f7194a, irVar.f7195b);
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void i(mw1 mw1Var) {
        h00 h00Var = (h00) this.f12376y.get();
        if (((Boolean) r.e.f17698c.a(sl.f11010x2)).booleanValue() && h00Var != null) {
            HashMap hashMap = new HashMap();
            String str = mw1Var.f8458n;
            if (str != null) {
                hashMap.put("audioMime", str);
            }
            String str2 = mw1Var.f8459o;
            if (str2 != null) {
                hashMap.put("audioSampleMime", str2);
            }
            String str3 = mw1Var.f8455k;
            if (str3 != null) {
                hashMap.put("audioCodec", str3);
            }
            h00Var.b("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void j(mw1 mw1Var) {
        h00 h00Var = (h00) this.f12376y.get();
        if (((Boolean) r.e.f17698c.a(sl.f11010x2)).booleanValue() && h00Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(mw1Var.f8470z));
            hashMap.put("bitRate", String.valueOf(mw1Var.f8454j));
            int i = mw1Var.f8466v;
            int i10 = mw1Var.f8467w;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i10).length());
            sb2.append(i);
            sb2.append("x");
            sb2.append(i10);
            hashMap.put("resolution", sb2.toString());
            String str = mw1Var.f8458n;
            if (str != null) {
                hashMap.put("videoMime", str);
            }
            String str2 = mw1Var.f8459o;
            if (str2 != null) {
                hashMap.put("videoSampleMime", str2);
            }
            String str3 = mw1Var.f8455k;
            if (str3 != null) {
                hashMap.put("videoCodec", str3);
            }
            h00Var.b("onMetadataEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final void k(dj1 dj1Var, boolean z3, int i) {
        this.E += i;
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void n(IOException iOException) {
        my myVar = this.D;
        if (myVar != null) {
            if (this.f12375x.f10032j) {
                myVar.x(iOException);
            } else {
                myVar.y(iOException, "onLoadError");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void o(ns1 ns1Var) {
        my myVar = this.D;
        if (myVar != null) {
            myVar.y(ns1Var, "onPlayerError");
        }
    }

    @Override // com.google.android.gms.internal.ads.hu1
    public final void p() {
        my myVar = this.D;
        if (myVar != null) {
            myVar.u();
        }
    }

    public final long q() {
        if (this.M != null && this.M.J && this.M.K) {
            return Math.min(this.E, this.M.M);
        }
        return 0L;
    }

    public final long r() {
        if (this.M != null && this.M.J) {
            sz szVar = this.M;
            if (szVar.H != null) {
                AtomicLong atomicLong = szVar.O;
                if (atomicLong.get() != -1) {
                    return atomicLong.get();
                }
                synchronized (szVar) {
                    try {
                        if (szVar.N == null) {
                            szVar.N = xx.f12651a.j(new qf(3, szVar));
                        }
                    } finally {
                    }
                }
                if (szVar.N.isDone()) {
                    try {
                        szVar.O.compareAndSet(-1L, ((Long) szVar.N.get()).longValue());
                        return szVar.O.get();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            }
            return -1L;
        }
        synchronized (this.J) {
            while (true) {
                ArrayList arrayList = this.L;
                if (!arrayList.isEmpty()) {
                    long j10 = this.G;
                    Map f10 = ((iq1) arrayList.remove(0)).f();
                    long j11 = 0;
                    if (f10 != null) {
                        Iterator it = f10.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && ed1.L((CharSequence) entry.getKey(), "content-length") && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused2) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.G = j10 + j11;
                }
            }
        }
        return this.G;
    }

    public final void s(boolean z3) {
        j jVar;
        boolean equals;
        if (this.A != null) {
            int i = 0;
            while (true) {
                eu1 eu1Var = this.A;
                eu1Var.f5814x.b();
                ys1 ys1Var = eu1Var.f5813w;
                ys1Var.Q0();
                int length = ys1Var.B.length;
                if (i < 2) {
                    p pVar = this.f12374w;
                    synchronized (pVar.f9294c) {
                        jVar = pVar.e;
                    }
                    jVar.getClass();
                    i iVar = new i(jVar);
                    boolean z9 = !z3;
                    SparseBooleanArray sparseBooleanArray = iVar.E;
                    if (sparseBooleanArray.get(i) != z9) {
                        if (!z3) {
                            sparseBooleanArray.put(i, true);
                        } else {
                            sparseBooleanArray.delete(i);
                        }
                    }
                    j jVar2 = new j(iVar);
                    synchronized (pVar.f9294c) {
                        equals = pVar.e.equals(jVar2);
                        pVar.e = jVar2;
                    }
                    if (!equals) {
                        if (jVar2.A && pVar.f9295d == null) {
                            x21.F("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
                        }
                        et1 et1Var = pVar.f9292a;
                        if (et1Var != null) {
                            et1Var.A.c(10);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.n, com.google.android.gms.internal.ads.b0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.google.android.gms.internal.ads.v1] */
    public final oy1 t(Uri uri) {
        j2 j2Var;
        b51 b51Var = d51.f5314v;
        y51 y51Var = y51.f12781y;
        List list = Collections.EMPTY_LIST;
        y51 y51Var2 = y51.f12781y;
        o3 o3Var = o3.f8931a;
        if (uri != null) {
            j2Var = new j2(uri, y51Var2);
        } else {
            j2Var = null;
        }
        y4 y4Var = new y4("", new n(), j2Var, new Object(), a7.C);
        int i = this.f12375x.f10029f;
        tc tcVar = this.f12377z;
        tcVar.f11314u = i;
        y4Var.f12771b.getClass();
        return new oy1(y4Var, (xe1) tcVar.f11315v, (zq0) tcVar.f11316w, (s6) tcVar.f11317x, tcVar.f11314u);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, com.google.android.gms.internal.ads.bx1] */
    public final void u(Uri[] uriArr, ByteBuffer byteBuffer, boolean z3) {
        Object fy1Var;
        boolean z9;
        int i;
        if (this.A != null) {
            this.B = byteBuffer;
            this.C = z3;
            int length = uriArr.length;
            if (length == 1) {
                fy1Var = t(uriArr[0]);
            } else {
                hx1[] hx1VarArr = new hx1[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    hx1VarArr[i10] = t(uriArr[i10]);
                }
                fy1Var = new fy1(new Object(), hx1VarArr);
            }
            eu1 eu1Var = this.A;
            eu1Var.f5814x.b();
            ys1 ys1Var = eu1Var.f5813w;
            ys1Var.Q0();
            List singletonList = Collections.singletonList(fy1Var);
            ys1Var.Q0();
            ys1Var.Q0();
            ys1Var.Z1(ys1Var.f12954r0);
            ys1Var.p2();
            ys1Var.Z++;
            ArrayList arrayList = ys1Var.J;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < singletonList.size(); i11++) {
                tt1 tt1Var = new tt1((hx1) singletonList.get(i11), ys1Var.K);
                arrayList2.add(tt1Var);
                arrayList.add(i11, new ws1(tt1Var.f11444b, tt1Var.f11443a));
            }
            ys1Var.f12957u0 = new uy1(new Random(ys1Var.f12957u0.f11755a.nextLong())).a(arrayList2.size());
            zt1 zt1Var = new zt1(arrayList, ys1Var.f12957u0);
            boolean g8 = zt1Var.g();
            int i12 = zt1Var.f13266d;
            if (!g8 && i12 < 0) {
                throw new IllegalStateException();
            }
            int k3 = zt1Var.k(false);
            vt1 e22 = ys1Var.e2(ys1Var.f12954r0, zt1Var, ys1Var.h2(zt1Var, k3, -9223372036854775807L));
            int i13 = e22.e;
            if (i13 == 1) {
                i13 = 1;
            } else {
                if (!zt1Var.g()) {
                    if (k3 != -1) {
                        if (k3 < i12) {
                            i13 = 2;
                        }
                    }
                }
                i13 = 4;
            }
            vt1 f22 = ys1.f2(e22, i13);
            et1 et1Var = ys1Var.G;
            long u9 = bq0.u(-9223372036854775807L);
            uy1 uy1Var = ys1Var.f12957u0;
            et1Var.getClass();
            et1Var.A.b(17, new ct1(arrayList2, uy1Var, k3, u9)).a();
            if (!ys1Var.f12954r0.f11986b.f13003a.equals(f22.f11986b.f13003a) && !ys1Var.f12954r0.f11985a.g()) {
                z9 = true;
            } else {
                z9 = false;
            }
            ys1Var.c2(f22, 0, z9, 4, ys1Var.b2(f22), -1);
            eu1 eu1Var2 = this.A;
            eu1Var2.f5814x.b();
            ys1 ys1Var2 = eu1Var2.f5813w;
            ys1Var2.Q0();
            vt1 vt1Var = ys1Var2.f12954r0;
            if (vt1Var.e == 1) {
                vt1 e = vt1Var.e(null);
                if (true != e.f11985a.g()) {
                    i = 2;
                } else {
                    i = 4;
                }
                vt1 f23 = ys1.f2(e, i);
                ys1Var2.Z++;
                Handler handler = ys1Var2.G.A.f7185a;
                fo0 g10 = io0.g();
                g10.f6137a = handler.obtainMessage(29);
                g10.a();
                ys1Var2.c2(f23, 1, false, 5, -9223372036854775807L, -1);
            }
            P.incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.as1
    public final void e(dj1 dj1Var, boolean z3) {
    }
}
