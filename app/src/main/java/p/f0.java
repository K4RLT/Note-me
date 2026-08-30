package p;
import l.a;
import q.g1;
import q.i1;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22142u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g1 f22143v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g1 g1Var, int i) {
        super(1);
        this.f22142u = i;
        this.f22143v = g1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f22142u) {
            case 0:
                return Boolean.valueOf(!kotlin.jvm.internal.a(obj, this.f22143v.f22905d.getValue()));
            case 1:
                return new i1(this.f22143v, 0);
            default:
                return new i1(this.f22143v, 1);
        }
    }
}
