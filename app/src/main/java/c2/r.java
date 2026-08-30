package c2;
import i1.d;
import i1.s;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3630u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f3631v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(d dVar, int i) {
        super(1);
        this.f3630u = i;
        this.f3631v = dVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3630u) {
            case 0:
                return Boolean.valueOf(((s) obj).c1(this.f3631v.f18099a));
            default:
                return Boolean.valueOf(((s) obj).c1(this.f3631v.f18099a));
        }
    }
}
