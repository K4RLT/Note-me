package com.google.android.gms.internal.ads;
import g9.y1;

/* loaded from: classes.dex */
public final class zi0 extends zr implements h70 {

    /* renamed from: u, reason: collision with root package name */
    public as f13175u;

    /* renamed from: v, reason: collision with root package name */
    public mf f13176v;

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void B3(ko koVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void D() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void K2(g9.y1 y1Var) {
        mf mfVar = this.f13176v;
        if (mfVar != null) {
            synchronized (mfVar) {
                if (!mfVar.f8336u) {
                    mfVar.f8336u = true;
                    mfVar.l(y1Var);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void N3(qv qvVar) {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.N3(qvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void O3(String str, String str2) {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.O3(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void S(int i) {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.S(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void T(String str) {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.T(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void a() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void b() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void c3(g9.y1 y1Var) {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.c3(y1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void d() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void d4() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.d4();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void f() {
        try {
            as asVar = this.f13175u;
            if (asVar != null) {
                asVar.f();
            }
            mf mfVar = this.f13176v;
            if (mfVar != null) {
                synchronized (mfVar) {
                    ((yx) mfVar.f8338w).b(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void g() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void i() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void j() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void n() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.n();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void o0(int i) {
        mf mfVar = this.f13176v;
        if (mfVar != null) {
            mfVar.f(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void o4(int i, String str) {
        mf mfVar = this.f13176v;
        if (mfVar != null) {
            synchronized (mfVar) {
                try {
                    if (!mfVar.f8336u) {
                        mfVar.f8336u = true;
                        if (str == null) {
                            str = fk0.c(i, ((gi0) mfVar.f8337v).f6406a);
                        }
                        mfVar.l(new g9.y1(i, str, "undefined", null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void s() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.h70
    public final synchronized void v1(mf mfVar) {
        this.f13176v = mfVar;
    }

    public final synchronized void w4(gk0 gk0Var) {
        this.f13175u = gk0Var;
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void x() {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.x();
        }
    }

    @Override // com.google.android.gms.internal.ads.as
    public final synchronized void z0(sv svVar) {
        as asVar = this.f13175u;
        if (asVar != null) {
            asVar.z0(svVar);
        }
    }
}
