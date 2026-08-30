package com.google.android.gms.internal.ads;
import g5.q;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class pl1 extends ll1 {

    /* renamed from: u, reason: collision with root package name */
    public final Serializable f9544u;

    public pl1(sc1 sc1Var) {
        this.f9544u = sc1Var;
    }

    public static boolean n(pl1 pl1Var) {
        Serializable serializable = pl1Var.f9544u;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ll1
    public final String a() {
        Serializable serializable = this.f9544u;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                q.f("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
                return null;
            }
            return g().toString();
        }
        return (String) serializable;
    }

    public final boolean equals(Object obj) {
        double parseDouble;
        double parseDouble2;
        BigDecimal a10;
        BigDecimal a11;
        if (this != obj) {
            if (obj != null && pl1.class == obj.getClass()) {
                pl1 pl1Var = (pl1) obj;
                Serializable serializable = pl1Var.f9544u;
                Serializable serializable2 = this.f9544u;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                }
                if (n(this) && n(pl1Var)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (g().longValue() == pl1Var.g().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return k().equals(pl1Var.k());
                }
                if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            a10 = (BigDecimal) serializable2;
                        } else {
                            a10 = xl1.a(a());
                        }
                        if (serializable instanceof BigDecimal) {
                            a11 = (BigDecimal) serializable;
                        } else {
                            a11 = xl1.a(pl1Var.a());
                        }
                        if (a10.compareTo(a11) == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (serializable2 instanceof Number) {
                        parseDouble = g().doubleValue();
                    } else {
                        parseDouble = Double.parseDouble(a());
                    }
                    if (serializable instanceof Number) {
                        parseDouble2 = pl1Var.g().doubleValue();
                    } else {
                        parseDouble2 = Double.parseDouble(pl1Var.a());
                    }
                    if (parseDouble != parseDouble2) {
                        if (Double.isNaN(parseDouble) && Double.isNaN(parseDouble2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return serializable2.equals(serializable);
            }
            return false;
        }
        return true;
    }

    public final Number g() {
        Serializable serializable = this.f9544u;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new ql1((String) serializable);
        }
        androidx.datastore.preferences.protobuf.s1.k("Primitive is neither a number nor a string");
        return null;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f9544u;
        if (serializable == null) {
            return 31;
        }
        if (n(this)) {
            doubleToLongBits = g().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(g().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final BigInteger k() {
        Serializable serializable = this.f9544u;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (n(this)) {
            return BigInteger.valueOf(g().longValue());
        }
        String a10 = a();
        xl1.d(a10);
        return new BigInteger(a10);
    }

    public pl1(Boolean bool) {
        this.f9544u = bool;
    }

    public pl1(String str) {
        this.f9544u = str;
    }
}
