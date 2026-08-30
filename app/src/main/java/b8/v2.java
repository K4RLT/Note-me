package b8;
import g7.h;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2864u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w7.s9 f2865v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f2866w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.a f2867x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f2868y;

    public /* synthetic */ v2(w7.s9 s9Var, h hVar, df.a aVar, float f10, int i, int i10) {
        this.f2864u = i10;
        this.f2865v = s9Var;
        this.f2866w = hVar;
        this.f2867x = aVar;
        this.f2868y = f10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2864u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(9);
                a3.b(this.f2865v, this.f2866w, this.f2867x, this.f2868y, (m) obj, L);
                break;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(9);
                z9.h(this.f2865v, this.f2866w, this.f2867x, this.f2868y, (m) obj, L2);
                break;
        }
        return pe.z.f22715a;
    }
}
