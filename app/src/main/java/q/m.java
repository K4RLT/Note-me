package q;
import q.q;

/* loaded from: classes.dex */
public final class m extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f22945a;

    public m(float f10) {
        this.f22945a = f10;
    }

    @Override // q
    public final float a(int i) {
        if (i == 0) {
            return this.f22945a;
        }
        return 0.0f;
    }

    @Override // q
    public final int b() {
        return 1;
    }

    @Override // q
    public final q c() {
        return new m(0.0f);
    }

    @Override // q
    public final void d() {
        this.f22945a = 0.0f;
    }

    @Override // q
    public final void e(int i, float f10) {
        if (i == 0) {
            this.f22945a = f10;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof m) && ((m) obj).f22945a == this.f22945a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22945a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f22945a;
    }
}
