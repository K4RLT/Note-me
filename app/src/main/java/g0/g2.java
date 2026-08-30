package g0;
import j1.c;
import m2.m0;
import z1.x;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f17113a;

    /* renamed from: b, reason: collision with root package name */
    public x f17114b = null;

    /* renamed from: c, reason: collision with root package name */
    public x f17115c;

    public g2(m0 m0Var, x xVar) {
        this.f17113a = m0Var;
        this.f17115c = xVar;
    }

    public final long a(long j10) {
        c cVar;
        x xVar = this.f17114b;
        c cVar2 = c.e;
        if (xVar != null) {
            if (xVar.i()) {
                x xVar2 = this.f17115c;
                if (xVar2 != null) {
                    cVar = xVar2.u(xVar, true);
                } else {
                    cVar = null;
                }
            } else {
                cVar = cVar2;
            }
            if (cVar != null) {
                cVar2 = cVar;
            }
        }
        int i = (int) (j10 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f10 = cVar2.f18763a;
        if (intBitsToFloat >= f10) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f10 = cVar2.f18765c;
            if (intBitsToFloat2 <= f10) {
                f10 = Float.intBitsToFloat(i);
            }
        }
        int i10 = (int) (j10 & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i10);
        float f11 = cVar2.f18764b;
        if (intBitsToFloat3 >= f11) {
            float intBitsToFloat4 = Float.intBitsToFloat(i10);
            f11 = cVar2.f18766d;
            if (intBitsToFloat4 <= f11) {
                f11 = Float.intBitsToFloat(i10);
            }
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
    }

    public final int b(long j10, boolean z3) {
        if (z3) {
            j10 = a(j10);
        }
        return this.f17113a.f20525b.g(d(j10));
    }

    public final boolean c(long j10) {
        long d2 = d(a(j10));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d2));
        m0 m0Var = this.f17113a;
        int e = m0Var.f20525b.e(intBitsToFloat);
        int i = (int) (d2 >> 32);
        if (Float.intBitsToFloat(i) >= m0Var.f(e) && Float.intBitsToFloat(i) <= m0Var.g(e)) {
            return true;
        }
        return false;
    }

    public final long d(long j10) {
        x xVar;
        x xVar2 = this.f17114b;
        if (xVar2 != null) {
            x xVar3 = null;
            if (!xVar2.i()) {
                xVar2 = null;
            }
            if (xVar2 != null && (xVar = this.f17115c) != null) {
                if (xVar.i()) {
                    xVar3 = xVar;
                }
                if (xVar3 != null) {
                    return xVar2.d(xVar3, j10);
                }
                return j10;
            }
            return j10;
        }
        return j10;
    }

    public final long e(long j10) {
        x xVar;
        x xVar2 = this.f17114b;
        if (xVar2 != null) {
            x xVar3 = null;
            if (!xVar2.i()) {
                xVar2 = null;
            }
            if (xVar2 != null && (xVar = this.f17115c) != null) {
                if (xVar.i()) {
                    xVar3 = xVar;
                }
                if (xVar3 != null) {
                    return xVar3.d(xVar2, j10);
                }
                return j10;
            }
            return j10;
        }
        return j10;
    }
}
