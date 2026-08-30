package q;
import n0.b;
import q.g;

/* loaded from: classes.dex */
public final class a1 implements g {
    public final q A;
    public long B;
    public q C;

    /* renamed from: u, reason: collision with root package name */
    public final n1 f22841u;

    /* renamed from: v, reason: collision with root package name */
    public final l1 f22842v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f22843w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f22844x;

    /* renamed from: y, reason: collision with root package name */
    public final q f22845y;

    /* renamed from: z, reason: collision with root package name */
    public final q f22846z;

    public a1(k kVar, l1 l1Var, Object obj, Object obj2, q qVar) {
        q c10;
        this.f22841u = kVar.a(l1Var);
        this.f22842v = l1Var;
        this.f22843w = obj2;
        this.f22844x = obj;
        this.f22845y = (q) l1Var.f22943a.invoke(obj);
        df.l lVar = l1Var.f22943a;
        this.f22846z = (q) lVar.invoke(obj2);
        if (qVar != null) {
            c10 = e.j(qVar);
        } else {
            c10 = ((q) lVar.invoke(obj)).c();
        }
        this.A = c10;
        this.B = -1L;
    }

    @Override // g
    public final boolean a() {
        return this.f22841u.a();
    }

    @Override // g
    public final long b() {
        if (this.B < 0) {
            this.B = this.f22841u.f(this.f22845y, this.f22846z, this.A);
        }
        return this.B;
    }

    @Override // g
    public final l1 c() {
        return this.f22842v;
    }

    @Override // g
    public final q d(long j10) {
        if (!e(j10)) {
            return this.f22841u.m(j10, this.f22845y, this.f22846z, this.A);
        }
        q qVar = this.C;
        if (qVar == null) {
            q u9 = this.f22841u.u(this.f22845y, this.f22846z, this.A);
            this.C = u9;
            return u9;
        }
        return qVar;
    }

    @Override // g
    public final Object f(long j10) {
        if (!e(j10)) {
            q i = this.f22841u.i(j10, this.f22845y, this.f22846z, this.A);
            int b10 = i.b();
            for (int i10 = 0; i10 < b10; i10++) {
                if (Float.isNaN(i.a(i10))) {
                    b("AnimationVector cannot contain a NaN. " + i + ". Animation: " + this + ", playTimeNanos: " + j10);
                }
            }
            return this.f22842v.f22944b.invoke(i);
        }
        return this.f22843w;
    }

    @Override // g
    public final Object g() {
        return this.f22843w;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f22844x + " -> " + this.f22843w + ",initial velocity: " + this.A + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.f22841u;
    }
}
