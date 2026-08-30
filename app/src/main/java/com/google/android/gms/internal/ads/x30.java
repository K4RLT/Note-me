package com.google.android.gms.internal.ads;
import a0.l;
import k9.a0;
import la.a;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x30 implements ai {

    /* renamed from: u, reason: collision with root package name */
    public h00 f12457u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f12458v;

    /* renamed from: w, reason: collision with root package name */
    public final r30 f12459w;

    /* renamed from: x, reason: collision with root package name */
    public final la.a f12460x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f12461y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f12462z = false;
    public final t30 A = new t30();

    public x30(Executor executor, r30 r30Var, la.a aVar) {
        this.f12458v = executor;
        this.f12459w = r30Var;
        this.f12460x = aVar;
    }

    public final void a() {
        try {
            JSONObject r8 = this.f12459w.r(this.A);
            if (this.f12457u != null) {
                this.f12458v.execute(new com.google.android.gms.internal.mlkit_vision_digital_ink.ra(this, 14, r8));
            }
        } catch (JSONException e) {
            k9.a0.l("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final void k(zh zhVar) {
        boolean z3;
        if (this.f12462z) {
            z3 = false;
        } else {
            z3 = zhVar.f13171j;
        }
        t30 t30Var = this.A;
        t30Var.f11233a = z3;
        this.f12460x.getClass();
        t30Var.f11235c = SystemClock.elapsedRealtime();
        t30Var.e = zhVar;
        if (this.f12461y) {
            a();
        }
    }
}
