package o0;
import d1.r;
import p1.b;
import r0.m;
import r0.y;
import y.a;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f21733u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f21734v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f21735w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f21736x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f21737y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b bVar, String str, r rVar, long j10, int i) {
        super(2);
        this.f21733u = bVar;
        this.f21734v = str;
        this.f21735w = rVar;
        this.f21736x = j10;
        this.f21737y = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a(this.f21733u, this.f21734v, this.f21735w, this.f21736x, (m) obj, y.L(this.f21737y | 1));
        return pe.z.f22715a;
    }
}
