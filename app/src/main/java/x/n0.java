package x;
import l.a;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public float f29986a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29987b = true;

    /* renamed from: c, reason: collision with root package name */
    public t f29988c = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (Float.compare(this.f29986a, n0Var.f29986a) != 0 || this.f29987b != n0Var.f29987b || !kotlin.jvm.internal.a(this.f29988c, n0Var.f29988c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(Float.hashCode(this.f29986a) * 31, 31, this.f29987b);
        t tVar = this.f29988c;
        if (tVar == null) {
            hashCode = 0;
        } else {
            hashCode = tVar.f30002a.hashCode();
        }
        return (c10 + hashCode) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f29986a + ", fill=" + this.f29987b + ", crossAxisAlignment=" + this.f29988c + ", flowLayoutData=null)";
    }
}
