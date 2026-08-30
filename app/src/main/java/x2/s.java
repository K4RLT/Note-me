package x2;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f30074c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f30075d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f30076a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30077b;

    public s(int i, boolean z3) {
        this.f30076a = i;
        this.f30077b = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (this.f30076a == sVar.f30076a && this.f30077b == sVar.f30077b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30077b) + (Integer.hashCode(this.f30076a) * 31);
    }

    public final String toString() {
        if (equals(f30074c)) {
            return "TextMotion.Static";
        }
        if (equals(f30075d)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }
}
