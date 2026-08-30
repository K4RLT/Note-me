package p7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f22551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22552b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22553c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22554d;
    public final boolean e;

    public p0(String str, int i, float f10, float f11, int i10) {
        boolean z3;
        f10 = (i10 & 4) != 0 ? 1.0f : f10;
        f11 = (i10 & 8) != 0 ? 1.0f : f11;
        if ((i10 & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f22551a = str;
        this.f22552b = i;
        this.f22553c = f10;
        this.f22554d = f11;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (!this.f22551a.equals(p0Var.f22551a) || this.f22552b != p0Var.f22552b || Float.compare(this.f22553c, p0Var.f22553c) != 0 || Float.compare(this.f22554d, p0Var.f22554d) != 0 || this.e != p0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a.a(a.a(a.b(this.f22552b, this.f22551a.hashCode() * 31, 31), 31, this.f22553c), 31, this.f22554d);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("MagicStyle(id=", this.f22551a, ", displayNameRes=", this.f22552b, ", spacingFrac=");
        a5.a.s(m4, this.f22553c, ", sizeFrac=", this.f22554d, ", isLine=");
        m4.append(this.e);
        m4.append(")");
        return m4.toString();
    }
}
