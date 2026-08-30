package com.google.firebase.crashlytics;

import android.util.Log;
import bc.g;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import g5.q;
import hd.e;
import ic.j;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lc.b;
import wd.a;
import wd.c;
import wd.d;
import ya.r9;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15592a = 0;

    static {
        Map map = c.f29889b;
        d dVar = d.f29890u;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new a(new yf.c(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        yh0 b10 = ic.a.b(kc.c.class);
        b10.f12878u = "fire-cls";
        b10.a(j.b(g.class));
        b10.a(j.b(e.class));
        b10.a(new j(0, 2, b.class));
        b10.a(new j(0, 2, fc.b.class));
        b10.a(new j(0, 2, td.a.class));
        b10.f12883z = new q(this);
        b10.c(2);
        return Arrays.asList(b10.b(), r9.a("fire-cls", "19.0.3"));
    }
}
