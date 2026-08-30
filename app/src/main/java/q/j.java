package q;
import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f22923a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22924b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22925c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.m f22926d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public q f22927f;

    /* renamed from: g, reason: collision with root package name */
    public long f22928g;

    /* renamed from: h, reason: collision with root package name */
    public long f22929h = Long.MIN_VALUE;
    public final i1 i = y.B(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public j(Object obj, l1 l1Var, q qVar, long j10, Object obj2, long j11, df.a aVar) {
        this.f22923a = l1Var;
        this.f22924b = obj2;
        this.f22925c = j11;
        this.f22926d = (kotlin.jvm.internal.m) aVar;
        this.e = y.B(obj);
        this.f22927f = e.j(qVar);
        this.f22928g = j10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.m, df.a] */
    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.f22926d.invoke();
    }
}
