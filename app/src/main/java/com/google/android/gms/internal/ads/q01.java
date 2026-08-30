package com.google.android.gms.internal.ads;
import ib.o;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class q01 extends cv0 {

    /* renamed from: f, reason: collision with root package name */
    public final ry0 f9699f;

    public q01(Context context, ExecutorService executorService, ry0 ry0Var) {
        super(context, executorService, new o(), false);
        this.f9699f = ry0Var;
    }

    @Override // com.google.android.gms.internal.ads.cv0
    public final void b(int i, long j10) {
        this.f9699f.a(i, j10, null, null);
        new o().p(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.cv0
    public final void c(int i, long j10, Exception exc) {
        this.f9699f.a(i, j10, exc, null);
        new o().p(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.cv0
    public final void d(int i, String str) {
        this.f9699f.a(i, -1L, null, str);
        new o().p(Boolean.TRUE);
    }
}
