package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class n81 extends e81 {
    public m81 J;

    @Override // com.google.android.gms.internal.ads.r71
    public final void m() {
        m81 m81Var = this.J;
        if (m81Var != null) {
            m81Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final void t(int i) {
        this.F = null;
        if (i == 1) {
            this.J = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final void y(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final void z() {
        m81 m81Var = this.J;
        if (m81Var != null) {
            try {
                m81Var.f8273w.execute(m81Var);
            } catch (RejectedExecutionException e) {
                m81Var.f8274x.e(e);
            }
        }
    }
}
