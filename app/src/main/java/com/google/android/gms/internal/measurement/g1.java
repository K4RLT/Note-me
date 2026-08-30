package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class g1 extends c1 {
    public final /* synthetic */ Object A;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13757y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1 f13758z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(f1 f1Var, Exception exc) {
        super(f1Var, false);
        this.f13757y = 2;
        this.A = exc;
        this.f13758z = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        switch (this.f13757y) {
            case 0:
                p0 p0Var = this.f13758z.f13752h;
                fa.y.h(p0Var);
                p0Var.setConditionalUserProperty((Bundle) this.A, this.f13668u);
                return;
            case 1:
                p0 p0Var2 = this.f13758z.f13752h;
                fa.y.h(p0Var2);
                p0Var2.setMeasurementEnabled(((Boolean) this.A).booleanValue(), this.f13668u);
                return;
            case 2:
                p0 p0Var3 = this.f13758z.f13752h;
                fa.y.h(p0Var3);
                p0Var3.logHealthData(5, "Error with data collection. Data lost.", new oa.b((Exception) this.A), new oa.b(null), new oa.b(null));
                return;
            default:
                p0 p0Var4 = this.f13758z.f13752h;
                fa.y.h(p0Var4);
                p0Var4.registerOnMeasurementEventListener((d1) this.A);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(f1 f1Var, Object obj, int i) {
        super(f1Var, true);
        this.f13757y = i;
        this.A = obj;
        this.f13758z = f1Var;
    }
}
