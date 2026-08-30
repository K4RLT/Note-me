package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p20 extends g9.e1 {
    public final ww A;
    public final qd0 B;
    public final nf0 C;
    public final ju0 D;
    public final vr0 E;
    public final hq0 F;
    public final r50 G;
    public final be0 H;
    public final zf0 I;
    public boolean J = false;
    public final Long K;

    /* renamed from: u, reason: collision with root package name */
    public final Context f9326u;

    /* renamed from: v, reason: collision with root package name */
    public final l9.a f9327v;

    /* renamed from: w, reason: collision with root package name */
    public final od0 f9328w;

    /* renamed from: x, reason: collision with root package name */
    public final fi0 f9329x;

    /* renamed from: y, reason: collision with root package name */
    public final ok0 f9330y;

    /* renamed from: z, reason: collision with root package name */
    public final af0 f9331z;

    public p20(Context context, l9.a aVar, od0 od0Var, fi0 fi0Var, ok0 ok0Var, af0 af0Var, ww wwVar, qd0 qd0Var, nf0 nf0Var, ju0 ju0Var, vr0 vr0Var, hq0 hq0Var, r50 r50Var, be0 be0Var, zf0 zf0Var) {
        this.f9326u = context;
        this.f9327v = aVar;
        this.f9328w = od0Var;
        this.f9329x = fi0Var;
        this.f9330y = ok0Var;
        this.f9331z = af0Var;
        this.A = wwVar;
        this.B = qd0Var;
        this.C = nf0Var;
        this.D = ju0Var;
        this.E = vr0Var;
        this.F = hq0Var;
        this.G = r50Var;
        this.H = be0Var;
        this.I = zf0Var;
        f9.k.C.f16819k.getClass();
        this.K = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // g9.f1
    public final void A() {
        this.f9331z.f4484q = false;
    }

    @Override // g9.f1
    public final void D0(boolean z3) {
        try {
            hx0.d(this.f9326u).k(z3);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // g9.f1
    public final void D2(vr vrVar) {
        this.F.y(vrVar);
    }

    @Override // g9.f1
    public final void E3(g9.u2 u2Var) {
        ww wwVar = this.A;
        Context context = this.f9326u;
        wwVar.getClass();
        tw j10 = tw.j(context);
        qw qwVar = (qw) ((rr1) j10.f11472x).zzb();
        ((la.a) j10.f11470v).getClass();
        qwVar.a(-1, System.currentTimeMillis());
        if (((Boolean) g9.r.e.f17698c.a(sl.Y0)).booleanValue() && wwVar.a(context) && ww.g(context)) {
            synchronized (wwVar.f12348j) {
            }
        }
    }

    @Override // g9.f1
    public final void M1(oa.a aVar, String str) {
        if (aVar == null) {
            int i = k9.a0.f19634b;
            l9.i.c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) oa.b.z1(aVar);
        if (context == null) {
            int i10 = k9.a0.f19634b;
            l9.i.c("Context is null. Failed to open debug menu.");
        } else {
            k9.g gVar = new k9.g(context);
            gVar.f19689d = str;
            gVar.e = this.f9327v.f20029u;
            gVar.b();
        }
    }

    @Override // g9.f1
    public final synchronized void R1() {
        nl nlVar = sl.f10694d3;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            tw twVar = f9.k.C.f16826r;
            synchronized (twVar.f11470v) {
                try {
                    jr jrVar = (jr) twVar.f11472x;
                    if (jrVar != null) {
                        dr drVar = jrVar.f7513a;
                        cr crVar = (cr) drVar.f5487g;
                        if (crVar != null) {
                            crVar.n();
                            drVar.f5487g = null;
                        }
                        twVar.f11472x = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (((Boolean) rVar.f17698c.a(sl.f10709e3)).booleanValue()) {
                g9.p.f17688g.f17691c = true;
            }
        }
    }

    @Override // g9.f1
    public final void T(String str) {
        if (((Boolean) g9.r.e.f17698c.a(sl.La)).booleanValue()) {
            f9.k.C.f16817h.f9637g = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    @Override // g9.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W1(oa.a r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            android.content.Context r0 = r1.f9326u
            com.google.android.gms.internal.ads.sl.a(r0)
            com.google.android.gms.internal.ads.nl r2 = com.google.android.gms.internal.ads.sl.Z4
            g9.r r3 = g9.r.e
            com.google.android.gms.internal.ads.ql r3 = r3.f17698c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2e
            f9.k r2 = f9.k.C     // Catch: android.os.RemoteException -> L22 java.lang.RuntimeException -> L24
            k9.f0 r2 = r2.f16813c     // Catch: android.os.RemoteException -> L22 java.lang.RuntimeException -> L24
            java.lang.String r0 = k9.f0.M(r0)     // Catch: android.os.RemoteException -> L22 java.lang.RuntimeException -> L24
            goto L30
        L22:
            r0 = move-exception
            goto L25
        L24:
            r0 = move-exception
        L25:
            f9.k r2 = f9.k.C
            com.google.android.gms.internal.ads.px r2 = r2.f16817h
            java.lang.String r3 = "NonagonMobileAdsSettingManager_AppId"
            r2.d(r3, r0)
        L2e:
            java.lang.String r0 = ""
        L30:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 1
            if (r3 != r2) goto L3a
            r9 = r18
            goto L3b
        L3a:
            r9 = r0
        L3b:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L42
            goto L9b
        L42:
            com.google.android.gms.internal.ads.nl r0 = com.google.android.gms.internal.ads.sl.S4
            g9.r r2 = g9.r.e
            com.google.android.gms.internal.ads.ql r4 = r2.f17698c
            com.google.android.gms.internal.ads.ql r2 = r2.f17698c
            java.lang.Object r0 = r4.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            com.google.android.gms.internal.ads.nl r4 = com.google.android.gms.internal.ads.sl.f11041z1
            java.lang.Object r5 = r2.a(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = r0 | r5
            java.lang.Object r2 = r2.a(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L7c
            java.lang.Object r0 = oa.b.z1(r17)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            ac.a r2 = new ac.a
            r4 = 11
            r2.<init>(r1, r4, r0)
        L7a:
            r11 = r2
            goto L7f
        L7c:
            r2 = 0
            r3 = r0
            goto L7a
        L7f:
            if (r3 == 0) goto L9b
            f9.k r0 = f9.k.C
            com.google.android.gms.internal.ads.f3 r4 = r0.f16820l
            com.google.android.gms.internal.ads.nf0 r0 = r1.C
            boolean r15 = r0.f()
            r8 = 0
            r10 = 0
            android.content.Context r5 = r1.f9326u
            l9.a r6 = r1.f9327v
            r7 = 1
            com.google.android.gms.internal.ads.vr0 r12 = r1.E
            com.google.android.gms.internal.ads.be0 r13 = r1.H
            java.lang.Long r14 = r1.K
            r4.i(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p20.W1(oa.a, java.lang.String):void");
    }

    @Override // g9.f1
    public final synchronized void Z(boolean z3) {
        k9.a aVar = f9.k.C.i;
        synchronized (aVar) {
            aVar.f19632a = z3;
        }
    }

    @Override // g9.f1
    public final synchronized void a() {
        if (this.J) {
            int i = k9.a0.f19634b;
            l9.i.f("Mobile ads is initialized already.");
            return;
        }
        nl nlVar = sl.f10709e3;
        g9.r rVar = g9.r.e;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            g9.p.a();
        }
        Context context = this.f9326u;
        sl.a(context);
        l9.a aVar = this.f9327v;
        be0 be0Var = this.H;
        f9.k kVar = f9.k.C;
        kVar.f16817h.b(context, aVar, be0Var);
        this.G.b();
        kVar.f16818j.c(context);
        final int i10 = 1;
        this.J = true;
        this.f9331z.a();
        ok0 ok0Var = this.f9330y;
        ok0Var.getClass();
        k9.c0 g8 = kVar.f16817h.g();
        final int i11 = 2;
        g8.f19644c.add(new nk0(ok0Var, 2));
        final int i12 = 0;
        ok0Var.f9146f.execute(new nk0(ok0Var, 0));
        if (((Boolean) rVar.f17698c.a(sl.U4)).booleanValue()) {
            qd0 qd0Var = this.B;
            if (!qd0Var.f9824f.getAndSet(true)) {
                k9.c0 g10 = kVar.f16817h.g();
                g10.f19644c.add(new pd0(qd0Var, 0));
            }
            qd0Var.f9822c.execute(new pd0(qd0Var, 2));
        }
        this.C.a();
        if (((Boolean) rVar.f17698c.a(sl.f11048za)).booleanValue()) {
            final int i13 = 3;
            xx.f12651a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.o20

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ p20 f8925v;

                {
                    this.f8925v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String b10;
                    oh ohVar;
                    boolean z3;
                    String str;
                    switch (i13) {
                        case 0:
                            an1.h(this.f8925v.f9326u, true);
                            return;
                        case 1:
                            p20 p20Var = this.f8925v;
                            bm bmVar = f9.k.C.f16822n;
                            Context context2 = p20Var.f9326u;
                            be0 be0Var2 = p20Var.H;
                            if (!bmVar.f4824v.getAndSet(true)) {
                                bmVar.f4825w = context2;
                                bmVar.f4826x = be0Var2;
                                if (bmVar.f4828z == null && context2 != null && (b10 = m.f.b(context2)) != null && !b10.equals(context2.getPackageName())) {
                                    m.f.a(context2, b10, bmVar);
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            p20 p20Var2 = this.f8925v;
                            ph phVar = new ph("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            ju0 ju0Var = p20Var2.D;
                            ju0Var.getClass();
                            try {
                                try {
                                    IBinder b11 = ya.m0.a(ju0Var.f7543u).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b11 == null) {
                                        ohVar = null;
                                    } else {
                                        IInterface queryLocalInterface = b11.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        if (queryLocalInterface instanceof mn) {
                                            ohVar = (mn) queryLocalInterface;
                                        } else {
                                            ohVar = new oh(b11, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                        }
                                    }
                                    Parcel g22 = ohVar.g2();
                                    qh.e(g22, phVar);
                                    ohVar.v2(g22, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new Exception(e);
                                }
                            } catch (RemoteException e8) {
                                l9.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
                                return;
                            } catch (l9.j e10) {
                                l9.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                return;
                            }
                        default:
                            p20 p20Var3 = this.f8925v;
                            f9.k kVar2 = f9.k.C;
                            k9.c0 g11 = kVar2.f16817h.g();
                            g11.i();
                            synchronized (g11.f19642a) {
                                z3 = g11.f19664y;
                            }
                            if (z3) {
                                k9.c0 g12 = kVar2.f16817h.g();
                                g12.i();
                                synchronized (g12.f19642a) {
                                    str = g12.f19665z;
                                }
                                if (!kVar2.f16823o.b(p20Var3.f9326u, str, p20Var3.f9327v.f20029u)) {
                                    kVar2.f16817h.g().e(false);
                                    kVar2.f16817h.g().f("");
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) rVar.f17698c.a(sl.f10911qc)).booleanValue()) {
            xx.f12651a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.o20

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ p20 f8925v;

                {
                    this.f8925v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String b10;
                    oh ohVar;
                    boolean z3;
                    String str;
                    switch (i11) {
                        case 0:
                            an1.h(this.f8925v.f9326u, true);
                            return;
                        case 1:
                            p20 p20Var = this.f8925v;
                            bm bmVar = f9.k.C.f16822n;
                            Context context2 = p20Var.f9326u;
                            be0 be0Var2 = p20Var.H;
                            if (!bmVar.f4824v.getAndSet(true)) {
                                bmVar.f4825w = context2;
                                bmVar.f4826x = be0Var2;
                                if (bmVar.f4828z == null && context2 != null && (b10 = m.f.b(context2)) != null && !b10.equals(context2.getPackageName())) {
                                    m.f.a(context2, b10, bmVar);
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            p20 p20Var2 = this.f8925v;
                            ph phVar = new ph("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            ju0 ju0Var = p20Var2.D;
                            ju0Var.getClass();
                            try {
                                try {
                                    IBinder b11 = ya.m0.a(ju0Var.f7543u).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b11 == null) {
                                        ohVar = null;
                                    } else {
                                        IInterface queryLocalInterface = b11.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        if (queryLocalInterface instanceof mn) {
                                            ohVar = (mn) queryLocalInterface;
                                        } else {
                                            ohVar = new oh(b11, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                        }
                                    }
                                    Parcel g22 = ohVar.g2();
                                    qh.e(g22, phVar);
                                    ohVar.v2(g22, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new Exception(e);
                                }
                            } catch (RemoteException e8) {
                                l9.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
                                return;
                            } catch (l9.j e10) {
                                l9.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                return;
                            }
                        default:
                            p20 p20Var3 = this.f8925v;
                            f9.k kVar2 = f9.k.C;
                            k9.c0 g11 = kVar2.f16817h.g();
                            g11.i();
                            synchronized (g11.f19642a) {
                                z3 = g11.f19664y;
                            }
                            if (z3) {
                                k9.c0 g12 = kVar2.f16817h.g();
                                g12.i();
                                synchronized (g12.f19642a) {
                                    str = g12.f19665z;
                                }
                                if (!kVar2.f16823o.b(p20Var3.f9326u, str, p20Var3.f9327v.f20029u)) {
                                    kVar2.f16817h.g().e(false);
                                    kVar2.f16817h.g().f("");
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) rVar.f17698c.a(sl.R3)).booleanValue()) {
            xx.f12651a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.o20

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ p20 f8925v;

                {
                    this.f8925v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String b10;
                    oh ohVar;
                    boolean z3;
                    String str;
                    switch (i12) {
                        case 0:
                            an1.h(this.f8925v.f9326u, true);
                            return;
                        case 1:
                            p20 p20Var = this.f8925v;
                            bm bmVar = f9.k.C.f16822n;
                            Context context2 = p20Var.f9326u;
                            be0 be0Var2 = p20Var.H;
                            if (!bmVar.f4824v.getAndSet(true)) {
                                bmVar.f4825w = context2;
                                bmVar.f4826x = be0Var2;
                                if (bmVar.f4828z == null && context2 != null && (b10 = m.f.b(context2)) != null && !b10.equals(context2.getPackageName())) {
                                    m.f.a(context2, b10, bmVar);
                                    return;
                                }
                                return;
                            }
                            return;
                        case 2:
                            p20 p20Var2 = this.f8925v;
                            ph phVar = new ph("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                            ju0 ju0Var = p20Var2.D;
                            ju0Var.getClass();
                            try {
                                try {
                                    IBinder b11 = ya.m0.a(ju0Var.f7543u).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                    if (b11 == null) {
                                        ohVar = null;
                                    } else {
                                        IInterface queryLocalInterface = b11.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                        if (queryLocalInterface instanceof mn) {
                                            ohVar = (mn) queryLocalInterface;
                                        } else {
                                            ohVar = new oh(b11, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                        }
                                    }
                                    Parcel g22 = ohVar.g2();
                                    qh.e(g22, phVar);
                                    ohVar.v2(g22, 1);
                                    return;
                                } catch (Exception e) {
                                    throw new Exception(e);
                                }
                            } catch (RemoteException e8) {
                                l9.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
                                return;
                            } catch (l9.j e10) {
                                l9.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                return;
                            }
                        default:
                            p20 p20Var3 = this.f8925v;
                            f9.k kVar2 = f9.k.C;
                            k9.c0 g11 = kVar2.f16817h.g();
                            g11.i();
                            synchronized (g11.f19642a) {
                                z3 = g11.f19664y;
                            }
                            if (z3) {
                                k9.c0 g12 = kVar2.f16817h.g();
                                g12.i();
                                synchronized (g12.f19642a) {
                                    str = g12.f19665z;
                                }
                                if (!kVar2.f16823o.b(p20Var3.f9326u, str, p20Var3.f9327v.f20029u)) {
                                    kVar2.f16817h.g().e(false);
                                    kVar2.f16817h.g().f("");
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
        }
        if (((Boolean) rVar.f17698c.a(sl.f11044z5)).booleanValue()) {
            if (((Boolean) rVar.f17698c.a(sl.A5)).booleanValue()) {
                xx.f12651a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.o20

                    /* renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ p20 f8925v;

                    {
                        this.f8925v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String b10;
                        oh ohVar;
                        boolean z3;
                        String str;
                        switch (i10) {
                            case 0:
                                an1.h(this.f8925v.f9326u, true);
                                return;
                            case 1:
                                p20 p20Var = this.f8925v;
                                bm bmVar = f9.k.C.f16822n;
                                Context context2 = p20Var.f9326u;
                                be0 be0Var2 = p20Var.H;
                                if (!bmVar.f4824v.getAndSet(true)) {
                                    bmVar.f4825w = context2;
                                    bmVar.f4826x = be0Var2;
                                    if (bmVar.f4828z == null && context2 != null && (b10 = m.f.b(context2)) != null && !b10.equals(context2.getPackageName())) {
                                        m.f.a(context2, b10, bmVar);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 2:
                                p20 p20Var2 = this.f8925v;
                                ph phVar = new ph("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
                                ju0 ju0Var = p20Var2.D;
                                ju0Var.getClass();
                                try {
                                    try {
                                        IBinder b11 = ya.m0.a(ju0Var.f7543u).b("com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy");
                                        if (b11 == null) {
                                            ohVar = null;
                                        } else {
                                            IInterface queryLocalInterface = b11.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                                            if (queryLocalInterface instanceof mn) {
                                                ohVar = (mn) queryLocalInterface;
                                            } else {
                                                ohVar = new oh(b11, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy", 0);
                                            }
                                        }
                                        Parcel g22 = ohVar.g2();
                                        qh.e(g22, phVar);
                                        ohVar.v2(g22, 1);
                                        return;
                                    } catch (Exception e) {
                                        throw new Exception(e);
                                    }
                                } catch (RemoteException e8) {
                                    l9.i.f("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e8.getMessage())));
                                    return;
                                } catch (l9.j e10) {
                                    l9.i.f("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e10.getMessage())));
                                    return;
                                }
                            default:
                                p20 p20Var3 = this.f8925v;
                                f9.k kVar2 = f9.k.C;
                                k9.c0 g11 = kVar2.f16817h.g();
                                g11.i();
                                synchronized (g11.f19642a) {
                                    z3 = g11.f19664y;
                                }
                                if (z3) {
                                    k9.c0 g12 = kVar2.f16817h.g();
                                    g12.i();
                                    synchronized (g12.f19642a) {
                                        str = g12.f19665z;
                                    }
                                    if (!kVar2.f16823o.b(p20Var3.f9326u, str, p20Var3.f9327v.f20029u)) {
                                        kVar2.f16817h.g().e(false);
                                        kVar2.f16817h.g().f("");
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        }
        if (((Boolean) rVar.f17698c.a(sl.O5)).booleanValue()) {
            zf0 zf0Var = this.I;
            wx wxVar = xx.f12655f;
            Objects.requireNonNull(zf0Var);
            wxVar.execute(new f(27, zf0Var));
        }
    }

    @Override // g9.f1
    public final void b2(String str) {
        this.f9330y.b(str);
    }

    @Override // g9.f1
    public final void e4(g9.n1 n1Var) {
        this.C.e(n1Var, mf0.f8340v);
    }

    @Override // g9.f1
    public final synchronized boolean h() {
        boolean z3;
        k9.a aVar = f9.k.C.i;
        synchronized (aVar) {
            z3 = aVar.f19632a;
        }
        return z3;
    }

    @Override // g9.f1
    public final synchronized float i() {
        return f9.k.C.i.a();
    }

    @Override // g9.f1
    public final List j() {
        return this.f9331z.b();
    }

    @Override // g9.f1
    public final String m() {
        return this.f9327v.f20029u;
    }

    @Override // g9.f1
    public final synchronized void r3(String str) {
        Context context = this.f9326u;
        sl.a(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) g9.r.e.f17698c.a(sl.S4)).booleanValue()) {
                f9.k.C.f16820l.i(context, this.f9327v, true, null, str, null, null, this.E, null, null, this.C.f());
            }
        }
    }

    @Override // g9.f1
    public final void t4(iq iqVar) {
        af0 af0Var = this.f9331z;
        af0Var.getClass();
        af0Var.e.f12998u.a(new t81(af0Var, 19, iqVar), af0Var.f4477j);
    }

    @Override // g9.f1
    public final synchronized void x1(float f10) {
        k9.a aVar = f9.k.C.i;
        synchronized (aVar) {
            aVar.f19633b = f10;
        }
    }
}
