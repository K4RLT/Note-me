package xa;
import x.m;
import p.a;
import q.x;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class u1 extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30686b;

    /* renamed from: c, reason: collision with root package name */
    public final char f30687c;

    /* renamed from: d, reason: collision with root package name */
    public final char f30688d;

    public u1(char c10, char c11, int i) {
        this.f30686b = i;
        switch (i) {
            case 1:
                this.f30687c = c10;
                this.f30688d = c11;
                return;
            default:
                if (c11 >= c10) {
                    this.f30687c = c10;
                    this.f30688d = c11;
                    return;
                } else {
                    x.m();
                    throw null;
                }
        }
    }

    @Override // xa.u0
    public final void j(BitSet bitSet) {
        switch (this.f30686b) {
            case 0:
                bitSet.set(this.f30687c, this.f30688d + 1);
                return;
            default:
                bitSet.set(this.f30687c);
                bitSet.set(this.f30688d);
                return;
        }
    }

    @Override // xa.u0
    public final boolean t(char c10) {
        switch (this.f30686b) {
            case 0:
                if (this.f30687c <= c10 && c10 <= this.f30688d) {
                    return true;
                }
                return false;
            default:
                if (c10 != this.f30687c && c10 != this.f30688d) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        switch (this.f30686b) {
            case 0:
                return a5.a.h("CharMatcher.inRange('", u0.L(this.f30687c), "', '", u0.L(this.f30688d), "')");
            default:
                return a.l("CharMatcher.anyOf(\"", u0.L(this.f30687c), u0.L(this.f30688d), "\")");
        }
    }
}
