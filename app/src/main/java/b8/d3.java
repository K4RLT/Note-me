package b8;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class d3 {
    public static final c3 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f1968a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1970c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1971d;
    public final int e;

    public /* synthetic */ d3(int i, int i10, int i11, String str, String str2, boolean z3) {
        this.f1968a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.f1969b = null;
        } else {
            this.f1969b = str2;
        }
        this.f1970c = (i & 4) == 0 ? 1 : i10;
        if ((i & 8) == 0) {
            this.f1971d = false;
        } else {
            this.f1971d = z3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        if (kotlin.jvm.internal.a(this.f1968a, d3Var.f1968a) && kotlin.jvm.internal.a(this.f1969b, d3Var.f1969b) && this.f1970c == d3Var.f1970c && this.f1971d == d3Var.f1971d && this.e == d3Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f1968a.hashCode() * 31;
        String str = this.f1969b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.e) + a.c(a.b(this.f1970c, (hashCode2 + hashCode) * 31, 31), 31, this.f1971d);
    }

    public final String toString() {
        StringBuilder q10 = a.q("Row(id=", this.f1968a, ", price_tier=", this.f1969b, ", min_app_version=");
        q10.append(this.f1970c);
        q10.append(", published=");
        q10.append(this.f1971d);
        q10.append(", sort_order=");
        return a.j(this.e, ")", q10);
    }
}
