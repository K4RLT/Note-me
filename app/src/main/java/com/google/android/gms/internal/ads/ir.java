package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ir {

    /* renamed from: d, reason: collision with root package name */
    public static final ir f7193d = new ir(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f7194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7195b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7196c;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public ir(int i, int i10, float f10) {
        this.f7194a = i;
        this.f7195b = i10;
        this.f7196c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ir) {
            ir irVar = (ir) obj;
            if (this.f7194a == irVar.f7194a && this.f7195b == irVar.f7195b && this.f7196c == irVar.f7196c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f7196c) + ((((this.f7194a + 217) * 31) + this.f7195b) * 31);
    }
}
