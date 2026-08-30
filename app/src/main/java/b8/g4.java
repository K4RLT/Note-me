package b8;
import a5.a;
import k1.r;
import p.a;
import u.a;

/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2117a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2118b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2119c;

    public g4(long j10, long j11, long j12) {
        this.f2117a = j10;
        this.f2118b = j11;
        this.f2119c = j12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g4) {
                g4 g4Var = (g4) obj;
                long j10 = g4Var.f2117a;
                int i = r.f19522m;
                if (!pe.a(this.f2117a, j10) || !pe.a(this.f2118b, g4Var.f2118b) || !pe.a(this.f2119c, g4Var.f2119c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Long.hashCode(this.f2119c) + a.d(this.f2118b, Long.hashCode(this.f2117a) * 31, 31);
    }

    public final String toString() {
        String i = r.i(this.f2117a);
        String i10 = r.i(this.f2118b);
        return a.k(a.q("PackagingTheme(cardColor=", i, ", inkColor=", i10, ", accentColor="), r.i(this.f2119c), ")");
    }
}
