package pd;

import g5.q;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22677b;

    public a(String str, String str2) {
        this.f22676a = str;
        if (str2 != null) {
            this.f22677b = str2;
        } else {
            q.h("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f22676a.equals(aVar.f22676a) && this.f22677b.equals(aVar.f22677b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f22676a.hashCode() ^ 1000003) * 1000003) ^ this.f22677b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f22676a);
        sb2.append(", version=");
        return a5.a.k(sb2, this.f22677b, "}");
    }
}
