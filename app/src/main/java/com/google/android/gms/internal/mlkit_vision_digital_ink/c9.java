package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;

/* loaded from: classes.dex */
public enum c9 implements qn {
    UNKNOWN(0),
    GROUP_NOT_FOUND(1),
    NEW_BUILD_ID(2),
    NEW_VARIANT_ID(3),
    NEW_VERSION_NUMBER(4),
    DIFFERENT_FILES(5),
    DIFFERENT_STALE_LIFETIME(6),
    DIFFERENT_EXPIRATION_DATE(7),
    DIFFERENT_DOWNLOAD_CONDITIONS(8),
    DIFFERENT_ALLOWED_READERS(9),
    DIFFERENT_DOWNLOAD_POLICY(10),
    DIFFERENT_EXPERIMENT_INFO(11),
    DIFFERENT_CUSTOM_METADATA(12),
    UNRECOGNIZED(-1);


    /* renamed from: u, reason: collision with root package name */
    public final int f14158u;

    c9(int i) {
        this.f14158u = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f14158u);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.qn
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f14158u;
        }
        x.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
