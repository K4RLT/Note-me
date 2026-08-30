package r;
import a.a;
import k1.l0;
import k1.r;
import l.a;
import p.a;
import u.a;
import x.k0;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f24164a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f24165b;

    public y0() {
        long d2 = l0.d(4284900966L);
        k0 a10 = androidx.compose.foundation.layout.a(3, 0.0f);
        this.f24164a = d2;
        this.f24165b = a10;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (y0.class.equals(cls)) {
                obj.getClass();
                y0 y0Var = (y0) obj;
                long j10 = y0Var.f24164a;
                int i = r.f19522m;
                if (!pe.a(this.f24164a, j10) || !kotlin.jvm.internal.a(this.f24165b, y0Var.f24165b)) {
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
        return this.f24165b.hashCode() + (Long.hashCode(this.f24164a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        a.u(this.f24164a, sb2, ", drawPadding=");
        sb2.append(this.f24165b);
        sb2.append(')');
        return sb2.toString();
    }
}
