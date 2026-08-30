package c3;
import b0.u;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3740u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f3741v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(v vVar, int i) {
        super(1);
        this.f3740u = i;
        this.f3741v = vVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3740u) {
            case 0:
                return new u(4, this.f3741v);
            default:
                v vVar = this.f3741v;
                if (vVar.f3812y.f3803a) {
                    vVar.f3811x.invoke();
                }
                return pe.z.f22715a;
        }
    }
}
