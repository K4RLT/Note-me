package com.google.android.gms.internal.mlkit_vision_digital_ink;
import a5.a;

/* loaded from: classes.dex */
public final class dw {

    /* renamed from: a, reason: collision with root package name */
    public final tr f14226a;

    /* renamed from: b, reason: collision with root package name */
    public final tr f14227b;

    public dw(tr trVar, tr trVar2) {
        this.f14226a = trVar;
        this.f14227b = trVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dw) {
            dw dwVar = (dw) obj;
            tr trVar = dwVar.f14226a;
            tr trVar2 = this.f14226a;
            if (trVar2 != null ? trVar2.equals(trVar) : trVar == null) {
                tr trVar3 = dwVar.f14227b;
                tr trVar4 = this.f14227b;
                if (trVar4 != null ? trVar4.equals(trVar3) : trVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        tr trVar = this.f14226a;
        if (trVar == null) {
            hashCode = 0;
        } else {
            hashCode = trVar.hashCode();
        }
        tr trVar2 = this.f14227b;
        if (trVar2 != null) {
            i = trVar2.hashCode();
        }
        return i ^ ((hashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        return a5.a.h("GroupPair{pendingGroup=", String.valueOf(this.f14226a), ", downloadedGroup=", String.valueOf(this.f14227b), "}");
    }
}
