package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class rm extends sm {

    /* renamed from: x, reason: collision with root package name */
    public final int f14926x;

    public rm(byte[] bArr, int i) {
        super(bArr);
        tm.g(0, i, bArr.length);
        this.f14926x = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.sm, com.google.android.gms.internal.mlkit_vision_digital_ink.tm
    public final byte a(int i) {
        int i10 = this.f14926x;
        if (((i10 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(g3.a.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(w7.i1.c("Index > length: ", i, i10, ", "));
        }
        return this.f14978w[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.sm, com.google.android.gms.internal.mlkit_vision_digital_ink.tm
    public final byte b(int i) {
        return this.f14978w[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.sm, com.google.android.gms.internal.mlkit_vision_digital_ink.tm
    public final int d() {
        return this.f14926x;
    }
}
