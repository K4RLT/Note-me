package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ba.p;
import z1.e;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t1 extends l1 implements n1 {
    public static final ba.p A = new ba.p(5);

    /* renamed from: z, reason: collision with root package name */
    public final Exception f14996z;

    public t1(UUID uuid, String str, Exception exc, d2 d2Var) {
        super("<missing root>", uuid, str, d2Var);
        this.f14996z = exc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.e2
    public final e2 E(String str, a2 a2Var, d2 d2Var) {
        AtomicReference atomicReference = q1.f14830a;
        return v(str, a2Var, true, d2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.e2
    public final a2 d() {
        return z1.e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n1
    public final Exception e() {
        return this.f14996z;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n1
    public final u1 v(String str, a2 a2Var, boolean z3, d2 d2Var) {
        if (z3) {
            AtomicReference atomicReference = q1.f14830a;
        }
        return new u1(str, this, a2Var, z3, d2Var);
    }
}
