package je;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f19181a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19182b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f19183c;

    public g(float f10, float f11, Long l10) {
        this.f19181a = f10;
        this.f19182b = f11;
        this.f19183c = l10;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (Float.floatToIntBits(this.f19181a) == Float.floatToIntBits(gVar.f19181a) && Float.floatToIntBits(this.f19182b) == Float.floatToIntBits(gVar.f19182b) && this.f19183c.equals(gVar.f19183c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f19181a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f19182b)) * 1000003) ^ this.f19183c.hashCode();
    }

    public final String toString() {
        return "Point{x=" + this.f19181a + ", y=" + this.f19182b + ", timestamp=" + this.f19183c + "}";
    }
}
