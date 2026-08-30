package g0;
import d1.r;
import f.b;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f17029u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f17030v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f17031w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, int i10, r rVar) {
        super(2);
        this.f17029u = rVar;
        this.f17030v = i;
        this.f17031w = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        b(y.L(this.f17030v | 1), this.f17031w, this.f17029u, (m) obj);
        return pe.z.f22715a;
    }
}
