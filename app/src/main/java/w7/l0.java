package w7;
import j1.b;
import k1.m0;
import p.a;
import r0.a1;
import r0.e1;
import r0.n2;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements df.l {
    public final /* synthetic */ n2 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28598u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f28599v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f28600w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f28601x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f28602y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28603z;

    public /* synthetic */ l0(float f10, float f11, float f12, a1 a1Var, n2 n2Var, n2 n2Var2) {
        this.f28599v = f10;
        this.f28600w = f11;
        this.f28601x = f12;
        this.f28602y = a1Var;
        this.f28603z = n2Var;
        this.A = n2Var2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        switch (this.f28598u) {
            case 0:
                q.d dVar = (q.d) this.f28603z;
                e1 e1Var = (e1) this.A;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                float h3 = (e1Var.h() * 1.04f) + ((Number) dVar.e()).floatValue();
                float f11 = this.f28599v;
                if (f11 == 0.0f) {
                    f10 = this.f28601x;
                } else {
                    f10 = this.f28600w;
                }
                float f12 = f10 * h3;
                if (f11 == 0.0f) {
                    m0Var.n(f12);
                } else {
                    m0Var.r(f12);
                }
                float f13 = 1.0f;
                if (((Boolean) this.f28602y.getValue()).booleanValue()) {
                    f13 = wa.b9.d(1.0f - (Math.abs(h3) * 0.75f), 0.0f, 1.0f);
                }
                m0Var.b(f13);
                break;
            default:
                n2 n2Var = (n2) this.f28603z;
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                a1 a1Var = this.f28602y;
                m0Var2.n(Float.intBitsToFloat((int) (((b) a1Var.getValue()).f18762a >> 32)) - (this.f28599v / 2.0f));
                m0Var2.r(Float.intBitsToFloat((int) (((b) a1Var.getValue()).f18762a & 4294967295L)) - (this.f28600w / 2.0f));
                m0Var2.g(this.f28601x);
                m0Var2.b(((Number) n2Var.getValue()).floatValue());
                n2 n2Var2 = this.A;
                m0Var2.i(((Number) a.g((Number) n2Var2.getValue(), m0Var2, n2Var2)).floatValue());
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ l0(q.d dVar, float f10, float f11, float f12, e1 e1Var, a1 a1Var) {
        this.f28603z = dVar;
        this.f28599v = f10;
        this.f28600w = f11;
        this.f28601x = f12;
        this.A = e1Var;
        this.f28602y = a1Var;
    }
}
