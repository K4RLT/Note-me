package b8;
import d1.r;
import d4.a;
import d4.b;
import eb.w;
import k1.l0;
import m.h;
import m1.d;
import r0.l;
import r0.m;
import r0.q1;
import r0.y;

/* loaded from: classes.dex */
public abstract class d4 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1972a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final float f1973b = (float) 1.4d;

    public static final void a(final r rVar, final float f10, final float f11, m mVar, final int i) {
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-1752722858);
        int i10 = i | 432;
        if ((i10 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            f11 = f1973b;
            final float f12 = f1972a;
            r l10 = androidx.compose.foundation.layout.d.l(rVar, f12, (((float) 0.9d) * 2) + f11);
            Object O = rVar2.O();
            if (O == l.f24285a) {
                O = new df.l() { // from class: b8.b4
                    @Override // df.l
                    public final Object invoke(Object obj) {
                        d dVar = (d) obj;
                        dVar.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32)) / 2.0f;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) / 2.0f;
                        b(dVar, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), dVar.l0(f12), dVar.l0(f11));
                        return pe.z.f22715a;
                    }
                };
                rVar2.k0(O);
            }
            ya.a(l10, (df.l) O, rVar2, 0);
            f10 = f12;
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p(f10, f11, i) { // from class: b8.c4

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ float f1915v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f1916w;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(7);
                    a(r.this, this.f1915v, this.f1916w, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void b(d dVar, long j10, float f10, float f11) {
        dVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - (f10 / 2.0f);
        int i = (int) (j10 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) - (f11 / 2.0f);
        float l0 = dVar.l0((float) 0.5d);
        long floatToRawIntBits = (Float.floatToRawIntBits(l0) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L);
        float l02 = dVar.l0((float) 0.8d);
        long j11 = r.f19513b;
        float f12 = 0.5f * l02;
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f10 + l02) << 32) | (Float.floatToRawIntBits(f11 + l02) & 4294967295L);
        float l03 = dVar.l0((float) 1.2d);
        d.z0(dVar, r.c(j11, 0.22f), (Float.floatToRawIntBits(intBitsToFloat - f12) << 32) | (Float.floatToRawIntBits(intBitsToFloat2 - f12) & 4294967295L), floatToRawIntBits2, (Float.floatToRawIntBits(l03) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), null, 240);
        d.L(dVar, w.k(qe.h(new r(l0.d(4286218374L)), new r(l0.d(4293257710L)), new r(l0.d(4294967295L)), new r(l0.d(4290034368L)), new r(l0.d(4285297272L))), intBitsToFloat2, intBitsToFloat2 + f11, 8), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), floatToRawIntBits, null, 240);
        d.z0(dVar, l0.d(4281875522L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), floatToRawIntBits, new h(dVar.l0((float) 0.3d), 0.0f, 0, 0, null, 30), 224);
        float l04 = dVar.l0((float) 0.4d);
        long c10 = r.c(j11, 0.45f);
        float intBitsToFloat3 = Float.intBitsToFloat(i);
        d.D(dVar, c10, l04, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), null, 120);
        long c11 = r.c(j11, 0.45f);
        float intBitsToFloat4 = Float.intBitsToFloat(i);
        d.D(dVar, c11, l04, (Float.floatToRawIntBits(intBitsToFloat + f10) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), null, 120);
    }
}
