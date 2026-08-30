package r0;
import v1.z;

/* loaded from: classes.dex */
public final class x0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24432u = 1;

    /* renamed from: v, reason: collision with root package name */
    public Object f24433v;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(df.l lVar) {
        this.f24433v = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f24432u) {
            case 0:
                return ((kotlin.jvm.internal.m) this.f24433v).invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                z zVar = (z) this.f24433v;
                if (zVar != null) {
                    zVar.f27374c = booleanValue;
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ x0() {
    }
}
