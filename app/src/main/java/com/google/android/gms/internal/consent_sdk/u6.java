package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class u6 extends w6 {
    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f13596a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f13596a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final void c(Object obj, long j10, boolean z3) {
        if (x6.f13606g) {
            x6.c(obj, j10, z3 ? (byte) 1 : (byte) 0);
        } else {
            x6.d(obj, j10, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final void d(Object obj, long j10, byte b10) {
        if (x6.f13606g) {
            x6.c(obj, j10, b10);
        } else {
            x6.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final void e(Object obj, long j10, double d2) {
        this.f13596a.putLong(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final void f(Object obj, long j10, float f10) {
        this.f13596a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.consent_sdk.w6
    public final boolean g(long j10, Object obj) {
        if (x6.f13606g) {
            return x6.m(j10, obj);
        }
        return x6.n(j10, obj);
    }
}
