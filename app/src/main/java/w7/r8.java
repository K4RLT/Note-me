package w7;
import j.f;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class r8 implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29017u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f29018v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f29019w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.a f29020x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f29021y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f29022z;

    public /* synthetic */ r8(df.a aVar, boolean z3, boolean z9, df.p pVar, int i, int i10) {
        this.f29020x = aVar;
        this.f29018v = z3;
        this.f29019w = z9;
        this.A = pVar;
        this.f29021y = i;
        this.f29022z = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29017u) {
            case 0:
                ((Integer) obj2).getClass();
                n4.B0(this.f29020x, this.f29018v, this.f29019w, (df.p) this.A, (m) obj, y.L(this.f29021y | 1), this.f29022z);
                break;
            default:
                ((Integer) obj2).getClass();
                x7.f((String) this.A, this.f29018v, this.f29019w, this.f29020x, (m) obj, y.L(this.f29021y | 1), this.f29022z);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ r8(String str, boolean z3, boolean z9, df.a aVar, int i, int i10) {
        this.A = str;
        this.f29018v = z3;
        this.f29019w = z9;
        this.f29020x = aVar;
        this.f29021y = i;
        this.f29022z = i10;
    }
}
