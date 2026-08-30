package q1;
import p.a;

/* loaded from: classes.dex */
public final class p extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23297b;

    public p(float f10) {
        super(3);
        this.f23297b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && Float.compare(this.f23297b, ((p) obj).f23297b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23297b);
    }

    public final String toString() {
        return a.m(new StringBuilder("RelativeHorizontalTo(dx="), this.f23297b, ')');
    }
}
