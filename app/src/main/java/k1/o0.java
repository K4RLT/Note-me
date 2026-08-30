package k1;
import b.c;
import p.a;
import u.a;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d, reason: collision with root package name */
    public static final o0 f19508d = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final long f19509a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19510b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19511c;

    public /* synthetic */ o0() {
        this(l0.d(4278190080L), 0L, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                long j10 = o0Var.f19509a;
                int i = r.f19522m;
                if (pe.a(this.f19509a, j10) && j1.c(this.f19510b, o0Var.f19510b) && this.f19511c == o0Var.f19511c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Float.hashCode(this.f19511c) + a.d(this.f19510b, Long.hashCode(this.f19509a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        a.u(this.f19509a, sb2, ", offset=");
        sb2.append((Object) j1.b.j(this.f19510b));
        sb2.append(", blurRadius=");
        return a.m(sb2, this.f19511c, ')');
    }

    public o0(long j10, long j11, float f10) {
        this.f19509a = j10;
        this.f19510b = j11;
        this.f19511c = f10;
    }
}
