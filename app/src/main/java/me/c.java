package me;

import com.google.android.gms.internal.mlkit_vision_digital_ink.i0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import fa.y;
import java.util.Arrays;
import ya.pe;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20797a;

    public /* synthetic */ c(i0 i0Var) {
        this.f20797a = i0Var.f14451u;
    }

    public final pe a() {
        u0 u0Var = new u0(19);
        Boolean bool = Boolean.FALSE;
        u0Var.f15036v = bool;
        u0Var.f15037w = Boolean.valueOf(this.f20797a);
        u0Var.f15038x = bool;
        u0Var.f15039y = bool;
        u0Var.f15040z = bool;
        return new pe(u0Var);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof c) && this.f20797a == ((c) obj).f20797a && y.l(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, Boolean.valueOf(this.f20797a), bool, bool, bool, null});
    }
}
