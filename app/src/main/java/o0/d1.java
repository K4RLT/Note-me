package o0;
import f1.d;
import j1.e;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21447u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f21448v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.a f21449w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f21450x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f21451y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.l f21452z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i, float f10, df.a aVar, long j10, long j11, df.l lVar) {
        super(1);
        this.f21447u = i;
        this.f21448v = f10;
        this.f21449w = aVar;
        this.f21450x = j10;
        this.f21451y = j11;
        this.f21452z = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        float b10 = e.b(dVar.e());
        int i = this.f21447u;
        float f10 = this.f21448v;
        if (i != 0 && e.b(dVar.e()) <= e.d(dVar.e())) {
            f10 += dVar.a0(b10);
        }
        float a02 = f10 / dVar.a0(e.d(dVar.e()));
        float floatValue = ((Number) this.f21449w.invoke()).floatValue();
        float min = Math.min(floatValue, a02) + floatValue;
        if (min <= 1.0f) {
            d(dVar, min, 1.0f, this.f21450x, b10, this.f21447u);
        }
        d(dVar, 0.0f, floatValue, this.f21451y, b10, this.f21447u);
        this.f21452z.invoke(dVar);
        return pe.z.f22715a;
    }
}
