package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class be0 {

    /* renamed from: a, reason: collision with root package name */
    public final fe0 f4770a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4771b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4772c;

    public be0(fe0 fe0Var, wx wxVar) {
        this.f4770a = fe0Var;
        fe0Var.getClass();
        this.f4772c = new HashMap(fe0Var.f6045a);
        this.f4771b = wxVar;
    }

    public final j6.s a() {
        j6.s sVar = new j6.s(this);
        ((ConcurrentHashMap) sVar.f18981v).putAll(this.f4772c);
        return sVar;
    }

    public final void b() {
        if (!((Boolean) g9.r.e.f17698c.a(sl.f10672bd)).booleanValue()) {
            return;
        }
        j6.s a10 = a();
        a10.k("action", "pecr");
        a10.l();
    }
}
