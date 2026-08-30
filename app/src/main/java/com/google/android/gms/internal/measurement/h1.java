package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class h1 extends c1 {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ f1 C;
    public final /* synthetic */ Object D;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13767y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f13768z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(f1 f1Var, String str, String str2, boolean z3, q0 q0Var) {
        super(f1Var, true);
        this.f13767y = 1;
        this.f13768z = str;
        this.A = str2;
        this.B = z3;
        this.D = q0Var;
        this.C = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        switch (this.f13767y) {
            case 0:
                p0 p0Var = this.C.f13752h;
                fa.y.h(p0Var);
                p0Var.setUserProperty(this.f13768z, this.A, new oa.b(this.D), this.B, this.f13668u);
                return;
            case 1:
                p0 p0Var2 = this.C.f13752h;
                fa.y.h(p0Var2);
                p0Var2.getUserProperties(this.f13768z, this.A, this.B, (q0) this.D);
                return;
            default:
                long j10 = this.f13668u;
                p0 p0Var3 = this.C.f13752h;
                fa.y.h(p0Var3);
                p0Var3.logEvent(this.f13768z, this.A, (Bundle) this.D, this.B, true, j10);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public void b() {
        switch (this.f13767y) {
            case 1:
                ((q0) this.D).k0(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(f1 f1Var, String str, String str2, Object obj, boolean z3, int i) {
        super(f1Var, true);
        this.f13767y = i;
        this.f13768z = str;
        this.A = str2;
        this.D = obj;
        this.B = z3;
        this.C = f1Var;
    }
}
