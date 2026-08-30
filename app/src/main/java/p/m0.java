package p;
import d1.e;
import j.b;
import l.a;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22206u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0 f22207v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f22208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(o0 o0Var, long j10, int i) {
        super(1);
        this.f22206u = i;
        this.f22207v = o0Var;
        this.f22208w = j10;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.l
    public final Object invoke(Object obj) {
        df.l lVar;
        df.l lVar2;
        long j10;
        int ordinal;
        long j11;
        long j12;
        switch (this.f22206u) {
            case 0:
                int ordinal2 = ((g0) obj).ordinal();
                o0 o0Var = this.f22207v;
                long j13 = this.f22208w;
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            b0 b0Var = o0Var.N.f22233a.f22280c;
                            if (b0Var != null && (lVar2 = b0Var.f22103b) != null) {
                                j13 = ((y2.l) lVar2.invoke(new y2.l(j13))).f30813a;
                            }
                        } else {
                            l4.a.o();
                            return null;
                        }
                    }
                } else {
                    b0 b0Var2 = o0Var.M.f22224a.f22280c;
                    if (b0Var2 != null && (lVar = b0Var2.f22103b) != null) {
                        j13 = ((y2.l) lVar.invoke(new y2.l(j13))).f30813a;
                    }
                }
                return new y2.l(j13);
            case 1:
                g0 g0Var = (g0) obj;
                o0 o0Var2 = this.f22207v;
                if (o0Var2.Q != null && o0Var2.Y0() != null && !kotlin.jvm.internal.a(o0Var2.Q, o0Var2.Y0()) && (ordinal = g0Var.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        b0 b0Var3 = o0Var2.N.f22233a.f22280c;
                        if (b0Var3 != null) {
                            df.l lVar3 = b0Var3.f22103b;
                            long j14 = this.f22208w;
                            long j15 = ((y2.l) lVar3.invoke(new y2.l(j14))).f30813a;
                            e Y0 = o0Var2.Y0();
                            Y0.getClass();
                            y2.m mVar = y2.m.f30814u;
                            long a10 = Y0.a(j14, j15, mVar);
                            e eVar = o0Var2.Q;
                            eVar.getClass();
                            j10 = y2.b(a10, eVar.a(j14, j15, mVar));
                            return new y2.j(j10);
                        }
                    } else {
                        l4.a.o();
                        return null;
                    }
                }
                j10 = 0;
                return new y2.j(j10);
            default:
                g0 g0Var2 = (g0) obj;
                o0 o0Var3 = this.f22207v;
                t1 t1Var = o0Var3.M.f22224a.f22279b;
                long j16 = this.f22208w;
                long j17 = 0;
                if (t1Var != null) {
                    j11 = ((y2.j) t1Var.f22260a.invoke(new y2.l(j16))).f30808a;
                } else {
                    j11 = 0;
                }
                t1 t1Var2 = o0Var3.N.f22233a.f22279b;
                if (t1Var2 != null) {
                    j12 = ((y2.j) t1Var2.f22260a.invoke(new y2.l(j16))).f30808a;
                } else {
                    j12 = 0;
                }
                int ordinal3 = g0Var2.ordinal();
                if (ordinal3 != 0) {
                    if (ordinal3 != 1) {
                        if (ordinal3 == 2) {
                            j17 = j12;
                        } else {
                            l4.a.o();
                            return null;
                        }
                    }
                } else {
                    j17 = j11;
                }
                return new y2.j(j17);
        }
    }
}
