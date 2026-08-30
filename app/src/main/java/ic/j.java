package ic;
import q.f;
import r.a;

import wa.j8;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f18407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18409c;

    public j(r rVar, int i, int i10) {
        j8.a(rVar, "Null dependency anInterface.");
        this.f18407a = rVar;
        this.f18408b = i;
        this.f18409c = i10;
    }

    public static j a(r rVar) {
        return new j(rVar, 1, 0);
    }

    public static j b(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f18407a.equals(jVar.f18407a) && this.f18408b == jVar.f18408b && this.f18409c == jVar.f18409c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f18407a.hashCode() ^ 1000003) * 1000003) ^ this.f18408b) * 1000003) ^ this.f18409c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f18407a);
        sb2.append(", type=");
        int i = this.f18408b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f18409c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    g5.f(g3.a.g(i10, "Unsupported injection: "));
                    return null;
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a5.a.k(sb2, str2, "}");
    }

    public j(int i, int i10, Class cls) {
        this(a(cls), i, i10);
    }
}
