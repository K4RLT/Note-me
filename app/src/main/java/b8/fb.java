package b8;
import k1.h;
import k1.k;
import m.h;
import m1.d;
import m1.g;
import m1.h;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class fb implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2097u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f2098v;

    public /* synthetic */ fb(long j10, int i) {
        this.f2097u = i;
        this.f2098v = j10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f2097u) {
            case 0:
                d dVar = (d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                h a10 = k.a();
                float f10 = 0.08f * intBitsToFloat;
                a10.h(f10, 0.0f);
                a10.g(intBitsToFloat, intBitsToFloat2 / 2.0f);
                a10.g(f10, intBitsToFloat2);
                a10.d();
                d.o0(dVar, a10, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 1:
                return Long.valueOf(this.f2098v);
            case 2:
                d dVar2 = (d) obj;
                dVar2.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar2.e() >> 32)) * 0.09f;
                List h3 = qe.h(Float.valueOf(Float.intBitsToFloat((int) (dVar2.e() >> 32)) * 0.3f), Float.valueOf(Float.intBitsToFloat((int) (dVar2.e() >> 32)) * 0.7f));
                List h10 = qe.h(Float.valueOf(Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) * 0.22f), Float.valueOf(Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) * 0.5f), Float.valueOf(Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) * 0.78f));
                Iterator it = h3.iterator();
                while (it.hasNext()) {
                    float floatValue = ((Number) it.next()).floatValue();
                    Iterator it2 = h10.iterator();
                    while (it2.hasNext()) {
                        float floatValue2 = ((Number) it2.next()).floatValue();
                        d.D(dVar2, this.f2098v, intBitsToFloat3, (Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(floatValue2) & 4294967295L), null, 120);
                    }
                }
                return pe.z.f22715a;
            case 3:
                d dVar3 = (d) obj;
                dVar3.getClass();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar3.e() >> 32));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L));
                float f11 = intBitsToFloat4 * 0.14f;
                float f12 = intBitsToFloat4 * 0.5f;
                long floatToRawIntBits = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(intBitsToFloat5 * 0.12f) & 4294967295L);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(intBitsToFloat5 * 0.88f) & 4294967295L);
                long j10 = this.f2098v;
                d.n0(dVar3, j10, floatToRawIntBits, floatToRawIntBits2, f11, 1, null, 480);
                float f13 = intBitsToFloat5 * 0.5f;
                d.n0(dVar3, j10, (Float.floatToRawIntBits(0.12f * intBitsToFloat4) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat4 * 0.88f) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L), f11, 1, null, 480);
                return pe.z.f22715a;
            case 4:
                d dVar4 = (d) obj;
                dVar4.getClass();
                float intBitsToFloat6 = Float.intBitsToFloat((int) (dVar4.e() >> 32)) * 0.09f;
                float intBitsToFloat7 = Float.intBitsToFloat((int) (dVar4.e() >> 32)) / 2.0f;
                Iterator it3 = qe.h(Float.valueOf(Float.intBitsToFloat((int) (dVar4.e() & 4294967295L)) * 0.24f), Float.valueOf(Float.intBitsToFloat((int) (dVar4.e() & 4294967295L)) * 0.5f), Float.valueOf(Float.intBitsToFloat((int) (dVar4.e() & 4294967295L)) * 0.76f)).iterator();
                while (it3.hasNext()) {
                    float floatValue3 = ((Number) it3.next()).floatValue();
                    d.D(dVar4, this.f2098v, intBitsToFloat6, (Float.floatToRawIntBits(intBitsToFloat7) << 32) | (Float.floatToRawIntBits(floatValue3) & 4294967295L), null, 120);
                }
                return pe.z.f22715a;
            case 5:
                d dVar5 = (d) obj;
                dVar5.getClass();
                float intBitsToFloat8 = Float.intBitsToFloat((int) (dVar5.e() >> 32));
                float intBitsToFloat9 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L));
                float f14 = intBitsToFloat8 * 0.1f;
                float f15 = intBitsToFloat9 * 0.45f;
                g gVar = g.f20429a;
                long j11 = this.f2098v;
                d.z0(dVar5, j11, (Float.floatToRawIntBits(0.2f * intBitsToFloat8) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), (Float.floatToRawIntBits(0.6f * intBitsToFloat8) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (4294967295L & Float.floatToRawIntBits(f14)), gVar, 224);
                h a11 = k.a();
                float f16 = 0.32f * intBitsToFloat8;
                a11.h(f16, f15);
                float f17 = 0.3f * intBitsToFloat9;
                a11.g(f16, f17);
                float f18 = intBitsToFloat8 * 0.68f;
                a11.j(0.5f * intBitsToFloat8, intBitsToFloat9 * 0.08f, f18, f17);
                a11.g(f18, f15);
                d.o0(dVar5, a11, j11, new h(f14, 0.0f, 1, 0, null, 26), 52);
                return pe.z.f22715a;
            case 6:
                d dVar6 = (d) obj;
                dVar6.getClass();
                float intBitsToFloat10 = Float.intBitsToFloat((int) (dVar6.e() >> 32)) / 2.0f;
                float intBitsToFloat11 = Float.intBitsToFloat((int) (dVar6.e() & 4294967295L)) / 2.0f;
                float intBitsToFloat12 = Float.intBitsToFloat((int) (dVar6.e() >> 32)) / 2.0f;
                h a12 = k.a();
                float f19 = 0.26f * intBitsToFloat12;
                float f20 = intBitsToFloat11 - intBitsToFloat12;
                a12.h(intBitsToFloat10, f20);
                float f21 = intBitsToFloat10 + f19;
                float f22 = intBitsToFloat11 - f19;
                a12.j(f21, f22, intBitsToFloat10 + intBitsToFloat12, intBitsToFloat11);
                float f23 = intBitsToFloat11 + f19;
                a12.j(f21, f23, intBitsToFloat10, intBitsToFloat11 + intBitsToFloat12);
                float f24 = intBitsToFloat10 - f19;
                a12.j(f24, f23, intBitsToFloat10 - intBitsToFloat12, intBitsToFloat11);
                a12.j(f24, f22, intBitsToFloat10, f20);
                a12.d();
                d.o0(dVar6, a12, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 7:
                d dVar7 = (d) obj;
                dVar7.getClass();
                h a13 = k.a();
                a13.h(0.0f, 0.0f);
                a13.g(Float.intBitsToFloat((int) (dVar7.e() >> 32)), 0.0f);
                float intBitsToFloat13 = Float.intBitsToFloat((int) (dVar7.e() >> 32)) * 0.18f;
                a13.g((Float.intBitsToFloat((int) (dVar7.e() >> 32)) / 2.0f) + intBitsToFloat13, Float.intBitsToFloat((int) (dVar7.e() & 4294967295L)) - intBitsToFloat13);
                a13.j(Float.intBitsToFloat((int) (dVar7.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat13) + Float.intBitsToFloat((int) (dVar7.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar7.e() >> 32)) / 2.0f) - intBitsToFloat13, Float.intBitsToFloat((int) (4294967295L & dVar7.e())) - intBitsToFloat13);
                a13.d();
                d.o0(dVar7, a13, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 8:
                d dVar8 = (d) obj;
                dVar8.getClass();
                h a14 = k.a();
                a14.h(0.0f, 0.0f);
                a14.g(Float.intBitsToFloat((int) (dVar8.e() >> 32)), 0.0f);
                float intBitsToFloat14 = Float.intBitsToFloat((int) (dVar8.e() >> 32)) * 0.18f;
                a14.g((Float.intBitsToFloat((int) (dVar8.e() >> 32)) / 2.0f) + intBitsToFloat14, Float.intBitsToFloat((int) (dVar8.e() & 4294967295L)) - intBitsToFloat14);
                a14.j(Float.intBitsToFloat((int) (dVar8.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat14) + Float.intBitsToFloat((int) (dVar8.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar8.e() >> 32)) / 2.0f) - intBitsToFloat14, Float.intBitsToFloat((int) (4294967295L & dVar8.e())) - intBitsToFloat14);
                a14.d();
                d.o0(dVar8, a14, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 9:
                d dVar9 = (d) obj;
                dVar9.getClass();
                h a15 = k.a();
                a15.h(0.0f, 0.0f);
                a15.g(Float.intBitsToFloat((int) (dVar9.e() >> 32)), 0.0f);
                float intBitsToFloat15 = Float.intBitsToFloat((int) (dVar9.e() >> 32)) * 0.18f;
                a15.g((Float.intBitsToFloat((int) (dVar9.e() >> 32)) / 2.0f) + intBitsToFloat15, Float.intBitsToFloat((int) (dVar9.e() & 4294967295L)) - intBitsToFloat15);
                a15.j(Float.intBitsToFloat((int) (dVar9.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat15) + Float.intBitsToFloat((int) (dVar9.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar9.e() >> 32)) / 2.0f) - intBitsToFloat15, Float.intBitsToFloat((int) (4294967295L & dVar9.e())) - intBitsToFloat15);
                a15.d();
                d.o0(dVar9, a15, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 10:
                d dVar10 = (d) obj;
                dVar10.getClass();
                h a16 = k.a();
                a16.h(0.0f, 0.0f);
                a16.g(Float.intBitsToFloat((int) (dVar10.e() >> 32)), 0.0f);
                float intBitsToFloat16 = Float.intBitsToFloat((int) (dVar10.e() >> 32)) * 0.18f;
                a16.g((Float.intBitsToFloat((int) (dVar10.e() >> 32)) / 2.0f) + intBitsToFloat16, Float.intBitsToFloat((int) (dVar10.e() & 4294967295L)) - intBitsToFloat16);
                a16.j(Float.intBitsToFloat((int) (dVar10.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat16) + Float.intBitsToFloat((int) (dVar10.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar10.e() >> 32)) / 2.0f) - intBitsToFloat16, Float.intBitsToFloat((int) (4294967295L & dVar10.e())) - intBitsToFloat16);
                a16.d();
                d.o0(dVar10, a16, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 11:
                d dVar11 = (d) obj;
                dVar11.getClass();
                h a17 = k.a();
                float intBitsToFloat17 = Float.intBitsToFloat((int) (dVar11.e() >> 32)) * 0.18f;
                a17.h((Float.intBitsToFloat((int) (dVar11.e() >> 32)) / 2.0f) + intBitsToFloat17, intBitsToFloat17);
                a17.g(Float.intBitsToFloat((int) (dVar11.e() >> 32)), Float.intBitsToFloat((int) (dVar11.e() & 4294967295L)));
                a17.g(0.0f, Float.intBitsToFloat((int) (dVar11.e() & 4294967295L)));
                a17.g((Float.intBitsToFloat((int) (dVar11.e() >> 32)) / 2.0f) - intBitsToFloat17, intBitsToFloat17);
                a17.j(Float.intBitsToFloat((int) (dVar11.e() >> 32)) / 2.0f, (-intBitsToFloat17) * 0.55f, (Float.intBitsToFloat((int) (dVar11.e() >> 32)) / 2.0f) + intBitsToFloat17, intBitsToFloat17);
                a17.d();
                d.o0(dVar11, a17, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 12:
                d dVar12 = (d) obj;
                dVar12.getClass();
                h a18 = k.a();
                a18.h(0.0f, 0.0f);
                a18.g(Float.intBitsToFloat((int) (dVar12.e() >> 32)), 0.0f);
                float intBitsToFloat18 = Float.intBitsToFloat((int) (dVar12.e() >> 32)) * 0.18f;
                a18.g((Float.intBitsToFloat((int) (dVar12.e() >> 32)) / 2.0f) + intBitsToFloat18, Float.intBitsToFloat((int) (dVar12.e() & 4294967295L)) - intBitsToFloat18);
                a18.j(Float.intBitsToFloat((int) (dVar12.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat18) + Float.intBitsToFloat((int) (dVar12.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar12.e() >> 32)) / 2.0f) - intBitsToFloat18, Float.intBitsToFloat((int) (4294967295L & dVar12.e())) - intBitsToFloat18);
                a18.d();
                d.o0(dVar12, a18, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 13:
                d dVar13 = (d) obj;
                dVar13.getClass();
                h a19 = k.a();
                a19.h(0.0f, 0.0f);
                a19.g(Float.intBitsToFloat((int) (dVar13.e() >> 32)), 0.0f);
                float intBitsToFloat19 = Float.intBitsToFloat((int) (dVar13.e() >> 32)) * 0.18f;
                a19.g((Float.intBitsToFloat((int) (dVar13.e() >> 32)) / 2.0f) + intBitsToFloat19, Float.intBitsToFloat((int) (dVar13.e() & 4294967295L)) - intBitsToFloat19);
                a19.j(Float.intBitsToFloat((int) (dVar13.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat19) + Float.intBitsToFloat((int) (dVar13.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar13.e() >> 32)) / 2.0f) - intBitsToFloat19, Float.intBitsToFloat((int) (4294967295L & dVar13.e())) - intBitsToFloat19);
                a19.d();
                d.o0(dVar13, a19, this.f2098v, null, 60);
                return pe.z.f22715a;
            case 14:
                d dVar14 = (d) obj;
                dVar14.getClass();
                h a20 = k.a();
                a20.h(0.0f, 0.0f);
                a20.g(Float.intBitsToFloat((int) (dVar14.e() >> 32)), 0.0f);
                float intBitsToFloat20 = Float.intBitsToFloat((int) (dVar14.e() >> 32)) * 0.18f;
                a20.g((Float.intBitsToFloat((int) (dVar14.e() >> 32)) / 2.0f) + intBitsToFloat20, Float.intBitsToFloat((int) (dVar14.e() & 4294967295L)) - intBitsToFloat20);
                a20.j(Float.intBitsToFloat((int) (dVar14.e() >> 32)) / 2.0f, (0.55f * intBitsToFloat20) + Float.intBitsToFloat((int) (dVar14.e() & 4294967295L)), (Float.intBitsToFloat((int) (dVar14.e() >> 32)) / 2.0f) - intBitsToFloat20, Float.intBitsToFloat((int) (4294967295L & dVar14.e())) - intBitsToFloat20);
                a20.d();
                d.o0(dVar14, a20, this.f2098v, null, 60);
                return pe.z.f22715a;
            default:
                d dVar15 = (d) obj;
                dVar15.getClass();
                h a21 = k.a();
                float intBitsToFloat21 = Float.intBitsToFloat((int) (dVar15.e() >> 32)) * 0.18f;
                a21.h((Float.intBitsToFloat((int) (dVar15.e() >> 32)) / 2.0f) + intBitsToFloat21, intBitsToFloat21);
                a21.g(Float.intBitsToFloat((int) (dVar15.e() >> 32)), Float.intBitsToFloat((int) (dVar15.e() & 4294967295L)));
                a21.g(0.0f, Float.intBitsToFloat((int) (dVar15.e() & 4294967295L)));
                a21.g((Float.intBitsToFloat((int) (dVar15.e() >> 32)) / 2.0f) - intBitsToFloat21, intBitsToFloat21);
                a21.j(Float.intBitsToFloat((int) (dVar15.e() >> 32)) / 2.0f, (-intBitsToFloat21) * 0.55f, (Float.intBitsToFloat((int) (dVar15.e() >> 32)) / 2.0f) + intBitsToFloat21, intBitsToFloat21);
                a21.d();
                d.o0(dVar15, a21, this.f2098v, null, 60);
                return pe.z.f22715a;
        }
    }
}
