package d1;
import p.a;

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final float f15680a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15681b;

    public j(float f10, float f11) {
        this.f15680a = f10;
        this.f15681b = f11;
    }

    @Override // d1.e
    public final long a(long j10, long j11, y2.m mVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        y2.m mVar2 = y2.m.f30814u;
        float f12 = this.f15680a;
        if (mVar != mVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        float f14 = (f12 + f13) * f10;
        float f15 = (f13 + this.f15681b) * f11;
        return (Math.round(f15) & 4294967295L) | (Math.round(f14) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Float.compare(this.f15680a, jVar.f15680a) == 0 && Float.compare(this.f15681b, jVar.f15681b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15681b) + (Float.hashCode(this.f15680a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f15680a);
        sb2.append(", verticalBias=");
        return a.m(sb2, this.f15681b, ')');
    }
}
