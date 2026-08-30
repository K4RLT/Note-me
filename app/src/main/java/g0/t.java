package g0;
import b0.b1;
import b1.v;
import m2.m0;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17280u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2 f17281v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f17282w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(i2 i2Var, df.l lVar, int i) {
        super(1);
        this.f17280u = i;
        this.f17281v = i2Var;
        this.f17282w = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f17280u) {
            case 0:
                m0 m0Var = (m0) obj;
                i2 i2Var = this.f17281v;
                if (i2Var != null) {
                    i2Var.f17133a.setValue(m0Var);
                }
                df.l lVar = this.f17282w;
                if (lVar != null) {
                    lVar.invoke(m0Var);
                }
                return pe.z.f22715a;
            default:
                i2 i2Var2 = this.f17281v;
                v vVar = i2Var2.f17135c;
                df.l lVar2 = this.f17282w;
                vVar.add(lVar2);
                return new b1(i2Var2, 7, lVar2);
        }
    }
}
