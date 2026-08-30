package com.google.firebase.datatransport;

import android.content.Context;
import com.google.android.gms.internal.ads.yh0;
import com.google.firebase.components.ComponentRegistrar;
import ic.b;
import ic.j;
import ic.r;
import java.util.Arrays;
import java.util.List;
import k8.f;
import l8.a;
import n8.q;
import vd.n;
import ya.r9;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ f lambda$getComponents$0(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f20020f);
    }

    public static /* synthetic */ f lambda$getComponents$1(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f20020f);
    }

    public static /* synthetic */ f lambda$getComponents$2(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ic.a> getComponents() {
        yh0 b10 = ic.a.b(f.class);
        b10.f12878u = LIBRARY_NAME;
        b10.a(j.b(Context.class));
        b10.f12883z = new n(6);
        ic.a b11 = b10.b();
        yh0 a10 = ic.a.a(new r(yc.a.class, f.class));
        a10.a(j.b(Context.class));
        a10.f12883z = new n(7);
        ic.a b12 = a10.b();
        yh0 a11 = ic.a.a(new r(yc.b.class, f.class));
        a11.a(j.b(Context.class));
        a11.f12883z = new n(8);
        return Arrays.asList(b11, b12, a11.b(), r9.a(LIBRARY_NAME, "19.0.0"));
    }
}
