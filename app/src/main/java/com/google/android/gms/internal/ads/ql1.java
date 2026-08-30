package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ql1 extends Number {

    /* renamed from: u, reason: collision with root package name */
    public final String f9876u;

    public ql1(String str) {
        this.f9876u = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f9876u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ql1) {
            return this.f9876u.equals(((ql1) obj).f9876u);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f9876u);
    }

    public final int hashCode() {
        return this.f9876u.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f9876u;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return xl1.a(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f9876u;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return xl1.a(str).longValue();
        }
    }

    public final String toString() {
        return this.f9876u;
    }
}
