package com.google.android.gms.internal.ads;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class sc1 extends Number {

    /* renamed from: u, reason: collision with root package name */
    public final String f10590u;

    public sc1(String str) {
        this.f10590u = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f10590u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sc1) {
            return this.f10590u.equals(((sc1) obj).f10590u);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f10590u);
    }

    public final int hashCode() {
        return this.f10590u.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f10590u;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f10590u;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f10590u;
    }
}
