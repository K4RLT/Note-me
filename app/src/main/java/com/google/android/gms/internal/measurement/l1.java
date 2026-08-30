package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class l1 extends c1 {
    public final /* synthetic */ f1 A;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13831y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f13832z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(f1 f1Var, String str, int i) {
        super(f1Var, true);
        this.f13831y = i;
        this.f13832z = str;
        this.A = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        switch (this.f13831y) {
            case 0:
                p0 p0Var = this.A.f13752h;
                fa.y.h(p0Var);
                p0Var.endAdUnitExposure(this.f13832z, this.f13669v);
                return;
            default:
                p0 p0Var2 = this.A.f13752h;
                fa.y.h(p0Var2);
                p0Var2.beginAdUnitExposure(this.f13832z, this.f13669v);
                return;
        }
    }
}
