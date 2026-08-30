package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;

import java.util.Map;

/* loaded from: classes.dex */
public final class tg0 implements ug0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f11342a;

    /* renamed from: b, reason: collision with root package name */
    public final wx f11343b;

    /* renamed from: c, reason: collision with root package name */
    public final z70 f11344c;

    public tg0(Map map, wx wxVar, z70 z70Var) {
        this.f11342a = map;
        this.f11343b = wxVar;
        this.f11344c = z70Var;
    }

    @Override // com.google.android.gms.internal.ads.ug0
    public final b a(dv dvVar) {
        this.f11344c.r(dvVar);
        z71 A = ed1.A(new cg0(3));
        for (String str : ((String) r.e.f17698c.a(sl.f10940s9)).split(",")) {
            wr1 wr1Var = (wr1) this.f11342a.get(str.trim());
            if (wr1Var != null) {
                A = ed1.U(A, cg0.class, new mr(wr1Var, 7, dvVar), this.f11343b);
            }
        }
        A.a(new t81(A, 0, new tf(25, this)), xx.f12657h);
        return A;
    }
}
