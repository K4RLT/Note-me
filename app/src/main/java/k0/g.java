package k0;
import a0.y;
import h1.d;
import k1.l;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f19283u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.a f19284v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f19285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j10, df.a aVar, boolean z3) {
        super(1);
        this.f19283u = j10;
        this.f19284v = aVar;
        this.f19285w = z3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        return dVar.b(new y(this.f19284v, this.f19285w, v0.q(dVar, Float.intBitsToFloat((int) (dVar.f17824u.e() >> 32)) / 2.0f), new l(this.f19283u, 5)));
    }
}
