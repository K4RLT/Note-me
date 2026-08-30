package y0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f30795a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f30795a == ((a) obj).f30795a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30795a);
    }

    public final String toString() {
        return a5.a.i(new StringBuilder("DeltaCounter(count="), this.f30795a, ')');
    }
}
