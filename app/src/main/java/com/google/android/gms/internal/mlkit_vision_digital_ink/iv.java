package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q1.b;

import android.util.Base64;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iv implements qu {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f14487b;

    public iv(s0 s0Var, Executor executor) {
        this.f14486a = s0Var;
        this.f14487b = executor;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya a(fs fsVar) {
        String encodeToString = Base64.encodeToString(fsVar.d(), 3);
        ya a10 = this.f14486a.a();
        hv hvVar = new hv(encodeToString, 1);
        int i = g2.f14354a;
        return n5.p(a10, new f2(q1.b(), 0, hvVar), this.f14487b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya b() {
        return va.f15125v;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya c(tr trVar) {
        Instant now;
        long epochMilli;
        cx.c("%s: Adding file group %s", "ProtoDataStoreFileGroupsMetadata", trVar.P());
        now = Instant.now();
        epochMilli = now.toEpochMilli();
        tr j10 = f7.j(trVar, trVar.F() + (epochMilli / 1000));
        ArrayList arrayList = new ArrayList();
        arrayList.add(j10);
        rl rlVar = new rl(6, arrayList);
        s0 s0Var = this.f14486a;
        Executor executor = this.f14487b;
        return lx.w(s0Var.b(rlVar, executor)).x(new ys(15), executor).u(IOException.class, new ys(18), executor);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya d(fs fsVar) {
        hv hvVar = new hv(Base64.encodeToString(fsVar.d(), 3), 2);
        s0 s0Var = this.f14486a;
        Executor executor = this.f14487b;
        return lx.w(s0Var.b(hvVar, executor)).x(new ys(19), executor).u(IOException.class, new ys(20), executor);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya e(fs fsVar, tr trVar) {
        f2 f2Var = new f2(Base64.encodeToString(fsVar.d(), 3), 2, trVar);
        s0 s0Var = this.f14486a;
        Executor executor = this.f14487b;
        return lx.w(s0Var.b(f2Var, executor)).x(new ys(16), executor).u(IOException.class, new ys(17), executor);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya f(fs fsVar) {
        String encodeToString = Base64.encodeToString(fsVar.d(), 3);
        ya a10 = this.f14486a.a();
        int i = 0;
        hv hvVar = new hv(encodeToString, i);
        int i10 = g2.f14354a;
        return n5.p(a10, new f2(q1.b(), i, hvVar), this.f14487b);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qu
    public final ya zzb() {
        ys ysVar = new ys(14);
        s0 s0Var = this.f14486a;
        Executor executor = this.f14487b;
        return lx.w(s0Var.b(ysVar, executor)).y(new p0(5, this), executor);
    }
}
