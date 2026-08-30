package x;
import l.a;
import x.j0;

/* loaded from: classes.dex */
public final class b0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f29945a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f29946b;

    public b0(v0 v0Var, y2.c cVar) {
        this.f29945a = v0Var;
        this.f29946b = cVar;
    }

    @Override // j0
    public final float a(y2.m mVar) {
        v0 v0Var = this.f29945a;
        y2.c cVar = this.f29946b;
        return cVar.Y(v0Var.b(cVar, mVar));
    }

    @Override // j0
    public final float b(y2.m mVar) {
        v0 v0Var = this.f29945a;
        y2.c cVar = this.f29946b;
        return cVar.Y(v0Var.d(cVar, mVar));
    }

    @Override // j0
    public final float c() {
        v0 v0Var = this.f29945a;
        y2.c cVar = this.f29946b;
        return cVar.Y(v0Var.c(cVar));
    }

    @Override // j0
    public final float d() {
        v0 v0Var = this.f29945a;
        y2.c cVar = this.f29946b;
        return cVar.Y(v0Var.a(cVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (kotlin.jvm.internal.a(this.f29945a, b0Var.f29945a) && kotlin.jvm.internal.a(this.f29946b, b0Var.f29946b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29946b.hashCode() + (this.f29945a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f29945a + ", density=" + this.f29946b + ')';
    }
}
