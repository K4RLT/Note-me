package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class c6 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13674b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(Unsafe unsafe, int i) {
        super(unsafe);
        this.f13674b = i;
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final double a(long j10, Object obj) {
        switch (this.f13674b) {
            case 0:
                return Double.longBitsToDouble(k(j10, obj));
            default:
                return Double.longBitsToDouble(k(j10, obj));
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void d(Object obj, long j10, byte b10) {
        switch (this.f13674b) {
            case 0:
                if (e6.f13738g) {
                    e6.g(obj, j10, b10);
                    return;
                } else {
                    e6.h(obj, j10, b10);
                    return;
                }
            default:
                if (e6.f13738g) {
                    e6.g(obj, j10, b10);
                    return;
                } else {
                    e6.h(obj, j10, b10);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void e(Object obj, long j10, double d2) {
        switch (this.f13674b) {
            case 0:
                c(j10, obj, Double.doubleToLongBits(d2));
                return;
            default:
                c(j10, obj, Double.doubleToLongBits(d2));
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void f(Object obj, long j10, float f10) {
        switch (this.f13674b) {
            case 0:
                b(j10, obj, Float.floatToIntBits(f10));
                return;
            default:
                b(j10, obj, Float.floatToIntBits(f10));
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final void g(Object obj, long j10, boolean z3) {
        switch (this.f13674b) {
            case 0:
                if (e6.f13738g) {
                    e6.g(obj, j10, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    e6.h(obj, j10, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (e6.f13738g) {
                    e6.g(obj, j10, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    e6.h(obj, j10, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final float h(long j10, Object obj) {
        switch (this.f13674b) {
            case 0:
                return Float.intBitsToFloat(j(j10, obj));
            default:
                return Float.intBitsToFloat(j(j10, obj));
        }
    }

    @Override // com.google.android.gms.internal.measurement.d6
    public final boolean i(long j10, Object obj) {
        switch (this.f13674b) {
            case 0:
                if (e6.f13738g) {
                    if (((byte) (e6.f13735c.j((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (e6.f13735c.j((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
            default:
                if (e6.f13738g) {
                    if (((byte) (e6.f13735c.j((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (e6.f13735c.j((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
        }
    }
}
