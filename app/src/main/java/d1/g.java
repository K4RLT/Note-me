package d1;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f15677a;

    public g(float f10) {
        this.f15677a = f10;
    }

    @Override // d1.e
    public final long a(long j10, long j11, y2.m mVar) {
        long j12 = ((((int) (j11 >> 32)) - ((int) (j10 >> 32))) << 32) | ((((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) & 4294967295L);
        float f10 = 1;
        float f11 = (this.f15677a + f10) * (((int) (j12 >> 32)) / 2.0f);
        float f12 = (f10 - 1.0f) * (((int) (j12 & 4294967295L)) / 2.0f);
        return (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof g) || Float.compare(this.f15677a, ((g) obj).f15677a) != 0 || Float.compare(-1.0f, -1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.f15677a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.f15677a + ", verticalBias=-1.0)";
    }
}
