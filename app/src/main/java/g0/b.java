package g0;
import d1.r;
import f.a;
import k0.o;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f17017u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f17018v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17019w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, r rVar, long j10, int i) {
        super(2);
        this.f17017u = oVar;
        this.f17018v = rVar;
        this.f17019w = j10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int L = y.L(1);
        a(this.f17017u, this.f17018v, this.f17019w, (m) obj, L);
        return pe.z.f22715a;
    }
}
