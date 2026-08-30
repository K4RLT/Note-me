package b8;
import r0.m;
import r0.y;
import r4.a;

/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2359u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x.p f2360v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2361w;

    public /* synthetic */ l4(x.p pVar, int i, int i10) {
        this.f2359u = i10;
        this.f2360v = pVar;
        this.f2361w = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2359u;
        m mVar = (m) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                r4.d(this.f2360v, mVar, y.L(this.f2361w | 1));
                break;
            default:
                a(this.f2360v, mVar, y.L(this.f2361w | 1));
                break;
        }
        return pe.z.f22715a;
    }
}
