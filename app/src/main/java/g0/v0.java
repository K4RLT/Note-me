package g0;
import a.a;
import l.a;
import p.a;
import z1.a1;
import z1.o0;
import z1.q0;
import z1.r0;
import z1.z;

/* loaded from: classes.dex */
public final class v0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f17310a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17311b;

    /* renamed from: c, reason: collision with root package name */
    public final r2.c0 f17312c;

    /* renamed from: d, reason: collision with root package name */
    public final df.a f17313d;

    public v0(d2 d2Var, int i, r2.c0 c0Var, df.a aVar) {
        this.f17310a = d2Var;
        this.f17311b = i;
        this.f17312c = c0Var;
        this.f17313d = aVar;
    }

    @Override // z
    public final q0 c(r0 r0Var, o0 o0Var, long j10) {
        long j11;
        if (o0Var.n(y2.a.g(j10)) < y2.a.h(j10)) {
            j11 = j10;
        } else {
            j11 = j10;
            j10 = y2.a(j11, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        a1 z3 = o0Var.z(j10);
        int min = Math.min(z3.f31769u, y2.a.h(j11));
        return r0Var.u0(min, z3.f31770v, qe.t.f24024u, new u0(r0Var, this, z3, min, 0));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (!this.f17310a.equals(v0Var.f17310a) || this.f17311b != v0Var.f17311b || !this.f17312c.equals(v0Var.f17312c) || !kotlin.jvm.internal.a(this.f17313d, v0Var.f17313d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17313d.hashCode() + ((this.f17312c.hashCode() + a.b(this.f17311b, this.f17310a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f17310a + ", cursorOffset=" + this.f17311b + ", transformedText=" + this.f17312c + ", textLayoutResultProvider=" + this.f17313d + ')';
    }
}
