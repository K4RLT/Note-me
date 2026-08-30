package w7;
import a5.a;
import k1.r;
import p.a;
import u.a;

/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29209a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29210b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29211c;

    /* renamed from: d, reason: collision with root package name */
    public final r f29212d;

    public u4(String str, int i, long j10, r rVar) {
        this.f29209a = str;
        this.f29210b = i;
        this.f29211c = j10;
        this.f29212d = rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u4) {
                u4 u4Var = (u4) obj;
                if (kotlin.jvm.internal.l.a(this.f29209a, u4Var.f29209a) && this.f29210b == u4Var.f29210b) {
                    long j10 = u4Var.f29211c;
                    int i = r.f19522m;
                    if (!pe.a(this.f29211c, j10) || !kotlin.jvm.internal.l.a(this.f29212d, u4Var.f29212d)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = a.b(this.f29210b, this.f29209a.hashCode() * 31, 31);
        int i = r.f19522m;
        int d2 = a.d(this.f29211c, b10, 31);
        r rVar = this.f29212d;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = Long.hashCode(rVar.f19523a);
        }
        return d2 + hashCode;
    }

    public final String toString() {
        String i = r.i(this.f29211c);
        StringBuilder m4 = a.m("FillDef(id=", this.f29209a, ", labelRes=", this.f29210b, ", colorA=");
        m4.append(i);
        m4.append(", colorB=");
        m4.append(this.f29212d);
        m4.append(")");
        return m4.toString();
    }
}
