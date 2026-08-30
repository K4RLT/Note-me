package q;

/* loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f23035u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f23036v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f23037w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f23038x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f23039y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kotlin.jvm.internal.y yVar, float f10, g gVar, l lVar, df.l lVar2) {
        super(1);
        this.f23035u = yVar;
        this.f23036v = f10;
        this.f23037w = gVar;
        this.f23038x = lVar;
        this.f23039y = lVar2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f23035u.f19787u;
        obj2.getClass();
        e.l((j) obj2, longValue, this.f23036v, this.f23037w, this.f23038x, this.f23039y);
        return pe.z.f22715a;
    }
}
