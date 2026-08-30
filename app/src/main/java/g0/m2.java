package g0;
import a.a;
import z1.a1;
import z1.o0;
import z1.q0;
import z1.r0;
import z1.z;

/* loaded from: classes.dex */
public final class m2 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f17211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17212b;

    /* renamed from: c, reason: collision with root package name */
    public final r2.c0 f17213c;

    /* renamed from: d, reason: collision with root package name */
    public final df.a f17214d;

    public m2(d2 d2Var, int i, r2.c0 c0Var, df.a aVar) {
        this.f17211a = d2Var;
        this.f17212b = i;
        this.f17213c = c0Var;
        this.f17214d = aVar;
    }

    @Override // z
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        a1 z3 = o0Var.z(y2.a(j10, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(z3.f31770v, y2.a.g(j10));
        return r0Var.u0(z3.f31769u, min, qe.t.f24024u, new u0(r0Var, this, z3, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m2) {
                m2 m2Var = (m2) obj;
                if (!this.f17211a.equals(m2Var.f17211a) || this.f17212b != m2Var.f17212b || !this.f17213c.equals(m2Var.f17213c) || !kotlin.jvm.internal.a(this.f17214d, m2Var.f17214d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17214d.hashCode() + ((this.f17213c.hashCode() + a.b(this.f17212b, this.f17211a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f17211a + ", cursorOffset=" + this.f17212b + ", transformedText=" + this.f17213c + ", textLayoutResultProvider=" + this.f17214d + ')';
    }
}
