package o0;
import b2.l;
import n0.b;
import n0.j;
import q.k1;
import v.i;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21652u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ t f21653v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i) {
        super(0);
        this.f21652u = i;
        this.f21653v = tVar;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f21652u;
        t tVar = this.f21653v;
        switch (i) {
            case 0:
                return h1.f21504a;
            default:
                g1 g1Var = (g1) l.h(tVar, i1.f21517b);
                b bVar = tVar.O;
                if (g1Var == null) {
                    if (bVar != null) {
                        tVar.Z0(bVar);
                    }
                } else if (bVar == null) {
                    int i10 = 0;
                    r rVar = new r(i10, tVar);
                    s sVar = new s(tVar, i10);
                    i iVar = tVar.K;
                    boolean z3 = tVar.L;
                    float f10 = tVar.M;
                    k1 k1Var = j.f20992a;
                    b bVar2 = new b(iVar, z3, f10, rVar, sVar);
                    tVar.Y0(bVar2);
                    tVar.O = bVar2;
                }
                return pe.z.f22715a;
        }
    }
}
