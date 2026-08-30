package fg;
import l.a;

/* loaded from: classes.dex */
public final class t extends d0 {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f16995u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16996v;

    public t(String str, boolean z3) {
        str.getClass();
        this.f16995u = z3;
        this.f16996v = str.toString();
    }

    @Override // fg.d0
    public final String a() {
        return this.f16996v;
    }

    @Override // fg.d0
    public final boolean b() {
        return this.f16995u;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t.class == obj.getClass()) {
                t tVar = (t) obj;
                if (this.f16995u == tVar.f16995u && kotlin.jvm.internal.a(this.f16996v, tVar.f16996v)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16996v.hashCode() + (Boolean.hashCode(this.f16995u) * 31);
    }

    @Override // fg.d0
    public final String toString() {
        boolean z3 = this.f16995u;
        String str = this.f16996v;
        if (z3) {
            StringBuilder sb2 = new StringBuilder();
            gg.a(str, sb2);
            return sb2.toString();
        }
        return str;
    }
}
