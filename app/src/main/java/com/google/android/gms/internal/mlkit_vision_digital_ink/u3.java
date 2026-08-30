package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final ej f15042a;

    public u3(ej ejVar) {
        this.f15042a = ejVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof u3) && this.f15042a.equals(((u3) obj).f15042a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f15042a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return p.a.k("AddFileGroupRequest{dataFileGroup=", this.f15042a.toString(), ", accountOptional=Optional.absent(), variantIdOptional=Optional.absent()}");
    }
}
