package z1;
import h1.e;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31861u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q[] f31862v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q[] qVarArr, int i) {
        super(2);
        this.f31861u = i;
        this.f31862v = qVarArr;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31861u) {
            case 0:
                return Float.valueOf(e((z0) obj, true, this.f31862v, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(e((z0) obj, false, this.f31862v, ((Number) obj2).floatValue()));
        }
    }
}
