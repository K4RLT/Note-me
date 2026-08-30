package q2;

/* loaded from: classes.dex */
public final class a implements x {

    /* renamed from: u, reason: collision with root package name */
    public final int f23323u;

    public a(int i) {
        this.f23323u = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f23323u == ((a) obj).f23323u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23323u);
    }

    public final String toString() {
        return a5.a.i(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f23323u, ')');
    }
}
