package xa;
import q.f;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f0 extends b0 {

    /* renamed from: u, reason: collision with root package name */
    public final Serializable f30411u;

    public f0(String str) {
        Objects.requireNonNull(str);
        this.f30411u = str;
    }

    public static boolean g(f0 f0Var) {
        Serializable serializable = f0Var.f30411u;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Number a() {
        Serializable serializable = this.f30411u;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new w0((String) serializable);
        }
        androidx.datastore.preferences.protobuf.s1.k("Primitive is neither a number nor a string");
        return null;
    }

    public final String b() {
        Serializable serializable = this.f30411u;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                g5.f("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
                return null;
            }
            return a().toString();
        }
        return (String) serializable;
    }

    public final BigInteger d() {
        Serializable serializable = this.f30411u;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (g(this)) {
            return BigInteger.valueOf(a().longValue());
        }
        String b10 = b();
        u0.x(b10);
        return new BigInteger(b10);
    }

    public final boolean equals(Object obj) {
        double parseDouble;
        double parseDouble2;
        BigDecimal g8;
        BigDecimal g10;
        if (this != obj) {
            if (obj != null && f0.class == obj.getClass()) {
                f0 f0Var = (f0) obj;
                Serializable serializable = f0Var.f30411u;
                Serializable serializable2 = this.f30411u;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                }
                if (g(this) && g(f0Var)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (a().longValue() == f0Var.a().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return d().equals(f0Var.d());
                }
                if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            g8 = (BigDecimal) serializable2;
                        } else {
                            g8 = u0.g(b());
                        }
                        if (serializable instanceof BigDecimal) {
                            g10 = (BigDecimal) serializable;
                        } else {
                            g10 = u0.g(f0Var.b());
                        }
                        if (g8.compareTo(g10) == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (serializable2 instanceof Number) {
                        parseDouble = a().doubleValue();
                    } else {
                        parseDouble = Double.parseDouble(b());
                    }
                    if (serializable instanceof Number) {
                        parseDouble2 = f0Var.a().doubleValue();
                    } else {
                        parseDouble2 = Double.parseDouble(f0Var.b());
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

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f30411u;
        if (serializable == null) {
            return 31;
        }
        if (g(this)) {
            doubleToLongBits = a().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public f0(Boolean bool) {
        this.f30411u = bool;
    }

    public f0(w0 w0Var) {
        this.f30411u = w0Var;
    }
}
