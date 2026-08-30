package eb;
import x.o;
import q.x;

/* loaded from: classes.dex */
public abstract class d3 extends e3 {

    /* renamed from: x, reason: collision with root package name */
    public boolean f16111x;

    public d3(h3 h3Var) {
        super(h3Var);
        this.f16125w.L++;
    }

    public abstract boolean A();

    public final void y() {
        if (this.f16111x) {
            return;
        }
        x.o("Not initialized");
    }

    public final void z() {
        if (!this.f16111x) {
            A();
            this.f16125w.M++;
            this.f16111x = true;
            return;
        }
        x.o("Can't initialize twice");
    }
}
