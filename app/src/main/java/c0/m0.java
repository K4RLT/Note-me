package c0;
import b0.b;
import u.m;

import t.z0;
import wa.b9;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3374a = 56;

    /* renamed from: b, reason: collision with root package name */
    public static final x f3375b = new x(0, 0, 0, 0, 0, m.f25799a, new Object(), pf.b(te.h.f25707u));

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f3376c = new Object();

    public static final long a(x xVar, int i) {
        long e;
        long j10 = (((i * (xVar.f3420b + r0)) + (-xVar.f3423f)) + xVar.f3422d) - xVar.f3421c;
        if (xVar.e == z0.f25598v) {
            e = xVar.e() >> 32;
        } else {
            e = xVar.e() & 4294967295L;
        }
        int i10 = (int) e;
        xVar.f3429m.getClass();
        long e8 = j10 - (i10 - b9.e(0, 0, i10));
        if (e8 < 0) {
            return 0L;
        }
        return e8;
    }
}
