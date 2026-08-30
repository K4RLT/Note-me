package r0;
import r0.p1;

/* loaded from: classes.dex */
public final class c0 extends p1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24197b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24198c;

    public c0(df.l lVar) {
        super(new fg.o(21));
        this.f24198c = new d0(lVar);
    }

    @Override // p1
    public final k9.z a(Object obj) {
        boolean z3;
        boolean z9;
        switch (this.f24197b) {
            case 0:
                if (obj == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new k9.z(this, obj, z3, null, true);
            default:
                if (obj == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return new k9.z(this, obj, z9, (v0) this.f24198c, true);
        }
    }

    @Override // p1
    public q2 b() {
        switch (this.f24197b) {
            case 0:
                return (d0) this.f24198c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(df.a aVar) {
        super(aVar);
        v0 v0Var = v0.f24421z;
        this.f24198c = v0Var;
    }
}
