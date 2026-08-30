package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class ba0 implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4745u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4746v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f4747w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f4748x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f4749y;

    public /* synthetic */ ba0(ca0 ca0Var, xs0 xs0Var, ic.c cVar, ur0 ur0Var) {
        this.f4746v = new WeakReference(ca0Var);
        this.f4747w = xs0Var;
        this.f4748x = cVar;
        this.f4749y = ur0Var;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        int i = this.f4745u;
        Object obj2 = this.f4748x;
        Object obj3 = this.f4747w;
        Object obj4 = this.f4749y;
        Object obj5 = this.f4746v;
        switch (i) {
            case 0:
                ca0 ca0Var = (ca0) ((WeakReference) obj5).get();
                String str = (String) map.get("u");
                if (ca0Var != null && !TextUtils.isEmpty(str)) {
                    ((xs0) obj3).b(str, (ic.c) obj2, (ur0) obj4, ca0Var.X);
                    return;
                }
                return;
            case 1:
                Object obj6 = ((WeakReference) obj5).get();
                if (obj6 == null) {
                    ((rc0) obj4).c((String) obj3, this);
                    return;
                } else {
                    ((mp) obj2).d(obj6, map);
                    return;
                }
            default:
                h00 h00Var = (h00) obj;
                lp.b(map, (f90) obj5);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    int i10 = k9.a0.f19634b;
                    l9.i.f("URL missing from click GMSG.");
                    return;
                }
                g30 g30Var = (g30) obj2;
                ac.b a10 = lp.a(h00Var, str2);
                tw twVar = new tw(h00Var, g30Var, (xs0) obj3, (rh0) obj4, 23);
                a10.a(new t81(a10, 0, twVar), xx.f12651a);
                return;
        }
    }

    public /* synthetic */ ba0(f90 f90Var, g30 g30Var, xs0 xs0Var, rh0 rh0Var) {
        this.f4746v = f90Var;
        this.f4748x = g30Var;
        this.f4747w = xs0Var;
        this.f4749y = rh0Var;
    }

    public /* synthetic */ ba0(rc0 rc0Var, WeakReference weakReference, String str, mp mpVar) {
        this.f4749y = rc0Var;
        this.f4746v = weakReference;
        this.f4747w = str;
        this.f4748x = mpVar;
    }
}
