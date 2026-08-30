package com.google.android.gms.internal.ads;
import a9.a;
import ca.b;
import e9.b;
import f9.k;
import fa.c;
import a0.k;
import a5.a;
import a9.c;
import ac.b;
import ba.p;
import f9.d;
import f9.g;
import g9.d3;
import g9.r;
import j6.s;
import k9.a0;
import r.e;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jk0 implements l, p7, fa.c, e9.b, ay, zx, s81, n80, f9.g, xg0, f9.d, el0, zo0 {

    /* renamed from: w, reason: collision with root package name */
    public static final Object f7463w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public static jk0 f7464x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7465u;

    /* renamed from: v, reason: collision with root package name */
    public Object f7466v;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.o80, java.lang.Object] */
    public jk0(Context context, wx wxVar, rx0 rx0Var) {
        int i = 1;
        this.f7465u = 1;
        context.getClass();
        wxVar.getClass();
        Object obj = new Object();
        obj.f9020a = obj;
        tr1 a10 = tr1.a(context);
        obj.f9021b = a10;
        rr1 a11 = rr1.a(xy.H);
        obj.f9022c = a11;
        tr1 a12 = tr1.a(wxVar);
        obj.f9023d = a12;
        rr1 a13 = rr1.a(new ey0(a10, a11, a12));
        int i10 = 2;
        rr1 a14 = rr1.a(new pw(a10, a12, i10));
        rr1 a15 = rr1.a(new pw(a10, a12, 3));
        rr1 a16 = rr1.a(new g10(rr1.a(a12), a11, 16));
        rr1 a17 = rr1.a(b80.J);
        tr1 a18 = tr1.a(rx0Var);
        obj.e = a18;
        rr1 a19 = rr1.a(new ey0(a16, a17, a18));
        obj.f9024f = a19;
        rr1 a20 = rr1.a(new pw(a12, a18, i));
        obj.f9025g = a20;
        rr1 a21 = rr1.a(new r40(a10, a19, a12, a20, a18, 18));
        obj.f9026h = a21;
        int i11 = xr1.f12610c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(a13);
        arrayList.add(a14);
        arrayList.add(a15);
        arrayList.add(a21);
        xr1 xr1Var = new xr1(arrayList, list);
        rr1 a22 = rr1.a(new z20(23, new sx0(0, obj)));
        rr1 a23 = rr1.a(new z20(24, new sx0(i, obj)));
        rr1 a24 = rr1.a(new z20(25, new sx0(i10, obj)));
        int i12 = 17;
        rr1 a25 = rr1.a(new g10(a11, a21, i12));
        obj.i = a25;
        rr1 a26 = rr1.a(new r40(a18, rr1.a(new h30(a22, a23, a24, a18, a12, a25)), a21, a12, a25, 19));
        rr1 a27 = rr1.a(new pe0(a12, 5));
        obj.f9027j = a27;
        rr1 a28 = rr1.a(new f01(a10, a25, a18, a27));
        rr1 a29 = rr1.a(new f01(2, a25, a27, a10, a18));
        ArrayList arrayList2 = new ArrayList(3);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(a26);
        arrayList2.add(a28);
        arrayList2.add(a29);
        rr1 a30 = rr1.a(new gm((wr1) xr1Var, (wr1) new xr1(arrayList2, list2), (sr1) a12, a25, 17));
        rr1 a31 = rr1.a(ct.E);
        rr1 a32 = rr1.a(new je0(a11, i12));
        ArrayList arrayList3 = new ArrayList(7);
        List list3 = Collections.EMPTY_LIST;
        arrayList3.add(a31);
        arrayList3.add(a13);
        arrayList3.add(a14);
        arrayList3.add(a32);
        arrayList3.add(a15);
        arrayList3.add(a28);
        arrayList3.add(a29);
        int i13 = 16;
        rr1 a33 = rr1.a(new sm0(a31, new xr1(arrayList3, list3), i13));
        obj.f9028k = a33;
        rr1 a34 = rr1.a(new je0(a25, i13));
        obj.f9029l = a34;
        obj.f9030m = rr1.a(new w50(a30, a26, a33, a25, a19, rr1.a(new f01(0, a25, a34, a10, a18)), a18));
        obj.f9031n = rr1.a(new pe0(a10, 4));
        obj.f9032o = rr1.a(new pe0(a12, 6));
        this.f7466v = (px0) ((rr1) obj.f9030m).zzb();
    }

    public void B(h2 h2Var) {
        long[] jArr = h2Var.e;
        if (jArr.length > 0) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7466v;
            if (!linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
                linkedHashMap.put(Long.valueOf(jArr[0]), h2Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.bp0, java.lang.Object] */
    public ac.b C(x90 x90Var, yo0 yo0Var, j60 j60Var) {
        a20 h3 = yo0Var.h((xo0) x90Var.f12503w);
        com.google.android.gms.internal.ads.bp0 obj = new Object();
        switch (h3.f4319a) {
            case 0:
                h3.f4321c = obj;
                break;
            default:
                h3.f4321c = obj;
                break;
        }
        j60 j60Var2 = (j60) h3.c();
        this.f7466v = j60Var2;
        i50 zza = j60Var2.zza();
        Object obj2 = new Object();
        q81 t3 = q81.t(zza.b());
        mr mrVar = new mr(obj2, 12, zza);
        o81 o81Var = o81.f9033u;
        return ed1.d0(ed1.c0(t3, mrVar, o81Var), new cv(7, obj2), o81Var);
    }

    public h2 D() {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (h2 h2Var : ((LinkedHashMap) this.f7466v).values()) {
            arrayList.add(h2Var.f6542b);
            arrayList2.add(h2Var.f6543c);
            arrayList3.add(h2Var.f6544d);
            arrayList4.add(h2Var.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i = (int) j10;
        if (j10 == i) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.G(j10, "the total number of elements (%s) in the arrays must fit in an int", z3);
        int[] iArr3 = new int[i];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            int length = iArr4.length;
            System.arraycopy(iArr4, 0, iArr3, i10, length);
            i10 += length;
        }
        return new h2(iArr3, xy.A((long[][]) arrayList2.toArray(new long[arrayList2.size()])), xy.A((long[][]) arrayList3.toArray(new long[arrayList3.size()])), xy.A((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public vc E() {
        return (vc) Optional.ofNullable((vc) ((ArrayDeque) this.f7466v).peek()).orElseThrow(uc.f11613b);
    }

    public void F(RemoteException remoteException) {
        ((zd1) this.f7466v).u();
        if (((Boolean) g9.r.e.f17698c.a(sl.Jf)).booleanValue()) {
            f9.k.C.f16817h.d("Preconnect Remote", remoteException);
        }
    }

    public int G() {
        int optInt = ((JSONObject) this.f7466v).optInt("media_type", -1);
        if (optInt != 0) {
            if (optInt == 1) {
                return 1;
            }
            return 3;
        }
        return 2;
    }

    public String H(Context context) {
        String num;
        c81 c81Var;
        long j10;
        px0 px0Var = (px0) this.f7466v;
        dy0 dy0Var = px0Var.e;
        h21 h21Var = px0Var.f9650d;
        long j11 = px0Var.i;
        boolean z3 = false;
        if (px0Var.f9654j && System.currentTimeMillis() - j11 <= px0Var.f9655k) {
            z3 = true;
        }
        g21 a10 = h21Var.a(3);
        try {
            try {
                try {
                    try {
                        a10.a();
                        oy0 oy0Var = px0Var.f9647a;
                        synchronized (oy0Var) {
                            c81Var = oy0Var.e;
                            if (c81Var == null) {
                                throw null;
                            }
                        }
                        b81 c02 = ed1.c0(c81Var, new mr(px0Var, 14, context), o81.f9033u);
                        if (z3) {
                            j10 = px0Var.f9653h;
                        } else {
                            j10 = px0Var.f9651f;
                        }
                        num = (String) c02.get(j10, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e) {
                        e = e;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        a10.b(e);
                        num = Integer.toString(3);
                    }
                } catch (Throwable th) {
                    a10.b(th);
                    throw th;
                }
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                a10.b(e8);
                num = "";
            } catch (TimeoutException unused) {
                if (z3) {
                    num = ((e01) px0Var.f9652g.zzb()).a(j11);
                } else {
                    h21Var.b(56);
                    num = Integer.toString(17);
                }
            }
            a10.c();
            dy0Var.zzb();
            return num;
        } catch (Throwable th2) {
            a10.c();
            dy0Var.zzb();
            throw th2;
        }
    }

    public String K(Context context, String str, View view) {
        String num;
        c81 c81Var;
        px0 px0Var = (px0) this.f7466v;
        dy0 dy0Var = px0Var.e;
        h21 h21Var = px0Var.f9650d;
        g21 a10 = h21Var.a(5);
        try {
            try {
                try {
                    a10.a();
                    oy0 oy0Var = px0Var.f9647a;
                    synchronized (oy0Var) {
                        c81Var = oy0Var.e;
                        if (c81Var == null) {
                            throw null;
                        }
                    }
                    num = (String) ed1.c0(c81Var, new lr(7, px0Var, context, view, str), o81.f9033u).get(px0Var.f9651f, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    a10.b(e);
                    num = "";
                } catch (Throwable th) {
                    a10.b(th);
                    throw th;
                }
            } catch (ExecutionException e8) {
                Throwable th2 = e8;
                Throwable cause = th2.getCause();
                if (cause != null) {
                    th2 = cause;
                }
                a10.b(th2);
                num = Integer.toString(3);
            } catch (TimeoutException unused) {
                h21Var.b(58);
                num = Integer.toString(17);
            }
            a10.c();
            dy0Var.zzb();
            return num;
        } catch (Throwable th3) {
            a10.c();
            dy0Var.zzb();
            throw th3;
        }
    }

    public void L(MotionEvent motionEvent) {
        zy0 zy0Var = ((px0) this.f7466v).f9648b;
        wy0 wy0Var = (wy0) zy0Var.f13335f.get();
        if (wy0Var == null) {
            zy0Var.e.b(54);
        } else {
            wy0Var.b(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.xg0
    public ac.b a(dv dvVar) {
        rg0 rg0Var = (rg0) this.f7466v;
        synchronized (rg0Var.f9515v) {
            try {
                int i = rg0Var.B;
                if (i != 1 && i != 2) {
                    return ed1.A(new cg0(2));
                }
                if (rg0Var.f9516w) {
                    return rg0Var.f9514u;
                }
                rg0Var.B = 2;
                rg0Var.f9516w = true;
                rg0Var.f9518y = dvVar;
                rg0Var.f9519z.m();
                yx yxVar = rg0Var.f9514u;
                yxVar.f12998u.a(new qg0(rg0Var, 1), xx.f12657h);
                return yxVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e9.b
    public Map b() {
        return (HashMap) this.f7466v;
    }

    @Override // f9.d
    public void c() {
        g20 g20Var = (g20) this.f7466v;
        ((a70) g20Var.X.zzb()).l();
        g90 g90Var = (g90) g20Var.f6264d0.zzb();
        synchronized (g90Var) {
            g90Var.P1(v80.B);
        }
    }

    @Override // com.google.android.gms.internal.ads.el0
    public void e(z40 z40Var) {
        switch (this.f7465u) {
            case 25:
                hq0 hq0Var = (hq0) this.f7466v;
                synchronized (hq0Var) {
                    hq0Var.f6874x = z40Var.f13071f;
                    z40Var.a();
                }
                return;
            default:
                mp0 mp0Var = (mp0) this.f7466v;
                yc0 yc0Var = (yc0) z40Var;
                synchronized (mp0Var) {
                    try {
                        mp0Var.D = yc0Var;
                        if (((Boolean) g9.r.e.f17698c.a(sl.f10949t4)).booleanValue()) {
                            yc0Var.f12850u.f12926a = mp0Var.f8395y;
                        }
                        mp0Var.D.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public /* synthetic */ Object k() {
        return (j60) this.f7466v;
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f7465u) {
            case 11:
                k9.a0.k("Releasing engine reference.");
                ((br) this.f7466v).e.m();
                return;
            case 15:
                z60 z60Var = (z60) obj;
                String message = ((r90) this.f7466v).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                z60Var.o(x21.J(12, message, null));
                return;
            case 16:
                ((t70) obj).c((g9.d3) this.f7466v);
                return;
            default:
                hr0 hr0Var = (hr0) this.f7466v;
                ((lr0) obj).k(hr0Var.f6876v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zo0
    public /* bridge */ /* synthetic */ ac.b o(x90 x90Var, yo0 yo0Var) {
        return C(x90Var, yo0Var, null);
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
            g gVar = new g(i12, hiVar2, i10, (j) this.f7466v, iArr[i10]);
            int length = objArr.length;
            int i13 = i11 + 1;
            int d2 = y41.d(length, i13);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i11] = gVar;
            i10++;
            i11 = i13;
            i = i12;
            hiVar = hiVar2;
        }
        return d51.w(objArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
        switch (this.f7465u) {
            case 14:
                ((i50) this.f7466v).f6992f.z(true);
                return;
            case 18:
                try {
                    h00 h00Var = (h00) ((List) obj).get(0);
                    if (h00Var != null) {
                        nb0 nb0Var = (nb0) this.f7466v;
                        nb0Var.getClass();
                        nb0Var.f8639w.execute(new p00(h00Var, 5));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10888p6)).booleanValue()) {
                        f9.k.C.f16817h.d("omid native display exp", e);
                        return;
                    }
                    return;
                }
            case 20:
                String str = (String) obj;
                synchronized (this) {
                    af0 af0Var = (af0) this.f7466v;
                    af0Var.f4472c = true;
                    f9.k.C.f16819k.getClass();
                    af0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - af0Var.f4473d), "", true);
                    af0Var.i.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 18, str));
                }
                return;
            default:
                wp0 wp0Var = (wp0) obj;
                if (((Boolean) g9.r.e.f17698c.a(sl.f10713e7)).booleanValue()) {
                    jg0 jg0Var = (jg0) this.f7466v;
                    sp0 sp0Var = (sp0) wp0Var.f12313b.f11471w;
                    lh0 lh0Var = jg0Var.e;
                    int i = sp0Var.f11094f;
                    synchronized (lh0Var.f8031g) {
                        lh0Var.f8027b = i;
                    }
                    lh0 lh0Var2 = jg0Var.e;
                    long j10 = sp0Var.f11095g;
                    synchronized (lh0Var2.f8032h) {
                        lh0Var2.f8028c = j10;
                    }
                    return;
                }
                return;
        }
    }

    @Override // fa.c
    public void r0(ca.b bVar) {
        k60 k60Var = (k60) this.f7466v;
        synchronized (k60Var.f7669d) {
            try {
                k60Var.f7670f = null;
                if (((cj) k60Var.e) != null) {
                    k60Var.e = null;
                }
                k60Var.f7669d.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        switch (this.f7465u) {
            case 14:
                ((i50) this.f7466v).f6992f.z(false);
                return;
            case 18:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10888p6)).booleanValue()) {
                    f9.k.C.f16817h.d("omid native display exp", th);
                    return;
                }
                return;
            case 20:
                synchronized (this) {
                    af0 af0Var = (af0) this.f7466v;
                    af0Var.f4472c = true;
                    f9.k.C.f16819k.getClass();
                    af0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - af0Var.f4473d), "Internal Error.", false);
                    af0Var.e.c(new Exception());
                }
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10713e7)).booleanValue()) {
                    Matcher matcher = jg0.f7439h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        jg0 jg0Var = (jg0) this.f7466v;
                        int parseInt = Integer.parseInt(group);
                        lh0 lh0Var = jg0Var.e;
                        synchronized (lh0Var.f8031g) {
                            lh0Var.f8027b = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // f9.g
    public void v() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        x70 x70Var = ((gd0) this.f7466v).f6374g;
        synchronized (x70Var) {
            try {
                if (x70Var.D) {
                    if (x70Var.B > 0 && (scheduledFuture2 = x70Var.E) != null && scheduledFuture2.isCancelled()) {
                        x70Var.W1(x70Var.B);
                    }
                    if (x70Var.C > 0 && (scheduledFuture = x70Var.F) != null && scheduledFuture.isCancelled()) {
                        x70Var.X1(x70Var.C);
                    }
                    x70Var.D = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p7
    public void w(int i, int i10, r7 r7Var, byte[] bArr) {
        boolean z3;
        s40 a10;
        boolean z9;
        xk0 xk0Var = (xk0) this.f7466v;
        xk0Var.z(bArr, i + i10);
        xk0Var.E(i);
        ArrayList arrayList = new ArrayList();
        while (xk0Var.B() > 0) {
            if (xk0Var.B() >= 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.w("Incomplete Mp4Webvtt Top Level box header found.", z3);
            int b10 = xk0Var.b() - 8;
            if (xk0Var.b() == 1987343459) {
                CharSequence charSequence = null;
                m40 m40Var = null;
                while (b10 > 0) {
                    if (b10 >= 8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    b80.w("Incomplete vtt cue box header found.", z9);
                    int b11 = xk0Var.b();
                    int b12 = xk0Var.b();
                    int i11 = b10 - 8;
                    int i12 = b11 - 8;
                    byte[] bArr2 = xk0Var.f12580a;
                    int i13 = xk0Var.f12581b;
                    String str = bq0.f4860a;
                    String str2 = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    xk0Var.G(i12);
                    if (b12 == 1937011815) {
                        z8 z8Var = new z8();
                        a9.c(str2, z8Var);
                        m40Var = z8Var.a();
                    } else if (b12 == 1885436268) {
                        charSequence = a9.a(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                    b10 = i11 - i12;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (m40Var != null) {
                    m40Var.f8234a = charSequence;
                    m40Var.f8235b = null;
                    a10 = m40Var.a();
                } else {
                    Pattern pattern = a9.f4412a;
                    z8 z8Var2 = new z8();
                    z8Var2.f13110c = charSequence;
                    a10 = z8Var2.a().a();
                }
                arrayList.add(a10);
            } else {
                xk0Var.G(b10);
            }
        }
        r7Var.mo213l(new l7(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // f9.g
    public void y() {
        x70 x70Var = ((gd0) this.f7466v).f6374g;
        synchronized (x70Var) {
            try {
                if (!x70Var.D) {
                    ScheduledFuture scheduledFuture = x70Var.E;
                    if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                        x70Var.E.cancel(false);
                        long j10 = x70Var.f12485z;
                        x70Var.f12483x.getClass();
                        x70Var.B = j10 - SystemClock.elapsedRealtime();
                    } else {
                        x70Var.B = -1L;
                    }
                    ScheduledFuture scheduledFuture2 = x70Var.F;
                    if (scheduledFuture2 != null && !scheduledFuture2.isCancelled()) {
                        x70Var.F.cancel(false);
                        long j11 = x70Var.A;
                        x70Var.f12483x.getClass();
                        x70Var.C = j11 - SystemClock.elapsedRealtime();
                    } else {
                        x70Var.C = -1L;
                    }
                    x70Var.D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(long j10, long j11, long j12) {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        vc vcVar = new vc(j10, j11, j12);
        ArrayDeque arrayDeque = (ArrayDeque) this.f7466v;
        if (arrayDeque.size() < (a5.a.w((i10 & (~i)) | i11, (i & i12) | i13, i14, i15) ^ (i16 % 452867621))) {
            arrayDeque.push(vcVar);
            return;
        }
        throw new Exception();
    }

    @Override // com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public void mo212zza() {
        switch (this.f7465u) {
            case 12:
                ((yx) this.f7466v).c(new ba.p("Cannot get Javascript Engine", 1));
                return;
            case 23:
                if (((Boolean) g9.r.e.f17698c.a(sl.If)).booleanValue()) {
                    j6.s a10 = ((be0) ((zd1) this.f7466v).f13144x).a();
                    a10.k("action", "ptard");
                    a10.k("ptard", "r");
                    a10.l();
                    return;
                }
                return;
            case 25:
                synchronized (((hq0) this.f7466v)) {
                }
                return;
            default:
                mp0 mp0Var = (mp0) this.f7466v;
                synchronized (mp0Var) {
                    mp0Var.D = null;
                }
                return;
        }
    }

    @Override // f9.d
    public void zzb() {
        ((q60) ((g20) this.f7466v).f6262b0.zzb()).L();
    }

    @Override // f9.d
    public void x(View view) {
    }

    public jk0(y10 y10Var) {
        this.f7465u = 13;
        this.f7466v = new h30(y10Var.f12718g, y10Var.Y, new s20(y10Var.Z, 22), y10Var.f12708a0, y10Var.f12749x, y10Var.f12747w);
    }

    public jk0(int i) {
        this.f7465u = i;
        switch (i) {
            case 5:
                this.f7466v = new xk0();
                return;
            case 7:
                this.f7466v = new ArrayDeque();
                return;
            case 26:
                return;
            default:
                this.f7466v = new LinkedHashMap();
                return;
        }
    }

    public jk0(Context context, Executor executor) {
        this.f7465u = 8;
        this.f7466v = ed1.E(new qf(0, context), executor);
    }

    public jk0(br brVar) {
        this.f7465u = 11;
        Objects.requireNonNull(brVar);
        this.f7466v = brVar;
    }

    public jk0(af0 af0Var) {
        this.f7465u = 20;
        Objects.requireNonNull(af0Var);
        this.f7466v = af0Var;
    }

    public jk0(hq0 hq0Var) {
        this.f7465u = 25;
        Objects.requireNonNull(hq0Var);
        this.f7466v = hq0Var;
    }

    public jk0(hx0 hx0Var, g20 g20Var) {
        this.f7465u = 24;
        this.f7466v = g20Var;
    }

    public /* synthetic */ jk0(int i, Object obj) {
        this.f7465u = i;
        this.f7466v = obj;
    }
}
