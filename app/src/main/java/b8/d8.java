package b8;
import r0.m;
import r0.y;
import z0.c;

/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1985u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1986v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f1987w;

    public /* synthetic */ d8(boolean z3, c cVar, int i, int i10) {
        this.f1985u = i10;
        this.f1986v = z3;
        this.f1987w = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f1985u;
        m mVar = (m) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                z9.b(this.f1986v, this.f1987w, mVar, y.L(49));
                break;
            case 1:
                z9.b(this.f1986v, this.f1987w, mVar, y.L(49));
                break;
            case 2:
                z9.a(this.f1986v, this.f1987w, mVar, y.L(49));
                break;
            default:
                z9.a(this.f1986v, this.f1987w, mVar, y.L(49));
                break;
        }
        return pe.z.f22715a;
    }
}
