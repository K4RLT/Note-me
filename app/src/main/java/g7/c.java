package g7;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final float f17561a;

    public c(float f10) {
        this.f17561a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && Float.compare(this.f17561a, ((c) obj).f17561a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17561a);
    }

    public final String toString() {
        return "Downloading(progress=" + this.f17561a + ")";
    }
}
