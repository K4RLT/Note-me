package pf;
import p.a;

/* loaded from: classes.dex */
public final class p0 implements a1 {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f22778u;

    public p0(boolean z3) {
        this.f22778u = z3;
    }

    @Override // pf.a1
    public final boolean f() {
        return this.f22778u;
    }

    @Override // pf.a1
    public final n1 g() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Empty{");
        if (this.f22778u) {
            str = "Active";
        } else {
            str = "New";
        }
        return a.n(sb2, str, '}');
    }
}
