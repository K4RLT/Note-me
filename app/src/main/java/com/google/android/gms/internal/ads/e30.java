package com.google.android.gms.internal.ads;
import k9.a0;
import l9.i;
import oa.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class e30 implements c70 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5586u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f5587v;

    public /* synthetic */ e30(int i, Object obj) {
        this.f5586u = i;
        this.f5587v = obj;
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void c(Context context) {
        int i = this.f5586u;
        Object obj = this.f5587v;
        switch (i) {
            case 0:
                try {
                    try {
                        ((iq0) obj).f7192a.g();
                        return;
                    } catch (Throwable th) {
                        throw new Exception(th);
                    }
                } catch (dq0 e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.g("Cannot invoke onDestroy for the mediation adapter.", e);
                    return;
                }
            default:
                h00 h00Var = (h00) obj;
                if (h00Var != null) {
                    h00Var.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void o(Context context) {
        int i = this.f5586u;
        Object obj = this.f5587v;
        switch (i) {
            case 0:
                try {
                    try {
                        ((iq0) obj).f7192a.h();
                        return;
                    } catch (Throwable th) {
                        throw new Exception(th);
                    }
                } catch (dq0 e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.g("Cannot invoke onPause for the mediation adapter.", e);
                    return;
                }
            default:
                h00 h00Var = (h00) obj;
                if (h00Var != null) {
                    h00Var.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final void w(Context context) {
        Exception exc;
        int i = this.f5586u;
        Object obj = this.f5587v;
        switch (i) {
            case 0:
                try {
                    try {
                        xr xrVar = ((iq0) obj).f7192a;
                        xrVar.t3();
                        if (context != null) {
                            try {
                                xrVar.V(new oa.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (dq0 e) {
                    int i10 = k9.a0.f19634b;
                    l9.i.g("Cannot invoke onResume for the mediation adapter.", e);
                    return;
                }
            default:
                h00 h00Var = (h00) obj;
                if (h00Var != null) {
                    h00Var.onResume();
                    return;
                }
                return;
        }
    }
}
