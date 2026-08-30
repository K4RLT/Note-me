package com.google.android.gms.internal.consent_sdk;
import g3.a;

/* loaded from: classes.dex */
public final class g5 extends h5 {
    @Override // com.google.android.gms.internal.consent_sdk.h5
    public final byte a(int i) {
        if (((47 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(a.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a.i("Index > length: ", i, ", 47"));
        }
        return this.f13432v[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.h5
    public final byte b(int i) {
        return this.f13432v[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.h5
    public final int d() {
        return 47;
    }
}
