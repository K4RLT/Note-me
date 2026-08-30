package k0;
import j1.b;
import q.n;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: v, reason: collision with root package name */
    public static final o0 f19376v;

    /* renamed from: w, reason: collision with root package name */
    public static final o0 f19377w;

    /* renamed from: x, reason: collision with root package name */
    public static final o0 f19378x;

    /* renamed from: y, reason: collision with root package name */
    public static final o0 f19379y;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19380u;

    static {
        int i = 1;
        f19376v = new o0(i, 0);
        f19377w = new o0(i, 1);
        f19378x = new o0(i, 2);
        f19379y = new o0(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i, int i10) {
        super(i);
        this.f19380u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f19380u) {
            case 0:
                long j10 = ((b) obj).f18762a;
                if ((9223372034707292159L & j10) != 9205357640488583168L) {
                    return new n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
                }
                return q0.f19395a;
            case 1:
                n nVar = (n) obj;
                float f10 = nVar.f22955a;
                float f11 = nVar.f22956b;
                return new b((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            case 2:
                return new a1(((Number) obj).longValue());
            default:
                return pe.z.f22715a;
        }
    }
}
