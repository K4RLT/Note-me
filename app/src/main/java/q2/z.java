package q2;
import l.a;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f23374a;

    /* renamed from: b, reason: collision with root package name */
    public final s f23375b;

    /* renamed from: c, reason: collision with root package name */
    public final r f23376c;

    public z(int i, s sVar, r rVar) {
        this.f23374a = i;
        this.f23375b = sVar;
        this.f23376c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f23374a == zVar.f23374a && kotlin.jvm.internal.a(this.f23375b, zVar.f23375b) && this.f23376c.equals(zVar.f23376c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23376c.f23363a.hashCode() + a.b(0, a.b(0, ((this.f23374a * 31) + this.f23375b.f23369u) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f23374a + ", weight=" + this.f23375b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
