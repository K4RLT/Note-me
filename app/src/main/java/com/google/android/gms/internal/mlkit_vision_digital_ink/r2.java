package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r2 implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Object f14888u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f14889v;

    public r2(String str, Integer num) {
        this.f14888u = str;
        this.f14889v = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r2) {
            r2 r2Var = (r2) obj;
            if (Objects.equals(this.f14888u, r2Var.f14888u) && this.f14889v.equals(r2Var.f14889v)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f14888u;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f14889v.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return a5.a.h("(", String.valueOf(this.f14888u), ", ", this.f14889v.toString(), ")");
    }
}
