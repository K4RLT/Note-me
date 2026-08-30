package z1;
import h1.e;

/* loaded from: classes.dex */
public final class n1 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31850u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q[] f31851v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(q[] qVarArr, int i) {
        super(2);
        this.f31850u = i;
        this.f31851v = qVarArr;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31850u) {
            case 0:
                return Float.valueOf(e((z0) obj, true, this.f31851v, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(e((z0) obj, false, this.f31851v, ((Number) obj2).floatValue()));
        }
    }
}
