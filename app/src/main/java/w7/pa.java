package w7;
import a5.a;
import g3.a;
import p.a;

/* loaded from: classes.dex */
public final class pa {
    public static final oa Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f28920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28921b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28922c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28923d;
    public final String e;

    public /* synthetic */ pa(int i, String str, String str2, String str3, String str4, String str5) {
        if (1 == (i & 1)) {
            this.f28920a = str;
            if ((i & 2) == 0) {
                this.f28921b = "";
            } else {
                this.f28921b = str2;
            }
            if ((i & 4) == 0) {
                this.f28922c = "";
            } else {
                this.f28922c = str3;
            }
            if ((i & 8) == 0) {
                this.f28923d = "";
            } else {
                this.f28923d = str4;
            }
            if ((i & 16) == 0) {
                this.e = "";
                return;
            } else {
                this.e = str5;
                return;
            }
        }
        eg.p0.e(i, 1, na.f28808a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj;
        if (kotlin.jvm.internal.l.a(this.f28920a, paVar.f28920a) && kotlin.jvm.internal.l.a(this.f28921b, paVar.f28921b) && kotlin.jvm.internal.l.a(this.f28922c, paVar.f28922c) && kotlin.jvm.internal.l.a(this.f28923d, paVar.f28923d) && kotlin.jvm.internal.l.a(this.e, paVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + a.e(this.f28923d, a.e(this.f28922c, a.e(this.f28921b, this.f28920a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("TapeDef(id=", this.f28920a, ", file=", this.f28921b, ", name=");
        a.t(q10, this.f28922c, ", color=", this.f28923d, ", pattern=");
        return a.k(q10, this.e, ")");
    }
}
