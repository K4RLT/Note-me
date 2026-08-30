package com.google.android.gms.internal.ads;
import f9.k;
import g9.a;
import g9.y1;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final class rd0 implements a80, k70, v60, b70, g9.a, k80 {

    /* renamed from: u, reason: collision with root package name */
    public final jj f10211u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10212v = false;

    public rd0(jj jjVar, bp0 bp0Var) {
        this.f10211u = jjVar;
        jjVar.b(2);
        if (bp0Var != null) {
            jjVar.b(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void B(nk nkVar) {
        jj jjVar = this.f10211u;
        synchronized (jjVar) {
            if (jjVar.f7452c) {
                try {
                    jjVar.f7451b.f(nkVar);
                } catch (NullPointerException e) {
                    f9.k.C.f16817h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        jjVar.b(1103);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void D() {
        this.f10211u.b(1109);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void G(nk nkVar) {
        jj jjVar = this.f10211u;
        synchronized (jjVar) {
            if (jjVar.f7452c) {
                try {
                    jjVar.f7451b.f(nkVar);
                } catch (NullPointerException e) {
                    f9.k.C.f16817h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        jjVar.b(1102);
    }

    @Override // g9.a
    public final synchronized void L() {
        boolean z3 = this.f10212v;
        jj jjVar = this.f10211u;
        if (!z3) {
            jjVar.b(7);
            this.f10212v = true;
        } else {
            jjVar.b(8);
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
        this.f10211u.a(new y70(wp0Var));
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void c(nk nkVar) {
        jj jjVar = this.f10211u;
        synchronized (jjVar) {
            if (jjVar.f7452c) {
                try {
                    jjVar.f7451b.f(nkVar);
                } catch (NullPointerException e) {
                    f9.k.C.f16817h.d("AdMobClearcutLogger.modify", e);
                }
            }
        }
        jjVar.b(1104);
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        this.f10211u.b(3);
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void w(boolean z3) {
        int i;
        if (true != z3) {
            i = 1106;
        } else {
            i = 1105;
        }
        this.f10211u.b(i);
    }

    @Override // com.google.android.gms.internal.ads.v60
    public final void x(g9.y1 y1Var) {
        int i = y1Var.f17714u;
        jj jjVar = this.f10211u;
        switch (i) {
            case 1:
                jjVar.b(FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS);
                return;
            case 2:
                jjVar.b(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH);
                return;
            case 3:
                jjVar.b(5);
                return;
            case 4:
                jjVar.b(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT);
                return;
            case 5:
                jjVar.b(FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                return;
            case 6:
                jjVar.b(FacebookMediationAdapter.ERROR_REQUIRES_UNIFIED_NATIVE_ADS);
                return;
            case 7:
                jjVar.b(FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE);
                return;
            default:
                jjVar.b(4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final synchronized void y() {
        this.f10211u.b(6);
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void z(boolean z3) {
        int i;
        if (true != z3) {
            i = 1108;
        } else {
            i = 1107;
        }
        this.f10211u.b(i);
    }
}
