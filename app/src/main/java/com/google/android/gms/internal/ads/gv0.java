package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class gv0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6479a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f6480b;

    public gv0(Context context, Looper looper) {
        this.f6479a = context;
        this.f6480b = looper;
    }

    public final void a(String str) {
        lv0 z3 = mv0.z();
        Context context = this.f6479a;
        String packageName = context.getPackageName();
        z3.b();
        ((mv0) z3.f4845v).A(packageName);
        z3.b();
        ((mv0) z3.f4845v).C(2);
        jv0 z9 = kv0.z();
        z9.b();
        ((kv0) z9.f4845v).A(str);
        z9.b();
        ((kv0) z9.f4845v).B(2);
        z3.b();
        ((mv0) z3.f4845v).B((kv0) z9.c());
        is0 is0Var = new is0(context, this.f6480b, (mv0) z3.c());
        synchronized (is0Var.f7208y) {
            try {
                if (!is0Var.f7204u) {
                    is0Var.f7204u = true;
                    ((qv0) is0Var.f7206w).m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
