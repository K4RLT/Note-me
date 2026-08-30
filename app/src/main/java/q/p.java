package q;
import p.a;
import q.q;

/* loaded from: classes.dex */
public final class p extends q {

    /* renamed from: a, reason: collision with root package name */
    public float f22966a;

    /* renamed from: b, reason: collision with root package name */
    public float f22967b;

    /* renamed from: c, reason: collision with root package name */
    public float f22968c;

    /* renamed from: d, reason: collision with root package name */
    public float f22969d;

    public p(float f10, float f11, float f12, float f13) {
        this.f22966a = f10;
        this.f22967b = f11;
        this.f22968c = f12;
        this.f22969d = f13;
    }

    @Override // q
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return 0.0f;
                    }
                    return this.f22969d;
                }
                return this.f22968c;
            }
            return this.f22967b;
        }
        return this.f22966a;
    }

    @Override // q
    public final int b() {
        return 4;
    }

    @Override // q
    public final q c() {
        return new p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // q
    public final void d() {
        this.f22966a = 0.0f;
        this.f22967b = 0.0f;
        this.f22968c = 0.0f;
        this.f22969d = 0.0f;
    }

    @Override // q
    public final void e(int i, float f10) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.f22969d = f10;
                    return;
                }
                this.f22968c = f10;
                return;
            }
            this.f22967b = f10;
            return;
        }
        this.f22966a = f10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (pVar.f22966a == this.f22966a && pVar.f22967b == this.f22967b && pVar.f22968c == this.f22968c && pVar.f22969d == this.f22969d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f22969d) + a.a(a.a(Float.hashCode(this.f22966a) * 31, 31, this.f22967b), 31, this.f22968c);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f22966a + ", v2 = " + this.f22967b + ", v3 = " + this.f22968c + ", v4 = " + this.f22969d;
    }
}
