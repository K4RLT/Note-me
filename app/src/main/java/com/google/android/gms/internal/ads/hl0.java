package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hl0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6835a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6836b;

    public /* synthetic */ hl0(int i, Object obj) {
        this.f6835a = i;
        this.f6836b = obj;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        boolean z3;
        switch (this.f6835a) {
            case 0:
                if (wa.u6.a((Context) this.f6836b, "com.google.android.gms.permission.AD_ID") == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return ed1.e(new il0(0, z3));
            case 1:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) this.f6836b).iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return ed1.e(new ul0(0, arrayList));
            case 2:
                return ed1.e(new il0(1, ((aq0) this.f6836b).f4592q));
            case 3:
                qo0 qo0Var = (qo0) this.f6836b;
                String str = null;
                if (qo0Var == null) {
                    return ed1.e(new ql0(str, 2));
                }
                String str2 = qo0Var.f9916a;
                if (la.c.a(str2)) {
                    return ed1.e(new ql0(str, 2));
                }
                return ed1.e(new ql0(str2, 2));
            case 4:
                return ed1.e(new cn0(0, (pp0) this.f6836b));
            case 5:
                return ed1.e(new wl0(2, (Bundle) this.f6836b));
            case 6:
                return ed1.e(new ql0((String) this.f6836b, 4));
            default:
                return ed1.d0(ed1.Y(ed1.e(new Bundle()), ((Long) g9.r.e.f17698c.a(sl.f10696d5)).longValue(), TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f6836b), i6.f7010o, xx.f12651a);
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f6835a) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 58;
            case 3:
                return 15;
            case 4:
                return 25;
            case 5:
                return 30;
            case 6:
                return 31;
            default:
                return 49;
        }
    }
}
