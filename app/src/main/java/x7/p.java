package x7;

import wa.b9;
import wa.s8;

/* loaded from: classes.dex */
public final class p implements k1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f30256a = new Object();

    @Override // k1.p0
    public final k1.l0 a(long j10, y2.m mVar, y2.c cVar) {
        mVar.getClass();
        cVar.getClass();
        int i = (int) (j10 >> 32);
        float min = Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j10 & 4294967295L))) / 2.0f;
        float d2 = b9.d(Float.intBitsToFloat(i) * 0.06930693f, 0.0f, min);
        float d10 = b9.d(Float.intBitsToFloat(i) * 0.005f, 0.0f, min);
        j1.c a10 = s8.a(0L, j10);
        return new k1.g0(new j1.d(a10.f18763a, a10.f18764b, a10.f18765c, a10.f18766d, (Float.floatToRawIntBits(d10) << 32) | (Float.floatToRawIntBits(d10) & 4294967295L), (Float.floatToRawIntBits(d2) << 32) | (Float.floatToRawIntBits(d2) & 4294967295L), (Float.floatToRawIntBits(d2) << 32) | (4294967295L & Float.floatToRawIntBits(d2)), (Float.floatToRawIntBits(d10) << 32) | (Float.floatToRawIntBits(d10) & 4294967295L)));
    }
}
