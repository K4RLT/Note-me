package r0;
import r0.v1;

/* loaded from: classes.dex */
public final class h0 implements v1 {

    /* renamed from: u, reason: collision with root package name */
    public final df.l f24261u;

    /* renamed from: v, reason: collision with root package name */
    public i0 f24262v;

    public h0(df.l lVar) {
        this.f24261u = lVar;
    }

    @Override // v1
    public final void b() {
        i0 i0Var = this.f24262v;
        if (i0Var != null) {
            i0Var.a();
        }
        this.f24262v = null;
    }

    @Override // v1
    public final void d() {
        this.f24262v = (i0) this.f24261u.invoke(y.f24437b);
    }

    @Override // v1
    public final void a() {
    }
}
