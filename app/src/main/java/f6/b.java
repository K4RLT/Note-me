package f6;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f16758a;

    public b(int i) {
        this.f16758a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f16758a == ((b) obj).f16758a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16758a);
    }

    public final String toString() {
        return a5.a.i(new StringBuilder("ConstraintsNotMet(reason="), this.f16758a, ')');
    }
}
