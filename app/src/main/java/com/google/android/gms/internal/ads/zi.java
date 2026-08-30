package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zi implements ii {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13173u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13174v;

    public zi(k60 k60Var) {
        Objects.requireNonNull(k60Var);
        this.f13174v = k60Var;
    }

    @Override // com.google.android.gms.internal.ads.ii
    public final void g0(boolean z3) {
        switch (this.f13173u) {
            case 0:
                k60 k60Var = (k60) this.f13174v;
                if (z3) {
                    k60Var.n();
                    return;
                } else {
                    k60Var.h();
                    return;
                }
            case 1:
                if (((Boolean) g9.r.e.f17698c.a(sl.D)).booleanValue()) {
                    ((ct0) this.f13174v).a(z3);
                    return;
                }
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.D)).booleanValue()) {
                    ((it0) this.f13174v).c(z3);
                    return;
                }
                return;
        }
    }

    public zi(ct0 ct0Var) {
        Objects.requireNonNull(ct0Var);
        this.f13174v = ct0Var;
    }

    public zi(it0 it0Var) {
        Objects.requireNonNull(it0Var);
        this.f13174v = it0Var;
    }
}
