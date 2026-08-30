package com.google.android.gms.internal.play_billing;
import p.a;

/* loaded from: classes.dex */
public final class d4 extends b4 {
    public final /* synthetic */ e4 B;

    public d4(e4 e4Var) {
        this.B = e4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.b4
    public final String b() {
        c4 c4Var = (c4) this.B.f15414u.get();
        if (c4Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return a.k("tag=[", String.valueOf(c4Var.f15395a), "]");
    }
}
