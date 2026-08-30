package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public enum ds implements qn {
    NONE(0),
    SUBSCRIBED(1),
    DOWNLOAD_IN_PROGRESS(2),
    DOWNLOAD_FAILED(3),
    DOWNLOAD_COMPLETE(4),
    CORRUPTED(6),
    INTERNAL_ERROR(5);


    /* renamed from: u, reason: collision with root package name */
    public final int f14212u;

    ds(int i) {
        this.f14212u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14212u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qn
    public final int zza() {
        return this.f14212u;
    }
}
