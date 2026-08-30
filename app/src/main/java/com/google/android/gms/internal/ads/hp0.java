package com.google.android.gms.internal.ads;
import g9.d3;
import g9.q1;
import g9.y1;
import k9.a0;
import l9.i;
import w9.a;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hp0 implements a, k70, v60, s60, z60, t70, wo0, f90 {

    /* renamed from: u, reason: collision with root package name */
    public final mq0 f6863u;

    /* renamed from: v, reason: collision with root package name */
    public final AtomicReference f6864v = new AtomicReference();

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f6865w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    public final AtomicReference f6866x = new AtomicReference();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicReference f6867y = new AtomicReference();

    /* renamed from: z, reason: collision with root package name */
    public final AtomicReference f6868z = new AtomicReference();
    public final AtomicReference A = new AtomicReference();
    public final AtomicReference B = new AtomicReference();
    public final AtomicReference C = new AtomicReference();
    public hp0 D = null;

    public hp0(mq0 mq0Var) {
        this.f6863u = mq0Var;
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.C();
            return;
        }
        Object obj = this.f6867y.get();
        if (obj != null) {
            try {
                lv lvVar = (lv) obj;
                lvVar.v2(lvVar.g2(), 6);
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.E();
            return;
        }
        zq0 zq0Var = this.f6863u.f8397a;
        if (zq0Var != null) {
            u uVar = (u) zq0Var.f13255v;
            synchronized (uVar) {
                uVar.f11497u = 1;
                uVar.g();
            }
        }
        Object obj = this.f6866x.get();
        if (obj != null) {
            try {
                ((zv) obj).b();
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = this.f6867y.get();
        if (obj2 != null) {
            try {
                lv lvVar = (lv) obj2;
                lvVar.v2(lvVar.g2(), 4);
            } catch (RemoteException e10) {
                int i11 = a0.f19634b;
                i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.C.get();
        if (obj3 != null) {
            try {
                ((ft0) obj3).a();
            } catch (RemoteException e12) {
                int i13 = a0.f19634b;
                i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i14 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.F();
            return;
        }
        AtomicReference atomicReference = this.f6866x;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zv) obj).a();
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = this.f6867y.get();
        if (obj2 != null) {
            try {
                lv lvVar = (lv) obj2;
                lvVar.v2(lvVar.g2(), 2);
            } catch (RemoteException e10) {
                int i11 = a0.f19634b;
                i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = atomicReference.get();
        if (obj3 != null) {
            try {
                ((zv) obj3).f();
            } catch (RemoteException e12) {
                int i13 = a0.f19634b;
                i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i14 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void M() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.M();
        } else {
            ct.g(this.f6866x, ho0.f6851y);
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Q() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.a();
            return;
        }
        Object obj = this.f6867y.get();
        if (obj != null) {
            try {
                lv lvVar = (lv) obj;
                lvVar.v2(lvVar.g2(), 3);
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.b();
            return;
        }
        Object obj = this.f6867y.get();
        if (obj != null) {
            try {
                lv lvVar = (lv) obj;
                lvVar.v2(lvVar.g2(), 8);
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void c(d3 d3Var) {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.c(d3Var);
            return;
        }
        Object obj = this.B.get();
        if (obj != null) {
            try {
                ((q1) obj).y1(d3Var);
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.e();
            return;
        }
        Object obj = this.f6865w.get();
        if (obj != null) {
            try {
                ((dw) obj).a();
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = this.f6867y.get();
        if (obj2 != null) {
            try {
                lv lvVar = (lv) obj2;
                lvVar.v2(lvVar.g2(), 1);
            } catch (RemoteException e10) {
                int i11 = a0.f19634b;
                i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wo0
    public final void k(wo0 wo0Var) {
        this.D = (hp0) wo0Var;
    }

    @Override // a
    public final void l() {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.l();
        } else {
            ct.g(this.f6864v, ho0.f6852z);
        }
    }

    @Override // com.google.android.gms.internal.ads.z60
    public final void o(y1 y1Var) {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.o(y1Var);
            return;
        }
        AtomicReference atomicReference = this.f6866x;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zv) obj).C1(y1Var);
            } catch (RemoteException e) {
                int i = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i10 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zv) obj2).B(y1Var.f17714u);
            } catch (RemoteException e10) {
                int i11 = a0.f19634b;
                i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i12 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
        int i = ivVar.f7232v;
        String str3 = ivVar.f7231u;
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.v(ivVar, str, str2);
            return;
        }
        Object obj = this.f6866x.get();
        if (obj != null) {
            try {
                ((zv) obj).K1(new jw(str3, i));
            } catch (RemoteException e) {
                int i10 = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i11 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = this.f6868z.get();
        if (obj2 != null) {
            try {
                ew ewVar = (ew) obj2;
                jw jwVar = new jw(str3, i);
                Parcel g22 = ewVar.g2();
                qh.e(g22, jwVar);
                g22.writeString(str);
                g22.writeString(str2);
                ewVar.v2(g22, 2);
            } catch (RemoteException e10) {
                int i12 = a0.f19634b;
                i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i13 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f6867y.get();
        if (obj3 != null) {
            try {
                lv lvVar = (lv) obj3;
                Parcel g23 = lvVar.g2();
                qh.e(g23, ivVar);
                lvVar.v2(g23, 5);
            } catch (RemoteException e12) {
                int i14 = a0.f19634b;
                i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i15 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj4 = this.A.get();
        if (obj4 != null) {
            try {
                kv kvVar = (kv) obj4;
                Parcel g24 = kvVar.g2();
                qh.e(g24, ivVar);
                g24.writeString(str);
                g24.writeString(str2);
                kvVar.v2(g24, 2);
            } catch (RemoteException e14) {
                int i16 = a0.f19634b;
                i.i(e14, "#007 Could not call remote method.");
            } catch (NullPointerException e15) {
                int i17 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e15);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(y1 y1Var) {
        hp0 hp0Var = this.D;
        if (hp0Var != null) {
            hp0Var.x(y1Var);
            return;
        }
        int i = y1Var.f17714u;
        AtomicReference atomicReference = this.f6865w;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((dw) obj).r(y1Var);
            } catch (RemoteException e) {
                int i10 = a0.f19634b;
                i.i(e, "#007 Could not call remote method.");
            } catch (NullPointerException e8) {
                int i11 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e8);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((dw) obj2).u(i);
            } catch (RemoteException e10) {
                int i12 = a0.f19634b;
                i.i(e10, "#007 Could not call remote method.");
            } catch (NullPointerException e11) {
                int i13 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj3 = this.f6867y.get();
        if (obj3 != null) {
            try {
                lv lvVar = (lv) obj3;
                Parcel g22 = lvVar.g2();
                g22.writeInt(i);
                lvVar.v2(g22, 7);
            } catch (RemoteException e12) {
                int i14 = a0.f19634b;
                i.i(e12, "#007 Could not call remote method.");
            } catch (NullPointerException e13) {
                int i15 = a0.f19634b;
                i.g("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
    }
}
