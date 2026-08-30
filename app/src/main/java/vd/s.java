package vd;
import p.a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f27637a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27639c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27640d;

    public s(String str, boolean z3, int i, int i10) {
        this.f27637a = str;
        this.f27638b = i;
        this.f27639c = i10;
        this.f27640d = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (!this.f27637a.equals(sVar.f27637a) || this.f27638b != sVar.f27638b || this.f27639c != sVar.f27639c || this.f27640d != sVar.f27640d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int b10 = a.b(this.f27639c, a.b(this.f27638b, this.f27637a.hashCode() * 31, 31), 31);
        boolean z3 = this.f27640d;
        int i = z3;
        if (z3 != 0) {
            i = 1;
        }
        return b10 + i;
    }

    public final String toString() {
        return "ProcessDetails(processName=" + this.f27637a + ", pid=" + this.f27638b + ", importance=" + this.f27639c + ", isDefaultProcess=" + this.f27640d + ')';
    }
}
