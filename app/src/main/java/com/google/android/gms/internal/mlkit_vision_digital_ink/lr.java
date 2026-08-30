package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public enum lr implements qn {
    /* JADX INFO: Fake field, exist only in values array */
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);


    /* renamed from: u, reason: collision with root package name */
    public final int f14633u;

    lr(int i) {
        this.f14633u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14633u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qn
    public final int zza() {
        return this.f14633u;
    }
}
