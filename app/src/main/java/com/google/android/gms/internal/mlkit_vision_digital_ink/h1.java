package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final km f14389a;

    /* renamed from: b, reason: collision with root package name */
    public final bn f14390b;

    public h1(km kmVar, bn bnVar) {
        this.f14389a = kmVar;
        if (bnVar != null) {
            this.f14390b = bnVar;
        } else {
            g5.q.h("Null extensionRegistryLite");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (this.f14389a.equals(h1Var.f14389a) && this.f14390b.equals(h1Var.f14390b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14389a.hashCode() ^ 1000003) * 1000003) ^ this.f14390b.hashCode();
    }

    public final String toString() {
        return a5.a.h("ProtoSerializer{defaultValue=", this.f14389a.toString(), ", extensionRegistryLite=", this.f14390b.toString(), "}");
    }
}
