package com.google.firebase;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.protobuf.s1;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import ed.d;
import ed.e;
import ed.f;
import ed.g;
import ic.a;
import ic.j;
import ic.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import pd.b;
import ya.r9;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        yh0 b10 = a.b(b.class);
        b10.a(new j(2, 0, pd.a.class));
        b10.f12883z = new l4.a(26);
        arrayList.add(b10.b());
        r rVar = new r(hc.a.class, Executor.class);
        yh0 yh0Var = new yh0(d.class, new Class[]{f.class, g.class});
        yh0Var.a(j.b(Context.class));
        yh0Var.a(j.b(bc.g.class));
        yh0Var.a(new j(2, 0, e.class));
        yh0Var.a(new j(1, 1, b.class));
        yh0Var.a(new j(rVar, 1, 0));
        yh0Var.f12883z = new ed.b(rVar, 0);
        arrayList.add(yh0Var.b());
        arrayList.add(r9.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(r9.a("fire-core", "21.0.0"));
        arrayList.add(r9.a("device-name", a(Build.PRODUCT)));
        arrayList.add(r9.a("device-model", a(Build.DEVICE)));
        arrayList.add(r9.a("device-brand", a(Build.BRAND)));
        arrayList.add(r9.b("android-target-sdk", new s1(10)));
        arrayList.add(r9.b("android-min-sdk", new s1(11)));
        arrayList.add(r9.b("android-platform", new s1(12)));
        arrayList.add(r9.b("android-installer", new s1(13)));
        try {
            pe.f.f22688v.getClass();
            str = "2.3.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(r9.a("kotlin", str));
        }
        return arrayList;
    }
}
