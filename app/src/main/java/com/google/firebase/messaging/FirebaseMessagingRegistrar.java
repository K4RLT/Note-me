package com.google.firebase.messaging;

import bc.g;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import dd.c;
import fd.a;
import g5.q;
import hd.e;
import ic.b;
import ic.j;
import ic.r;
import java.util.Arrays;
import java.util.List;
import k8.f;
import ya.r9;

/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, b bVar) {
        g gVar = (g) bVar.a(g.class);
        if (bVar.a(a.class) == null) {
            return new FirebaseMessaging(gVar, bVar.e(pd.b.class), bVar.e(ed.g.class), (e) bVar.a(e.class), bVar.d(rVar), (c) bVar.a(c.class));
        }
        q.b();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ic.a> getComponents() {
        r rVar = new r(yc.b.class, f.class);
        yh0 b10 = ic.a.b(FirebaseMessaging.class);
        b10.f12878u = LIBRARY_NAME;
        b10.a(j.b(g.class));
        b10.a(new j(0, 0, a.class));
        b10.a(new j(0, 1, pd.b.class));
        b10.a(new j(0, 1, ed.g.class));
        b10.a(j.b(e.class));
        b10.a(new j(rVar, 0, 1));
        b10.a(j.b(c.class));
        b10.f12883z = new ed.b(rVar, 1);
        b10.c(1);
        return Arrays.asList(b10.b(), r9.a(LIBRARY_NAME, "24.0.0"));
    }
}
