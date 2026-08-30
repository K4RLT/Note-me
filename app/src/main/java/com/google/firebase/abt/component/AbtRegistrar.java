package com.google.firebase.abt.component;

import android.content.Context;
import androidx.datastore.preferences.protobuf.s1;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import dc.a;
import ic.b;
import ic.j;
import java.util.Arrays;
import java.util.List;
import ya.r9;

/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.a(Context.class), bVar.e(fc.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ic.a> getComponents() {
        yh0 b10 = ic.a.b(a.class);
        b10.f12878u = LIBRARY_NAME;
        b10.a(j.b(Context.class));
        b10.a(new j(0, 1, fc.b.class));
        b10.f12883z = new s1(28);
        return Arrays.asList(b10.b(), r9.a(LIBRARY_NAME, "21.1.1"));
    }
}
