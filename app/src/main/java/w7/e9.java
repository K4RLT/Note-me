package w7;
import cb.a;
import p.x;
import r0.a1;
import r0.l;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28170u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28171v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28172w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28173x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f28174y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28175z;

    public /* synthetic */ e9(Object obj, u7.m3 m3Var, int i, int i10, a1 a1Var, int i11) {
        this.f28170u = i11;
        this.f28175z = obj;
        this.f28171v = m3Var;
        this.f28172w = i;
        this.f28173x = i10;
        this.f28174y = a1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f28170u) {
            case 0:
                u7.c cVar = (u7.c) this.f28175z;
                m mVar = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                if (cVar != null) {
                    r rVar = (r) mVar;
                    rVar.a0(-236682586);
                    a1 a1Var = this.f28174y;
                    boolean f10 = rVar.f(a1Var);
                    Object O = rVar.O();
                    if (f10 || O == l.f24285a) {
                        O = new u7.k4(a1Var, 27);
                        rVar.k0(O);
                    }
                    n4.I0(cVar, this.f28171v, this.f28172w, this.f28173x, (df.a) O, rVar, 0);
                    rVar.p(false);
                } else {
                    r rVar2 = (r) mVar;
                    rVar2.a0(-256394680);
                    rVar2.p(false);
                }
                return pe.z.f22715a;
            default:
                u7.d dVar = (u7.d) this.f28175z;
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                if (dVar != null) {
                    r rVar3 = (r) mVar2;
                    rVar3.a0(1273601314);
                    a1 a1Var2 = this.f28174y;
                    boolean f11 = rVar3.f(a1Var2);
                    Object O2 = rVar3.O();
                    if (f11 || O2 == l.f24285a) {
                        O2 = new h9(a1Var2, 5);
                        rVar3.k0(O2);
                    }
                    a(dVar, this.f28171v, this.f28172w, this.f28173x, (df.a) O2, rVar3, 0);
                    rVar3.p(false);
                } else {
                    r rVar4 = (r) mVar2;
                    rVar4.a0(1248582268);
                    rVar4.p(false);
                }
                return pe.z.f22715a;
        }
    }
}
