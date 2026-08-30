package s6;
import g.a;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24939u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f24940v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f24941w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, int i, int i10) {
        super(1);
        this.f24939u = i10;
        this.f24940v = gVar;
        this.f24941w = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f24939u) {
            case 0:
                return Boolean.valueOf(a(this.f24940v, this.f24941w, ((Number) obj).longValue()));
            default:
                return Boolean.valueOf(a(this.f24940v, this.f24941w, ((Number) obj).longValue()));
        }
    }
}
