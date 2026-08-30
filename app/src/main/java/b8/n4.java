package b8;
import b2.l0;
import eb.w;
import k1.l0;
import k1.m0;
import k1.r;
import m.h;
import m1.d;
import m1.h;

/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2443u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f2444v;

    public /* synthetic */ n4(int i, float f10) {
        this.f2443u = i;
        this.f2444v = f10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        switch (this.f2443u) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.m(l0.k(0.5f, 0.0f));
                m0Var.g(this.f2444v);
                return pe.z.f22715a;
            case 1:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                l0Var.b();
                float l0 = l0Var.l0(this.f2444v);
                long floatToRawIntBits = (Float.floatToRawIntBits(l0) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L);
                r rVar = new r(r.c(r.f19515d, 0.15f));
                long j10 = r.f19520k;
                d.L(l0Var, w.k(qe.h(rVar, new r(j10)), 0.0f, 0.0f, 14), 0L, 0L, floatToRawIntBits, new h(l0Var.l0((float) 1.5d), 0.0f, 0, 0, null, 30), 214);
                d.L(l0Var, w.k(qe.h(new r(j10), new r(r.c(r.f19513b, 0.8f))), 0.0f, 0.0f, 14), 0L, 0L, floatToRawIntBits, new h(l0Var.l0(2), 0.0f, 0, 0, null, 30), 214);
                return pe.z.f22715a;
            case 2:
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                if (this.f2444v > 0.001f) {
                    l0Var2.b();
                }
                return pe.z.f22715a;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                if (this.f2444v != 0.0f ? floatValue > 0.0f : floatValue < 0.0f) {
                    i = 1;
                } else {
                    i = -1;
                }
                return Integer.valueOf(i);
            case 4:
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                float f10 = this.f2444v;
                m0Var2.h(f10);
                m0Var2.i(f10);
                return pe.z.f22715a;
            case 5:
                m0 m0Var3 = (m0) obj;
                m0Var3.getClass();
                m0Var3.g(this.f2444v);
                return pe.z.f22715a;
            case 6:
                m0 m0Var4 = (m0) obj;
                m0Var4.getClass();
                m0Var4.b(this.f2444v);
                return pe.z.f22715a;
            default:
                d dVar = (d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) / 2.0f;
                float l02 = dVar.l0(3);
                long j11 = r.f19515d;
                float f11 = intBitsToFloat - l02;
                float f12 = l02 * 2.0f;
                d.z0(dVar, r.c(j11, 0.16f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e() >> 32))) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(l02) & 4294967295L) | (Float.floatToRawIntBits(l02) << 32), null, 240);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float f13 = this.f2444v;
                d.z0(dVar, r.c(j11, 0.75f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2 * f13) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(l02) & 4294967295L) | (Float.floatToRawIntBits(l02) << 32), null, 240);
                d.D(dVar, j11, dVar.l0(9), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e() >> 32)) * f13) << 32), null, 120);
                return pe.z.f22715a;
        }
    }
}
