package q;
import p.a;
import q.q;

/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f22957a;

    /* renamed from: b, reason: collision with root package name */
    public float f22958b;

    /* renamed from: c, reason: collision with root package name */
    public float f22959c;

    public o(float f10, float f11, float f12) {
        this.f22957a = f10;
        this.f22958b = f11;
        this.f22959c = f12;
    }

    @Override // q
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return 0.0f;
                }
                return this.f22959c;
            }
            return this.f22958b;
        }
        return this.f22957a;
    }

    @Override // q
    public final int b() {
        return 3;
    }

    @Override // q
    public final q c() {
        return new o(0.0f, 0.0f, 0.0f);
    }

    @Override // q
    public final void d() {
        this.f22957a = 0.0f;
        this.f22958b = 0.0f;
        this.f22959c = 0.0f;
    }

    @Override // q
    public final void e(int i, float f10) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.f22959c = f10;
                return;
            }
            this.f22958b = f10;
            return;
        }
        this.f22957a = f10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.f22957a == this.f22957a && oVar.f22958b == this.f22958b && oVar.f22959c == this.f22959c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22959c) + a.a(Float.hashCode(this.f22957a) * 31, 31, this.f22958b);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f22957a + ", v2 = " + this.f22958b + ", v3 = " + this.f22959c;
    }
}
