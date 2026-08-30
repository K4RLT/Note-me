package q1;
import p.a;

/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23284b;

    public k(float f10) {
        super(3);
        this.f23284b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && Float.compare(this.f23284b, ((k) obj).f23284b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23284b);
    }

    public final String toString() {
        return a.m(new StringBuilder("HorizontalTo(x="), this.f23284b, ')');
    }
}
