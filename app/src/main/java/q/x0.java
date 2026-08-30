package q;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ df.l A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f23025u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23026v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f23027w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f23028x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f23029y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f23030z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(kotlin.jvm.internal.y yVar, Object obj, g gVar, q qVar, l lVar, float f10, df.l lVar2) {
        super(1);
        this.f23025u = yVar;
        this.f23026v = obj;
        this.f23027w = gVar;
        this.f23028x = qVar;
        this.f23029y = lVar;
        this.f23030z = f10;
        this.A = lVar2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        g gVar = this.f23027w;
        j jVar = new j(this.f23026v, gVar.c(), this.f23028x, longValue, gVar.g(), longValue, new w0(0, this.f23029y));
        e.l(jVar, longValue, this.f23030z, this.f23027w, this.f23029y, this.A);
        this.f23025u.f19787u = jVar;
        return pe.z.f22715a;
    }
}
