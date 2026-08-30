package p;
import l.a;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22140u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f22141v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj) {
        super(1);
        this.f22140u = i;
        this.f22141v = obj;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f22140u) {
            case 0:
                return Boolean.valueOf(kotlin.jvm.internal.a(obj, this.f22141v));
            default:
                ((Number) obj).intValue();
                return this.f22141v;
        }
    }
}
