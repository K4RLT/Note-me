package d1;
import p.a;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f15676a;

    public f(float f10) {
        this.f15676a = f10;
    }

    @Override // d1.d
    public final int a(int i, int i10, y2.m mVar) {
        return Math.round((1 + this.f15676a) * ((i10 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && Float.compare(this.f15676a, ((f) obj).f15676a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15676a);
    }

    public final String toString() {
        return a.m(new StringBuilder("Horizontal(bias="), this.f15676a, ')');
    }
}
