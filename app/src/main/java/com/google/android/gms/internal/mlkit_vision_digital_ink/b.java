package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public enum b implements qn {
    UNSPECIFIED(0),
    DOWNLOADED(1),
    PENDING(2),
    PENDING_CUSTOM_VALIDATION(3);


    /* renamed from: u, reason: collision with root package name */
    public final int f14046u;

    b(int i) {
        this.f14046u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14046u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qn
    public final int zza() {
        return this.f14046u;
    }
}
