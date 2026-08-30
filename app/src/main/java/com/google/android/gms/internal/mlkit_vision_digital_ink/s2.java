package com.google.android.gms.internal.mlkit_vision_digital_ink;
import p.a;

/* loaded from: classes.dex */
public final class s2 extends q2 {

    /* renamed from: u, reason: collision with root package name */
    public final Object f14953u;

    public s2(Object obj) {
        this.f14953u = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.q2
    public final Object a() {
        return this.f14953u;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.q2
    public final Object b() {
        return this.f14953u;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.q2
    public final boolean c() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.q2
    public final boolean equals(Object obj) {
        if (obj instanceof s2) {
            return this.f14953u.equals(((s2) obj).f14953u);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.q2
    public final int hashCode() {
        return this.f14953u.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.k("Optional.of(", this.f14953u.toString(), ")");
    }
}
