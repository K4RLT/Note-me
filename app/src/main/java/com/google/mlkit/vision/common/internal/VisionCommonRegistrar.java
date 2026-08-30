package com.google.mlkit.vision.common.internal;

import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import g5.q;
import ge.b;
import ge.c;
import ic.a;
import ic.j;
import java.util.List;
import wa.oa;
import wa.qa;
import wa.sa;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        yh0 b10 = a.b(c.class);
        b10.a(new j(2, 0, b.class));
        b10.f12883z = c.f17751w;
        Object[] objArr = {b10.b()};
        for (int i = 0; i < 1; i++) {
            oa oaVar = qa.f29797v;
            if (objArr[i] == null) {
                q.h(g3.a.g(i, "at index "));
                return null;
            }
        }
        oa oaVar2 = qa.f29797v;
        return new sa(objArr, 1);
    }
}
