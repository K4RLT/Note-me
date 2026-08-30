package com.google.mlkit.vision.segmentation.subject.internal;

import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import de.f;
import ic.a;
import ic.j;
import java.util.List;
import ne.b;
import ne.d;
import ya.g;
import ya.i;
import ya.ke;

/* loaded from: classes.dex */
public class SubjectSegmentationRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        yh0 b10 = a.b(d.class);
        b10.a(j.b(f.class));
        b10.f12883z = ne.a.f21312v;
        a b11 = b10.b();
        yh0 b12 = a.b(b.class);
        b12.a(j.b(d.class));
        b12.a(j.b(de.d.class));
        b12.f12883z = ne.a.f21313w;
        a b13 = b12.b();
        g gVar = i.f31327v;
        Object[] objArr = {b11, b13};
        ke.a(objArr, 2);
        return i.n(objArr, 2);
    }
}
