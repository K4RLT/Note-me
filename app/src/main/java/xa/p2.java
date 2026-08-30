package xa;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30499a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f30500b;

    public p2(q2 q2Var) {
        this.f30500b = q2Var.getMessage();
    }

    public final s2 a() {
        switch (this.f30499a) {
            case 0:
                throw new IllegalArgumentException((String) this.f30500b);
            case 1:
                throw new IllegalArgumentException((String) this.f30500b);
            default:
                return (s2) this.f30500b;
        }
    }

    public p2(s2 s2Var) {
        this.f30500b = s2Var;
    }

    public p2(r2 r2Var) {
        this.f30500b = r2Var.getMessage();
    }
}
