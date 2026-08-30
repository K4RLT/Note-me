package b0;
import r0.i1;
import r0.y;
import w.a;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1216a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f1217b;

    /* renamed from: d, reason: collision with root package name */
    public int f1219d;
    public j0 e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1220f;

    /* renamed from: c, reason: collision with root package name */
    public int f1218c = -1;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f1221g = y.B(null);

    public j0(Object obj, k0 k0Var) {
        this.f1216a = obj;
        this.f1217b = k0Var;
    }

    public final j0 a() {
        if (this.f1220f) {
            a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f1219d == 0) {
            this.f1217b.f1224u.add(this);
            j0 j0Var = (j0) this.f1221g.getValue();
            if (j0Var != null) {
                j0Var.a();
            } else {
                j0Var = null;
            }
            this.e = j0Var;
        }
        this.f1219d++;
        return this;
    }

    public final void b() {
        if (!this.f1220f) {
            if (this.f1219d <= 0) {
                a.c("Release should only be called once");
            }
            int i = this.f1219d - 1;
            this.f1219d = i;
            if (i == 0) {
                this.f1217b.f1224u.remove(this);
                j0 j0Var = this.e;
                if (j0Var != null) {
                    j0Var.b();
                }
                this.e = null;
            }
        }
    }
}
