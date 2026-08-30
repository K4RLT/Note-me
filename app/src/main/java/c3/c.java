package c3;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements df.l {
    public static final c A;

    /* renamed from: v, reason: collision with root package name */
    public static final c f3751v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f3752w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f3753x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f3754y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f3755z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3756u;

    static {
        int i = 1;
        f3751v = new c(i, 0);
        f3752w = new c(i, 1);
        f3753x = new c(i, 2);
        f3754y = new c(i, 3);
        f3755z = new c(i, 4);
        A = new c(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i10) {
        super(i);
        this.f3756u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f3756u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                kf.g[] gVarArr = j2.u.f18865a;
                ((j2.j) obj).k(j2.s.f18859w, zVar);
                return zVar;
            case 1:
                ((Number) obj).longValue();
                return zVar;
            case 2:
                return zVar;
            case 3:
                kf.g[] gVarArr2 = j2.u.f18865a;
                ((j2.j) obj).k(j2.s.f18858v, zVar);
                return zVar;
            case 4:
                return zVar;
            default:
                x xVar = (x) obj;
                if (xVar.isAttachedToWindow()) {
                    xVar.m();
                }
                return zVar;
        }
    }
}
