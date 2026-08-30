package t;
import b0.i;
import r.u0;
import r.w0;
import r0.i1;
import r0.y;
import t.s1;

/* loaded from: classes.dex */
public final class l implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f25445a;

    /* renamed from: b, reason: collision with root package name */
    public final k f25446b = new k(this);

    /* renamed from: c, reason: collision with root package name */
    public final w0 f25447c = new w0();

    /* renamed from: d, reason: collision with root package name */
    public final i1 f25448d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f25449f;

    /* JADX WARN: Multi-variable type inference failed */
    public l(df.l lVar) {
        this.f25445a = (kotlin.jvm.internal.m) lVar;
        Boolean bool = Boolean.FALSE;
        this.f25448d = y.B(bool);
        this.e = y.B(bool);
        this.f25449f = y.B(bool);
    }

    @Override // s1
    public final boolean a() {
        return ((Boolean) this.f25448d.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.m, df.l] */
    @Override // s1
    public final float d(float f10) {
        return ((Number) this.f25445a.invoke(Float.valueOf(f10))).floatValue();
    }

    @Override // s1
    public final Object e(u0 u0Var, df.p pVar, te.c cVar) {
        Object i = pf.i(new a6.f(this, u0Var, pVar, (te.c) null, 29), cVar);
        if (i == ue.a.f27192u) {
            return i;
        }
        return pe.z.f22715a;
    }
}
