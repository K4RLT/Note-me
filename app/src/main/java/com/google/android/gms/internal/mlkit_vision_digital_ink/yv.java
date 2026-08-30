package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yv implements uq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15312u;

    /* renamed from: v, reason: collision with root package name */
    public final s5 f15313v;

    /* renamed from: w, reason: collision with root package name */
    public final tq f15314w;

    /* renamed from: x, reason: collision with root package name */
    public final tq f15315x;

    /* renamed from: y, reason: collision with root package name */
    public final tq f15316y;

    /* renamed from: z, reason: collision with root package name */
    public final tq f15317z;

    public /* synthetic */ yv(s5 s5Var, tq tqVar, tq tqVar2, tq tqVar3, tq tqVar4, int i) {
        this.f15312u = i;
        this.f15313v = s5Var;
        this.f15314w = tqVar;
        this.f15315x = tqVar2;
        this.f15316y = tqVar3;
        this.f15317z = tqVar4;
    }

    public xv a() {
        Context e = this.f15313v.e();
        return new xv(e, (q2) this.f15316y.c(), (Executor) this.f15317z.c());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.f15312u) {
            case 0:
                return a();
            case 1:
                return new pv(this.f15313v.e(), (kw) this.f15314w.c(), (s0) this.f15315x.c(), (Executor) this.f15316y.c(), (ss) this.f15317z.c());
            case 2:
                this.f15313v.e();
                return new iv((s0) this.f15316y.c(), (Executor) this.f15317z.c());
            default:
                return new pv(this.f15313v.e(), (kw) this.f15314w.c(), (s0) this.f15315x.c(), (Executor) this.f15316y.c(), (ss) this.f15317z.c());
        }
    }
}
