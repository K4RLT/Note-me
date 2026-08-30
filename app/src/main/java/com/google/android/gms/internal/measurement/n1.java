package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* loaded from: classes.dex */
public final class n1 extends c1 {
    public final /* synthetic */ e1 A;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13856y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Activity f13857z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(e1 e1Var, Activity activity, int i) {
        super(e1Var.f13725u, true);
        this.f13856y = i;
        switch (i) {
            case 1:
                this.f13857z = activity;
                this.A = e1Var;
                super(e1Var.f13725u, true);
                return;
            case 2:
                this.f13857z = activity;
                this.A = e1Var;
                super(e1Var.f13725u, true);
                return;
            case 3:
                this.f13857z = activity;
                this.A = e1Var;
                super(e1Var.f13725u, true);
                return;
            case 4:
                this.f13857z = activity;
                this.A = e1Var;
                super(e1Var.f13725u, true);
                return;
            default:
                this.f13857z = activity;
                this.A = e1Var;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        switch (this.f13856y) {
            case 0:
                p0 p0Var = this.A.f13725u.f13752h;
                fa.y.h(p0Var);
                p0Var.onActivityResumed(new oa.b(this.f13857z), this.f13669v);
                return;
            case 1:
                p0 p0Var2 = this.A.f13725u.f13752h;
                fa.y.h(p0Var2);
                p0Var2.onActivityStarted(new oa.b(this.f13857z), this.f13669v);
                return;
            case 2:
                p0 p0Var3 = this.A.f13725u.f13752h;
                fa.y.h(p0Var3);
                p0Var3.onActivityStopped(new oa.b(this.f13857z), this.f13669v);
                return;
            case 3:
                p0 p0Var4 = this.A.f13725u.f13752h;
                fa.y.h(p0Var4);
                p0Var4.onActivityPaused(new oa.b(this.f13857z), this.f13669v);
                return;
            default:
                p0 p0Var5 = this.A.f13725u.f13752h;
                fa.y.h(p0Var5);
                p0Var5.onActivityDestroyed(new oa.b(this.f13857z), this.f13669v);
                return;
        }
    }
}
