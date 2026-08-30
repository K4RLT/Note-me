package u7;
import p.a;

/* loaded from: classes.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26106b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26107c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26108d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26109f;

    public d8(String str, int i, boolean z3, boolean z9, int i10, float f10) {
        this.f26105a = str;
        this.f26106b = i;
        this.f26107c = z3;
        this.f26108d = z9;
        this.e = i10;
        this.f26109f = f10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d8) {
                d8 d8Var = (d8) obj;
                if (!this.f26105a.equals(d8Var.f26105a) || this.f26106b != d8Var.f26106b || this.f26107c != d8Var.f26107c || this.f26108d != d8Var.f26108d || this.e != d8Var.e || Float.compare(this.f26109f, d8Var.f26109f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26109f) + a.b(this.e, a.c(a.c(a.b(this.f26106b, this.f26105a.hashCode() * 31, 31), 31, this.f26107c), 31, this.f26108d), 31);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("TextEffectSpec(id=", this.f26105a, ", labelRes=", this.f26106b, ", usesColor=");
        m4.append(this.f26107c);
        m4.append(", usesAmount=");
        m4.append(this.f26108d);
        m4.append(", defaultColorArgb=");
        m4.append(this.e);
        m4.append(", defaultAmount=");
        m4.append(this.f26109f);
        m4.append(")");
        return m4.toString();
    }
}
