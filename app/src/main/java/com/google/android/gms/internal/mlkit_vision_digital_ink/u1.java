package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u1 extends o1 implements n1 {
    public final Exception A;
    public final boolean B;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(String str, n1 n1Var, a2 a2Var, boolean z3, d2 d2Var) {
        super("<missing root>:".concat(str), (l1) n1Var, a2.a(a2Var, z1.f15321f), d2Var);
        this.A = n1Var.e();
        this.B = z3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.e2
    public final e2 E(String str, a2 a2Var, d2 d2Var) {
        AtomicReference atomicReference = q1.f14830a;
        return v(str, a2Var, true, d2Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n1
    public final Exception e() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.e2
    public final a2 i() {
        return z1.e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.n1
    public final u1 v(String str, a2 a2Var, boolean z3, d2 d2Var) {
        boolean z9 = this.B;
        if (z3 && !z9) {
            AtomicReference atomicReference = q1.f14830a;
        }
        boolean z10 = true;
        if ((!z3 || z9) && !z9) {
            z10 = false;
        }
        return new u1(str, this, a2Var, z10, d2Var);
    }

    public u1(UUID uuid, String str, String str2, a2 a2Var, Exception exc, d2 d2Var) {
        super("<missing root>:".concat(str2), uuid, str, a2.a(a2Var, z1.f15321f), d2Var);
        this.A = exc;
        this.B = false;
    }
}
