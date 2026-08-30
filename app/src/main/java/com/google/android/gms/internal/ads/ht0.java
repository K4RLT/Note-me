package com.google.android.gms.internal.ads;
import b.a;
import g9.k0;
import g9.n0;
import g9.p0;
import g9.r0;
import g9.t2;
import k9.a0;
import l9.d;
import l9.i;
import z8.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes.dex */
public final class ht0 extends ph implements g9.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final it0 f6892u;

    /* renamed from: v, reason: collision with root package name */
    public final ct0 f6893v;

    public ht0(it0 it0Var, ct0 ct0Var) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.f6892u = it0Var;
        this.f6893v = ct0Var;
    }

    public final boolean A4(String str) {
        boolean e;
        it0 it0Var = this.f6892u;
        synchronized (it0Var) {
            e = it0Var.e(str, z8.b.INTERSTITIAL);
        }
        return e;
    }

    public final g9.k0 B4(String str) {
        g9.k0 k0Var;
        it0 it0Var = this.f6892u;
        synchronized (it0Var) {
            k0Var = (g9.k0) it0Var.f(g9.k0.class, str, z8.b.INTERSTITIAL);
        }
        return k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Type inference failed for: r4v10, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C4(java.lang.String r19, g9.t2 r20, g9.p0 r21) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ht0.C4(java.lang.String, g9.t2, g9.p0):boolean");
    }

    public final boolean D4(int i, String str) {
        String o10;
        boolean z3;
        Long l10;
        jt0 jt0Var;
        int s10;
        z8.b a10 = z8.b.a(i);
        int i10 = 0;
        if (a10 == null) {
            return false;
        }
        ct0 ct0Var = this.f6893v;
        ct0Var.f5164g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = ct0Var.f5159a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(a10)) {
                    return false;
                }
                dt0 dt0Var = (dt0) ((Map) hashMap.get(a10)).get(str);
                if (dt0Var == null) {
                    o10 = null;
                } else {
                    o10 = dt0Var.o();
                }
                if (o10 != null && a10.equals(dt0Var.q())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    l10 = Long.valueOf(System.currentTimeMillis());
                } else {
                    l10 = null;
                }
                if (dt0Var == null) {
                    jt0Var = null;
                } else {
                    hq0 hq0Var = new hq0(dt0Var.r(), 19, a10);
                    hq0Var.f6874x = str;
                    jt0Var = new jt0(hq0Var);
                }
                bl0 bl0Var = ct0Var.f5161c;
                if (dt0Var == null) {
                    s10 = 0;
                } else {
                    s10 = dt0Var.s();
                }
                if (dt0Var != null) {
                    i10 = dt0Var.t();
                }
                bl0Var.i(s10, i10, currentTimeMillis, l10, o10, jt0Var, "2");
                return z3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g9.r0
    public final void O(int i) {
        ct0 ct0Var = this.f6893v;
        ct0Var.getClass();
        z8.b a10 = z8.b.a(i);
        if (a10 == null) {
            return;
        }
        HashMap hashMap = ct0Var.f5159a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(a10)) {
                    return;
                }
                Map map = (Map) hashMap.get(a10);
                int size = map.size();
                if (size == 0) {
                    return;
                }
                d51 u9 = d51.u(map.values());
                map.clear();
                int size2 = u9.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    dt0 dt0Var = (dt0) u9.get(i10);
                    if (dt0Var != null) {
                        dt0Var.f5499g.set(false);
                        dt0Var.f5507p.set(false);
                        at0 at0Var = ct0Var.i;
                        if (at0Var != null) {
                            at0Var.d(dt0Var);
                        }
                        Queue queue = dt0Var.f5501j;
                        synchronized (queue) {
                            queue.clear();
                        }
                        String valueOf = String.valueOf(dt0Var.f5503l);
                        int i11 = k9.a0.f19634b;
                        l9.i.e("Destroyed ad preloader for preloadId: ".concat(valueOf));
                    }
                }
                String concat = "Destroyed all ad preloaders for ad format: ".concat(a10.toString());
                int i12 = k9.a0.f19634b;
                l9.i.e(concat);
                bl0 bl0Var = ct0Var.f5161c;
                ct0Var.f5164g.getClass();
                bl0Var.m("pda", System.currentTimeMillis(), null, null, a10, -1, -1, size);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        String r8;
        int s10;
        int i10 = -1;
        g9.n0 n0Var = null;
        String r10 = null;
        r5 = null;
        r5 = null;
        g9.t2 t2Var = null;
        g9.p0 p0Var = null;
        int i11 = 0;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(g9.t2.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    if (queryLocalInterface instanceof g9.n0) {
                        n0Var = (g9.n0) queryLocalInterface;
                    } else {
                        n0Var = new oh(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback", 0);
                    }
                }
                qh.f(parcel);
                v4(createTypedArrayList, n0Var);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                qh.f(parcel);
                boolean w42 = w4(readString);
                parcel2.writeNoException();
                parcel2.writeInt(w42 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                qh.f(parcel);
                wv x42 = x4(readString2);
                parcel2.writeNoException();
                qh.e(parcel2, x42);
                return true;
            case 4:
                String readString3 = parcel.readString();
                qh.f(parcel);
                boolean y42 = y4(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(y42 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                qh.f(parcel);
                ti z42 = z4(readString4);
                parcel2.writeNoException();
                qh.e(parcel2, z42);
                return true;
            case 6:
                String readString5 = parcel.readString();
                qh.f(parcel);
                boolean A4 = A4(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(A4 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                qh.f(parcel);
                g9.k0 B4 = B4(readString6);
                parcel2.writeNoException();
                qh.e(parcel2, B4);
                return true;
            case 8:
                tr.v4(parcel.readStrongBinder());
                qh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                String readString7 = parcel.readString();
                g9.t2 t2Var2 = (g9.t2) qh.b(parcel, g9.t2.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
                    if (queryLocalInterface2 instanceof g9.p0) {
                        p0Var = (g9.p0) queryLocalInterface2;
                    } else {
                        p0Var = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2", 0);
                    }
                }
                qh.f(parcel);
                boolean C4 = C4(readString7, t2Var2, p0Var);
                parcel2.writeNoException();
                parcel2.writeInt(C4 ? 1 : 0);
                return true;
            case 10:
                int readInt = parcel.readInt();
                String readString8 = parcel.readString();
                qh.f(parcel);
                boolean D4 = D4(readInt, readString8);
                parcel2.writeNoException();
                parcel2.writeInt(D4 ? 1 : 0);
                return true;
            case 11:
                String readString9 = parcel.readString();
                qh.f(parcel);
                g9.k0 k0Var = (g9.k0) this.f6893v.b(g9.k0.class, readString9, z8.b.INTERSTITIAL);
                parcel2.writeNoException();
                qh.e(parcel2, k0Var);
                return true;
            case 12:
                String readString10 = parcel.readString();
                qh.f(parcel);
                ti tiVar = (ti) this.f6893v.b(ti.class, readString10, z8.b.APP_OPEN_AD);
                parcel2.writeNoException();
                qh.e(parcel2, tiVar);
                return true;
            case 13:
                String readString11 = parcel.readString();
                qh.f(parcel);
                wv wvVar = (wv) this.f6893v.b(wv.class, readString11, z8.b.REWARDED);
                parcel2.writeNoException();
                qh.e(parcel2, wvVar);
                return true;
            case 14:
                int readInt2 = parcel.readInt();
                String readString12 = parcel.readString();
                qh.f(parcel);
                z8.b a10 = z8.b.a(readInt2);
                if (a10 != null) {
                    ct0 ct0Var = this.f6893v;
                    HashMap hashMap = ct0Var.f5159a;
                    synchronized (hashMap) {
                        try {
                            if (hashMap.containsKey(a10)) {
                                dt0 dt0Var = (dt0) ((Map) hashMap.get(a10)).get(readString12);
                                bl0 bl0Var = ct0Var.f5161c;
                                ct0Var.f5164g.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                if (dt0Var == null) {
                                    r8 = null;
                                } else {
                                    r8 = dt0Var.r();
                                }
                                if (dt0Var == null) {
                                    s10 = -1;
                                } else {
                                    s10 = dt0Var.s();
                                }
                                if (dt0Var != null) {
                                    i10 = dt0Var.t();
                                }
                                bl0Var.m("pgc", currentTimeMillis, readString12, r8, a10, s10, i10, 1);
                                if (dt0Var != null) {
                                    t2Var = (g9.t2) dt0Var.e.get();
                                }
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                qh.d(parcel2, t2Var);
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                qh.f(parcel);
                ct0 ct0Var2 = this.f6893v;
                ct0Var2.getClass();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = ct0Var2.f5159a;
                z8.b a11 = z8.b.a(readInt3);
                synchronized (hashMap3) {
                    if (a11 != null) {
                        try {
                            if (hashMap3.containsKey(a11)) {
                                for (dt0 dt0Var2 : ((Map) hashMap3.get(a11)).values()) {
                                    hashMap2.put(dt0Var2.f5503l, (g9.t2) dt0Var2.e.get());
                                }
                                bl0 bl0Var2 = ct0Var2.f5161c;
                                ct0Var2.f5164g.getClass();
                                bl0Var2.m("pgcs", System.currentTimeMillis(), null, null, a11, -1, -1, hashMap2.size());
                            }
                        } finally {
                        }
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    String str = (String) entry.getKey();
                    g9.t2 t2Var3 = (g9.t2) entry.getValue();
                    Parcel obtain = Parcel.obtain();
                    t2Var3.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    bundle.putByteArray(str, marshall);
                }
                parcel2.writeNoException();
                qh.d(parcel2, bundle);
                return true;
            case 16:
                int readInt4 = parcel.readInt();
                String readString13 = parcel.readString();
                qh.f(parcel);
                z8.b a12 = z8.b.a(readInt4);
                if (a12 != null) {
                    ct0 ct0Var3 = this.f6893v;
                    HashMap hashMap4 = ct0Var3.f5159a;
                    synchronized (hashMap4) {
                        try {
                            if (hashMap4.containsKey(a12)) {
                                dt0 dt0Var3 = (dt0) ((Map) hashMap4.get(a12)).get(readString13);
                                if (dt0Var3 != null) {
                                    i11 = dt0Var3.t();
                                }
                                int i12 = i11;
                                bl0 bl0Var3 = ct0Var3.f5161c;
                                ct0Var3.f5164g.getClass();
                                long currentTimeMillis2 = System.currentTimeMillis();
                                if (dt0Var3 != null) {
                                    r10 = dt0Var3.r();
                                }
                                String str2 = r10;
                                if (dt0Var3 != null) {
                                    i10 = dt0Var3.s();
                                }
                                bl0Var3.m("pnav", currentTimeMillis2, readString13, str2, a12, i10, i12, 1);
                                i11 = i12;
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i11);
                return true;
            case 17:
                int readInt5 = parcel.readInt();
                String readString14 = parcel.readString();
                qh.f(parcel);
                z8.b a13 = z8.b.a(readInt5);
                if (a13 != null) {
                    ct0 ct0Var4 = this.f6893v;
                    HashMap hashMap5 = ct0Var4.f5159a;
                    synchronized (hashMap5) {
                        try {
                            if (hashMap5.containsKey(a13)) {
                                dt0 dt0Var4 = (dt0) ((Map) hashMap5.get(a13)).remove(readString14);
                                if (dt0Var4 != null) {
                                    dt0Var4.f5499g.set(false);
                                    dt0Var4.f5507p.set(false);
                                    at0 at0Var = ct0Var4.i;
                                    if (at0Var != null) {
                                        at0Var.d(dt0Var4);
                                    }
                                    int t3 = dt0Var4.t();
                                    Queue queue = dt0Var4.f5501j;
                                    synchronized (queue) {
                                        queue.clear();
                                    }
                                    bl0 bl0Var4 = ct0Var4.f5161c;
                                    ct0Var4.f5164g.getClass();
                                    bl0Var4.m("pd", System.currentTimeMillis(), readString14, dt0Var4.r(), a13, dt0Var4.s(), t3, 1);
                                    i11 = 1;
                                }
                            }
                        } finally {
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i11);
                return true;
            case 18:
                int readInt6 = parcel.readInt();
                qh.f(parcel);
                O(readInt6);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e9, code lost:
    
        r3 = 0;
        r11 = l9.d.f20036b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f3, code lost:
    
        if (r4.containsKey(r10) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        r3 = r4.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f9, code lost:
    
        r4.put((java.util.EnumMap) r10, (z8.b) java.lang.Integer.valueOf(((java.lang.Integer) r3).intValue() + 1));
        r9 = new com.google.android.gms.internal.ads.jt0(new com.google.android.gms.internal.ads.hq0(r9, 19, r10));
        r14 = r8.f17705x;
        r2.f7219h.getClass();
        r13.b(r14, java.lang.System.currentTimeMillis(), r9, "1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0126, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:4:0x0005, B:7:0x0094, B:9:0x00a7, B:14:0x00c3, B:16:0x00c7, B:17:0x00ce, B:18:0x00d6, B:21:0x00e8, B:22:0x00e9, B:24:0x00f5, B:25:0x00f9, B:32:0x012c, B:37:0x012d, B:40:0x0012, B:42:0x0016, B:56:0x0035, B:57:0x0039, B:59:0x003f, B:62:0x0044, B:63:0x0086, B:66:0x0050, B:67:0x006f, B:44:0x0017, B:50:0x001b, B:46:0x0032, B:53:0x002b, B:20:0x00d7), top: B:3:0x0005, inners: #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v4(java.util.ArrayList r21, g9.n0 r22) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ht0.v4(java.util.ArrayList, g9.n0):void");
    }

    public final boolean w4(String str) {
        boolean e;
        it0 it0Var = this.f6892u;
        synchronized (it0Var) {
            e = it0Var.e(str, z8.b.REWARDED);
        }
        return e;
    }

    public final wv x4(String str) {
        wv wvVar;
        it0 it0Var = this.f6892u;
        synchronized (it0Var) {
            wvVar = (wv) it0Var.f(wv.class, str, z8.b.REWARDED);
        }
        return wvVar;
    }

    public final boolean y4(String str) {
        boolean e;
        it0 it0Var = this.f6892u;
        synchronized (it0Var) {
            e = it0Var.e(str, z8.b.APP_OPEN_AD);
        }
        return e;
    }

    public final ti z4(String str) {
        ti tiVar;
        it0 it0Var = this.f6892u;
        synchronized (it0Var) {
            tiVar = (ti) it0Var.f(ti.class, str, z8.b.APP_OPEN_AD);
        }
        return tiVar;
    }

    @Override // g9.r0
    public final void m1(tr trVar) {
    }
}
