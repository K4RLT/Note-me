package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import bc.g;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.measurement.f1;
import com.google.firebase.components.ComponentRegistrar;
import dd.c;
import eb.w;
import fa.y;
import fc.b;
import fc.d;
import ic.a;
import ic.j;
import ic.l;
import java.util.Arrays;
import java.util.List;
import ya.r9;

/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static b lambda$getComponents$0(ic.b bVar) {
        g gVar = (g) bVar.a(g.class);
        Context context = (Context) bVar.a(Context.class);
        c cVar = (c) bVar.a(c.class);
        y.h(gVar);
        y.h(context);
        y.h(cVar);
        y.h(context.getApplicationContext());
        if (fc.c.f16948c == null) {
            synchronized (fc.c.class) {
                try {
                    if (fc.c.f16948c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f3178b)) {
                            ((l) cVar).a(new d(0), new eb.y(21));
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        fc.c.f16948c = new fc.c(f1.b(context, bundle).f13749d);
                    }
                } finally {
                }
            }
        }
        return fc.c.f16948c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        yh0 b10 = a.b(b.class);
        b10.a(j.b(g.class));
        b10.a(j.b(Context.class));
        b10.a(j.b(c.class));
        b10.f12883z = new w(22);
        b10.c(2);
        return Arrays.asList(b10.b(), r9.a("fire-analytics", "22.0.2"));
    }
}
