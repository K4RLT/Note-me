package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class f10 {

    /* renamed from: a, reason: collision with root package name */
    public final c10 f5880a;

    /* renamed from: b, reason: collision with root package name */
    public final be0 f5881b;

    public f10(c10 c10Var, be0 be0Var) {
        this.f5880a = c10Var;
        this.f5881b = be0Var;
    }

    public final void a(Context context, l9.a aVar) {
        nl nlVar = sl.f11038yf;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (!((Boolean) qlVar.a(nlVar)).booleanValue()) {
            return;
        }
        AbstractExecutorService abstractExecutorService = xx.f12651a;
        if (((Boolean) qlVar2.a(sl.Af)).booleanValue()) {
            e10 e10Var = new e10(((Integer) qlVar2.a(sl.Cf)).intValue());
            int intValue = ((Integer) qlVar2.a(sl.Bf)).intValue();
            abstractExecutorService = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), e10Var);
        }
        abstractExecutorService.execute(new r1(5, this, context, aVar));
    }
}
