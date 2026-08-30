package xa;

/* loaded from: classes.dex */
public final class w0 extends Number {

    /* renamed from: u, reason: collision with root package name */
    public final String f30694u;

    public w0(String str) {
        this.f30694u = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f30694u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w0) {
            return this.f30694u.equals(((w0) obj).f30694u);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f30694u);
    }

    public final int hashCode() {
        return this.f30694u.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f30694u;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return u0.g(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f30694u;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return u0.g(str).longValue();
        }
    }

    public final String toString() {
        return this.f30694u;
    }
}
