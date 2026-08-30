package a0;
import b0.c0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f122u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c0 f123v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f124w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f125x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f126y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(c0 c0Var, long j10, int i, int i10, int i11) {
        super(3);
        this.f122u = i11;
        this.f123v = c0Var;
        this.f124w = j10;
        this.f125x = i;
        this.f126y = i10;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f122u) {
            case 0:
                int intValue = ((Number) obj).intValue();
                int intValue2 = ((Number) obj2).intValue();
                int i = intValue + this.f125x;
                long j10 = this.f124w;
                int g8 = y2.b.g(i, j10);
                int f10 = y2.b.f(intValue2 + this.f126y, j10);
                qe.t tVar = qe.t.f24024u;
                return this.f123v.f1163v.u0(g8, f10, tVar, (df.l) obj3);
            case 1:
                int intValue3 = ((Number) obj).intValue();
                int intValue4 = ((Number) obj2).intValue();
                int i10 = intValue3 + this.f125x;
                long j11 = this.f124w;
                int g10 = y2.b.g(i10, j11);
                int f11 = y2.b.f(intValue4 + this.f126y, j11);
                qe.t tVar2 = qe.t.f24024u;
                return this.f123v.f1163v.u0(g10, f11, tVar2, (df.l) obj3);
            default:
                int intValue5 = ((Number) obj).intValue();
                int intValue6 = ((Number) obj2).intValue();
                int i11 = intValue5 + this.f125x;
                long j12 = this.f124w;
                int g11 = y2.b.g(i11, j12);
                int f12 = y2.b.f(intValue6 + this.f126y, j12);
                qe.t tVar3 = qe.t.f24024u;
                return this.f123v.f1163v.u0(g11, f12, tVar3, (df.l) obj3);
        }
    }
}
