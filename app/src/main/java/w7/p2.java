package w7;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28881a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28882b;

    public p2(float f10, boolean z3) {
        this.f28881a = z3;
        this.f28882b = f10;
    }

    public final boolean a() {
        return this.f28881a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p2) {
                p2 p2Var = (p2) obj;
                if (this.f28881a != p2Var.f28881a || Float.compare(this.f28882b, p2Var.f28882b) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28882b) + (Boolean.hashCode(this.f28881a) * 31);
    }

    public final String toString() {
        return "SnapGuide(isVertical=" + this.f28881a + ", positionFrac=" + this.f28882b + ")";
    }
}
