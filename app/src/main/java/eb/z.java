package eb;
import x.o;
import q.x;

/* loaded from: classes.dex */
public abstract class z extends a0 {

    /* renamed from: w, reason: collision with root package name */
    public boolean f16467w;

    public z(d1 d1Var) {
        super(d1Var);
        ((d1) this.f3443v).Y++;
    }

    public abstract boolean A();

    public final void y() {
        if (this.f16467w) {
            return;
        }
        x.o("Not initialized");
    }

    public final void z() {
        if (!this.f16467w) {
            if (!A()) {
                ((d1) this.f3443v).f16100a0.incrementAndGet();
                this.f16467w = true;
                return;
            }
            return;
        }
        x.o("Can't initialize twice");
    }
}
