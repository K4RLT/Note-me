package q;
import l.a;
import q.k;
import q.v;

/* loaded from: classes.dex */
public final class k1 implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f22933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22934b;

    /* renamed from: c, reason: collision with root package name */
    public final w f22935c;

    public k1(int i, w wVar, int i10) {
        this(i, 0, (i10 & 4) != 0 ? y.f23031a : wVar);
    }

    @Override // k
    public final n1 a(l1 l1Var) {
        return new ba.r(this.f22933a, this.f22934b, this.f22935c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (k1Var.f22933a == this.f22933a && k1Var.f22934b == this.f22934b && kotlin.jvm.internal.a(k1Var.f22935c, this.f22935c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f22935c.hashCode() + (this.f22933a * 31)) * 31) + this.f22934b;
    }

    public k1(int i, int i10, w wVar) {
        this.f22933a = i;
        this.f22934b = i10;
        this.f22935c = wVar;
    }

    @Override // v, k
    public final p1 a(l1 l1Var) {
        return new ba.r(this.f22933a, this.f22934b, this.f22935c);
    }
}
