package com.google.firebase.sessions;

import android.content.Context;
import bc.g;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import hc.a;
import hc.b;
import hd.e;
import ic.j;
import ic.r;
import java.util.List;
import k8.f;
import pf.v;
import q.x;
import qe.m;
import u.c;
import vd.d0;
import vd.f0;
import vd.h0;
import vd.l;
import vd.l0;
import vd.m0;
import vd.n;
import vd.o;
import vd.u;
import vd.z;
import ya.r9;

/* loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final o Companion = new Object();
    private static final r firebaseApp = r.a(g.class);
    private static final r firebaseInstallationsApi = r.a(e.class);
    private static final r backgroundDispatcher = new r(a.class, v.class);
    private static final r blockingDispatcher = new r(b.class, v.class);
    private static final r transportFactory = r.a(f.class);
    private static final r sessionsSettings = r.a(xd.g.class);
    private static final r sessionLifecycleServiceBinder = r.a(l0.class);

    public static final l getComponents$lambda$0(ic.b bVar) {
        Object h3 = bVar.h(firebaseApp);
        h3.getClass();
        Object h10 = bVar.h(sessionsSettings);
        h10.getClass();
        Object h11 = bVar.h(backgroundDispatcher);
        h11.getClass();
        Object h12 = bVar.h(sessionLifecycleServiceBinder);
        h12.getClass();
        return new l((g) h3, (xd.g) h10, (te.g) h11, (l0) h12);
    }

    public static final h0 getComponents$lambda$1(ic.b bVar) {
        return new h0();
    }

    public static final d0 getComponents$lambda$2(ic.b bVar) {
        Object h3 = bVar.h(firebaseApp);
        h3.getClass();
        Object h10 = bVar.h(firebaseInstallationsApi);
        h10.getClass();
        Object h11 = bVar.h(sessionsSettings);
        h11.getClass();
        gd.b d2 = bVar.d(transportFactory);
        d2.getClass();
        c cVar = new c(8, d2);
        Object h12 = bVar.h(backgroundDispatcher);
        h12.getClass();
        return new f0((g) h3, (e) h10, (xd.g) h11, cVar, (te.g) h12);
    }

    public static final xd.g getComponents$lambda$3(ic.b bVar) {
        Object h3 = bVar.h(firebaseApp);
        h3.getClass();
        Object h10 = bVar.h(blockingDispatcher);
        h10.getClass();
        Object h11 = bVar.h(backgroundDispatcher);
        h11.getClass();
        Object h12 = bVar.h(firebaseInstallationsApi);
        h12.getClass();
        return new xd.g((g) h3, (te.g) h10, (te.g) h11, (e) h12);
    }

    public static final u getComponents$lambda$4(ic.b bVar) {
        g gVar = (g) bVar.h(firebaseApp);
        gVar.a();
        Context context = gVar.f3177a;
        context.getClass();
        Object h3 = bVar.h(backgroundDispatcher);
        h3.getClass();
        return new z(context, (te.g) h3);
    }

    public static final l0 getComponents$lambda$5(ic.b bVar) {
        Object h3 = bVar.h(firebaseApp);
        h3.getClass();
        return new m0((g) h3);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ic.a> getComponents() {
        yh0 b10 = ic.a.b(l.class);
        b10.f12878u = LIBRARY_NAME;
        r rVar = firebaseApp;
        b10.a(j.a(rVar));
        r rVar2 = sessionsSettings;
        b10.a(j.a(rVar2));
        r rVar3 = backgroundDispatcher;
        b10.a(j.a(rVar3));
        b10.a(j.a(sessionLifecycleServiceBinder));
        b10.f12883z = new x(27);
        b10.c(2);
        ic.a b11 = b10.b();
        yh0 b12 = ic.a.b(h0.class);
        b12.f12878u = "session-generator";
        b12.f12883z = new x(28);
        ic.a b13 = b12.b();
        yh0 b14 = ic.a.b(d0.class);
        b14.f12878u = "session-publisher";
        b14.a(new j(rVar, 1, 0));
        r rVar4 = firebaseInstallationsApi;
        b14.a(j.a(rVar4));
        b14.a(new j(rVar2, 1, 0));
        b14.a(new j(transportFactory, 1, 1));
        b14.a(new j(rVar3, 1, 0));
        b14.f12883z = new x(29);
        ic.a b15 = b14.b();
        yh0 b16 = ic.a.b(xd.g.class);
        b16.f12878u = "sessions-settings";
        b16.a(new j(rVar, 1, 0));
        b16.a(j.a(blockingDispatcher));
        b16.a(new j(rVar3, 1, 0));
        b16.a(new j(rVar4, 1, 0));
        b16.f12883z = new n(0);
        ic.a b17 = b16.b();
        yh0 b18 = ic.a.b(u.class);
        b18.f12878u = "sessions-datastore";
        b18.a(new j(rVar, 1, 0));
        b18.a(new j(rVar3, 1, 0));
        b18.f12883z = new n(1);
        ic.a b19 = b18.b();
        yh0 b20 = ic.a.b(l0.class);
        b20.f12878u = "sessions-service-binder";
        b20.a(new j(rVar, 1, 0));
        b20.f12883z = new n(2);
        return m.h(b11, b13, b15, b17, b19, b20.b(), r9.a(LIBRARY_NAME, "2.0.3"));
    }
}
