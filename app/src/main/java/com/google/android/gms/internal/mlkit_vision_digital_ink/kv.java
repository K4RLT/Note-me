package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class kv implements uq {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14575u;

    /* renamed from: v, reason: collision with root package name */
    public final tq f14576v;

    public /* synthetic */ kv(tq tqVar, int i) {
        this.f14575u = i;
        this.f14576v = tqVar;
    }

    public s5 a() {
        return new s5((ss) this.f14576v.c());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.uq
    public final Object c() {
        switch (this.f14575u) {
            case 0:
                return a();
            default:
                return new Object();
        }
    }
}
