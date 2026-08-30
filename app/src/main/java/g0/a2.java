package g0;
import r.u0;
import r0.g0;
import r0.y;
import t.s1;

/* loaded from: classes.dex */
public final class a2 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f17014a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f17015b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f17016c;

    public a2(s1 s1Var, d2 d2Var) {
        this.f17014a = s1Var;
        this.f17015b = y.r(new z1(d2Var, 1));
        this.f17016c = y.r(new z1(d2Var, 0));
    }

    @Override // s1
    public final boolean a() {
        return this.f17014a.a();
    }

    @Override // s1
    public final boolean b() {
        return ((Boolean) this.f17016c.getValue()).booleanValue();
    }

    @Override // s1
    public final boolean c() {
        return ((Boolean) this.f17015b.getValue()).booleanValue();
    }

    @Override // s1
    public final float d(float f10) {
        return this.f17014a.d(f10);
    }

    @Override // s1
    public final Object e(u0 u0Var, df.p pVar, te.c cVar) {
        return this.f17014a.e(u0Var, pVar, cVar);
    }
}
