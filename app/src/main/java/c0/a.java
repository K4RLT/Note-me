package c0;
import q.a;

import java.util.concurrent.CancellationException;
import wa.b9;

/* loaded from: classes.dex */
public final class a implements u1.a {

    /* renamed from: u, reason: collision with root package name */
    public final d f3279u;

    public a(d dVar) {
        this.f3279u = dVar;
    }

    @Override // u1.a
    public final Object G0(long j10, long j11, te.c cVar) {
        return new y2.q(y2.q.a(j11, 0.0f, 0.0f, 1));
    }

    @Override // u1.a
    public final long U(int i, long j10) {
        if (i == 1) {
            d dVar = this.f3279u;
            if (Math.abs(dVar.k()) > 1.0E-6d) {
                float k3 = dVar.k() * dVar.n();
                float f10 = ((dVar.l().f3420b + dVar.l().f3421c) * (-Math.signum(dVar.k()))) + k3;
                if (dVar.k() > 0.0f) {
                    f10 = k3;
                    k3 = f10;
                }
                float f11 = -dVar.f3340k.d(-b9.d(Float.intBitsToFloat((int) (j10 >> 32)), k3, f10));
                float intBitsToFloat = Float.intBitsToFloat((int) (j10 & 4294967295L));
                return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // u1.a
    public final long z(long j10, int i, long j11) {
        if (i == 2 && Float.intBitsToFloat((int) (j11 >> 32)) != 0.0f) {
            throw new CancellationException("Scroll cancelled");
        }
        return 0L;
    }
}
