package z1;
import d1.q;
import l.c;

/* loaded from: classes.dex */
public final class w0 extends q implements b2.w {
    public df.l I;
    public long J;

    @Override // q
    public final boolean N0() {
        return true;
    }

    @Override // b2.w
    public final void m(long j10) {
        if (!y2.c(this.J, j10)) {
            this.I.invoke(new y2.l(j10));
            this.J = j10;
        }
    }
}
