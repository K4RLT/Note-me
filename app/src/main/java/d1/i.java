package d1;
import p.a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f15679a;

    public i(float f10) {
        this.f15679a = f10;
    }

    public final int a(int i, int i10) {
        return Math.round((1 + this.f15679a) * ((i10 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && Float.compare(this.f15679a, ((i) obj).f15679a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15679a);
    }

    public final String toString() {
        return a.m(new StringBuilder("Vertical(bias="), this.f15679a, ')');
    }
}
