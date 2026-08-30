package c2;
import i0.m;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f3646u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f3647v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f3648w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(boolean z3, m mVar, String str) {
        super(0);
        this.f3646u = z3;
        this.f3647v = mVar;
        this.f3648w = str;
    }

    @Override // df.a
    public final Object invoke() {
        if (this.f3646u) {
            m mVar = this.f3647v;
            String str = this.f3648w;
            o5.b bVar = (o5.b) mVar.f18055w;
            synchronized (((n8.m) bVar.f21781f)) {
            }
        }
        return pe.z.f22715a;
    }
}
