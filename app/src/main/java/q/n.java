package q;
import q.q;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f22955a;

    /* renamed from: b, reason: collision with root package name */
    public float f22956b;

    public n(float f10, float f11) {
        this.f22955a = f10;
        this.f22956b = f11;
    }

    @Override // q
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.f22956b;
        }
        return this.f22955a;
    }

    @Override // q
    public final int b() {
        return 2;
    }

    @Override // q
    public final q c() {
        return new n(0.0f, 0.0f);
    }

    @Override // q
    public final void d() {
        this.f22955a = 0.0f;
        this.f22956b = 0.0f;
    }

    @Override // q
    public final void e(int i, float f10) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.f22956b = f10;
            return;
        }
        this.f22955a = f10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f22955a == this.f22955a && nVar.f22956b == this.f22956b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22956b) + (Float.hashCode(this.f22955a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f22955a + ", v2 = " + this.f22956b;
    }
}
