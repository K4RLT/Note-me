package b8;
import a5.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1809a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1810b;

    public a(String str, String str2) {
        str2.getClass();
        this.f1809a = str;
        this.f1810b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!this.f1809a.equals(aVar.f1809a) || !kotlin.jvm.internal.l.a(this.f1810b, aVar.f1810b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1810b.hashCode() + (this.f1809a.hashCode() * 31);
    }

    public final String toString() {
        return a5.a.h("BookSpec(label=", this.f1809a, ", value=", this.f1810b, ")");
    }
}
