package com.google.mlkit.vision.digitalink.recognition.internal;

import android.content.Context;
import android.util.Log;
import ce.d;
import com.google.android.gms.internal.ads.yh0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.h4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.firebase.components.ComponentRegistrar;
import eb.w;
import eb.x;
import eb.y;
import ic.a;
import ic.j;
import java.util.List;
import le.e;
import le.f;

/* loaded from: classes.dex */
public class DigitalInkRecognitionRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        Log.d("DIRecoRegistrar", "DigitalInkRecognitionRegistrar.getComponents()");
        yh0 b10 = a.b(ke.a.class);
        b10.a(j.b(Context.class));
        b10.f12883z = new y(27);
        a b11 = b10.b();
        yh0 b12 = a.b(d.class);
        b12.f12880w = 1;
        b12.a(new j(1, 1, ke.a.class));
        b12.f12883z = new w(28);
        a b13 = b12.b();
        yh0 b14 = a.b(le.d.class);
        b14.f12883z = new x(28);
        a b15 = b14.b();
        yh0 b16 = a.b(le.a.class);
        b16.a(j.b(le.d.class));
        b16.f12883z = new y(28);
        a b17 = b16.b();
        yh0 b18 = a.b(f.class);
        b18.a(j.b(ke.a.class));
        b18.a(j.b(le.d.class));
        b18.f12883z = new w(29);
        a b19 = b18.b();
        yh0 b20 = a.b(e.class);
        b20.a(j.b(f.class));
        b20.a(j.b(de.d.class));
        b20.f12883z = new x(29);
        a b21 = b20.b();
        e4 e4Var = h4.f14393v;
        Object[] objArr = {b11, b13, b15, b17, b19, b21};
        n5.g(objArr, 6);
        return h4.r(objArr, 6);
    }
}
