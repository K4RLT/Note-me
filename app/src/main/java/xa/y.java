package xa;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class y extends u0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30712b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f30713c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f30714d;

    public y(y yVar, i1 i1Var, String str) {
        this.f30712b = 0;
        this.f30714d = str;
        this.f30712b = 0;
        this.f30713c = i1Var;
    }

    @Override // xa.u0
    public boolean B(CharSequence charSequence) {
        switch (this.f30712b) {
            case 0:
                return this.f30713c.y(charSequence);
            default:
                return super.B(charSequence);
        }
    }

    @Override // xa.u0
    public final void j(BitSet bitSet) {
        switch (this.f30712b) {
            case 0:
                BitSet bitSet2 = new BitSet();
                this.f30713c.j(bitSet2);
                bitSet2.flip(0, 65536);
                bitSet.or(bitSet2);
                return;
            default:
                this.f30713c.j(bitSet);
                ((u0) this.f30714d).j(bitSet);
                return;
        }
    }

    @Override // xa.u0
    public final boolean t(char c10) {
        switch (this.f30712b) {
            case 0:
                return !this.f30713c.t(c10);
            default:
                if (!this.f30713c.t(c10) && !((u0) this.f30714d).t(c10)) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        switch (this.f30712b) {
            case 0:
                return (String) this.f30714d;
            default:
                return a5.a.h("CharMatcher.or(", this.f30713c.toString(), ", ", ((u0) this.f30714d).toString(), ")");
        }
    }

    @Override // xa.u0
    public boolean y(CharSequence charSequence) {
        switch (this.f30712b) {
            case 0:
                return this.f30713c.B(charSequence);
            default:
                return super.y(charSequence);
        }
    }

    public y(u0 u0Var, u0 u0Var2) {
        this.f30712b = 1;
        this.f30713c = u0Var;
        this.f30714d = u0Var2;
    }
}
