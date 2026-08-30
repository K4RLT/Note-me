package r;
import j1.b;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24142u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s0 f24143v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, int i) {
        super(0);
        this.f24142u = i;
        this.f24143v = s0Var;
    }

    @Override // df.a
    public final Object invoke() {
        long j10;
        switch (this.f24142u) {
            case 0:
                z1.x xVar = (z1.x) this.f24143v.O.getValue();
                if (xVar != null) {
                    j10 = xVar.W(0L);
                } else {
                    j10 = 9205357640488583168L;
                }
                return new b(j10);
            case 1:
                return new b(this.f24143v.Q);
            default:
                this.f24143v.a1();
                return pe.z.f22715a;
        }
    }
}
