package o0;
import d.b;
import d1.r;
import r0.m;
import r0.y;
import x.j0;
import z0.c;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ j0 A;
    public final /* synthetic */ int B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21429u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z0.c f21430v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f21431w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f21432x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f21433y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ c0 f21434z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(z0.c cVar, df.a aVar, r rVar, boolean z3, c0 c0Var, j0 j0Var, int i, int i10) {
        super(2);
        this.f21429u = i10;
        this.f21430v = cVar;
        this.f21431w = aVar;
        this.f21432x = rVar;
        this.f21433y = z3;
        this.f21434z = c0Var;
        this.A = j0Var;
        this.B = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21429u) {
            case 0:
                ((Number) obj2).intValue();
                b(this.f21430v, this.f21431w, this.f21432x, this.f21433y, this.f21434z, this.A, (m) obj, y.L(this.B | 1));
                return pe.z.f22715a;
            default:
                ((Number) obj2).intValue();
                b(this.f21430v, this.f21431w, this.f21432x, this.f21433y, this.f21434z, this.A, (m) obj, y.L(this.B | 1));
                return pe.z.f22715a;
        }
    }
}
