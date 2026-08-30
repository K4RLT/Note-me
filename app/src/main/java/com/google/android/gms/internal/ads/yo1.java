package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class yo1 extends um1 {
    @Override // com.google.android.gms.internal.ads.um1
    public final boolean Y(long j10, Object obj) {
        if (zo1.e) {
            return zo1.j(j10, obj);
        }
        return zo1.k(j10, obj);
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void b0(Object obj, long j10, boolean z3) {
        if (zo1.e) {
            zo1.l(obj, j10, z3);
        } else {
            zo1.m(obj, j10, z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final float c0(long j10, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f11688u).getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void g0(Object obj, long j10, float f10) {
        ((Unsafe) this.f11688u).putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final double r1(long j10, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f11688u).getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.um1
    public final void v1(Object obj, long j10, double d2) {
        ((Unsafe) this.f11688u).putLong(obj, j10, Double.doubleToLongBits(d2));
    }
}
