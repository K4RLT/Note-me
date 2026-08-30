package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ey0 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5859a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final tr1 f5860b;

    /* renamed from: c, reason: collision with root package name */
    public final rr1 f5861c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5862d;

    public ey0(rr1 rr1Var, rr1 rr1Var2, tr1 tr1Var) {
        this.f5861c = rr1Var;
        this.f5862d = rr1Var2;
        this.f5860b = tr1Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        dy0 dy0Var;
        switch (this.f5859a) {
            case 0:
                rr1 rr1Var = (rr1) this.f5862d;
                pr1 b10 = rr1.b(this.f5861c);
                pr1 b11 = rr1.b(rr1Var);
                if (((rx0) this.f5860b.f11431a).h0()) {
                    dy0Var = (dy0) b10.zzb();
                } else {
                    dy0Var = (dy0) b11.zzb();
                }
                lo1.b(dy0Var);
                return dy0Var;
            default:
                Context context = (Context) this.f5860b.f11431a;
                return new f21(context, (ExecutorService) ((tr1) this.f5862d).f11431a, f21.f5892g);
        }
    }

    public ey0(tr1 tr1Var, rr1 rr1Var, tr1 tr1Var2) {
        this.f5860b = tr1Var;
        this.f5861c = rr1Var;
        this.f5862d = tr1Var2;
    }
}
