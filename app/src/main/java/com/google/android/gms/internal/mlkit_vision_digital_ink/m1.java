package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final z4 f14655a;

    /* renamed from: b, reason: collision with root package name */
    public final z4 f14656b;

    /* renamed from: c, reason: collision with root package name */
    public final UUID f14657c;

    public m1(z4 z4Var, z4 z4Var2, UUID uuid) {
        this.f14655a = z4Var;
        this.f14656b = z4Var2;
        this.f14657c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            if (this.f14655a.equals(m1Var.f14655a) && this.f14656b.equals(m1Var.f14656b) && this.f14657c.equals(m1Var.f14657c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14655a.hashCode() ^ 1000003) * 1000003) ^ this.f14656b.hashCode()) * 1000003) ^ this.f14657c.hashCode()) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f14655a);
    }
}
