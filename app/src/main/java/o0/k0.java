package o0;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final k0 f21537v;

    /* renamed from: w, reason: collision with root package name */
    public static final k0 f21538w;

    /* renamed from: x, reason: collision with root package name */
    public static final k0 f21539x;

    /* renamed from: y, reason: collision with root package name */
    public static final k0 f21540y;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21541u;

    static {
        int i = 1;
        f21537v = new k0(i, 0);
        f21538w = new k0(i, 1);
        f21539x = new k0(i, 2);
        f21540y = new k0(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i, int i10) {
        super(i);
        this.f21541u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f21541u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                return zVar;
            case 1:
                return zVar;
            case 2:
                kf.g[] gVarArr = j2.u.f18865a;
                j2.v vVar = j2.s.f18848l;
                kf.g gVar = j2.u.f18865a[5];
                ((j2.j) obj).k(vVar, Boolean.TRUE);
                return zVar;
            default:
                return zVar;
        }
    }
}
