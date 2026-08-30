package p;
import b1.b0;
import b1.v;
import n.i0;
import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class j1 implements z1.m0 {
    public static final Object E = pe.a.c(pe.h.f22691v, j0.f22186z);
    public z1.x A;
    public z1.x B;

    /* renamed from: u, reason: collision with root package name */
    public final pf.z f22188u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z1.m0 f22189v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f22190w;

    /* renamed from: x, reason: collision with root package name */
    public final i1 f22191x = y.B(Boolean.FALSE);

    /* renamed from: y, reason: collision with root package name */
    public final a2.c f22192y = new a2.c(24, this);

    /* renamed from: z, reason: collision with root package name */
    public final i1 f22193z = new i1(this, 0);
    public final v C = new v();
    public final i0 D = new i0();

    public j1(z1.m0 m0Var, pf.z zVar) {
        this.f22188u = zVar;
        this.f22189v = m0Var;
    }

    public final boolean a() {
        return ((Boolean) this.f22191x.getValue()).booleanValue();
    }

    @Override // z1.m0
    public final z1.x b(b2.k1 k1Var) {
        return this.f22189v.b(k1Var);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pe.g] */
    public final void c() {
        if (!this.f22190w) {
            ((b0) E.getValue()).d(this, this.f22193z, this.f22192y);
        }
    }
}
