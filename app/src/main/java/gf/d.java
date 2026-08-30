package gf;

import q.x;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: u, reason: collision with root package name */
    public static final c f17754u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final a f17755v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [gf.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [gf.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        Object r02;
        Integer num = ze.a.f32043a;
        if (num != null && num.intValue() < 34) {
            r02 = new b();
        } else {
            r02 = new Object();
        }
        f17755v = r02;
    }

    public abstract int a(int i);

    public abstract float b();

    public abstract int c();

    public abstract int d(int i);

    public int e(int i, int i10) {
        int c10;
        int i11;
        int i12;
        if (i10 > i) {
            int i13 = i10 - i;
            if (i13 > 0 || i13 == Integer.MIN_VALUE) {
                if (((-i13) & i13) == i13) {
                    i12 = a(31 - Integer.numberOfLeadingZeros(i13));
                    return i + i12;
                }
                do {
                    c10 = c() >>> 1;
                    i11 = c10 % i13;
                } while ((i13 - 1) + (c10 - i11) < 0);
                i12 = i11;
                return i + i12;
            }
            while (true) {
                int c11 = c();
                if (i <= c11 && c11 < i10) {
                    return c11;
                }
            }
        } else {
            x.j("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i10) + ").");
            return 0;
        }
    }

    public abstract long f();

    public long g() {
        return h();
    }

    public long h() {
        long f10;
        long j10;
        do {
            f10 = f() >>> 1;
            j10 = f10 % 2500;
        } while ((f10 - j10) + 2499 < 0);
        return j10;
    }
}