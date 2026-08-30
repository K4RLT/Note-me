package q;
import j1.b;
import j1.c;
import j1.e;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.m implements df.l {
    public static final z0 A;
    public static final z0 B;
    public static final z0 C;
    public static final z0 D;
    public static final z0 E;
    public static final z0 F;
    public static final z0 G;
    public static final z0 H;
    public static final z0 I;
    public static final z0 J;
    public static final z0 K;
    public static final z0 L;
    public static final z0 M;
    public static final z0 N;
    public static final z0 O;

    /* renamed from: v, reason: collision with root package name */
    public static final z0 f23040v;

    /* renamed from: w, reason: collision with root package name */
    public static final z0 f23041w;

    /* renamed from: x, reason: collision with root package name */
    public static final z0 f23042x;

    /* renamed from: y, reason: collision with root package name */
    public static final z0 f23043y;

    /* renamed from: z, reason: collision with root package name */
    public static final z0 f23044z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23045u;

    static {
        int i = 1;
        f23040v = new z0(i, 0);
        f23041w = new z0(i, 1);
        f23042x = new z0(i, 2);
        f23043y = new z0(i, 3);
        f23044z = new z0(i, 4);
        A = new z0(i, 5);
        B = new z0(i, 6);
        C = new z0(i, 7);
        D = new z0(i, 8);
        E = new z0(i, 9);
        F = new z0(i, 10);
        G = new z0(i, 11);
        H = new z0(i, 12);
        I = new z0(i, 13);
        J = new z0(i, 14);
        K = new z0(i, 15);
        L = new z0(i, 16);
        M = new z0(i, 17);
        N = new z0(i, 18);
        O = new z0(i, 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i, int i10) {
        super(i);
        this.f23045u = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f23045u) {
            case 0:
                return pe.z.f22715a;
            case 1:
                ((df.a) obj).invoke();
                return pe.z.f22715a;
            case 2:
                long j10 = ((y2.g) obj).f30806a;
                return new n(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            case 3:
                n nVar = (n) obj;
                float f10 = nVar.f22955a;
                float f11 = nVar.f22956b;
                return new y2.g((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
            case 4:
                return new m(((y2.f) obj).f30805u);
            case 5:
                return new y2.f(((m) obj).f22945a);
            case 6:
                return new m(((Number) obj).floatValue());
            case 7:
                return Float.valueOf(((m) obj).f22945a);
            case 8:
                long j11 = ((y2.j) obj).f30808a;
                return new n((int) (j11 >> 32), (int) (j11 & 4294967295L));
            case 9:
                n nVar2 = (n) obj;
                return new y2.j((Math.round(nVar2.f22955a) << 32) | (Math.round(nVar2.f22956b) & 4294967295L));
            case 10:
                long j12 = ((y2.l) obj).f30813a;
                return new n((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 11:
                n nVar3 = (n) obj;
                int round = Math.round(nVar3.f22955a);
                int i = 0;
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(nVar3.f22956b);
                if (round2 >= 0) {
                    i = round2;
                }
                return new y2.l((i & 4294967295L) | (round << 32));
            case 12:
                return new m(((Number) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((m) obj).f22945a);
            case 14:
                long j13 = ((b) obj).f18762a;
                return new n(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)));
            case 15:
                n nVar4 = (n) obj;
                float f12 = nVar4.f22955a;
                float f13 = nVar4.f22956b;
                return new b((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
            case 16:
                c cVar = (c) obj;
                return new p(cVar.f18763a, cVar.f18764b, cVar.f18765c, cVar.f18766d);
            case 17:
                p pVar = (p) obj;
                return new c(pVar.f22966a, pVar.f22967b, pVar.f22968c, pVar.f22969d);
            case 18:
                long j14 = ((e) obj).f18774a;
                return new n(Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            default:
                n nVar5 = (n) obj;
                float f14 = nVar5.f22955a;
                float f15 = nVar5.f22956b;
                return new e((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
        }
    }
}
