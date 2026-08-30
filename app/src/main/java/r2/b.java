package r2;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements df.l {
    public static final b A;

    /* renamed from: v, reason: collision with root package name */
    public static final b f24459v;

    /* renamed from: w, reason: collision with root package name */
    public static final b f24460w;

    /* renamed from: x, reason: collision with root package name */
    public static final b f24461x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f24462y;

    /* renamed from: z, reason: collision with root package name */
    public static final b f24463z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24464u;

    static {
        int i = 1;
        f24459v = new b(i, 0);
        f24460w = new b(i, 1);
        f24461x = new b(i, 2);
        f24462y = new b(i, 3);
        f24463z = new b(i, 4);
        A = new b(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i10) {
        super(i);
        this.f24464u = i10;
    }

    @Override // df.l
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.f24464u) {
            case 0:
                float[] fArr = ((k1.d0) obj).f19471a;
                return pe.z.f22715a;
            case 1:
                float[] fArr2 = ((k1.d0) obj).f19471a;
                return pe.z.f22715a;
            case 2:
                return pe.z.f22715a;
            case 3:
                int i = ((i) obj).f24490a;
                return pe.z.f22715a;
            case 4:
                return pe.z.f22715a;
            default:
                int i10 = ((i) obj).f24490a;
                return pe.z.f22715a;
        }
    }
}
