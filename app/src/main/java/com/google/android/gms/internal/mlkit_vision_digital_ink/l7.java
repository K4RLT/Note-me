package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class l7 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    public static final l7 f14597b = new l7(q7.f14845a);

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f14598a;

    public l7(p7 p7Var) {
        this.f14598a = new AtomicReference(p7Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.p7
    public final gn a() {
        return ((p7) this.f14598a.get()).a();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.p7
    public final u7 b() {
        return ((p7) this.f14598a.get()).b();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.p7
    public final void c(String str, Level level, boolean z3) {
        ((p7) this.f14598a.get()).c(str, level, z3);
    }
}
