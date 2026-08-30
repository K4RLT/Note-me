package com.google.android.gms.internal.measurement;
import d.a;
import d.c;
import d.d;
import q1.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class b1 extends c1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f13646y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f13647z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, Activity activity, q0 q0Var) {
        super(e1Var.f13725u, true);
        this.f13646y = 3;
        this.A = activity;
        this.B = q0Var;
        this.f13647z = e1Var;
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public final void a() {
        p0 p0Var;
        boolean z3;
        Bundle bundle;
        switch (this.f13646y) {
            case 0:
                try {
                    fa.y.h((Context) this.A);
                    f1 f1Var = (f1) this.f13647z;
                    try {
                        p0Var = s0.asInterface(pa.d.c((Context) this.A, pa.d.f22622c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (pa.a e) {
                        f1Var.f(e, true, false);
                        p0Var = null;
                    }
                    f1Var.f13752h = p0Var;
                    if (((f1) this.f13647z).f13752h == null) {
                        Log.w(((f1) this.f13647z).f13746a, "Failed to connect to measurement client.");
                        return;
                    }
                    int a10 = pa.d.a((Context) this.A, ModuleDescriptor.MODULE_ID);
                    int d2 = pa.d.d((Context) this.A, ModuleDescriptor.MODULE_ID, false);
                    int max = Math.max(a10, d2);
                    if (d2 < a10) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    a1 a1Var = new a1(97001L, max, z3, null, null, null, (Bundle) this.B, eb.q1.b((Context) this.A));
                    p0 p0Var2 = ((f1) this.f13647z).f13752h;
                    fa.y.h(p0Var2);
                    p0Var2.initialize(new oa.b((Context) this.A), a1Var, this.f13668u);
                    return;
                } catch (Exception e8) {
                    ((f1) this.f13647z).f(e8, true, false);
                    return;
                }
            case 1:
                p0 p0Var3 = ((f1) this.f13647z).f13752h;
                fa.y.h(p0Var3);
                p0Var3.getMaxUserProperties((String) this.A, (q0) this.B);
                return;
            case 2:
                if (((Bundle) this.B) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.B).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.B).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                p0 p0Var4 = ((e1) this.f13647z).f13725u.f13752h;
                fa.y.h(p0Var4);
                p0Var4.onActivityCreated(new oa.b((Activity) this.A), bundle, this.f13669v);
                return;
            default:
                p0 p0Var5 = ((e1) this.f13647z).f13725u.f13752h;
                fa.y.h(p0Var5);
                p0Var5.onActivitySaveInstanceState(new oa.b((Activity) this.A), (q0) this.B, this.f13669v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.c1
    public void b() {
        switch (this.f13646y) {
            case 1:
                ((q0) this.B).k0(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(f1 f1Var, Object obj, Object obj2, int i) {
        super(f1Var, true);
        this.f13646y = i;
        this.A = obj;
        this.B = obj2;
        this.f13647z = f1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, Bundle bundle, Activity activity) {
        super(e1Var.f13725u, true);
        this.f13646y = 2;
        this.B = bundle;
        this.A = activity;
        this.f13647z = e1Var;
    }
}
