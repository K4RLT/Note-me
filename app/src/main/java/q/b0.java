package q;
import n0.a;
import q.a0;
import q.q0;

/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22849a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f22850b;

    /* JADX WARN: Type inference failed for: r6v1, types: [q0, java.lang.Object] */
    public b0(float f10, float f11, float f12) {
        this.f22849a = f12;
        Object obj = new Object();
        obj.f22971a = 1.0f;
        obj.f22972b = Math.sqrt(50.0d);
        obj.f22973c = 1.0f;
        if (f10 < 0.0f) {
            a("Damping ratio must be non-negative");
        }
        obj.f22973c = f10;
        double d2 = obj.f22972b;
        if (((float) (d2 * d2)) <= 0.0f) {
            a("Spring stiffness constant must be positive.");
        }
        obj.f22972b = Math.sqrt(f11);
        this.f22850b = obj;
    }

    @Override // a0
    public final float b(long j10, float f10, float f11, float f12) {
        q0 q0Var = this.f22850b;
        q0Var.f22971a = f11;
        return Float.intBitsToFloat((int) (q0Var.a(f10, f12, j10 / 1000000) & 4294967295L));
    }

    @Override // a0
    public final long c(float f10, float f11, float f12) {
        double sqrt;
        double d2;
        double d10;
        int i;
        long j10;
        double d11;
        q0 q0Var = this.f22850b;
        double d12 = q0Var.f22972b;
        float f13 = (float) (d12 * d12);
        float f14 = q0Var.f22973c;
        float f15 = this.f22849a;
        float f16 = (f10 - f11) / f15;
        float f17 = f12 / f15;
        if (f14 == 0.0f) {
            j10 = 9223372036854L;
        } else {
            double d13 = f13;
            double d14 = f14;
            double d15 = f17;
            double d16 = f16;
            double d17 = 1.0f;
            double sqrt2 = d14 * 2.0d * Math.sqrt(d13);
            double d18 = (sqrt2 * sqrt2) - (d13 * 4.0d);
            if (d18 < 0.0d) {
                sqrt = 0.0d;
            } else {
                sqrt = Math.sqrt(d18);
            }
            if (d18 < 0.0d) {
                d2 = Math.sqrt(Math.abs(d18));
            } else {
                d2 = 0.0d;
            }
            double d19 = -sqrt2;
            double d20 = (d19 + sqrt) * 0.5d;
            double d21 = d2 * 0.5d;
            double d22 = (d19 - sqrt) * 0.5d;
            if (d16 == 0.0d && d15 == 0.0d) {
                j10 = 0;
            } else {
                if (d16 < 0.0d) {
                    d15 = -d15;
                }
                double abs = Math.abs(d16);
                double d23 = Double.MAX_VALUE;
                if (d14 > 1.0d) {
                    double d24 = (d20 * abs) - d15;
                    double d25 = d20 - d22;
                    double d26 = d24 / d25;
                    double d27 = abs - d26;
                    d10 = Math.log(Math.abs(d17 / d27)) / d20;
                    double log = Math.log(Math.abs(d17 / d26)) / d22;
                    if ((Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L) {
                        if ((Double.doubleToRawLongBits(log) & Long.MAX_VALUE) < 9218868437227405312L) {
                            d10 = Math.max(d10, log);
                        }
                    } else {
                        d10 = log;
                    }
                    double d28 = d27 * d20;
                    double log2 = Math.log(d28 / ((-d26) * d22)) / (d22 - d20);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d22) * d26) + (Math.exp(d20 * log2) * d27))) < d17) {
                                if (d26 > 0.0d && d27 < 0.0d) {
                                    d11 = 0.0d;
                                } else {
                                    d11 = d10;
                                }
                                d17 = -d17;
                                d10 = d11;
                            }
                        }
                        d10 = Math.log((-((d26 * d22) * d22)) / (d28 * d20)) / d25;
                    } else {
                        d17 = -d17;
                    }
                    double d29 = d26 * d22;
                    if (Math.abs((Math.exp(d22 * d10) * d29) + (Math.exp(d20 * d10) * d28)) >= 1.0E-4d) {
                        int i10 = 0;
                        while (d23 > 0.001d && i10 < 100) {
                            i10++;
                            double d30 = d20 * d10;
                            double d31 = d22 * d10;
                            double exp = d10 - ((((Math.exp(d31) * d26) + (Math.exp(d30) * d27)) + d17) / ((Math.exp(d31) * d29) + (Math.exp(d30) * d28)));
                            d23 = Math.abs(d10 - exp);
                            d10 = exp;
                        }
                    }
                } else if (d14 < 1.0d) {
                    double d32 = (d15 - (d20 * abs)) / d21;
                    d10 = Math.log(d17 / Math.sqrt((d32 * d32) + (abs * abs))) / d20;
                } else {
                    double d33 = d20 * abs;
                    double d34 = d15 - d33;
                    double log3 = Math.log(Math.abs(d17 / abs)) / d20;
                    double log4 = Math.log(Math.abs(d17 / d34));
                    double d35 = log4;
                    for (int i11 = 0; i11 < 6; i11++) {
                        d35 = log4 - Math.log(Math.abs(d35 / d20));
                    }
                    double d36 = d35 / d20;
                    if ((Double.doubleToRawLongBits(log3) & Long.MAX_VALUE) < 9218868437227405312L) {
                        if ((Double.doubleToRawLongBits(d36) & Long.MAX_VALUE) < 9218868437227405312L) {
                            log3 = Math.max(log3, d36);
                        }
                    } else {
                        log3 = d36;
                    }
                    double d37 = (-(d33 + d34)) / (d20 * d34);
                    double d38 = d20 * d37;
                    double exp2 = (Math.exp(d38) * d34 * d37) + (Math.exp(d38) * abs);
                    if (!Double.isNaN(d37) && d37 > 0.0d) {
                        if (d37 > 0.0d && (-exp2) < d17) {
                            if (d34 < 0.0d && abs > 0.0d) {
                                log3 = 0.0d;
                            }
                        } else {
                            log3 = (-(2.0d / d20)) - (abs / d34);
                            d10 = log3;
                            i = 0;
                            while (d23 > 0.001d && i < 100) {
                                i++;
                                double d39 = d20 * d10;
                                double exp3 = d10 - (((Math.exp(d39) * ((d34 * d10) + abs)) + d17) / (Math.exp(d39) * (((1 + d39) * d34) + d33)));
                                d23 = Math.abs(d10 - exp3);
                                d10 = exp3;
                            }
                        }
                    }
                    d17 = -d17;
                    d10 = log3;
                    i = 0;
                    while (d23 > 0.001d) {
                        i++;
                        double d392 = d20 * d10;
                        double exp32 = d10 - (((Math.exp(d392) * ((d34 * d10) + abs)) + d17) / (Math.exp(d392) * (((1 + d392) * d34) + d33)));
                        d23 = Math.abs(d10 - exp32);
                        d10 = exp32;
                    }
                }
                j10 = (long) (d10 * 1000.0d);
            }
        }
        return j10 * 1000000;
    }

    @Override // a0
    public final float d(float f10, float f11, float f12) {
        return 0.0f;
    }

    @Override // a0
    public final float e(long j10, float f10, float f11, float f12) {
        q0 q0Var = this.f22850b;
        q0Var.f22971a = f11;
        return Float.intBitsToFloat((int) (q0Var.a(f10, f12, j10 / 1000000) >> 32));
    }
}