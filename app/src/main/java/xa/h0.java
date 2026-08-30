package xa;
import p.a;

/* loaded from: classes.dex */
public final class h0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f30423a;

    public h0(i0 i0Var) {
        this.f30423a = i0Var;
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        if (l2Var.c0() == 9) {
            l2Var.Y();
            return null;
        }
        return this.f30423a.a(l2Var);
    }

    public final String toString() {
        return a.k("NullSafeTypeAdapter[", this.f30423a.toString(), "]");
    }
}
