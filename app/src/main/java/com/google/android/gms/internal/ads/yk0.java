package com.google.android.gms.internal.ads;
import a9.d;
import g9.a;
import g9.a0;
import g9.d3;
import g9.q1;
import g9.r;
import g9.u0;
import g9.x;
import g9.y1;
import g9.z0;
import j6.s;
import l9.i;
import r.e;

import android.os.RemoteException;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class yk0 implements a9.d, a80, k70, v60, b70, g9.a, s60, t70, z60, f90 {
    public final be0 D;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f12894u = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f12895v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f12896w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f12897x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f12898y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicBoolean f12899z = new AtomicBoolean(true);
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final AtomicReference C = new AtomicReference();
    public final ArrayBlockingQueue E = new ArrayBlockingQueue(((Integer) g9.r.e.f17698c.a(sl.f10764ha)).intValue());

    public yk0(be0 be0Var) {
        this.D = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
        Object obj = this.f12894u.get();
        if (obj != null) {
            try {
                ((g9.x) obj).k();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
        ct.g(this.f12894u, v80.Q);
        ct.g(this.f12898y, v80.S);
        ct.g(this.C, v80.T);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
        Object obj = this.f12894u.get();
        if (obj != null) {
            try {
                ((g9.x) obj).b();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        AtomicReference atomicReference = this.f12898y;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((g9.z0) obj2).y();
            } catch (RemoteException e10) {
                int i11 = k9.a0.f19634b;
                l9.i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 != null) {
            try {
                ((g9.z0) obj3).k();
            } catch (RemoteException e12) {
                int i13 = k9.a0.f19634b;
                l9.i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i14 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
    }

    @Override // g9.a
    public final void L() {
        Object obj;
        if (!((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue() && (obj = this.f12894u.get()) != null) {
            try {
                ((g9.x) obj).e();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void M() {
        Object obj;
        if (((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue() && (obj = this.f12894u.get()) != null) {
            try {
                ((g9.x) obj).e();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = this.f12898y.get();
        if (obj2 != null) {
            try {
                ((g9.z0) obj2).a();
            } catch (RemoteException e10) {
                int i11 = k9.a0.f19634b;
                l9.i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Q() {
        Object obj = this.f12894u.get();
        if (obj != null) {
            try {
                ((g9.x) obj).d();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
        this.f12899z.set(true);
        this.B.set(false);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void c(g9.d3 d3Var) {
        Object obj = this.f12896w.get();
        if (obj != null) {
            try {
                ((g9.q1) obj).y1(d3Var);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final synchronized void e() {
        ct.g(this.f12894u, v80.O);
        ct.g(this.f12897x, v80.R);
        this.B.set(true);
        t();
    }

    public final synchronized g9.x k() {
        return (g9.x) this.f12894u.get();
    }

    public final void l(g9.u0 u0Var) {
        this.f12895v.set(u0Var);
        this.A.set(true);
        t();
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void o(g9.y1 y1Var) {
        Object obj = this.f12898y.get();
        if (obj != null) {
            try {
                ((g9.z0) obj).s2(y1Var);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // a9.d
    public final synchronized void p(String str, String str2) {
        if (this.f12899z.get()) {
            if (!this.E.offer(new Pair(str, str2))) {
                int i = k9.a0.f19634b;
                l9.i.a("The queue for app events is full, dropping the new event.");
                be0 be0Var = this.D;
                if (be0Var != null) {
                    j6.s a10 = be0Var.a();
                    a10.k("action", "dae_action");
                    a10.k("dae_name", str);
                    a10.k("dae_data", str2);
                    a10.l();
                    return;
                }
            }
            return;
        }
        Object obj = this.f12895v.get();
        if (obj != null) {
            try {
                ((g9.u0) obj).e0(str, str2);
            } catch (RemoteException e) {
                int i10 = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i11 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
    }

    public final void t() {
        if (this.A.get() && this.B.get()) {
            ArrayBlockingQueue arrayBlockingQueue = this.E;
            Iterator it = arrayBlockingQueue.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = this.f12895v.get();
                if (obj != null) {
                    try {
                        ((g9.u0) obj).e0((String) pair.first, (String) pair.second);
                    } catch (RemoteException e) {
                        int i = k9.a0.f19634b;
                        l9.i.i(e, "#007 Could not call remote method.");
                    } catch (NullPointerException e8) {
                        int i10 = k9.a0.f19634b;
                        l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f12899z.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(g9.y1 y1Var) {
        AtomicReference atomicReference = this.f12894u;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((g9.x) obj).F(y1Var);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((g9.x) obj2).w(y1Var.f17714u);
            } catch (RemoteException e10) {
                int i11 = k9.a0.f19634b;
                l9.i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f12897x.get();
        if (obj3 != null) {
            try {
                ((g9.a0) obj3).X0(y1Var);
            } catch (RemoteException e12) {
                int i13 = k9.a0.f19634b;
                l9.i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i14 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        this.f12899z.set(false);
        this.E.clear();
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        ct.g(this.f12894u, v80.P);
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
    }
}
