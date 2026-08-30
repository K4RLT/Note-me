package com.google.android.gms.internal.ads;
import ac.a;
import b.a;
import c3.b;
import f9.k;
import fa.y;
import g9.a0;
import g9.c3;
import g9.k0;
import g9.n0;
import g9.p0;
import g9.r;
import g9.t2;
import g9.v1;
import g9.y1;
import g9.z;
import g9.z2;
import i0.m;
import j6.s;
import k9.a0;
import k9.f0;
import l9.i;
import la.a;
import oa.b;
import r.e;
import z8.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class dt0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f5494a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5495b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5496c;

    /* renamed from: d, reason: collision with root package name */
    public final hq0 f5497d;
    public final AtomicReference e;

    /* renamed from: f, reason: collision with root package name */
    public final at0 f5498f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f5499g;

    /* renamed from: h, reason: collision with root package name */
    public final g9.n0 f5500h;
    public final g9.p0 i;

    /* renamed from: j, reason: collision with root package name */
    public final Queue f5501j;

    /* renamed from: k, reason: collision with root package name */
    public final et0 f5502k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5503l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f5504m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f5505n;

    /* renamed from: o, reason: collision with root package name */
    public final fr0 f5506o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f5507p;

    /* renamed from: q, reason: collision with root package name */
    public bl0 f5508q;

    /* renamed from: r, reason: collision with root package name */
    public final la.a f5509r;

    /* renamed from: s, reason: collision with root package name */
    public final jt0 f5510s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5511t;

    public dt0(String str, ClientApi clientApi, Context context, int i, hq0 hq0Var, g9.t2 t2Var, ScheduledExecutorService scheduledExecutorService, fr0 fr0Var, et0 et0Var, la.a aVar, at0 at0Var) {
        Queue priorityQueue;
        this.f5503l = str;
        this.f5494a = clientApi;
        this.f5495b = context;
        this.f5496c = i;
        this.f5497d = hq0Var;
        AtomicReference atomicReference = new AtomicReference(t2Var);
        this.e = atomicReference;
        int max = Math.max(1, t2Var.f17705x);
        if (((Boolean) g9.r.e.f17698c.a(sl.f10739g0)).booleanValue()) {
            priorityQueue = new qt0();
        } else {
            priorityQueue = new PriorityQueue(max, c.J);
        }
        this.f5501j = priorityQueue;
        this.f5499g = new AtomicBoolean(true);
        this.f5504m = new AtomicBoolean(false);
        this.f5505n = scheduledExecutorService;
        this.f5506o = fr0Var;
        this.f5502k = et0Var;
        this.f5507p = new AtomicBoolean(true);
        this.f5509r = aVar;
        hq0 hq0Var2 = new hq0(t2Var.f17702u, 19, z8.b.a(((g9.t2) atomicReference.get()).f17703v));
        hq0Var2.f6874x = str;
        this.f5510s = new jt0(hq0Var2);
        this.f5498f = at0Var;
    }

    public final void a(final int i) {
        boolean z3;
        int size;
        at0 at0Var;
        boolean z9 = true;
        int i10 = 0;
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.b(z3);
        g9.t2 t2Var = (g9.t2) this.e.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.ot0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                g9.t2 t2Var2 = (g9.t2) obj;
                int i11 = i;
                if (i11 <= 0) {
                    i11 = t2Var2.f17705x;
                }
                int i12 = i11;
                g9.z2 z2Var = t2Var2.f17704w;
                return new g9.t2(t2Var2.f17702u, t2Var2.f17703v, z2Var, i12, t2Var2.f17706y);
            }
        });
        z8.b a10 = z8.b.a(t2Var.f17703v);
        int i11 = t2Var.f17705x;
        Queue queue = this.f5501j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() > i) {
                    if (((Boolean) g9.r.e.f17698c.a(sl.B)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        while (i10 < i) {
                            kt0 kt0Var = (kt0) queue.poll();
                            if (kt0Var != null) {
                                arrayList.add(kt0Var);
                            }
                            i10++;
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        i10 = arrayList.size();
                    }
                }
                z9 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9 && size > i10 && (at0Var = this.f5498f) != null) {
            int i12 = size - i10;
            if (i10 == 0) {
                i12--;
            }
            at0Var.c(this, i12);
        }
        bl0 bl0Var = this.f5508q;
        if (bl0Var != null && a10 != null) {
            this.f5509r.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String str = ((g9.t2) this.e.get()).f17702u;
            j6.s a11 = ((be0) bl0Var.f4819v).a();
            a11.k("action", "cache_resize");
            a11.k("cs_ts", Long.toString(currentTimeMillis));
            a11.k("orig_ma", Integer.toString(i11));
            a11.k("max_ads", Integer.toString(i));
            a11.k("ad_format", a10.name().toLowerCase(Locale.ENGLISH));
            a11.k("ad_unit_id", str);
            a11.k("pid", null);
            a11.k("pv", "1");
            a11.l();
        }
    }

    public final void b(g9.z2 z2Var) {
        if (((Boolean) g9.r.e.f17698c.a(sl.G)).booleanValue()) {
            Bundle bundle = z2Var.W;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.f5503l);
        }
    }

    public final void c(g9.y1 y1Var) {
        String lowerCase;
        if (this.f5507p.get()) {
            k9.f0.f19676l.post(new ac.a(this, y1Var));
        }
        this.f5504m.set(false);
        int i = y1Var.f17714u;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.e;
        int i10 = ((g9.t2) atomicReference.get()).f17703v;
        String str = ((g9.t2) atomicReference.get()).f17702u;
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 26 + 61);
        sb2.append("Preloading ");
        sb2.append(i10);
        sb2.append(", for adUnitId:");
        sb2.append(str);
        sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb3 = sb2.toString();
        int i11 = k9.a0.f19634b;
        l9.i.e(sb3);
        this.f5499g.set(false);
        at0 at0Var = this.f5498f;
        if (at0Var != null) {
            at0Var.a(this);
        }
        String str2 = ((g9.t2) atomicReference.get()).f17702u;
        z8.b q10 = q();
        bl0 bl0Var = this.f5508q;
        this.f5509r.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int s10 = s();
        int t3 = t();
        String g8 = g();
        j6.s a10 = ((be0) bl0Var.f4819v).a();
        a10.k("action", "pftla");
        a10.k("pftlat_ts", Long.toString(currentTimeMillis));
        a10.k("pftlaec", Integer.toString(y1Var.f17714u));
        if (q10 == null) {
            lowerCase = "unknown";
        } else {
            lowerCase = q10.name().toLowerCase(Locale.ENGLISH);
        }
        a10.k("ad_format", lowerCase);
        a10.k("max_ads", Integer.toString(s10));
        a10.k("cache_size", Integer.toString(t3));
        a10.k("ad_unit_id", str2);
        a10.k("pid", this.f5503l);
        a10.k("pv", g8);
        a10.l();
    }

    public final void d(boolean z3) {
        et0 et0Var = this.f5502k;
        at0 at0Var = this.f5498f;
        if (at0Var != null) {
            if (z3) {
                et0Var.c();
            }
            at0Var.a(this);
        } else if (!et0Var.d()) {
            if (z3) {
                et0Var.c();
            }
            this.f5505n.schedule(new mt0(this), et0Var.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z3;
        int i;
        int i10;
        Queue queue = this.f5501j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z3 = false;
                i = 0;
                while (true) {
                    boolean z9 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    kt0 kt0Var = (kt0) it.next();
                    long j10 = kt0Var.f7873b;
                    long j11 = kt0Var.f7875d;
                    kt0Var.f7874c.getClass();
                    if (System.currentTimeMillis() < j10 + j11) {
                        z9 = false;
                    }
                    if (z9) {
                        it.remove();
                        i++;
                    }
                }
                if (i > 0 && queue.isEmpty()) {
                    z3 = true;
                }
                if (i > 0 && queue.isEmpty()) {
                    i10 = i - 1;
                } else {
                    i10 = i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        at0 at0Var = this.f5498f;
        if (at0Var != null && i > 0) {
            at0Var.c(this, i10);
        }
        if (z3) {
            f();
        }
    }

    public final void f() {
        if (this.f5507p.get()) {
            k9.f0.f19676l.post(new mt0(this, 1));
        }
        this.f5505n.execute(new mt0(this, 2));
    }

    public final String g() {
        if (true != "none".equals(this.f5503l)) {
            return "2";
        }
        return "1";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.ads.q71] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.internal.ads.q71] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, com.google.android.gms.internal.ads.q71] */
    /* JADX WARN: Type inference failed for: r3v5, types: [g9.z, com.google.android.gms.internal.ads.gt0, g9.a0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.gms.internal.ads.dw, com.google.android.gms.internal.ads.cw, com.google.android.gms.internal.ads.rt0] */
    public final q71 h(Context context) {
        u81 A;
        switch (this.f5511t) {
            case 0:
                vr vrVar = (vr) ((AtomicReference) this.f5497d.f6874x).get();
                if (vrVar == null) {
                    return ed1.A(new bt0());
                }
                oa.b bVar = new oa.b(context);
                g9.c3 b10 = g9.c3.b();
                AtomicReference atomicReference = this.e;
                no0 no0Var = (no0) this.f5494a.s4(bVar, b10, ((g9.t2) atomicReference.get()).f17702u, vrVar, this.f5496c);
                if (no0Var == null) {
                    return ed1.A(new bt0());
                }
                Object obj = new Object();
                try {
                    b(((g9.t2) atomicReference.get()).f17704w);
                    at0 at0Var = this.f5498f;
                    if (at0Var != null) {
                        nl nlVar = sl.Y;
                        g9.r rVar = g9.r.e;
                        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                            no0Var.f8790z.B.set(new ft0(at0Var, this.f5505n, ((Long) rVar.f17698c.a(sl.f10659b0)).longValue(), this));
                        }
                    }
                    g9.t2 t2Var = (g9.t2) atomicReference.get();
                    i0.m mVar = new i0.m(this, 8, (Object) obj);
                    String str = t2Var.f17702u;
                    pi piVar = new pi();
                    piVar.f9527w = mVar;
                    piVar.f9526v = str;
                    no0Var.q4(piVar);
                    no0Var.n1(((g9.t2) atomicReference.get()).f17704w);
                    return obj;
                } catch (RemoteException e) {
                    l9.i.g("Failed to load app open ad.", e);
                    return ed1.A(new bt0());
                }
            case 1:
                vr vrVar2 = (vr) ((AtomicReference) this.f5497d.f6874x).get();
                if (vrVar2 == null) {
                    return ed1.A(new bt0());
                }
                oa.b bVar2 = new oa.b(context);
                g9.c3 c3Var = new g9.c3();
                AtomicReference atomicReference2 = this.e;
                cl0 cl0Var = (cl0) this.f5494a.F3(bVar2, c3Var, ((g9.t2) atomicReference2.get()).f17702u, vrVar2, this.f5496c);
                if (cl0Var == 0) {
                    return ed1.A(new bt0());
                }
                Object obj2 = new Object();
                try {
                    b(((g9.t2) atomicReference2.get()).f17704w);
                    at0 at0Var2 = this.f5498f;
                    if (at0Var2 != null) {
                        nl nlVar2 = sl.Y;
                        g9.r rVar2 = g9.r.e;
                        if (((Boolean) rVar2.f17698c.a(nlVar2)).booleanValue()) {
                            cl0Var.f5114z.C.set(new ft0(at0Var2, this.f5505n, ((Long) rVar2.f17698c.a(sl.Z)).longValue(), this));
                        }
                    }
                    g9.z2 z2Var = ((g9.t2) atomicReference2.get()).f17704w;
                    i0.m mVar2 = new i0.m(this, 8, (Object) obj2);
                    String str2 = ((g9.t2) atomicReference2.get()).f17702u;
                    g9.z zVar = new g9.z();
                    zVar.f6447u = cl0Var;
                    zVar.f6448v = mVar2;
                    zVar.f6449w = str2;
                    cl0Var.P0(z2Var, zVar);
                    return obj2;
                } catch (RemoteException e8) {
                    l9.i.g("Failed to load interstitial ad.", e8);
                    return ed1.A(new bt0());
                }
            default:
                vr vrVar3 = (vr) ((AtomicReference) this.f5497d.f6874x).get();
                if (vrVar3 == null) {
                    A = ed1.A(new bt0());
                } else {
                    oa.b bVar3 = new oa.b(context);
                    AtomicReference atomicReference3 = this.e;
                    mp0 mp0Var = (mp0) this.f5494a.O2(bVar3, ((g9.t2) atomicReference3.get()).f17702u, vrVar3, this.f5496c);
                    if (mp0Var == 0) {
                        A = ed1.A(new bt0());
                    } else {
                        Object obj3 = new Object();
                        try {
                            b(((g9.t2) atomicReference3.get()).f17704w);
                            at0 at0Var3 = this.f5498f;
                            if (at0Var3 != null) {
                                nl nlVar3 = sl.Y;
                                g9.r rVar3 = g9.r.e;
                                if (((Boolean) rVar3.f17698c.a(nlVar3)).booleanValue()) {
                                    try {
                                    } catch (RemoteException unused) {
                                        l9.i.f("Failed to load rewarded ad.");
                                        return ed1.A(new bt0());
                                    }
                                    try {
                                        mp0Var.f8393w.C.set(new ft0(at0Var3, this.f5505n, ((Long) rVar3.f17698c.a(sl.f10643a0)).longValue(), this));
                                        g9.z2 z2Var2 = ((g9.t2) atomicReference3.get()).f17704w;
                                        i0.m mVar3 = new i0.m(this, 8, (Object) obj3);
                                        String str3 = ((g9.t2) atomicReference3.get()).f17702u;
                                        cw cwVar = new cw();
                                        cwVar.f10286u = mp0Var;
                                        cwVar.f10287v = mVar3;
                                        cwVar.f10288w = str3;
                                        mp0Var.w0(z2Var2, cwVar);
                                        return obj3;
                                    } catch (RemoteException unused2) {
                                        l9.i.f("Failed to load rewarded ad.");
                                        return ed1.A(new bt0());
                                    }
                                }
                            }
                            g9.z2 z2Var22 = ((g9.t2) atomicReference3.get()).f17704w;
                            i0.m mVar32 = new i0.m(this, 8, (Object) obj3);
                            String str32 = ((g9.t2) atomicReference3.get()).f17702u;
                            cw cwVar2 = new cw();
                            cwVar2.f10286u = mp0Var;
                            cwVar2.f10287v = mVar32;
                            cwVar2.f10288w = str32;
                            mp0Var.w0(z2Var22, cwVar2);
                            return obj3;
                        } catch (RemoteException unused3) {
                        }
                    }
                }
                return A;
        }
    }

    public final long i() {
        switch (this.f5511t) {
            case 0:
                return ((Long) g9.r.e.f17698c.a(sl.X)).longValue();
            case 1:
                return ((Long) g9.r.e.f17698c.a(sl.V)).longValue();
            default:
                return ((Long) g9.r.e.f17698c.a(sl.W)).longValue();
        }
    }

    public final /* bridge */ g9.v1 j(Object obj) {
        switch (this.f5511t) {
            case 0:
                try {
                    return ((ti) obj).e();
                } catch (RemoteException e) {
                    int i = k9.a0.f19634b;
                    l9.i.b("Failed to get response info for the app open ad.", e);
                    return null;
                }
            case 1:
                try {
                    return ((g9.k0) obj).A();
                } catch (RemoteException e8) {
                    int i10 = k9.a0.f19634b;
                    l9.i.b("Failed to get response info for  the interstitial ad.", e8);
                    return null;
                }
            default:
                try {
                    return ((wv) obj).h();
                } catch (RemoteException e10) {
                    int i11 = k9.a0.f19634b;
                    l9.i.b("Failed to get response info for the rewarded ad.", e10);
                    return null;
                }
        }
    }

    public final void k() {
        AtomicBoolean atomicBoolean = this.f5504m;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        if (this.f5499g.get() && t() < ((g9.t2) this.e.get()).f17705x) {
            this.f5505n.submit(new mt0(this, 5));
        } else {
            atomicBoolean.set(false);
        }
    }

    public final boolean l() {
        boolean isEmpty;
        nl nlVar = sl.O;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            this.f5502k.a();
        }
        if (((Boolean) rVar.f17698c.a(sl.H)).booleanValue() && this.f5498f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.f5501j;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        if (!isEmpty) {
            return true;
        }
        return false;
    }

    public final Object m() {
        final kt0 kt0Var;
        final boolean z3;
        final kt0 kt0Var2;
        Queue queue = this.f5501j;
        final int t3 = t();
        synchronized (queue) {
            try {
                kt0Var = (kt0) queue.poll();
                boolean z9 = false;
                if (kt0Var != null && queue.isEmpty()) {
                    z9 = true;
                }
                z3 = z9;
                if (kt0Var != null && !queue.isEmpty()) {
                    kt0Var2 = (kt0) queue.peek();
                } else {
                    kt0Var2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5509r.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        final int s10 = s();
        final int t10 = t();
        this.f5505n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.nt0
            /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
            /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 269
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nt0.run():void");
            }
        });
        if (kt0Var == null) {
            return null;
        }
        return kt0Var.f7872a;
    }

    public final void n() {
        this.f5499g.set(true);
        this.f5507p.set(true);
        at0 at0Var = this.f5498f;
        if (at0Var == null) {
            this.f5505n.submit(new mt0(this));
        } else {
            at0Var.c(this, 0);
        }
    }

    public final String o() {
        kt0 kt0Var;
        Object obj;
        g9.v1 j10;
        Queue queue = this.f5501j;
        synchronized (queue) {
            kt0Var = (kt0) queue.peek();
        }
        if (kt0Var == null) {
            obj = null;
        } else {
            obj = kt0Var.f7872a;
        }
        if (obj == null) {
            j10 = null;
        } else {
            j10 = j(obj);
        }
        if (!(j10 instanceof p60)) {
            return null;
        }
        return ((p60) j10).f9415x;
    }

    public final void p(int i) {
        boolean z3;
        boolean z9 = false;
        if (i >= 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.b(z3);
        et0 et0Var = this.f5502k;
        synchronized (et0Var) {
            if (i > 0) {
                z9 = true;
            }
            fa.y.b(z9);
            et0Var.f5774d = i;
        }
    }

    public final z8.b q() {
        return z8.b.a(((g9.t2) this.e.get()).f17703v);
    }

    public final String r() {
        return ((g9.t2) this.e.get()).f17702u;
    }

    public final int s() {
        return ((g9.t2) this.e.get()).f17705x;
    }

    public final int t() {
        int size;
        Queue queue = this.f5501j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long currentTimeMillis;
        long j10;
        if (this.f5499g.get() && !this.f5504m.get() && t() < s()) {
            et0 et0Var = this.f5502k;
            synchronized (et0Var) {
                et0Var.f5775f.getClass();
                currentTimeMillis = System.currentTimeMillis();
                j10 = et0Var.e;
            }
            if (currentTimeMillis >= j10 && !et0Var.d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.f5504m;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        if (this.f5499g.get() && t() < ((g9.t2) this.e.get()).f17705x) {
            w();
        } else {
            atomicBoolean.set(false);
        }
    }

    public final void w() {
        q71 h3;
        Activity j10 = f9.k.C.f16816g.j();
        if (j10 == null) {
            String valueOf = String.valueOf(((g9.t2) this.e.get()).f17702u);
            int i = k9.a0.f19634b;
            l9.i.f("Empty activity context at preloading: ".concat(valueOf));
            h3 = h(this.f5495b);
        } else {
            h3 = h(j10);
        }
        h3.a(new t81(h3, 0, new lt0(0, this)), this.f5505n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dt0(String str, ClientApi clientApi, Context context, int i, hq0 hq0Var, g9.t2 t2Var, g9.p0 p0Var, ScheduledExecutorService scheduledExecutorService, fr0 fr0Var, et0 et0Var, la.a aVar, at0 at0Var, int i10) {
        this(str, clientApi, context, i, hq0Var, t2Var, scheduledExecutorService, fr0Var, et0Var, aVar, at0Var);
        this.f5511t = i10;
        this.i = p0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dt0(ClientApi clientApi, Context context, int i, hq0 hq0Var, g9.t2 t2Var, g9.n0 n0Var, ScheduledExecutorService scheduledExecutorService, fr0 fr0Var, et0 et0Var, la.a aVar, int i10) {
        this("none", clientApi, context, i, hq0Var, t2Var, scheduledExecutorService, fr0Var, et0Var, aVar, (at0) null);
        this.f5511t = i10;
        this.f5500h = n0Var;
    }
}
