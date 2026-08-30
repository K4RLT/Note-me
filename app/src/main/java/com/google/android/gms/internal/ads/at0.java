package com.google.android.gms.internal.ads;
import ac.a;
import g9.r;
import j6.s;
import k9.c0;
import la.a;
import r.e;
import z8.b;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class at0 {

    /* renamed from: a, reason: collision with root package name */
    public final k9.c0 f4606a;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f4608c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f4610f;

    /* renamed from: g, reason: collision with root package name */
    public final bl0 f4611g;

    /* renamed from: h, reason: collision with root package name */
    public final la.a f4612h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4607b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f4609d = new LinkedHashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public at0(k9.c0 c0Var, ScheduledExecutorService scheduledExecutorService, bl0 bl0Var, la.a aVar) {
        this.f4606a = c0Var;
        this.f4610f = scheduledExecutorService;
        this.f4611g = bl0Var;
        this.f4612h = aVar;
    }

    public static String g(String str, z8.b bVar) {
        return str + ":" + bVar;
    }

    public final void a(dt0 dt0Var) {
        int i = 1;
        if (dt0Var.t() <= 0 && !dt0Var.f5504m.get()) {
            i = 0;
        }
        c(dt0Var, i);
    }

    public final void b(dt0 dt0Var, boolean z3) {
        String str;
        this.f4612h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        z8.b q10 = dt0Var.q();
        String str2 = dt0Var.f5503l;
        String r8 = dt0Var.r();
        j6.s a10 = ((be0) this.f4611g.f4819v).a();
        a10.k("poaca_ts", Long.toString(currentTimeMillis));
        if (true != z3) {
            str = "poac";
        } else {
            str = "poact";
        }
        a10.k("action", str);
        a10.k("ad_unit_id", r8);
        a10.k("pid", str2);
        if (q10 != null) {
            a10.k("ad_format", q10.name().toLowerCase(Locale.ENGLISH));
        }
        a10.l();
        this.f4607b.set(false);
        l();
    }

    public final void c(dt0 dt0Var, int i) {
        if (i(dt0Var)) {
            return;
        }
        if (i > 0) {
            this.f4610f.execute(new ys0(this, dt0Var, i));
        }
        if (!this.f4607b.get() && dt0Var.t() == 0 && dt0Var.u()) {
            dt0Var.k();
            k(((Long) g9.r.e.f17698c.a(sl.f10692d0)).longValue());
            return;
        }
        k(0L);
    }

    public final void d(dt0 dt0Var) {
        z8.b q10 = dt0Var.q();
        if (q10 == null) {
            return;
        }
        String g8 = g(dt0Var.f5503l, q10);
        LinkedHashMap linkedHashMap = this.f4609d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(g8)) {
                linkedHashMap.remove(g8);
                int t3 = dt0Var.t();
                int i = t3 - 1;
                if (!dt0Var.f5504m.get()) {
                    t3 = i;
                }
                this.f4610f.execute(new ys0(this, Math.max(t3, 0), dt0Var));
            }
        }
    }

    public final int e() {
        d51 u9;
        LinkedHashMap linkedHashMap = this.f4609d;
        synchronized (linkedHashMap) {
            u9 = d51.u(linkedHashMap.values());
        }
        int size = u9.size();
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            dt0 dt0Var = (dt0) u9.get(i10);
            int t3 = dt0Var.t();
            int i11 = t3 - 1;
            if (!dt0Var.f5504m.get()) {
                t3 = i11;
            }
            i += Math.max(t3, 0);
        }
        return i;
    }

    public final int f() {
        int i;
        k9.c0 c0Var = this.f4606a;
        c0Var.i();
        synchronized (c0Var.f19642a) {
            i = c0Var.F;
        }
        nl nlVar = sl.S;
        g9.r rVar = g9.r.e;
        if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue() && i > 0) {
            return i;
        }
        return ((Integer) rVar.f17698c.a(sl.f10675c0)).intValue();
    }

    public final void h(dt0 dt0Var) {
        if (dt0Var.t() > 0 || dt0Var.f5504m.get()) {
            this.f4610f.execute(new ac.a(this, 24, dt0Var));
        }
        this.f4607b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f4608c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f4608c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.set(true);
    }

    public final boolean i(dt0 dt0Var) {
        boolean z3;
        z8.b q10 = dt0Var.q();
        if (q10 == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f4609d;
        synchronized (linkedHashMap) {
            z3 = !linkedHashMap.containsKey(g(dt0Var.f5503l, q10));
        }
        return z3;
    }

    public final boolean j() {
        d51 u9;
        LinkedHashMap linkedHashMap = this.f4609d;
        synchronized (linkedHashMap) {
            u9 = d51.u(linkedHashMap.values());
        }
        int size = u9.size();
        for (int i = 0; i < size; i++) {
            dt0 dt0Var = (dt0) u9.get(i);
            if (dt0Var.t() == 0 && dt0Var.u()) {
                return true;
            }
        }
        return false;
    }

    public final void k(long j10) {
        if (this.e.compareAndSet(false, true)) {
            synchronized (this) {
                ScheduledExecutorService scheduledExecutorService = this.f4610f;
                try {
                    if (j10 > 0) {
                        this.f4608c = scheduledExecutorService.schedule(new zs0(this, 1), j10, TimeUnit.MILLISECONDS);
                    } else {
                        scheduledExecutorService.execute(new zs0(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        dt0 dt0Var;
        d51 u9;
        if (this.f4607b.get()) {
            return;
        }
        synchronized (this) {
            dt0Var = null;
            this.f4608c = null;
        }
        int f10 = f();
        if (e() >= f10 && !j()) {
            m();
        } else {
            LinkedHashMap linkedHashMap = this.f4609d;
            synchronized (linkedHashMap) {
                u9 = d51.u(linkedHashMap.values());
            }
            int size = u9.size();
            double d2 = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                dt0 dt0Var2 = (dt0) u9.get(i);
                if (dt0Var2.u()) {
                    double t3 = dt0Var2.t() / dt0Var2.s();
                    if (t3 < d2) {
                        d2 = t3;
                    }
                    if (t3 < d2) {
                        dt0Var = dt0Var2;
                    }
                }
            }
            if (dt0Var != null) {
                dt0Var.k();
                if (dt0Var.t() > 0) {
                    bl0 bl0Var = this.f4611g;
                    this.f4612h.getClass();
                    bl0Var.p("acmpa", System.currentTimeMillis(), dt0Var.f5503l, dt0Var.r(), dt0Var.q(), dt0Var.s(), dt0Var.t(), 0, e(), f10);
                }
            }
            if (e() >= f10) {
                m();
            }
            if (e() < f10 || j()) {
                if (j()) {
                    this.f4610f.execute(new zs0(this, 2));
                    return;
                }
                synchronized (this) {
                    this.f4608c = this.f4610f.schedule(new zs0(this, 3), ((Long) g9.r.e.f17698c.a(sl.f10706e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        }
        this.e.set(false);
    }

    public final void m() {
        int size;
        LinkedHashMap linkedHashMap = this.f4609d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        bl0 bl0Var = this.f4611g;
        this.f4612h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int f10 = f();
        j6.s a10 = ((be0) bl0Var.f4819v).a();
        a10.k("action", "acmlr");
        a10.k("pat", Long.toString(currentTimeMillis));
        a10.k("mpl", Integer.toString(f10));
        a10.k("pas", Integer.toString(size));
        a10.l();
    }

    public final void n(dt0 dt0Var, int i) {
        this.f4612h.getClass();
        this.f4611g.p("acmpr", System.currentTimeMillis(), dt0Var.f5503l, dt0Var.r(), dt0Var.q(), dt0Var.s(), dt0Var.t(), i, e(), f());
    }
}
