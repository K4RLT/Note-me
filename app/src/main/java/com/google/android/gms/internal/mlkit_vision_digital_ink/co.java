package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ra.e;

/* loaded from: classes.dex */
public final class co {

    /* renamed from: a, reason: collision with root package name */
    public final ra.e f14163a;

    public co(gp gpVar, gp gpVar2, Object obj) {
        this.f14163a = new ra.e(20, gpVar, gpVar2, obj);
    }

    public static int a(ra.e eVar, Object obj, Object obj2) {
        gp gpVar = (gp) eVar.f24675v;
        gp gpVar2 = (gp) eVar.f24676w;
        return dn.a(gpVar2, 2, obj2) + dn.a(gpVar, 1, obj);
    }

    public static void c(ym ymVar, ra.e eVar, Object obj, Object obj2) {
        dn.f(ymVar, (gp) eVar.f24675v, 1, obj);
        dn.f(ymVar, (gp) eVar.f24676w, 2, obj2);
    }

    public final ra.e b() {
        return this.f14163a;
    }
}
