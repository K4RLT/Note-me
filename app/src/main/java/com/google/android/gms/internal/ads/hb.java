package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import com.google.android.gms.internal.ads.i60;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class hb implements com.google.android.gms.internal.mlkit_vision_digital_ink.uq {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;

    /* renamed from: u, reason: collision with root package name */
    public Object f6649u;

    /* renamed from: v, reason: collision with root package name */
    public Object f6650v;

    /* renamed from: w, reason: collision with root package name */
    public Object f6651w;

    /* renamed from: x, reason: collision with root package name */
    public Object f6652x;

    /* renamed from: y, reason: collision with root package name */
    public Object f6653y;

    /* renamed from: z, reason: collision with root package name */
    public Object f6654z;

    public hb(rb rbVar, i0.m mVar) {
        lx0 lx0Var = new lx0(new Handler(Looper.getMainLooper()));
        this.f6649u = new AtomicInteger();
        this.f6650v = new HashSet();
        this.f6651w = new PriorityBlockingQueue();
        this.f6652x = new PriorityBlockingQueue();
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.f6653y = rbVar;
        this.f6654z = mVar;
        this.A = new cb[4];
        this.E = lx0Var;
    }

    public static com.google.android.gms.internal.mlkit_vision_digital_ink.q2 k(com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar2) {
        if (trVar2.D() != trVar.D()) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.NEW_BUILD_ID);
        }
        if (!trVar2.S().equals(trVar.S())) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.NEW_VARIANT_ID);
        }
        if (trVar2.B() != trVar.B()) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.NEW_VERSION_NUMBER);
        }
        if (!trVar.T().equals(trVar2.T())) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_FILES);
        }
        if (!trVar2.M().equals(trVar.M())) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_CUSTOM_METADATA);
        }
        if (trVar2.F() != trVar.F()) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_STALE_LIFETIME);
        }
        if (trVar2.E() != trVar.E()) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_EXPIRATION_DATE);
        }
        if (!trVar2.K().equals(trVar.K())) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_DOWNLOAD_CONDITIONS);
        }
        if (trVar2.y() != trVar.y()) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_ALLOWED_READERS);
        }
        if (trVar2.z() != trVar.z()) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_DOWNLOAD_POLICY);
        }
        if (!trVar2.W().equals(trVar.W())) {
            return new com.google.android.gms.internal.mlkit_vision_digital_ink.s2(com.google.android.gms.internal.mlkit_vision_digital_ink.c9.DIFFERENT_EXPERIMENT_INFO);
        }
        return com.google.android.gms.internal.mlkit_vision_digital_ink.j2.f14494u;
    }

    public static final void v(ArrayList arrayList, com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.cx.g("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", fsVar.w(), fsVar.x());
        com.google.android.gms.internal.mlkit_vision_digital_ink.o2.b(arrayList, fsVar.w());
        com.google.android.gms.internal.mlkit_vision_digital_ink.cx.f("%s: An unknown error has occurred during download", "FileGroupManager");
        int i = com.google.android.gms.internal.mlkit_vision_digital_ink.jr.f14529v;
        ra.e eVar = new ra.e(21, false);
        eVar.f24675v = com.google.android.gms.internal.mlkit_vision_digital_ink.vq.UNKNOWN_ERROR;
        throw eVar.C();
    }

    public static void x(com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, int i) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.s8 t3 = com.google.android.gms.internal.mlkit_vision_digital_ink.t8.t();
        t3.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.t8.B((com.google.android.gms.internal.mlkit_vision_digital_ink.t8) t3.f14430v, i);
        String P = trVar.P();
        t3.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.t8.v((com.google.android.gms.internal.mlkit_vision_digital_ink.t8) t3.f14430v, P);
        int B = trVar.B();
        t3.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.t8.w((com.google.android.gms.internal.mlkit_vision_digital_ink.t8) t3.f14430v, B);
        long D = trVar.D();
        t3.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.t8.u((com.google.android.gms.internal.mlkit_vision_digital_ink.t8) t3.f14430v, D);
        String S = trVar.S();
        t3.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.t8.A((com.google.android.gms.internal.mlkit_vision_digital_ink.t8) t3.f14430v, S);
        String D2 = orVar.D();
        t3.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.t8.x((com.google.android.gms.internal.mlkit_vision_digital_ink.t8) t3.f14430v, D2);
    }

    public void A(qp0 qp0Var) {
        ac.b A;
        synchronized (this) {
            Iterator it = qp0Var.f9924a.iterator();
            while (true) {
                if (it.hasNext()) {
                    di0 a10 = ((b50) this.f6653y).a(qp0Var.f9926b, (String) it.next());
                    if (a10 != null && a10.b((wp0) this.E, qp0Var)) {
                        A = ed1.Y(a10.a((wp0) this.E, qp0Var), qp0Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f6652x);
                        if (((Boolean) g9.r.e.f17698c.a(sl.f10748ga)).booleanValue()) {
                            rr0 d2 = rr0.d((Context) this.f6649u, 12);
                            d2.j(qp0Var.E);
                            d2.zza();
                            ed1.V(A, (ur0) this.f6650v, d2, false);
                        }
                    }
                } else {
                    A = ed1.A(new cg0(3));
                    break;
                }
            }
        }
        ((qj0) this.f6654z).b((wp0) this.E, qp0Var, A, (ws0) this.A);
        A.a(new t81(A, 0, new i0.m(this, 7, qp0Var)), (Executor) this.f6651w);
    }

    public void a() {
        this.f6649u = null;
        this.f6650v = null;
        t0.e eVar = (t0.e) this.f6651w;
        eVar.j();
        ((n.j0) this.f6652x).b();
        this.f6653y = eVar;
        ((t0.e) this.f6654z).j();
        ((t0.e) this.A).j();
        this.B = null;
        this.D = null;
        this.C = null;
    }

    public void b() {
        Set set = (Set) this.f6649u;
        if (set != null && !set.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    r0.v1 v1Var = (r0.v1) it.next();
                    it.remove();
                    v1Var.a();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public void d() {
        t0.e eVar = (t0.e) this.f6651w;
        t0.e eVar2 = (t0.e) this.f6654z;
        Set set = (Set) this.f6649u;
        if (set != null) {
            this.E = null;
            if (eVar2.f25619w != 0) {
                Trace.beginSection("Compose:onForgotten");
                try {
                    n.j0 j0Var = (n.j0) this.B;
                    int i = eVar2.f25619w;
                    while (true) {
                        i--;
                        if (-1 >= i) {
                            break;
                        }
                        Object obj = eVar2.f25617u[i];
                        try {
                            if (obj instanceof r0.w1) {
                                r0.v1 v1Var = ((r0.w1) obj).f24424a;
                                set.remove(v1Var);
                                v1Var.b();
                            }
                            if (obj instanceof r0.j) {
                                if (j0Var != null && j0Var.c(obj)) {
                                    ((r0.j) obj).a();
                                } else {
                                    ((r0.j) obj).b();
                                }
                            }
                        } catch (Throwable th) {
                            c1.c cVar = (c1.c) this.f6650v;
                            if (cVar != null) {
                                wa.n.a(th, new androidx.ink.brush.b(cVar, 5, obj));
                            }
                            throw th;
                        }
                    }
                } finally {
                    Trace.endSection();
                }
            }
            if (eVar.f25619w != 0) {
                Trace.beginSection("Compose:onRemembered");
                try {
                    Set set2 = (Set) this.f6649u;
                    if (set2 != null) {
                        Object[] objArr = eVar.f25617u;
                        int i10 = eVar.f25619w;
                        for (int i11 = 0; i11 < i10; i11++) {
                            r0.w1 w1Var = (r0.w1) objArr[i11];
                            r0.v1 v1Var2 = w1Var.f24424a;
                            set2.remove(v1Var2);
                            try {
                                v1Var2.d();
                            } catch (Throwable th2) {
                                c1.c cVar2 = (c1.c) this.f6650v;
                                if (cVar2 != null) {
                                    wa.n.a(th2, new androidx.ink.brush.b(cVar2, 5, w1Var));
                                }
                                throw th2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public void e(r0.w1 w1Var) {
        t0.e eVar = (t0.e) this.f6651w;
        if (((n.j0) this.f6652x).c(w1Var)) {
            ((n.j0) this.f6652x).l(w1Var);
            if (!((t0.e) this.f6653y).m(w1Var) && !eVar.m(w1Var)) {
                Object[] objArr = eVar.f25617u;
                int i = eVar.f25619w;
                for (int i10 = 0; i10 < i; i10++) {
                    if (((r0.w1) objArr[i10]).f24424a instanceof z0.e) {
                        throw null;
                    }
                }
            }
            Set set = (Set) this.f6649u;
            if (set != null) {
                set.add(w1Var.f24424a);
            } else {
                return;
            }
        }
        n.j0 j0Var = (n.j0) this.E;
        if (j0Var != null && j0Var.c(w1Var)) {
            return;
        }
        ((t0.e) this.f6654z).b(w1Var);
    }

    public void f(Set set, c1.c cVar) {
        a();
        this.f6649u = set;
        this.f6650v = cVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.mlkit_vision_digital_ink.yu c() {
        ((com.google.android.gms.internal.mlkit_vision_digital_ink.s5) this.f6649u).e();
        return new com.google.android.gms.internal.mlkit_vision_digital_ink.yu(((com.google.android.gms.internal.mlkit_vision_digital_ink.b1) this.f6651w).c(), (com.google.android.gms.internal.mlkit_vision_digital_ink.pv) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.f6652x).c(), (com.google.android.gms.internal.mlkit_vision_digital_ink.pv) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.f6653y).c(), (Uri) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.f6654z).c(), (Uri) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.A).c(), ((com.google.android.gms.internal.mlkit_vision_digital_ink.kv) this.B).a(), (com.google.android.gms.internal.mlkit_vision_digital_ink.i) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.C).c(), (Executor) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.D).c(), (com.google.android.gms.internal.mlkit_vision_digital_ink.ss) ((com.google.android.gms.internal.mlkit_vision_digital_ink.tq) this.E).c());
    }

    public void h() {
        ya yaVar = (ya) this.B;
        if (yaVar != null) {
            yaVar.f12826x = true;
            yaVar.interrupt();
        }
        cb[] cbVarArr = (cb[]) this.A;
        for (int i = 0; i < 4; i++) {
            cb cbVar = cbVarArr[i];
            if (cbVar != null) {
                cbVar.f5067x = true;
                cbVar.interrupt();
            }
        }
        PriorityBlockingQueue priorityBlockingQueue = (PriorityBlockingQueue) this.f6651w;
        PriorityBlockingQueue priorityBlockingQueue2 = (PriorityBlockingQueue) this.f6652x;
        rb rbVar = (rb) this.f6653y;
        lx0 lx0Var = (lx0) this.E;
        ya yaVar2 = new ya(priorityBlockingQueue, priorityBlockingQueue2, rbVar, lx0Var);
        this.B = yaVar2;
        yaVar2.start();
        for (int i10 = 0; i10 < 4; i10++) {
            cb cbVar2 = new cb(priorityBlockingQueue2, (i0.m) this.f6654z, rbVar, lx0Var);
            cbVarArr[i10] = cbVar2;
            cbVar2.start();
        }
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.lx i(com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.ea eaVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.ow owVar) {
        Instant now;
        long epochMilli;
        com.google.android.gms.internal.mlkit_vision_digital_ink.cx.b("%s: Verify group: %s, remove pending version: %s", "FileGroupManager", trVar.P(), Boolean.TRUE);
        com.google.android.gms.internal.mlkit_vision_digital_ink.es esVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.es) fsVar.g();
        esVar.l(true);
        final com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.fs) esVar.i();
        com.google.android.gms.internal.mlkit_vision_digital_ink.es esVar2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.es) fsVar.g();
        esVar2.l(false);
        final com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar3 = (com.google.android.gms.internal.mlkit_vision_digital_ink.fs) esVar2.i();
        final boolean G = trVar.H().G();
        now = Instant.now();
        epochMilli = now.toEpochMilli();
        com.google.android.gms.internal.mlkit_vision_digital_ink.pr prVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.pr) trVar.H().g();
        prVar.b();
        com.google.android.gms.internal.mlkit_vision_digital_ink.qr.A((com.google.android.gms.internal.mlkit_vision_digital_ink.qr) prVar.f14430v, epochMilli);
        com.google.android.gms.internal.mlkit_vision_digital_ink.qr qrVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.qr) prVar.i();
        com.google.android.gms.internal.mlkit_vision_digital_ink.rr rrVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.rr) trVar.g();
        rrVar.l(qrVar);
        final com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar2 = (com.google.android.gms.internal.mlkit_vision_digital_ink.tr) rrVar.i();
        com.google.android.gms.internal.mlkit_vision_digital_ink.lx w10 = com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(m(trVar, false, false, 0, trVar.A()));
        com.google.android.gms.internal.mlkit_vision_digital_ink.ea eaVar2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.mu
            @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
            public final ya l(Object obj) {
                boolean z3;
                pu puVar = (pu) obj;
                tr trVar3 = trVar;
                pu puVar2 = pu.f14814w;
                if (puVar == puVar2) {
                    trVar3.getClass();
                    return n5.m(puVar2);
                }
                pu puVar3 = pu.f14812u;
                if (puVar == puVar3) {
                    trVar3.getClass();
                    return n5.m(puVar3);
                }
                if (puVar == pu.f14813v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                pa.p(z3);
                fs fsVar4 = fsVar3;
                lx w11 = lx.w(eaVar.l(new cw(fsVar4, trVar3)));
                com.google.android.gms.internal.ads.hb hbVar = com.google.android.gms.internal.ads.hb.this;
                ow owVar2 = owVar;
                au auVar = new au(hbVar, owVar2, trVar3, fsVar4);
                Executor executor = (Executor) hbVar.f6653y;
                lx y10 = w11.y(auVar, executor).y(new qt(hbVar, trVar3, 2), executor);
                fs fsVar5 = fsVar2;
                tr trVar4 = trVar2;
                return y10.y(new au(hbVar, fsVar5, trVar4, 2), executor).y(new wt(hbVar, fsVar4, 1), executor).y(new hu(hbVar, 0), executor).x(new m2(G, owVar2, trVar4) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.iu

                    /* renamed from: u, reason: collision with root package name */
                    public final /* synthetic */ boolean f14484u;

                    /* renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ tr f14485v;

                    {
                        this.f14485v = trVar4;
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
                    public final Object l(Object obj2) {
                        if (!this.f14484u) {
                            q8 t3 = r8.t();
                            tr trVar5 = this.f14485v;
                            t3.o(trVar5.R());
                            t3.m(trVar5.P());
                            t3.n(trVar5.B());
                            int A = trVar5.A();
                            t3.b();
                            r8.v((r8) t3.f14430v, A);
                            t3.l(trVar5.D());
                            t3.p(trVar5.S());
                            qr H = trVar5.H();
                            long w12 = H.w();
                            long u9 = H.u();
                            long v2 = H.v();
                            u8 t10 = w8.t();
                            int t11 = H.t();
                            t10.b();
                            w8.u((w8) t10.f14430v, t11);
                            t10.b();
                            w8.v((w8) t10.f14430v, v2 - u9);
                            t10.b();
                            w8.x((w8) t10.f14430v, v2 - w12);
                            boolean E = trVar5.H().E();
                            t10.b();
                            w8.w((w8) t10.f14430v, E);
                        }
                        return pu.f14813v;
                    }
                }, executor);
            }
        };
        Executor executor = (Executor) this.f6653y;
        return w10.y(eaVar2, executor).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.qt(this, trVar, 3), executor);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.da, com.google.android.gms.internal.ads.py1, java.lang.Object] */
    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya j(final com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, com.google.android.gms.internal.mlkit_vision_digital_ink.os osVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.ls lsVar, final String str, long j10, final int i) {
        if (osVar.H() && j10 <= osVar.u()) {
            x(trVar, orVar, i);
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(Boolean.TRUE);
        }
        final long max = Math.max(j10, osVar.u());
        Context context = (Context) this.f6649u;
        com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f6652x;
        Executor executor = (Executor) this.f6654z;
        Object obj = new Object();
        obj.f9668v = context;
        obj.f9669w = str;
        obj.f9667u = max;
        obj.f9670x = iVar;
        obj.f9671y = orVar;
        obj.f9672z = trVar;
        com.google.android.gms.internal.mlkit_vision_digital_ink.hb o10 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.o(com.google.android.gms.internal.mlkit_vision_digital_ink.g2.a(obj), executor);
        com.google.android.gms.internal.mlkit_vision_digital_ink.ea eaVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.rt
            @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
            public final ya l(Object obj2) {
                com.google.android.gms.internal.ads.hb hbVar = com.google.android.gms.internal.ads.hb.this;
                i60 i60Var = (i60) hbVar.f6651w;
                i60Var.getClass();
                ns w10 = os.w();
                w10.b();
                os.F((os) w10.f14430v, ds.DOWNLOAD_COMPLETE);
                String str2 = str;
                String concat = "android_shared_".concat(String.valueOf(str2));
                w10.b();
                os.E((os) w10.f14430v, concat);
                w10.b();
                os.B((os) w10.f14430v);
                w10.b();
                os osVar2 = (os) w10.f14430v;
                long j11 = max;
                os.G(osVar2, j11);
                w10.b();
                os.C((os) w10.f14430v, str2);
                ya a10 = ((wv) i60Var.f7024b).a(lsVar, (os) w10.i());
                ea eaVar2 = new ea(hbVar, orVar, trVar, i, j11) { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.ku

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ or f14571a;

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ tr f14572b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ long f14573c;

                    /* renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ int f14574d;

                    {
                        this.f14571a = r2;
                        this.f14572b = r3;
                        this.f14574d = r4;
                        this.f14573c = j11;
                    }

                    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                    public final ya l(Object obj3) {
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        or orVar2 = this.f14571a;
                        tr trVar2 = this.f14572b;
                        if (!booleanValue) {
                            cx.g("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", orVar2.D(), trVar2.P());
                            com.google.android.gms.internal.ads.hb.x(trVar2, orVar2, 15);
                            return n5.m(Boolean.FALSE);
                        }
                        s8 t3 = t8.t();
                        t3.b();
                        t8.B((t8) t3.f14430v, this.f14574d);
                        String P = trVar2.P();
                        t3.b();
                        t8.v((t8) t3.f14430v, P);
                        int B = trVar2.B();
                        t3.b();
                        t8.w((t8) t3.f14430v, B);
                        long D = trVar2.D();
                        t3.b();
                        t8.u((t8) t3.f14430v, D);
                        String S = trVar2.S();
                        t3.b();
                        t8.A((t8) t3.f14430v, S);
                        String D2 = orVar2.D();
                        t3.b();
                        t8.x((t8) t3.f14430v, D2);
                        t3.b();
                        t8.y((t8) t3.f14430v);
                        t3.b();
                        t8.z((t8) t3.f14430v, this.f14573c);
                        return n5.m(Boolean.TRUE);
                    }
                };
                int i10 = g2.f14354a;
                return n5.q(a10, new r0(q1.b(), 3, eaVar2), (Executor) hbVar.f6653y);
            }
        };
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(o10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 3, eaVar), (Executor) this.f6653y);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya l(com.google.android.gms.internal.mlkit_vision_digital_ink.os osVar, com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar) {
        if (osVar.H()) {
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(com.google.android.gms.internal.mlkit_vision_digital_ink.ou.f14761u);
        }
        if (orVar.A().isEmpty()) {
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(com.google.android.gms.internal.mlkit_vision_digital_ink.ou.f14762v);
        }
        Context context = (Context) this.f6649u;
        String A = orVar.A();
        com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f6652x;
        com.google.android.gms.internal.mlkit_vision_digital_ink.hb o10 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.o(com.google.android.gms.internal.mlkit_vision_digital_ink.g2.a(new com.google.android.gms.internal.mlkit_vision_digital_ink.u0(context, A, iVar, orVar, trVar, 4)), (Executor) this.f6654z);
        com.google.android.gms.internal.mlkit_vision_digital_ink.ys ysVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.ys(5);
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.p(o10, new com.google.android.gms.internal.mlkit_vision_digital_ink.f2(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 0, ysVar), (Executor) this.f6653y);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya m(final com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, final boolean z3, final boolean z9, final int i, final int i10) {
        if (i < i10) {
            final com.google.android.gms.internal.mlkit_vision_digital_ink.or G = trVar.G(i);
            if (com.google.android.gms.internal.mlkit_vision_digital_ink.f7.r(G)) {
                return m(trVar, z3, z9, i + 1, i10);
            }
            return com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(n(G, trVar)).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.nu
                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj) {
                    ds dsVar = (ds) obj;
                    int i11 = i + 1;
                    ds dsVar2 = ds.DOWNLOAD_COMPLETE;
                    com.google.android.gms.internal.ads.hb hbVar = com.google.android.gms.internal.ads.hb.this;
                    or orVar = G;
                    tr trVar2 = trVar;
                    boolean z10 = z3;
                    boolean z11 = z9;
                    int i12 = i10;
                    if (dsVar == dsVar2) {
                        cx.b("%s: File %s downloaded for group: %s", "FileGroupManager", orVar.D(), trVar2.P());
                        return hbVar.m(trVar2, z10, z11, i11, i12);
                    }
                    if (dsVar != ds.SUBSCRIBED && dsVar != ds.DOWNLOAD_IN_PROGRESS) {
                        cx.b("%s: File %s not downloaded for group: %s", "FileGroupManager", orVar.D(), trVar2.P());
                        return hbVar.m(trVar2, true, z11, i11, i12);
                    }
                    cx.b("%s: File %s not downloaded for group: %s", "FileGroupManager", orVar.D(), trVar2.P());
                    return hbVar.m(trVar2, z10, true, i11, i12);
                }
            }, (Executor) this.f6653y);
        }
        if (z3) {
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(com.google.android.gms.internal.mlkit_vision_digital_ink.pu.f14814w);
        }
        if (z9) {
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(com.google.android.gms.internal.mlkit_vision_digital_ink.pu.f14812u);
        }
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(com.google.android.gms.internal.mlkit_vision_digital_ink.pu.f14813v);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.lx n(com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.ls e = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.e(orVar, trVar.y());
        i60 i60Var = (i60) this.f6651w;
        com.google.android.gms.internal.mlkit_vision_digital_ink.w9 f10 = i60Var.f(e);
        com.google.android.gms.internal.mlkit_vision_digital_ink.t0 t0Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.t0(7);
        int i = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
        return com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(f10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 3, t0Var), (Executor) i60Var.i)).v(com.google.android.gms.internal.mlkit_vision_digital_ink.vv.class, new com.google.android.gms.internal.mlkit_vision_digital_ink.ot(trVar, 1), (Executor) this.f6653y);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.w9 o(com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar, com.google.android.gms.internal.mlkit_vision_digital_ink.jr jrVar, long j10, String str) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.q8 t3 = com.google.android.gms.internal.mlkit_vision_digital_ink.r8.t();
        t3.m(fsVar.w());
        t3.o(fsVar.x());
        t3.l(j10);
        t3.p(str);
        com.google.android.gms.internal.mlkit_vision_digital_ink.es esVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.es) fsVar.g();
        esVar.l(false);
        com.google.android.gms.internal.mlkit_vision_digital_ink.ya a10 = ((com.google.android.gms.internal.mlkit_vision_digital_ink.qu) this.f6650v).a((com.google.android.gms.internal.mlkit_vision_digital_ink.fs) esVar.i());
        com.google.android.gms.internal.mlkit_vision_digital_ink.r0 r0Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(t3, 11, jrVar);
        int i = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(a10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 3, r0Var), (Executor) this.f6653y);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya p(final com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, final int i, final int i10) {
        if (i < i10) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.or G = trVar.G(i);
            if (com.google.android.gms.internal.mlkit_vision_digital_ink.f7.r(G)) {
                return p(trVar, i + 1, i10);
            }
            com.google.android.gms.internal.mlkit_vision_digital_ink.ls e = com.google.android.gms.internal.mlkit_vision_digital_ink.nw.e(G, trVar.y());
            i60 i60Var = (i60) this.f6651w;
            com.google.android.gms.internal.mlkit_vision_digital_ink.ya c10 = ((com.google.android.gms.internal.mlkit_vision_digital_ink.wv) i60Var.f7024b).c(e);
            com.google.android.gms.internal.mlkit_vision_digital_ink.r0 r0Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(i60Var, 16, e);
            int i11 = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
            int i12 = 3;
            com.google.android.gms.internal.mlkit_vision_digital_ink.w9 q10 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(c10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), i12, r0Var), (Executor) i60Var.i);
            com.google.android.gms.internal.mlkit_vision_digital_ink.ea eaVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.yt
                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    tr trVar2 = trVar;
                    if (!booleanValue) {
                        cx.i("%s: Subscribing to file failed for group: %s", "FileGroupManager", trVar2.P());
                        return n5.m(Boolean.FALSE);
                    }
                    return com.google.android.gms.internal.ads.hb.this.p(trVar2, i + 1, i10);
                }
            };
            return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(q10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), i12, eaVar), (Executor) this.f6653y);
        }
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.m(Boolean.TRUE);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.w9 q(com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.ls lsVar, final long j10) {
        final i60 i60Var = (i60) this.f6651w;
        com.google.android.gms.internal.mlkit_vision_digital_ink.w9 f10 = i60Var.f(lsVar);
        com.google.android.gms.internal.mlkit_vision_digital_ink.ea eaVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.sv
            @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
            public final ya l(Object obj) {
                os osVar = (os) obj;
                long u9 = osVar.u();
                long j11 = j10;
                if (j11 > u9) {
                    ns nsVar = (ns) osVar.g();
                    nsVar.b();
                    os.G((os) nsVar.f14430v, j11);
                    return ((wv) i60.this.f7024b).a(lsVar, (os) nsVar.i());
                }
                return n5.m(Boolean.TRUE);
            }
        };
        int i = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
        int i10 = 3;
        return com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(f10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), i10, eaVar), (Executor) i60Var.i), new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), i10, new com.google.android.gms.internal.mlkit_vision_digital_ink.pt(this, orVar, trVar, 0)), (Executor) this.f6653y);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.lx r(com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar, com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar) {
        long millis;
        Instant now;
        long epochMilli;
        Executor executor = (Executor) this.f6653y;
        if (trVar.E() == 0) {
            millis = Long.MAX_VALUE;
        } else {
            millis = TimeUnit.SECONDS.toMillis(trVar.E());
        }
        now = Instant.now();
        epochMilli = now.toEpochMilli();
        if (millis > epochMilli) {
            try {
                ((Context) this.f6649u).getPackageManager().getApplicationInfo(fsVar.x(), 0);
                com.google.android.gms.internal.mlkit_vision_digital_ink.ss ssVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.ss) this.D;
                com.google.android.gms.internal.mlkit_vision_digital_ink.ya yaVar = com.google.android.gms.internal.mlkit_vision_digital_ink.va.f15125v;
                ssVar.getClass();
                if (trVar.K().w() == 2) {
                    com.google.android.gms.internal.mlkit_vision_digital_ink.ya f10 = ((com.google.android.gms.internal.mlkit_vision_digital_ink.qu) this.f6650v).f(fsVar);
                    com.google.android.gms.internal.mlkit_vision_digital_ink.ju juVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.ju(this, trVar, fsVar);
                    int i = com.google.android.gms.internal.mlkit_vision_digital_ink.g2.f14354a;
                    yaVar = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.q(f10, new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(com.google.android.gms.internal.mlkit_vision_digital_ink.q1.b(), 3, juVar), executor);
                }
                return com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(yaVar).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.au(this, fsVar, trVar, 4), executor).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.au(this, fsVar, trVar, 5), executor);
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.internal.mlkit_vision_digital_ink.cx.g("%s: Trying to add group %s for uninstalled app %s.", "FileGroupManager", fsVar.w(), fsVar.x());
                throw new Exception();
            }
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.cx.i("%s: Trying to add expired group %s.", "FileGroupManager", fsVar.w());
        throw new Exception();
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.ya s(com.google.android.gms.internal.mlkit_vision_digital_ink.fs fsVar, boolean z3) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.es esVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.es) fsVar.g();
        esVar.l(z3);
        return ((com.google.android.gms.internal.mlkit_vision_digital_ink.qu) this.f6650v).a((com.google.android.gms.internal.mlkit_vision_digital_ink.fs) esVar.i());
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.lx t(com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.j4 j4Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.j4(4);
        com.google.android.gms.internal.mlkit_vision_digital_ink.j4 j4Var2 = new com.google.android.gms.internal.mlkit_vision_digital_ink.j4(4);
        for (com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar : trVar.T()) {
            if (com.google.android.gms.internal.mlkit_vision_digital_ink.f7.r(orVar)) {
                j4Var.a(orVar, Uri.parse(orVar.F()));
            } else {
                j4Var2.a(orVar, com.google.android.gms.internal.mlkit_vision_digital_ink.nw.e(orVar, trVar.y()));
            }
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.e5 c10 = j4Var2.c(false);
        i60 i60Var = (i60) this.f6651w;
        com.google.android.gms.internal.mlkit_vision_digital_ink.n4 r8 = com.google.android.gms.internal.mlkit_vision_digital_ink.n4.r(c10.values());
        return com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(((com.google.android.gms.internal.mlkit_vision_digital_ink.wv) i60Var.f7024b).b(r8)).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.r0(i60Var, 17, r8), (Executor) i60Var.i)).x(new com.google.android.gms.internal.mlkit_vision_digital_ink.f2(c10, 1, j4Var), (Executor) this.f6653y);
    }

    public void u(gb gbVar) {
        gbVar.B = this;
        HashSet hashSet = (HashSet) this.f6650v;
        synchronized (hashSet) {
            hashSet.add(gbVar);
        }
        gbVar.A = Integer.valueOf(((AtomicInteger) this.f6649u).incrementAndGet());
        gbVar.a("add-to-queue");
        z();
        ((PriorityBlockingQueue) this.f6651w).add(gbVar);
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.lx w(final com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.ls lsVar, final com.google.android.gms.internal.mlkit_vision_digital_ink.os osVar, final int i) {
        Context context = (Context) this.f6649u;
        final String A = orVar.A();
        final long E = trVar.E();
        Uri j10 = com.google.android.gms.internal.mlkit_vision_digital_ink.n5.j(context, lsVar.D(), osVar.A(), orVar.B(), (com.google.android.gms.internal.mlkit_vision_digital_ink.q2) this.A, false);
        if (j10 != null) {
            com.google.android.gms.internal.mlkit_vision_digital_ink.i iVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.i) this.f6652x;
            return com.google.android.gms.internal.mlkit_vision_digital_ink.lx.w(com.google.android.gms.internal.mlkit_vision_digital_ink.n5.o(com.google.android.gms.internal.mlkit_vision_digital_ink.g2.a(new g9.n(context, A, iVar, j10, orVar, trVar, 5)), (Executor) this.f6654z)).y(new com.google.android.gms.internal.mlkit_vision_digital_ink.ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.eu
                @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                public final ya l(Object obj) {
                    final com.google.android.gms.internal.ads.hb hbVar = com.google.android.gms.internal.ads.hb.this;
                    final tr trVar2 = trVar;
                    final or orVar2 = orVar;
                    os osVar2 = osVar;
                    final ls lsVar2 = lsVar;
                    String str = A;
                    final long j11 = E;
                    final int i10 = i;
                    ya j12 = hbVar.j(trVar2, orVar2, osVar2, lsVar2, str, j11, i10);
                    ea eaVar = new ea() { // from class: com.google.android.gms.internal.mlkit_vision_digital_ink.zt
                        @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
                        public final ya l(Object obj2) {
                            if (!((Boolean) obj2).booleanValue() && i10 != 6) {
                                return com.google.android.gms.internal.ads.hb.this.q(trVar2, orVar2, lsVar2, j11);
                            }
                            return va.f15125v;
                        }
                    };
                    int i11 = g2.f14354a;
                    return n5.q(j12, new r0(q1.b(), 3, eaVar), (Executor) hbVar.f6653y);
                }
            }, (Executor) this.f6653y);
        }
        com.google.android.gms.internal.mlkit_vision_digital_ink.cx.f("%s: Failed to get file uri!", "FileGroupManager");
        throw new com.google.android.gms.internal.mlkit_vision_digital_ink.fx(28, "Failed to get local file uri");
    }

    public com.google.android.gms.internal.mlkit_vision_digital_ink.e5 y(com.google.android.gms.internal.mlkit_vision_digital_ink.tr trVar) {
        com.google.android.gms.internal.mlkit_vision_digital_ink.j4 j4Var = new com.google.android.gms.internal.mlkit_vision_digital_ink.j4(4);
        Uri h3 = com.google.android.gms.internal.mlkit_vision_digital_ink.f7.h((Context) this.f6649u, (com.google.android.gms.internal.mlkit_vision_digital_ink.q2) this.A, trVar);
        Iterator it = trVar.T().iterator();
        while (true) {
            if (it.hasNext()) {
                com.google.android.gms.internal.mlkit_vision_digital_ink.or orVar = (com.google.android.gms.internal.mlkit_vision_digital_ink.or) it.next();
                Uri.Builder buildUpon = h3.buildUpon();
                if (orVar.E().isEmpty()) {
                    String F = orVar.F();
                    buildUpon.appendPath(F.substring(F.lastIndexOf("/") + 1));
                } else {
                    for (String str : orVar.E().split("/", -1)) {
                        if (!str.isEmpty()) {
                            buildUpon.appendPath(str);
                        }
                    }
                }
                j4Var.a(orVar, buildUpon.build());
            } else {
                return j4Var.c(false);
            }
        }
    }

    public void z() {
        ArrayList arrayList = (ArrayList) this.D;
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ hb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        this.f6649u = obj;
        this.f6650v = obj2;
        this.f6651w = obj3;
        this.f6652x = obj4;
        this.f6653y = obj5;
        this.f6654z = obj6;
        this.A = obj7;
        this.B = obj8;
        this.C = obj9;
        this.D = obj10;
        this.E = obj11;
    }
}
