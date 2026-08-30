package ya;
import y2.i;
import y2.o;
import y2.p;

/* loaded from: classes.dex */
public abstract class ae {
    public static final void a(long j10) {
        boolean z3;
        p[] pVarArr = o.f30818b;
        if ((j10 & 1095216660480L) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void b(long j10, long j11) {
        p[] pVarArr = o.f30818b;
        if ((j10 & 1095216660480L) == 0 || (1095216660480L & j11) == 0) {
            i.a("Cannot perform operation for Unspecified type.");
        }
        if (!p.a(o.b(j10), o.b(j11))) {
            i.a("Cannot perform operation for " + ((Object) p.b(o.b(j10))) + " and " + ((Object) p.b(o.b(j11))));
        }
    }

    public static final long c(double d2) {
        return f(8589934592L, (float) d2);
    }

    public static final long d(double d2) {
        return f(4294967296L, (float) d2);
    }

    public static final long e(int i) {
        return f(4294967296L, i);
    }

    public static final long f(long j10, float f10) {
        long floatToRawIntBits = j10 | (Float.floatToRawIntBits(f10) & 4294967295L);
        p[] pVarArr = o.f30818b;
        return floatToRawIntBits;
    }
}
