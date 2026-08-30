package com.google.firebase.remoteconfig;

import android.content.Context;
import bc.g;
import cc.c;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import dc.a;
import hd.e;
import ic.b;
import ic.j;
import ic.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import qd.h;
import ya.r9;

/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static h lambda$getComponents$0(r rVar, b bVar) {
        c cVar;
        Context context = (Context) bVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bVar.h(rVar);
        g gVar = (g) bVar.a(g.class);
        e eVar = (e) bVar.a(e.class);
        a aVar = (a) bVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f15829a.containsKey("frc")) {
                    aVar.f15829a.put("frc", new c(aVar.f15830b));
                }
                cVar = (c) aVar.f15829a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new h(context, scheduledExecutorService, gVar, eVar, cVar, bVar.e(fc.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ic.a> getComponents() {
        r rVar = new r(hc.b.class, ScheduledExecutorService.class);
        yh0 yh0Var = new yh0(h.class, new Class[]{td.a.class});
        yh0Var.f12878u = LIBRARY_NAME;
        yh0Var.a(j.b(Context.class));
        yh0Var.a(new j(rVar, 1, 0));
        yh0Var.a(j.b(g.class));
        yh0Var.a(j.b(e.class));
        yh0Var.a(j.b(a.class));
        yh0Var.a(new j(0, 1, fc.b.class));
        yh0Var.f12883z = new ed.b(rVar, 2);
        yh0Var.c(2);
        return Arrays.asList(yh0Var.b(), r9.a(LIBRARY_NAME, "22.0.0"));
    }
}
