package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26628a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26629b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26630c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26631d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26632f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26633g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26634h;
    public final float i;

    public n7(float f10, float f11, float f12, float f13, int i, int i10, float f14, float f15, float f16) {
        this.f26628a = f10;
        this.f26629b = f11;
        this.f26630c = f12;
        this.f26631d = f13;
        this.e = i;
        this.f26632f = i10;
        this.f26633g = f14;
        this.f26634h = f15;
        this.i = f16;
    }

    public final float a() {
        return this.f26630c;
    }

    public final float b() {
        return this.f26631d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n7) {
                n7 n7Var = (n7) obj;
                if (Float.compare(this.f26628a, n7Var.f26628a) != 0 || Float.compare(this.f26629b, n7Var.f26629b) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.f26630c, n7Var.f26630c) != 0 || Float.compare(this.f26631d, n7Var.f26631d) != 0 || this.e != n7Var.e || this.f26632f != n7Var.f26632f || Float.compare(this.f26633g, n7Var.f26633g) != 0 || Float.compare(this.f26634h, n7Var.f26634h) != 0 || Float.compare(this.i, n7Var.i) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + a.a(a.a(a.b(this.f26632f, a.b(this.e, a.a(a.a(a.a(a.a(a.a(Float.hashCode(this.f26628a) * 31, 31, this.f26629b), 31, 0.0f), 31, 0.0f), 31, this.f26630c), 31, this.f26631d), 31), 31), 31, this.f26633g), 31, this.f26634h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PliegoLayout(leftDeg=");
        sb2.append(this.f26628a);
        sb2.append(", rightDeg=");
        sb2.append(this.f26629b);
        sb2.append(", faceDeltaDeg=0.0, layDeg=0.0, creaseX=");
        a5.a.s(sb2, this.f26630c, ", creaseZ=", this.f26631d, ", leftNum=");
        a5.a.n(this.e, this.f26632f, ", rightNum=", ", shade=", sb2);
        a5.a.s(sb2, this.f26633g, ", creaseOffsetFrac=", this.f26634h, ", closeFold=");
        sb2.append(this.i);
        sb2.append(")");
        return sb2.toString();
    }
}
