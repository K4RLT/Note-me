package k0;
import d1.r;
import p.m1;
import r0.m;
import r0.y;
import v0.c;
import v0.f;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19436u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f19437v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f19438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(r rVar, c cVar, int i, int i10) {
        super(2);
        this.f19436u = i10;
        this.f19437v = rVar;
        this.f19438w = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19436u;
        m mVar = (m) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                c(this.f19437v, this.f19438w, mVar, y.L(49));
                return pe.z.f22715a;
            case 1:
                f(this.f19437v, this.f19438w, mVar, y.L(49));
                return pe.z.f22715a;
            default:
                m1.a(this.f19437v, this.f19438w, mVar, y.L(49));
                return pe.z.f22715a;
        }
    }
}
