package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25888a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25889b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25890c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25891d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final w6 f25892f;

    /* renamed from: g, reason: collision with root package name */
    public final float f25893g;

    /* renamed from: h, reason: collision with root package name */
    public final float f25894h;

    public a1(String str, int i, int i10, int i11, int i12, w6 w6Var, float f10, float f11) {
        w6Var.getClass();
        this.f25888a = str;
        this.f25889b = i;
        this.f25890c = i10;
        this.f25891d = i11;
        this.e = i12;
        this.f25892f = w6Var;
        this.f25893g = f10;
        this.f25894h = f11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                if (!this.f25888a.equals(a1Var.f25888a) || this.f25889b != a1Var.f25889b || this.f25890c != a1Var.f25890c || this.f25891d != a1Var.f25891d || this.e != a1Var.e || this.f25892f != a1Var.f25892f || Float.compare(this.f25893g, a1Var.f25893g) != 0 || Float.compare(this.f25894h, a1Var.f25894h) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25894h) + a.a((this.f25892f.hashCode() + a.b(this.e, a.b(this.f25891d, a.b(this.f25890c, a.b(this.f25889b, this.f25888a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31, this.f25893g);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("CoverPattern(id=", this.f25888a, ", labelRes=", this.f25889b, ", bgArgb=");
        a5.a.n(this.f25890c, this.f25891d, ", motifArgb=", ", spineArgb=", m4);
        m4.append(this.e);
        m4.append(", kind=");
        m4.append(this.f25892f);
        m4.append(", sizeFrac=");
        m4.append(this.f25893g);
        m4.append(", stepMul=");
        m4.append(this.f25894h);
        m4.append(")");
        return m4.toString();
    }
}
