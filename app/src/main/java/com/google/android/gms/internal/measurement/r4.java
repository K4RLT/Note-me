package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class r4 extends s4 {

    /* renamed from: y, reason: collision with root package name */
    public final int f13897y;

    /* renamed from: z, reason: collision with root package name */
    public final int f13898z;

    public r4(byte[] bArr, int i, int i10) {
        super(bArr);
        s4.b(i, i + i10, bArr.length);
        this.f13897y = i;
        this.f13898z = i10;
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final byte a(int i) {
        int i10 = this.f13898z;
        if (((i10 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(g3.a.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(w7.i1.c("Index > length: ", i, i10, ", "));
        }
        return this.f13910v[this.f13897y + i];
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final byte g(int i) {
        return this.f13910v[this.f13897y + i];
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final int k() {
        return this.f13898z;
    }

    @Override // com.google.android.gms.internal.measurement.s4
    public final int n() {
        return this.f13897y;
    }
}
