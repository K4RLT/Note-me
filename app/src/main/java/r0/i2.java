package r0;
import p.k;
import b1.j0;
import b1.p;

/* loaded from: classes.dex */
public final class i2 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public Object f24267c;

    public i2(long j10, Object obj) {
        super(j10);
        this.f24267c = obj;
    }

    @Override // j0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24267c = ((i2) j0Var).f24267c;
    }

    @Override // j0
    public final j0 b(long j10) {
        return new i2(p.k().g(), this.f24267c);
    }
}
