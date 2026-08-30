package w7;
import k1.l0;
import k1.r;

/* loaded from: classes.dex */
public final class n1 implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final n1 f28749v = new n1(0);

    /* renamed from: w, reason: collision with root package name */
    public static final n1 f28750w = new n1(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28751u;

    public /* synthetic */ n1(int i) {
        this.f28751u = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f28751u) {
            case 0:
                long j10 = ((r) obj).f19523a;
                return pe.z.f22715a;
            default:
                return String.valueOf(l0.F(((r) obj).f19523a));
        }
    }
}
