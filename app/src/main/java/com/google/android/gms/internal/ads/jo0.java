package com.google.android.gms.internal.ads;
import g9.d3;
import g9.q1;
import g9.y1;
import j9.m;
import k9.a0;
import l9.i;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class jo0 implements v60, p70, wo0, j9.m, t70, z60, f90 {

    /* renamed from: u, reason: collision with root package name */
    public final mq0 f7493u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f7494v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f7495w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f7496x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f7497y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f7498z = new AtomicReference();
    public final AtomicReference A = new AtomicReference();
    public final AtomicReference B = new AtomicReference();
    public jo0 C = null;

    public jo0(mq0 mq0Var) {
        this.f7493u = mq0Var;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void M() {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.M();
            return;
        }
        Object obj = this.f7496x.get();
        if (obj != null) {
            try {
                ((yi) obj).b();
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
    public final void Q() {
    }

    @Override // j9.m
    public final void R0() {
    }

    @Override // j9.m
    public final void T1() {
    }

    public final void a(b40 b40Var) {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.a(b40Var);
            return;
        }
        Object obj = this.f7494v.get();
        if (obj != null) {
            try {
                ((vi) obj).W0(b40Var);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    public final void b() {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.b();
            return;
        }
        zq0 zq0Var = this.f7493u.f8397a;
        if (zq0Var != null) {
            u uVar = (u) zq0Var.f13255v;
            synchronized (uVar) {
                uVar.f11497u = 1;
                uVar.g();
            }
        }
        if (this.f7495w.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj = this.f7496x.get();
        if (obj != null) {
            try {
                ((yi) obj).E();
            } catch (RemoteException e10) {
                int i11 = k9.a0.f19634b;
                l9.i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = this.B.get();
        if (obj2 != null) {
            try {
                ((ft0) obj2).a();
            } catch (RemoteException e12) {
                int i13 = k9.a0.f19634b;
                l9.i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i14 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void c(g9.d3 d3Var) {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.c(d3Var);
            return;
        }
        Object obj = this.A.get();
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

    @Override // j9.m
    public final void d() {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.d();
            return;
        }
        Object obj = this.f7498z.get();
        if (obj != null) {
            try {
                ((j9.m) obj).d();
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        AtomicReference atomicReference = this.f7496x;
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((yi) obj2).y();
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
                ((yi) obj3).a();
            } catch (RemoteException e12) {
                int i13 = k9.a0.f19634b;
                l9.i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i14 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
    }

    @Override // j9.m
    public final void g2() {
    }

    @Override // com.google.android.gms.internal.ads.p70
    public final void h() {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.h();
        } else {
            ct.g(this.f7497y, ho0.f6848v);
        }
    }

    @Override // j9.m
    public final void i4(int i) {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.i4(i);
            return;
        }
        Object obj = this.f7498z.get();
        if (obj != null) {
            try {
                ((j9.m) obj).i4(i);
            } catch (RemoteException e) {
                int i10 = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i11 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wo0
    public final void k(wo0 wo0Var) {
        this.C = (jo0) wo0Var;
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void o(g9.y1 y1Var) {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.o(y1Var);
            return;
        }
        Object obj = this.f7496x.get();
        if (obj != null) {
            try {
                ((yi) obj).S3(y1Var);
            } catch (RemoteException e) {
                int i = k9.a0.f19634b;
                l9.i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // j9.m
    public final void o3() {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.o3();
        } else {
            ct.g(this.f7498z, ho0.f6850x);
        }
    }

    @Override // j9.m
    public final void r0() {
    }

    @Override // j9.m
    public final void t1() {
    }

    @Override // j9.m
    public final void u2() {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.u2();
        } else {
            ct.g(this.f7498z, ho0.f6849w);
        }
    }

    @Override // j9.m
    public final void v2() {
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(g9.y1 y1Var) {
        jo0 jo0Var = this.C;
        if (jo0Var != null) {
            jo0Var.x(y1Var);
            return;
        }
        AtomicReference atomicReference = this.f7494v;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((vi) obj).F(y1Var);
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
                ((vi) obj2).w(y1Var.f17714u);
            } catch (RemoteException e10) {
                int i11 = k9.a0.f19634b;
                l9.i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = k9.a0.f19634b;
                l9.i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
    }

    @Override // j9.m
    public final void z1() {
    }
}
