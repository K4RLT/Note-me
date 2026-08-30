package xa;
import p.a;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class a2 extends i1 {

    /* renamed from: b, reason: collision with root package name */
    public final char f30359b;

    public a2(char c10) {
        this.f30359b = c10;
    }

    @Override // xa.u0
    public final void j(BitSet bitSet) {
        bitSet.set(this.f30359b);
    }

    @Override // xa.u0
    public final boolean t(char c10) {
        if (c10 == this.f30359b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return a.k("CharMatcher.is('", u0.L(this.f30359b), "')");
    }
}
