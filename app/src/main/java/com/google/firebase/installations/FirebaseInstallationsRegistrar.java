package com.google.firebase.installations;

import b1.h;
import bc.g;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import ed.f;
import g5.q;
import hc.a;
import hd.d;
import hd.e;
import ic.b;
import ic.j;
import ic.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jc.k;
import ya.r9;

/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static e lambda$getComponents$0(b bVar) {
        return new d((g) bVar.a(g.class), bVar.e(f.class), (ExecutorService) bVar.h(new r(a.class, ExecutorService.class)), new k((Executor) bVar.h(new r(hc.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ic.a> getComponents() {
        yh0 b10 = ic.a.b(e.class);
        b10.f12878u = LIBRARY_NAME;
        b10.a(j.b(g.class));
        b10.a(new j(0, 1, f.class));
        b10.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        b10.a(new j(new r(hc.b.class, Executor.class), 1, 0));
        b10.f12883z = new q(4);
        ic.a b11 = b10.b();
        ed.e eVar = new ed.e(0);
        yh0 b12 = ic.a.b(ed.e.class);
        b12.f12880w = 1;
        b12.f12883z = new h(10, eVar);
        return Arrays.asList(b11, b12.b(), r9.a(LIBRARY_NAME, "18.0.0"));
    }
}
