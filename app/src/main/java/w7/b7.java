package w7;
import k.a;
import k1.h;
import k1.k;
import m1.d;
import m7.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b7 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27988u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f27989v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f27990w;

    public /* synthetic */ b7(long j10, boolean z3) {
        this.f27989v = j10;
        this.f27990w = z3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        d dVar = (d) obj;
        switch (this.f27988u) {
            case 0:
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                float f10 = intBitsToFloat * 0.07f;
                long j10 = this.f27989v;
                l(dVar, j10, f10, intBitsToFloat, intBitsToFloat2, intBitsToFloat2 * 0.72f, false);
                l(dVar, j10, f10, intBitsToFloat, intBitsToFloat2, intBitsToFloat2 * 0.5f, false);
                l(dVar, j10, f10, intBitsToFloat, intBitsToFloat2, intBitsToFloat2 * 0.28f, this.f27990w);
                return pe.z.f22715a;
            default:
                dVar.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                float f11 = intBitsToFloat3 / 2.0f;
                float f12 = intBitsToFloat4 / 2.0f;
                float f13 = intBitsToFloat3 * 0.09f;
                h a10 = k.a();
                float f14 = 0.1f * intBitsToFloat3;
                a10.h(f14, f12);
                a10.j(f11, intBitsToFloat4 * 0.16f, 0.9f * intBitsToFloat3, f12);
                a10.j(f11, 0.84f * intBitsToFloat4, f14, f12);
                a10.d();
                h hVar = new h(f13, 0.0f, 1, 0, null, 26);
                long j11 = this.f27989v;
                d.o0(dVar, a10, j11, hVar, 52);
                d.D(dVar, j11, intBitsToFloat3 * 0.16f, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), null, 120);
                if (!this.f27990w) {
                    d.n0(dVar, j11, (Float.floatToRawIntBits(0.2f * intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(0.15f * intBitsToFloat3) << 32), (Float.floatToRawIntBits(intBitsToFloat3 * 0.85f) << 32) | (Float.floatToRawIntBits(intBitsToFloat4 * 0.8f) & 4294967295L), f13, 1, null, 480);
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ b7(boolean z3, long j10) {
        this.f27990w = z3;
        this.f27989v = j10;
    }
}
