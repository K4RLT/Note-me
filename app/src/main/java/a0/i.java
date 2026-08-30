package a0;
import m.h;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final i f63v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f64w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f65u;

    static {
        int i = 2;
        f63v = new i(i, 0);
        f64w = new i(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i10) {
        super(i);
        this.f65u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65u) {
            case 0:
                ((Number) obj2).intValue();
                return new c(1);
            default:
                l0 l0Var = (l0) obj2;
                return qe.h(Integer.valueOf(l0Var.f89d.f28b.h()), Integer.valueOf(l0Var.f89d.f29c.h()));
        }
    }
}
