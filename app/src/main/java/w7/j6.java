package w7;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class j6 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28507u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f28508v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f28509w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28510x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28511y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ pe.d f28512z;

    public /* synthetic */ j6(Object obj, pe.d dVar, df.l lVar, float f10, int i, int i10) {
        this.f28507u = i10;
        this.f28511y = obj;
        this.f28512z = dVar;
        this.f28508v = lVar;
        this.f28509w = f10;
        this.f28510x = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28507u) {
            case 0:
                ((Integer) obj2).intValue();
                n4.D0((u4) this.f28511y, (df.a) this.f28512z, this.f28508v, this.f28509w, (m) obj, y.L(this.f28510x | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                n4.H0((ma) this.f28511y, (df.p) this.f28512z, this.f28508v, this.f28509w, (m) obj, y.L(this.f28510x | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                n4.G0((String) this.f28511y, (df.p) this.f28512z, this.f28508v, this.f28509w, (m) obj, y.L(this.f28510x | 1));
                break;
        }
        return pe.z.f22715a;
    }
}
