package o0;
import z1.o0;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final s0 f21654v;

    /* renamed from: w, reason: collision with root package name */
    public static final s0 f21655w;

    /* renamed from: x, reason: collision with root package name */
    public static final s0 f21656x;

    /* renamed from: y, reason: collision with root package name */
    public static final s0 f21657y;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21658u;

    static {
        int i = 2;
        f21654v = new s0(i, 0);
        f21655w = new s0(i, 1);
        f21656x = new s0(i, 2);
        f21657y = new s0(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i, int i10) {
        super(i);
        this.f21658u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21658u) {
            case 0:
                return Integer.valueOf(((o0) obj).c(((Number) obj2).intValue()));
            case 1:
                return Integer.valueOf(((o0) obj).n(((Number) obj2).intValue()));
            case 2:
                return Integer.valueOf(((o0) obj).Z(((Number) obj2).intValue()));
            default:
                return Integer.valueOf(((o0) obj).l(((Number) obj2).intValue()));
        }
    }
}
