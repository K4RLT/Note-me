package p;
import q.e;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: v, reason: collision with root package name */
    public static final i f22173v;

    /* renamed from: w, reason: collision with root package name */
    public static final i f22174w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22175u;

    static {
        int i = 2;
        f22173v = new i(i, 0);
        f22174w = new i(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, int i10) {
        super(i);
        this.f22175u = i10;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        switch (this.f22175u) {
            case 0:
                long j10 = ((y2.l) obj).f30813a;
                long j11 = ((y2.l) obj2).f30813a;
                long j12 = 1;
                return e.r(0.0f, 400.0f, new y2.l((j12 & 4294967295L) | (j12 << 32)), 1);
            default:
                g0 g0Var = (g0) obj2;
                if (((g0) obj) == g0Var && g0Var == g0.f22154w) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }
}
