package q;
import j1.b;
import r.g;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23014u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.p f23015v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(df.p pVar) {
        super(1);
        this.f23014u = 0;
        l1 l1Var = m1.f22948a;
        this.f23015v = pVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f23014u;
        pe.z zVar = pe.z.f22715a;
        df.p pVar = this.f23015v;
        switch (i) {
            case 0:
                j jVar = (j) obj;
                Object value = jVar.e.getValue();
                l1 l1Var = m1.f22948a;
                pVar.invoke(value, Float.valueOf(((m) jVar.f22927f).f22945a));
                return zVar;
            case 1:
                v1.t tVar = (v1.t) obj;
                pVar.invoke(tVar, new b(v1.g(tVar, false)));
                tVar.a();
                return zVar;
            case 2:
                v1.t tVar2 = (v1.t) obj;
                pVar.invoke(tVar2, Float.valueOf(Float.intBitsToFloat((int) (v1.g(tVar2, false) >> 32))));
                tVar2.a();
                return zVar;
            default:
                v1.t tVar3 = (v1.t) obj;
                pVar.invoke(tVar3, Float.valueOf(Float.intBitsToFloat((int) (v1.g(tVar3, false) & 4294967295L))));
                tVar3.a();
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i, df.p pVar) {
        super(1);
        this.f23014u = i;
        this.f23015v = pVar;
    }
}
