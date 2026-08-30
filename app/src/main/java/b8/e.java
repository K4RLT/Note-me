package b8;
import k1.g0;
import k1.l0;
import k1.p0;
import y2.c;
import y2.m;

/* loaded from: classes.dex */
public final class e implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f2000a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2001b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2002c;

    public e(float f10, float f11, float f12) {
        this.f2000a = f10;
        this.f2001b = f11;
        this.f2002c = f12;
    }

    @Override // p0
    public final l0 a(long j10, m mVar, c cVar) {
        mVar.getClass();
        cVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * this.f2000a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * this.f2001b;
        float d2 = wa.b9.d(this.f2002c, 0.0f, 1.0f) * ((float) Math.hypot(Math.max(intBitsToFloat, Float.intBitsToFloat(r15) - intBitsToFloat), Math.max(intBitsToFloat2, Float.intBitsToFloat(r12) - intBitsToFloat2)));
        return new g0(wa.t8.a((Float.floatToRawIntBits(d2) << 32) | (Float.floatToRawIntBits(d2) & 4294967295L), intBitsToFloat - d2, intBitsToFloat2 - d2, intBitsToFloat + d2, intBitsToFloat2 + d2));
    }
}
