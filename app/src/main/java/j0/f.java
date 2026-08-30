package j0;

import ya.ae;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f18714a = ae.e(14);

    public static final long a(long j10, long j11) {
        if (y2.o.d(j11)) {
            if (!y2.o.d(j10)) {
                long j12 = j10 & 1095216660480L;
                if (j12 == 0) {
                    float c10 = y2.o.c(j11);
                    long j13 = f18714a;
                    ae.a(j13);
                    return ae.f(1095216660480L & j13, y2.o.c(j13) * c10);
                }
                float c11 = y2.o.c(j11);
                ae.a(j10);
                return ae.f(j12, y2.o.c(j10) * c11);
            }
            throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) y2.o.e(j11)) + "). Please declare the style.fontSize with Sp units instead.");
        }
        throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) y2.o.e(j11)) + '.');
    }
}
