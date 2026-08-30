package b8;
import d1.r;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class g8 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2128u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f2129v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f2130w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2131x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2132y;

    public /* synthetic */ g8(int i, long j10, r rVar, int i10) {
        this.f2131x = i;
        this.f2130w = j10;
        this.f2129v = rVar;
        this.f2132y = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2128u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(this.f2132y | 1);
                z9.g(this.f2131x, L, this.f2130w, this.f2129v, (m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                e1.o(y.L(this.f2131x | 1), this.f2132y, this.f2130w, this.f2129v, (m) obj);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ g8(r rVar, long j10, int i, int i10) {
        this.f2129v = rVar;
        this.f2130w = j10;
        this.f2131x = i;
        this.f2132y = i10;
    }
}
