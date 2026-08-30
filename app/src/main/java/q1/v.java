package q1;
import p.c0;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public df.l f23306a;

    public abstract void a(m1.d dVar);

    public df.l b() {
        return this.f23306a;
    }

    public final void c() {
        df.l b10 = b();
        if (b10 != null) {
            b10.invoke(this);
        }
    }

    public void d(c0 c0Var) {
        this.f23306a = c0Var;
    }
}
