package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jw implements uq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14535u;

    /* renamed from: v, reason: collision with root package name */
    public final iw f14536v;

    public /* synthetic */ jw(iw iwVar, int i) {
        this.f14535u = i;
        this.f14536v = iwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public final Object c() {
        switch (this.f14535u) {
            case 0:
                Executor executor = (Executor) this.f14536v.f14490w;
                pa.f(executor);
                return executor;
            default:
                return (eb) this.f14536v.f14489v;
        }
    }
}
