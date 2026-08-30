package o0;
import d1.r;
import q1.e;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f21715u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f21716v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21717w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f21718x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f21719y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f21720z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e eVar, String str, r rVar, long j10, int i, int i10) {
        super(2);
        this.f21715u = eVar;
        this.f21716v = str;
        this.f21717w = rVar;
        this.f21718x = j10;
        this.f21719y = i;
        this.f21720z = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        y.b(this.f21715u, this.f21716v, this.f21717w, this.f21718x, (m) obj, y.L(this.f21719y | 1), this.f21720z);
        return pe.z.f22715a;
    }
}
