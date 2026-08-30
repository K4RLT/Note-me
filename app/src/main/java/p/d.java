package p;
import r.d;
import l1.d;
import q.e;
import q.n;
import q.p;
import r.b;
import r.g;
import r.h;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements df.l {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;

    /* renamed from: v, reason: collision with root package name */
    public static final d f22116v;

    /* renamed from: w, reason: collision with root package name */
    public static final d f22117w;

    /* renamed from: x, reason: collision with root package name */
    public static final d f22118x;

    /* renamed from: y, reason: collision with root package name */
    public static final d f22119y;

    /* renamed from: z, reason: collision with root package name */
    public static final d f22120z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22121u;

    static {
        int i = 1;
        f22116v = new d(i, 0);
        f22117w = new d(i, 1);
        f22118x = new d(i, 2);
        f22119y = new d(i, 3);
        f22120z = new d(i, 4);
        A = new d(i, 5);
        B = new d(i, 6);
        C = new d(i, 7);
        D = new d(i, 8);
        E = new d(i, 9);
        F = new d(i, 10);
        G = new d(i, 11);
        H = new d(i, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i10) {
        super(i);
        this.f22121u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        switch (this.f22121u) {
            case 0:
                return obj;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 3:
                long b10 = k1.b(((k1.r) obj).f19523a, l1.d.f19834x);
                return new p(k1.r.d(b10), k1.h(b10), k1.g(b10), k1.e(b10));
            case 4:
                return obj;
            case 5:
                long j10 = ((k1.t0) obj).f19531a;
                return new n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            case 6:
                n nVar = (n) obj;
                return new k1.t0(k1.l0.k(nVar.f22955a, nVar.f22956b));
            case 7:
                return e.r(0.0f, 0.0f, null, 7);
            case 8:
                ((Number) obj).intValue();
                return 0;
            case 9:
                ((Number) obj).intValue();
                return 0;
            case 10:
                return androidx.compose.animation.c.f427c;
            case 11:
                ((df.a) obj).invoke();
                return pe.z.f22715a;
            case 12:
                if (((g0) obj) == g0.f22153v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 13:
                return new y2.l((((int) (((y2.l) obj).f30813a >> 32)) << 32) | (0 & 4294967295L));
            default:
                return new y2.l((((int) (((y2.l) obj).f30813a >> 32)) << 32) | (0 & 4294967295L));
        }
    }
}
