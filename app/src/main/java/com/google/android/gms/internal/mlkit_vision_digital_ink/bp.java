package com.google.android.gms.internal.mlkit_vision_digital_ink;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class bp extends cp {
    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final double a(long j10, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f14164a).getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final float c(long j10, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f14164a).getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void g(Object obj, long j10, boolean z3) {
        if (dp.f14202g) {
            dp.c(obj, j10, z3 ? (byte) 1 : (byte) 0);
        } else {
            dp.d(obj, j10, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void h(Object obj, long j10, byte b10) {
        if (dp.f14202g) {
            dp.c(obj, j10, b10);
        } else {
            dp.d(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void j(Object obj, long j10, double d2) {
        ((Unsafe) this.f14164a).putLong(obj, j10, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final void k(Object obj, long j10, float f10) {
        ((Unsafe) this.f14164a).putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.cp
    public final boolean l(long j10, Object obj) {
        if (dp.f14202g) {
            return dp.n(j10, obj);
        }
        return dp.o(j10, obj);
    }
}
