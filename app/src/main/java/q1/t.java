package q1;
import p.a;

/* loaded from: classes.dex */
public final class t extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23304b;

    public t(float f10) {
        super(3);
        this.f23304b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && Float.compare(this.f23304b, ((t) obj).f23304b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23304b);
    }

    public final String toString() {
        return a.m(new StringBuilder("VerticalTo(y="), this.f23304b, ')');
    }
}
