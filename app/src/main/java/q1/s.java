package q1;
import p.a;

/* loaded from: classes.dex */
public final class s extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23303b;

    public s(float f10) {
        super(3);
        this.f23303b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && Float.compare(this.f23303b, ((s) obj).f23303b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23303b);
    }

    public final String toString() {
        return a.m(new StringBuilder("RelativeVerticalTo(dy="), this.f23303b, ')');
    }
}
