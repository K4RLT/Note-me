package com.google.android.gms.internal.ads;
import c5.a;
import e5.a;
import a.a;
import ac.b;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ju0 implements r31 {

    /* renamed from: v, reason: collision with root package name */
    public static final ju0 f7542v = new Object();

    /* renamed from: u, reason: collision with root package name */
    public Context f7543u;

    public /* synthetic */ ju0(Context context) {
        this.f7543u = context;
    }

    public ac.b a(boolean z3) {
        try {
            e5.a aVar = new e5.a(z3);
            c5.a a10 = c5.a.a(this.f7543u);
            if (a10 != null) {
                return a10.b(aVar);
            }
            return ed1.A(new IllegalStateException());
        } catch (Exception e) {
            return ed1.A(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.r31
    public Object zza() {
        int i = os1.A;
        new k2();
        Context context = this.f7543u;
        new q5(6);
        context.getApplicationContext();
        Object obj = new Object();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.clear();
        hashMap2.clear();
        return obj;
    }
}
