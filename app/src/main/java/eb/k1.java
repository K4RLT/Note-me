package eb;
import x.o;
import c1.a;
import q.x;

/* loaded from: classes.dex */
public abstract class k1 extends a {

    /* renamed from: w, reason: collision with root package name */
    public boolean f16205w;

    public k1(d1 d1Var) {
        super(d1Var);
        ((d1) this.f3443v).Y++;
    }

    public final void v() {
        if (this.f16205w) {
            return;
        }
        x.o("Not initialized");
    }

    public final void w() {
        if (!this.f16205w) {
            if (!x()) {
                ((d1) this.f3443v).f16100a0.incrementAndGet();
                this.f16205w = true;
                return;
            }
            return;
        }
        x.o("Can't initialize twice");
    }

    public abstract boolean x();
}
