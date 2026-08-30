package com.google.mlkit.common.internal;

import ce.d;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import de.f;
import de.g;
import de.k;
import ed.e;
import ee.b;
import g5.q;
import ic.a;
import ic.j;
import java.util.List;
import va.t;

/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a aVar = k.f15850b;
        yh0 b10 = a.b(b.class);
        b10.a(j.b(f.class));
        b10.f12883z = new e(1);
        a b11 = b10.b();
        yh0 b12 = a.b(g.class);
        b12.f12883z = new t(1);
        a b13 = b12.b();
        yh0 b14 = a.b(ce.e.class);
        b14.a(new j(2, 0, d.class));
        b14.f12883z = new de.b(2);
        a b15 = b14.b();
        yh0 b16 = a.b(de.d.class);
        b16.a(new j(1, 1, g.class));
        b16.f12883z = new e(2);
        a b17 = b16.b();
        yh0 b18 = a.b(de.a.class);
        b18.f12883z = new t(2);
        a b19 = b18.b();
        yh0 b20 = a.b(de.b.class);
        b20.a(j.b(de.a.class));
        b20.f12883z = new de.b(3);
        a b21 = b20.b();
        yh0 b22 = a.b(be.a.class);
        b22.a(j.b(f.class));
        b22.f12883z = new e(3);
        a b23 = b22.b();
        yh0 b24 = a.b(d.class);
        b24.f12880w = 1;
        b24.a(new j(1, 1, be.a.class));
        b24.f12883z = new t(3);
        Object[] objArr = {aVar, b11, b13, b15, b17, b19, b21, b23, b24.b()};
        for (int i = 0; i < 9; i++) {
            va.b bVar = va.d.f27477v;
            if (objArr[i] == null) {
                q.h(g3.a.g(i, "at index "));
                return null;
            }
        }
        va.b bVar2 = va.d.f27477v;
        return new va.g(objArr, 9);
    }
}
