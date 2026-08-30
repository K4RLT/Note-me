package p;
import b1.b0;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: v, reason: collision with root package name */
    public static final j0 f22182v;

    /* renamed from: w, reason: collision with root package name */
    public static final j0 f22183w;

    /* renamed from: x, reason: collision with root package name */
    public static final j0 f22184x;

    /* renamed from: y, reason: collision with root package name */
    public static final j0 f22185y;

    /* renamed from: z, reason: collision with root package name */
    public static final j0 f22186z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22187u;

    static {
        int i = 0;
        f22182v = new j0(i, 0);
        f22183w = new j0(i, 1);
        f22184x = new j0(i, 2);
        f22185y = new j0(i, 3);
        f22186z = new j0(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, int i10) {
        super(i);
        this.f22187u = i10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f22187u) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            default:
                b0 b0Var = new b0(d.G);
                b0Var.e();
                return b0Var;
        }
    }
}
