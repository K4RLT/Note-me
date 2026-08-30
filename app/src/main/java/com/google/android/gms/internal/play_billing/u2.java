package com.google.android.gms.internal.play_billing;
import x2.c;
import x2.d;
import x2.m;
import x2.n;

/* loaded from: classes.dex */
public final class u2 extends w2 {
    @Override // com.google.android.gms.internal.play_billing.w2
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(this.f15541a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final float b(long j10, Object obj) {
        return Float.intBitsToFloat(this.f15541a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final void c(Object obj, long j10, boolean z3) {
        if (x2.f15550g) {
            x2.c(obj, j10, z3 ? (byte) 1 : (byte) 0);
        } else {
            x2.d(obj, j10, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final void d(Object obj, long j10, byte b10) {
        if (x2.f15550g) {
            x2.c(obj, j10, b10);
        } else {
            x2.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final void e(Object obj, long j10, double d2) {
        this.f15541a.putLong(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final void f(Object obj, long j10, float f10) {
        this.f15541a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.w2
    public final boolean g(long j10, Object obj) {
        if (x2.f15550g) {
            return x2.m(j10, obj);
        }
        return x2.n(j10, obj);
    }
}
