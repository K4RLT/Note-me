package o0;
import f1.e;
import j1.e;
import m1.d;
import m1.h;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ long A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ df.a f21721u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f21722v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f21723w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f21724x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f21725y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h f21726z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(df.a aVar, int i, float f10, float f11, long j10, h hVar, long j11) {
        super(1);
        this.f21721u = aVar;
        this.f21722v = i;
        this.f21723w = f10;
        this.f21724x = f11;
        this.f21725y = j10;
        this.f21726z = hVar;
        this.A = j11;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        float floatValue = ((Number) this.f21721u.invoke()).floatValue() * 360.0f;
        int i = this.f21722v;
        float f10 = this.f21723w;
        if (i != 0 && e.b(dVar.e()) <= e.d(dVar.e())) {
            f10 += this.f21724x;
        }
        float a02 = (f10 / ((float) (dVar.a0(e.d(dVar.e())) * 3.141592653589793d))) * 360.0f;
        float min = Math.min(floatValue, a02) + 270.0f + floatValue;
        float min2 = (360.0f - floatValue) - (Math.min(floatValue, a02) * 2);
        long j10 = this.f21725y;
        h hVar = this.f21726z;
        e(dVar, min, min2, j10, hVar);
        e(dVar, 270.0f, floatValue, this.A, hVar);
        return pe.z.f22715a;
    }
}
