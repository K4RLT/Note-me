package k8;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f19624a;

    public b(Integer num) {
        this.f19624a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f19624a.equals(((b) obj).f19624a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19624a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f19624a + "}";
    }
}
