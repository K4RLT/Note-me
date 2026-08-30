package w7;
import j1.b;
import k1.l0;
import r0.a1;
import r0.e1;
import v1.t;

/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements df.p {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27861u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f27862v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f27863w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27864x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27865y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f27866z;

    public /* synthetic */ a4(df.l lVar, String str, a1 a1Var, a1 a1Var2, e1 e1Var, e1 e1Var2) {
        this.f27864x = lVar;
        this.f27865y = str;
        this.f27862v = a1Var;
        this.f27863w = a1Var2;
        this.f27866z = e1Var;
        this.A = e1Var2;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f27861u;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.A;
        a1 a1Var = this.f27866z;
        a1 a1Var2 = this.f27863w;
        a1 a1Var3 = this.f27862v;
        Object obj4 = this.f27865y;
        Object obj5 = this.f27864x;
        switch (i) {
            case 0:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj5;
                e3 e3Var = (e3) obj3;
                a1 a1Var4 = (a1) obj4;
                t tVar = (t) obj;
                tVar.getClass();
                tVar.a();
                float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & ((b) obj2).f18762a)) + vVar.f19784u;
                vVar.f19784u = intBitsToFloat;
                if (intBitsToFloat > 40.0f) {
                    float f10 = j4.f28501a;
                    Boolean bool = Boolean.FALSE;
                    a1Var3.setValue(bool);
                    e3Var.B(false);
                    a1Var2.setValue(bool);
                    a1Var4.setValue(null);
                    a1Var.setValue(bool);
                }
                return zVar;
            default:
                String str = (String) obj4;
                t tVar2 = (t) obj;
                tVar2.getClass();
                tVar2.a();
                a1Var3.setValue(Boolean.TRUE);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (((b) a1Var2.getValue()).f18762a >> 32));
                long j10 = tVar2.f27343c;
                ((e1) a1Var).i(Float.intBitsToFloat((int) (j10 >> 32)) + intBitsToFloat2);
                ((e1) obj3).i(Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat((int) (((b) a1Var2.getValue()).f18762a & 4294967295L)));
                ((df.l) obj5).invoke(new q4(null, l0.c(-11245448), null, b.h(((b) a1Var2.getValue()).f18762a, j10), null, null, str, 176));
                return zVar;
        }
    }

    public /* synthetic */ a4(kotlin.jvm.internal.v vVar, a1 a1Var, e3 e3Var, a1 a1Var2, a1 a1Var3, a1 a1Var4) {
        this.f27864x = vVar;
        this.f27862v = a1Var;
        this.A = e3Var;
        this.f27863w = a1Var2;
        this.f27865y = a1Var3;
        this.f27866z = a1Var4;
    }
}
