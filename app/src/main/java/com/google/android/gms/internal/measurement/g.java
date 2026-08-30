package com.google.android.gms.internal.measurement;
import j6.n;
import q.x;
import w7.i1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements n {

    /* renamed from: u, reason: collision with root package name */
    public final Double f13756u;

    public g(Double d2) {
        if (d2 == null) {
            this.f13756u = Double.valueOf(Double.NaN);
        } else {
            this.f13756u = d2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double a() {
        return this.f13756u;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String b() {
        BigDecimal stripTrailingZeros;
        int scale;
        Double d2 = this.f13756u;
        if (Double.isNaN(d2.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d2.doubleValue())) {
            if (d2.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d2.doubleValue());
        if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else if (valueOf.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = valueOf.stripTrailingZeros();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n c() {
        return new g(this.f13756u);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f13756u.equals(((g) obj).f13756u);
    }

    public final int hashCode() {
        return this.f13756u.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean k() {
        boolean z3;
        Double d2 = this.f13756u;
        if (!Double.isNaN(d2.doubleValue()) && d2.doubleValue() != 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n n(String str, n nVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new p(b());
        }
        x.n(i1.d(b(), ".", str, " is not a function."));
        return null;
    }

    public final String toString() {
        return b();
    }
}
