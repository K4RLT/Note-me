package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class i1 extends c1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ f1 B;
    public final /* synthetic */ Object C;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13774y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f13775z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(f1 f1Var, Activity activity, String str, String str2) {
        super(f1Var, true);
        this.f13774y = 2;
        this.C = activity;
        this.f13775z = str;
        this.A = str2;
        this.B = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        switch (this.f13774y) {
            case 0:
                p0 p0Var = this.B.f13752h;
                fa.y.h(p0Var);
                p0Var.getConditionalUserProperties(this.f13775z, this.A, (q0) this.C);
                return;
            case 1:
                p0 p0Var2 = this.B.f13752h;
                fa.y.h(p0Var2);
                p0Var2.clearConditionalUserProperty(this.f13775z, this.A, (Bundle) this.C);
                return;
            default:
                p0 p0Var3 = this.B.f13752h;
                fa.y.h(p0Var3);
                p0Var3.setCurrentScreen(new oa.b((Activity) this.C), this.f13775z, this.A, this.f13668u);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public void b() {
        switch (this.f13774y) {
            case 0:
                ((q0) this.C).k0(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(f1 f1Var, String str, String str2, Object obj, int i) {
        super(f1Var, true);
        this.f13774y = i;
        this.f13775z = str;
        this.A = str2;
        this.C = obj;
        this.B = f1Var;
    }
}
