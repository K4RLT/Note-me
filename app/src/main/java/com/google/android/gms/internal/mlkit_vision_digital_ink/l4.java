package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l4 extends j3 implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final l4 f14592v;

    /* renamed from: w, reason: collision with root package name */
    public static final l4 f14593w;

    /* renamed from: u, reason: collision with root package name */
    public final transient h4 f14594u;

    static {
        e4 e4Var = h4.f14393v;
        f14592v = new l4((h4) z4.f15325y);
        f14593w = new l4((h4) h4.u(y4.f15272w));
    }

    public l4(h4 h4Var) {
        this.f14594u = h4Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.j3
    public final /* bridge */ /* synthetic */ n4 a() {
        h4 h4Var = this.f14594u;
        if (h4Var.isEmpty()) {
            return f5.D;
        }
        y4 y4Var = y4.f15272w;
        return new g5(h4Var, w4.f15178w);
    }

    public l4(z4 z4Var) {
        this.f14594u = z4Var;
    }
}
