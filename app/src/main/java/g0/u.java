package g0;
import l.a;
import m2.g;
import m2.l0;
import m2.m0;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17296u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2 f17297v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(i2 i2Var, int i) {
        super(0);
        this.f17296u = i;
        this.f17297v = i2Var;
    }

    @Override // df.a
    public final Object invoke() {
        boolean z3;
        boolean z9;
        g gVar;
        l0 l0Var;
        switch (this.f17296u) {
            case 0:
                i2 i2Var = this.f17297v;
                if (i2Var != null) {
                    z3 = ((Boolean) new u(i2Var, 2).invoke()).booleanValue();
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                i2 i2Var2 = this.f17297v;
                if (i2Var2 != null) {
                    z9 = ((Boolean) new u(i2Var2, 2).invoke()).booleanValue();
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            default:
                i2 i2Var3 = this.f17297v;
                g gVar2 = i2Var3.f17134b;
                m0 m0Var = (m0) i2Var3.f17133a.getValue();
                if (m0Var != null && (l0Var = m0Var.f20524a) != null) {
                    gVar = l0Var.f20514a;
                } else {
                    gVar = null;
                }
                return Boolean.valueOf(kotlin.jvm.internal.a(gVar2, gVar));
        }
    }
}
