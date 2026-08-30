package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a2.a;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class o1 extends l1 {

    /* renamed from: z, reason: collision with root package name */
    public final a2 f14730z;

    public o1(String str, l1 l1Var, a2 a2Var, d2 d2Var) {
        super(str, l1Var, d2Var);
        pa.p(a2Var.f14006c);
        this.f14730z = a2Var;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.e2
    public final a2 d() {
        return a(this.f14730z, i());
    }

    public o1(String str, UUID uuid, String str2, a2 a2Var, d2 d2Var) {
        super(str, uuid, str2, d2Var);
        pa.p(a2Var.f14006c);
        this.f14730z = a2Var;
    }
}
