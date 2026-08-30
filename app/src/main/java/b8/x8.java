package b8;
import d1.r;
import r0.m;
import r0.y;
import x7.j;

/* loaded from: classes.dex */
public final /* synthetic */ class x8 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2985u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2986v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2987w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f2988x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.a f2989y;

    public /* synthetic */ x8(String str, boolean z3, r rVar, df.a aVar, int i) {
        this.f2986v = str;
        this.f2987w = z3;
        this.f2988x = rVar;
        this.f2989y = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2985u) {
            case 0:
                ((Integer) obj2).getClass();
                z9.l(y.L(1), this.f2988x, this.f2989y, this.f2986v, (m) obj, this.f2987w);
                break;
            default:
                ((Integer) obj2).getClass();
                j.d(y.L(1), this.f2988x, this.f2989y, this.f2986v, (m) obj, this.f2987w);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ x8(String str, boolean z3, df.a aVar, r rVar, int i) {
        this.f2986v = str;
        this.f2987w = z3;
        this.f2989y = aVar;
        this.f2988x = rVar;
    }
}
