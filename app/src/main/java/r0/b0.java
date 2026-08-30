package r0;
import b0.g;
import r0.v1;

/* loaded from: classes.dex */
public final class b0 implements v1 {

    /* renamed from: u, reason: collision with root package name */
    public final pf.z f24190u;

    public b0(pf.z zVar) {
        this.f24190u = zVar;
    }

    @Override // v1
    public final void a() {
        pf.z zVar = this.f24190u;
        if (zVar instanceof y1) {
            ((y1) zVar).c();
        } else {
            pf.g(zVar, new l0(1));
        }
    }

    @Override // v1
    public final void b() {
        pf.z zVar = this.f24190u;
        if (zVar instanceof y1) {
            ((y1) zVar).c();
        } else {
            pf.g(zVar, new l0(1));
        }
    }

    @Override // v1
    public final void d() {
    }
}
