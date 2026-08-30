package z1;
import q.x;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f31839a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f31840b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f31841c = new j1(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final j1 f31842d = new j1(this, 0);
    public final j1 e = new j1(this, 1);

    public k1(m1 m1Var) {
        this.f31839a = m1Var;
    }

    public final j0 a() {
        j0 j0Var = this.f31840b;
        if (j0Var != null) {
            return j0Var;
        }
        x.n("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
