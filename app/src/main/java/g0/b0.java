package g0;
import b0.u;
import j1.b;
import k0.j1;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17020u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j1 f17021v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(j1 j1Var, int i) {
        super(1);
        this.f17020u = i;
        this.f17021v = j1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f17020u) {
            case 0:
                return new u(8, this.f17021v);
            default:
                long j10 = ((b) obj).f18762a;
                this.f17021v.p();
                return pe.z.f22715a;
        }
    }
}
