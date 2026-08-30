package r2;
import l.a;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final m2.g f24483a;

    /* renamed from: b, reason: collision with root package name */
    public final q f24484b;

    public c0(m2.g gVar, q qVar) {
        this.f24483a = gVar;
        this.f24484b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                if (!kotlin.jvm.internal.a(this.f24483a, c0Var.f24483a) || !this.f24484b.equals(c0Var.f24484b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f24484b.hashCode() + (this.f24483a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f24483a) + ", offsetMapping=" + this.f24484b + ')';
    }
}
