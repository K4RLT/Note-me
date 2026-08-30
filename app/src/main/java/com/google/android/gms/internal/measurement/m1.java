package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class m1 extends c1 {
    public final /* synthetic */ f1 A;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13843y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ q0 f13844z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(f1 f1Var, q0 q0Var, int i) {
        super(f1Var, true);
        this.f13843y = i;
        this.f13844z = q0Var;
        this.A = f1Var;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        switch (this.f13843y) {
            case 0:
                p0 p0Var = this.A.f13752h;
                fa.y.h(p0Var);
                p0Var.getCachedAppInstanceId(this.f13844z);
                return;
            case 1:
                p0 p0Var2 = this.A.f13752h;
                fa.y.h(p0Var2);
                p0Var2.getGmpAppId(this.f13844z);
                return;
            case 2:
                p0 p0Var3 = this.A.f13752h;
                fa.y.h(p0Var3);
                p0Var3.getCurrentScreenName(this.f13844z);
                return;
            case 3:
                p0 p0Var4 = this.A.f13752h;
                fa.y.h(p0Var4);
                p0Var4.generateEventId(this.f13844z);
                return;
            default:
                p0 p0Var5 = this.A.f13752h;
                fa.y.h(p0Var5);
                p0Var5.getCurrentScreenClass(this.f13844z);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void b() {
        switch (this.f13843y) {
            case 0:
                this.f13844z.k0(null);
                return;
            case 1:
                this.f13844z.k0(null);
                return;
            case 2:
                this.f13844z.k0(null);
                return;
            case 3:
                this.f13844z.k0(null);
                return;
            default:
                this.f13844z.k0(null);
                return;
        }
    }
}
