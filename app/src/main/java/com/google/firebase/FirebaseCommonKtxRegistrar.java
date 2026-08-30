package com.google.firebase;

import bc.h;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import hc.b;
import hc.c;
import hc.d;
import ic.a;
import ic.j;
import ic.r;
import java.util.List;
import java.util.concurrent.Executor;
import pf.v;
import qe.m;

/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        yh0 a10 = a.a(new r(hc.a.class, v.class));
        a10.a(new j(new r(hc.a.class, Executor.class), 1, 0));
        a10.f12883z = h.f3185v;
        a b10 = a10.b();
        yh0 a11 = a.a(new r(c.class, v.class));
        a11.a(new j(new r(c.class, Executor.class), 1, 0));
        a11.f12883z = h.f3186w;
        a b11 = a11.b();
        yh0 a12 = a.a(new r(b.class, v.class));
        a12.a(new j(new r(b.class, Executor.class), 1, 0));
        a12.f12883z = h.f3187x;
        a b12 = a12.b();
        yh0 a13 = a.a(new r(d.class, v.class));
        a13.a(new j(new r(d.class, Executor.class), 1, 0));
        a13.f12883z = h.f3188y;
        return m.h(b10, b11, b12, a13.b());
    }
}
