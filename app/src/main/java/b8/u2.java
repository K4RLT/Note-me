package b8;
import g7.h;
import r0.m;
import r0.r;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2817u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w7.s9 f2818v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f2819w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ df.a f2820x;

    public /* synthetic */ u2(w7.s9 s9Var, h hVar, df.a aVar, int i) {
        this.f2817u = i;
        this.f2818v = s9Var;
        this.f2819w = hVar;
        this.f2820x = aVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        int i = this.f2817u;
        boolean z9 = false;
        pe.z zVar = pe.z.f22715a;
        df.a aVar = this.f2820x;
        h hVar = this.f2819w;
        w7.s9 s9Var = this.f2818v;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    a3.c(s9Var, hVar, aVar, rVar, 0);
                } else {
                    rVar.U();
                }
                return zVar;
            case 1:
                num.getClass();
                a3.c(s9Var, hVar, aVar, mVar, y.L(1));
                return zVar;
            case 2:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                }
                r rVar2 = (r) mVar;
                if (rVar2.R(intValue2 & 1, z9)) {
                    w7.r9 r9Var = w7.s9.Companion;
                    z9.i(s9Var, hVar, aVar, rVar2, 8);
                } else {
                    rVar2.U();
                }
                return zVar;
            default:
                num.getClass();
                z9.i(s9Var, hVar, aVar, mVar, y.L(9));
                return zVar;
        }
    }

    public /* synthetic */ u2(w7.s9 s9Var, h hVar, df.a aVar, int i, int i10) {
        this.f2817u = i10;
        this.f2818v = s9Var;
        this.f2819w = hVar;
        this.f2820x = aVar;
    }
}
