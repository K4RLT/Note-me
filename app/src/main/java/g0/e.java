package g0;
import d1.o;
import d1.r;
import k0.o1;
import k0.p1;
import r0.l;
import r0.m;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: v, reason: collision with root package name */
    public static final e f17052v;

    /* renamed from: w, reason: collision with root package name */
    public static final e f17053w;

    /* renamed from: x, reason: collision with root package name */
    public static final e f17054x;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17055u;

    static {
        int i = 3;
        f17052v = new e(i, 0);
        f17053w = new e(i, 1);
        f17054x = new e(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i10) {
        super(i);
        this.f17055u = i10;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        int i;
        boolean z9;
        int i10;
        switch (this.f17055u) {
            case 0:
                r rVar = (r) obj;
                ((Number) obj3).intValue();
                r rVar2 = (r) ((m) obj2);
                rVar2.a0(-2126899193);
                long j10 = ((o1) rVar2.j(p1.f19390a)).f19381a;
                boolean e = rVar2.e(j10);
                Object O = rVar2.O();
                if (e || O == l.f24285a) {
                    O = new d(j10, 0);
                    rVar2.k0(O);
                }
                r d2 = rVar.d(androidx.compose.ui.draw.a.b(o.f15687a, (df.l) O));
                rVar2.p(false);
                return d2;
            case 1:
                df.p pVar = (df.p) obj;
                m mVar = (m) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (((r) mVar).h(pVar)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar3 = (r) mVar;
                if (rVar3.R(intValue & 1, z3)) {
                    pVar.invoke(rVar3, Integer.valueOf(intValue & 14));
                } else {
                    rVar3.U();
                }
                return pe.z.f22715a;
            default:
                df.p pVar2 = (df.p) obj;
                m mVar2 = (m) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (((r) mVar2).h(pVar2)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue2 |= i10;
                }
                if ((intValue2 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar4 = (r) mVar2;
                if (rVar4.R(intValue2 & 1, z9)) {
                    pVar2.invoke(rVar4, Integer.valueOf(intValue2 & 14));
                } else {
                    rVar4.U();
                }
                return pe.z.f22715a;
        }
    }
}
