package p;
import a.a;
import d1.e;
import d1.r;
import r0.m;
import r0.y;
import z0.c;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ c A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f22127u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f22128v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f22129w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d1.e f22130x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f22131y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.l f22132z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, r rVar, df.l lVar, d1.e eVar, String str, df.l lVar2, c cVar, int i, int i10) {
        super(2);
        this.f22127u = obj;
        this.f22128v = rVar;
        this.f22129w = lVar;
        this.f22130x = eVar;
        this.f22131y = str;
        this.f22132z = lVar2;
        this.A = cVar;
        this.B = i;
        this.C = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        androidx.compose.animation.a(this.f22127u, this.f22128v, this.f22129w, this.f22130x, this.f22131y, this.f22132z, this.A, (m) obj, y.L(this.B | 1), this.C);
        return pe.z.f22715a;
    }
}
