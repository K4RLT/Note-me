package b8;
import b2.l0;
import k1.m0;
import k1.r;
import m1.b;
import m1.d;
import m1.h;
import r0.n2;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class c5 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1917u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q.d f1918v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f1919w;

    public /* synthetic */ c5(q.d dVar, n2 n2Var, int i) {
        this.f1917u = i;
        this.f1918v = dVar;
        this.f1919w = n2Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f1917u) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.b(((Number) this.f1918v.e()).floatValue() * ((Number) this.f1919w.getValue()).floatValue());
                break;
            case 1:
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                m0Var2.f(true);
                n2 n2Var = this.f1919w;
                m0Var2.k(new e(((Number) ((pe.j) n2Var.getValue()).f22693u).floatValue(), ((Number) ((pe.j) n2Var.getValue()).f22694v).floatValue(), ((Number) this.f1918v.e()).floatValue()));
                break;
            default:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                b bVar = l0Var.f1533u;
                l0Var.b();
                float floatValue = ((Number) this.f1918v.e()).floatValue();
                if (floatValue > 0.0f && floatValue < 1.0f) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (bVar.e() >> 32));
                    n2 n2Var2 = this.f1919w;
                    float floatValue2 = ((Number) ((pe.j) n2Var2.getValue()).f22693u).floatValue() * intBitsToFloat;
                    float floatValue3 = ((Number) ((pe.j) n2Var2.getValue()).f22694v).floatValue() * Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
                    float hypot = (float) Math.hypot(Math.max(floatValue2, Float.intBitsToFloat((int) (bVar.e() >> 32)) - floatValue2), Math.max(floatValue3, Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) - floatValue3));
                    float l0 = l0Var.l0(2);
                    float f10 = (hypot * floatValue) - (l0 / 2.0f);
                    if (f10 > 0.0f) {
                        d.D(l0Var, r.c(r.f19515d, (1.0f - floatValue) * 0.3f), f10, (Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(floatValue3) & 4294967295L), new h(l0, 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                    }
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }
}
