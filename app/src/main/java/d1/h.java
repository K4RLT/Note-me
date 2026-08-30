package d1;
import p.a;

/* loaded from: classes.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f15678a;

    public h(float f10) {
        this.f15678a = f10;
    }

    @Override // d1.d
    public final int a(int i, int i10, y2.m mVar) {
        float f10 = (i10 - i) / 2.0f;
        y2.m mVar2 = y2.m.f30814u;
        float f11 = this.f15678a;
        if (mVar != mVar2) {
            f11 *= -1;
        }
        return Math.round((1 + f11) * f10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && Float.compare(this.f15678a, ((h) obj).f15678a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15678a);
    }

    public final String toString() {
        return a.m(new StringBuilder("Horizontal(bias="), this.f15678a, ')');
    }
}
