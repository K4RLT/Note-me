package c3;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.x f3814u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x f3815v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y2.k f3816w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f3817x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f3818y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kotlin.jvm.internal.x xVar, x xVar2, y2.k kVar, long j10, long j11) {
        super(0);
        this.f3814u = xVar;
        this.f3815v = xVar2;
        this.f3816w = kVar;
        this.f3817x = j10;
        this.f3818y = j11;
    }

    @Override // df.a
    public final Object invoke() {
        x xVar = this.f3815v;
        this.f3814u.f19786u = xVar.getPositionProvider().a(this.f3816w, this.f3817x, xVar.getParentLayoutDirection(), this.f3818y);
        return pe.z.f22715a;
    }
}
